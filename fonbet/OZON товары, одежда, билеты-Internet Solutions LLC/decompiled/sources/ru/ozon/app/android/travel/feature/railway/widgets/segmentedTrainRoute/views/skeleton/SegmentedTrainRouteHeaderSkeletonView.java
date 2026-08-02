package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views.skeleton;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/skeleton/SegmentedTrainRouteHeaderSkeletonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dp10", "skeleton", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "skeleton2", "skeleton3", "skeleton4", "skeleton5", "setConstraints", "", "createRoundedShimmerView", "width", "height", "radius", "", "(IILjava/lang/Float;)Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteHeaderSkeletonView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable;
    private final int dp10;
    private final int dp2;
    private final int dp8;

    @NotNull
    private final RoundedShimmerView skeleton;

    @NotNull
    private final RoundedShimmerView skeleton2;

    @NotNull
    private final RoundedShimmerView skeleton3;

    @NotNull
    private final RoundedShimmerView skeleton4;

    @NotNull
    private final RoundedShimmerView skeleton5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteHeaderSkeletonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.skeleton = createRoundedShimmerView(ResourceExtKt.toPx(32, context), ResourceExtKt.toPx(32, context), Float.valueOf(ResourceExtKt.toPxF(16, context)));
        this.skeleton2 = createRoundedShimmerView$default(this, ResourceExtKt.toPx(134, context), ResourceExtKt.toPx(16, context), null, 4, null);
        this.skeleton3 = createRoundedShimmerView$default(this, ResourceExtKt.toPx(116, context), ResourceExtKt.toPx(16, context), null, 4, null);
        this.skeleton4 = createRoundedShimmerView$default(this, ResourceExtKt.toPx(132, context), ResourceExtKt.toPx(20, context), null, 4, null);
        this.skeleton5 = createRoundedShimmerView$default(this, ResourceExtKt.toPx(132, context), ResourceExtKt.toPx(20, context), null, 4, null);
        setConstraints();
    }

    private final RoundedShimmerView createRoundedShimmerView(int width, int height, Float radius) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(width, height));
        if (radius != null) {
            roundedShimmerView.setCornerRadius(radius.floatValue());
        }
        addView(roundedShimmerView);
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView createRoundedShimmerView$default(SegmentedTrainRouteHeaderSkeletonView segmentedTrainRouteHeaderSkeletonView, int i11, int i12, Float f7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f7 = null;
        }
        return segmentedTrainRouteHeaderSkeletonView.createRoundedShimmerView(i11, i12, f7);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new SegmentedTrainRouteHeaderSkeletonView$setConstraints$1(this));
    }
}
