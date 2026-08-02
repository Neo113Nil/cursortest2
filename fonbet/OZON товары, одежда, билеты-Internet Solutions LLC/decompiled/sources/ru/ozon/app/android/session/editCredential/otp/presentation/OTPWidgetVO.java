package ru.ozon.app.android.session.editCredential.otp.presentation;

import Ak.C2436a;
import C.o0;
import D3.h;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004GHIJB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ¨\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b\u0013\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b@\u0010 R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\bD\u0010 R\u0017\u0010\u001a\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010\"¨\u0006K"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$SubmitAction;", "action", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$OtpInput;", "input", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "retryButton", "", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintButton;", "hintButtons", "", "isButtonShowing", "", "otpLength", "errorLogoUrl", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "pageType", "otpSms", "requestTimes", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$SubmitAction;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$OtpInput;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;Ljava/lang/String;I)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$SubmitAction;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$OtpInput;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;Ljava/lang/String;I)Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$SubmitAction;", "getAction", "()Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$SubmitAction;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$OtpInput;", "getInput", "()Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$OtpInput;", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "getRetryButton", "()Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "Ljava/util/List;", "getHintButtons", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getOtpLength", "()Ljava/lang/Integer;", "getErrorLogoUrl", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "getPageType", "()Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "getOtpSms", "I", "getRequestTimes", "SubmitAction", "OtpInput", "HintAction", "HintButton", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OTPWidgetVO implements c {

    @NotNull
    private final SubmitAction action;
    private final String errorLogoUrl;
    private final List<HintButton> hintButtons;
    private final long id;
    private final OtpInput input;
    private final Boolean isButtonShowing;
    private final Integer otpLength;
    private final String otpSms;

    @NotNull
    private final OTPWidgetDTO.PageType pageType;
    private final int requestTimes;
    private final OTPWidgetDTO.RetryButton retryButton;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintAction;", "", "", "deeplink", "", "data", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintAction {
        private final Map<String, Object> data;

        @NotNull
        private final String deeplink;

        public HintAction(@NotNull String deeplink, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
            this.data = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintAction)) {
                return false;
            }
            HintAction hintAction = (HintAction) other;
            return Intrinsics.d(this.deeplink, hintAction.deeplink) && Intrinsics.d(this.data, hintAction.data);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            int hashCode = this.deeplink.hashCode() * 31;
            Map<String, Object> map = this.data;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("HintAction(deeplink=", this.deeplink, ", data=", ")", this.data);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintButton;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintAction;", "action", "", "trackClick", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintAction;", "getAction", "()Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$HintAction;", "Ljava/lang/String;", "getTrackClick", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintButton {
        private final HintAction action;

        @NotNull
        private final TextDTO text;
        private final String trackClick;

        public HintButton(@NotNull TextDTO text, HintAction hintAction, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = hintAction;
            this.trackClick = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintButton)) {
                return false;
            }
            HintButton hintButton = (HintButton) other;
            return Intrinsics.d(this.text, hintButton.text) && Intrinsics.d(this.action, hintButton.action) && Intrinsics.d(this.trackClick, hintButton.trackClick);
        }

        public final HintAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final String getTrackClick() {
            return this.trackClick;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            HintAction hintAction = this.action;
            int hashCode2 = (hashCode + (hintAction == null ? 0 : hintAction.hashCode())) * 31;
            String str = this.trackClick;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            HintAction hintAction = this.action;
            String str = this.trackClick;
            StringBuilder sb2 = new StringBuilder("HintButton(text=");
            sb2.append(textDTO);
            sb2.append(", action=");
            sb2.append(hintAction);
            sb2.append(", trackClick=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$OtpInput;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getPlaceholder", "getName", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OtpInput {
        private final String name;
        private final String placeholder;
        private final String value;

        public OtpInput(String str, String str2, String str3) {
            this.value = str;
            this.placeholder = str2;
            this.name = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtpInput)) {
                return false;
            }
            OtpInput otpInput = (OtpInput) other;
            return Intrinsics.d(this.value, otpInput.value) && Intrinsics.d(this.placeholder, otpInput.placeholder) && Intrinsics.d(this.name, otpInput.name);
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
            return o0.c(C3660k.d("OtpInput(value=", str, ", placeholder=", str2, ", name="), this.name, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO$SubmitAction;", "", "", "action", "", "data", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitAction {
        private final String action;
        private final Map<String, Object> data;

        public SubmitAction(String str, Map<String, ? extends Object> map) {
            this.action = str;
            this.data = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitAction)) {
                return false;
            }
            SubmitAction submitAction = (SubmitAction) other;
            return Intrinsics.d(this.action, submitAction.action) && Intrinsics.d(this.data, submitAction.data);
        }

        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        public int hashCode() {
            String str = this.action;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, Object> map = this.data;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a.d("SubmitAction(action=", this.action, ", data=", ")", this.data);
        }
    }

    public OTPWidgetVO(long j11, @NotNull String title, OzonSpannableString ozonSpannableString, @NotNull SubmitAction action, OtpInput otpInput, OTPWidgetDTO.RetryButton retryButton, List<HintButton> list, Boolean bool, Integer num, String str, @NotNull OTPWidgetDTO.PageType pageType, String str2, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.id = j11;
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.action = action;
        this.input = otpInput;
        this.retryButton = retryButton;
        this.hintButtons = list;
        this.isButtonShowing = bool;
        this.otpLength = num;
        this.errorLogoUrl = str;
        this.pageType = pageType;
        this.otpSms = str2;
        this.requestTimes = i11;
    }

    @NotNull
    public final OTPWidgetVO copy(long id2, @NotNull String title, OzonSpannableString subtitle, @NotNull SubmitAction action, OtpInput input, OTPWidgetDTO.RetryButton retryButton, List<HintButton> hintButtons, Boolean isButtonShowing, Integer otpLength, String errorLogoUrl, @NotNull OTPWidgetDTO.PageType pageType, String otpSms, int requestTimes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        return new OTPWidgetVO(id2, title, subtitle, action, input, retryButton, hintButtons, isButtonShowing, otpLength, errorLogoUrl, pageType, otpSms, requestTimes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPWidgetVO)) {
            return false;
        }
        OTPWidgetVO oTPWidgetVO = (OTPWidgetVO) other;
        return this.id == oTPWidgetVO.id && Intrinsics.d(this.title, oTPWidgetVO.title) && Intrinsics.d(this.subtitle, oTPWidgetVO.subtitle) && Intrinsics.d(this.action, oTPWidgetVO.action) && Intrinsics.d(this.input, oTPWidgetVO.input) && Intrinsics.d(this.retryButton, oTPWidgetVO.retryButton) && Intrinsics.d(this.hintButtons, oTPWidgetVO.hintButtons) && Intrinsics.d(this.isButtonShowing, oTPWidgetVO.isButtonShowing) && Intrinsics.d(this.otpLength, oTPWidgetVO.otpLength) && Intrinsics.d(this.errorLogoUrl, oTPWidgetVO.errorLogoUrl) && this.pageType == oTPWidgetVO.pageType && Intrinsics.d(this.otpSms, oTPWidgetVO.otpSms) && this.requestTimes == oTPWidgetVO.requestTimes;
    }

    @NotNull
    public final SubmitAction getAction() {
        return this.action;
    }

    public final String getErrorLogoUrl() {
        return this.errorLogoUrl;
    }

    public final List<HintButton> getHintButtons() {
        return this.hintButtons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final OtpInput getInput() {
        return this.input;
    }

    public final Integer getOtpLength() {
        return this.otpLength;
    }

    public final String getOtpSms() {
        return this.otpSms;
    }

    @NotNull
    public final OTPWidgetDTO.PageType getPageType() {
        return this.pageType;
    }

    public final int getRequestTimes() {
        return this.requestTimes;
    }

    public final OTPWidgetDTO.RetryButton getRetryButton() {
        return this.retryButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode = (this.action.hashCode() + ((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31)) * 31;
        OtpInput otpInput = this.input;
        int hashCode2 = (hashCode + (otpInput == null ? 0 : otpInput.hashCode())) * 31;
        OTPWidgetDTO.RetryButton retryButton = this.retryButton;
        int hashCode3 = (hashCode2 + (retryButton == null ? 0 : retryButton.hashCode())) * 31;
        List<HintButton> list = this.hintButtons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isButtonShowing;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.otpLength;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorLogoUrl;
        int hashCode7 = (this.pageType.hashCode() + ((hashCode6 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.otpSms;
        return Integer.hashCode(this.requestTimes) + ((hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        SubmitAction submitAction = this.action;
        OtpInput otpInput = this.input;
        OTPWidgetDTO.RetryButton retryButton = this.retryButton;
        List<HintButton> list = this.hintButtons;
        Boolean bool = this.isButtonShowing;
        Integer num = this.otpLength;
        String str2 = this.errorLogoUrl;
        OTPWidgetDTO.PageType pageType = this.pageType;
        String str3 = this.otpSms;
        int i11 = this.requestTimes;
        StringBuilder c11 = C2436a.c(j11, "OTPWidgetVO(id=", ", title=", str);
        c11.append(", subtitle=");
        c11.append((Object) ozonSpannableString);
        c11.append(", action=");
        c11.append(submitAction);
        c11.append(", input=");
        c11.append(otpInput);
        c11.append(", retryButton=");
        c11.append(retryButton);
        c11.append(", hintButtons=");
        c11.append(list);
        c11.append(", isButtonShowing=");
        c11.append(bool);
        c11.append(", otpLength=");
        c11.append(num);
        c11.append(", errorLogoUrl=");
        c11.append(str2);
        c11.append(", pageType=");
        c11.append(pageType);
        c11.append(", otpSms=");
        c11.append(str3);
        return h.b(c11, ", requestTimes=", i11, ")");
    }

    public /* synthetic */ OTPWidgetVO(long j11, String str, OzonSpannableString ozonSpannableString, SubmitAction submitAction, OtpInput otpInput, OTPWidgetDTO.RetryButton retryButton, List list, Boolean bool, Integer num, String str2, OTPWidgetDTO.PageType pageType, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, ozonSpannableString, submitAction, otpInput, retryButton, list, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool, num, str2, pageType, (i12 & 2048) != 0 ? null : str3, (i12 & 4096) != 0 ? 0 : i11);
    }
}
