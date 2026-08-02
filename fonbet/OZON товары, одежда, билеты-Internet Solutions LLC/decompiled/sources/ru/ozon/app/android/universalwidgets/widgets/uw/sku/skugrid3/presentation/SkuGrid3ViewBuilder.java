package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ViewBuilder;", "", "<init>", "()V", "dp4", "", "dp10", "getDp10", "()I", "dp12", "buildAdultIv", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "container", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3View;", "buildOverlayImage", "Landroidx/appcompat/widget/AppCompatImageView;", "overlayTitle", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "waveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "badgesContainer", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "topRightButtonsRV", "Landroidx/recyclerview/widget/RecyclerView;", "stateVal", "stateView", "Landroid/view/View;", "productSa", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "buttonSubtitle", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuGrid3ViewBuilder {

    @NotNull
    public static final SkuGrid3ViewBuilder INSTANCE = new SkuGrid3ViewBuilder();
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp10 = ResourceExtKt.toPx(10);
    private static final int dp12 = ResourceExtKt.toPx(12);

    private SkuGrid3ViewBuilder() {
    }

    @NotNull
    public final HorizontalBadgesContainerView badgesContainer(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HorizontalBadgesContainerView horizontalBadgesContainerView = new HorizontalBadgesContainerView(context, null, 0, 6, null);
        horizontalBadgesContainerView.setId(R$id.badgesContainer);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i11 = dp4;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        container.addView(horizontalBadgesContainerView, marginLayoutParams);
        return horizontalBadgesContainerView;
    }

    @NotNull
    public final SkuImageWrapper buildAdultIv(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SkuImageWrapper skuImageWrapper = new SkuImageWrapper(context, null, 0, 6, null);
        skuImageWrapper.setId(R$id.adultIv);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = dp4;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        container.addView(skuImageWrapper, marginLayoutParams);
        return skuImageWrapper;
    }

    @NotNull
    public final AppCompatImageView buildOverlayImage(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AppCompatImageView appCompatImageView = new AppCompatImageView(container.getContext());
        appCompatImageView.setId(R$id.overlayImage);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        container.addView(appCompatImageView, new ViewGroup.MarginLayoutParams(-1, -2));
        return appCompatImageView;
    }

    @NotNull
    public final TextAtomWithIconView buttonSubtitle(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomWithIconView textAtomWithIconView = new TextAtomWithIconView(context, null, 0, 6, null);
        textAtomWithIconView.setId(R$id.buttonSubtitle);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = dp4;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        container.addView(textAtomWithIconView, marginLayoutParams);
        return textAtomWithIconView;
    }

    public final int getDp10() {
        return dp10;
    }

    @NotNull
    public final OverlayTitleView overlayTitle(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayTitleView overlayTitleView = new OverlayTitleView(context, null, 0, 6, null);
        overlayTitleView.setId(R$id.overlayTitle);
        overlayTitleView.setVisibility(8);
        container.addView(overlayTitleView, new ViewGroup.MarginLayoutParams(-1, -2));
        return overlayTitleView;
    }

    @NotNull
    public final SingleAtom productSa(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(R$id.productSa);
        int i11 = dp4;
        singleAtom.setPadding(i11, 0, i11, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = dp12;
        marginLayoutParams.bottomMargin = i11;
        container.addView(singleAtom, marginLayoutParams);
        return singleAtom;
    }

    @NotNull
    public final RecyclerView stateVal(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        RecyclerView recyclerView = new RecyclerView(container.getContext());
        recyclerView.setId(R$id.stateVal);
        int i11 = dp4;
        recyclerView.setPadding(i11, 0, i11, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = i11;
        container.addView(recyclerView, marginLayoutParams);
        return recyclerView;
    }

    @NotNull
    public final View stateView(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View view = new View(container.getContext());
        view.setId(R$id.stateView);
        int i11 = dp4;
        view.setPadding(i11, 0, i11, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = i11;
        container.addView(view, marginLayoutParams);
        return view;
    }

    @NotNull
    public final RecyclerView topRightButtonsRV(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        RecyclerView recyclerView = new RecyclerView(container.getContext());
        recyclerView.setId(R$id.topRightButtonsRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        container.addView(recyclerView, new ViewGroup.MarginLayoutParams(-2, -2));
        return recyclerView;
    }

    @NotNull
    public final WaveView waveView(@NotNull SkuGrid3View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WaveView waveView = new WaveView(context, null, 0, 6, null);
        waveView.setId(R$id.waveView);
        waveView.setVisibility(8);
        container.addView(waveView, new ViewGroup.MarginLayoutParams(-1, dp10));
        return waveView;
    }
}
