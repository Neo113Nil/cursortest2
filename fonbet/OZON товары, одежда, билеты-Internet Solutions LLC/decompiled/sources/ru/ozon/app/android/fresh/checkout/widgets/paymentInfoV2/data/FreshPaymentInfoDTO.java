package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.data;

import B90.C2616s;
import T7.E;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.data.FreshCellListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003%&'BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "payments", "", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment;", "elements", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getPayments", "()Ljava/util/List;", "getElements", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Payment", "VerticalSpacer", "Separator", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshPaymentInfoDTO {
    public static final int $stable = 8;
    private final List<Object> elements;
    private final List<Payment> payments;
    private final TextAtom title;
    private final ButtonV3Atom.SmallButton titleButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u009e\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\r\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "", "iconRight", "background", "backgroundColor", "type", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment$StyleType;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isSelected", "", "promoteLabel", "Lru/ozon/uni/atoms/data/badge/Badge;", "automatizationDescription", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment$StyleType;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Ljava/lang/String;", "getIconRight", "getBackground", "getBackgroundColor", "getType", "()Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment$StyleType;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPromoteLabel", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getAutomatizationDescription", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment$StyleType;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment;", "equals", "other", "hashCode", "", "toString", "StyleType", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Payment {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String automatizationDescription;
        private final String background;
        private final String backgroundColor;
        private final String icon;
        private final String iconRight;
        private final Boolean isSelected;
        private final Badge promoteLabel;
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final StyleType type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Payment$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_DEFAULT", "STYLE_TYPE_CARD", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StyleType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ StyleType[] $VALUES;
            public static final StyleType STYLE_TYPE_DEFAULT = new StyleType("STYLE_TYPE_DEFAULT", 0);
            public static final StyleType STYLE_TYPE_CARD = new StyleType("STYLE_TYPE_CARD", 1);

            private static final /* synthetic */ StyleType[] $values() {
                return new StyleType[]{STYLE_TYPE_DEFAULT, STYLE_TYPE_CARD};
            }

            static {
                StyleType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private StyleType(String str, int i11) {
            }

            public static StyleType valueOf(String str) {
                return (StyleType) Enum.valueOf(StyleType.class, str);
            }

            public static StyleType[] values() {
                return (StyleType[]) $VALUES.clone();
            }
        }

        public Payment(TextAtom textAtom, String str, String str2, String str3, String str4, StyleType styleType, AtomActionDTO atomActionDTO, Boolean bool, Badge badge, String str5, Map<String, TokenizedTrackingInfo> map) {
            this.title = textAtom;
            this.icon = str;
            this.iconRight = str2;
            this.background = str3;
            this.backgroundColor = str4;
            this.type = styleType;
            this.action = atomActionDTO;
            this.isSelected = bool;
            this.promoteLabel = badge;
            this.automatizationDescription = str5;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Payment copy$default(Payment payment, TextAtom textAtom, String str, String str2, String str3, String str4, StyleType styleType, AtomActionDTO atomActionDTO, Boolean bool, Badge badge, String str5, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = payment.title;
            }
            if ((i11 & 2) != 0) {
                str = payment.icon;
            }
            if ((i11 & 4) != 0) {
                str2 = payment.iconRight;
            }
            if ((i11 & 8) != 0) {
                str3 = payment.background;
            }
            if ((i11 & 16) != 0) {
                str4 = payment.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                styleType = payment.type;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = payment.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                bool = payment.isSelected;
            }
            if ((i11 & 256) != 0) {
                badge = payment.promoteLabel;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str5 = payment.automatizationDescription;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map = payment.trackingInfo;
            }
            String str6 = str5;
            Map map2 = map;
            Boolean bool2 = bool;
            Badge badge2 = badge;
            StyleType styleType2 = styleType;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str7 = str4;
            String str8 = str2;
            return payment.copy(textAtom, str, str8, str3, str7, styleType2, atomActionDTO2, bool2, badge2, str6, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final String getAutomatizationDescription() {
            return this.automatizationDescription;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.trackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconRight() {
            return this.iconRight;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final StyleType getType() {
            return this.type;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component9, reason: from getter */
        public final Badge getPromoteLabel() {
            return this.promoteLabel;
        }

        @NotNull
        public final Payment copy(TextAtom title, String icon, String iconRight, String background, String backgroundColor, StyleType type, AtomActionDTO action, Boolean isSelected, Badge promoteLabel, String automatizationDescription, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new Payment(title, icon, iconRight, background, backgroundColor, type, action, isSelected, promoteLabel, automatizationDescription, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.d(this.title, payment.title) && Intrinsics.d(this.icon, payment.icon) && Intrinsics.d(this.iconRight, payment.iconRight) && Intrinsics.d(this.background, payment.background) && Intrinsics.d(this.backgroundColor, payment.backgroundColor) && this.type == payment.type && Intrinsics.d(this.action, payment.action) && Intrinsics.d(this.isSelected, payment.isSelected) && Intrinsics.d(this.promoteLabel, payment.promoteLabel) && Intrinsics.d(this.automatizationDescription, payment.automatizationDescription) && Intrinsics.d(this.trackingInfo, payment.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getAutomatizationDescription() {
            return this.automatizationDescription;
        }

        public final String getBackground() {
            return this.background;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconRight() {
            return this.iconRight;
        }

        public final Badge getPromoteLabel() {
            return this.promoteLabel;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final StyleType getType() {
            return this.type;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            String str = this.icon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconRight;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.background;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StyleType styleType = this.type;
            int hashCode6 = (hashCode5 + (styleType == null ? 0 : styleType.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Boolean bool = this.isSelected;
            int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Badge badge = this.promoteLabel;
            int hashCode9 = (hashCode8 + (badge == null ? 0 : badge.hashCode())) * 31;
            String str5 = this.automatizationDescription;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode10 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            String str = this.icon;
            String str2 = this.iconRight;
            String str3 = this.background;
            String str4 = this.backgroundColor;
            StyleType styleType = this.type;
            AtomActionDTO atomActionDTO = this.action;
            Boolean bool = this.isSelected;
            Badge badge = this.promoteLabel;
            String str5 = this.automatizationDescription;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = Bl.b.d("Payment(title=", ", icon=", str, ", iconRight=", textAtom);
            Nh.a.h(d11, str2, ", background=", str3, ", backgroundColor=");
            d11.append(str4);
            d11.append(", type=");
            d11.append(styleType);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", isSelected=");
            d11.append(bool);
            d11.append(", promoteLabel=");
            d11.append(badge);
            d11.append(", automatizationDescription=");
            d11.append(str5);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$Separator;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Separator {
        public static final int $stable = 0;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/FreshPaymentInfoDTO$VerticalSpacer;", "", "spacing", "", "<init>", "(I)V", "getSpacing", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpacer {
        public static final int $stable = 0;
        private final int spacing;

        public VerticalSpacer(int i11) {
            this.spacing = i11;
        }

        public static /* synthetic */ VerticalSpacer copy$default(VerticalSpacer verticalSpacer, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = verticalSpacer.spacing;
            }
            return verticalSpacer.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSpacing() {
            return this.spacing;
        }

        @NotNull
        public final VerticalSpacer copy(int spacing) {
            return new VerticalSpacer(spacing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalSpacer) && this.spacing == ((VerticalSpacer) other).spacing;
        }

        public final int getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            return Integer.hashCode(this.spacing);
        }

        @NotNull
        public String toString() {
            return E.a(this.spacing, "VerticalSpacer(spacing=", ")");
        }
    }

    public FreshPaymentInfoDTO(TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, List<Payment> list, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleToggle", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class), @ProtoOneOfSignature(name = "smallBorderlessButton", type = ButtonV3Atom.SmallBorderlessButton.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "separator", type = Separator.class), @ProtoOneOfSignature(name = "text", type = TextAtom.class), @ProtoOneOfSignature(name = "cellWithSubtitleCheckboxRadio", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class), @ProtoOneOfSignature(name = "annotation", type = DisclaimerAtom.class), @ProtoOneOfSignature(name = "verticalSpacer", type = VerticalSpacer.class), @ProtoOneOfSignature(name = "cellList", type = FreshCellListDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list2, Map<String, TokenizedTrackingInfo> map) {
        this.title = textAtom;
        this.titleButton = smallButton;
        this.payments = list;
        this.elements = list2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FreshPaymentInfoDTO copy$default(FreshPaymentInfoDTO freshPaymentInfoDTO, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, List list, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = freshPaymentInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            smallButton = freshPaymentInfoDTO.titleButton;
        }
        if ((i11 & 4) != 0) {
            list = freshPaymentInfoDTO.payments;
        }
        if ((i11 & 8) != 0) {
            list2 = freshPaymentInfoDTO.elements;
        }
        if ((i11 & 16) != 0) {
            map = freshPaymentInfoDTO.trackingInfo;
        }
        Map map2 = map;
        List list3 = list;
        return freshPaymentInfoDTO.copy(textAtom, smallButton, list3, list2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallButton getTitleButton() {
        return this.titleButton;
    }

    public final List<Payment> component3() {
        return this.payments;
    }

    public final List<Object> component4() {
        return this.elements;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final FreshPaymentInfoDTO copy(TextAtom title, ButtonV3Atom.SmallButton titleButton, List<Payment> payments, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleToggle", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class), @ProtoOneOfSignature(name = "smallBorderlessButton", type = ButtonV3Atom.SmallBorderlessButton.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "separator", type = Separator.class), @ProtoOneOfSignature(name = "text", type = TextAtom.class), @ProtoOneOfSignature(name = "cellWithSubtitleCheckboxRadio", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class), @ProtoOneOfSignature(name = "annotation", type = DisclaimerAtom.class), @ProtoOneOfSignature(name = "verticalSpacer", type = VerticalSpacer.class), @ProtoOneOfSignature(name = "cellList", type = FreshCellListDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> elements, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new FreshPaymentInfoDTO(title, titleButton, payments, elements, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshPaymentInfoDTO)) {
            return false;
        }
        FreshPaymentInfoDTO freshPaymentInfoDTO = (FreshPaymentInfoDTO) other;
        return Intrinsics.d(this.title, freshPaymentInfoDTO.title) && Intrinsics.d(this.titleButton, freshPaymentInfoDTO.titleButton) && Intrinsics.d(this.payments, freshPaymentInfoDTO.payments) && Intrinsics.d(this.elements, freshPaymentInfoDTO.elements) && Intrinsics.d(this.trackingInfo, freshPaymentInfoDTO.trackingInfo);
    }

    public final List<Object> getElements() {
        return this.elements;
    }

    public final List<Payment> getPayments() {
        return this.payments;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final ButtonV3Atom.SmallButton getTitleButton() {
        return this.titleButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        ButtonV3Atom.SmallButton smallButton = this.titleButton;
        int hashCode2 = (hashCode + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        List<Payment> list = this.payments;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.elements;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        ButtonV3Atom.SmallButton smallButton = this.titleButton;
        List<Payment> list = this.payments;
        List<Object> list2 = this.elements;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FreshPaymentInfoDTO(title=");
        sb2.append(textAtom);
        sb2.append(", titleButton=");
        sb2.append(smallButton);
        sb2.append(", payments=");
        C2616s.g(", elements=", ", trackingInfo=", sb2, list, list2);
        return P.f(sb2, map, ")");
    }
}
