package ne;

import Ph.AbstractC1459k;
import Ph.P;
import android.app.Application;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import ge.C4377a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import td.C6461a;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f57488a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f57489b = LazyKt.lazy(a.f57491d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f57490c = LazyKt.lazy(b.f57492d);

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f57491d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4377a invoke() {
            C4377a.C0689a c0689a = C4377a.f47235d;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0689a.a(e10);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f57492d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.e invoke() {
            return new Ge.e(l.f57488a.d());
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57493n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ie.b f57494o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ie.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f57494o = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f57494o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57493n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ge.e e10 = l.f57488a.e();
                ie.b bVar = this.f57494o;
                this.f57493n = 1;
                if (e10.a(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final void f(ie.b debugInfoData) {
        Intrinsics.checkNotNullParameter(debugInfoData, "debugInfoData");
        AbstractC1459k.d(f57488a.c(), null, null, new c(debugInfoData, null), 3, null);
    }

    public final P c() {
        return C6461a.f65810a.e();
    }

    public final C4377a d() {
        return (C4377a) f57489b.getValue();
    }

    public final Ge.e e() {
        return (Ge.e) f57490c.getValue();
    }
}
