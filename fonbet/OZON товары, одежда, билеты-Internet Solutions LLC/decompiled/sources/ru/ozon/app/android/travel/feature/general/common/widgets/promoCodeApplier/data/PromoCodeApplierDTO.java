package ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.data;

import De.C2859b;
import G.g;
import N3.C3660k;
import Sh.a;
import T7.P;
import Ul.C4070a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "input", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$InputDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$InputDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInput", "()Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$InputDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "InputDTO", "Status", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromoCodeApplierDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final InputDTO input;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jt\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$InputDTO;", "", "label", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "size", "hasClearButton", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "status", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;", "error", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;Ljava/lang/String;Ljava/util/Map;)V", "getLabel", "()Ljava/lang/String;", "getName", "getSize", "getHasClearButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValue", "getStatus", "()Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;", "getError", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$InputDTO;", "equals", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputDTO {
        public static final int $stable = 8;
        private final String error;
        private final Boolean hasClearButton;

        @NotNull
        private final String label;
        private final String name;
        private final String size;

        @NotNull
        private final Status status;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String value;

        public InputDTO(@NotNull String label, String str, String str2, Boolean bool, @NotNull String value, @NotNull Status status, String str3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            this.label = label;
            this.name = str;
            this.size = str2;
            this.hasClearButton = bool;
            this.value = value;
            this.status = status;
            this.error = str3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, Boolean bool, String str4, Status status, String str5, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.label;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.name;
            }
            if ((i11 & 4) != 0) {
                str3 = inputDTO.size;
            }
            if ((i11 & 8) != 0) {
                bool = inputDTO.hasClearButton;
            }
            if ((i11 & 16) != 0) {
                str4 = inputDTO.value;
            }
            if ((i11 & 32) != 0) {
                status = inputDTO.status;
            }
            if ((i11 & 64) != 0) {
                str5 = inputDTO.error;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = inputDTO.trackingInfo;
            }
            String str6 = str5;
            Map map2 = map;
            String str7 = str4;
            Status status2 = status;
            return inputDTO.copy(str, str2, str3, bool, str7, status2, str6, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getHasClearButton() {
            return this.hasClearButton;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component7, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final InputDTO copy(@NotNull String label, String name, String size, Boolean hasClearButton, @NotNull String value, @NotNull Status status, String error, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            return new InputDTO(label, name, size, hasClearButton, value, status, error, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.label, inputDTO.label) && Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.size, inputDTO.size) && Intrinsics.d(this.hasClearButton, inputDTO.hasClearButton) && Intrinsics.d(this.value, inputDTO.value) && this.status == inputDTO.status && Intrinsics.d(this.error, inputDTO.error) && Intrinsics.d(this.trackingInfo, inputDTO.trackingInfo);
        }

        public final String getError() {
            return this.error;
        }

        public final Boolean getHasClearButton() {
            return this.hasClearButton;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSize() {
            return this.size;
        }

        @NotNull
        public final Status getStatus() {
            return this.status;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.name;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.size;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.hasClearButton;
            int hashCode4 = (this.status.hashCode() + g.a((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.value)) * 31;
            String str3 = this.error;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.name;
            String str3 = this.size;
            Boolean bool = this.hasClearButton;
            String str4 = this.value;
            Status status = this.status;
            String str5 = this.error;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("InputDTO(label=", str, ", name=", str2, ", size=");
            a.d(bool, str3, ", hasClearButton=", ", value=", d11);
            d11.append(str4);
            d11.append(", status=");
            d11.append(status);
            d11.append(", error=");
            return C4070a.a(d11, str5, ", trackingInfo=", map, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "ERROR", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @i(name = "neutral")
        public static final Status NEUTRAL = new Status("NEUTRAL", 0);

        @i(name = "error")
        public static final Status ERROR = new Status("ERROR", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NEUTRAL, ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public PromoCodeApplierDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull InputDTO input, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.title = title;
        this.subtitle = textDTO;
        this.input = input;
        this.button = button;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PromoCodeApplierDTO copy$default(PromoCodeApplierDTO promoCodeApplierDTO, TextDTO textDTO, TextDTO textDTO2, InputDTO inputDTO, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = promoCodeApplierDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = promoCodeApplierDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            inputDTO = promoCodeApplierDTO.input;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = promoCodeApplierDTO.button;
        }
        if ((i11 & 16) != 0) {
            map = promoCodeApplierDTO.trackingInfo;
        }
        Map map2 = map;
        InputDTO inputDTO2 = inputDTO;
        return promoCodeApplierDTO.copy(textDTO, textDTO2, inputDTO2, buttonV3DTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final PromoCodeApplierDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull InputDTO input, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        return new PromoCodeApplierDTO(title, subtitle, input, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCodeApplierDTO)) {
            return false;
        }
        PromoCodeApplierDTO promoCodeApplierDTO = (PromoCodeApplierDTO) other;
        return Intrinsics.d(this.title, promoCodeApplierDTO.title) && Intrinsics.d(this.subtitle, promoCodeApplierDTO.subtitle) && Intrinsics.d(this.input, promoCodeApplierDTO.input) && Intrinsics.d(this.button, promoCodeApplierDTO.button) && Intrinsics.d(this.trackingInfo, promoCodeApplierDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final InputDTO getInput() {
        return this.input;
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
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int c11 = C2859b.c(this.button, (this.input.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        InputDTO inputDTO = this.input;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("PromoCodeApplierDTO(title=", textDTO, ", subtitle=", textDTO2, ", input=");
        g10.append(inputDTO);
        g10.append(", button=");
        g10.append(buttonV3DTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
