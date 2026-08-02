package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data;

import Ak.b;
import B90.C2618u;
import C.o0;
import G.g;
import H3.c;
import HY.a;
import N3.C3660k;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = SelectionItemFormDTO.TITLE_FIELD_NAME, type = Title.class), @ProtoOneOfSignature(name = "status", type = StatusDTO.class), @ProtoOneOfSignature(name = "actions", type = ShipmentActionsDTO.class), @ProtoOneOfSignature(name = "annotation", type = AnnotationDTO.class), @ProtoOneOfSignature(name = "postings", type = PostingsDTO.class), @ProtoOneOfSignature(name = "text", type = Text.class), @ProtoOneOfSignature(name = "statusProvider", type = StatusProviderDTO.class)})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "", "<init>", "()V", "Title", "Text", "Line", "TextChunk", "StatusDTO", "ShipmentActionsDTO", "PostingsDTO", "PostingDTO", "ShipmentProductDTO", "AnnotationDTO", "ButtonDTO", "StatusProviderDTO", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$AnnotationDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingsDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ShipmentActionsDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$StatusDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$StatusProviderDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Text;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Title;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes13.dex */
public abstract class OrderShipmentItemDTO {
    public static final int $stable = 0;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$AnnotationDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "icon", "", "iconColor", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "backgroundColor", "useBoldFont", "", "buttons", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ButtonDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getIcon", "()Ljava/lang/String;", "getIconColor", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "getBackgroundColor", "getUseBoldFont", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$AnnotationDTO;", "equals", "other", "", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnnotationDTO extends OrderShipmentItemDTO {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final List<ButtonDTO> buttons;

        @NotNull
        private final String icon;

        @NotNull
        private final String iconColor;

        @NotNull
        private final OzonSpannableString text;
        private final String textColor;
        private final Boolean useBoldFont;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationDTO(@NotNull String icon, @NotNull String iconColor, @NotNull OzonSpannableString text, String str, String str2, Boolean bool, List<ButtonDTO> list) {
            super(null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.iconColor = iconColor;
            this.text = text;
            this.textColor = str;
            this.backgroundColor = str2;
            this.useBoldFont = bool;
            this.buttons = list;
        }

        public static /* synthetic */ AnnotationDTO copy$default(AnnotationDTO annotationDTO, String str, String str2, OzonSpannableString ozonSpannableString, String str3, String str4, Boolean bool, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = annotationDTO.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = annotationDTO.iconColor;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString = annotationDTO.text;
            }
            if ((i11 & 8) != 0) {
                str3 = annotationDTO.textColor;
            }
            if ((i11 & 16) != 0) {
                str4 = annotationDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                bool = annotationDTO.useBoldFont;
            }
            if ((i11 & 64) != 0) {
                list = annotationDTO.buttons;
            }
            Boolean bool2 = bool;
            List list2 = list;
            String str5 = str4;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            return annotationDTO.copy(str, str2, ozonSpannableString2, str3, str5, bool2, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getUseBoldFont() {
            return this.useBoldFont;
        }

        public final List<ButtonDTO> component7() {
            return this.buttons;
        }

        @NotNull
        public final AnnotationDTO copy(@NotNull String icon, @NotNull String iconColor, @NotNull OzonSpannableString text, String textColor, String backgroundColor, Boolean useBoldFont, List<ButtonDTO> buttons) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            Intrinsics.checkNotNullParameter(text, "text");
            return new AnnotationDTO(icon, iconColor, text, textColor, backgroundColor, useBoldFont, buttons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnnotationDTO)) {
                return false;
            }
            AnnotationDTO annotationDTO = (AnnotationDTO) other;
            return Intrinsics.d(this.icon, annotationDTO.icon) && Intrinsics.d(this.iconColor, annotationDTO.iconColor) && Intrinsics.d(this.text, annotationDTO.text) && Intrinsics.d(this.textColor, annotationDTO.textColor) && Intrinsics.d(this.backgroundColor, annotationDTO.backgroundColor) && Intrinsics.d(this.useBoldFont, annotationDTO.useBoldFont) && Intrinsics.d(this.buttons, annotationDTO.buttons);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final List<ButtonDTO> getButtons() {
            return this.buttons;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final Boolean getUseBoldFont() {
            return this.useBoldFont;
        }

        public int hashCode() {
            int c11 = P.c(this.text, g.a(this.icon.hashCode() * 31, 31, this.iconColor), 31);
            String str = this.textColor;
            int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.useBoldFont;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<ButtonDTO> list = this.buttons;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconColor;
            OzonSpannableString ozonSpannableString = this.text;
            String str3 = this.textColor;
            String str4 = this.backgroundColor;
            Boolean bool = this.useBoldFont;
            List<ButtonDTO> list = this.buttons;
            StringBuilder d11 = C3660k.d("AnnotationDTO(icon=", str, ", iconColor=", str2, ", text=");
            a.c(", textColor=", str3, ", backgroundColor=", d11, ozonSpannableString);
            Sh.a.d(bool, str4, ", useBoldFont=", ", buttons=", d11);
            return C2618u.h(d11, list, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ButtonDTO;", "", "text", "", "textColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String text;
        private final String textColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ButtonDTO(@NotNull String text, String str, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.textColor = str;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonDTO copy$default(ButtonDTO buttonDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonDTO.text;
            }
            if ((i11 & 2) != 0) {
                str2 = buttonDTO.textColor;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = buttonDTO.action;
            }
            if ((i11 & 8) != 0) {
                map = buttonDTO.trackingInfo;
            }
            return buttonDTO.copy(str, str2, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonDTO copy(@NotNull String text, String textColor, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ButtonDTO(text, textColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonDTO)) {
                return false;
            }
            ButtonDTO buttonDTO = (ButtonDTO) other;
            return Intrinsics.d(this.text, buttonDTO.text) && Intrinsics.d(this.textColor, buttonDTO.textColor) && Intrinsics.d(this.action, buttonDTO.action) && Intrinsics.d(this.trackingInfo, buttonDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.textColor;
            int b11 = Ih.a.b(this.action, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.textColor;
            return D40.a.d(C3660k.d("ButtonDTO(text=", str, ", textColor=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "", "chunks", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$TextChunk;", "<init>", "(Ljava/util/List;)V", "getChunks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Line {
        public static final int $stable = 8;

        @NotNull
        private final List<TextChunk> chunks;

        public Line(@NotNull List<TextChunk> chunks) {
            Intrinsics.checkNotNullParameter(chunks, "chunks");
            this.chunks = chunks;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Line copy$default(Line line, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = line.chunks;
            }
            return line.copy(list);
        }

        @NotNull
        public final List<TextChunk> component1() {
            return this.chunks;
        }

        @NotNull
        public final Line copy(@NotNull List<TextChunk> chunks) {
            Intrinsics.checkNotNullParameter(chunks, "chunks");
            return new Line(chunks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Line) && Intrinsics.d(this.chunks, ((Line) other).chunks);
        }

        @NotNull
        public final List<TextChunk> getChunks() {
            return this.chunks;
        }

        public int hashCode() {
            return this.chunks.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Line(chunks=", ")", this.chunks);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jm\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "trackDeliveryTitle", "shareButton", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO$ShareButton;", "progressiveText", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "products", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ShipmentProductDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO$ShareButton;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getTrackDeliveryTitle", "getShareButton", "()Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO$ShareButton;", "getProgressiveText", "()Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "getProducts", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ShareButton", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PostingDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final List<ShipmentProductDTO> products;
        private final ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveText;
        private final ShareButton shareButton;
        private final String title;
        private final String trackDeliveryTitle;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO$ShareButton;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShareButton {
            public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

            @NotNull
            private final ButtonV3Atom.SmallBorderlessButton button;

            public ShareButton(@NotNull ButtonV3Atom.SmallBorderlessButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public static /* synthetic */ ShareButton copy$default(ShareButton shareButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    smallBorderlessButton = shareButton.button;
                }
                return shareButton.copy(smallBorderlessButton);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.SmallBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final ShareButton copy(@NotNull ButtonV3Atom.SmallBorderlessButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new ShareButton(button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShareButton) && Intrinsics.d(this.button, ((ShareButton) other).button);
            }

            @NotNull
            public final ButtonV3Atom.SmallBorderlessButton getButton() {
                return this.button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShareButton(button=" + this.button + ")";
            }
        }

        public PostingDTO(String str, String str2, ShareButton shareButton, ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveTextDTO, @NotNull List<ShipmentProductDTO> products, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(products, "products");
            this.title = str;
            this.trackDeliveryTitle = str2;
            this.shareButton = shareButton;
            this.progressiveText = progressiveTextDTO;
            this.products = products;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PostingDTO copy$default(PostingDTO postingDTO, String str, String str2, ShareButton shareButton, ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveTextDTO, List list, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = postingDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = postingDTO.trackDeliveryTitle;
            }
            if ((i11 & 4) != 0) {
                shareButton = postingDTO.shareButton;
            }
            if ((i11 & 8) != 0) {
                progressiveTextDTO = postingDTO.progressiveText;
            }
            if ((i11 & 16) != 0) {
                list = postingDTO.products;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = postingDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = postingDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            List list2 = list;
            ShareButton shareButton2 = shareButton;
            return postingDTO.copy(str, str2, shareButton2, progressiveTextDTO, list2, atomActionDTO2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTrackDeliveryTitle() {
            return this.trackDeliveryTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final ShareButton getShareButton() {
            return this.shareButton;
        }

        /* renamed from: component4, reason: from getter */
        public final ProgressiveTextWidgetDTO.ProgressiveTextDTO getProgressiveText() {
            return this.progressiveText;
        }

        @NotNull
        public final List<ShipmentProductDTO> component5() {
            return this.products;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final PostingDTO copy(String title, String trackDeliveryTitle, ShareButton shareButton, ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveText, @NotNull List<ShipmentProductDTO> products, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(products, "products");
            return new PostingDTO(title, trackDeliveryTitle, shareButton, progressiveText, products, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostingDTO)) {
                return false;
            }
            PostingDTO postingDTO = (PostingDTO) other;
            return Intrinsics.d(this.title, postingDTO.title) && Intrinsics.d(this.trackDeliveryTitle, postingDTO.trackDeliveryTitle) && Intrinsics.d(this.shareButton, postingDTO.shareButton) && Intrinsics.d(this.progressiveText, postingDTO.progressiveText) && Intrinsics.d(this.products, postingDTO.products) && Intrinsics.d(this.action, postingDTO.action) && Intrinsics.d(this.trackingInfo, postingDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final List<ShipmentProductDTO> getProducts() {
            return this.products;
        }

        public final ProgressiveTextWidgetDTO.ProgressiveTextDTO getProgressiveText() {
            return this.progressiveText;
        }

        public final ShareButton getShareButton() {
            return this.shareButton;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTrackDeliveryTitle() {
            return this.trackDeliveryTitle;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.trackDeliveryTitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ShareButton shareButton = this.shareButton;
            int hashCode3 = (hashCode2 + (shareButton == null ? 0 : shareButton.hashCode())) * 31;
            ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveTextDTO = this.progressiveText;
            int b11 = g.b((hashCode3 + (progressiveTextDTO == null ? 0 : progressiveTextDTO.hashCode())) * 31, 31, this.products);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.trackDeliveryTitle;
            ShareButton shareButton = this.shareButton;
            ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveTextDTO = this.progressiveText;
            List<ShipmentProductDTO> list = this.products;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("PostingDTO(title=", str, ", trackDeliveryTitle=", str2, ", shareButton=");
            d11.append(shareButton);
            d11.append(", progressiveText=");
            d11.append(progressiveTextDTO);
            d11.append(", products=");
            d11.append(list);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingsDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "postings", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO;", "<init>", "(Ljava/util/List;)V", "getPostings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostingsDTO extends OrderShipmentItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<PostingDTO> postings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostingsDTO(@NotNull List<PostingDTO> postings) {
            super(null);
            Intrinsics.checkNotNullParameter(postings, "postings");
            this.postings = postings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostingsDTO copy$default(PostingsDTO postingsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = postingsDTO.postings;
            }
            return postingsDTO.copy(list);
        }

        @NotNull
        public final List<PostingDTO> component1() {
            return this.postings;
        }

        @NotNull
        public final PostingsDTO copy(@NotNull List<PostingDTO> postings) {
            Intrinsics.checkNotNullParameter(postings, "postings");
            return new PostingsDTO(postings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostingsDTO) && Intrinsics.d(this.postings, ((PostingsDTO) other).postings);
        }

        @NotNull
        public final List<PostingDTO> getPostings() {
            return this.postings;
        }

        public int hashCode() {
            return this.postings.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("PostingsDTO(postings=", ")", this.postings);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ShipmentActionsDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShipmentActionsDTO extends OrderShipmentItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<ButtonV3Atom.LargeBorderlessButton> buttons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShipmentActionsDTO(@NotNull List<ButtonV3Atom.LargeBorderlessButton> buttons) {
            super(null);
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.buttons = buttons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShipmentActionsDTO copy$default(ShipmentActionsDTO shipmentActionsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = shipmentActionsDTO.buttons;
            }
            return shipmentActionsDTO.copy(list);
        }

        @NotNull
        public final List<ButtonV3Atom.LargeBorderlessButton> component1() {
            return this.buttons;
        }

        @NotNull
        public final ShipmentActionsDTO copy(@NotNull List<ButtonV3Atom.LargeBorderlessButton> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new ShipmentActionsDTO(buttons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShipmentActionsDTO) && Intrinsics.d(this.buttons, ((ShipmentActionsDTO) other).buttons);
        }

        @NotNull
        public final List<ButtonV3Atom.LargeBorderlessButton> getButtons() {
            return this.buttons;
        }

        public int hashCode() {
            return this.buttons.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ShipmentActionsDTO(buttons=", ")", this.buttons);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ShipmentProductDTO;", "", "image", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "<init>", "(Ljava/lang/String;Z)V", "getImage", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShipmentProductDTO {
        public static final int $stable = 0;

        @NotNull
        private final String image;
        private final boolean isAdult;

        public ShipmentProductDTO(@NotNull String image, boolean z11) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.isAdult = z11;
        }

        public static /* synthetic */ ShipmentProductDTO copy$default(ShipmentProductDTO shipmentProductDTO, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = shipmentProductDTO.image;
            }
            if ((i11 & 2) != 0) {
                z11 = shipmentProductDTO.isAdult;
            }
            return shipmentProductDTO.copy(str, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        @NotNull
        public final ShipmentProductDTO copy(@NotNull String image, boolean isAdult) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new ShipmentProductDTO(image, isAdult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShipmentProductDTO)) {
                return false;
            }
            ShipmentProductDTO shipmentProductDTO = (ShipmentProductDTO) other;
            return Intrinsics.d(this.image, shipmentProductDTO.image) && this.isAdult == shipmentProductDTO.isAdult;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAdult) + (this.image.hashCode() * 31);
        }

        public final boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            return b.f("ShipmentProductDTO(image=", this.image, ", isAdult=", ")", this.isAdult);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$StatusDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "text", "", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusDTO extends OrderShipmentItemDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusDTO(@NotNull String text, @NotNull String backgroundColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.text = text;
            this.backgroundColor = backgroundColor;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = statusDTO.text;
            }
            if ((i11 & 2) != 0) {
                str2 = statusDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = statusDTO.action;
            }
            if ((i11 & 8) != 0) {
                map = statusDTO.trackingInfo;
            }
            return statusDTO.copy(str, str2, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final StatusDTO copy(@NotNull String text, @NotNull String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new StatusDTO(text, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusDTO)) {
                return false;
            }
            StatusDTO statusDTO = (StatusDTO) other;
            return Intrinsics.d(this.text, statusDTO.text) && Intrinsics.d(this.backgroundColor, statusDTO.backgroundColor) && Intrinsics.d(this.action, statusDTO.action) && Intrinsics.d(this.trackingInfo, statusDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.text.hashCode() * 31, 31, this.backgroundColor);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.backgroundColor;
            return D40.a.d(C3660k.d("StatusDTO(text=", str, ", backgroundColor=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$StatusProviderDTO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deliveryName", "status", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getDeliveryName", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusProviderDTO extends OrderShipmentItemDTO {
        public static final int $stable = Badge.$stable;

        @NotNull
        private final String deliveryName;
        private final String image;

        @NotNull
        private final Badge status;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusProviderDTO(String str, @NotNull String title, @NotNull String deliveryName, @NotNull Badge status) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deliveryName, "deliveryName");
            Intrinsics.checkNotNullParameter(status, "status");
            this.image = str;
            this.title = title;
            this.deliveryName = deliveryName;
            this.status = status;
        }

        public static /* synthetic */ StatusProviderDTO copy$default(StatusProviderDTO statusProviderDTO, String str, String str2, String str3, Badge badge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = statusProviderDTO.image;
            }
            if ((i11 & 2) != 0) {
                str2 = statusProviderDTO.title;
            }
            if ((i11 & 4) != 0) {
                str3 = statusProviderDTO.deliveryName;
            }
            if ((i11 & 8) != 0) {
                badge = statusProviderDTO.status;
            }
            return statusProviderDTO.copy(str, str2, str3, badge);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeliveryName() {
            return this.deliveryName;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Badge getStatus() {
            return this.status;
        }

        @NotNull
        public final StatusProviderDTO copy(String image, @NotNull String title, @NotNull String deliveryName, @NotNull Badge status) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deliveryName, "deliveryName");
            Intrinsics.checkNotNullParameter(status, "status");
            return new StatusProviderDTO(image, title, deliveryName, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusProviderDTO)) {
                return false;
            }
            StatusProviderDTO statusProviderDTO = (StatusProviderDTO) other;
            return Intrinsics.d(this.image, statusProviderDTO.image) && Intrinsics.d(this.title, statusProviderDTO.title) && Intrinsics.d(this.deliveryName, statusProviderDTO.deliveryName) && Intrinsics.d(this.status, statusProviderDTO.status);
        }

        @NotNull
        public final String getDeliveryName() {
            return this.deliveryName;
        }

        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final Badge getStatus() {
            return this.status;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.image;
            return this.status.hashCode() + g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.deliveryName);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.deliveryName;
            Badge badge = this.status;
            StringBuilder d11 = C3660k.d("StatusProviderDTO(image=", str, ", title=", str2, ", deliveryName=");
            d11.append(str3);
            d11.append(", status=");
            d11.append(badge);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Text;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "lines", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "<init>", "(Ljava/util/List;)V", "getLines", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Text extends OrderShipmentItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<Line> lines;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull List<Line> lines) {
            super(null);
            Intrinsics.checkNotNullParameter(lines, "lines");
            this.lines = lines;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Text copy$default(Text text, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = text.lines;
            }
            return text.copy(list);
        }

        @NotNull
        public final List<Line> component1() {
            return this.lines;
        }

        @NotNull
        public final Text copy(@NotNull List<Line> lines) {
            Intrinsics.checkNotNullParameter(lines, "lines");
            return new Text(lines);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.d(this.lines, ((Text) other).lines);
        }

        @NotNull
        public final List<Line> getLines() {
            return this.lines;
        }

        public int hashCode() {
            return this.lines.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Text(lines=", ")", this.lines);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$TextChunk;", "", "color", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextChunk {
        public static final int $stable = 0;
        private final String color;

        @NotNull
        private final String text;

        public TextChunk(String str, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.color = str;
            this.text = text;
        }

        public static /* synthetic */ TextChunk copy$default(TextChunk textChunk, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textChunk.color;
            }
            if ((i11 & 2) != 0) {
                str2 = textChunk.text;
            }
            return textChunk.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final TextChunk copy(String color, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextChunk(color, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextChunk)) {
                return false;
            }
            TextChunk textChunk = (TextChunk) other;
            return Intrinsics.d(this.color, textChunk.color) && Intrinsics.d(this.text, textChunk.text);
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.color;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return e.a("TextChunk(color=", this.color, ", text=", this.text, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Title;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "lines", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "scrollWidgetId", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "getLines", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getScrollWidgetId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Title extends OrderShipmentItemDTO {
        public static final int $stable = 8;
        private final ButtonV3Atom.LargeBorderlessButton button;
        private final String icon;
        private final List<Line> lines;
        private final String scrollWidgetId;

        @NotNull
        private final Line title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Title(String str, @NotNull Line title, List<Line> list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = str;
            this.title = title;
            this.lines = list;
            this.button = largeBorderlessButton;
            this.scrollWidgetId = str2;
        }

        public static /* synthetic */ Title copy$default(Title title, String str, Line line, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = title.icon;
            }
            if ((i11 & 2) != 0) {
                line = title.title;
            }
            if ((i11 & 4) != 0) {
                list = title.lines;
            }
            if ((i11 & 8) != 0) {
                largeBorderlessButton = title.button;
            }
            if ((i11 & 16) != 0) {
                str2 = title.scrollWidgetId;
            }
            String str3 = str2;
            List list2 = list;
            return title.copy(str, line, list2, largeBorderlessButton, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Line getTitle() {
            return this.title;
        }

        public final List<Line> component3() {
            return this.lines;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getButton() {
            return this.button;
        }

        /* renamed from: component5, reason: from getter */
        public final String getScrollWidgetId() {
            return this.scrollWidgetId;
        }

        @NotNull
        public final Title copy(String icon, @NotNull Line title, List<Line> lines, ButtonV3Atom.LargeBorderlessButton button, String scrollWidgetId) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Title(icon, title, lines, button, scrollWidgetId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return Intrinsics.d(this.icon, title.icon) && Intrinsics.d(this.title, title.title) && Intrinsics.d(this.lines, title.lines) && Intrinsics.d(this.button, title.button) && Intrinsics.d(this.scrollWidgetId, title.scrollWidgetId);
        }

        public final ButtonV3Atom.LargeBorderlessButton getButton() {
            return this.button;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final List<Line> getLines() {
            return this.lines;
        }

        public final String getScrollWidgetId() {
            return this.scrollWidgetId;
        }

        @NotNull
        public final Line getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            List<Line> list = this.lines;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
            int hashCode3 = (hashCode2 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
            String str2 = this.scrollWidgetId;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            Line line = this.title;
            List<Line> list = this.lines;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
            String str2 = this.scrollWidgetId;
            StringBuilder sb2 = new StringBuilder("Title(icon=");
            sb2.append(str);
            sb2.append(", title=");
            sb2.append(line);
            sb2.append(", lines=");
            sb2.append(list);
            sb2.append(", button=");
            sb2.append(largeBorderlessButton);
            sb2.append(", scrollWidgetId=");
            return o0.c(sb2, str2, ")");
        }
    }

    public /* synthetic */ OrderShipmentItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OrderShipmentItemDTO() {
    }
}
