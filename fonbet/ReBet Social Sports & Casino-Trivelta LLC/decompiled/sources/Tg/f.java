package Tg;

import Tg.i;
import ch.C2924a;
import fh.AbstractC4283a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2924a f11819a = new C2924a("ValidateMark");

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC7015a f11820b = AbstractC4283a.a("io.ktor.client.plugins.DefaultResponseValidation");

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ng.b f11821d;

        /* renamed from: Tg.f$a$a, reason: collision with other inner class name */
        public static final class C0233a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f11822n;

            /* renamed from: o, reason: collision with root package name */
            public int f11823o;

            /* renamed from: p, reason: collision with root package name */
            public int f11824p;

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f11825q;

            public C0233a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0233a c0233a = new C0233a(continuation);
                c0233a.f11825q = obj;
                return c0233a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Xg.c cVar, Continuation continuation) {
                return ((C0233a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(8:5|6|7|8|9|(2:16|(1:(1:24)(1:23))(1:19))(1:12)|13|14)(2:28|29))(1:30))(2:39|(2:41|42)(2:43|(2:50|51)(3:47|(1:49)|35)))|31|32|33|(10:36|8|9|(0)|16|(0)|(1:21)|24|13|14)|35|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
            
                r0 = r1;
                r3 = r5;
                r1 = r11;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x00d9 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00e6 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int c02;
                Xg.c cVar;
                int i10;
                Xg.c cVar2;
                Xg.c cVar3;
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f11824p;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Xg.c cVar4 = (Xg.c) this.f11825q;
                    if (!((Boolean) cVar4.r().getAttributes().g(j.e())).booleanValue()) {
                        f.f11820b.b("Skipping default response validation for " + cVar4.r().e().getUrl());
                        return Unit.INSTANCE;
                    }
                    c02 = cVar4.f().c0();
                    Og.b r10 = cVar4.r();
                    if (c02 < 300 || r10.getAttributes().d(f.f11819a)) {
                        return Unit.INSTANCE;
                    }
                    this.f11825q = cVar4;
                    this.f11823o = c02;
                    this.f11824p = 1;
                    Object a10 = Og.d.a(r10, this);
                    if (a10 != coroutine_suspended) {
                        cVar = cVar4;
                        obj = a10;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f11823o;
                    cVar3 = (Xg.c) this.f11822n;
                    cVar2 = (Xg.c) this.f11825q;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                    } catch (jh.c unused) {
                        str = "<body failed decoding>";
                        if (300 <= i10) {
                        }
                        f.f11820b.b("Default response validation for " + cVar2.r().e().getUrl() + " failed with " + r0);
                        throw r0;
                    }
                    Throwable xVar = (300 <= i10 || i10 >= 400) ? (400 <= i10 || i10 >= 500) ? (500 <= i10 || i10 >= 600) ? new x(cVar3, str) : new A(cVar3, str) : new c(cVar3, str) : new w(cVar3, str);
                    f.f11820b.b("Default response validation for " + cVar2.r().e().getUrl() + " failed with " + xVar);
                    throw xVar;
                }
                c02 = this.f11823o;
                cVar = (Xg.c) this.f11825q;
                ResultKt.throwOnFailure(obj);
                Og.b bVar = (Og.b) obj;
                bVar.getAttributes().b(f.f11819a, Unit.INSTANCE);
                Xg.c f10 = bVar.f();
                this.f11825q = cVar;
                this.f11822n = f10;
                this.f11823o = c02;
                this.f11824p = 2;
                Object b10 = Xg.e.b(f10, null, this, 1, null);
                if (b10 != coroutine_suspended) {
                    i10 = c02;
                    cVar3 = f10;
                    obj = b10;
                    cVar2 = cVar;
                    str = (String) obj;
                    if (300 <= i10) {
                    }
                    f.f11820b.b("Default response validation for " + cVar2.r().e().getUrl() + " failed with " + xVar);
                    throw xVar;
                }
                return coroutine_suspended;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ng.b bVar) {
            super(1);
            this.f11821d = bVar;
        }

        public final void a(i.b HttpResponseValidator) {
            Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
            HttpResponseValidator.d(this.f11821d.d());
            HttpResponseValidator.e(new C0233a(null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i.b) obj);
            return Unit.INSTANCE;
        }
    }

    public static final void c(Ng.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        j.b(bVar, new a(bVar));
    }
}
