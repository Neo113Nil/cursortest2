package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data;

import Fj.c;
import G.g;
import N3.C3660k;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniGradient;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001f B7\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO;", "", "leftButtons", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButtons", "buttonsColors", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$ButtonsColors;", "background", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$WidgetBackground;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$ButtonsColors;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$WidgetBackground;)V", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "getButtonsColors", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$ButtonsColors;", "getBackground", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$WidgetBackground;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonsColors", "WidgetBackground", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderNavBarDTO {
    public static final int $stable = 8;

    @NotNull
    private final WidgetBackground background;

    @NotNull
    private final ButtonsColors buttonsColors;

    @NotNull
    private final List<IconButtonV3DTO> leftButtons;

    @NotNull
    private final List<IconButtonV3DTO> rightButtons;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$ButtonsColors;", "", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "", "collapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpanded", "()Ljava/lang/String;", "getCollapsed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsColors {
        public static final int $stable = 0;

        @NotNull
        private final String collapsed;

        @NotNull
        private final String expanded;

        public ButtonsColors(@NotNull String expanded, @NotNull String collapsed) {
            Intrinsics.checkNotNullParameter(expanded, "expanded");
            Intrinsics.checkNotNullParameter(collapsed, "collapsed");
            this.expanded = expanded;
            this.collapsed = collapsed;
        }

        public static /* synthetic */ ButtonsColors copy$default(ButtonsColors buttonsColors, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonsColors.expanded;
            }
            if ((i11 & 2) != 0) {
                str2 = buttonsColors.collapsed;
            }
            return buttonsColors.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getExpanded() {
            return this.expanded;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCollapsed() {
            return this.collapsed;
        }

        @NotNull
        public final ButtonsColors copy(@NotNull String expanded, @NotNull String collapsed) {
            Intrinsics.checkNotNullParameter(expanded, "expanded");
            Intrinsics.checkNotNullParameter(collapsed, "collapsed");
            return new ButtonsColors(expanded, collapsed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsColors)) {
                return false;
            }
            ButtonsColors buttonsColors = (ButtonsColors) other;
            return Intrinsics.d(this.expanded, buttonsColors.expanded) && Intrinsics.d(this.collapsed, buttonsColors.collapsed);
        }

        @NotNull
        public final String getCollapsed() {
            return this.collapsed;
        }

        @NotNull
        public final String getExpanded() {
            return this.expanded;
        }

        public int hashCode() {
            return this.collapsed.hashCode() + (this.expanded.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ButtonsColors(expanded=", this.expanded, ", collapsed=", this.collapsed, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$WidgetBackground;", "", "image", "", "backgroundToken", "customGradient", "Lru/ozon/uni/core/UniGradient;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;)V", "getImage", "()Ljava/lang/String;", "getBackgroundToken", "getCustomGradient", "()Lru/ozon/uni/core/UniGradient;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetBackground {
        public static final int $stable = UniGradient.$stable;
        private final String backgroundToken;
        private final UniGradient customGradient;
        private final String image;

        public WidgetBackground(String str, String str2, UniGradient uniGradient) {
            this.image = str;
            this.backgroundToken = str2;
            this.customGradient = uniGradient;
        }

        public static /* synthetic */ WidgetBackground copy$default(WidgetBackground widgetBackground, String str, String str2, UniGradient uniGradient, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = widgetBackground.image;
            }
            if ((i11 & 2) != 0) {
                str2 = widgetBackground.backgroundToken;
            }
            if ((i11 & 4) != 0) {
                uniGradient = widgetBackground.customGradient;
            }
            return widgetBackground.copy(str, str2, uniGradient);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundToken() {
            return this.backgroundToken;
        }

        /* renamed from: component3, reason: from getter */
        public final UniGradient getCustomGradient() {
            return this.customGradient;
        }

        @NotNull
        public final WidgetBackground copy(String image, String backgroundToken, UniGradient customGradient) {
            return new WidgetBackground(image, backgroundToken, customGradient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetBackground)) {
                return false;
            }
            WidgetBackground widgetBackground = (WidgetBackground) other;
            return Intrinsics.d(this.image, widgetBackground.image) && Intrinsics.d(this.backgroundToken, widgetBackground.backgroundToken) && Intrinsics.d(this.customGradient, widgetBackground.customGradient);
        }

        public final String getBackgroundToken() {
            return this.backgroundToken;
        }

        public final UniGradient getCustomGradient() {
            return this.customGradient;
        }

        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniGradient uniGradient = this.customGradient;
            return hashCode2 + (uniGradient != null ? uniGradient.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.backgroundToken;
            UniGradient uniGradient = this.customGradient;
            StringBuilder d11 = C3660k.d("WidgetBackground(image=", str, ", backgroundToken=", str2, ", customGradient=");
            d11.append(uniGradient);
            d11.append(")");
            return d11.toString();
        }
    }

    public OrderNavBarDTO(@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class) @NotNull @ProtoOneOf(label = "type") List<IconButtonV3DTO> leftButtons, @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class) @NotNull @ProtoOneOf(label = "type") List<IconButtonV3DTO> rightButtons, @NotNull ButtonsColors buttonsColors, @NotNull WidgetBackground background) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        Intrinsics.checkNotNullParameter(buttonsColors, "buttonsColors");
        Intrinsics.checkNotNullParameter(background, "background");
        this.leftButtons = leftButtons;
        this.rightButtons = rightButtons;
        this.buttonsColors = buttonsColors;
        this.background = background;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderNavBarDTO copy$default(OrderNavBarDTO orderNavBarDTO, List list, List list2, ButtonsColors buttonsColors, WidgetBackground widgetBackground, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderNavBarDTO.leftButtons;
        }
        if ((i11 & 2) != 0) {
            list2 = orderNavBarDTO.rightButtons;
        }
        if ((i11 & 4) != 0) {
            buttonsColors = orderNavBarDTO.buttonsColors;
        }
        if ((i11 & 8) != 0) {
            widgetBackground = orderNavBarDTO.background;
        }
        return orderNavBarDTO.copy(list, list2, buttonsColors, widgetBackground);
    }

    @NotNull
    public final List<IconButtonV3DTO> component1() {
        return this.leftButtons;
    }

    @NotNull
    public final List<IconButtonV3DTO> component2() {
        return this.rightButtons;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonsColors getButtonsColors() {
        return this.buttonsColors;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WidgetBackground getBackground() {
        return this.background;
    }

    @NotNull
    public final OrderNavBarDTO copy(@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class) @NotNull @ProtoOneOf(label = "type") List<IconButtonV3DTO> leftButtons, @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class) @NotNull @ProtoOneOf(label = "type") List<IconButtonV3DTO> rightButtons, @NotNull ButtonsColors buttonsColors, @NotNull WidgetBackground background) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        Intrinsics.checkNotNullParameter(buttonsColors, "buttonsColors");
        Intrinsics.checkNotNullParameter(background, "background");
        return new OrderNavBarDTO(leftButtons, rightButtons, buttonsColors, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderNavBarDTO)) {
            return false;
        }
        OrderNavBarDTO orderNavBarDTO = (OrderNavBarDTO) other;
        return Intrinsics.d(this.leftButtons, orderNavBarDTO.leftButtons) && Intrinsics.d(this.rightButtons, orderNavBarDTO.rightButtons) && Intrinsics.d(this.buttonsColors, orderNavBarDTO.buttonsColors) && Intrinsics.d(this.background, orderNavBarDTO.background);
    }

    @NotNull
    public final WidgetBackground getBackground() {
        return this.background;
    }

    @NotNull
    public final ButtonsColors getButtonsColors() {
        return this.buttonsColors;
    }

    @NotNull
    public final List<IconButtonV3DTO> getLeftButtons() {
        return this.leftButtons;
    }

    @NotNull
    public final List<IconButtonV3DTO> getRightButtons() {
        return this.rightButtons;
    }

    public int hashCode() {
        return this.background.hashCode() + ((this.buttonsColors.hashCode() + g.b(this.leftButtons.hashCode() * 31, 31, this.rightButtons)) * 31);
    }

    @NotNull
    public String toString() {
        List<IconButtonV3DTO> list = this.leftButtons;
        List<IconButtonV3DTO> list2 = this.rightButtons;
        ButtonsColors buttonsColors = this.buttonsColors;
        WidgetBackground widgetBackground = this.background;
        StringBuilder d11 = c.d("OrderNavBarDTO(leftButtons=", list, ", rightButtons=", ", buttonsColors=", list2);
        d11.append(buttonsColors);
        d11.append(", background=");
        d11.append(widgetBackground);
        d11.append(")");
        return d11.toString();
    }

    public OrderNavBarDTO(List list, List list2, ButtonsColors buttonsColors, WidgetBackground widgetBackground, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2, buttonsColors, widgetBackground);
    }
}
