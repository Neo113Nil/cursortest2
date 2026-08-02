package ru.ozon.app.android.checkoutcomposer.deliveryQuantity;

import B3.p;
import C.o0;
import Ih.a;
import K1.G;
import Tl.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003!\"#B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Header;", "selector", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector;", "bottomMessage", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$BottomMessage;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Header;Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector;Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$BottomMessage;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Header;", "getSelector", "()Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector;", "getBottomMessage", "()Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$BottomMessage;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Header", "Selector", "BottomMessage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryQuantityDTO {
    public static final int $stable = 8;
    private final BottomMessage bottomMessage;
    private final Header header;

    @NotNull
    private final Selector selector;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$BottomMessage;", "", "message", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getMessage", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomMessage {
        public static final int $stable = TextAtom.$stable;
        private final String icon;

        @NotNull
        private final TextAtom message;

        public BottomMessage(@NotNull TextAtom message, String str) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.icon = str;
        }

        public static /* synthetic */ BottomMessage copy$default(BottomMessage bottomMessage, TextAtom textAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = bottomMessage.message;
            }
            if ((i11 & 2) != 0) {
                str = bottomMessage.icon;
            }
            return bottomMessage.copy(textAtom, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final BottomMessage copy(@NotNull TextAtom message, String icon) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new BottomMessage(message, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomMessage)) {
                return false;
            }
            BottomMessage bottomMessage = (BottomMessage) other;
            return Intrinsics.d(this.message, bottomMessage.message) && Intrinsics.d(this.icon, bottomMessage.icon);
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.icon;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "BottomMessage(message=" + this.message + ", icon=" + this.icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonIcon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonIcon;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonIcon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = ButtonIcon.$stable | TextAtom.$stable;

        @NotNull
        private final ButtonIcon button;

        @NotNull
        private final TextAtom title;

        public Header(@NotNull TextAtom title, @NotNull ButtonIcon button) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            this.title = title;
            this.button = button;
        }

        public static /* synthetic */ Header copy$default(Header header, TextAtom textAtom, ButtonIcon buttonIcon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = header.title;
            }
            if ((i11 & 2) != 0) {
                buttonIcon = header.button;
            }
            return header.copy(textAtom, buttonIcon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonIcon getButton() {
            return this.button;
        }

        @NotNull
        public final Header copy(@NotNull TextAtom title, @NotNull ButtonIcon button) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            return new Header(title, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.button, header.button);
        }

        @NotNull
        public final ButtonIcon getButton() {
            return this.button;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.button.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", button=" + this.button + ")";
        }
    }

    public DeliveryQuantityDTO(Header header, @NotNull Selector selector, BottomMessage bottomMessage, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.header = header;
        this.selector = selector;
        this.bottomMessage = bottomMessage;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryQuantityDTO copy$default(DeliveryQuantityDTO deliveryQuantityDTO, Header header, Selector selector, BottomMessage bottomMessage, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = deliveryQuantityDTO.header;
        }
        if ((i11 & 2) != 0) {
            selector = deliveryQuantityDTO.selector;
        }
        if ((i11 & 4) != 0) {
            bottomMessage = deliveryQuantityDTO.bottomMessage;
        }
        if ((i11 & 8) != 0) {
            map = deliveryQuantityDTO.trackingInfo;
        }
        return deliveryQuantityDTO.copy(header, selector, bottomMessage, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Selector getSelector() {
        return this.selector;
    }

    /* renamed from: component3, reason: from getter */
    public final BottomMessage getBottomMessage() {
        return this.bottomMessage;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final DeliveryQuantityDTO copy(Header header, @NotNull Selector selector, BottomMessage bottomMessage, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new DeliveryQuantityDTO(header, selector, bottomMessage, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryQuantityDTO)) {
            return false;
        }
        DeliveryQuantityDTO deliveryQuantityDTO = (DeliveryQuantityDTO) other;
        return Intrinsics.d(this.header, deliveryQuantityDTO.header) && Intrinsics.d(this.selector, deliveryQuantityDTO.selector) && Intrinsics.d(this.bottomMessage, deliveryQuantityDTO.bottomMessage) && Intrinsics.d(this.trackingInfo, deliveryQuantityDTO.trackingInfo);
    }

    public final BottomMessage getBottomMessage() {
        return this.bottomMessage;
    }

    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final Selector getSelector() {
        return this.selector;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Header header = this.header;
        int hashCode = (this.selector.hashCode() + ((header == null ? 0 : header.hashCode()) * 31)) * 31;
        BottomMessage bottomMessage = this.bottomMessage;
        int hashCode2 = (hashCode + (bottomMessage == null ? 0 : bottomMessage.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryQuantityDTO(header=" + this.header + ", selector=" + this.selector + ", bottomMessage=" + this.bottomMessage + ", trackingInfo=" + this.trackingInfo + ")";
    }

    public /* synthetic */ DeliveryQuantityDTO(Header header, Selector selector, BottomMessage bottomMessage, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(header, selector, bottomMessage, (i11 & 8) != 0 ? null : map);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector;", "", "elements", "", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector$SelectorElement;", "backgroundColor", "", "selectedColor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getElements", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getSelectedColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SelectorElement", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Selector {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<SelectorElement> elements;
        private final String selectedColor;

        public Selector(@NotNull List<SelectorElement> elements, String str, String str2) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
            this.backgroundColor = str;
            this.selectedColor = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Selector copy$default(Selector selector, List list, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = selector.elements;
            }
            if ((i11 & 2) != 0) {
                str = selector.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str2 = selector.selectedColor;
            }
            return selector.copy(list, str, str2);
        }

        @NotNull
        public final List<SelectorElement> component1() {
            return this.elements;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSelectedColor() {
            return this.selectedColor;
        }

        @NotNull
        public final Selector copy(@NotNull List<SelectorElement> elements, String backgroundColor, String selectedColor) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new Selector(elements, backgroundColor, selectedColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return Intrinsics.d(this.elements, selector.elements) && Intrinsics.d(this.backgroundColor, selector.backgroundColor) && Intrinsics.d(this.selectedColor, selector.selectedColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<SelectorElement> getElements() {
            return this.elements;
        }

        public final String getSelectedColor() {
            return this.selectedColor;
        }

        public int hashCode() {
            int hashCode = this.elements.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.selectedColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<SelectorElement> list = this.elements;
            String str = this.backgroundColor;
            return o0.c(C4055a.a("Selector(elements=", ", backgroundColor=", str, ", selectedColor=", list), this.selectedColor, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003Je\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityDTO$Selector$SelectorElement;", "", "isSelected", "", "text", "", "subtext", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "()Z", "getText", "()Ljava/lang/String;", "getSubtext", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectorElement {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO action;
            private final boolean isSelected;
            private final String subtext;
            private final TextDTO subtitle;
            private final String text;
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public SelectorElement(boolean z11, String str, String str2, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TextDTO textDTO, TextDTO textDTO2) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.isSelected = z11;
                this.text = str;
                this.subtext = str2;
                this.action = action;
                this.trackingInfo = map;
                this.title = textDTO;
                this.subtitle = textDTO2;
            }

            public static /* synthetic */ SelectorElement copy$default(SelectorElement selectorElement, boolean z11, String str, String str2, AtomActionDTO atomActionDTO, Map map, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = selectorElement.isSelected;
                }
                if ((i11 & 2) != 0) {
                    str = selectorElement.text;
                }
                if ((i11 & 4) != 0) {
                    str2 = selectorElement.subtext;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = selectorElement.action;
                }
                if ((i11 & 16) != 0) {
                    map = selectorElement.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    textDTO = selectorElement.title;
                }
                if ((i11 & 64) != 0) {
                    textDTO2 = selectorElement.subtitle;
                }
                TextDTO textDTO3 = textDTO;
                TextDTO textDTO4 = textDTO2;
                Map map2 = map;
                String str3 = str2;
                return selectorElement.copy(z11, str, str3, atomActionDTO, map2, textDTO3, textDTO4);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtext() {
                return this.subtext;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component7, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final SelectorElement copy(boolean isSelected, String text, String subtext, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TextDTO title, TextDTO subtitle) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new SelectorElement(isSelected, text, subtext, action, trackingInfo, title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectorElement)) {
                    return false;
                }
                SelectorElement selectorElement = (SelectorElement) other;
                return this.isSelected == selectorElement.isSelected && Intrinsics.d(this.text, selectorElement.text) && Intrinsics.d(this.subtext, selectorElement.subtext) && Intrinsics.d(this.action, selectorElement.action) && Intrinsics.d(this.trackingInfo, selectorElement.trackingInfo) && Intrinsics.d(this.title, selectorElement.title) && Intrinsics.d(this.subtitle, selectorElement.subtitle);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final String getSubtext() {
                return this.subtext;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isSelected) * 31;
                String str = this.text;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.subtext;
                int b11 = a.b(this.action, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode3 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
                TextDTO textDTO = this.title;
                int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                TextDTO textDTO2 = this.subtitle;
                return hashCode4 + (textDTO2 != null ? textDTO2.hashCode() : 0);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                String str = this.text;
                String str2 = this.subtext;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                StringBuilder d11 = G.d("SelectorElement(isSelected=", ", text=", str, ", subtext=", z11);
                p.c(str2, ", action=", ", trackingInfo=", d11, atomActionDTO);
                d11.append(map);
                d11.append(", title=");
                d11.append(textDTO);
                d11.append(", subtitle=");
                return b.e(d11, textDTO2, ")");
            }

            public /* synthetic */ SelectorElement(boolean z11, String str, String str2, AtomActionDTO atomActionDTO, Map map, TextDTO textDTO, TextDTO textDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? false : z11, str, str2, atomActionDTO, (i11 & 16) != 0 ? null : map, textDTO, textDTO2);
            }
        }
    }
}
