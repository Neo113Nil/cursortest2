package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.shimmer;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeExitRowShimmerViewV2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "dp32", "dp148", "backgroundColor", "radius", "", "setUp", "", "addChildren", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeExitRowShimmerViewV2 extends FrameLayout {
    private final int backgroundColor;
    private final int dp148;
    private final int dp32;
    private final int dp4;
    private final int dp8;
    private final float radius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeExitRowShimmerViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        this.dp148 = ResourceExtKt.toPx(148, context);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.radius = ResourceExtKt.toPxF(8, context);
        setUp();
        addChildren();
    }

    private final void addChildren() {
        addView(ShimmerViewExtensionV2Kt.createShimmerView$default(this, this.dp148, this.dp32, Float.valueOf(this.radius), 0, 0, 0, 0, 120, null));
        addView(ShimmerViewExtensionV2Kt.createShimmerView$default(this, this.dp148, this.dp32, Float.valueOf(this.radius), 8388661, 0, 0, 0, 112, null));
    }

    private final void setUp() {
        int i11 = this.dp8;
        setPadding(i11, i11, i11, this.dp4);
        setBackgroundColor(this.backgroundColor);
    }
}
