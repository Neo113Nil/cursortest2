package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.TravelTabsContainer;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTav", "getSubtitleTav", "tabsContainer", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/TravelTabsContainer;", "getTabsContainer", "()Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/TravelTabsContainer;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursMealStickyTopView extends LinearLayout {
    public static final int $stable;

    @NotNull
    private final TextAtomView subtitleTav;

    @NotNull
    private final TravelTabsContainer tabsContainer;

    @NotNull
    private final TextAtomView titleTav;

    static {
        int i11 = TravelTabsContainer.$stable;
        int i12 = TextAtomView.$stable;
        $stable = i11 | i12 | i12;
    }

    public /* synthetic */ ToursMealStickyTopView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomView getSubtitleTav() {
        return this.subtitleTav;
    }

    @NotNull
    public final TravelTabsContainer getTabsContainer() {
        return this.tabsContainer;
    }

    @NotNull
    public final TextAtomView getTitleTav() {
        return this.titleTav;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursMealStickyTopView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        this.titleTav = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        this.subtitleTav = textAtomView2;
        TravelTabsContainer travelTabsContainer = new TravelTabsContainer(context, null, 0, 6, null);
        travelTabsContainer.setNestedScrollingEnabled(false);
        this.tabsContainer = travelTabsContainer;
        setOrientation(1);
        int px = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(16, context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = px2;
        layoutParams.topMargin = px;
        layoutParams.rightMargin = px2;
        Unit unit = Unit.f71690a;
        addView(textAtomView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = px2;
        layoutParams2.topMargin = ResourceExtKt.toPx(2, context);
        layoutParams2.rightMargin = px2;
        layoutParams2.bottomMargin = px;
        addView(textAtomView2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = ResourceExtKt.toPx(12, context);
        addView(travelTabsContainer, layoutParams3);
    }
}
