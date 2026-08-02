package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import Am.C2438a;
import B0.C2454a;
import B4.V;
import C.o0;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u0000 :2\u00020\u0001:\b:;<=>?@ABi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J{\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00105\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006B"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;", "", "sku", "", "configuration", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "needsShadow", "", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "notificationBar", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "relatedProductsCurtain", "curtainTrackingInfo", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;", "<init>", "(JLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;)V", "getSku", "()J", "getConfiguration", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "getNeedsShadow", "()Z", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "getTrackingInfo", "()Ljava/util/Map;", "getNotification$annotations", "()V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getNotificationBar", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "getRelatedProductsCurtain", "()Ljava/lang/String;", "getCurtainTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "Configuration", "ButtonColors", "CartButtonStyle", "CartButton", "AsyncFetchType", "NotificationBar", "CurtainTrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartButtonV4Dto {

    @NotNull
    public static final String ADDITIONAL_TYPE_ICON_BUTTON = "iconButton";

    @NotNull
    public static final String ADDITIONAL_TYPE_MINUS_PLUS = "minusPlus";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String TYPE_CART = "cart";

    @NotNull
    public static final String TYPE_DELIVERY = "delivery";

    @NotNull
    public static final String TYPE_DOUBLE_CART = "doubleCart";

    @NotNull
    public static final String TYPE_PLAIN = "plain";

    @NotNull
    public static final String TYPE_SUBSCRIBE = "subscribe";

    @NotNull
    private final Configuration configuration;
    private final CurtainTrackingInfo curtainTrackingInfo;
    private final boolean needsShadow;
    private final NotificationAtom.NotificationWithIcon notification;
    private final NotificationBar notificationBar;
    private final String relatedProductsCurtain;
    private final long sku;
    private final CartButtonStyle style;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncFetchType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncFetchType[] $VALUES;

        @i(name = "NONE")
        public static final AsyncFetchType NONE = new AsyncFetchType("NONE", 0);

        @i(name = SelectionItemDescriptionDTO.TITLE)
        public static final AsyncFetchType TITLE = new AsyncFetchType(SelectionItemDescriptionDTO.TITLE, 1);

        @i(name = "SUBTITLE")
        public static final AsyncFetchType SUBTITLE = new AsyncFetchType("SUBTITLE", 2);

        private static final /* synthetic */ AsyncFetchType[] $values() {
            return new AsyncFetchType[]{NONE, TITLE, SUBTITLE};
        }

        static {
            AsyncFetchType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncFetchType(String str, int i11) {
        }

        public static AsyncFetchType valueOf(String str) {
            return (AsyncFetchType) Enum.valueOf(AsyncFetchType.class, str);
        }

        public static AsyncFetchType[] values() {
            return (AsyncFetchType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "", "titleColor", "", "subtitleColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleColor", "()Ljava/lang/String;", "getSubtitleColor", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonColors {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String subtitleColor;
        private final String titleColor;

        public ButtonColors(String str, String str2, String str3) {
            this.titleColor = str;
            this.subtitleColor = str2;
            this.backgroundColor = str3;
        }

        public static /* synthetic */ ButtonColors copy$default(ButtonColors buttonColors, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonColors.titleColor;
            }
            if ((i11 & 2) != 0) {
                str2 = buttonColors.subtitleColor;
            }
            if ((i11 & 4) != 0) {
                str3 = buttonColors.backgroundColor;
            }
            return buttonColors.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ButtonColors copy(String titleColor, String subtitleColor, String backgroundColor) {
            return new ButtonColors(titleColor, subtitleColor, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonColors)) {
                return false;
            }
            ButtonColors buttonColors = (ButtonColors) other;
            return Intrinsics.d(this.titleColor, buttonColors.titleColor) && Intrinsics.d(this.subtitleColor, buttonColors.subtitleColor) && Intrinsics.d(this.backgroundColor, buttonColors.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            String str = this.titleColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitleColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.backgroundColor;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.titleColor;
            String str2 = this.subtitleColor;
            return o0.c(C3660k.d("ButtonColors(titleColor=", str, ", subtitleColor=", str2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIUM", "LARGE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CartButtonStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartButtonStyle[] $VALUES;

        @i(name = "MEDIUM")
        public static final CartButtonStyle MEDIUM = new CartButtonStyle("MEDIUM", 0);

        @i(name = "LARGE")
        public static final CartButtonStyle LARGE = new CartButtonStyle("LARGE", 1);

        private static final /* synthetic */ CartButtonStyle[] $values() {
            return new CartButtonStyle[]{MEDIUM, LARGE};
        }

        static {
            CartButtonStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartButtonStyle(String str, int i11) {
        }

        public static CartButtonStyle valueOf(String str) {
            return (CartButtonStyle) Enum.valueOf(CartButtonStyle.class, str);
        }

        public static CartButtonStyle[] values() {
            return (CartButtonStyle[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "", "<init>", "()V", "PlainData", "SubscribeData", "CartData", "DeliveryData", "DoubleCartData", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DeliveryData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DoubleCartData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$PlainData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$SubscribeData;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Configuration {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016JX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "isInCart", "", "inCart", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "toCart", "inCartQty", "", "freeRest", "minAddToCartQuantity", "multiplicityValue", "<init>", "(ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;IILjava/lang/Integer;Ljava/lang/Integer;)V", "()Z", "getInCart", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "getToCart", "getInCartQty", "()I", "getFreeRest", "getMinAddToCartQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMultiplicityValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;IILjava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;", "equals", "other", "", "hashCode", "toString", "", "Buttons", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CartData extends Configuration {
            public static final int $stable = 8;
            private final int freeRest;

            @NotNull
            private final Buttons inCart;
            private final int inCartQty;
            private final boolean isInCart;
            private final Integer minAddToCartQuantity;
            private final Integer multiplicityValue;

            @NotNull
            private final Buttons toCart;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "", "buttonWithIcon", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "additionalButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO;", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO;)V", "getButtonWithIcon", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "getAdditionalButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AdditionalButtonDTO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class Buttons {
                public static final int $stable = 8;
                private final AdditionalButtonDTO additionalButton;

                @NotNull
                private final CartButton buttonWithIcon;

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO;", "", "button", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Object;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getButton", "()Ljava/lang/Object;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "MinusPlus", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                @j(generateAdapter = true)
                public static final /* data */ class AdditionalButtonDTO {
                    public static final int $stable = 8;
                    private final AtomActionDTO action;

                    @NotNull
                    private final Object button;
                    private final Map<String, TokenizedTrackingInfo> trackingInfo;

                    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;", "", "incrementButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus$ChangeQuantityButton;", "decrementButton", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus$ChangeQuantityButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus$ChangeQuantityButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getIncrementButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus$ChangeQuantityButton;", "getDecrementButton", "getPlaceholder", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ChangeQuantityButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    @j(generateAdapter = true)
                    public static final /* data */ class MinusPlus {
                        public static final int $stable = 8;

                        @NotNull
                        private final String backgroundColor;

                        @NotNull
                        private final ChangeQuantityButton decrementButton;

                        @NotNull
                        private final ChangeQuantityButton incrementButton;
                        private final TextAtom placeholder;

                        @j(generateAdapter = true)
                        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus$ChangeQuantityButton;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public static final /* data */ class ChangeQuantityButton {
                            public static final int $stable = 8;
                            private final AtomActionDTO action;
                            private final Map<String, TokenizedTrackingInfo> trackingInfo;

                            public ChangeQuantityButton(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                                this.action = atomActionDTO;
                                this.trackingInfo = map;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public static /* synthetic */ ChangeQuantityButton copy$default(ChangeQuantityButton changeQuantityButton, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                                if ((i11 & 1) != 0) {
                                    atomActionDTO = changeQuantityButton.action;
                                }
                                if ((i11 & 2) != 0) {
                                    map = changeQuantityButton.trackingInfo;
                                }
                                return changeQuantityButton.copy(atomActionDTO, map);
                            }

                            /* renamed from: component1, reason: from getter */
                            public final AtomActionDTO getAction() {
                                return this.action;
                            }

                            public final Map<String, TokenizedTrackingInfo> component2() {
                                return this.trackingInfo;
                            }

                            @NotNull
                            public final ChangeQuantityButton copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                                return new ChangeQuantityButton(action, trackingInfo);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof ChangeQuantityButton)) {
                                    return false;
                                }
                                ChangeQuantityButton changeQuantityButton = (ChangeQuantityButton) other;
                                return Intrinsics.d(this.action, changeQuantityButton.action) && Intrinsics.d(this.trackingInfo, changeQuantityButton.trackingInfo);
                            }

                            public final AtomActionDTO getAction() {
                                return this.action;
                            }

                            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                                return this.trackingInfo;
                            }

                            public int hashCode() {
                                AtomActionDTO atomActionDTO = this.action;
                                int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
                                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                                return hashCode + (map != null ? map.hashCode() : 0);
                            }

                            @NotNull
                            public String toString() {
                                return "ChangeQuantityButton(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
                            }
                        }

                        public MinusPlus(@NotNull ChangeQuantityButton incrementButton, @NotNull ChangeQuantityButton decrementButton, TextAtom textAtom, @NotNull String backgroundColor) {
                            Intrinsics.checkNotNullParameter(incrementButton, "incrementButton");
                            Intrinsics.checkNotNullParameter(decrementButton, "decrementButton");
                            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                            this.incrementButton = incrementButton;
                            this.decrementButton = decrementButton;
                            this.placeholder = textAtom;
                            this.backgroundColor = backgroundColor;
                        }

                        public static /* synthetic */ MinusPlus copy$default(MinusPlus minusPlus, ChangeQuantityButton changeQuantityButton, ChangeQuantityButton changeQuantityButton2, TextAtom textAtom, String str, int i11, Object obj) {
                            if ((i11 & 1) != 0) {
                                changeQuantityButton = minusPlus.incrementButton;
                            }
                            if ((i11 & 2) != 0) {
                                changeQuantityButton2 = minusPlus.decrementButton;
                            }
                            if ((i11 & 4) != 0) {
                                textAtom = minusPlus.placeholder;
                            }
                            if ((i11 & 8) != 0) {
                                str = minusPlus.backgroundColor;
                            }
                            return minusPlus.copy(changeQuantityButton, changeQuantityButton2, textAtom, str);
                        }

                        @NotNull
                        /* renamed from: component1, reason: from getter */
                        public final ChangeQuantityButton getIncrementButton() {
                            return this.incrementButton;
                        }

                        @NotNull
                        /* renamed from: component2, reason: from getter */
                        public final ChangeQuantityButton getDecrementButton() {
                            return this.decrementButton;
                        }

                        /* renamed from: component3, reason: from getter */
                        public final TextAtom getPlaceholder() {
                            return this.placeholder;
                        }

                        @NotNull
                        /* renamed from: component4, reason: from getter */
                        public final String getBackgroundColor() {
                            return this.backgroundColor;
                        }

                        @NotNull
                        public final MinusPlus copy(@NotNull ChangeQuantityButton incrementButton, @NotNull ChangeQuantityButton decrementButton, TextAtom placeholder, @NotNull String backgroundColor) {
                            Intrinsics.checkNotNullParameter(incrementButton, "incrementButton");
                            Intrinsics.checkNotNullParameter(decrementButton, "decrementButton");
                            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                            return new MinusPlus(incrementButton, decrementButton, placeholder, backgroundColor);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof MinusPlus)) {
                                return false;
                            }
                            MinusPlus minusPlus = (MinusPlus) other;
                            return Intrinsics.d(this.incrementButton, minusPlus.incrementButton) && Intrinsics.d(this.decrementButton, minusPlus.decrementButton) && Intrinsics.d(this.placeholder, minusPlus.placeholder) && Intrinsics.d(this.backgroundColor, minusPlus.backgroundColor);
                        }

                        @NotNull
                        public final String getBackgroundColor() {
                            return this.backgroundColor;
                        }

                        @NotNull
                        public final ChangeQuantityButton getDecrementButton() {
                            return this.decrementButton;
                        }

                        @NotNull
                        public final ChangeQuantityButton getIncrementButton() {
                            return this.incrementButton;
                        }

                        public final TextAtom getPlaceholder() {
                            return this.placeholder;
                        }

                        public int hashCode() {
                            int hashCode = (this.decrementButton.hashCode() + (this.incrementButton.hashCode() * 31)) * 31;
                            TextAtom textAtom = this.placeholder;
                            return this.backgroundColor.hashCode() + ((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31);
                        }

                        @NotNull
                        public String toString() {
                            return "MinusPlus(incrementButton=" + this.incrementButton + ", decrementButton=" + this.decrementButton + ", placeholder=" + this.placeholder + ", backgroundColor=" + this.backgroundColor + ")";
                        }
                    }

                    public AdditionalButtonDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "minusPlus", type = MinusPlus.class), @ProtoOneOfSignature(name = "iconButton", type = ButtonV3Atom.SmallIconButton.class)}) @NotNull @ProtoOneOf(label = "type") Object button, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                        Intrinsics.checkNotNullParameter(button, "button");
                        this.button = button;
                        this.action = atomActionDTO;
                        this.trackingInfo = map;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ AdditionalButtonDTO copy$default(AdditionalButtonDTO additionalButtonDTO, Object obj, AtomActionDTO atomActionDTO, Map map, int i11, Object obj2) {
                        if ((i11 & 1) != 0) {
                            obj = additionalButtonDTO.button;
                        }
                        if ((i11 & 2) != 0) {
                            atomActionDTO = additionalButtonDTO.action;
                        }
                        if ((i11 & 4) != 0) {
                            map = additionalButtonDTO.trackingInfo;
                        }
                        return additionalButtonDTO.copy(obj, atomActionDTO, map);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final Object getButton() {
                        return this.button;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    public final Map<String, TokenizedTrackingInfo> component3() {
                        return this.trackingInfo;
                    }

                    @NotNull
                    public final AdditionalButtonDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "minusPlus", type = MinusPlus.class), @ProtoOneOfSignature(name = "iconButton", type = ButtonV3Atom.SmallIconButton.class)}) @NotNull @ProtoOneOf(label = "type") Object button, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                        Intrinsics.checkNotNullParameter(button, "button");
                        return new AdditionalButtonDTO(button, action, trackingInfo);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof AdditionalButtonDTO)) {
                            return false;
                        }
                        AdditionalButtonDTO additionalButtonDTO = (AdditionalButtonDTO) other;
                        return Intrinsics.d(this.button, additionalButtonDTO.button) && Intrinsics.d(this.action, additionalButtonDTO.action) && Intrinsics.d(this.trackingInfo, additionalButtonDTO.trackingInfo);
                    }

                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    @NotNull
                    public final Object getButton() {
                        return this.button;
                    }

                    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                        return this.trackingInfo;
                    }

                    public int hashCode() {
                        int hashCode = this.button.hashCode() * 31;
                        AtomActionDTO atomActionDTO = this.action;
                        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        return hashCode2 + (map != null ? map.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        Object obj = this.button;
                        AtomActionDTO atomActionDTO = this.action;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        StringBuilder sb2 = new StringBuilder("AdditionalButtonDTO(button=");
                        sb2.append(obj);
                        sb2.append(", action=");
                        sb2.append(atomActionDTO);
                        sb2.append(", trackingInfo=");
                        return P.f(sb2, map, ")");
                    }
                }

                public Buttons(@NotNull CartButton buttonWithIcon, AdditionalButtonDTO additionalButtonDTO) {
                    Intrinsics.checkNotNullParameter(buttonWithIcon, "buttonWithIcon");
                    this.buttonWithIcon = buttonWithIcon;
                    this.additionalButton = additionalButtonDTO;
                }

                public static /* synthetic */ Buttons copy$default(Buttons buttons, CartButton cartButton, AdditionalButtonDTO additionalButtonDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        cartButton = buttons.buttonWithIcon;
                    }
                    if ((i11 & 2) != 0) {
                        additionalButtonDTO = buttons.additionalButton;
                    }
                    return buttons.copy(cartButton, additionalButtonDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final CartButton getButtonWithIcon() {
                    return this.buttonWithIcon;
                }

                /* renamed from: component2, reason: from getter */
                public final AdditionalButtonDTO getAdditionalButton() {
                    return this.additionalButton;
                }

                @NotNull
                public final Buttons copy(@NotNull CartButton buttonWithIcon, AdditionalButtonDTO additionalButton) {
                    Intrinsics.checkNotNullParameter(buttonWithIcon, "buttonWithIcon");
                    return new Buttons(buttonWithIcon, additionalButton);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Buttons)) {
                        return false;
                    }
                    Buttons buttons = (Buttons) other;
                    return Intrinsics.d(this.buttonWithIcon, buttons.buttonWithIcon) && Intrinsics.d(this.additionalButton, buttons.additionalButton);
                }

                public final AdditionalButtonDTO getAdditionalButton() {
                    return this.additionalButton;
                }

                @NotNull
                public final CartButton getButtonWithIcon() {
                    return this.buttonWithIcon;
                }

                public int hashCode() {
                    int hashCode = this.buttonWithIcon.hashCode() * 31;
                    AdditionalButtonDTO additionalButtonDTO = this.additionalButton;
                    return hashCode + (additionalButtonDTO == null ? 0 : additionalButtonDTO.hashCode());
                }

                @NotNull
                public String toString() {
                    return "Buttons(buttonWithIcon=" + this.buttonWithIcon + ", additionalButton=" + this.additionalButton + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CartData(boolean z11, @NotNull Buttons inCart, @NotNull Buttons toCart, int i11, int i12, Integer num, Integer num2) {
                super(null);
                Intrinsics.checkNotNullParameter(inCart, "inCart");
                Intrinsics.checkNotNullParameter(toCart, "toCart");
                this.isInCart = z11;
                this.inCart = inCart;
                this.toCart = toCart;
                this.inCartQty = i11;
                this.freeRest = i12;
                this.minAddToCartQuantity = num;
                this.multiplicityValue = num2;
            }

            public static /* synthetic */ CartData copy$default(CartData cartData, boolean z11, Buttons buttons, Buttons buttons2, int i11, int i12, Integer num, Integer num2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    z11 = cartData.isInCart;
                }
                if ((i13 & 2) != 0) {
                    buttons = cartData.inCart;
                }
                if ((i13 & 4) != 0) {
                    buttons2 = cartData.toCart;
                }
                if ((i13 & 8) != 0) {
                    i11 = cartData.inCartQty;
                }
                if ((i13 & 16) != 0) {
                    i12 = cartData.freeRest;
                }
                if ((i13 & 32) != 0) {
                    num = cartData.minAddToCartQuantity;
                }
                if ((i13 & 64) != 0) {
                    num2 = cartData.multiplicityValue;
                }
                Integer num3 = num;
                Integer num4 = num2;
                int i14 = i12;
                Buttons buttons3 = buttons2;
                return cartData.copy(z11, buttons, buttons3, i11, i14, num3, num4);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsInCart() {
                return this.isInCart;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Buttons getInCart() {
                return this.inCart;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Buttons getToCart() {
                return this.toCart;
            }

            /* renamed from: component4, reason: from getter */
            public final int getInCartQty() {
                return this.inCartQty;
            }

            /* renamed from: component5, reason: from getter */
            public final int getFreeRest() {
                return this.freeRest;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getMinAddToCartQuantity() {
                return this.minAddToCartQuantity;
            }

            /* renamed from: component7, reason: from getter */
            public final Integer getMultiplicityValue() {
                return this.multiplicityValue;
            }

            @NotNull
            public final CartData copy(boolean isInCart, @NotNull Buttons inCart, @NotNull Buttons toCart, int inCartQty, int freeRest, Integer minAddToCartQuantity, Integer multiplicityValue) {
                Intrinsics.checkNotNullParameter(inCart, "inCart");
                Intrinsics.checkNotNullParameter(toCart, "toCart");
                return new CartData(isInCart, inCart, toCart, inCartQty, freeRest, minAddToCartQuantity, multiplicityValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CartData)) {
                    return false;
                }
                CartData cartData = (CartData) other;
                return this.isInCart == cartData.isInCart && Intrinsics.d(this.inCart, cartData.inCart) && Intrinsics.d(this.toCart, cartData.toCart) && this.inCartQty == cartData.inCartQty && this.freeRest == cartData.freeRest && Intrinsics.d(this.minAddToCartQuantity, cartData.minAddToCartQuantity) && Intrinsics.d(this.multiplicityValue, cartData.multiplicityValue);
            }

            public final int getFreeRest() {
                return this.freeRest;
            }

            @NotNull
            public final Buttons getInCart() {
                return this.inCart;
            }

            public final int getInCartQty() {
                return this.inCartQty;
            }

            public final Integer getMinAddToCartQuantity() {
                return this.minAddToCartQuantity;
            }

            public final Integer getMultiplicityValue() {
                return this.multiplicityValue;
            }

            @NotNull
            public final Buttons getToCart() {
                return this.toCart;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.freeRest, C2454a.a(this.inCartQty, (this.toCart.hashCode() + ((this.inCart.hashCode() + (Boolean.hashCode(this.isInCart) * 31)) * 31)) * 31, 31), 31);
                Integer num = this.minAddToCartQuantity;
                int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.multiplicityValue;
                return hashCode + (num2 != null ? num2.hashCode() : 0);
            }

            public final boolean isInCart() {
                return this.isInCart;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isInCart;
                Buttons buttons = this.inCart;
                Buttons buttons2 = this.toCart;
                int i11 = this.inCartQty;
                int i12 = this.freeRest;
                Integer num = this.minAddToCartQuantity;
                Integer num2 = this.multiplicityValue;
                StringBuilder sb2 = new StringBuilder("CartData(isInCart=");
                sb2.append(z11);
                sb2.append(", inCart=");
                sb2.append(buttons);
                sb2.append(", toCart=");
                sb2.append(buttons2);
                sb2.append(", inCartQty=");
                sb2.append(i11);
                sb2.append(", freeRest=");
                sb2.append(i12);
                sb2.append(", minAddToCartQuantity=");
                sb2.append(num);
                sb2.append(", multiplicityValue=");
                return Ep.a.c(sb2, num2, ")");
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DeliveryData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "total", "", "quantitySelector", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DeliveryData$QuantitySelector;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DeliveryData$QuantitySelector;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTotal", "()Ljava/lang/String;", "getQuantitySelector", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DeliveryData$QuantitySelector;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "QuantitySelector", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class DeliveryData extends Configuration {
            public static final int $stable = ButtonV3Atom.LargeButton.$stable;

            @NotNull
            private final ButtonV3Atom.LargeButton button;

            @NotNull
            private final QuantitySelector quantitySelector;

            @NotNull
            private final String total;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DeliveryData$QuantitySelector;", "", "current", "", "maxQuantity", "maxQuantityString", "", "refreshDeeplink", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getCurrent", "()I", "getMaxQuantity", "getMaxQuantityString", "()Ljava/lang/String;", "getRefreshDeeplink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class QuantitySelector {
                public static final int $stable = 0;
                private final int current;
                private final int maxQuantity;

                @NotNull
                private final String maxQuantityString;

                @NotNull
                private final String refreshDeeplink;

                public QuantitySelector(int i11, int i12, @NotNull String maxQuantityString, @NotNull String refreshDeeplink) {
                    Intrinsics.checkNotNullParameter(maxQuantityString, "maxQuantityString");
                    Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
                    this.current = i11;
                    this.maxQuantity = i12;
                    this.maxQuantityString = maxQuantityString;
                    this.refreshDeeplink = refreshDeeplink;
                }

                public static /* synthetic */ QuantitySelector copy$default(QuantitySelector quantitySelector, int i11, int i12, String str, String str2, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        i11 = quantitySelector.current;
                    }
                    if ((i13 & 2) != 0) {
                        i12 = quantitySelector.maxQuantity;
                    }
                    if ((i13 & 4) != 0) {
                        str = quantitySelector.maxQuantityString;
                    }
                    if ((i13 & 8) != 0) {
                        str2 = quantitySelector.refreshDeeplink;
                    }
                    return quantitySelector.copy(i11, i12, str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final int getCurrent() {
                    return this.current;
                }

                /* renamed from: component2, reason: from getter */
                public final int getMaxQuantity() {
                    return this.maxQuantity;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getMaxQuantityString() {
                    return this.maxQuantityString;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final String getRefreshDeeplink() {
                    return this.refreshDeeplink;
                }

                @NotNull
                public final QuantitySelector copy(int current, int maxQuantity, @NotNull String maxQuantityString, @NotNull String refreshDeeplink) {
                    Intrinsics.checkNotNullParameter(maxQuantityString, "maxQuantityString");
                    Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
                    return new QuantitySelector(current, maxQuantity, maxQuantityString, refreshDeeplink);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuantitySelector)) {
                        return false;
                    }
                    QuantitySelector quantitySelector = (QuantitySelector) other;
                    return this.current == quantitySelector.current && this.maxQuantity == quantitySelector.maxQuantity && Intrinsics.d(this.maxQuantityString, quantitySelector.maxQuantityString) && Intrinsics.d(this.refreshDeeplink, quantitySelector.refreshDeeplink);
                }

                public final int getCurrent() {
                    return this.current;
                }

                public final int getMaxQuantity() {
                    return this.maxQuantity;
                }

                @NotNull
                public final String getMaxQuantityString() {
                    return this.maxQuantityString;
                }

                @NotNull
                public final String getRefreshDeeplink() {
                    return this.refreshDeeplink;
                }

                public int hashCode() {
                    return this.refreshDeeplink.hashCode() + g.a(C2454a.a(this.maxQuantity, Integer.hashCode(this.current) * 31, 31), 31, this.maxQuantityString);
                }

                @NotNull
                public String toString() {
                    int i11 = this.current;
                    int i12 = this.maxQuantity;
                    return C3173b.c(C2438a.a("QuantitySelector(current=", i11, ", maxQuantity=", ", maxQuantityString=", i12), this.maxQuantityString, ", refreshDeeplink=", this.refreshDeeplink, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeliveryData(@NotNull ButtonV3Atom.LargeButton button, @NotNull String total, @NotNull QuantitySelector quantitySelector) {
                super(null);
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(total, "total");
                Intrinsics.checkNotNullParameter(quantitySelector, "quantitySelector");
                this.button = button;
                this.total = total;
                this.quantitySelector = quantitySelector;
            }

            public static /* synthetic */ DeliveryData copy$default(DeliveryData deliveryData, ButtonV3Atom.LargeButton largeButton, String str, QuantitySelector quantitySelector, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    largeButton = deliveryData.button;
                }
                if ((i11 & 2) != 0) {
                    str = deliveryData.total;
                }
                if ((i11 & 4) != 0) {
                    quantitySelector = deliveryData.quantitySelector;
                }
                return deliveryData.copy(largeButton, str, quantitySelector);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.LargeButton getButton() {
                return this.button;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTotal() {
                return this.total;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final QuantitySelector getQuantitySelector() {
                return this.quantitySelector;
            }

            @NotNull
            public final DeliveryData copy(@NotNull ButtonV3Atom.LargeButton button, @NotNull String total, @NotNull QuantitySelector quantitySelector) {
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(total, "total");
                Intrinsics.checkNotNullParameter(quantitySelector, "quantitySelector");
                return new DeliveryData(button, total, quantitySelector);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeliveryData)) {
                    return false;
                }
                DeliveryData deliveryData = (DeliveryData) other;
                return Intrinsics.d(this.button, deliveryData.button) && Intrinsics.d(this.total, deliveryData.total) && Intrinsics.d(this.quantitySelector, deliveryData.quantitySelector);
            }

            @NotNull
            public final ButtonV3Atom.LargeButton getButton() {
                return this.button;
            }

            @NotNull
            public final QuantitySelector getQuantitySelector() {
                return this.quantitySelector;
            }

            @NotNull
            public final String getTotal() {
                return this.total;
            }

            public int hashCode() {
                return this.quantitySelector.hashCode() + g.a(this.button.hashCode() * 31, 31, this.total);
            }

            @NotNull
            public String toString() {
                return "DeliveryData(button=" + this.button + ", total=" + this.total + ", quantitySelector=" + this.quantitySelector + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$DoubleCartData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "firstCartButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;", "secondCartButton", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;)V", "getFirstCartButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData;", "getSecondCartButton", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DoubleCartData extends Configuration {
            public static final int $stable = 8;

            @NotNull
            private final CartData firstCartButton;

            @NotNull
            private final CartData secondCartButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoubleCartData(@NotNull CartData firstCartButton, @NotNull CartData secondCartButton) {
                super(null);
                Intrinsics.checkNotNullParameter(firstCartButton, "firstCartButton");
                Intrinsics.checkNotNullParameter(secondCartButton, "secondCartButton");
                this.firstCartButton = firstCartButton;
                this.secondCartButton = secondCartButton;
            }

            public static /* synthetic */ DoubleCartData copy$default(DoubleCartData doubleCartData, CartData cartData, CartData cartData2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cartData = doubleCartData.firstCartButton;
                }
                if ((i11 & 2) != 0) {
                    cartData2 = doubleCartData.secondCartButton;
                }
                return doubleCartData.copy(cartData, cartData2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CartData getFirstCartButton() {
                return this.firstCartButton;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CartData getSecondCartButton() {
                return this.secondCartButton;
            }

            @NotNull
            public final DoubleCartData copy(@NotNull CartData firstCartButton, @NotNull CartData secondCartButton) {
                Intrinsics.checkNotNullParameter(firstCartButton, "firstCartButton");
                Intrinsics.checkNotNullParameter(secondCartButton, "secondCartButton");
                return new DoubleCartData(firstCartButton, secondCartButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleCartData)) {
                    return false;
                }
                DoubleCartData doubleCartData = (DoubleCartData) other;
                return Intrinsics.d(this.firstCartButton, doubleCartData.firstCartButton) && Intrinsics.d(this.secondCartButton, doubleCartData.secondCartButton);
            }

            @NotNull
            public final CartData getFirstCartButton() {
                return this.firstCartButton;
            }

            @NotNull
            public final CartData getSecondCartButton() {
                return this.secondCartButton;
            }

            public int hashCode() {
                return this.secondCartButton.hashCode() + (this.firstCartButton.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "DoubleCartData(firstCartButton=" + this.firstCartButton + ", secondCartButton=" + this.secondCartButton + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$PlainData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "asyncFetchType", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;)V", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAsyncFetchType", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PlainData extends Configuration {
            public static final int $stable = ButtonV3Atom.LargeButton.$stable;

            @NotNull
            private final ButtonV3Atom.LargeButton actionButton;
            private final AsyncFetchType asyncFetchType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlainData(@NotNull ButtonV3Atom.LargeButton actionButton, AsyncFetchType asyncFetchType) {
                super(null);
                Intrinsics.checkNotNullParameter(actionButton, "actionButton");
                this.actionButton = actionButton;
                this.asyncFetchType = asyncFetchType;
            }

            public static /* synthetic */ PlainData copy$default(PlainData plainData, ButtonV3Atom.LargeButton largeButton, AsyncFetchType asyncFetchType, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    largeButton = plainData.actionButton;
                }
                if ((i11 & 2) != 0) {
                    asyncFetchType = plainData.asyncFetchType;
                }
                return plainData.copy(largeButton, asyncFetchType);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.LargeButton getActionButton() {
                return this.actionButton;
            }

            /* renamed from: component2, reason: from getter */
            public final AsyncFetchType getAsyncFetchType() {
                return this.asyncFetchType;
            }

            @NotNull
            public final PlainData copy(@NotNull ButtonV3Atom.LargeButton actionButton, AsyncFetchType asyncFetchType) {
                Intrinsics.checkNotNullParameter(actionButton, "actionButton");
                return new PlainData(actionButton, asyncFetchType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlainData)) {
                    return false;
                }
                PlainData plainData = (PlainData) other;
                return Intrinsics.d(this.actionButton, plainData.actionButton) && this.asyncFetchType == plainData.asyncFetchType;
            }

            @NotNull
            public final ButtonV3Atom.LargeButton getActionButton() {
                return this.actionButton;
            }

            public final AsyncFetchType getAsyncFetchType() {
                return this.asyncFetchType;
            }

            public int hashCode() {
                int hashCode = this.actionButton.hashCode() * 31;
                AsyncFetchType asyncFetchType = this.asyncFetchType;
                return hashCode + (asyncFetchType == null ? 0 : asyncFetchType.hashCode());
            }

            @NotNull
            public String toString() {
                return "PlainData(actionButton=" + this.actionButton + ", asyncFetchType=" + this.asyncFetchType + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$SubscribeData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration;", "isSubscribed", "", "subscribe", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "priorityColors", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "<init>", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;)V", "()Z", "getSubscribe", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getUnsubscribe", "getPriorityColors", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubscribeData extends Configuration {
            public static final int $stable = ButtonV3Atom.LargeButton.$stable;
            private final boolean isSubscribed;
            private final ButtonColors priorityColors;

            @NotNull
            private final ButtonV3Atom.LargeButton subscribe;

            @NotNull
            private final ButtonV3Atom.LargeButton unsubscribe;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscribeData(boolean z11, @NotNull ButtonV3Atom.LargeButton subscribe, @NotNull ButtonV3Atom.LargeButton unsubscribe, ButtonColors buttonColors) {
                super(null);
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(unsubscribe, "unsubscribe");
                this.isSubscribed = z11;
                this.subscribe = subscribe;
                this.unsubscribe = unsubscribe;
                this.priorityColors = buttonColors;
            }

            public static /* synthetic */ SubscribeData copy$default(SubscribeData subscribeData, boolean z11, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, ButtonColors buttonColors, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = subscribeData.isSubscribed;
                }
                if ((i11 & 2) != 0) {
                    largeButton = subscribeData.subscribe;
                }
                if ((i11 & 4) != 0) {
                    largeButton2 = subscribeData.unsubscribe;
                }
                if ((i11 & 8) != 0) {
                    buttonColors = subscribeData.priorityColors;
                }
                return subscribeData.copy(z11, largeButton, largeButton2, buttonColors);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ButtonV3Atom.LargeButton getSubscribe() {
                return this.subscribe;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final ButtonV3Atom.LargeButton getUnsubscribe() {
                return this.unsubscribe;
            }

            /* renamed from: component4, reason: from getter */
            public final ButtonColors getPriorityColors() {
                return this.priorityColors;
            }

            @NotNull
            public final SubscribeData copy(boolean isSubscribed, @NotNull ButtonV3Atom.LargeButton subscribe, @NotNull ButtonV3Atom.LargeButton unsubscribe, ButtonColors priorityColors) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(unsubscribe, "unsubscribe");
                return new SubscribeData(isSubscribed, subscribe, unsubscribe, priorityColors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubscribeData)) {
                    return false;
                }
                SubscribeData subscribeData = (SubscribeData) other;
                return this.isSubscribed == subscribeData.isSubscribed && Intrinsics.d(this.subscribe, subscribeData.subscribe) && Intrinsics.d(this.unsubscribe, subscribeData.unsubscribe) && Intrinsics.d(this.priorityColors, subscribeData.priorityColors);
            }

            public final ButtonColors getPriorityColors() {
                return this.priorityColors;
            }

            @NotNull
            public final ButtonV3Atom.LargeButton getSubscribe() {
                return this.subscribe;
            }

            @NotNull
            public final ButtonV3Atom.LargeButton getUnsubscribe() {
                return this.unsubscribe;
            }

            public int hashCode() {
                int a11 = Tl.b.a(this.unsubscribe, Tl.b.a(this.subscribe, Boolean.hashCode(this.isSubscribed) * 31, 31), 31);
                ButtonColors buttonColors = this.priorityColors;
                return a11 + (buttonColors == null ? 0 : buttonColors.hashCode());
            }

            public final boolean isSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            public String toString() {
                return "SubscribeData(isSubscribed=" + this.isSubscribed + ", subscribe=" + this.subscribe + ", unsubscribe=" + this.unsubscribe + ", priorityColors=" + this.priorityColors + ")";
            }
        }

        public /* synthetic */ Configuration(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Configuration() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010\u001a\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;", "", "open", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "miniCloseSwipe", "miniCloseTap", "openFull", "closeFull", "reopenFull", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getOpen", "()Ljava/util/Map;", "getMiniCloseSwipe", "getMiniCloseTap", "getOpenFull", "getCloseFull", "getReopenFull", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CurtainTrackingInfo {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> closeFull;
        private final Map<String, TokenizedTrackingInfo> miniCloseSwipe;
        private final Map<String, TokenizedTrackingInfo> miniCloseTap;
        private final Map<String, TokenizedTrackingInfo> open;
        private final Map<String, TokenizedTrackingInfo> openFull;
        private final Map<String, TokenizedTrackingInfo> reopenFull;

        public CurtainTrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, Map<String, TokenizedTrackingInfo> map5, Map<String, TokenizedTrackingInfo> map6) {
            this.open = map;
            this.miniCloseSwipe = map2;
            this.miniCloseTap = map3;
            this.openFull = map4;
            this.closeFull = map5;
            this.reopenFull = map6;
        }

        public static /* synthetic */ CurtainTrackingInfo copy$default(CurtainTrackingInfo curtainTrackingInfo, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = curtainTrackingInfo.open;
            }
            if ((i11 & 2) != 0) {
                map2 = curtainTrackingInfo.miniCloseSwipe;
            }
            if ((i11 & 4) != 0) {
                map3 = curtainTrackingInfo.miniCloseTap;
            }
            if ((i11 & 8) != 0) {
                map4 = curtainTrackingInfo.openFull;
            }
            if ((i11 & 16) != 0) {
                map5 = curtainTrackingInfo.closeFull;
            }
            if ((i11 & 32) != 0) {
                map6 = curtainTrackingInfo.reopenFull;
            }
            Map map7 = map5;
            Map map8 = map6;
            return curtainTrackingInfo.copy(map, map2, map3, map4, map7, map8);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.open;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.miniCloseSwipe;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.miniCloseTap;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.openFull;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.closeFull;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.reopenFull;
        }

        @NotNull
        public final CurtainTrackingInfo copy(Map<String, TokenizedTrackingInfo> open, Map<String, TokenizedTrackingInfo> miniCloseSwipe, Map<String, TokenizedTrackingInfo> miniCloseTap, Map<String, TokenizedTrackingInfo> openFull, Map<String, TokenizedTrackingInfo> closeFull, Map<String, TokenizedTrackingInfo> reopenFull) {
            return new CurtainTrackingInfo(open, miniCloseSwipe, miniCloseTap, openFull, closeFull, reopenFull);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurtainTrackingInfo)) {
                return false;
            }
            CurtainTrackingInfo curtainTrackingInfo = (CurtainTrackingInfo) other;
            return Intrinsics.d(this.open, curtainTrackingInfo.open) && Intrinsics.d(this.miniCloseSwipe, curtainTrackingInfo.miniCloseSwipe) && Intrinsics.d(this.miniCloseTap, curtainTrackingInfo.miniCloseTap) && Intrinsics.d(this.openFull, curtainTrackingInfo.openFull) && Intrinsics.d(this.closeFull, curtainTrackingInfo.closeFull) && Intrinsics.d(this.reopenFull, curtainTrackingInfo.reopenFull);
        }

        public final Map<String, TokenizedTrackingInfo> getCloseFull() {
            return this.closeFull;
        }

        public final Map<String, TokenizedTrackingInfo> getMiniCloseSwipe() {
            return this.miniCloseSwipe;
        }

        public final Map<String, TokenizedTrackingInfo> getMiniCloseTap() {
            return this.miniCloseTap;
        }

        public final Map<String, TokenizedTrackingInfo> getOpen() {
            return this.open;
        }

        public final Map<String, TokenizedTrackingInfo> getOpenFull() {
            return this.openFull;
        }

        public final Map<String, TokenizedTrackingInfo> getReopenFull() {
            return this.reopenFull;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.open;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.miniCloseSwipe;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.miniCloseTap;
            int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map4 = this.openFull;
            int hashCode4 = (hashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map5 = this.closeFull;
            int hashCode5 = (hashCode4 + (map5 == null ? 0 : map5.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map6 = this.reopenFull;
            return hashCode5 + (map6 != null ? map6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Map<String, TokenizedTrackingInfo> map = this.open;
            Map<String, TokenizedTrackingInfo> map2 = this.miniCloseSwipe;
            Map<String, TokenizedTrackingInfo> map3 = this.miniCloseTap;
            Map<String, TokenizedTrackingInfo> map4 = this.openFull;
            Map<String, TokenizedTrackingInfo> map5 = this.closeFull;
            Map<String, TokenizedTrackingInfo> map6 = this.reopenFull;
            StringBuilder sb2 = new StringBuilder("CurtainTrackingInfo(open=");
            sb2.append(map);
            sb2.append(", miniCloseSwipe=");
            sb2.append(map2);
            sb2.append(", miniCloseTap=");
            Tl.b.g(sb2, map3, ", openFull=", map4, ", closeFull=");
            return V.c(sb2, map5, ", reopenFull=", map6, ")");
        }
    }

    public CartButtonV4Dto(long j11, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "plain", type = Configuration.PlainData.class), @ProtoOneOfSignature(name = "subscribe", type = Configuration.SubscribeData.class), @ProtoOneOfSignature(name = "cart", type = Configuration.CartData.class), @ProtoOneOfSignature(name = "delivery", type = Configuration.DeliveryData.class), @ProtoOneOfSignature(name = "doubleCart", type = Configuration.DoubleCartData.class)}) @NotNull @ProtoOneOf(label = "type") Configuration configuration, boolean z11, CartButtonStyle cartButtonStyle, Map<String, TokenizedTrackingInfo> map, NotificationAtom.NotificationWithIcon notificationWithIcon, NotificationBar notificationBar, String str, CurtainTrackingInfo curtainTrackingInfo) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.sku = j11;
        this.configuration = configuration;
        this.needsShadow = z11;
        this.style = cartButtonStyle;
        this.trackingInfo = map;
        this.notification = notificationWithIcon;
        this.notificationBar = notificationBar;
        this.relatedProductsCurtain = str;
        this.curtainTrackingInfo = curtainTrackingInfo;
    }

    public static /* synthetic */ CartButtonV4Dto copy$default(CartButtonV4Dto cartButtonV4Dto, long j11, Configuration configuration, boolean z11, CartButtonStyle cartButtonStyle, Map map, NotificationAtom.NotificationWithIcon notificationWithIcon, NotificationBar notificationBar, String str, CurtainTrackingInfo curtainTrackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cartButtonV4Dto.sku;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            configuration = cartButtonV4Dto.configuration;
        }
        Configuration configuration2 = configuration;
        if ((i11 & 4) != 0) {
            z11 = cartButtonV4Dto.needsShadow;
        }
        return cartButtonV4Dto.copy(j12, configuration2, z11, (i11 & 8) != 0 ? cartButtonV4Dto.style : cartButtonStyle, (i11 & 16) != 0 ? cartButtonV4Dto.trackingInfo : map, (i11 & 32) != 0 ? cartButtonV4Dto.notification : notificationWithIcon, (i11 & 64) != 0 ? cartButtonV4Dto.notificationBar : notificationBar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButtonV4Dto.relatedProductsCurtain : str, (i11 & 256) != 0 ? cartButtonV4Dto.curtainTrackingInfo : curtainTrackingInfo);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getNotification$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedsShadow() {
        return this.needsShadow;
    }

    /* renamed from: component4, reason: from getter */
    public final CartButtonStyle getStyle() {
        return this.style;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    /* renamed from: component7, reason: from getter */
    public final NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    /* renamed from: component9, reason: from getter */
    public final CurtainTrackingInfo getCurtainTrackingInfo() {
        return this.curtainTrackingInfo;
    }

    @NotNull
    public final CartButtonV4Dto copy(long sku, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "plain", type = Configuration.PlainData.class), @ProtoOneOfSignature(name = "subscribe", type = Configuration.SubscribeData.class), @ProtoOneOfSignature(name = "cart", type = Configuration.CartData.class), @ProtoOneOfSignature(name = "delivery", type = Configuration.DeliveryData.class), @ProtoOneOfSignature(name = "doubleCart", type = Configuration.DoubleCartData.class)}) @NotNull @ProtoOneOf(label = "type") Configuration configuration, boolean needsShadow, CartButtonStyle style, Map<String, TokenizedTrackingInfo> trackingInfo, NotificationAtom.NotificationWithIcon notification, NotificationBar notificationBar, String relatedProductsCurtain, CurtainTrackingInfo curtainTrackingInfo) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new CartButtonV4Dto(sku, configuration, needsShadow, style, trackingInfo, notification, notificationBar, relatedProductsCurtain, curtainTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonV4Dto)) {
            return false;
        }
        CartButtonV4Dto cartButtonV4Dto = (CartButtonV4Dto) other;
        return this.sku == cartButtonV4Dto.sku && Intrinsics.d(this.configuration, cartButtonV4Dto.configuration) && this.needsShadow == cartButtonV4Dto.needsShadow && this.style == cartButtonV4Dto.style && Intrinsics.d(this.trackingInfo, cartButtonV4Dto.trackingInfo) && Intrinsics.d(this.notification, cartButtonV4Dto.notification) && Intrinsics.d(this.notificationBar, cartButtonV4Dto.notificationBar) && Intrinsics.d(this.relatedProductsCurtain, cartButtonV4Dto.relatedProductsCurtain) && Intrinsics.d(this.curtainTrackingInfo, cartButtonV4Dto.curtainTrackingInfo);
    }

    @NotNull
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final CurtainTrackingInfo getCurtainTrackingInfo() {
        return this.curtainTrackingInfo;
    }

    public final boolean getNeedsShadow() {
        return this.needsShadow;
    }

    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    public final NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    public final String getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    public final long getSku() {
        return this.sku;
    }

    public final CartButtonStyle getStyle() {
        return this.style;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a((this.configuration.hashCode() + (Long.hashCode(this.sku) * 31)) * 31, 31, this.needsShadow);
        CartButtonStyle cartButtonStyle = this.style;
        int hashCode = (a11 + (cartButtonStyle == null ? 0 : cartButtonStyle.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        NotificationAtom.NotificationWithIcon notificationWithIcon = this.notification;
        int hashCode3 = (hashCode2 + (notificationWithIcon == null ? 0 : notificationWithIcon.hashCode())) * 31;
        NotificationBar notificationBar = this.notificationBar;
        int hashCode4 = (hashCode3 + (notificationBar == null ? 0 : notificationBar.hashCode())) * 31;
        String str = this.relatedProductsCurtain;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CurtainTrackingInfo curtainTrackingInfo = this.curtainTrackingInfo;
        return hashCode5 + (curtainTrackingInfo != null ? curtainTrackingInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CartButtonV4Dto(sku=" + this.sku + ", configuration=" + this.configuration + ", needsShadow=" + this.needsShadow + ", style=" + this.style + ", trackingInfo=" + this.trackingInfo + ", notification=" + this.notification + ", notificationBar=" + this.notificationBar + ", relatedProductsCurtain=" + this.relatedProductsCurtain + ", curtainTrackingInfo=" + this.curtainTrackingInfo + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "presentationDelay", "", "restrictToCurrentComposer", "", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/lang/Integer;Z)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getPresentationDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRestrictToCurrentComposer", "()Z", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/lang/Integer;Z)Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "equals", "other", "hashCode", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationBar {
        public static final int $stable = 8;

        @NotNull
        private final NotificationModelWrapper notification;
        private final Integer presentationDelay;
        private final boolean restrictToCurrentComposer;

        public NotificationBar(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @NotNull @ProtoOneOf(label = "type") NotificationModelWrapper notification, Integer num, boolean z11) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.notification = notification;
            this.presentationDelay = num;
            this.restrictToCurrentComposer = z11;
        }

        public static /* synthetic */ NotificationBar copy$default(NotificationBar notificationBar, NotificationModelWrapper notificationModelWrapper, Integer num, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationModelWrapper = notificationBar.notification;
            }
            if ((i11 & 2) != 0) {
                num = notificationBar.presentationDelay;
            }
            if ((i11 & 4) != 0) {
                z11 = notificationBar.restrictToCurrentComposer;
            }
            return notificationBar.copy(notificationModelWrapper, num, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getPresentationDelay() {
            return this.presentationDelay;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRestrictToCurrentComposer() {
            return this.restrictToCurrentComposer;
        }

        @NotNull
        public final NotificationBar copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @NotNull @ProtoOneOf(label = "type") NotificationModelWrapper notification, Integer presentationDelay, boolean restrictToCurrentComposer) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            return new NotificationBar(notification, presentationDelay, restrictToCurrentComposer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationBar)) {
                return false;
            }
            NotificationBar notificationBar = (NotificationBar) other;
            return Intrinsics.d(this.notification, notificationBar.notification) && Intrinsics.d(this.presentationDelay, notificationBar.presentationDelay) && this.restrictToCurrentComposer == notificationBar.restrictToCurrentComposer;
        }

        @NotNull
        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        public final Integer getPresentationDelay() {
            return this.presentationDelay;
        }

        public final boolean getRestrictToCurrentComposer() {
            return this.restrictToCurrentComposer;
        }

        public int hashCode() {
            int hashCode = this.notification.hashCode() * 31;
            Integer num = this.presentationDelay;
            return Boolean.hashCode(this.restrictToCurrentComposer) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            NotificationModelWrapper notificationModelWrapper = this.notification;
            Integer num = this.presentationDelay;
            boolean z11 = this.restrictToCurrentComposer;
            StringBuilder sb2 = new StringBuilder("NotificationBar(notification=");
            sb2.append(notificationModelWrapper);
            sb2.append(", presentationDelay=");
            sb2.append(num);
            sb2.append(", restrictToCurrentComposer=");
            return Pk0.a.a(")", sb2, z11);
        }

        public /* synthetic */ NotificationBar(NotificationModelWrapper notificationModelWrapper, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(notificationModelWrapper, num, (i11 & 4) != 0 ? true : z11);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "buttonIcon", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton$ButtonIcon;", "originalButtonText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "asyncFetchType", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;", "priorityColors", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton$ButtonIcon;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButtonIcon", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton$ButtonIcon;", "getOriginalButtonText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAsyncFetchType", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;", "getPriorityColors", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonIcon", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CartButton {
        public static final int $stable = (OzonSpannableString.$stable | Icon.$stable) | ButtonV3Atom.LargeButton.$stable;
        private final AsyncFetchType asyncFetchType;
        private final BadgeDTO badge;

        @NotNull
        private final ButtonV3Atom.LargeButton button;
        private final ButtonIcon buttonIcon;

        @NotNull
        private final OzonSpannableString originalButtonText;
        private final ButtonColors priorityColors;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton$ButtonIcon;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonIcon {
            public static final int $stable = Icon.$stable;
            private final String backgroundColor;

            @NotNull
            private final Icon icon;

            public ButtonIcon(@NotNull Icon icon, String str) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.backgroundColor = str;
            }

            public static /* synthetic */ ButtonIcon copy$default(ButtonIcon buttonIcon, Icon icon, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    icon = buttonIcon.icon;
                }
                if ((i11 & 2) != 0) {
                    str = buttonIcon.backgroundColor;
                }
                return buttonIcon.copy(icon, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final ButtonIcon copy(@NotNull Icon icon, String backgroundColor) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new ButtonIcon(icon, backgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonIcon)) {
                    return false;
                }
                ButtonIcon buttonIcon = (ButtonIcon) other;
                return Intrinsics.d(this.icon, buttonIcon.icon) && Intrinsics.d(this.backgroundColor, buttonIcon.backgroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                String str = this.backgroundColor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "ButtonIcon(icon=" + this.icon + ", backgroundColor=" + this.backgroundColor + ")";
            }
        }

        public CartButton(@NotNull ButtonV3Atom.LargeButton button, ButtonIcon buttonIcon, @NotNull OzonSpannableString originalButtonText, AsyncFetchType asyncFetchType, ButtonColors buttonColors, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(originalButtonText, "originalButtonText");
            this.button = button;
            this.buttonIcon = buttonIcon;
            this.originalButtonText = originalButtonText;
            this.asyncFetchType = asyncFetchType;
            this.priorityColors = buttonColors;
            this.badge = badgeDTO;
        }

        public static /* synthetic */ CartButton copy$default(CartButton cartButton, ButtonV3Atom.LargeButton largeButton, ButtonIcon buttonIcon, OzonSpannableString ozonSpannableString, AsyncFetchType asyncFetchType, ButtonColors buttonColors, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                largeButton = cartButton.button;
            }
            if ((i11 & 2) != 0) {
                buttonIcon = cartButton.buttonIcon;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString = cartButton.originalButtonText;
            }
            if ((i11 & 8) != 0) {
                asyncFetchType = cartButton.asyncFetchType;
            }
            if ((i11 & 16) != 0) {
                buttonColors = cartButton.priorityColors;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = cartButton.badge;
            }
            ButtonColors buttonColors2 = buttonColors;
            BadgeDTO badgeDTO2 = badgeDTO;
            return cartButton.copy(largeButton, buttonIcon, ozonSpannableString, asyncFetchType, buttonColors2, badgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonIcon getButtonIcon() {
            return this.buttonIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getOriginalButtonText() {
            return this.originalButtonText;
        }

        /* renamed from: component4, reason: from getter */
        public final AsyncFetchType getAsyncFetchType() {
            return this.asyncFetchType;
        }

        /* renamed from: component5, reason: from getter */
        public final ButtonColors getPriorityColors() {
            return this.priorityColors;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final CartButton copy(@NotNull ButtonV3Atom.LargeButton button, ButtonIcon buttonIcon, @NotNull OzonSpannableString originalButtonText, AsyncFetchType asyncFetchType, ButtonColors priorityColors, BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(originalButtonText, "originalButtonText");
            return new CartButton(button, buttonIcon, originalButtonText, asyncFetchType, priorityColors, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartButton)) {
                return false;
            }
            CartButton cartButton = (CartButton) other;
            return Intrinsics.d(this.button, cartButton.button) && Intrinsics.d(this.buttonIcon, cartButton.buttonIcon) && Intrinsics.d(this.originalButtonText, cartButton.originalButtonText) && this.asyncFetchType == cartButton.asyncFetchType && Intrinsics.d(this.priorityColors, cartButton.priorityColors) && Intrinsics.d(this.badge, cartButton.badge);
        }

        public final AsyncFetchType getAsyncFetchType() {
            return this.asyncFetchType;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        public final ButtonIcon getButtonIcon() {
            return this.buttonIcon;
        }

        @NotNull
        public final OzonSpannableString getOriginalButtonText() {
            return this.originalButtonText;
        }

        public final ButtonColors getPriorityColors() {
            return this.priorityColors;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            ButtonIcon buttonIcon = this.buttonIcon;
            int c11 = P.c(this.originalButtonText, (hashCode + (buttonIcon == null ? 0 : buttonIcon.hashCode())) * 31, 31);
            AsyncFetchType asyncFetchType = this.asyncFetchType;
            int hashCode2 = (c11 + (asyncFetchType == null ? 0 : asyncFetchType.hashCode())) * 31;
            ButtonColors buttonColors = this.priorityColors;
            int hashCode3 = (hashCode2 + (buttonColors == null ? 0 : buttonColors.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ButtonV3Atom.LargeButton largeButton = this.button;
            ButtonIcon buttonIcon = this.buttonIcon;
            OzonSpannableString ozonSpannableString = this.originalButtonText;
            return "CartButton(button=" + largeButton + ", buttonIcon=" + buttonIcon + ", originalButtonText=" + ((Object) ozonSpannableString) + ", asyncFetchType=" + this.asyncFetchType + ", priorityColors=" + this.priorityColors + ", badge=" + this.badge + ")";
        }

        public /* synthetic */ CartButton(ButtonV3Atom.LargeButton largeButton, ButtonIcon buttonIcon, OzonSpannableString ozonSpannableString, AsyncFetchType asyncFetchType, ButtonColors buttonColors, BadgeDTO badgeDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(largeButton, buttonIcon, (i11 & 4) != 0 ? largeButton.getText() : ozonSpannableString, asyncFetchType, buttonColors, badgeDTO);
        }
    }
}
