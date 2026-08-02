package ru.ozon.app.android.search.widgets.searchbar.shimmer;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.components.DoubleSkeleton;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.components.FlexboxRowSkeleton;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.components.Grid2Skeleton;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.components.Grid3Skeleton;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.components.TileGrid2Skeleton;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\"¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/SearchSkeleton;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "isDialogSearchPage", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IIZ)V", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonElement;", "type", "Landroid/view/View;", "createSkeleton", "(Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonElement;)Landroid/view/View;", "", "skeletonElements", "", "addSkeletonElements", "(Ljava/util/List;)V", "", "radius", "Landroid/view/ViewGroup$LayoutParams;", "lp", "view", "generateSkeletonView", "(FLandroid/view/ViewGroup$LayoutParams;Landroid/view/View;)Landroid/view/View;", "Z", "()Z", "dp2", "I", "dp8", "dp12", "dp16", "dp20", "dp24", "dp28", "dp32", "horizontalPadding", "topPadding", "screenWidth", "backgroundColor", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchSkeleton extends LinearLayout implements SkeletonCreator {
    private final /* synthetic */ SkeletonCreatorImpl $$delegate_0;
    private final int backgroundColor;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp24;
    private final int dp28;
    private final int dp32;
    private final int dp8;
    private final int horizontalPadding;
    private final boolean isDialogSearchPage;
    private final int screenWidth;
    private final int topPadding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/SearchSkeleton$Companion;", "", "<init>", "()V", "TILE_GRID2_ELEMENTS_COUNT", "", "GRID3_ELEMENTS_COUNT", "GRID3_CENTER_ELEMENT", "DEFAULT_PADDING", "SINGLE_MEDIUM_WIDTH_MULTIPLIER", "", "SINGLE_LARGE_WIDTH_MULTIPLIER", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SearchSkeleton(Context context, AttributeSet attributeSet, int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? false : z11);
    }

    private final View createSkeleton(SkeletonElement type) {
        if (Intrinsics.d(type, SkeletonElement.Double.INSTANCE)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            DoubleSkeleton doubleSkeleton = new DoubleSkeleton(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(this.dp16);
            layoutParams.setMarginEnd(this.dp16);
            doubleSkeleton.setLayoutParams(layoutParams);
            return doubleSkeleton;
        }
        if (type instanceof SkeletonElement.SingleMedium) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(SkeletonCreator.INSTANCE.resolveViewWidth(this.screenWidth, 0.6f), this.dp24);
            layoutParams2.topMargin = ((SkeletonElement.SingleMedium) type).getTopMargin();
            layoutParams2.setMarginStart(this.dp16);
            layoutParams2.setMarginEnd(this.dp16);
            Unit unit = Unit.f71690a;
            return SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 6.0f, layoutParams2, null, 4, null);
        }
        if (type instanceof SkeletonElement.SingleLarge) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            SkeletonElement.SingleLarge singleLarge = (SkeletonElement.SingleLarge) type;
            layoutParams3.topMargin = singleLarge.getTopMargin();
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setPadding(0, singleLarge.getTopPadding(), 0, 0);
            frameLayout.setBackgroundColor(singleLarge.getBackgroundColor());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(SkeletonCreator.INSTANCE.resolveViewWidth(this.screenWidth, 0.6f), this.dp20);
            layoutParams4.bottomMargin = singleLarge.getBottomMargin();
            layoutParams4.setMarginStart(this.dp16);
            layoutParams4.setMarginEnd(this.dp16);
            Unit unit2 = Unit.f71690a;
            frameLayout.addView(SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 6.0f, layoutParams4, null, 4, null));
            return frameLayout;
        }
        if (Intrinsics.d(type, SkeletonElement.Grid3.INSTANCE)) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            int i11 = this.dp12;
            linearLayout.setPadding(0, i11, 0, i11);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMarginStart(this.dp16);
            layoutParams5.setMarginEnd(this.dp16);
            linearLayout.setLayoutParams(layoutParams5);
            linearLayout.setOrientation(0);
            for (int i12 = 0; i12 < 3; i12++) {
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Grid3Skeleton grid3Skeleton = new Grid3Skeleton(context2);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (i12 == 1) {
                    layoutParams6.setMarginEnd(this.dp16);
                    layoutParams6.setMarginStart(this.dp16);
                }
                linearLayout.addView(grid3Skeleton, layoutParams6);
            }
            return linearLayout;
        }
        if (Intrinsics.d(type, SkeletonElement.Flexbox3.INSTANCE)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setPadding(0, this.dp12, 0, 0);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams7.setMarginStart(this.dp16);
            layoutParams7.setMarginEnd(this.dp16);
            linearLayout2.setLayoutParams(layoutParams7);
            linearLayout2.setOrientation(1);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            Context context3 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            linearLayout2.addView(new FlexboxRowSkeleton(context3, null, 0, 0, C7714v.b0(Float.valueOf(0.4f), Float.valueOf(0.3f)), 14, null), layoutParams8);
            Context context4 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            linearLayout2.addView(new FlexboxRowSkeleton(context4, null, 0, 0, C7714v.b0(Float.valueOf(0.3f), Float.valueOf(0.3f)), 14, null), layoutParams8);
            Context context5 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            linearLayout2.addView(new FlexboxRowSkeleton(context5, null, 0, 0, C7714v.a0(Float.valueOf(0.4f)), 14, null), layoutParams8);
            return linearLayout2;
        }
        if (type instanceof SkeletonElement.IslandSeparator) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context6, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams9.topMargin = -(this.isDialogSearchPage ? this.dp16 : this.dp32);
            layoutParams9.bottomMargin = -this.dp28;
            islandSeparatorView.setLayoutParams(layoutParams9);
            SkeletonElement.IslandSeparator islandSeparator = (SkeletonElement.IslandSeparator) type;
            islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(islandSeparator.getHasTopCorners(), islandSeparator.getHasBottomCorners(), 0, this.backgroundColor, 4, null));
            return islandSeparatorView;
        }
        if (Intrinsics.d(type, SkeletonElement.Grid2.INSTANCE)) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setPadding(this.horizontalPadding, this.topPadding, 0, 0);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout3.setBackgroundColor(this.backgroundColor);
            linearLayout3.setOrientation(0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (i13 == 1) {
                    layoutParams10.setMarginEnd(this.horizontalPadding);
                    layoutParams10.setMarginStart(this.horizontalPadding);
                }
                Context context7 = linearLayout3.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                linearLayout3.addView(new Grid2Skeleton(context7), layoutParams10);
            }
            return linearLayout3;
        }
        if (!Intrinsics.d(type, SkeletonElement.TileGrid2.INSTANCE)) {
            throw new o();
        }
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        int i14 = this.dp2;
        linearLayout4.setPadding(i14, this.dp8, i14, 0);
        linearLayout4.setLayoutParams(layoutParams11);
        linearLayout4.setOrientation(0);
        linearLayout4.setBackgroundColor(this.backgroundColor);
        for (int i15 = 0; i15 < 2; i15++) {
            Context context8 = linearLayout4.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            TileGrid2Skeleton tileGrid2Skeleton = new TileGrid2Skeleton(context8);
            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams12.setMarginStart(this.dp2);
            layoutParams12.setMarginEnd(this.dp2);
            linearLayout4.addView(tileGrid2Skeleton, layoutParams12);
        }
        return linearLayout4;
    }

    public final void addSkeletonElements(@NotNull List<? extends SkeletonElement> skeletonElements) {
        Intrinsics.checkNotNullParameter(skeletonElements, "skeletonElements");
        Iterator<T> it = skeletonElements.iterator();
        while (it.hasNext()) {
            addView(createSkeleton((SkeletonElement) it.next()));
        }
    }

    @Override // ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator
    @NotNull
    public View generateSkeletonView(float radius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        return this.$$delegate_0.generateSkeletonView(radius, lp, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSkeleton(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, boolean z11) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new SkeletonCreatorImpl(context);
        this.isDialogSearchPage = z11;
        this.dp2 = UiExtKt.toPx(2);
        this.dp8 = UiExtKt.toPx(8);
        this.dp12 = UiExtKt.toPx(12);
        this.dp16 = UiExtKt.toPx(16);
        this.dp20 = UiExtKt.toPx(20);
        this.dp24 = UiExtKt.toPx(24);
        this.dp28 = UiExtKt.toPx(28);
        this.dp32 = UiExtKt.toPx(32);
        this.horizontalPadding = UiExtKt.toPx(16);
        this.topPadding = UiExtKt.toPx(24);
        this.screenWidth = (context.getResources().getDisplayMetrics().widthPixels - getPaddingRight()) - getPaddingLeft();
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        setOrientation(1);
    }
}
