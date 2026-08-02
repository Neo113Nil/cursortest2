package ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonOutlineProvider;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.components.Grid2ImageSkeleton;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J#\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010 H\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileSkeletonCreator;", "context", "Landroid/content/Context;", "isLastElement", "", "<init>", "(Landroid/content/Context;Z)V", "(Landroid/content/Context;)V", "elements", "Ljava/util/ArrayList;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton$TileSkeletonElements;", "Lkotlin/collections/ArrayList;", "imageShimmer", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonInnerShimmer;", "longDescriptionShimmer", "shortDescriptionShimmer", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "startShimmerAnimation", "stopShimmerAnimation", "addViews", "getCorners", "", "radius", "", "getImageHeight", "generateSkeletonView", "Landroid/view/View;", "corners", "lp", "Landroid/view/ViewGroup$LayoutParams;", "view", "Companion", "TileSkeletonElements", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileItemSkeleton extends LinearLayout implements TileSkeletonCreator {
    private final /* synthetic */ TileSkeletonCreatorImpl $$delegate_0;

    @NotNull
    private final ArrayList<TileSkeletonElements> elements;

    @NotNull
    private final SkeletonInnerShimmer imageShimmer;
    private final boolean isLastElement;

    @NotNull
    private final SkeletonInnerShimmer longDescriptionShimmer;

    @NotNull
    private final SkeletonInnerShimmer shortDescriptionShimmer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp2 = UiExtKt.toPx(2);
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp12 = UiExtKt.toPx(12);
    private static final int dp16 = UiExtKt.toPx(16);
    private static final int dp48 = UiExtKt.toPx(48);
    private static final int paddingsSum = UiExtKt.toPx(14);
    private static final float tileRadius = UiExtKt.toPxF(14.0f);
    private static final float descriptionRadius = UiExtKt.toPxF(8);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton$Companion;", "", "<init>", "()V", "", "TILES_PER_SCREEN", "D", "IMAGE_RATIO", "", "NO_RADIUS", "F", "", "CORNERS_COUNT", "I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton$TileSkeletonElements;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "SHORT_DESCRIPTION", "LONG_DESCRIPTION", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TileSkeletonElements {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TileSkeletonElements[] $VALUES;
        public static final TileSkeletonElements IMAGE = new TileSkeletonElements("IMAGE", 0);
        public static final TileSkeletonElements SHORT_DESCRIPTION = new TileSkeletonElements("SHORT_DESCRIPTION", 1);
        public static final TileSkeletonElements LONG_DESCRIPTION = new TileSkeletonElements("LONG_DESCRIPTION", 2);

        private static final /* synthetic */ TileSkeletonElements[] $values() {
            return new TileSkeletonElements[]{IMAGE, SHORT_DESCRIPTION, LONG_DESCRIPTION};
        }

        static {
            TileSkeletonElements[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TileSkeletonElements(String str, int i11) {
        }

        public static TileSkeletonElements valueOf(String str) {
            return (TileSkeletonElements) Enum.valueOf(TileSkeletonElements.class, str);
        }

        public static TileSkeletonElements[] values() {
            return (TileSkeletonElements[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileSkeletonElements.values().length];
            try {
                iArr[TileSkeletonElements.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileSkeletonElements.LONG_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileSkeletonElements.SHORT_DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileItemSkeleton(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new TileSkeletonCreatorImpl(context);
        this.isLastElement = z11;
        this.elements = C7714v.t(TileSkeletonElements.IMAGE, TileSkeletonElements.LONG_DESCRIPTION, TileSkeletonElements.SHORT_DESCRIPTION);
        SkeletonInnerShimmer skeletonInnerShimmer = new SkeletonInnerShimmer(context);
        skeletonInnerShimmer.addViews(new Grid2ImageSkeleton(context));
        this.imageShimmer = skeletonInnerShimmer;
        SkeletonInnerShimmer skeletonInnerShimmer2 = new SkeletonInnerShimmer(context);
        skeletonInnerShimmer2.addViews(new View(context));
        this.longDescriptionShimmer = skeletonInnerShimmer2;
        SkeletonInnerShimmer skeletonInnerShimmer3 = new SkeletonInnerShimmer(context);
        skeletonInnerShimmer3.addViews(new View(context));
        this.shortDescriptionShimmer = skeletonInnerShimmer3;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i11 = dp2;
        setPadding(i11, 0, i11, 0);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setOutlineProvider(new SkeletonOutlineProvider());
        setClipToOutline(false);
        addViews();
    }

    private final void addViews() {
        View generateSkeletonView;
        Iterator<T> it = this.elements.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((TileSkeletonElements) it.next()).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    float[] corners = getCorners(descriptionRadius);
                    int i12 = dp12;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i12);
                    layoutParams.leftMargin = dp2;
                    layoutParams.rightMargin = this.isLastElement ? 0 : dp8;
                    layoutParams.bottomMargin = i12;
                    Unit unit = Unit.f71690a;
                    generateSkeletonView = generateSkeletonView(corners, layoutParams, this.longDescriptionShimmer);
                } else {
                    if (i11 != 3) {
                        throw new o();
                    }
                    float[] corners2 = getCorners(descriptionRadius);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, dp12);
                    layoutParams2.leftMargin = dp2;
                    layoutParams2.rightMargin = this.isLastElement ? 0 : dp48;
                    Unit unit2 = Unit.f71690a;
                    generateSkeletonView = generateSkeletonView(corners2, layoutParams2, this.shortDescriptionShimmer);
                    generateSkeletonView.setTag(TileSkeletonElements.SHORT_DESCRIPTION);
                }
            } else {
                float[] corners3 = getCorners(tileRadius);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.bottomMargin = dp16;
                layoutParams3.height = getImageHeight();
                Unit unit3 = Unit.f71690a;
                generateSkeletonView = generateSkeletonView(corners3, layoutParams3, this.imageShimmer);
            }
            addView(generateSkeletonView);
        }
    }

    private final float[] getCorners(float radius) {
        if (this.isLastElement) {
            return new float[]{radius, radius, 0.0f, 0.0f, 0.0f, 0.0f, radius, radius};
        }
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = radius;
        }
        return fArr;
    }

    private final int getImageHeight() {
        return (int) (((int) ((getContext().getResources().getDisplayMetrics().widthPixels - paddingsSum) / 2.58d)) * 1.33d);
    }

    @NotNull
    public View generateSkeletonView(@NotNull float[] corners, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(lp, "lp");
        return this.$$delegate_0.generateSkeletonView(corners, lp, view);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        for (View view : ViewGroupExtKt.children(this)) {
            if (view.getTag() == TileSkeletonElements.SHORT_DESCRIPTION && !this.isLastElement) {
                view.measure(View.MeasureSpec.makeMeasureSpec(TileSkeletonCreator.INSTANCE.resolveViewWidth(size, 0.68f), 1073741824), View.MeasureSpec.makeMeasureSpec(dp12, 1073741824));
            }
        }
    }

    public final void startShimmerAnimation() {
        this.imageShimmer.startAnimation();
        this.longDescriptionShimmer.startAnimation();
        this.shortDescriptionShimmer.startAnimation();
    }

    public final void stopShimmerAnimation() {
        this.imageShimmer.stopAnimation();
        this.longDescriptionShimmer.stopAnimation();
        this.shortDescriptionShimmer.stopAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileItemSkeleton(@NotNull Context context) {
        this(context, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
