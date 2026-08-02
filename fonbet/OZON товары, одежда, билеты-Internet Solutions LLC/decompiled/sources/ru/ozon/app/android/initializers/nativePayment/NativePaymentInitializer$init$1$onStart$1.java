package ru.ozon.app.android.initializers.nativePayment;

import Ae.C;
import Ae.C2399j;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.s;
import Wc.a;
import android.content.Context;
import fd.InterfaceC6511n;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.GPayPanEnabledFlag;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer$init$1$onStart$1", f = "NativePaymentInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class NativePaymentInitializer$init$1$onStart$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NativePaymentInitializer this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer$init$1$onStart$1$1", f = "NativePaymentInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer$init$1$onStart$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<InterfaceC2397i<? super Boolean>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Boolean> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = th2;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer$init$1$onStart$1$2", f = "NativePaymentInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer$init$1$onStart$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Boolean>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Boolean> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativePaymentInitializer$init$1$onStart$1(NativePaymentInitializer nativePaymentInitializer, d<? super NativePaymentInitializer$init$1$onStart$1> dVar) {
        super(2, dVar);
        this.this$0 = nativePaymentInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NativePaymentInitializer$init$1$onStart$1 nativePaymentInitializer$init$1$onStart$1 = new NativePaymentInitializer$init$1$onStart$1(this.this$0, dVar);
        nativePaymentInitializer$init$1$onStart$1.L$0 = obj;
        return nativePaymentInitializer$init$1$onStart$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GooglePayManager googlePayManager;
        Context context;
        GooglePayManager googlePayManager2;
        Context context2;
        AndroidPlatformComponentConfig androidPlatformComponentConfig;
        FeatureChecker featureChecker;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        googlePayManager = this.this$0.googlePayManager;
        context = this.this$0.context;
        p<Boolean> k11 = googlePayManager.isSupportGooglePay(context).k();
        Intrinsics.checkNotNullExpressionValue(k11, "toObservable(...)");
        C2399j.C(new C(n.a(k11), new AnonymousClass1(null)), m11);
        googlePayManager2 = this.this$0.googlePayManager;
        context2 = this.this$0.context;
        androidPlatformComponentConfig = this.this$0.config;
        featureChecker = this.this$0.featureChecker;
        p<Boolean> k12 = googlePayManager2.checkIsGooglePayReady(context2, androidPlatformComponentConfig, featureChecker.isEnabled(GPayPanEnabledFlag.INSTANCE)).k();
        Intrinsics.checkNotNullExpressionValue(k12, "toObservable(...)");
        C2399j.C(new C(n.a(k12), new AnonymousClass2(null)), m11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NativePaymentInitializer$init$1$onStart$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
