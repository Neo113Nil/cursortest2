package ru.ozon.app.android.search.widgets.searchbar.shimmer.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreatorImpl;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/DoubleSkeleton;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "radius", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroid/view/View;", "view", "generateSkeletonView", "(FLandroid/view/ViewGroup$LayoutParams;Landroid/view/View;)Landroid/view/View;", "dp20", "I", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleSkeleton extends FrameLayout implements SkeletonCreator {
    private final /* synthetic */ SkeletonCreatorImpl $$delegate_0;
    private final int dp20;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/DoubleSkeleton$Companion;", "", "<init>", "()V", "WIDTH_MULTIPLIER", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSkeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new SkeletonCreatorImpl(context);
        this.dp20 = UiExtKt.toPx(20);
        addViews();
    }

    private final void addViews() {
        int i11 = 0;
        while (i11 < 2) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.dp20);
            layoutParams.gravity = i11 == 0 ? 8388611 : 8388613;
            Unit unit = Unit.f71690a;
            View generateSkeletonView$default = SkeletonCreator.DefaultImpls.generateSkeletonView$default(this, 6.0f, layoutParams, null, 4, null);
            generateSkeletonView$default.setTag(SkeletonElement.Double.INSTANCE);
            addView(generateSkeletonView$default);
            i11++;
        }
    }

    @Override // ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator
    @NotNull
    public View generateSkeletonView(float radius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        return this.$$delegate_0.generateSkeletonView(radius, lp, view);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int resolveViewWidth = SkeletonCreator.INSTANCE.resolveViewWidth(View.MeasureSpec.getSize(widthMeasureSpec), 0.2f);
        for (View view : ViewGroupExtKt.children(this)) {
            if (Intrinsics.d(view.getTag(), SkeletonElement.Double.INSTANCE)) {
                view.measure(View.MeasureSpec.makeMeasureSpec(resolveViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.dp20, 1073741824));
            }
        }
    }
}
