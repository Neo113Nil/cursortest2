package Tg;

import Ph.C0;
import ah.C2011c;
import ah.C2023o;
import bh.AbstractC2423b;
import gh.AbstractC4384e;
import hh.C4508a;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public abstract class h {

    public static final class a extends AbstractC2423b.c {

        /* renamed from: a, reason: collision with root package name */
        public final Long f11846a;

        /* renamed from: b, reason: collision with root package name */
        public final C2011c f11847b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f11848c;

        public a(Wg.c cVar, C2011c c2011c, Object obj) {
            this.f11848c = obj;
            String j10 = cVar.a().j(C2023o.f16113a.g());
            this.f11846a = j10 != null ? Long.valueOf(Long.parseLong(j10)) : null;
            this.f11847b = c2011c == null ? C2011c.a.f16016a.a() : c2011c;
        }

        @Override // bh.AbstractC2423b
        public Long a() {
            return this.f11846a;
        }

        @Override // bh.AbstractC2423b
        public C2011c b() {
            return this.f11847b;
        }

        @Override // bh.AbstractC2423b.c
        public io.ktor.utils.io.f d() {
            return io.ktor.utils.io.jvm.javaio.h.b((InputStream) this.f11848c, null, null, 3, null);
        }
    }

    public static final class b extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f11849n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f11850o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f11851p;

        public static final class a extends InputStream {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InputStream f11852a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC4384e f11853b;

            public a(InputStream inputStream, AbstractC4384e abstractC4384e) {
                this.f11852a = inputStream;
                this.f11853b = abstractC4384e;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f11852a.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                this.f11852a.close();
                Xg.e.c(((Og.b) this.f11853b.b()).f());
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f11852a.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b10, int i10, int i11) {
                Intrinsics.checkNotNullParameter(b10, "b");
                return this.f11852a.read(b10, i10, i11);
            }
        }

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Xg.d dVar, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f11850o = abstractC4384e;
            bVar.f11851p = dVar;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11849n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11850o;
                Xg.d dVar = (Xg.d) this.f11851p;
                C4508a a10 = dVar.a();
                Object b10 = dVar.b();
                if (!(b10 instanceof io.ktor.utils.io.f)) {
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(a10.a(), Reflection.getOrCreateKotlinClass(InputStream.class))) {
                    Xg.d dVar2 = new Xg.d(a10, new a(io.ktor.utils.io.jvm.javaio.b.c((io.ktor.utils.io.f) b10, (C0) ((Og.b) abstractC4384e.b()).getCoroutineContext().get(C0.f9001U2)), abstractC4384e));
                    this.f11850o = null;
                    this.f11849n = 1;
                    if (abstractC4384e.e(dVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final AbstractC2423b a(C2011c c2011c, Wg.c context, Object body) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        if (body instanceof InputStream) {
            return new a(context, c2011c, body);
        }
        return null;
    }

    public static final void b(Ng.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.A0().l(Xg.f.f13844g.a(), new b(null));
    }
}
