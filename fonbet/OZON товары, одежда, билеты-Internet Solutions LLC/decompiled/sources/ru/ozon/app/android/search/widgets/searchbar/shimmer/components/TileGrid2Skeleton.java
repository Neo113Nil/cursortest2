package ru.ozon.app.android.search.widgets.searchbar.shimmer.components;

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
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreatorImpl;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonOutlineProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0002J#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0096\u0001J+\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0096\u0001R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/TileGrid2Skeleton;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "elements", "Ljava/util/ArrayList;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/TileGrid2Skeleton$TileGrid2SkeletonElements;", "Lkotlin/collections/ArrayList;", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "addViews", "generateSkeletonView", "Landroid/view/View;", "radius", "", "lp", "Landroid/view/ViewGroup$LayoutParams;", "view", "topRadius", "bottomRadius", "Companion", "TileGrid2SkeletonElements", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileGrid2Skeleton extends LinearLayout implements SkeletonCreator {
    private final /* synthetic */ SkeletonCreatorImpl $$delegate_0;

    @NotNull
    private final ArrayList<TileGrid2SkeletonElements> elements;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp2 = UiExtKt.toPx(2);
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp16 = UiExtKt.toPx(16);
    private static final int dp24 = UiExtKt.toPx(24);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/TileGrid2Skeleton$Companion;", "", "<init>", "()V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/TileGrid2Skeleton$TileGrid2SkeletonElements;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "SHORT_DESCRIPTION", "LONG_DESCRIPTION", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TileGrid2SkeletonElements {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TileGrid2SkeletonElements[] $VALUES;
        public static final TileGrid2SkeletonElements IMAGE = new TileGrid2SkeletonElements("IMAGE", 0);
        public static final TileGrid2SkeletonElements SHORT_DESCRIPTION = new TileGrid2SkeletonElements("SHORT_DESCRIPTION", 1);
        public static final TileGrid2SkeletonElements LONG_DESCRIPTION = new TileGrid2SkeletonElements("LONG_DESCRIPTION", 2);

        private static final /* synthetic */ TileGrid2SkeletonElements[] $values() {
            return new TileGrid2SkeletonElements[]{IMAGE, SHORT_DESCRIPTION, LONG_DESCRIPTION};
        }

        static {
            TileGrid2SkeletonElements[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TileGrid2SkeletonElements(String str, int i11) {
        }

        public static TileGrid2SkeletonElements valueOf(String str) {
            return (TileGrid2SkeletonElements) Enum.valueOf(TileGrid2SkeletonElements.class, str);
        }

        public static TileGrid2SkeletonElements[] values() {
            return (TileGrid2SkeletonElements[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileGrid2SkeletonElements.values().length];
            try {
                iArr[TileGrid2SkeletonElements.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileGrid2SkeletonElements.LONG_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileGrid2SkeletonElements.SHORT_DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2Skeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new SkeletonCreatorImpl(context);
        this.elements = C7714v.t(TileGrid2SkeletonElements.IMAGE, TileGrid2SkeletonElements.LONG_DESCRIPTION, TileGrid2SkeletonElements.SHORT_DESCRIPTION);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setPadding(0, dp2, 0, dp24);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setOutlineProvider(new SkeletonOutlineProvider());
        setClipToOutline(true);
        addViews();
    }

    private final void addViews() {
        View generateSkeletonView;
        Iterator<T> it = this.elements.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((TileGrid2SkeletonElements) it.next()).ordinal()];
            if (i11 == 1) {
                float pxF = UiExtKt.toPxF(14.0f);
                float pxF2 = UiExtKt.toPxF(6.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = dp8;
                int i12 = dp2;
                layoutParams.leftMargin = i12;
                layoutParams.rightMargin = i12;
                Unit unit = Unit.f71690a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InnerShimmer innerShimmer = new InnerShimmer(context);
                Context context2 = innerShimmer.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                innerShimmer.addViews(new Grid3ImageSkeleton(context2));
                generateSkeletonView = generateSkeletonView(pxF, pxF2, layoutParams, innerShimmer);
            } else if (i11 == 2) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, dp16);
                int i13 = dp8;
                layoutParams2.bottomMargin = i13;
                layoutParams2.leftMargin = i13;
                layoutParams2.rightMargin = i13;
                Unit unit2 = Unit.f71690a;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                InnerShimmer innerShimmer2 = new InnerShimmer(context3);
                innerShimmer2.addViews(new View(innerShimmer2.getContext()));
                generateSkeletonView = generateSkeletonView(14.0f, layoutParams2, innerShimmer2);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, dp16);
                int i14 = dp8;
                layoutParams3.leftMargin = i14;
                layoutParams3.rightMargin = i14;
                Unit unit3 = Unit.f71690a;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                InnerShimmer innerShimmer3 = new InnerShimmer(context4);
                innerShimmer3.addViews(new View(innerShimmer3.getContext()));
                generateSkeletonView = generateSkeletonView(14.0f, layoutParams3, innerShimmer3);
                generateSkeletonView.setTag(TileGrid2SkeletonElements.SHORT_DESCRIPTION);
            }
            addView(generateSkeletonView);
        }
    }

    @NotNull
    public View generateSkeletonView(float topRadius, float bottomRadius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        return this.$$delegate_0.generateSkeletonView(topRadius, bottomRadius, lp, view);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        for (View view : ViewGroupExtKt.children(this)) {
            if (view.getTag() == TileGrid2SkeletonElements.SHORT_DESCRIPTION) {
                view.measure(View.MeasureSpec.makeMeasureSpec(SkeletonCreator.INSTANCE.resolveViewWidth(size, 0.68f), 1073741824), View.MeasureSpec.makeMeasureSpec(dp16, 1073741824));
            }
        }
    }

    @Override // ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator
    @NotNull
    public View generateSkeletonView(float radius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        return this.$$delegate_0.generateSkeletonView(radius, lp, view);
    }
}
