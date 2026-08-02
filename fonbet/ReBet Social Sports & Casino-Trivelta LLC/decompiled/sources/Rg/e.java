package Rg;

import Ph.C1483w0;
import Ph.F0;
import Qg.m;
import Tg.u;
import Tg.v;
import ah.C2023o;
import bh.AbstractC2423b;
import io.ktor.utils.io.i;
import io.ktor.utils.io.n;
import io.ktor.utils.io.r;
import java.io.Closeable;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.HttpMethod;
import ti.InterfaceC6480j;

/* loaded from: classes3.dex */
public abstract class e {

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC2423b f10270d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2423b abstractC2423b) {
            super(0);
            this.f10270d = abstractC2423b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.ktor.utils.io.f invoke() {
            return ((AbstractC2423b.c) this.f10270d).d();
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Request.Builder f10271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Request.Builder builder) {
            super(2);
            this.f10271d = builder;
        }

        public final void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(key, C2023o.f16113a.g())) {
                return;
            }
            this.f10271d.addHeader(key, value);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f10272n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10273o;

        /* renamed from: p, reason: collision with root package name */
        public Object f10274p;

        /* renamed from: q, reason: collision with root package name */
        public Object f10275q;

        /* renamed from: r, reason: collision with root package name */
        public Object f10276r;

        /* renamed from: s, reason: collision with root package name */
        public int f10277s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f10278t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6480j f10279u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f10280v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Wg.d f10281w;

        public static final class a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f10282d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6480j f10283e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Wg.d f10284f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.IntRef intRef, InterfaceC6480j interfaceC6480j, Wg.d dVar) {
                super(1);
                this.f10282d = intRef;
                this.f10283e = interfaceC6480j;
                this.f10284f = dVar;
            }

            public final void a(ByteBuffer buffer) {
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                try {
                    this.f10282d.element = this.f10283e.read(buffer);
                } catch (Throwable th2) {
                    throw e.g(th2, this.f10284f);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ByteBuffer) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC6480j interfaceC6480j, CoroutineContext coroutineContext, Wg.d dVar, Continuation continuation) {
            super(2, continuation);
            this.f10279u = interfaceC6480j;
            this.f10280v = coroutineContext;
            this.f10281w = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f10279u, this.f10280v, this.f10281w, continuation);
            cVar.f10278t = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r rVar, Continuation continuation) {
            return ((c) create(rVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:9:0x0083, B:10:0x0051, B:12:0x0057, B:14:0x005d, B:16:0x0061, B:20:0x008e), top: B:8:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:8:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Closeable closeable;
            Unit unit;
            r rVar;
            CoroutineContext coroutineContext;
            Wg.d dVar;
            Ref.IntRef intRef;
            InterfaceC6480j interfaceC6480j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10277s;
            Throwable th2 = null;
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                r rVar2 = (r) this.f10278t;
                InterfaceC6480j interfaceC6480j2 = this.f10279u;
                rVar = rVar2;
                coroutineContext = this.f10280v;
                dVar = this.f10281w;
                intRef = new Ref.IntRef();
                interfaceC6480j = interfaceC6480j2;
                closeable = interfaceC6480j;
                if (interfaceC6480j.isOpen()) {
                }
                unit = Unit.INSTANCE;
                if (closeable != null) {
                }
                if (th2 == null) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.IntRef intRef2 = (Ref.IntRef) this.f10276r;
                InterfaceC6480j interfaceC6480j3 = (InterfaceC6480j) this.f10275q;
                Wg.d dVar2 = (Wg.d) this.f10274p;
                CoroutineContext coroutineContext2 = (CoroutineContext) this.f10273o;
                Closeable closeable2 = (Closeable) this.f10272n;
                r rVar3 = (r) this.f10278t;
                ResultKt.throwOnFailure(obj);
                interfaceC6480j = interfaceC6480j3;
                dVar = dVar2;
                coroutineContext = coroutineContext2;
                closeable = closeable2;
                rVar = rVar3;
                intRef = intRef2;
                try {
                    rVar.d().flush();
                } catch (Throwable th4) {
                    th = th4;
                    Closeable closeable3 = closeable;
                    closeable = closeable3;
                    unit = null;
                    th2 = th;
                    if (closeable != null) {
                    }
                    if (th2 == null) {
                    }
                }
                if (interfaceC6480j.isOpen() || !F0.q(coroutineContext) || intRef.element < 0) {
                    unit = Unit.INSTANCE;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th5) {
                            if (th2 == null) {
                                th2 = th5;
                            } else {
                                ExceptionsKt.addSuppressed(th2, th5);
                            }
                        }
                    }
                    if (th2 == null) {
                        throw th2;
                    }
                    Intrinsics.checkNotNull(unit);
                    return Unit.INSTANCE;
                }
                io.ktor.utils.io.i d10 = rVar.d();
                a aVar = new a(intRef, interfaceC6480j, dVar);
                this.f10278t = rVar;
                this.f10272n = closeable;
                this.f10273o = coroutineContext;
                this.f10274p = dVar;
                this.f10275q = interfaceC6480j;
                this.f10276r = intRef;
                this.f10277s = 1;
                if (i.a.a(d10, 0, aVar, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rVar.d().flush();
                if (interfaceC6480j.isOpen()) {
                }
                unit = Unit.INSTANCE;
                if (closeable != null) {
                }
                if (th2 == null) {
                }
            }
        }
    }

    public static final RequestBody e(AbstractC2423b abstractC2423b, CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(abstractC2423b, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        if (abstractC2423b instanceof AbstractC2423b.a) {
            byte[] d10 = ((AbstractC2423b.a) abstractC2423b).d();
            return RequestBody.INSTANCE.create(d10, (MediaType) null, 0, d10.length);
        }
        if (abstractC2423b instanceof AbstractC2423b.c) {
            return new j(abstractC2423b.a(), new a(abstractC2423b));
        }
        if (abstractC2423b instanceof AbstractC2423b.AbstractC0440b) {
            return RequestBody.INSTANCE.create(new byte[0], (MediaType) null, 0, 0);
        }
        throw new Og.h(abstractC2423b);
    }

    public static final Request f(Wg.d dVar, CoroutineContext coroutineContext) {
        Request.Builder builder = new Request.Builder();
        builder.url(dVar.h().toString());
        m.c(dVar.e(), dVar.b(), new b(builder));
        builder.method(dVar.f().d(), HttpMethod.permitsRequestBody(dVar.f().d()) ? e(dVar.b(), coroutineContext) : null);
        return builder.build();
    }

    public static final Throwable g(Throwable th2, Wg.d dVar) {
        return th2 instanceof SocketTimeoutException ? v.b(dVar, th2) : th2;
    }

    public static final OkHttpClient.Builder h(OkHttpClient.Builder builder, u.a aVar) {
        Long c10 = aVar.c();
        if (c10 != null) {
            builder.connectTimeout(v.d(c10.longValue()), TimeUnit.MILLISECONDS);
        }
        Long e10 = aVar.e();
        if (e10 != null) {
            long longValue = e10.longValue();
            long d10 = v.d(longValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.readTimeout(d10, timeUnit);
            builder.writeTimeout(v.d(longValue), timeUnit);
        }
        return builder;
    }

    public static final io.ktor.utils.io.f i(InterfaceC6480j interfaceC6480j, CoroutineContext coroutineContext, Wg.d dVar) {
        return n.c(C1483w0.f9135a, coroutineContext, false, new c(interfaceC6480j, coroutineContext, dVar, null), 2, null).d();
    }
}
