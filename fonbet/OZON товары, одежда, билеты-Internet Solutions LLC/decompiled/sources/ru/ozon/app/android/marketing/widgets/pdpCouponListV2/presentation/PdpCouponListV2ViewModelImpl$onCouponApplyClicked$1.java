package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import Ge.f;
import Sc.r;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.coupon.data.ApplyCouponResponse;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1", f = "PdpCouponListV2ViewModelImpl.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ PdpCouponItemListV2VO $coupon;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PdpCouponListV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1(PdpCouponListV2ViewModelImpl pdpCouponListV2ViewModelImpl, PdpCouponItemListV2VO pdpCouponItemListV2VO, d<? super PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = pdpCouponListV2ViewModelImpl;
        this.$coupon = pdpCouponItemListV2VO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1 pdpCouponListV2ViewModelImpl$onCouponApplyClicked$1 = new PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1(this.this$0, this.$coupon, dVar);
        pdpCouponListV2ViewModelImpl$onCouponApplyClicked$1.L$0 = obj;
        return pdpCouponListV2ViewModelImpl$onCouponApplyClicked$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        CouponActivationRepository couponActivationRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                PdpCouponListV2ViewModelImpl pdpCouponListV2ViewModelImpl = this.this$0;
                PdpCouponItemListV2VO pdpCouponItemListV2VO = this.$coupon;
                r.Companion companion = r.INSTANCE;
                couponActivationRepository = pdpCouponListV2ViewModelImpl.repository;
                y<ApplyCouponResponse> activateCode = couponActivationRepository.activateCode(pdpCouponItemListV2VO.getPromocode().getPromocode());
                this.label = 1;
                obj = f.b(activateCode, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (ApplyCouponResponse) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        this.this$0.processActivationResult(a11, this.$coupon);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
