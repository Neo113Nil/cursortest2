package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "selectButtonLbv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getSelectButtonLbv", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "returnButtonLbv", "getReturnButtonLbv", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursMealStickyBottomView extends LinearLayout {
    public static final int $stable = LargeButtonView.$stable;

    @NotNull
    private final LargeButtonView returnButtonLbv;

    @NotNull
    private final LargeButtonView selectButtonLbv;

    public /* synthetic */ ToursMealStickyBottomView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final LargeButtonView getReturnButtonLbv() {
        return this.returnButtonLbv;
    }

    @NotNull
    public final LargeButtonView getSelectButtonLbv() {
        return this.selectButtonLbv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursMealStickyBottomView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        this.selectButtonLbv = largeButtonView;
        LargeButtonView largeButtonView2 = new LargeButtonView(context, null, 0, 0, 14, null);
        this.returnButtonLbv = largeButtonView2;
        setOrientation(1);
        int px = ResourceExtKt.toPx(16, context);
        setPadding(px, px, px, px);
        float pxF = ResourceExtKt.toPxF(20, context);
        setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f, 24, null));
        addView(largeButtonView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(8, context);
        Unit unit = Unit.f71690a;
        addView(largeButtonView2, layoutParams);
    }
}
