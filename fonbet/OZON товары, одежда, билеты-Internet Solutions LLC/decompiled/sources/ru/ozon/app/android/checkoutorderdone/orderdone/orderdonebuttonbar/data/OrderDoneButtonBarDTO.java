package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002+,BI\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JX\u0010#\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isNotSticky", "", "padding", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$PaddingDTO;", "buttonsLayout", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$PaddingDTO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;)V", "getButtons", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPadding", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$PaddingDTO;", "getButtonsLayout", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$PaddingDTO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;", "equals", "other", "hashCode", "", "toString", "", "PaddingDTO", "ButtonsLayout", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDoneButtonBarDTO {
    public static final int $stable = 8;
    private final BadgeDTO badge;

    @NotNull
    private final List<AtomDTO> buttons;
    private final ButtonsLayout buttonsLayout;
    private final Boolean isNotSticky;

    @NotNull
    private final PaddingDTO padding;
    private final TextDTO text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class ButtonsLayout {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsLayout[] $VALUES;
        public static final ButtonsLayout HORIZONTAL = new ButtonsLayout("HORIZONTAL", 0);
        public static final ButtonsLayout VERTICAL = new ButtonsLayout("VERTICAL", 1);

        private static final /* synthetic */ ButtonsLayout[] $values() {
            return new ButtonsLayout[]{HORIZONTAL, VERTICAL};
        }

        static {
            ButtonsLayout[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsLayout(String str, int i11) {
        }

        @NotNull
        public static a<ButtonsLayout> getEntries() {
            return $ENTRIES;
        }

        public static ButtonsLayout valueOf(String str) {
            return (ButtonsLayout) Enum.valueOf(ButtonsLayout.class, str);
        }

        public static ButtonsLayout[] values() {
            return (ButtonsLayout[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$PaddingDTO;", "", "left", "", "top", "right", "bottom", "<init>", "(IIII)V", "getLeft", "()I", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingDTO {
        public static final int $stable = 0;
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public PaddingDTO() {
            this(0, 0, 0, 0, 15, null);
        }

        public static /* synthetic */ PaddingDTO copy$default(PaddingDTO paddingDTO, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = paddingDTO.left;
            }
            if ((i15 & 2) != 0) {
                i12 = paddingDTO.top;
            }
            if ((i15 & 4) != 0) {
                i13 = paddingDTO.right;
            }
            if ((i15 & 8) != 0) {
                i14 = paddingDTO.bottom;
            }
            return paddingDTO.copy(i11, i12, i13, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTop() {
            return this.top;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRight() {
            return this.right;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBottom() {
            return this.bottom;
        }

        @NotNull
        public final PaddingDTO copy(int left, int top, int right, int bottom) {
            return new PaddingDTO(left, top, right, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingDTO)) {
                return false;
            }
            PaddingDTO paddingDTO = (PaddingDTO) other;
            return this.left == paddingDTO.left && this.top == paddingDTO.top && this.right == paddingDTO.right && this.bottom == paddingDTO.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("PaddingDTO(left=", this.left, ", top=", ", right=", this.top));
        }

        public PaddingDTO(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public /* synthetic */ PaddingDTO(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 8 : i12, (i15 & 4) != 0 ? 16 : i13, (i15 & 8) != 0 ? 8 : i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderDoneButtonBarDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "labelButton", type = ButtonDTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonDTO.class), @ProtoOneOfSignature(name = "sbpPaymentButton", type = ButtonV3Atom.PaymentButtonLarge.class), @ProtoOneOfSignature(name = "buttonV3", type = ButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> buttons, BadgeDTO badgeDTO, TextDTO textDTO, Boolean bool, @NotNull PaddingDTO padding, ButtonsLayout buttonsLayout) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.buttons = buttons;
        this.badge = badgeDTO;
        this.text = textDTO;
        this.isNotSticky = bool;
        this.padding = padding;
        this.buttonsLayout = buttonsLayout;
    }

    public static /* synthetic */ OrderDoneButtonBarDTO copy$default(OrderDoneButtonBarDTO orderDoneButtonBarDTO, List list, BadgeDTO badgeDTO, TextDTO textDTO, Boolean bool, PaddingDTO paddingDTO, ButtonsLayout buttonsLayout, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderDoneButtonBarDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = orderDoneButtonBarDTO.badge;
        }
        if ((i11 & 4) != 0) {
            textDTO = orderDoneButtonBarDTO.text;
        }
        if ((i11 & 8) != 0) {
            bool = orderDoneButtonBarDTO.isNotSticky;
        }
        if ((i11 & 16) != 0) {
            paddingDTO = orderDoneButtonBarDTO.padding;
        }
        if ((i11 & 32) != 0) {
            buttonsLayout = orderDoneButtonBarDTO.buttonsLayout;
        }
        PaddingDTO paddingDTO2 = paddingDTO;
        ButtonsLayout buttonsLayout2 = buttonsLayout;
        return orderDoneButtonBarDTO.copy(list, badgeDTO, textDTO, bool, paddingDTO2, buttonsLayout2);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsNotSticky() {
        return this.isNotSticky;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PaddingDTO getPadding() {
        return this.padding;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonsLayout getButtonsLayout() {
        return this.buttonsLayout;
    }

    @NotNull
    public final OrderDoneButtonBarDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "labelButton", type = ButtonDTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonDTO.class), @ProtoOneOfSignature(name = "sbpPaymentButton", type = ButtonV3Atom.PaymentButtonLarge.class), @ProtoOneOfSignature(name = "buttonV3", type = ButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> buttons, BadgeDTO badge, TextDTO text, Boolean isNotSticky, @NotNull PaddingDTO padding, ButtonsLayout buttonsLayout) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(padding, "padding");
        return new OrderDoneButtonBarDTO(buttons, badge, text, isNotSticky, padding, buttonsLayout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDoneButtonBarDTO)) {
            return false;
        }
        OrderDoneButtonBarDTO orderDoneButtonBarDTO = (OrderDoneButtonBarDTO) other;
        return Intrinsics.d(this.buttons, orderDoneButtonBarDTO.buttons) && Intrinsics.d(this.badge, orderDoneButtonBarDTO.badge) && Intrinsics.d(this.text, orderDoneButtonBarDTO.text) && Intrinsics.d(this.isNotSticky, orderDoneButtonBarDTO.isNotSticky) && Intrinsics.d(this.padding, orderDoneButtonBarDTO.padding) && this.buttonsLayout == orderDoneButtonBarDTO.buttonsLayout;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public final ButtonsLayout getButtonsLayout() {
        return this.buttonsLayout;
    }

    @NotNull
    public final PaddingDTO getPadding() {
        return this.padding;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO = this.text;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Boolean bool = this.isNotSticky;
        int hashCode4 = (this.padding.hashCode() + ((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        ButtonsLayout buttonsLayout = this.buttonsLayout;
        return hashCode4 + (buttonsLayout != null ? buttonsLayout.hashCode() : 0);
    }

    public final Boolean isNotSticky() {
        return this.isNotSticky;
    }

    @NotNull
    public String toString() {
        return "OrderDoneButtonBarDTO(buttons=" + this.buttons + ", badge=" + this.badge + ", text=" + this.text + ", isNotSticky=" + this.isNotSticky + ", padding=" + this.padding + ", buttonsLayout=" + this.buttonsLayout + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OrderDoneButtonBarDTO(List list, BadgeDTO badgeDTO, TextDTO textDTO, Boolean bool, PaddingDTO paddingDTO, ButtonsLayout buttonsLayout, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, badgeDTO, textDTO, bool, r13, r14);
        ButtonsLayout buttonsLayout2;
        PaddingDTO paddingDTO2;
        if ((i11 & 16) != 0) {
            buttonsLayout2 = buttonsLayout;
            paddingDTO2 = new PaddingDTO(0, 0, 0, 0, 15, null);
        } else {
            buttonsLayout2 = buttonsLayout;
            paddingDTO2 = paddingDTO;
        }
    }
}
