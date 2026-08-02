package ru.ozon.app.android.search.widgets.searchbar.shimmer.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreatorImpl;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/FlexboxRowSkeleton;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "", "elementsWidthMultiplier", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/List;)V", "", "addViews", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "radius", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroid/view/View;", "view", "generateSkeletonView", "(FLandroid/view/ViewGroup$LayoutParams;Landroid/view/View;)Landroid/view/View;", "Ljava/util/List;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FlexboxRowSkeleton extends LinearLayout implements SkeletonCreator {
    private final /* synthetic */ SkeletonCreatorImpl $$delegate_0;

    @NotNull
    private final List<Float> elementsWidthMultiplier;
    public static final int $stable = 8;
    private static final int VIEW_HEIGHT = UiExtKt.toPx(32);
    private static final int PADDING = UiExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexboxRowSkeleton(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull List<Float> elementsWidthMultiplier) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(elementsWidthMultiplier, "elementsWidthMultiplier");
        this.$$delegate_0 = new SkeletonCreatorImpl(context);
        this.elementsWidthMultiplier = elementsWidthMultiplier;
        setOrientation(0);
        addViews();
    }

    private final void addViews() {
        int size = this.elementsWidthMultiplier.size();
        for (int i11 = 0; i11 < size; i11++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, VIEW_HEIGHT);
            int i12 = PADDING;
            layoutParams.setMarginEnd(i12);
            layoutParams.bottomMargin = i12;
            Unit unit = Unit.f71690a;
            View generateSkeletonView$default = SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 8.0f, layoutParams, null, 4, null);
            generateSkeletonView$default.setTag(SkeletonElement.Flexbox3.INSTANCE);
            addView(generateSkeletonView$default);
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
        int i11 = 0;
        for (View view : ViewGroupExtKt.children(this)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view2 = view;
            int resolveViewWidth = SkeletonCreator.INSTANCE.resolveViewWidth(View.MeasureSpec.getSize(widthMeasureSpec), this.elementsWidthMultiplier.get(i11).floatValue());
            if (Intrinsics.d(view2.getTag(), SkeletonElement.Flexbox3.INSTANCE)) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(resolveViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(VIEW_HEIGHT, 1073741824));
            }
            i11 = i12;
        }
    }

    public FlexboxRowSkeleton(Context context, AttributeSet attributeSet, int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? K.f71697a : list);
    }
}
