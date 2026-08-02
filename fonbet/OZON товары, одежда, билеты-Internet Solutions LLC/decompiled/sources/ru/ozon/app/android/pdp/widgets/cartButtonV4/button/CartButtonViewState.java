package ru.ozon.app.android.pdp.widgets.cartButtonV4.button;

import Ep.a;
import J0.P;
import Kk.C3532b;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001:\u000245Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jl\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;", "icon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "theme", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;", "size", "", "canReusableAppearance", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "priorityColors", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "cartMode", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;", "getIcon", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;", "getSize", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;", "Z", "getCanReusableAppearance", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "getPriorityColors", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "getCartMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "Icon", "Size", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartButtonViewState {
    private final boolean canReusableAppearance;
    private final DoubleCartVO.CartMode cartMode;
    private final Icon icon;
    private final CartButtonV4Dto.ButtonColors priorityColors;

    @NotNull
    private final Size size;
    private final CharSequence subtitle;
    private final ButtonV3Atom.LargeButton.LargeButtonStyle theme;
    private final CharSequence title;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;", "", "", "image", "", "imageTintColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Ljava/lang/Integer;", "getImageTintColor", "()Ljava/lang/Integer;", "getBackgroundColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Icon {
        private final Integer backgroundColor;

        @NotNull
        private final String image;
        private final Integer imageTintColor;

        public Icon(@NotNull String image, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.imageTintColor = num;
            this.backgroundColor = num2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return Intrinsics.d(this.image, icon.image) && Intrinsics.d(this.imageTintColor, icon.imageTintColor) && Intrinsics.d(this.backgroundColor, icon.backgroundColor);
        }

        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Integer getImageTintColor() {
            return this.imageTintColor;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            Integer num = this.imageTintColor;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.backgroundColor;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            Integer num = this.imageTintColor;
            return a.c(P.b("Icon(image=", str, num, ", imageTintColor=", ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIUM", "LARGE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size MEDIUM = new Size("MEDIUM", 0);
        public static final Size LARGE = new Size("LARGE", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{MEDIUM, LARGE};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public CartButtonViewState() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    public static /* synthetic */ CartButtonViewState copy$default(CartButtonViewState cartButtonViewState, CharSequence charSequence, CharSequence charSequence2, Icon icon, ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle, Size size, boolean z11, CartButtonV4Dto.ButtonColors buttonColors, DoubleCartVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = cartButtonViewState.title;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = cartButtonViewState.subtitle;
        }
        if ((i11 & 4) != 0) {
            icon = cartButtonViewState.icon;
        }
        if ((i11 & 8) != 0) {
            largeButtonStyle = cartButtonViewState.theme;
        }
        if ((i11 & 16) != 0) {
            size = cartButtonViewState.size;
        }
        if ((i11 & 32) != 0) {
            z11 = cartButtonViewState.canReusableAppearance;
        }
        if ((i11 & 64) != 0) {
            buttonColors = cartButtonViewState.priorityColors;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cartMode = cartButtonViewState.cartMode;
        }
        CartButtonV4Dto.ButtonColors buttonColors2 = buttonColors;
        DoubleCartVO.CartMode cartMode2 = cartMode;
        Size size2 = size;
        boolean z12 = z11;
        return cartButtonViewState.copy(charSequence, charSequence2, icon, largeButtonStyle, size2, z12, buttonColors2, cartMode2);
    }

    @NotNull
    public final CartButtonViewState copy(CharSequence title, CharSequence subtitle, Icon icon, ButtonV3Atom.LargeButton.LargeButtonStyle theme, @NotNull Size size, boolean canReusableAppearance, CartButtonV4Dto.ButtonColors priorityColors, DoubleCartVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(size, "size");
        return new CartButtonViewState(title, subtitle, icon, theme, size, canReusableAppearance, priorityColors, cartMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonViewState)) {
            return false;
        }
        CartButtonViewState cartButtonViewState = (CartButtonViewState) other;
        return Intrinsics.d(this.title, cartButtonViewState.title) && Intrinsics.d(this.subtitle, cartButtonViewState.subtitle) && Intrinsics.d(this.icon, cartButtonViewState.icon) && this.theme == cartButtonViewState.theme && this.size == cartButtonViewState.size && this.canReusableAppearance == cartButtonViewState.canReusableAppearance && Intrinsics.d(this.priorityColors, cartButtonViewState.priorityColors) && this.cartMode == cartButtonViewState.cartMode;
    }

    public final boolean getCanReusableAppearance() {
        return this.canReusableAppearance;
    }

    public final DoubleCartVO.CartMode getCartMode() {
        return this.cartMode;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final CartButtonV4Dto.ButtonColors getPriorityColors() {
        return this.priorityColors;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final ButtonV3Atom.LargeButton.LargeButtonStyle getTheme() {
        return this.theme;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.subtitle;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle = this.theme;
        int a11 = C3532b.a((this.size.hashCode() + ((hashCode3 + (largeButtonStyle == null ? 0 : largeButtonStyle.hashCode())) * 31)) * 31, 31, this.canReusableAppearance);
        CartButtonV4Dto.ButtonColors buttonColors = this.priorityColors;
        int hashCode4 = (a11 + (buttonColors == null ? 0 : buttonColors.hashCode())) * 31;
        DoubleCartVO.CartMode cartMode = this.cartMode;
        return hashCode4 + (cartMode != null ? cartMode.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.subtitle;
        return "CartButtonViewState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", icon=" + this.icon + ", theme=" + this.theme + ", size=" + this.size + ", canReusableAppearance=" + this.canReusableAppearance + ", priorityColors=" + this.priorityColors + ", cartMode=" + this.cartMode + ")";
    }

    public CartButtonViewState(CharSequence charSequence, CharSequence charSequence2, Icon icon, ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle, @NotNull Size size, boolean z11, CartButtonV4Dto.ButtonColors buttonColors, DoubleCartVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.icon = icon;
        this.theme = largeButtonStyle;
        this.size = size;
        this.canReusableAppearance = z11;
        this.priorityColors = buttonColors;
        this.cartMode = cartMode;
    }

    public /* synthetic */ CartButtonViewState(CharSequence charSequence, CharSequence charSequence2, Icon icon, ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle, Size size, boolean z11, CartButtonV4Dto.ButtonColors buttonColors, DoubleCartVO.CartMode cartMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : charSequence, (i11 & 2) != 0 ? null : charSequence2, (i11 & 4) != 0 ? null : icon, (i11 & 8) != 0 ? null : largeButtonStyle, (i11 & 16) != 0 ? Size.LARGE : size, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : buttonColors, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : cartMode);
    }
}
