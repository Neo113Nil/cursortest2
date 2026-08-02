package ru.ozon.app.android.pdp.widgets.cartButtonV4.button;

import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.content.res.j;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.core.widget.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonV4Binding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButtonViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0012\u0010+\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020\u0007H\u0002J\f\u0010-\u001a\u00020\u0007*\u00020.H\u0003J\u001e\u0010/\u001a\u00020\u0016*\u0002002\b\b\u0001\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020!H\u0002J\u0018\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "viewState", "getViewState", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "setViewState", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;)V", "minTextSizeRegular", "minTextSizeIconified", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonV4Binding;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setEnabled", "enabled", "", "bindInternal", "setupPaddings", "hasIcon", "setupMargins", "size", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;", "setupTextAlignment", "setupAnimation", "shouldAnimateTransition", "oldState", "newState", "setupAppearance", "setupIcon", "icon", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;", "readTextSizeFromStyle", "styleResId", "toStyleRes", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "setupAutoSizingIfNeeded", "Landroid/widget/TextView;", "minTextSize", "buttonSize", "getTitleTextStyle", "style", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButton extends ConstraintLayout {

    @NotNull
    private final WidgetCartbuttonV4Binding binding;
    private final int minTextSizeIconified;
    private final int minTextSizeRegular;
    private CartButtonViewState viewState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.LargeButton.LargeButtonStyle.values().length];
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_WHITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_DELETE_WHITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_GREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_EXPRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_FRESH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_WHITE_FRESH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindInternal(CartButtonViewState viewState) {
        setupMargins(viewState.getSize());
        setupTextAlignment(CartButtonViewStateKt.getHasIcon(viewState), viewState.getSize());
        setupAnimation(viewState);
        setupAppearance(viewState);
        setupPaddings(CartButtonViewStateKt.getHasIcon(viewState));
        setupIcon(viewState.getIcon());
        WidgetCartbuttonV4Binding widgetCartbuttonV4Binding = this.binding;
        CartButtonV4Dto.ButtonColors priorityColors = viewState.getPriorityColors();
        if (priorityColors != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, priorityColors.getTitleColor());
            if (parseColor != null) {
                widgetCartbuttonV4Binding.btnTitleTv.setTextColor(parseColor.intValue());
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, priorityColors.getSubtitleColor());
            if (parseColor2 != null) {
                widgetCartbuttonV4Binding.btnSubtitleTv.setTextColor(parseColor2.intValue());
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser.parseColor(context3, priorityColors.getBackgroundColor());
            if (parseColor3 != null) {
                setBackgroundTintList(ColorStateList.valueOf(parseColor3.intValue()));
            }
        }
        widgetCartbuttonV4Binding.btnTitleTv.setText(viewState.getTitle());
        TextView btnSubtitleTv = widgetCartbuttonV4Binding.btnSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(btnSubtitleTv, "btnSubtitleTv");
        TextViewExtKt.setTextOrGone(btnSubtitleTv, viewState.getSubtitle());
    }

    private final int getTitleTextStyle(CartButtonViewState.Size style, boolean hasIcon) {
        return (style == CartButtonViewState.Size.MEDIUM && hasIcon) ? R$style.TextStyle_Body_M_Bold : R$style.TextStyle_Body_L_Bold;
    }

    private final int readTextSizeFromStyle(int styleResId) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(styleResId, new int[]{R.attr.textSize});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int b11 = j.b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return b11;
    }

    private final void setupAnimation(CartButtonViewState viewState) {
        setLayoutTransition(new CartButtonSubtitleLayoutTransition(0L, new CartButton$setupAnimation$1(this, viewState), 1, null));
    }

    private final void setupAppearance(CartButtonViewState viewState) {
        if (viewState.getCanReusableAppearance()) {
            return;
        }
        StyleAppearance of2 = StyleAppearance.INSTANCE.of(new CartButtonAppearance(getTitleTextStyle(viewState.getSize(), CartButtonViewStateKt.getHasIcon(viewState))));
        if (viewState.getCartMode() == DoubleCartVO.CartMode.IN_CART) {
            setBackground(a.getDrawable(getContext(), R$drawable.cart_button_button_primary_green));
        }
        ButtonV3Atom.LargeButton.LargeButtonStyle theme = viewState.getTheme();
        if (theme != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            of2.read(context, toStyleRes(theme));
        }
        of2.apply(this);
    }

    private final void setupAutoSizingIfNeeded(TextView textView, int i11, CartButtonViewState.Size size) {
        if (size == CartButtonViewState.Size.MEDIUM) {
            k.c(textView);
            return;
        }
        int textSize = (int) textView.getTextSize();
        Integer valueOf = Integer.valueOf(textSize);
        if (textSize <= i11) {
            valueOf = null;
        }
        if (valueOf != null) {
            k.b(textView, i11, valueOf.intValue(), 0);
        }
    }

    private final void setupIcon(CartButtonViewState.Icon icon) {
        ImageView imageView = this.binding.btnIconIv;
        if (icon != null) {
            Intrinsics.f(imageView);
            ViewExtKt.loadIcon$default(imageView, icon.getImage(), null, null, 6, null);
            ThemeExtKt.tint(imageView, icon.getImageTintColor());
            if (icon.getBackgroundColor() == null) {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.clearBackgroundTint(imageView);
            } else {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setBackgroundTint(imageView, icon.getBackgroundColor().intValue());
            }
        }
        Intrinsics.f(imageView);
        imageView.setVisibility(icon == null ? 8 : 0);
    }

    private final void setupMargins(CartButtonViewState.Size size) {
        ViewGroup.LayoutParams layoutParams = this.binding.btnSubtitleTv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = size == CartButtonViewState.Size.MEDIUM ? 0 : Dimens.INSTANCE.getDP_2();
    }

    private final void setupPaddings(boolean hasIcon) {
        int dp_12 = hasIcon ? Dimens.INSTANCE.getDP_12() : Dimens.INSTANCE.getDP_16();
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(this, dp_12, 0, dp_12, 0, 10, null);
    }

    private final void setupTextAlignment(boolean hasIcon, CartButtonViewState.Size size) {
        int i11;
        WidgetCartbuttonV4Binding widgetCartbuttonV4Binding = this.binding;
        if (hasIcon) {
            TextView btnTitleTv = widgetCartbuttonV4Binding.btnTitleTv;
            Intrinsics.checkNotNullExpressionValue(btnTitleTv, "btnTitleTv");
            setupAutoSizingIfNeeded(btnTitleTv, this.minTextSizeIconified, size);
            i11 = 5;
        } else {
            TextView btnTitleTv2 = widgetCartbuttonV4Binding.btnTitleTv;
            Intrinsics.checkNotNullExpressionValue(btnTitleTv2, "btnTitleTv");
            setupAutoSizingIfNeeded(btnTitleTv2, this.minTextSizeRegular, size);
            i11 = 4;
        }
        widgetCartbuttonV4Binding.btnTitleTv.setTextAlignment(i11);
        widgetCartbuttonV4Binding.btnSubtitleTv.setTextAlignment(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAnimateTransition(CartButtonViewState oldState, CartButtonViewState newState) {
        return oldState != null && oldState.getSubtitle() == null && newState.getSubtitle() != null && oldState.getTheme() == newState.getTheme();
    }

    private final int toStyleRes(ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle) {
        switch (WhenMappings.$EnumSwitchMapping$0[largeButtonStyle.ordinal()]) {
            case 1:
                return ru.ozon.app.android.pdp.R$style.CartButton_Primary;
            case 2:
                return ru.ozon.app.android.pdp.R$style.CartButton_Primary;
            case 3:
                return ru.ozon.app.android.pdp.R$style.CartButton_Secondary;
            case 4:
                return ru.ozon.app.android.pdp.R$style.CartButton_Tertiary;
            case 5:
                return ru.ozon.app.android.pdp.R$style.CartButton_Secondary_Confirmed;
            case 6:
                return ru.ozon.app.android.pdp.R$style.CartButton_Danger;
            case 7:
                return ru.ozon.app.android.pdp.R$style.CartButton_Important;
            case 8:
                return ru.ozon.app.android.pdp.R$style.CartButton_Primary_Green;
            case 9:
                return ru.ozon.app.android.pdp.R$style.CartButton_Primary_Express;
            case 10:
                return ru.ozon.app.android.pdp.R$style.CartButton_Primary_Fresh;
            case 11:
                return ru.ozon.app.android.pdp.R$style.CartButton_Secondary_Fresh;
            case 12:
                return ru.ozon.app.android.pdp.R$style.CartButton_Tertiary_Fresh;
            default:
                throw new o();
        }
    }

    public final CartButtonViewState getViewState() {
        return this.viewState;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            CartButtonViewState cartButtonViewState = this.viewState;
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((cartButtonViewState != null ? cartButtonViewState.getSize() : null) == CartButtonViewState.Size.MEDIUM ? Dimens.INSTANCE.getDP_52() : Dimens.INSTANCE.getDP_56(), 1073741824));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ((View) c5314e0.next()).setEnabled(enabled);
            }
        }
    }

    public final void setViewState(CartButtonViewState cartButtonViewState) {
        if (cartButtonViewState != null) {
            CartButtonViewState cartButtonViewState2 = !cartButtonViewState.equals(this.viewState) ? cartButtonViewState : null;
            if (cartButtonViewState2 != null) {
                ButtonV3Atom.LargeButton.LargeButtonStyle theme = cartButtonViewState2.getTheme();
                CartButtonViewState cartButtonViewState3 = this.viewState;
                if (theme == (cartButtonViewState3 != null ? cartButtonViewState3.getTheme() : null)) {
                    cartButtonViewState2 = CartButtonViewState.copy$default(cartButtonViewState2, null, null, null, null, null, true, null, null, 223, null);
                }
                bindInternal(cartButtonViewState2);
            }
        }
        this.viewState = cartButtonViewState;
    }

    public /* synthetic */ CartButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButton(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetCartbuttonV4Binding inflate = WidgetCartbuttonV4Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(this, 0, dimens.getDP_8(), 0, dimens.getDP_8(), 5, null);
        this.minTextSizeRegular = readTextSizeFromStyle(R$style.TextStyle_Body_M);
        this.minTextSizeIconified = readTextSizeFromStyle(R$style.TextStyle_Caption);
    }
}
