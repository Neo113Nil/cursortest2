package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import androidx.recyclerview.widget.D;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.TogglingSnapHelper;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$productItemRecyclerAnimator$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ RateItemsV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2View$productItemRecyclerAnimator$1(RateItemsV2View rateItemsV2View) {
        super(0);
        this.this$0 = rateItemsV2View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        D d11;
        d11 = this.this$0.snapHelper;
        TogglingSnapHelper togglingSnapHelper = d11 instanceof TogglingSnapHelper ? (TogglingSnapHelper) d11 : null;
        if (togglingSnapHelper != null) {
            togglingSnapHelper.ignoreNextSnap();
        }
        RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) C7714v.Q(this.this$0.rateItemsAdapter.getShimmersCount(), this.this$0.allRateItems);
        if (rateItemVO != null) {
            this.this$0.rateItemsAdapter.setCompactMode(true);
            this.this$0.rateItemsAdapter.addItem(rateItemVO);
        }
        return Boolean.valueOf(rateItemVO != null);
    }
}
