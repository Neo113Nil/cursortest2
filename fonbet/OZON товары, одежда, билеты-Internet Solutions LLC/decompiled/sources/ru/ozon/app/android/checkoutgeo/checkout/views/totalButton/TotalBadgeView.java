package ru.ozon.app.android.checkoutgeo.checkout.views.totalButton;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalBadgeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultBgColor", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtextView", "bind", "", "badge", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$Badge;", "isSelectApp", "", "bindOrGone", "bindIconView", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "setupBackground", "color", "", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalBadgeView extends LinearLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private final int defaultBgColor;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View subtextView;

    @NotNull
    private final TextAtomV2View textView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_4 = ResourceExtKt.toPx(4);
    private static final int DP_6 = ResourceExtKt.toPx(6);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_24 = ResourceExtKt.toPx(24);
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(8);
    private static final float CORNER_RADIUS_SELECT = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalBadgeView$Companion;", "", "<init>", "()V", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TotalBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindIconView(CommonAtomIconDTO icon) {
        IconHolderKt.bindOrGone$default(this.iconView, icon != null ? new IconDTO(IconDTO.IconSize.SIZE_400, Boolean.FALSE, null, null, icon, null, null, null, null, null, null, null, null, null, null, null, 65516, null) : null, null, 2, null);
    }

    private final void setupBackground(String color, boolean isSelectApp) {
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : this.defaultBgColor);
        if (isSelectApp) {
            float cornerRadius = gradientDrawable.getCornerRadius();
            float f7 = CORNER_RADIUS_SELECT;
            if (cornerRadius == f7) {
                return;
            }
            gradientDrawable.setCornerRadius(f7);
        }
    }

    public final void bind(@NotNull TotalButtonDTO.Badge badge, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        setupBackground(badge.getBackgroundColor(), isSelectApp);
        TextHolderKt.bindOrGone$default(this.textView, badge.getText(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtextView, badge.getSubtext(), null, 2, null);
        bindIconView(badge.getIcon());
    }

    public final void bindOrGone(TotalButtonDTO.Badge badge, boolean isSelectApp) {
        if (badge == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(badge, isSelectApp);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBgColor = context.getColor(R$color.clear_light_key_300);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(CORNER_RADIUS);
        this.backgroundDrawable = gradientDrawable;
        IconView iconView = new IconView(context, null, 0, 6, null);
        int i12 = DP_24;
        iconView.setLayoutParams(new LinearLayout.LayoutParams(i12, i12));
        addView(iconView);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(DP_6);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i13 = DP_4;
        layoutParams2.setMarginStart(i13);
        textAtomV2View2.setLayoutParams(layoutParams2);
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtextView = textAtomV2View2;
        setOrientation(0);
        setGravity(16);
        setBackground(gradientDrawable);
        int i14 = DP_8;
        setPadding(i14, i13, i14, i13);
    }
}
