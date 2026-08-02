package ru.ozon.app.android.checkoutcomposer.deliveryQuantity;

import Bl.C2639a;
import C.o0;
import G.g;
import Ih.a;
import Ns.b;
import Tz.C4055a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003*+,BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector;", "selector", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$BottomMessage;", "bottomMessage", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Header;Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector;Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$BottomMessage;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Header;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Header;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector;", "getSelector", "()Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector;", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$BottomMessage;", "getBottomMessage", "()Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$BottomMessage;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Header", "Selector", "BottomMessage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryQuantityVO implements c {
    private final BottomMessage bottomMessage;
    private final Header header;
    private final long id;

    @NotNull
    private final Selector selector;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$BottomMessage;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "message", "", "icon", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMessage", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getIcon", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Header;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonIcon;", "button", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonIcon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonIcon;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonIcon;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector;", "", "", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector$SelectorElement;", "elements", "", "backgroundColor", "selectedColor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "getSelectedColor", "SelectorElement", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selector {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final List<SelectorElement> elements;

        @NotNull
        private final String selectedColor;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector$SelectorElement;", "", "", "isSelected", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectorElement {

            @NotNull
            private final AtomActionDTO action;
            private final boolean isSelected;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public SelectorElement(boolean z11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, @NotNull TextDTO title, TextDTO textDTO) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(title, "title");
                this.isSelected = z11;
                this.action = action;
                this.trackingInfo = map;
                this.title = title;
                this.subtitle = textDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectorElement)) {
                    return false;
                }
                SelectorElement selectorElement = (SelectorElement) other;
                return this.isSelected == selectorElement.isSelected && Intrinsics.d(this.action, selectorElement.action) && Intrinsics.d(this.trackingInfo, selectorElement.trackingInfo) && Intrinsics.d(this.title, selectorElement.title) && Intrinsics.d(this.subtitle, selectorElement.subtitle);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int b11 = a.b(this.action, Boolean.hashCode(this.isSelected) * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int a11 = b.a(this.title, (b11 + (map == null ? 0 : map.hashCode())) * 31, 31);
                TextDTO textDTO = this.subtitle;
                return a11 + (textDTO != null ? textDTO.hashCode() : 0);
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                StringBuilder sb2 = new StringBuilder("SelectorElement(isSelected=");
                sb2.append(z11);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", subtitle=");
                return Tl.b.e(sb2, textDTO2, ")");
            }
        }

        public Selector(@NotNull List<SelectorElement> elements, @NotNull String backgroundColor, @NotNull String selectedColor) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
            this.elements = elements;
            this.backgroundColor = backgroundColor;
            this.selectedColor = selectedColor;
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

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<SelectorElement> getElements() {
            return this.elements;
        }

        @NotNull
        public final String getSelectedColor() {
            return this.selectedColor;
        }

        public int hashCode() {
            return this.selectedColor.hashCode() + g.a(this.elements.hashCode() * 31, 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            List<SelectorElement> list = this.elements;
            String str = this.backgroundColor;
            return o0.c(C4055a.a("Selector(elements=", ", backgroundColor=", str, ", selectedColor=", list), this.selectedColor, ")");
        }
    }

    public DeliveryQuantityVO(long j11, Header header, @NotNull Selector selector, BottomMessage bottomMessage, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.id = j11;
        this.header = header;
        this.selector = selector;
        this.bottomMessage = bottomMessage;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryQuantityVO)) {
            return false;
        }
        DeliveryQuantityVO deliveryQuantityVO = (DeliveryQuantityVO) other;
        return this.id == deliveryQuantityVO.id && Intrinsics.d(this.header, deliveryQuantityVO.header) && Intrinsics.d(this.selector, deliveryQuantityVO.selector) && Intrinsics.d(this.bottomMessage, deliveryQuantityVO.bottomMessage) && Intrinsics.d(this.trackingInfo, deliveryQuantityVO.trackingInfo);
    }

    public final BottomMessage getBottomMessage() {
        return this.bottomMessage;
    }

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Selector getSelector() {
        return this.selector;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Header header = this.header;
        int hashCode2 = (this.selector.hashCode() + ((hashCode + (header == null ? 0 : header.hashCode())) * 31)) * 31;
        BottomMessage bottomMessage = this.bottomMessage;
        int hashCode3 = (hashCode2 + (bottomMessage == null ? 0 : bottomMessage.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Header header = this.header;
        Selector selector = this.selector;
        BottomMessage bottomMessage = this.bottomMessage;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("DeliveryQuantityVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(header);
        sb2.append(", selector=");
        sb2.append(selector);
        sb2.append(", bottomMessage=");
        sb2.append(bottomMessage);
        return C2639a.b(sb2, ", trackingInfo=", map, ")");
    }
}
