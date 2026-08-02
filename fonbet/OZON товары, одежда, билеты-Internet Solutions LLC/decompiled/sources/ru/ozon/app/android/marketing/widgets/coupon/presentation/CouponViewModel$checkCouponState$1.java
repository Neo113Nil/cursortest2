package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import A00.a;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressUpdateState;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponState;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewModel$checkCouponState$1", f = "CouponViewModel.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CouponViewModel$checkCouponState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    int label;
    final /* synthetic */ CouponViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HighlightsCurrentMiniWidget.values().length];
            try {
                iArr[HighlightsCurrentMiniWidget.HIGHLIGHT_PRODUCTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HighlightsCurrentMiniWidget.ACTION_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponViewModel$checkCouponState$1(CouponViewModel couponViewModel, String str, d<? super CouponViewModel$checkCouponState$1> dVar) {
        super(2, dVar);
        this.this$0 = couponViewModel;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CouponViewModel$checkCouponState$1(this.this$0, this.$asyncData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HighlightsWrapperStateManager highlightsWrapperStateManager;
        V v11;
        V v12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            highlightsWrapperStateManager = this.this$0.stateManager;
            String str = this.$asyncData;
            this.label = 1;
            obj = highlightsWrapperStateManager.requestWidgetState(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        HighlightsWrapperAsyncState highlightsWrapperAsyncState = (HighlightsWrapperAsyncState) obj;
        a.J.InterfaceC0007a interfaceC0007a = null;
        if (!(highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.Success)) {
            v12 = this.this$0._couponState;
            v12.setValue(new CouponState.ChangeMiniWidget(null, null));
            return Unit.f71690a;
        }
        v11 = this.this$0._couponState;
        HighlightsWrapperAsyncState.Success success = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
        CouponUpdateState couponUpdateState = new CouponUpdateState(success.getState().getCoupon());
        HighlightsCurrentMiniWidget currentMiniWidget = success.getState().getCurrentMiniWidget();
        int i12 = currentMiniWidget == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currentMiniWidget.ordinal()];
        if (i12 == 1) {
            interfaceC0007a = new HighlightProductsUpdateState(success.getState().getHighlightProducts());
        } else if (i12 == 2) {
            interfaceC0007a = new ActionProgressUpdateState(success.getState().getActionProgress());
        }
        v11.setValue(new CouponState.ChangeMiniWidget(couponUpdateState, interfaceC0007a));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CouponViewModel$checkCouponState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
