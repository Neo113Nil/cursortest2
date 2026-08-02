package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.data;

import B0.A0;
import Bl.C2639a;
import C.o0;
import Co.a;
import Kk.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO;", "", "paymentMethods", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$PaymentMethod;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getPaymentMethods", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentMethod", "BankCard", "CustomMethod", "ImageBankCard", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPaymentV4DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<PaymentMethod> paymentMethods;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$BankCard;", "", "bankImage", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "paymentSystem", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;)V", "getBankImage", "()Ljava/lang/String;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPaymentSystem", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankCard {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String bankImage;
        private final TextDTO number;
        private final ImageDTO paymentSystem;

        public BankCard(String str, TextDTO textDTO, ImageDTO imageDTO, String str2) {
            this.bankImage = str;
            this.number = textDTO;
            this.paymentSystem = imageDTO;
            this.backgroundColor = str2;
        }

        public static /* synthetic */ BankCard copy$default(BankCard bankCard, String str, TextDTO textDTO, ImageDTO imageDTO, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bankCard.bankImage;
            }
            if ((i11 & 2) != 0) {
                textDTO = bankCard.number;
            }
            if ((i11 & 4) != 0) {
                imageDTO = bankCard.paymentSystem;
            }
            if ((i11 & 8) != 0) {
                str2 = bankCard.backgroundColor;
            }
            return bankCard.copy(str, textDTO, imageDTO, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBankImage() {
            return this.bankImage;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageDTO getPaymentSystem() {
            return this.paymentSystem;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final BankCard copy(String bankImage, TextDTO number, ImageDTO paymentSystem, String backgroundColor) {
            return new BankCard(bankImage, number, paymentSystem, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankCard)) {
                return false;
            }
            BankCard bankCard = (BankCard) other;
            return Intrinsics.d(this.bankImage, bankCard.bankImage) && Intrinsics.d(this.number, bankCard.number) && Intrinsics.d(this.paymentSystem, bankCard.paymentSystem) && Intrinsics.d(this.backgroundColor, bankCard.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBankImage() {
            return this.bankImage;
        }

        public final TextDTO getNumber() {
            return this.number;
        }

        public final ImageDTO getPaymentSystem() {
            return this.paymentSystem;
        }

        public int hashCode() {
            String str = this.bankImage;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            TextDTO textDTO = this.number;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.paymentSystem;
            int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            String str2 = this.backgroundColor;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.bankImage;
            TextDTO textDTO = this.number;
            ImageDTO imageDTO = this.paymentSystem;
            String str2 = this.backgroundColor;
            StringBuilder b11 = a.b("BankCard(bankImage=", textDTO, str, ", number=", ", paymentSystem=");
            b11.append(imageDTO);
            b11.append(", backgroundColor=");
            b11.append(str2);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$CustomMethod;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomMethod {
        public static final int $stable = IconDTO.$stable;
        private final String backgroundColor;
        private final IconDTO icon;
        private final TextDTO title;

        public CustomMethod(TextDTO textDTO, IconDTO iconDTO, String str) {
            this.title = textDTO;
            this.icon = iconDTO;
            this.backgroundColor = str;
        }

        public static /* synthetic */ CustomMethod copy$default(CustomMethod customMethod, TextDTO textDTO, IconDTO iconDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = customMethod.title;
            }
            if ((i11 & 2) != 0) {
                iconDTO = customMethod.icon;
            }
            if ((i11 & 4) != 0) {
                str = customMethod.backgroundColor;
            }
            return customMethod.copy(textDTO, iconDTO, str);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CustomMethod copy(TextDTO title, IconDTO icon, String backgroundColor) {
            return new CustomMethod(title, icon, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomMethod)) {
                return false;
            }
            CustomMethod customMethod = (CustomMethod) other;
            return Intrinsics.d(this.title, customMethod.title) && Intrinsics.d(this.icon, customMethod.icon) && Intrinsics.d(this.backgroundColor, customMethod.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            return o0.c(C2639a.d("CustomMethod(title=", ", icon=", ", backgroundColor=", iconDTO, textDTO), this.backgroundColor, ")");
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$ImageBankCard;", "", ImagesContract.URL, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class ImageBankCard {

        @NotNull
        private final String url;

        private /* synthetic */ ImageBankCard(String str) {
            this.url = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ImageBankCard m1264boximpl(String str) {
            return new ImageBankCard(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1265constructorimpl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1266equalsimpl(String str, Object obj) {
            return (obj instanceof ImageBankCard) && Intrinsics.d(str, ((ImageBankCard) obj).m1270unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1267equalsimpl0(String str, String str2) {
            return Intrinsics.d(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1268hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1269toStringimpl(String str) {
            return A0.b("ImageBankCard(url=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1266equalsimpl(this.url, obj);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return m1268hashCodeimpl(this.url);
        }

        public String toString() {
            return m1269toStringimpl(this.url);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1270unboximpl() {
            return this.url;
        }
    }

    public TravelPaymentV4DTO(@NotNull List<PaymentMethod> paymentMethods, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.paymentMethods = paymentMethods;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelPaymentV4DTO copy$default(TravelPaymentV4DTO travelPaymentV4DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelPaymentV4DTO.paymentMethods;
        }
        if ((i11 & 2) != 0) {
            map = travelPaymentV4DTO.trackingInfo;
        }
        return travelPaymentV4DTO.copy(list, map);
    }

    @NotNull
    public final List<PaymentMethod> component1() {
        return this.paymentMethods;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelPaymentV4DTO copy(@NotNull List<PaymentMethod> paymentMethods, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return new TravelPaymentV4DTO(paymentMethods, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPaymentV4DTO)) {
            return false;
        }
        TravelPaymentV4DTO travelPaymentV4DTO = (TravelPaymentV4DTO) other;
        return Intrinsics.d(this.paymentMethods, travelPaymentV4DTO.paymentMethods) && Intrinsics.d(this.trackingInfo, travelPaymentV4DTO.trackingInfo);
    }

    @NotNull
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.paymentMethods.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("TravelPaymentV4DTO(paymentMethods=", ", trackingInfo=", ")", this.paymentMethods, this.trackingInfo);
    }

    public TravelPaymentV4DTO(List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, map);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$PaymentMethod;", "", "borderColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "content", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Object;)V", "getBorderColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getContent", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {
        public static final int $stable = 8;
        private final BadgeDTO badge;

        @NotNull
        private final String borderColor;
        private final CommonControlSettings common;

        @NotNull
        private final Object content;

        public PaymentMethod(@NotNull String borderColor, CommonControlSettings commonControlSettings, BadgeDTO badgeDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "card", type = BankCard.class), @ProtoOneOfSignature(name = "customMethod", type = CustomMethod.class), @ProtoOneOfSignature(name = "backgroundImage", type = ImageBankCard.class)}) @NotNull @ProtoOneOf(label = "type") Object content) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(content, "content");
            this.borderColor = borderColor;
            this.common = commonControlSettings;
            this.badge = badgeDTO;
            this.content = content;
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, CommonControlSettings commonControlSettings, BadgeDTO badgeDTO, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                str = paymentMethod.borderColor;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = paymentMethod.common;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = paymentMethod.badge;
            }
            if ((i11 & 8) != 0) {
                obj = paymentMethod.content;
            }
            return paymentMethod.copy(str, commonControlSettings, badgeDTO, obj);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Object getContent() {
            return this.content;
        }

        @NotNull
        public final PaymentMethod copy(@NotNull String borderColor, CommonControlSettings common, BadgeDTO badge, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "card", type = BankCard.class), @ProtoOneOfSignature(name = "customMethod", type = CustomMethod.class), @ProtoOneOfSignature(name = "backgroundImage", type = ImageBankCard.class)}) @NotNull @ProtoOneOf(label = "type") Object content) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(content, "content");
            return new PaymentMethod(borderColor, common, badge, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return Intrinsics.d(this.borderColor, paymentMethod.borderColor) && Intrinsics.d(this.common, paymentMethod.common) && Intrinsics.d(this.badge, paymentMethod.badge) && Intrinsics.d(this.content, paymentMethod.content);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Object getContent() {
            return this.content;
        }

        public int hashCode() {
            int hashCode = this.borderColor.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return this.content.hashCode() + ((hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "PaymentMethod(borderColor=" + this.borderColor + ", common=" + this.common + ", badge=" + this.badge + ", content=" + this.content + ")";
        }

        public /* synthetic */ PaymentMethod(String str, CommonControlSettings commonControlSettings, BadgeDTO badgeDTO, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UniColors.GRAPHIC_NEUTRAL.getToken() : str, commonControlSettings, badgeDTO, obj);
        }
    }
}
