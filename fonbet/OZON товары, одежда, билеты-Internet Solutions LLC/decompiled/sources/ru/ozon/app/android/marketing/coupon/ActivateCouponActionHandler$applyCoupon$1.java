package ru.ozon.app.android.marketing.coupon;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.coupon.domain.ActivateCouponResult;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;
import ru.ozon.app.android.marketing.coupon.utils.CouponUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.coupon.ActivateCouponActionHandler$applyCoupon$1", f = "ActivateCouponActionHandler.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ActivateCouponActionHandler$applyCoupon$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    int label;
    final /* synthetic */ ActivateCouponActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivateCouponActionHandler$applyCoupon$1(ActivateCouponActionHandler activateCouponActionHandler, AtomAction.ComposerAction composerAction, d<? super ActivateCouponActionHandler$applyCoupon$1> dVar) {
        super(2, dVar);
        this.this$0 = activateCouponActionHandler;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActivateCouponActionHandler$applyCoupon$1(this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CouponInteractor couponInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.couponCode = CouponUtilsKt.findCouponCode(this.$action);
            couponInteractor = this.this$0.interactor;
            AtomAction.ComposerAction composerAction = this.$action;
            this.label = 1;
            obj = couponInteractor.applyCoupon(composerAction, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.processResult((ActivateCouponResult) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActivateCouponActionHandler$applyCoupon$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
