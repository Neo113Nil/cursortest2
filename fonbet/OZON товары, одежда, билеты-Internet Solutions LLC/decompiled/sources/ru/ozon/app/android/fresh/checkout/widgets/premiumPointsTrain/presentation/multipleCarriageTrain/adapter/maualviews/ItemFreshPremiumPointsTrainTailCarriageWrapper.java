package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/ItemFreshPremiumPointsTrainTailCarriageWrapper;", "", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "pointsTv", "getPointsTv", "pointsIconIv", "Landroid/widget/ImageView;", "getPointsIconIv", "()Landroid/widget/ImageView;", "carriageCv", "Landroid/view/ViewGroup;", "getCarriageCv", "()Landroid/view/ViewGroup;", "statusIv", "getStatusIv", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ItemFreshPremiumPointsTrainTailCarriageWrapper {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static ImageView getStatusIv(@NotNull ItemFreshPremiumPointsTrainTailCarriageWrapper itemFreshPremiumPointsTrainTailCarriageWrapper) {
            return null;
        }
    }

    @NotNull
    ViewGroup getCarriageCv();

    @NotNull
    ImageView getPointsIconIv();

    @NotNull
    TextView getPointsTv();

    @NotNull
    View getRoot();

    ImageView getStatusIv();

    @NotNull
    TextView getTitleTv();
}
