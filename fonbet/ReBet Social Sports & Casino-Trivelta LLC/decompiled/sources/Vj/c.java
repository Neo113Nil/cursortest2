package Vj;

import Dj.e;
import Ej.j;
import Ph.AbstractC1455i;
import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h f12952a;

    /* renamed from: b, reason: collision with root package name */
    public final f f12953b;

    /* renamed from: c, reason: collision with root package name */
    public final j f12954c;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12955n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f12957p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f12957p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(this.f12957p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12955n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    h hVar = c.this.f12952a;
                    String str = this.f12957p;
                    this.f12955n = 1;
                    obj = hVar.a(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return c.this.f12953b.a((Response) obj);
            } catch (Exception e10) {
                Tj.a.b(e10);
                return e.a.b.f2827a;
            }
        }
    }

    public c(h lineStatusRestService, f mapper, j coroutinesDispatchers) {
        Intrinsics.checkNotNullParameter(lineStatusRestService, "lineStatusRestService");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        this.f12952a = lineStatusRestService;
        this.f12953b = mapper;
        this.f12954c = coroutinesDispatchers;
    }

    public final Object c(String str, Continuation continuation) {
        return AbstractC1455i.g(this.f12954c.b(), new a(str, null), continuation);
    }
}
