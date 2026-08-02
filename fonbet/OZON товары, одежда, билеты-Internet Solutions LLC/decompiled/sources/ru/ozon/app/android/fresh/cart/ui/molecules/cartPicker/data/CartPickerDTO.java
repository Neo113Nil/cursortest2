package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data;

import Am.C2438a;
import B0.C2454a;
import B4.V;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$Edition;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u000545678B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003Je\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "", "quantityTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "quantity", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "decrementIcon", "", "incrementIcon", "size", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "sizingPriority", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "styleType", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "customStyle", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;)V", "getQuantityTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getQuantity", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "getDecrementIcon", "()Ljava/lang/String;", "getIncrementIcon", "getSize", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "getSizingPriority", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "getStyleType", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "getCustomStyle", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "QuantityControl", "CustomStyle", "Sizes", "Sizings", "StyleTypes", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartPickerDTO {
    public static final int $stable = 8;

    @NotNull
    private final CustomStyle customStyle;

    @NotNull
    private final String decrementIcon;

    @NotNull
    private final String incrementIcon;

    @NotNull
    private final QuantityControl quantity;

    @NotNull
    private final TextDTO quantityTitle;

    @NotNull
    private final Sizes size;

    @NotNull
    private final Sizings sizingPriority;

    @NotNull
    private final StyleTypes styleType;
    private final TextDTO subtitle;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "", "backgroundColor", "", "buttonBackgroundColor", "clickedButtonBackgroundColor", "iconColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getButtonBackgroundColor", "getClickedButtonBackgroundColor", "getIconColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String buttonBackgroundColor;

        @NotNull
        private final String clickedButtonBackgroundColor;

        @NotNull
        private final String iconColor;

        public CustomStyle() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customStyle.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customStyle.buttonBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                str3 = customStyle.clickedButtonBackgroundColor;
            }
            if ((i11 & 8) != 0) {
                str4 = customStyle.iconColor;
            }
            return customStyle.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getClickedButtonBackgroundColor() {
            return this.clickedButtonBackgroundColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final CustomStyle copy(@NotNull String backgroundColor, @NotNull String buttonBackgroundColor, @NotNull String clickedButtonBackgroundColor, @NotNull String iconColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(buttonBackgroundColor, "buttonBackgroundColor");
            Intrinsics.checkNotNullParameter(clickedButtonBackgroundColor, "clickedButtonBackgroundColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            return new CustomStyle(backgroundColor, buttonBackgroundColor, clickedButtonBackgroundColor, iconColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomStyle)) {
                return false;
            }
            CustomStyle customStyle = (CustomStyle) other;
            return Intrinsics.d(this.backgroundColor, customStyle.backgroundColor) && Intrinsics.d(this.buttonBackgroundColor, customStyle.buttonBackgroundColor) && Intrinsics.d(this.clickedButtonBackgroundColor, customStyle.clickedButtonBackgroundColor) && Intrinsics.d(this.iconColor, customStyle.iconColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        @NotNull
        public final String getClickedButtonBackgroundColor() {
            return this.clickedButtonBackgroundColor;
        }

        @NotNull
        public final String getIconColor() {
            return this.iconColor;
        }

        public int hashCode() {
            return this.iconColor.hashCode() + g.a(g.a(this.backgroundColor.hashCode() * 31, 31, this.buttonBackgroundColor), 31, this.clickedButtonBackgroundColor);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.buttonBackgroundColor;
            return C3173b.c(C3660k.d("CustomStyle(backgroundColor=", str, ", buttonBackgroundColor=", str2, ", clickedButtonBackgroundColor="), this.clickedButtonBackgroundColor, ", iconColor=", this.iconColor, ")");
        }

        public CustomStyle(@NotNull String backgroundColor, @NotNull String buttonBackgroundColor, @NotNull String clickedButtonBackgroundColor, @NotNull String iconColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(buttonBackgroundColor, "buttonBackgroundColor");
            Intrinsics.checkNotNullParameter(clickedButtonBackgroundColor, "clickedButtonBackgroundColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            this.backgroundColor = backgroundColor;
            this.buttonBackgroundColor = buttonBackgroundColor;
            this.clickedButtonBackgroundColor = clickedButtonBackgroundColor;
            this.iconColor = iconColor;
        }

        public /* synthetic */ CustomStyle(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UniColors.BG_SECONDARY.getToken() : str, (i11 & 2) != 0 ? UniColors.CLEAR_LIGHT_KEY_0.getToken() : str2, (i11 & 4) != 0 ? UniColors.BG_SECONDARY.getToken() : str3, (i11 & 8) != 0 ? UniColors.GRAPHIC_PRIMARY.getToken() : str4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "", "params", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;)V", "getParams", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "SIZE_400", "SIZE_500", "SIZE_600", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Sizes[] $VALUES;
        public static final Sizes SIZE_400 = new Sizes("SIZE_400", 0, IconButtonV3DTO.Sizes.SIZE_400);
        public static final Sizes SIZE_500 = new Sizes("SIZE_500", 1, IconButtonV3DTO.Sizes.SIZE_500);
        public static final Sizes SIZE_600 = new Sizes("SIZE_600", 2, IconButtonV3DTO.Sizes.SIZE_600);

        @NotNull
        private final IconButtonV3DTO.Sizes params;

        private static final /* synthetic */ Sizes[] $values() {
            return new Sizes[]{SIZE_400, SIZE_500, SIZE_600};
        }

        static {
            Sizes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Sizes(String str, int i11, IconButtonV3DTO.Sizes sizes) {
            this.params = sizes;
        }

        public static Sizes valueOf(String str) {
            return (Sizes) Enum.valueOf(Sizes.class, str);
        }

        public static Sizes[] values() {
            return (Sizes[]) $VALUES.clone();
        }

        @NotNull
        public final IconButtonV3DTO.Sizes getParams() {
            return this.params;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "", "<init>", "(Ljava/lang/String;I)V", "SIZING_HUG", "SIZING_FILL", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizings {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Sizings[] $VALUES;
        public static final Sizings SIZING_HUG = new Sizings("SIZING_HUG", 0);
        public static final Sizings SIZING_FILL = new Sizings("SIZING_FILL", 1);

        private static final /* synthetic */ Sizings[] $values() {
            return new Sizings[]{SIZING_HUG, SIZING_FILL};
        }

        static {
            Sizings[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Sizings(String str, int i11) {
        }

        public static Sizings valueOf(String str) {
            return (Sizings) Enum.valueOf(Sizings.class, str);
        }

        public static Sizings[] values() {
            return (Sizings[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "", "<init>", "(Ljava/lang/String;I)V", "BASED", "CUSTOM", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleTypes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleTypes[] $VALUES;
        public static final StyleTypes BASED = new StyleTypes("BASED", 0);
        public static final StyleTypes CUSTOM = new StyleTypes("CUSTOM", 1);

        private static final /* synthetic */ StyleTypes[] $values() {
            return new StyleTypes[]{BASED, CUSTOM};
        }

        static {
            StyleTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleTypes(String str, int i11) {
        }

        public static StyleTypes valueOf(String str) {
            return (StyleTypes) Enum.valueOf(StyleTypes.class, str);
        }

        public static StyleTypes[] values() {
            return (StyleTypes[]) $VALUES.clone();
        }
    }

    public CartPickerDTO(@NotNull TextDTO quantityTitle, TextDTO textDTO, @NotNull QuantityControl quantity, @NotNull String decrementIcon, @NotNull String incrementIcon, @NotNull Sizes size, @NotNull Sizings sizingPriority, @NotNull StyleTypes styleType, @NotNull CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(quantityTitle, "quantityTitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(decrementIcon, "decrementIcon");
        Intrinsics.checkNotNullParameter(incrementIcon, "incrementIcon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(sizingPriority, "sizingPriority");
        Intrinsics.checkNotNullParameter(styleType, "styleType");
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        this.quantityTitle = quantityTitle;
        this.subtitle = textDTO;
        this.quantity = quantity;
        this.decrementIcon = decrementIcon;
        this.incrementIcon = incrementIcon;
        this.size = size;
        this.sizingPriority = sizingPriority;
        this.styleType = styleType;
        this.customStyle = customStyle;
    }

    public static /* synthetic */ CartPickerDTO copy$default(CartPickerDTO cartPickerDTO, TextDTO textDTO, TextDTO textDTO2, QuantityControl quantityControl, String str, String str2, Sizes sizes, Sizings sizings, StyleTypes styleTypes, CustomStyle customStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = cartPickerDTO.quantityTitle;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = cartPickerDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            quantityControl = cartPickerDTO.quantity;
        }
        if ((i11 & 8) != 0) {
            str = cartPickerDTO.decrementIcon;
        }
        if ((i11 & 16) != 0) {
            str2 = cartPickerDTO.incrementIcon;
        }
        if ((i11 & 32) != 0) {
            sizes = cartPickerDTO.size;
        }
        if ((i11 & 64) != 0) {
            sizings = cartPickerDTO.sizingPriority;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            styleTypes = cartPickerDTO.styleType;
        }
        if ((i11 & 256) != 0) {
            customStyle = cartPickerDTO.customStyle;
        }
        StyleTypes styleTypes2 = styleTypes;
        CustomStyle customStyle2 = customStyle;
        Sizes sizes2 = sizes;
        Sizings sizings2 = sizings;
        String str3 = str2;
        QuantityControl quantityControl2 = quantityControl;
        return cartPickerDTO.copy(textDTO, textDTO2, quantityControl2, str, str3, sizes2, sizings2, styleTypes2, customStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getQuantityTitle() {
        return this.quantityTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final QuantityControl getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDecrementIcon() {
        return this.decrementIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getIncrementIcon() {
        return this.incrementIcon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Sizes getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Sizings getSizingPriority() {
        return this.sizingPriority;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final StyleTypes getStyleType() {
        return this.styleType;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final CartPickerDTO copy(@NotNull TextDTO quantityTitle, TextDTO subtitle, @NotNull QuantityControl quantity, @NotNull String decrementIcon, @NotNull String incrementIcon, @NotNull Sizes size, @NotNull Sizings sizingPriority, @NotNull StyleTypes styleType, @NotNull CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(quantityTitle, "quantityTitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(decrementIcon, "decrementIcon");
        Intrinsics.checkNotNullParameter(incrementIcon, "incrementIcon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(sizingPriority, "sizingPriority");
        Intrinsics.checkNotNullParameter(styleType, "styleType");
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        return new CartPickerDTO(quantityTitle, subtitle, quantity, decrementIcon, incrementIcon, size, sizingPriority, styleType, customStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartPickerDTO)) {
            return false;
        }
        CartPickerDTO cartPickerDTO = (CartPickerDTO) other;
        return Intrinsics.d(this.quantityTitle, cartPickerDTO.quantityTitle) && Intrinsics.d(this.subtitle, cartPickerDTO.subtitle) && Intrinsics.d(this.quantity, cartPickerDTO.quantity) && Intrinsics.d(this.decrementIcon, cartPickerDTO.decrementIcon) && Intrinsics.d(this.incrementIcon, cartPickerDTO.incrementIcon) && this.size == cartPickerDTO.size && this.sizingPriority == cartPickerDTO.sizingPriority && this.styleType == cartPickerDTO.styleType && Intrinsics.d(this.customStyle, cartPickerDTO.customStyle);
    }

    @NotNull
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final String getDecrementIcon() {
        return this.decrementIcon;
    }

    @NotNull
    public final String getIncrementIcon() {
        return this.incrementIcon;
    }

    @NotNull
    public final QuantityControl getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final TextDTO getQuantityTitle() {
        return this.quantityTitle;
    }

    @NotNull
    public final Sizes getSize() {
        return this.size;
    }

    @NotNull
    public final Sizings getSizingPriority() {
        return this.sizingPriority;
    }

    @NotNull
    public final StyleTypes getStyleType() {
        return this.styleType;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int hashCode = this.quantityTitle.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        return this.customStyle.hashCode() + ((this.styleType.hashCode() + ((this.sizingPriority.hashCode() + ((this.size.hashCode() + g.a(g.a((this.quantity.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31, this.decrementIcon), 31, this.incrementIcon)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.quantityTitle;
        TextDTO textDTO2 = this.subtitle;
        QuantityControl quantityControl = this.quantity;
        String str = this.decrementIcon;
        String str2 = this.incrementIcon;
        Sizes sizes = this.size;
        Sizings sizings = this.sizingPriority;
        StyleTypes styleTypes = this.styleType;
        CustomStyle customStyle = this.customStyle;
        StringBuilder g10 = D3.g.g("CartPickerDTO(quantityTitle=", textDTO, ", subtitle=", textDTO2, ", quantity=");
        g10.append(quantityControl);
        g10.append(", decrementIcon=");
        g10.append(str);
        g10.append(", incrementIcon=");
        g10.append(str2);
        g10.append(", size=");
        g10.append(sizes);
        g10.append(", sizingPriority=");
        g10.append(sizings);
        g10.append(", styleType=");
        g10.append(styleTypes);
        g10.append(", customStyle=");
        g10.append(customStyle);
        g10.append(")");
        return g10.toString();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002&'BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "minValue", "maxValue", "multiplicity", "quantSize", "changeQuantityAction", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "decrementRemoveAction", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;", "<init>", "(IIIIILru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;)V", "getValue", "()I", "getMinValue", "getMaxValue", "getMultiplicity", "getQuantSize", "getChangeQuantityAction", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "getDecrementRemoveAction", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "ChangeQuantity", "DecrementRemove", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class QuantityControl {
        public static final int $stable = 8;

        @NotNull
        private final ChangeQuantity changeQuantityAction;

        @NotNull
        private final DecrementRemove decrementRemoveAction;
        private final int maxValue;
        private final int minValue;
        private final int multiplicity;
        private final int quantSize;
        private final int value;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DecrementRemove {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO action;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public DecrementRemove(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DecrementRemove copy$default(DecrementRemove decrementRemove, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    atomActionDTO = decrementRemove.action;
                }
                if ((i11 & 2) != 0) {
                    map = decrementRemove.trackingInfo;
                }
                return decrementRemove.copy(atomActionDTO, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component2() {
                return this.trackingInfo;
            }

            @NotNull
            public final DecrementRemove copy(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new DecrementRemove(action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DecrementRemove)) {
                    return false;
                }
                DecrementRemove decrementRemove = (DecrementRemove) other;
                return Intrinsics.d(this.action, decrementRemove.action) && Intrinsics.d(this.trackingInfo, decrementRemove.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.action.hashCode() * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                return "DecrementRemove(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
            }
        }

        public QuantityControl(int i11, int i12, int i13, int i14, int i15, @NotNull ChangeQuantity changeQuantityAction, @NotNull DecrementRemove decrementRemoveAction) {
            Intrinsics.checkNotNullParameter(changeQuantityAction, "changeQuantityAction");
            Intrinsics.checkNotNullParameter(decrementRemoveAction, "decrementRemoveAction");
            this.value = i11;
            this.minValue = i12;
            this.maxValue = i13;
            this.multiplicity = i14;
            this.quantSize = i15;
            this.changeQuantityAction = changeQuantityAction;
            this.decrementRemoveAction = decrementRemoveAction;
        }

        public static /* synthetic */ QuantityControl copy$default(QuantityControl quantityControl, int i11, int i12, int i13, int i14, int i15, ChangeQuantity changeQuantity, DecrementRemove decrementRemove, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i11 = quantityControl.value;
            }
            if ((i16 & 2) != 0) {
                i12 = quantityControl.minValue;
            }
            if ((i16 & 4) != 0) {
                i13 = quantityControl.maxValue;
            }
            if ((i16 & 8) != 0) {
                i14 = quantityControl.multiplicity;
            }
            if ((i16 & 16) != 0) {
                i15 = quantityControl.quantSize;
            }
            if ((i16 & 32) != 0) {
                changeQuantity = quantityControl.changeQuantityAction;
            }
            if ((i16 & 64) != 0) {
                decrementRemove = quantityControl.decrementRemoveAction;
            }
            ChangeQuantity changeQuantity2 = changeQuantity;
            DecrementRemove decrementRemove2 = decrementRemove;
            int i17 = i15;
            int i18 = i13;
            return quantityControl.copy(i11, i12, i18, i14, i17, changeQuantity2, decrementRemove2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMultiplicity() {
            return this.multiplicity;
        }

        /* renamed from: component5, reason: from getter */
        public final int getQuantSize() {
            return this.quantSize;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ChangeQuantity getChangeQuantityAction() {
            return this.changeQuantityAction;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final DecrementRemove getDecrementRemoveAction() {
            return this.decrementRemoveAction;
        }

        @NotNull
        public final QuantityControl copy(int value, int minValue, int maxValue, int multiplicity, int quantSize, @NotNull ChangeQuantity changeQuantityAction, @NotNull DecrementRemove decrementRemoveAction) {
            Intrinsics.checkNotNullParameter(changeQuantityAction, "changeQuantityAction");
            Intrinsics.checkNotNullParameter(decrementRemoveAction, "decrementRemoveAction");
            return new QuantityControl(value, minValue, maxValue, multiplicity, quantSize, changeQuantityAction, decrementRemoveAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityControl)) {
                return false;
            }
            QuantityControl quantityControl = (QuantityControl) other;
            return this.value == quantityControl.value && this.minValue == quantityControl.minValue && this.maxValue == quantityControl.maxValue && this.multiplicity == quantityControl.multiplicity && this.quantSize == quantityControl.quantSize && Intrinsics.d(this.changeQuantityAction, quantityControl.changeQuantityAction) && Intrinsics.d(this.decrementRemoveAction, quantityControl.decrementRemoveAction);
        }

        @NotNull
        public final ChangeQuantity getChangeQuantityAction() {
            return this.changeQuantityAction;
        }

        @NotNull
        public final DecrementRemove getDecrementRemoveAction() {
            return this.decrementRemoveAction;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        public final int getMultiplicity() {
            return this.multiplicity;
        }

        public final int getQuantSize() {
            return this.quantSize;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.decrementRemoveAction.hashCode() + ((this.changeQuantityAction.hashCode() + C2454a.a(this.quantSize, C2454a.a(this.multiplicity, C2454a.a(this.maxValue, C2454a.a(this.minValue, Integer.hashCode(this.value) * 31, 31), 31), 31), 31)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.value;
            int i12 = this.minValue;
            int i13 = this.maxValue;
            int i14 = this.multiplicity;
            int i15 = this.quantSize;
            ChangeQuantity changeQuantity = this.changeQuantityAction;
            DecrementRemove decrementRemove = this.decrementRemoveAction;
            StringBuilder a11 = C2438a.a("QuantityControl(value=", i11, ", minValue=", ", maxValue=", i12);
            Ek.a.f(i13, i14, ", multiplicity=", ", quantSize=", a11);
            a11.append(i15);
            a11.append(", changeQuantityAction=");
            a11.append(changeQuantity);
            a11.append(", decrementRemoveAction=");
            a11.append(decrementRemove);
            a11.append(")");
            return a11.toString();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "", "changeValueAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "changeValueDebounceDelay", "", "incrementTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "decrementTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;FLjava/util/Map;Ljava/util/Map;)V", "getChangeValueAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getChangeValueDebounceDelay", "()F", "getIncrementTrackingInfo", "()Ljava/util/Map;", "getDecrementTrackingInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeQuantity {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO changeValueAction;
            private final float changeValueDebounceDelay;
            private final Map<String, TokenizedTrackingInfo> decrementTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> incrementTrackingInfo;

            public ChangeQuantity(@NotNull AtomActionDTO changeValueAction, float f7, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
                Intrinsics.checkNotNullParameter(changeValueAction, "changeValueAction");
                this.changeValueAction = changeValueAction;
                this.changeValueDebounceDelay = f7;
                this.incrementTrackingInfo = map;
                this.decrementTrackingInfo = map2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ChangeQuantity copy$default(ChangeQuantity changeQuantity, AtomActionDTO atomActionDTO, float f7, Map map, Map map2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    atomActionDTO = changeQuantity.changeValueAction;
                }
                if ((i11 & 2) != 0) {
                    f7 = changeQuantity.changeValueDebounceDelay;
                }
                if ((i11 & 4) != 0) {
                    map = changeQuantity.incrementTrackingInfo;
                }
                if ((i11 & 8) != 0) {
                    map2 = changeQuantity.decrementTrackingInfo;
                }
                return changeQuantity.copy(atomActionDTO, f7, map, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final AtomActionDTO getChangeValueAction() {
                return this.changeValueAction;
            }

            /* renamed from: component2, reason: from getter */
            public final float getChangeValueDebounceDelay() {
                return this.changeValueDebounceDelay;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.incrementTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.decrementTrackingInfo;
            }

            @NotNull
            public final ChangeQuantity copy(@NotNull AtomActionDTO changeValueAction, float changeValueDebounceDelay, Map<String, TokenizedTrackingInfo> incrementTrackingInfo, Map<String, TokenizedTrackingInfo> decrementTrackingInfo) {
                Intrinsics.checkNotNullParameter(changeValueAction, "changeValueAction");
                return new ChangeQuantity(changeValueAction, changeValueDebounceDelay, incrementTrackingInfo, decrementTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChangeQuantity)) {
                    return false;
                }
                ChangeQuantity changeQuantity = (ChangeQuantity) other;
                return Intrinsics.d(this.changeValueAction, changeQuantity.changeValueAction) && Float.compare(this.changeValueDebounceDelay, changeQuantity.changeValueDebounceDelay) == 0 && Intrinsics.d(this.incrementTrackingInfo, changeQuantity.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, changeQuantity.decrementTrackingInfo);
            }

            @NotNull
            public final AtomActionDTO getChangeValueAction() {
                return this.changeValueAction;
            }

            public final float getChangeValueDebounceDelay() {
                return this.changeValueDebounceDelay;
            }

            public final Map<String, TokenizedTrackingInfo> getDecrementTrackingInfo() {
                return this.decrementTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getIncrementTrackingInfo() {
                return this.incrementTrackingInfo;
            }

            public int hashCode() {
                int a11 = Pk0.b.a(this.changeValueDebounceDelay, this.changeValueAction.hashCode() * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                return hashCode + (map2 != null ? map2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                AtomActionDTO atomActionDTO = this.changeValueAction;
                float f7 = this.changeValueDebounceDelay;
                Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                StringBuilder sb2 = new StringBuilder("ChangeQuantity(changeValueAction=");
                sb2.append(atomActionDTO);
                sb2.append(", changeValueDebounceDelay=");
                sb2.append(f7);
                sb2.append(", incrementTrackingInfo=");
                return V.c(sb2, map, ", decrementTrackingInfo=", map2, ")");
            }

            public /* synthetic */ ChangeQuantity(AtomActionDTO atomActionDTO, float f7, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(atomActionDTO, (i11 & 2) != 0 ? 0.0f : f7, map, map2);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ QuantityControl(int i11, int i12, int i13, int i14, int i15, ChangeQuantity changeQuantity, DecrementRemove decrementRemove, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, i12, i13, i14, r8, r9, r10);
            DecrementRemove decrementRemove2;
            ChangeQuantity changeQuantity2;
            int i17;
            i11 = (i16 & 1) != 0 ? 1 : i11;
            i12 = (i16 & 2) != 0 ? 0 : i12;
            i13 = (i16 & 4) != 0 ? DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE : i13;
            i14 = (i16 & 8) != 0 ? 1 : i14;
            if ((i16 & 16) != 0) {
                decrementRemove2 = decrementRemove;
                changeQuantity2 = changeQuantity;
                i17 = 0;
            } else {
                decrementRemove2 = decrementRemove;
                changeQuantity2 = changeQuantity;
                i17 = i15;
            }
        }
    }

    public /* synthetic */ CartPickerDTO(TextDTO textDTO, TextDTO textDTO2, QuantityControl quantityControl, String str, String str2, Sizes sizes, Sizings sizings, StyleTypes styleTypes, CustomStyle customStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, quantityControl, (i11 & 8) != 0 ? "ic_m_minus_filled" : str, (i11 & 16) != 0 ? "ic_m_plus_sign_filled" : str2, (i11 & 32) != 0 ? Sizes.SIZE_400 : sizes, (i11 & 64) != 0 ? Sizings.SIZING_HUG : sizings, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? StyleTypes.BASED : styleTypes, (i11 & 256) != 0 ? new CustomStyle(null, null, null, null, 15, null) : customStyle);
    }
}
