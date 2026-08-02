package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.view;

import Bi.b;
import De.C2860c;
import Im.a;
import Kk.C3531a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.ServicePackageSelectionVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001e\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020%H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/view/ServicePackageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dp4", "", "dp8", "dp12", "dp32", "cornersGradient", "", "cornersPaint", StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR, "discountBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "gradientBackground", "Landroid/graphics/drawable/GradientDrawable;", "paintBackground", "Landroid/graphics/drawable/PaintDrawable;", "layerDrawable", "ru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/view/ServicePackageView$layerDrawable$1", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/view/ServicePackageView$layerDrawable$1;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO$PackageTabVO;", "setupConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackageView extends ConstraintLayout {
    private final float cornersGradient;
    private final float cornersPaint;

    @NotNull
    private final BadgeView discountBadgeView;
    private final int dp12;
    private final int dp32;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final GradientDrawable gradientBackground;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final ServicePackageView$layerDrawable$1 layerDrawable;
    private final int layerFloor1;

    @NotNull
    private final PaintDrawable paintBackground;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final TextAtomV2View titleView;

    public /* synthetic */ ServicePackageView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new ServicePackageView$setupConstraints$1(this));
    }

    public final void bind(@NotNull ServicePackageSelectionVO.PackageTabVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bind$default(this.iconView, item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.priceView, item.getPrice(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.discountBadgeView, item.getDiscountBadge(), (Function1) null, 2, (Object) null);
        item.getStrokeColor().applyTo(this.gradientBackground);
        this.layerDrawable.setLayerInset(1, item.getStrokeThickness(), item.getStrokeThickness(), item.getStrokeThickness(), item.getStrokeThickness());
        this.layerDrawable.updateBounds();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = UiExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = UiExtKt.toPx(12, context);
        this.dp12 = px3;
        int px4 = UiExtKt.toPx(32, context);
        this.dp32 = px4;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.cornersGradient = pxF;
        float pxF2 = ResourceExtKt.toPxF(15, context);
        this.cornersPaint = pxF2;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.layerFloor1 = themeColor;
        q qVar = q.f64554a;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        a.c(badgeView, R$id.servicePackageSelectionDiscountBadge, -2, -2);
        this.discountBadgeView = badgeView;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.servicePackageSelectionIcon, px4, px4);
        a11.setMargins(0, px2, 0, 0);
        iconView.setLayoutParams(a11);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.servicePackageSelectionTitle, -2, -2);
        d11.setMargins(0, px, 0, 0);
        d11.f41599F = 0.0f;
        d11.f41616W = true;
        textAtomV2View.setClickable(false);
        textAtomV2View.setFocusable(false);
        textAtomV2View.setLayoutParams(d11);
        this.titleView = textAtomV2View;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.servicePackageSelectionPrice, -2, -2);
        b11.setMargins(0, px, 0, 0);
        b11.f41616W = true;
        priceAtomView.setLayoutParams(b11);
        this.priceView = priceAtomView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(pxF);
        this.gradientBackground = gradientDrawable;
        PaintDrawable paintDrawable = new PaintDrawable(themeColor);
        setBackgroundColor(themeColor);
        paintDrawable.setCornerRadius(pxF2);
        this.paintBackground = paintDrawable;
        ServicePackageView$layerDrawable$1 servicePackageView$layerDrawable$1 = new ServicePackageView$layerDrawable$1(new Drawable[]{gradientDrawable, paintDrawable});
        this.layerDrawable = servicePackageView$layerDrawable$1;
        setClipChildren(false);
        setClipToPadding(false);
        setBackground(servicePackageView$layerDrawable$1);
        setPadding(px3, 0, px3, px2);
        addView(iconView);
        addView(textAtomV2View);
        addView(priceAtomView);
        addView(badgeView);
        setupConstraints();
    }
}
