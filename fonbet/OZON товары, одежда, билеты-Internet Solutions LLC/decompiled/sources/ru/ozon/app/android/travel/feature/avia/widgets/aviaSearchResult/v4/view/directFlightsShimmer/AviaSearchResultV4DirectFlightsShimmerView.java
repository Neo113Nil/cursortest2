package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.directFlightsShimmer;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.DirectFlightsSkeleton;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.shimmer.Shimmer;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsShimmerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp12", "", "dp16", "dpf24", "", "backgroundColor", "shimmerTitleWrapper", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "item1", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsCellItemShimmerView;", "item2", "bind", "", "data", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/DirectFlightsSkeleton;", "configTitleShimmerAndSet", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4DirectFlightsShimmerView extends LinearLayout {
    private final int backgroundColor;
    private final int dp12;
    private final int dp16;
    private final float dpf24;

    @NotNull
    private final AviaSearchResultV4DirectFlightsCellItemShimmerView item1;

    @NotNull
    private final AviaSearchResultV4DirectFlightsCellItemShimmerView item2;

    @NotNull
    private final ShimmerFrameLayout shimmerTitleWrapper;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4DirectFlightsShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context, null, 0, 0, 14, null);
        shimmerFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.shimmerTitleWrapper = shimmerFrameLayout;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        textAtomV2View.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.title = textAtomV2View;
        AviaSearchResultV4DirectFlightsCellItemShimmerView aviaSearchResultV4DirectFlightsCellItemShimmerView = new AviaSearchResultV4DirectFlightsCellItemShimmerView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, px, 0, 0);
        aviaSearchResultV4DirectFlightsCellItemShimmerView.setLayoutParams(layoutParams);
        this.item1 = aviaSearchResultV4DirectFlightsCellItemShimmerView;
        AviaSearchResultV4DirectFlightsCellItemShimmerView aviaSearchResultV4DirectFlightsCellItemShimmerView2 = new AviaSearchResultV4DirectFlightsCellItemShimmerView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, px, 0, 0);
        aviaSearchResultV4DirectFlightsCellItemShimmerView2.setLayoutParams(layoutParams2);
        this.item2 = aviaSearchResultV4DirectFlightsCellItemShimmerView2;
        setOrientation(1);
        setBackground(new RoundedBackgroundProducer().produce(themeColor, pxF));
        addView(shimmerFrameLayout);
        shimmerFrameLayout.addView(textAtomV2View);
        addView(aviaSearchResultV4DirectFlightsCellItemShimmerView);
        addView(aviaSearchResultV4DirectFlightsCellItemShimmerView2);
        configTitleShimmerAndSet();
        ViewExtKt.updatePadding(this, px2, px2, px2, px2);
    }

    private final void configTitleShimmerAndSet() {
        this.shimmerTitleWrapper.setShimmer(new Shimmer.AlphaHighlightBuilder().setDuration(800L).setRepeatDelay(800L).setBaseAlpha(1.0f).setHighlightAlpha(0.0f).setDropoff(0.34f).setIntensity(0.0f).setTilt(0.0f).setRepeatMode(1).setShape(Shimmer.Shape.LINEAR).build());
    }

    public final void bind(@NotNull DirectFlightsSkeleton data) {
        Intrinsics.checkNotNullParameter(data, "data");
        TextHolderKt.bind$default(this.title, data.getTitle(), null, 2, null);
    }
}
