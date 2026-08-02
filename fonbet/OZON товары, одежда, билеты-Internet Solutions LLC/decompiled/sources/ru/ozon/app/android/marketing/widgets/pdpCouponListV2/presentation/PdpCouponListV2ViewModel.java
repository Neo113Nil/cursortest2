package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewModel;", "", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "coupon", "", "onCouponApplyClicked", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;)V", "Landroidx/lifecycle/P;", "", "getTooltip", "()Landroidx/lifecycle/P;", "tooltip", "getRefreshTrigger", "refreshTrigger", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PdpCouponListV2ViewModel {
    @NotNull
    P<Unit> getRefreshTrigger();

    @NotNull
    P<String> getTooltip();

    void onCouponApplyClicked(@NotNull PdpCouponItemListV2VO coupon);
}
