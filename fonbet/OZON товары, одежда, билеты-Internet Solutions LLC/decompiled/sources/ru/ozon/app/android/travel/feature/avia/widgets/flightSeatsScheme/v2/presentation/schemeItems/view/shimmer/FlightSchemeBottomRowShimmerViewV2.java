package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.shimmer;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeBottomRowShimmerViewV2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "dp16", "dp32", "dp148", "backgroundColor", "dpF8", "", "dpF20", "setUp", "", "addChildren", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeBottomRowShimmerViewV2 extends FrameLayout {
    private final int backgroundColor;
    private final int dp148;
    private final int dp16;
    private final int dp32;
    private final int dp4;
    private final int dp8;
    private final float dpF20;
    private final float dpF8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeBottomRowShimmerViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        this.dp148 = ResourceExtKt.toPx(148, context);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.dpF8 = ResourceExtKt.toPxF(8, context);
        this.dpF20 = ResourceExtKt.toPxF(20, context);
        setUp();
        addChildren();
    }

    private final void addChildren() {
        addView(ShimmerViewExtensionV2Kt.createShimmerView$default(this, this.dp148, this.dp32, Float.valueOf(this.dpF8), 0, 0, 0, 0, 120, null));
        addView(ShimmerViewExtensionV2Kt.createShimmerView$default(this, this.dp148, this.dp32, Float.valueOf(this.dpF8), 8388661, 0, 0, 0, 112, null));
    }

    private final void setUp() {
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        int i11 = this.backgroundColor;
        float f7 = this.dpF20;
        setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, i11, 0.0f, 0.0f, f7, f7, 6, null));
        int i12 = this.dp8;
        setPadding(i12, this.dp4, i12, this.dp16);
    }
}
