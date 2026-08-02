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
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u001f B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid3Skeleton;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "radius", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroid/view/View;", "view", "generateSkeletonView", "(FLandroid/view/ViewGroup$LayoutParams;Landroid/view/View;)Landroid/view/View;", "Ljava/util/ArrayList;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid3Skeleton$Grid3SkeletonElements;", "Lkotlin/collections/ArrayList;", "elements", "Ljava/util/ArrayList;", "imageBottomMargin", "I", "descriptionBottomMargin", "Companion", "Grid3SkeletonElements", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Grid3Skeleton extends LinearLayout implements SkeletonCreator {
    private final /* synthetic */ SkeletonCreatorImpl $$delegate_0;
    private final int descriptionBottomMargin;

    @NotNull
    private final ArrayList<Grid3SkeletonElements> elements;
    private final int imageBottomMargin;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid3Skeleton$Companion;", "", "<init>", "()V", "SHORT_DESCRIPTION_WIDTH_MULTIPLIER", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid3Skeleton$Grid3SkeletonElements;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "SHORT_DESCRIPTION", "LONG_DESCRIPTION", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Grid3SkeletonElements {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Grid3SkeletonElements[] $VALUES;
        public static final Grid3SkeletonElements IMAGE = new Grid3SkeletonElements("IMAGE", 0);
        public static final Grid3SkeletonElements SHORT_DESCRIPTION = new Grid3SkeletonElements("SHORT_DESCRIPTION", 1);
        public static final Grid3SkeletonElements LONG_DESCRIPTION = new Grid3SkeletonElements("LONG_DESCRIPTION", 2);

        private static final /* synthetic */ Grid3SkeletonElements[] $values() {
            return new Grid3SkeletonElements[]{IMAGE, SHORT_DESCRIPTION, LONG_DESCRIPTION};
        }

        static {
            Grid3SkeletonElements[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Grid3SkeletonElements(String str, int i11) {
        }

        public static Grid3SkeletonElements valueOf(String str) {
            return (Grid3SkeletonElements) Enum.valueOf(Grid3SkeletonElements.class, str);
        }

        public static Grid3SkeletonElements[] values() {
            return (Grid3SkeletonElements[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Grid3SkeletonElements.values().length];
            try {
                iArr[Grid3SkeletonElements.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Grid3SkeletonElements.LONG_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Grid3SkeletonElements.SHORT_DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid3Skeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new SkeletonCreatorImpl(context);
        this.elements = C7714v.t(Grid3SkeletonElements.IMAGE, Grid3SkeletonElements.LONG_DESCRIPTION, Grid3SkeletonElements.SHORT_DESCRIPTION);
        this.imageBottomMargin = UiExtKt.toPx(16);
        this.descriptionBottomMargin = UiExtKt.toPx(12);
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        View generateSkeletonView;
        Iterator<T> it = this.elements.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((Grid3SkeletonElements) it.next()).ordinal()];
            if (i11 == 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = this.imageBottomMargin;
                Unit unit = Unit.f71690a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                generateSkeletonView = generateSkeletonView(12.0f, layoutParams, new Grid3ImageSkeleton(context));
            } else if (i11 == 2) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.descriptionBottomMargin);
                layoutParams2.bottomMargin = this.descriptionBottomMargin;
                Unit unit2 = Unit.f71690a;
                generateSkeletonView = SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 8.0f, layoutParams2, null, 4, null);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                generateSkeletonView = SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 8.0f, new LinearLayout.LayoutParams(-1, this.descriptionBottomMargin), null, 4, null);
                generateSkeletonView.setTag(Grid3SkeletonElements.SHORT_DESCRIPTION);
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
            if (view.getTag() == Grid3SkeletonElements.SHORT_DESCRIPTION) {
                view.measure(View.MeasureSpec.makeMeasureSpec(SkeletonCreator.INSTANCE.resolveViewWidth(size, 0.68f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.descriptionBottomMargin, 1073741824));
            }
        }
    }
}
