package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp10", "dp12", "dp16", "color", "checkboxShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "titleShimmerView", "subtitleShimmerView", "setUp", "", "addChildren", "setConstraints", "createTextShimmerView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionLoadingView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable;

    @NotNull
    private final RoundedShimmerView checkboxShimmerView;
    private final int color;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp4;

    @NotNull
    private final RoundedShimmerView subtitleShimmerView;

    @NotNull
    private final RoundedShimmerView titleShimmerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionLoadingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgPrimary);
        this.color = themeColor;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setCornerRadius(ResourceExtKt.toPxF(6, context));
        roundedShimmerView.setShimmerBackgroundColor(themeColor);
        int px = ResourceExtKt.toPx(20, context);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px, px));
        this.checkboxShimmerView = roundedShimmerView;
        this.titleShimmerView = createTextShimmerView();
        this.subtitleShimmerView = createTextShimmerView();
        setUp();
        addChildren();
        setConstraints();
    }

    private final void addChildren() {
        addView(this.checkboxShimmerView);
        addView(this.titleShimmerView);
        addView(this.subtitleShimmerView);
    }

    private final RoundedShimmerView createTextShimmerView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        Context context2 = roundedShimmerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        roundedShimmerView.setCornerRadius(ResourceExtKt.toPxF(4, context2));
        roundedShimmerView.setShimmerBackgroundColor(this.color);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(0, this.dp16));
        return roundedShimmerView;
    }

    private final void setConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new NotificationSubscriptionLoadingView$setConstraints$1(this));
    }

    private final void setUp() {
        int i11 = this.dp16;
        int i12 = this.dp12;
        setPadding(i11, i12, i11, i12);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
