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
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid2Skeleton;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "radius", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroid/view/View;", "view", "generateSkeletonView", "(FLandroid/view/ViewGroup$LayoutParams;Landroid/view/View;)Landroid/view/View;", "Companion", "Grid2SkeletonElements", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Grid2Skeleton extends LinearLayout implements SkeletonCreator {
    private final /* synthetic */ SkeletonCreatorImpl $$delegate_0;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp16 = UiExtKt.toPx(16);
    private static final int dp12 = UiExtKt.toPx(12);

    @NotNull
    private static final ArrayList<Grid2SkeletonElements> elements = C7714v.t(Grid2SkeletonElements.IMAGE, Grid2SkeletonElements.LONG_DESCRIPTION, Grid2SkeletonElements.SHORT_DESCRIPTION);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid2Skeleton$Companion;", "", "<init>", "()V", "", "SHORT_DESCRIPTION_WIDTH_MULTIPLIER", "F", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid2Skeleton$Grid2SkeletonElements;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "SHORT_DESCRIPTION", "LONG_DESCRIPTION", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Grid2SkeletonElements {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Grid2SkeletonElements[] $VALUES;
        public static final Grid2SkeletonElements IMAGE = new Grid2SkeletonElements("IMAGE", 0);
        public static final Grid2SkeletonElements SHORT_DESCRIPTION = new Grid2SkeletonElements("SHORT_DESCRIPTION", 1);
        public static final Grid2SkeletonElements LONG_DESCRIPTION = new Grid2SkeletonElements("LONG_DESCRIPTION", 2);

        private static final /* synthetic */ Grid2SkeletonElements[] $values() {
            return new Grid2SkeletonElements[]{IMAGE, SHORT_DESCRIPTION, LONG_DESCRIPTION};
        }

        static {
            Grid2SkeletonElements[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Grid2SkeletonElements(String str, int i11) {
        }

        public static Grid2SkeletonElements valueOf(String str) {
            return (Grid2SkeletonElements) Enum.valueOf(Grid2SkeletonElements.class, str);
        }

        public static Grid2SkeletonElements[] values() {
            return (Grid2SkeletonElements[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Grid2SkeletonElements.values().length];
            try {
                iArr[Grid2SkeletonElements.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Grid2SkeletonElements.LONG_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Grid2SkeletonElements.SHORT_DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid2Skeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new SkeletonCreatorImpl(context);
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        View generateSkeletonView;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((Grid2SkeletonElements) it.next()).ordinal()];
            if (i11 == 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = dp16;
                Unit unit = Unit.f71690a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                generateSkeletonView = generateSkeletonView(12.0f, layoutParams, new Grid2ImageSkeleton(context));
            } else if (i11 == 2) {
                int i12 = dp12;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i12);
                layoutParams2.bottomMargin = i12;
                Unit unit2 = Unit.f71690a;
                generateSkeletonView = SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 8.0f, layoutParams2, null, 4, null);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                generateSkeletonView = SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 8.0f, new LinearLayout.LayoutParams(-1, dp12), null, 4, null);
                generateSkeletonView.setTag(Grid2SkeletonElements.SHORT_DESCRIPTION);
            }
            addView(generateSkeletonView);
        }
    }

    @Override // ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator
    @NotNull
    public View generateSkeletonView(float radius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        return this.$$delegate_0.generateSkeletonView(radius, lp, view);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        for (View view : ViewGroupExtKt.children(this)) {
            if (view.getTag() == Grid2SkeletonElements.SHORT_DESCRIPTION) {
                MeasureExtKt.measureExactly(view, SkeletonCreator.INSTANCE.resolveViewWidth(size, 0.68f), dp12);
            }
        }
    }
}
