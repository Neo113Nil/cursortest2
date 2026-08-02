package ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 '2\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016J>\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J,\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010&\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "bind", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "isFavorite", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateColorsByScroll", "alpha", "", "iconStartColor", "", "iconEndColor", "bgStartColor", "bgEndColor", "updateContentDescription", "getButtonView", "getIconButtonView", "generateIconColor", "startColor", "endColor", "generateBGColor", "Companion", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SisBrandFavoriteButtonView extends FrameLayout {
    private ButtonV3View buttonView;
    private IconButtonV3View iconButtonView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SisBrandFavoriteButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int generateBGColor(String startColor, String endColor, float alpha) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, startColor, R.color.transparent);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return c.b(alpha, styleParser.parseColor(context2, endColor, R.color.transparent), parseColor);
    }

    private final int generateIconColor(boolean isFavorite, String startColor, String endColor, float alpha) {
        int resId = (isFavorite ? UniColors.GRAPHIC_ACCENT_PRIMARY : UniColors.GRAPHIC_TERTIARY).getResId();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, startColor, resId);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return c.b(alpha, styleParser.parseColor(context2, endColor, resId), parseColor);
    }

    private final ButtonV3View getButtonView() {
        ButtonV3View buttonV3View = this.buttonView;
        IconButtonV3View iconButtonV3View = this.iconButtonView;
        if (iconButtonV3View != null) {
            ViewExtKt.gone(iconButtonV3View);
        }
        if (buttonV3View != null) {
            ViewExtKt.show(buttonV3View);
            return buttonV3View;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View2 = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(buttonV3View2);
        this.buttonView = buttonV3View2;
        return buttonV3View2;
    }

    private final IconButtonV3View getIconButtonView() {
        IconButtonV3View iconButtonV3View = this.iconButtonView;
        ButtonV3View buttonV3View = this.buttonView;
        if (buttonV3View != null) {
            ViewExtKt.gone(buttonV3View);
        }
        if (iconButtonV3View != null) {
            ViewExtKt.show(iconButtonV3View);
            return iconButtonV3View;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(iconButtonV3View2);
        this.iconButtonView = iconButtonV3View2;
        return iconButtonV3View2;
    }

    public final void bind(@NotNull ButtonsDTO button, boolean isFavorite, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (button instanceof ButtonV3DTO) {
            ButtonV3HolderKt.bind(getButtonView(), (ButtonV3DTO) button, actionHandler);
        } else if (button instanceof IconButtonV3DTO) {
            IconButtonV3HolderKt.bind(getIconButtonView(), (IconButtonV3DTO) button, actionHandler);
        }
        updateContentDescription(isFavorite);
    }

    public final void updateColorsByScroll(float alpha, boolean isFavorite, String iconStartColor, String iconEndColor, String bgStartColor, String bgEndColor) {
        float f7 = alpha <= 0.6f ? 0.0f : alpha;
        IconButtonV3View iconButtonV3View = this.iconButtonView;
        if (iconButtonV3View != null) {
            iconButtonV3View.setIconColor(generateIconColor(isFavorite, iconStartColor, iconEndColor, f7));
        }
        IconButtonV3View iconButtonV3View2 = this.iconButtonView;
        if (iconButtonV3View2 != null) {
            iconButtonV3View2.setBackColor(new Color.Solid(generateBGColor(bgStartColor, bgEndColor, alpha)));
        }
    }

    public final void updateContentDescription(boolean isFavorite) {
        setContentDescription(isFavorite ? "favoriteLike" : "favoriteDislike");
    }

    public /* synthetic */ SisBrandFavoriteButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SisBrandFavoriteButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
