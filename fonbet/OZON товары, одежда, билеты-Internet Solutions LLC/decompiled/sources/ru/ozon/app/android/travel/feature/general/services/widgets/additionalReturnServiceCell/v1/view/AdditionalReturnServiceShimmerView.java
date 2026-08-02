package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceShimmerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp4", "dp12", "dp16", "dp20", "dp44", "dp54", "dp55", "dp145", "dp156", "shimmerRadius", "", "borderColor", "borderWidth", "borderRadius", "icon", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "badge", "subtitle", "rightBlockIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "content", "setupConstraint", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceShimmerView extends ConstraintLayout {
    public static final int $stable;

    @NotNull
    private final RoundedShimmerView badge;
    private final int borderColor;
    private final float borderRadius;
    private final int borderWidth;

    @NotNull
    private final RoundedShimmerView content;
    private final int dp12;
    private final int dp145;
    private final int dp156;
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp4;
    private final int dp44;
    private final int dp54;
    private final int dp55;

    @NotNull
    private final RoundedShimmerView icon;

    @NotNull
    private final IconView rightBlockIcon;
    private final float shimmerRadius;

    @NotNull
    private final RoundedShimmerView subtitle;

    @NotNull
    private final RoundedShimmerView title;

    static {
        int i11 = RoundedShimmerView.$stable;
        $stable = i11 | IconView.$stable | i11 | i11 | i11 | i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        int px4 = ResourceExtKt.toPx(20, context);
        this.dp20 = px4;
        int px5 = ResourceExtKt.toPx(44, context);
        this.dp44 = px5;
        int px6 = ResourceExtKt.toPx(54, context);
        this.dp54 = px6;
        int px7 = ResourceExtKt.toPx(55, context);
        this.dp55 = px7;
        int px8 = ResourceExtKt.toPx(145, context);
        this.dp145 = px8;
        int px9 = ResourceExtKt.toPx(156, context);
        this.dp156 = px9;
        float f7 = px2;
        this.shimmerRadius = f7;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        this.borderColor = themeColor;
        this.borderWidth = px;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.borderRadius = pxF;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(R$id.additionalReturnServiceShimmerIcon);
        roundedShimmerView.setCornerRadius(f7);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px5, px5));
        addView(roundedShimmerView);
        this.icon = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(R$id.additionalReturnServiceShimmerTitle);
        roundedShimmerView2.setCornerRadius(f7);
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px8, px4));
        addView(roundedShimmerView2);
        this.title = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(R$id.additionalReturnServiceShimmerBadge);
        roundedShimmerView3.setCornerRadius(f7);
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px6, px3));
        addView(roundedShimmerView3);
        this.badge = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(R$id.additionalReturnServiceShimmerSubtitle);
        roundedShimmerView4.setCornerRadius(f7);
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(px9, px4));
        addView(roundedShimmerView4);
        this.subtitle = roundedShimmerView4;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.additionalReturnServiceShimmerRightBlock);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        IconHolderKt.bind$default(iconView, new IconDTO(null, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_chevron_right_filled", UniColors.GRAPHIC_NEUTRAL.getToken()), null, null, null, null, null, null, null, null, null, null, null, 65515, null), null, 2, null);
        addView(iconView);
        this.rightBlockIcon = iconView;
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView5.setId(R$id.additionalReturnServiceShimmerContent);
        roundedShimmerView5.setCornerRadius(f7);
        roundedShimmerView5.setLayoutParams(new ConstraintLayout.b(0, px7));
        addView(roundedShimmerView5);
        this.content = roundedShimmerView5;
        ViewExtKt.updatePadding(this, px3, px3, px3, px3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(px, themeColor);
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
        setupConstraint();
    }

    private final void setupConstraint() {
        ConstraintLayoutExtKt.updateConstraints(this, new AdditionalReturnServiceShimmerView$setupConstraint$1(this));
    }
}
