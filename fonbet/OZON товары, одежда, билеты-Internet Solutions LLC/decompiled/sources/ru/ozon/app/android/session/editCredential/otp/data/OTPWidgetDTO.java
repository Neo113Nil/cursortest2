package ru.ozon.app.android.session.editCredential.otp.data;

import B4.V;
import C.o0;
import G.g;
import N3.C3660k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0004;<=>B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0014HÆ\u0003J\u0094\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0011HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006?"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "input", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$Input;", "action", "data", "", "retryButton", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "hintButtons", "", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$HintButton;", "otpLength", "", "errorLogoUrl", "pageType", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$Input;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getInput", "()Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$Input;", "getAction", "getData", "()Ljava/util/Map;", "getRetryButton", "()Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "getHintButtons", "()Ljava/util/List;", "getOtpLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorLogoUrl", "getPageType", "()Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$Input;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;)Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;", "equals", "", "other", "hashCode", "toString", "Input", "RetryButton", "HintButton", "PageType", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OTPWidgetDTO {
    public static final int $stable = 8;
    private final String action;
    private final Map<String, Object> data;
    private final String errorLogoUrl;
    private final List<HintButton> hintButtons;
    private final Input input;
    private final Integer otpLength;

    @NotNull
    private final PageType pageType;
    private final RetryButton retryButton;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$HintButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "data", "", "trackClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "getData", "()Ljava/util/Map;", "getTrackClick", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintButton {
        public static final int $stable = 8;
        private final Map<String, Object> data;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String title;
        private final String trackClick;

        public HintButton(@NotNull String title, @NotNull String deeplink, Map<String, ? extends Object> map, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
            this.data = map;
            this.trackClick = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HintButton copy$default(HintButton hintButton, String str, String str2, Map map, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hintButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = hintButton.deeplink;
            }
            if ((i11 & 4) != 0) {
                map = hintButton.data;
            }
            if ((i11 & 8) != 0) {
                str3 = hintButton.trackClick;
            }
            return hintButton.copy(str, str2, map, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, Object> component3() {
            return this.data;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTrackClick() {
            return this.trackClick;
        }

        @NotNull
        public final HintButton copy(@NotNull String title, @NotNull String deeplink, Map<String, ? extends Object> data, String trackClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new HintButton(title, deeplink, data, trackClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintButton)) {
                return false;
            }
            HintButton hintButton = (HintButton) other;
            return Intrinsics.d(this.title, hintButton.title) && Intrinsics.d(this.deeplink, hintButton.deeplink) && Intrinsics.d(this.data, hintButton.data) && Intrinsics.d(this.trackClick, hintButton.trackClick);
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getTrackClick() {
            return this.trackClick;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.deeplink);
            Map<String, Object> map = this.data;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.trackClick;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.deeplink;
            Map<String, Object> map = this.data;
            String str3 = this.trackClick;
            StringBuilder d11 = C3660k.d("HintButton(title=", str, ", deeplink=", str2, ", data=");
            d11.append(map);
            d11.append(", trackClick=");
            d11.append(str3);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getPlaceholder", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;
        private final String name;
        private final String placeholder;
        private final String value;

        public Input(String str, String str2, String str3) {
            this.value = str;
            this.placeholder = str2;
            this.name = str3;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.value;
            }
            if ((i11 & 2) != 0) {
                str2 = input.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = input.name;
            }
            return input.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Input copy(String value, String placeholder, String name) {
            return new Input(value, placeholder, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.value, input.value) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.name, input.name);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeholder;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.name;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.placeholder;
            return o0.c(C3660k.d("Input(value=", str, ", placeholder=", str2, ", name="), this.name, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ERROR_DEFAULT", "ERROR_TIMEOUT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class PageType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PageType[] $VALUES;

        @i(name = "otpDefault")
        public static final PageType DEFAULT = new PageType("DEFAULT", 0);

        @i(name = "otpErrorDefault")
        public static final PageType ERROR_DEFAULT = new PageType("ERROR_DEFAULT", 1);

        @i(name = "otpErrorTimeout")
        public static final PageType ERROR_TIMEOUT = new PageType("ERROR_TIMEOUT", 2);

        private static final /* synthetic */ PageType[] $values() {
            return new PageType[]{DEFAULT, ERROR_DEFAULT, ERROR_TIMEOUT};
        }

        static {
            PageType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PageType(String str, int i11) {
        }

        @NotNull
        public static a<PageType> getEntries() {
            return $ENTRIES;
        }

        public static PageType valueOf(String str) {
            return (PageType) Enum.valueOf(PageType.class, str);
        }

        public static PageType[] values() {
            return (PageType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003JT\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "timerDuration", "", "action", "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTimerDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "getData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "equals", "", "other", "hashCode", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryButton {
        public static final int $stable = 8;
        private final String action;
        private final Map<String, Object> data;
        private final String subtitle;
        private final Integer timerDuration;

        @NotNull
        private final String title;

        public RetryButton(@NotNull String title, String str, Integer num, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.timerDuration = num;
            this.action = str2;
            this.data = map;
        }

        public static /* synthetic */ RetryButton copy$default(RetryButton retryButton, String str, String str2, Integer num, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = retryButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = retryButton.subtitle;
            }
            if ((i11 & 4) != 0) {
                num = retryButton.timerDuration;
            }
            if ((i11 & 8) != 0) {
                str3 = retryButton.action;
            }
            if ((i11 & 16) != 0) {
                map = retryButton.data;
            }
            Map map2 = map;
            Integer num2 = num;
            return retryButton.copy(str, str2, num2, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getTimerDuration() {
            return this.timerDuration;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> component5() {
            return this.data;
        }

        @NotNull
        public final RetryButton copy(@NotNull String title, String subtitle, Integer timerDuration, String action, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new RetryButton(title, subtitle, timerDuration, action, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RetryButton)) {
                return false;
            }
            RetryButton retryButton = (RetryButton) other;
            return Intrinsics.d(this.title, retryButton.title) && Intrinsics.d(this.subtitle, retryButton.subtitle) && Intrinsics.d(this.timerDuration, retryButton.timerDuration) && Intrinsics.d(this.action, retryButton.action) && Intrinsics.d(this.data, retryButton.data);
        }

        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Integer getTimerDuration() {
            return this.timerDuration;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.timerDuration;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.action;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.data;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            Integer num = this.timerDuration;
            String str3 = this.action;
            Map<String, Object> map = this.data;
            StringBuilder d11 = C3660k.d("RetryButton(title=", str, ", subtitle=", str2, ", timerDuration=");
            V.f(num, ", action=", str3, ", data=", d11);
            return P.f(d11, map, ")");
        }
    }

    public OTPWidgetDTO(@NotNull String title, OzonSpannableString ozonSpannableString, Input input, String str, Map<String, ? extends Object> map, RetryButton retryButton, List<HintButton> list, Integer num, String str2, @NotNull PageType pageType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.input = input;
        this.action = str;
        this.data = map;
        this.retryButton = retryButton;
        this.hintButtons = list;
        this.otpLength = num;
        this.errorLogoUrl = str2;
        this.pageType = pageType;
    }

    public static /* synthetic */ OTPWidgetDTO copy$default(OTPWidgetDTO oTPWidgetDTO, String str, OzonSpannableString ozonSpannableString, Input input, String str2, Map map, RetryButton retryButton, List list, Integer num, String str3, PageType pageType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = oTPWidgetDTO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = oTPWidgetDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            input = oTPWidgetDTO.input;
        }
        if ((i11 & 8) != 0) {
            str2 = oTPWidgetDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = oTPWidgetDTO.data;
        }
        if ((i11 & 32) != 0) {
            retryButton = oTPWidgetDTO.retryButton;
        }
        if ((i11 & 64) != 0) {
            list = oTPWidgetDTO.hintButtons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num = oTPWidgetDTO.otpLength;
        }
        if ((i11 & 256) != 0) {
            str3 = oTPWidgetDTO.errorLogoUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            pageType = oTPWidgetDTO.pageType;
        }
        String str4 = str3;
        PageType pageType2 = pageType;
        List list2 = list;
        Integer num2 = num;
        Map map2 = map;
        RetryButton retryButton2 = retryButton;
        return oTPWidgetDTO.copy(str, ozonSpannableString, input, str2, map2, retryButton2, list2, num2, str4, pageType2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final PageType getPageType() {
        return this.pageType;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Map<String, Object> component5() {
        return this.data;
    }

    /* renamed from: component6, reason: from getter */
    public final RetryButton getRetryButton() {
        return this.retryButton;
    }

    public final List<HintButton> component7() {
        return this.hintButtons;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getOtpLength() {
        return this.otpLength;
    }

    /* renamed from: component9, reason: from getter */
    public final String getErrorLogoUrl() {
        return this.errorLogoUrl;
    }

    @NotNull
    public final OTPWidgetDTO copy(@NotNull String title, OzonSpannableString subtitle, Input input, String action, Map<String, ? extends Object> data, RetryButton retryButton, List<HintButton> hintButtons, Integer otpLength, String errorLogoUrl, @NotNull PageType pageType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        return new OTPWidgetDTO(title, subtitle, input, action, data, retryButton, hintButtons, otpLength, errorLogoUrl, pageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPWidgetDTO)) {
            return false;
        }
        OTPWidgetDTO oTPWidgetDTO = (OTPWidgetDTO) other;
        return Intrinsics.d(this.title, oTPWidgetDTO.title) && Intrinsics.d(this.subtitle, oTPWidgetDTO.subtitle) && Intrinsics.d(this.input, oTPWidgetDTO.input) && Intrinsics.d(this.action, oTPWidgetDTO.action) && Intrinsics.d(this.data, oTPWidgetDTO.data) && Intrinsics.d(this.retryButton, oTPWidgetDTO.retryButton) && Intrinsics.d(this.hintButtons, oTPWidgetDTO.hintButtons) && Intrinsics.d(this.otpLength, oTPWidgetDTO.otpLength) && Intrinsics.d(this.errorLogoUrl, oTPWidgetDTO.errorLogoUrl) && this.pageType == oTPWidgetDTO.pageType;
    }

    public final String getAction() {
        return this.action;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getErrorLogoUrl() {
        return this.errorLogoUrl;
    }

    public final List<HintButton> getHintButtons() {
        return this.hintButtons;
    }

    public final Input getInput() {
        return this.input;
    }

    public final Integer getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final PageType getPageType() {
        return this.pageType;
    }

    public final RetryButton getRetryButton() {
        return this.retryButton;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        Input input = this.input;
        int hashCode3 = (hashCode2 + (input == null ? 0 : input.hashCode())) * 31;
        String str = this.action;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.data;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        RetryButton retryButton = this.retryButton;
        int hashCode6 = (hashCode5 + (retryButton == null ? 0 : retryButton.hashCode())) * 31;
        List<HintButton> list = this.hintButtons;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.otpLength;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.errorLogoUrl;
        return this.pageType.hashCode() + ((hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "OTPWidgetDTO(title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", input=" + this.input + ", action=" + this.action + ", data=" + this.data + ", retryButton=" + this.retryButton + ", hintButtons=" + this.hintButtons + ", otpLength=" + this.otpLength + ", errorLogoUrl=" + this.errorLogoUrl + ", pageType=" + this.pageType + ")";
    }

    public /* synthetic */ OTPWidgetDTO(String str, OzonSpannableString ozonSpannableString, Input input, String str2, Map map, RetryButton retryButton, List list, Integer num, String str3, PageType pageType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ozonSpannableString, input, str2, map, retryButton, list, num, str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? PageType.DEFAULT : pageType);
    }
}
