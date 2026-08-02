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
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeLiteralRowShimmerViewV2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp16", "", "dp24", "dp28", "dpF8", "", "dpF20", "backgroundColor", "setUp", "", "addChildren", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeLiteralRowShimmerViewV2 extends FrameLayout {
    private final int backgroundColor;
    private final int dp16;
    private final int dp24;
    private final int dp28;
    private final float dpF20;
    private final float dpF8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeLiteralRowShimmerViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = UiExtKt.toPx(16, context);
        this.dp24 = UiExtKt.toPx(24, context);
        this.dp28 = UiExtKt.toPx(28, context);
        this.dpF8 = ResourceExtKt.toPxF(8, context);
        this.dpF20 = ResourceExtKt.toPxF(20, context);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        setUp();
        addChildren();
    }

    private final void addChildren() {
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = this.dp24;
            addView(ShimmerViewExtensionV2Kt.createShimmerView$default(this, i13, i13, Float.valueOf(this.dpF8), 0, i11, 0, 0, 104, null));
            i11 += this.dp24 + this.dp28;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = this.dp24;
            addView(ShimmerViewExtensionV2Kt.createShimmerView$default(this, i16, i16, Float.valueOf(this.dpF8), 8388613, 0, i14, 0, 80, null));
            i14 += this.dp24 + this.dp28;
        }
    }

    private final void setUp() {
        int i11 = this.dp16;
        setPadding(i11, i11, i11, 0);
        int i12 = this.backgroundColor;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        float f7 = this.dpF20;
        setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, i12, f7, f7, 0.0f, 0.0f, 24, null));
    }
}
