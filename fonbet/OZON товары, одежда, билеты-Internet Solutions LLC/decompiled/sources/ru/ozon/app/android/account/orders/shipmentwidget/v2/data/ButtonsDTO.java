package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ButtonsDTO;", "", "buttons", "", "horizontalPadding", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "getButtons", "()Ljava/util/List;", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TextButtonDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonsDTO {
    public static final int $stable = 8;
    private final List<Object> buttons;

    @NotNull
    private final HorizontalPadding horizontalPadding;

    public ButtonsDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = TextButtonDTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.buttons = list;
        this.horizontalPadding = horizontalPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonsDTO copy$default(ButtonsDTO buttonsDTO, List list, HorizontalPadding horizontalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = buttonsDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            horizontalPadding = buttonsDTO.horizontalPadding;
        }
        return buttonsDTO.copy(list, horizontalPadding);
    }

    public final List<Object> component1() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final ButtonsDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = TextButtonDTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> buttons, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        return new ButtonsDTO(buttons, horizontalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsDTO)) {
            return false;
        }
        ButtonsDTO buttonsDTO = (ButtonsDTO) other;
        return Intrinsics.d(this.buttons, buttonsDTO.buttons) && Intrinsics.d(this.horizontalPadding, buttonsDTO.horizontalPadding);
    }

    public final List<Object> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public int hashCode() {
        List<Object> list = this.buttons;
        return this.horizontalPadding.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ButtonsDTO(buttons=" + this.buttons + ", horizontalPadding=" + this.horizontalPadding + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ButtonsDTO$TextButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "isFullWidth", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextButtonDTO {
        public static final int $stable = 0;

        @NotNull
        private final ButtonV3DTO button;
        private final boolean isFullWidth;

        public TextButtonDTO(@NotNull ButtonV3DTO button, boolean z11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.isFullWidth = z11;
        }

        public static /* synthetic */ TextButtonDTO copy$default(TextButtonDTO textButtonDTO, ButtonV3DTO buttonV3DTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = textButtonDTO.button;
            }
            if ((i11 & 2) != 0) {
                z11 = textButtonDTO.isFullWidth;
            }
            return textButtonDTO.copy(buttonV3DTO, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFullWidth() {
            return this.isFullWidth;
        }

        @NotNull
        public final TextButtonDTO copy(@NotNull ButtonV3DTO button, boolean isFullWidth) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new TextButtonDTO(button, isFullWidth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextButtonDTO)) {
                return false;
            }
            TextButtonDTO textButtonDTO = (TextButtonDTO) other;
            return Intrinsics.d(this.button, textButtonDTO.button) && this.isFullWidth == textButtonDTO.isFullWidth;
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFullWidth) + (this.button.hashCode() * 31);
        }

        public final boolean isFullWidth() {
            return this.isFullWidth;
        }

        @NotNull
        public String toString() {
            return "TextButtonDTO(button=" + this.button + ", isFullWidth=" + this.isFullWidth + ")";
        }

        public /* synthetic */ TextButtonDTO(ButtonV3DTO buttonV3DTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(buttonV3DTO, (i11 & 2) != 0 ? false : z11);
        }
    }

    public /* synthetic */ ButtonsDTO(List list, HorizontalPadding horizontalPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? HorizontalPadding.INSTANCE.getDEFAULT_PADDING_500() : horizontalPadding);
    }
}
