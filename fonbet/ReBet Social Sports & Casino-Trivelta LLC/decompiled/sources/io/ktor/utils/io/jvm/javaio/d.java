package io.ktor.utils.io.jvm.javaio;

import Ph.A;
import Ph.C0;
import Ph.F0;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final io.ktor.utils.io.f f49506a;

    /* renamed from: b, reason: collision with root package name */
    public final A f49507b;

    /* renamed from: c, reason: collision with root package name */
    public final a f49508c;

    @Nullable
    private byte[] single;

    public static final class a extends io.ktor.utils.io.jvm.javaio.a {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d f49509g;

        /* renamed from: io.ktor.utils.io.jvm.javaio.d$a$a, reason: collision with other inner class name */
        public static final class C0734a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f49510n;

            /* renamed from: o, reason: collision with root package name */
            public Object f49511o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f49512p;

            /* renamed from: r, reason: collision with root package name */
            public int f49514r;

            public C0734a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f49512p = obj;
                this.f49514r |= Integer.MIN_VALUE;
                return a.this.h(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0 c02, d dVar) {
            super(c02);
            this.f49509g = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            if (r10 != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        
            if (r10 == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:11:0x0084). Please report as a decompilation issue!!! */
        @Override // io.ktor.utils.io.jvm.javaio.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object h(Continuation continuation) {
            C0734a c0734a;
            int i10;
            int i11;
            a aVar;
            if (continuation instanceof C0734a) {
                c0734a = (C0734a) continuation;
                int i12 = c0734a.f49514r;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c0734a.f49514r = i12 - Integer.MIN_VALUE;
                    Object obj = c0734a.f49512p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0734a.f49514r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        i11 = 0;
                        aVar = this;
                        aVar.result = i11;
                        c0734a.f49510n = aVar;
                        c0734a.f49511o = aVar;
                        c0734a.f49514r = 1;
                        obj = aVar.j(c0734a);
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        }
                    } else if (i10 == 1) {
                        aVar = (a) c0734a.f49510n;
                        ResultKt.throwOnFailure(obj);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                        io.ktor.utils.io.f fVar = aVar.f49509g.f49506a;
                        int f10 = aVar.f();
                        int e10 = aVar.e();
                        c0734a.f49510n = aVar;
                        c0734a.f49511o = null;
                        c0734a.f49514r = 2;
                        obj = fVar.f((byte[]) obj, f10, e10, c0734a);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) c0734a.f49510n;
                        ResultKt.throwOnFailure(obj);
                        i11 = ((Number) obj).intValue();
                        if (i11 == -1) {
                            aVar.f49509g.f49507b.y1();
                            aVar.d(i11);
                            return Unit.INSTANCE;
                        }
                        aVar.result = i11;
                        c0734a.f49510n = aVar;
                        c0734a.f49511o = aVar;
                        c0734a.f49514r = 1;
                        obj = aVar.j(c0734a);
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(c0734a);
                        }
                    }
                }
            }
            c0734a = new C0734a(continuation);
            Object obj2 = c0734a.f49512p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = c0734a.f49514r;
            if (i10 != 0) {
            }
        }
    }

    public d(C0 c02, io.ktor.utils.io.f channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f49506a = channel;
        this.f49507b = F0.a(c02);
        this.f49508c = new a(c02, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f49506a.d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            super.close();
            io.ktor.utils.io.h.a(this.f49506a);
            if (!this.f49507b.isCompleted()) {
                C0.a.b(this.f49507b, null, 1, null);
            }
            this.f49508c.k();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = this.single;
            if (bArr == null) {
                bArr = new byte[1];
                this.single = bArr;
            }
            int m10 = this.f49508c.m(bArr, 0, 1);
            if (m10 == -1) {
                return -1;
            }
            if (m10 == 1) {
                return bArr[0] & UByte.MAX_VALUE;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + m10 + " bytes.").toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        a aVar;
        aVar = this.f49508c;
        Intrinsics.checkNotNull(bArr);
        return aVar.m(bArr, i10, i11);
    }
}
