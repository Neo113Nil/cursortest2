package retrofit2;

import We.C;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import We.M;
import java.io.IOException;
import java.util.Objects;
import sf.C9681g;
import sf.InterfaceC9683i;
import sf.N;
import sf.q;
import sf.z;

/* loaded from: classes6.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final InterfaceC4865g.a callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private InterfaceC4865g rawCall;
    private final RequestFactory requestFactory;
    private final Converter<M, T> responseConverter;

    static final class ExceptionCatchingResponseBody extends M {
        private final M delegate;
        private final InterfaceC9683i delegateSource;
        IOException thrownException;

        ExceptionCatchingResponseBody(M m11) {
            this.delegate = m11;
            this.delegateSource = z.d(new q(m11.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // sf.q, sf.M
                public long read(C9681g c9681g, long j11) throws IOException {
                    try {
                        return super.read(c9681g, j11);
                    } catch (IOException e11) {
                        ExceptionCatchingResponseBody.this.thrownException = e11;
                        throw e11;
                    }
                }
            });
        }

        @Override // We.M, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // We.M
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // We.M
        public C contentType() {
            return this.delegate.contentType();
        }

        @Override // We.M
        public InterfaceC9683i source() {
            return this.delegateSource;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class NoContentResponseBody extends M {
        private final long contentLength;
        private final C contentType;

        NoContentResponseBody(C c11, long j11) {
            this.contentType = c11;
            this.contentLength = j11;
        }

        @Override // We.M
        public long contentLength() {
            return this.contentLength;
        }

        @Override // We.M
        public C contentType() {
            return this.contentType;
        }

        @Override // We.M
        public InterfaceC9683i source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    OkHttpCall(RequestFactory requestFactory, Object[] objArr, InterfaceC4865g.a aVar, Converter<M, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private InterfaceC4865g createRawCall() throws IOException {
        InterfaceC4865g a11 = this.callFactory.a(this.requestFactory.create(this.args));
        if (a11 != null) {
            return a11;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private InterfaceC4865g getRawCall() throws IOException {
        InterfaceC4865g interfaceC4865g = this.rawCall;
        if (interfaceC4865g != null) {
            return interfaceC4865g;
        }
        Throwable th2 = this.creationFailure;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            InterfaceC4865g createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e11) {
            Utils.throwIfFatal(e11);
            this.creationFailure = e11;
            throw e11;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        InterfaceC4865g interfaceC4865g;
        this.canceled = true;
        synchronized (this) {
            interfaceC4865g = this.rawCall;
        }
        if (interfaceC4865g != null) {
            interfaceC4865g.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        InterfaceC4865g interfaceC4865g;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                interfaceC4865g = this.rawCall;
                th2 = this.creationFailure;
                if (interfaceC4865g == null && th2 == null) {
                    try {
                        InterfaceC4865g createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        interfaceC4865g = createRawCall;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.throwIfFatal(th2);
                        this.creationFailure = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            interfaceC4865g.cancel();
        }
        interfaceC4865g.E0(new InterfaceC4866h() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th5) {
                try {
                    callback.onFailure(OkHttpCall.this, th5);
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    th6.printStackTrace();
                }
            }

            @Override // We.InterfaceC4866h
            public void onFailure(InterfaceC4865g interfaceC4865g2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // We.InterfaceC4866h
            public void onResponse(InterfaceC4865g interfaceC4865g2, L l11) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(l11));
                    } catch (Throwable th5) {
                        Utils.throwIfFatal(th5);
                        th5.printStackTrace();
                    }
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    callFailure(th6);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        InterfaceC4865g rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(rawCall.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z11 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC4865g interfaceC4865g = this.rawCall;
                if (interfaceC4865g == null || !interfaceC4865g.isCanceled()) {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    Response<T> parseResponse(L l11) throws IOException {
        M c11 = l11.c();
        L.a aVar = new L.a(l11);
        aVar.b(new NoContentResponseBody(c11.contentType(), c11.contentLength()));
        L c12 = aVar.c();
        int m11 = c12.m();
        if (m11 < 200 || m11 >= 300) {
            try {
                return Response.error(Utils.buffer(c11), c12);
            } finally {
                c11.close();
            }
        }
        if (m11 == 204 || m11 == 205) {
            c11.close();
            return Response.success((Object) null, c12);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(c11);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), c12);
        } catch (RuntimeException e11) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e11;
        }
    }

    @Override // retrofit2.Call
    public synchronized G request() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create request.", e11);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized N timeout() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create call.", e11);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
