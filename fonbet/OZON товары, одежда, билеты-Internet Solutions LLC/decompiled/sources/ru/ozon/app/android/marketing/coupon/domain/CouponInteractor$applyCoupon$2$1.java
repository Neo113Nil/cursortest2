package ru.ozon.app.android.marketing.coupon.domain;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.coupon.domain.CouponInteractor$applyCoupon$2$1", f = "CouponInteractor.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CouponInteractor$applyCoupon$2$1 extends j implements Function2<M, d<? super ActivateCouponResult>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ String $couponCode;
    final /* synthetic */ CouponInteractor $this_runCatching;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponInteractor$applyCoupon$2$1(CouponInteractor couponInteractor, AtomAction.ComposerAction composerAction, String str, d<? super CouponInteractor$applyCoupon$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = couponInteractor;
        this.$action = composerAction;
        this.$couponCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CouponInteractor$applyCoupon$2$1(this.$this_runCatching, this.$action, this.$couponCode, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CouponActivationRepository couponActivationRepository;
        CouponInteractor couponInteractor;
        ActivateCouponResult result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CouponInteractor couponInteractor2 = this.$this_runCatching;
            couponActivationRepository = couponInteractor2.repository;
            y<CouponResponse> applyCoupon = couponActivationRepository.applyCoupon(this.$action.getActionName());
            this.L$0 = couponInteractor2;
            this.label = 1;
            Object b11 = f.b(applyCoupon, this);
            if (b11 == aVar) {
                return aVar;
            }
            couponInteractor = couponInteractor2;
            obj = b11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            couponInteractor = (CouponInteractor) this.L$0;
            s.b(obj);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
        result = couponInteractor.toResult((CouponResponse) obj, this.$couponCode);
        return result;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActivateCouponResult> dVar) {
        return ((CouponInteractor$applyCoupon$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
