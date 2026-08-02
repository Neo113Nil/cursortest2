package ru.ozon.id.nativeauth.data.models;

import B0.A0;
import C.J;
import C.o0;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b,\b\u0081\b\u0018\u00002\u00020\u0001:\u000bpqrstuvwxyzB·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010/J\u001e\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bG\u0010/J\u0012\u0010H\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bH\u0010IJÞ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bL\u0010/J\u0010\u0010M\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bM\u0010+J\u001a\u0010P\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\bY\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\b\\\u0010/R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b^\u00108R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bb\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010e\u001a\u0004\bf\u0010@R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010g\u001a\u0004\bh\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bj\u0010DR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010k\u001a\u0004\bl\u0010FR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010T\u001a\u0004\bm\u0010/R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010n\u001a\u0004\bo\u0010I¨\u0006{"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "pageType", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "messengerOtpCell", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "input", "action", "", "", "data", "", "Lru/ozon/id/nativeauth/data/models/OtpDTO$HintButton;", "hintButtons", "", "otpLength", "Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "phoneExample", "Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "continueButton", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "agreementSheet", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "retryButton", "errorLogoUrl", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "callInCell", "<init>", "(Lru/ozon/id/nativeauth/data/models/OtpDTO$b;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;Lru/ozon/id/common/disclaimer/DisclaimerDTO;Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "component2", "()Ljava/lang/String;", "component3", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component4", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "component5", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "component6", "component7", "()Ljava/util/Map;", "component8", "()Ljava/util/List;", "component9", "()Ljava/lang/Integer;", "component10", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "component11", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "component12", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "component13", "()Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "component14", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "component15", "component16", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "copy", "(Lru/ozon/id/nativeauth/data/models/OtpDTO$b;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;Lru/ozon/id/common/disclaimer/DisclaimerDTO;Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;)Lru/ozon/id/nativeauth/data/models/OtpDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "getPageType", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "getMessengerOtpCell", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "getInput", "getAction", "Ljava/util/Map;", "getData", "Ljava/util/List;", "getHintButtons", "Ljava/lang/Integer;", "getOtpLength", "Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "getPhoneExample", "Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "getContinueButton", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "getAgreementSheet", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "getDisclaimer", "Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "getRetryButton", "getErrorLogoUrl", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "getCallInCell", "b", "Input", "HintButton", "Agreement", "AccountRecoveryButton", "PhoneExample", "RetryButton", "ContinueButton", "AgreementSheet", "CallInCell", "MessengerOtpCell", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OtpDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtpDTO> CREATOR = new a();
    private final String action;
    private final AgreementSheet agreementSheet;
    private final CallInCell callInCell;
    private final ContinueButton continueButton;
    private final Map<String, Object> data;
    private final DisclaimerDTO disclaimer;
    private final String errorLogoUrl;
    private final List<HintButton> hintButtons;
    private final Input input;
    private final MessengerOtpCell messengerOtpCell;
    private final Integer otpLength;

    @NotNull
    private final b pageType;
    private final PhoneExample phoneExample;
    private final RetryButton retryButton;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$AccountRecoveryButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "trackClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "getTrackClick", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountRecoveryButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AccountRecoveryButton> CREATOR = new a();

        @NotNull
        private final String deeplink;

        @NotNull
        private final String title;
        private final String trackClick;

        public static final class a implements Parcelable.Creator<AccountRecoveryButton> {
            @Override // android.os.Parcelable.Creator
            public final AccountRecoveryButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRecoveryButton(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AccountRecoveryButton[] newArray(int i11) {
                return new AccountRecoveryButton[i11];
            }
        }

        public AccountRecoveryButton(@NotNull String title, @NotNull String deeplink, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
            this.trackClick = str;
        }

        public static /* synthetic */ AccountRecoveryButton copy$default(AccountRecoveryButton accountRecoveryButton, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = accountRecoveryButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = accountRecoveryButton.deeplink;
            }
            if ((i11 & 4) != 0) {
                str3 = accountRecoveryButton.trackClick;
            }
            return accountRecoveryButton.copy(str, str2, str3);
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

        /* renamed from: component3, reason: from getter */
        public final String getTrackClick() {
            return this.trackClick;
        }

        @NotNull
        public final AccountRecoveryButton copy(@NotNull String title, @NotNull String deeplink, String trackClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new AccountRecoveryButton(title, deeplink, trackClick);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountRecoveryButton)) {
                return false;
            }
            AccountRecoveryButton accountRecoveryButton = (AccountRecoveryButton) other;
            return Intrinsics.d(this.title, accountRecoveryButton.title) && Intrinsics.d(this.deeplink, accountRecoveryButton.deeplink) && Intrinsics.d(this.trackClick, accountRecoveryButton.trackClick);
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
            String str = this.trackClick;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.deeplink;
            return o0.c(C3660k.d("AccountRecoveryButton(title=", str, ", deeplink=", str2, ", trackClick="), this.trackClick, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.deeplink);
            dest.writeString(this.trackClick);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "termsOfUse", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Agreement;", "isAdsAllowed", "completeButton", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet$CompleteButton;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/OtpDTO$Agreement;Lru/ozon/id/nativeauth/data/models/OtpDTO$Agreement;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet$CompleteButton;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTermsOfUse", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$Agreement;", "getCompleteButton", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet$CompleteButton;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CompleteButton", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AgreementSheet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AgreementSheet> CREATOR = new a();

        @NotNull
        private final CompleteButton completeButton;
        private final Agreement isAdsAllowed;
        private final OzonSpannableString subtitle;
        private final Agreement termsOfUse;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet$CompleteButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CompleteButton implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CompleteButton> CREATOR = new a();
            private final String action;

            @NotNull
            private final String title;

            public static final class a implements Parcelable.Creator<CompleteButton> {
                @Override // android.os.Parcelable.Creator
                public final CompleteButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CompleteButton(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CompleteButton[] newArray(int i11) {
                    return new CompleteButton[i11];
                }
            }

            public CompleteButton(@NotNull String title, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.action = str;
            }

            public static /* synthetic */ CompleteButton copy$default(CompleteButton completeButton, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = completeButton.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = completeButton.action;
                }
                return completeButton.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            @NotNull
            public final CompleteButton copy(@NotNull String title, String action) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new CompleteButton(title, action);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CompleteButton)) {
                    return false;
                }
                CompleteButton completeButton = (CompleteButton) other;
                return Intrinsics.d(this.title, completeButton.title) && Intrinsics.d(this.action, completeButton.action);
            }

            public final String getAction() {
                return this.action;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.action;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("CompleteButton(title=", this.title, ", action=", this.action, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.action);
            }
        }

        public static final class a implements Parcelable.Creator<AgreementSheet> {
            @Override // android.os.Parcelable.Creator
            public final AgreementSheet createFromParcel(Parcel parcel) {
                OzonSpannableString ozonSpannableString;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    ozonSpannableString = null;
                } else {
                    String readString2 = parcel.readString();
                    if (readString2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString2, 63), '\n'));
                }
                return new AgreementSheet(readString, ozonSpannableString, parcel.readInt() == 0 ? null : Agreement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Agreement.CREATOR.createFromParcel(parcel) : null, CompleteButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AgreementSheet[] newArray(int i11) {
                return new AgreementSheet[i11];
            }
        }

        public AgreementSheet(@NotNull String title, OzonSpannableString ozonSpannableString, Agreement agreement, Agreement agreement2, @NotNull CompleteButton completeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(completeButton, "completeButton");
            this.title = title;
            this.subtitle = ozonSpannableString;
            this.termsOfUse = agreement;
            this.isAdsAllowed = agreement2;
            this.completeButton = completeButton;
        }

        public static /* synthetic */ AgreementSheet copy$default(AgreementSheet agreementSheet, String str, OzonSpannableString ozonSpannableString, Agreement agreement, Agreement agreement2, CompleteButton completeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = agreementSheet.title;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString = agreementSheet.subtitle;
            }
            if ((i11 & 4) != 0) {
                agreement = agreementSheet.termsOfUse;
            }
            if ((i11 & 8) != 0) {
                agreement2 = agreementSheet.isAdsAllowed;
            }
            if ((i11 & 16) != 0) {
                completeButton = agreementSheet.completeButton;
            }
            CompleteButton completeButton2 = completeButton;
            Agreement agreement3 = agreement;
            return agreementSheet.copy(str, ozonSpannableString, agreement3, agreement2, completeButton2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final Agreement getTermsOfUse() {
            return this.termsOfUse;
        }

        /* renamed from: component4, reason: from getter */
        public final Agreement getIsAdsAllowed() {
            return this.isAdsAllowed;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CompleteButton getCompleteButton() {
            return this.completeButton;
        }

        @NotNull
        public final AgreementSheet copy(@NotNull String title, OzonSpannableString subtitle, Agreement termsOfUse, Agreement isAdsAllowed, @NotNull CompleteButton completeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(completeButton, "completeButton");
            return new AgreementSheet(title, subtitle, termsOfUse, isAdsAllowed, completeButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgreementSheet)) {
                return false;
            }
            AgreementSheet agreementSheet = (AgreementSheet) other;
            return Intrinsics.d(this.title, agreementSheet.title) && Intrinsics.d(this.subtitle, agreementSheet.subtitle) && Intrinsics.d(this.termsOfUse, agreementSheet.termsOfUse) && Intrinsics.d(this.isAdsAllowed, agreementSheet.isAdsAllowed) && Intrinsics.d(this.completeButton, agreementSheet.completeButton);
        }

        @NotNull
        public final CompleteButton getCompleteButton() {
            return this.completeButton;
        }

        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        public final Agreement getTermsOfUse() {
            return this.termsOfUse;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            OzonSpannableString ozonSpannableString = this.subtitle;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            Agreement agreement = this.termsOfUse;
            int hashCode3 = (hashCode2 + (agreement == null ? 0 : agreement.hashCode())) * 31;
            Agreement agreement2 = this.isAdsAllowed;
            return this.completeButton.hashCode() + ((hashCode3 + (agreement2 != null ? agreement2.hashCode() : 0)) * 31);
        }

        public final Agreement isAdsAllowed() {
            return this.isAdsAllowed;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            OzonSpannableString ozonSpannableString = this.subtitle;
            return "AgreementSheet(title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", termsOfUse=" + this.termsOfUse + ", isAdsAllowed=" + this.isAdsAllowed + ", completeButton=" + this.completeButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            OzonSpannableString ozonSpannableString = this.subtitle;
            Intrinsics.checkNotNullParameter(dest, "parcel");
            if (ozonSpannableString == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(Html.toHtml(ozonSpannableString, 1));
            }
            Agreement agreement = this.termsOfUse;
            if (agreement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                agreement.writeToParcel(dest, flags);
            }
            Agreement agreement2 = this.isAdsAllowed;
            if (agreement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                agreement2.writeToParcel(dest, flags);
            }
            this.completeButton.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000201BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00062"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "Landroid/os/Parcelable;", "statusIcon", "", "statusIconTintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "subtitle", "subtitleColor", "button", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton;", DynamicElementDTO.TIMER, "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellTimer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellTimer;)V", "getStatusIcon", "()Ljava/lang/String;", "getStatusIconTintColor", "getTitle", "getTitleColor", "getSubtitle", "getSubtitleColor", "getButton", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton;", "getTimer", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellTimer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CallInCellButton", "CallInCellTimer", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CallInCell implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CallInCell> CREATOR = new a();
        private final CallInCellButton button;

        @NotNull
        private final String statusIcon;
        private final String statusIconTintColor;

        @NotNull
        private final String subtitle;
        private final String subtitleColor;
        private final CallInCellTimer timer;

        @NotNull
        private final String title;
        private final String titleColor;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton;", "Landroid/os/Parcelable;", "", "icon", "iconTintColor", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton$a;", "type", "action", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton$a;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton$a;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton$a;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIconTintColor", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton$a;", "getType", "getAction", "getDeeplink", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CallInCellButton implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CallInCellButton> CREATOR = new b();
            private final String action;
            private final String deeplink;

            @NotNull
            private final String icon;
            private final String iconTintColor;

            @NotNull
            private final a type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton$a;", "", "<init>", "(Ljava/lang/String;I)V", "Action", "Deeplink", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = false)
            public static final class a {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ a[] $VALUES;

                @i(name = "action")
                public static final a Action = new a("Action", 0);

                @i(name = "deeplink")
                public static final a Deeplink = new a("Deeplink", 1);

                private static final /* synthetic */ a[] $values() {
                    return new a[]{Action, Deeplink};
                }

                static {
                    a[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private a(String str, int i11) {
                }

                @NotNull
                public static Xc.a<a> getEntries() {
                    return $ENTRIES;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) $VALUES.clone();
                }
            }

            public static final class b implements Parcelable.Creator<CallInCellButton> {
                @Override // android.os.Parcelable.Creator
                public final CallInCellButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CallInCellButton(parcel.readString(), parcel.readString(), a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CallInCellButton[] newArray(int i11) {
                    return new CallInCellButton[i11];
                }
            }

            public CallInCellButton(@NotNull String icon, String str, @NotNull a type, String str2, String str3) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(type, "type");
                this.icon = icon;
                this.iconTintColor = str;
                this.type = type;
                this.action = str2;
                this.deeplink = str3;
            }

            public static /* synthetic */ CallInCellButton copy$default(CallInCellButton callInCellButton, String str, String str2, a aVar, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = callInCellButton.icon;
                }
                if ((i11 & 2) != 0) {
                    str2 = callInCellButton.iconTintColor;
                }
                if ((i11 & 4) != 0) {
                    aVar = callInCellButton.type;
                }
                if ((i11 & 8) != 0) {
                    str3 = callInCellButton.action;
                }
                if ((i11 & 16) != 0) {
                    str4 = callInCellButton.deeplink;
                }
                String str5 = str4;
                a aVar2 = aVar;
                return callInCellButton.copy(str, str2, aVar2, str3, str5);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final a getType() {
                return this.type;
            }

            /* renamed from: component4, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            /* renamed from: component5, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final CallInCellButton copy(@NotNull String icon, String iconTintColor, @NotNull a type, String action, String deeplink) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(type, "type");
                return new CallInCellButton(icon, iconTintColor, type, action, deeplink);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CallInCellButton)) {
                    return false;
                }
                CallInCellButton callInCellButton = (CallInCellButton) other;
                return Intrinsics.d(this.icon, callInCellButton.icon) && Intrinsics.d(this.iconTintColor, callInCellButton.iconTintColor) && this.type == callInCellButton.type && Intrinsics.d(this.action, callInCellButton.action) && Intrinsics.d(this.deeplink, callInCellButton.deeplink);
            }

            public final String getAction() {
                return this.action;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @NotNull
            public final a getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                String str = this.iconTintColor;
                int hashCode2 = (this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.action;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.deeplink;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                a aVar = this.type;
                String str3 = this.action;
                String str4 = this.deeplink;
                StringBuilder d11 = C3660k.d("CallInCellButton(icon=", str, ", iconTintColor=", str2, ", type=");
                d11.append(aVar);
                d11.append(", action=");
                d11.append(str3);
                d11.append(", deeplink=");
                return o0.c(d11, str4, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeString(this.type.name());
                dest.writeString(this.action);
                dest.writeString(this.deeplink);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellTimer;", "Landroid/os/Parcelable;", "seconds", "", "deeplink", "", "<init>", "(ILjava/lang/String;)V", "getSeconds", "()I", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CallInCellTimer implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CallInCellTimer> CREATOR = new a();

            @NotNull
            private final String deeplink;
            private final int seconds;

            public static final class a implements Parcelable.Creator<CallInCellTimer> {
                @Override // android.os.Parcelable.Creator
                public final CallInCellTimer createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CallInCellTimer(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CallInCellTimer[] newArray(int i11) {
                    return new CallInCellTimer[i11];
                }
            }

            public CallInCellTimer(int i11, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.seconds = i11;
                this.deeplink = deeplink;
            }

            public static /* synthetic */ CallInCellTimer copy$default(CallInCellTimer callInCellTimer, int i11, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = callInCellTimer.seconds;
                }
                if ((i12 & 2) != 0) {
                    str = callInCellTimer.deeplink;
                }
                return callInCellTimer.copy(i11, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getSeconds() {
                return this.seconds;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final CallInCellTimer copy(int seconds, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new CallInCellTimer(seconds, deeplink);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CallInCellTimer)) {
                    return false;
                }
                CallInCellTimer callInCellTimer = (CallInCellTimer) other;
                return this.seconds == callInCellTimer.seconds && Intrinsics.d(this.deeplink, callInCellTimer.deeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final int getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                return this.deeplink.hashCode() + (Integer.hashCode(this.seconds) * 31);
            }

            @NotNull
            public String toString() {
                return Nh.a.c(this.seconds, "CallInCellTimer(seconds=", ", deeplink=", this.deeplink, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.seconds);
                dest.writeString(this.deeplink);
            }
        }

        public static final class a implements Parcelable.Creator<CallInCell> {
            @Override // android.os.Parcelable.Creator
            public final CallInCell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CallInCell(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CallInCellButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CallInCellTimer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final CallInCell[] newArray(int i11) {
                return new CallInCell[i11];
            }
        }

        public CallInCell(@NotNull String statusIcon, String str, @NotNull String title, String str2, @NotNull String subtitle, String str3, CallInCellButton callInCellButton, CallInCellTimer callInCellTimer) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.statusIcon = statusIcon;
            this.statusIconTintColor = str;
            this.title = title;
            this.titleColor = str2;
            this.subtitle = subtitle;
            this.subtitleColor = str3;
            this.button = callInCellButton;
            this.timer = callInCellTimer;
        }

        public static /* synthetic */ CallInCell copy$default(CallInCell callInCell, String str, String str2, String str3, String str4, String str5, String str6, CallInCellButton callInCellButton, CallInCellTimer callInCellTimer, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = callInCell.statusIcon;
            }
            if ((i11 & 2) != 0) {
                str2 = callInCell.statusIconTintColor;
            }
            if ((i11 & 4) != 0) {
                str3 = callInCell.title;
            }
            if ((i11 & 8) != 0) {
                str4 = callInCell.titleColor;
            }
            if ((i11 & 16) != 0) {
                str5 = callInCell.subtitle;
            }
            if ((i11 & 32) != 0) {
                str6 = callInCell.subtitleColor;
            }
            if ((i11 & 64) != 0) {
                callInCellButton = callInCell.button;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                callInCellTimer = callInCell.timer;
            }
            CallInCellButton callInCellButton2 = callInCellButton;
            CallInCellTimer callInCellTimer2 = callInCellTimer;
            String str7 = str5;
            String str8 = str6;
            return callInCell.copy(str, str2, str3, str4, str7, str8, callInCellButton2, callInCellTimer2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStatusIcon() {
            return this.statusIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStatusIconTintColor() {
            return this.statusIconTintColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        /* renamed from: component7, reason: from getter */
        public final CallInCellButton getButton() {
            return this.button;
        }

        /* renamed from: component8, reason: from getter */
        public final CallInCellTimer getTimer() {
            return this.timer;
        }

        @NotNull
        public final CallInCell copy(@NotNull String statusIcon, String statusIconTintColor, @NotNull String title, String titleColor, @NotNull String subtitle, String subtitleColor, CallInCellButton button, CallInCellTimer timer) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new CallInCell(statusIcon, statusIconTintColor, title, titleColor, subtitle, subtitleColor, button, timer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallInCell)) {
                return false;
            }
            CallInCell callInCell = (CallInCell) other;
            return Intrinsics.d(this.statusIcon, callInCell.statusIcon) && Intrinsics.d(this.statusIconTintColor, callInCell.statusIconTintColor) && Intrinsics.d(this.title, callInCell.title) && Intrinsics.d(this.titleColor, callInCell.titleColor) && Intrinsics.d(this.subtitle, callInCell.subtitle) && Intrinsics.d(this.subtitleColor, callInCell.subtitleColor) && Intrinsics.d(this.button, callInCell.button) && Intrinsics.d(this.timer, callInCell.timer);
        }

        public final CallInCellButton getButton() {
            return this.button;
        }

        @NotNull
        public final String getStatusIcon() {
            return this.statusIcon;
        }

        public final String getStatusIconTintColor() {
            return this.statusIconTintColor;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        public final CallInCellTimer getTimer() {
            return this.timer;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            int hashCode = this.statusIcon.hashCode() * 31;
            String str = this.statusIconTintColor;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
            String str2 = this.titleColor;
            int a12 = g.a((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.subtitle);
            String str3 = this.subtitleColor;
            int hashCode2 = (a12 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CallInCellButton callInCellButton = this.button;
            int hashCode3 = (hashCode2 + (callInCellButton == null ? 0 : callInCellButton.hashCode())) * 31;
            CallInCellTimer callInCellTimer = this.timer;
            return hashCode3 + (callInCellTimer != null ? callInCellTimer.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.statusIcon;
            String str2 = this.statusIconTintColor;
            String str3 = this.title;
            String str4 = this.titleColor;
            String str5 = this.subtitle;
            String str6 = this.subtitleColor;
            CallInCellButton callInCellButton = this.button;
            CallInCellTimer callInCellTimer = this.timer;
            StringBuilder d11 = C3660k.d("CallInCell(statusIcon=", str, ", statusIconTintColor=", str2, ", title=");
            Nh.a.h(d11, str3, ", titleColor=", str4, ", subtitle=");
            Nh.a.h(d11, str5, ", subtitleColor=", str6, ", button=");
            d11.append(callInCellButton);
            d11.append(", timer=");
            d11.append(callInCellTimer);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.statusIcon);
            dest.writeString(this.statusIconTintColor);
            dest.writeString(this.title);
            dest.writeString(this.titleColor);
            dest.writeString(this.subtitle);
            dest.writeString(this.subtitleColor);
            CallInCellButton callInCellButton = this.button;
            if (callInCellButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                callInCellButton.writeToParcel(dest, flags);
            }
            CallInCellTimer callInCellTimer = this.timer;
            if (callInCellTimer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                callInCellTimer.writeToParcel(dest, flags);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContinueButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ContinueButton> CREATOR = new a();

        @NotNull
        private final String title;

        public static final class a implements Parcelable.Creator<ContinueButton> {
            @Override // android.os.Parcelable.Creator
            public final ContinueButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContinueButton(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContinueButton[] newArray(int i11) {
                return new ContinueButton[i11];
            }
        }

        public ContinueButton(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public static /* synthetic */ ContinueButton copy$default(ContinueButton continueButton, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = continueButton.title;
            }
            return continueButton.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ContinueButton copy(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ContinueButton(title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContinueButton) && Intrinsics.d(this.title, ((ContinueButton) other).title);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ContinueButton(title=", this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$HintButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "trackClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "getTrackClick", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HintButton> CREATOR = new a();

        @NotNull
        private final String deeplink;

        @NotNull
        private final String title;
        private final String trackClick;

        public static final class a implements Parcelable.Creator<HintButton> {
            @Override // android.os.Parcelable.Creator
            public final HintButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HintButton(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HintButton[] newArray(int i11) {
                return new HintButton[i11];
            }
        }

        public HintButton(@NotNull String title, @NotNull String deeplink, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
            this.trackClick = str;
        }

        public static /* synthetic */ HintButton copy$default(HintButton hintButton, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hintButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = hintButton.deeplink;
            }
            if ((i11 & 4) != 0) {
                str3 = hintButton.trackClick;
            }
            return hintButton.copy(str, str2, str3);
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

        /* renamed from: component3, reason: from getter */
        public final String getTrackClick() {
            return this.trackClick;
        }

        @NotNull
        public final HintButton copy(@NotNull String title, @NotNull String deeplink, String trackClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new HintButton(title, deeplink, trackClick);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintButton)) {
                return false;
            }
            HintButton hintButton = (HintButton) other;
            return Intrinsics.d(this.title, hintButton.title) && Intrinsics.d(this.deeplink, hintButton.deeplink) && Intrinsics.d(this.trackClick, hintButton.trackClick);
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
            String str = this.trackClick;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.deeplink;
            return o0.c(C3660k.d("HintButton(title=", str, ", deeplink=", str2, ", trackClick="), this.trackClick, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.deeplink);
            dest.writeString(this.trackClick);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u0016¨\u0006)"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input$b;", "type", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.NAME, "focusTrackAction", "<init>", "(Lru/ozon/id/nativeauth/data/models/OtpDTO$Input$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$Input$b;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lru/ozon/id/nativeauth/data/models/OtpDTO$Input$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input$b;", "getType", "Ljava/lang/String;", "getValue", "getName", "getFocusTrackAction", "b", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();
        private final String focusTrackAction;
        private final String name;

        @NotNull
        private final b type;
        private final String value;

        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Input(b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i11) {
                return new Input[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$Input$b;", "", "<init>", "(Ljava/lang/String;I)V", "DIGIT", "TEXT", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class b {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;

            @i(name = "digit")
            public static final b DIGIT = new b("DIGIT", 0);

            @i(name = "text")
            public static final b TEXT = new b("TEXT", 1);

            private static final /* synthetic */ b[] $values() {
                return new b[]{DIGIT, TEXT};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private b(String str, int i11) {
            }

            @NotNull
            public static Xc.a<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public Input(@NotNull b type, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.value = str;
            this.name = str2;
            this.focusTrackAction = str3;
        }

        public static /* synthetic */ Input copy$default(Input input, b bVar, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = input.type;
            }
            if ((i11 & 2) != 0) {
                str = input.value;
            }
            if ((i11 & 4) != 0) {
                str2 = input.name;
            }
            if ((i11 & 8) != 0) {
                str3 = input.focusTrackAction;
            }
            return input.copy(bVar, str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final b getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFocusTrackAction() {
            return this.focusTrackAction;
        }

        @NotNull
        public final Input copy(@NotNull b type, String value, String name, String focusTrackAction) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Input(type, value, name, focusTrackAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return this.type == input.type && Intrinsics.d(this.value, input.value) && Intrinsics.d(this.name, input.name) && Intrinsics.d(this.focusTrackAction, input.focusTrackAction);
        }

        public final String getFocusTrackAction() {
            return this.focusTrackAction;
        }

        public final String getName() {
            return this.name;
        }

        @NotNull
        public final b getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.focusTrackAction;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            b bVar = this.type;
            String str = this.value;
            String str2 = this.name;
            String str3 = this.focusTrackAction;
            StringBuilder sb2 = new StringBuilder("Input(type=");
            sb2.append(bVar);
            sb2.append(", value=");
            sb2.append(str);
            sb2.append(", name=");
            return C3173b.c(sb2, str2, ", focusTrackAction=", str3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeString(this.value);
            dest.writeString(this.name);
            dest.writeString(this.focusTrackAction);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "icon", "", "iconTintColor", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MessengerOtpCell implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MessengerOtpCell> CREATOR = new a();

        @NotNull
        private final String icon;
        private final String iconTintColor;

        @NotNull
        private final OzonSpannableString title;

        public static final class a implements Parcelable.Creator<MessengerOtpCell> {
            @Override // android.os.Parcelable.Creator
            public final MessengerOtpCell createFromParcel(Parcel parcel) {
                OzonSpannableString ozonSpannableString;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    ozonSpannableString = null;
                } else {
                    String readString = parcel.readString();
                    if (readString == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString, 63), '\n'));
                }
                return new MessengerOtpCell(ozonSpannableString, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MessengerOtpCell[] newArray(int i11) {
                return new MessengerOtpCell[i11];
            }
        }

        public MessengerOtpCell(@NotNull OzonSpannableString title, @NotNull String icon, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.icon = icon;
            this.iconTintColor = str;
        }

        public static /* synthetic */ MessengerOtpCell copy$default(MessengerOtpCell messengerOtpCell, OzonSpannableString ozonSpannableString, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = messengerOtpCell.title;
            }
            if ((i11 & 2) != 0) {
                str = messengerOtpCell.icon;
            }
            if ((i11 & 4) != 0) {
                str2 = messengerOtpCell.iconTintColor;
            }
            return messengerOtpCell.copy(ozonSpannableString, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        public final MessengerOtpCell copy(@NotNull OzonSpannableString title, @NotNull String icon, String iconTintColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new MessengerOtpCell(title, icon, iconTintColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessengerOtpCell)) {
                return false;
            }
            MessengerOtpCell messengerOtpCell = (MessengerOtpCell) other;
            return Intrinsics.d(this.title, messengerOtpCell.title) && Intrinsics.d(this.icon, messengerOtpCell.icon) && Intrinsics.d(this.iconTintColor, messengerOtpCell.iconTintColor);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.icon);
            String str = this.iconTintColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            String str = this.icon;
            return o0.c(GR.b.f("MessengerOtpCell(title=", ozonSpannableString, ", icon=", str, ", iconTintColor="), this.iconTintColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableString ozonSpannableString = this.title;
            Intrinsics.checkNotNullParameter(dest, "parcel");
            if (ozonSpannableString == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(Html.toHtml(ozonSpannableString, 1));
            }
            dest.writeString(this.icon);
            dest.writeString(this.iconTintColor);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "Landroid/os/Parcelable;", "text", "", "accent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAccent", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhoneExample implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PhoneExample> CREATOR = new a();

        @NotNull
        private final String accent;

        @NotNull
        private final String text;

        public static final class a implements Parcelable.Creator<PhoneExample> {
            @Override // android.os.Parcelable.Creator
            public final PhoneExample createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneExample(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PhoneExample[] newArray(int i11) {
                return new PhoneExample[i11];
            }
        }

        public PhoneExample(@NotNull String text, @NotNull String accent) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(accent, "accent");
            this.text = text;
            this.accent = accent;
        }

        public static /* synthetic */ PhoneExample copy$default(PhoneExample phoneExample, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = phoneExample.text;
            }
            if ((i11 & 2) != 0) {
                str2 = phoneExample.accent;
            }
            return phoneExample.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAccent() {
            return this.accent;
        }

        @NotNull
        public final PhoneExample copy(@NotNull String text, @NotNull String accent) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(accent, "accent");
            return new PhoneExample(text, accent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneExample)) {
                return false;
            }
            PhoneExample phoneExample = (PhoneExample) other;
            return Intrinsics.d(this.text, phoneExample.text) && Intrinsics.d(this.accent, phoneExample.accent);
        }

        @NotNull
        public final String getAccent() {
            return this.accent;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.accent.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("PhoneExample(text=", this.text, ", accent=", this.accent, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeString(this.accent);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "timerDuration", "deeplink", "action", "", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/lang/Integer;", "getTimerDuration", "()Ljava/lang/Integer;", "getDeeplink", "getAction", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RetryButton> CREATOR = new a();

        @NotNull
        private final String action;
        private final Map<String, Object> data;
        private final String deeplink;
        private final String subtitle;
        private final Integer timerDuration;

        @NotNull
        private final String title;

        public static final class a implements Parcelable.Creator<RetryButton> {
            @Override // android.os.Parcelable.Creator
            public final RetryButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap.put(parcel.readString(), parcel.readValue(RetryButton.class.getClassLoader()));
                    }
                }
                return new RetryButton(readString, readString2, valueOf, readString3, readString4, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final RetryButton[] newArray(int i11) {
                return new RetryButton[i11];
            }
        }

        public RetryButton(@NotNull String title, String str, Integer num, String str2, @NotNull String action, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.subtitle = str;
            this.timerDuration = num;
            this.deeplink = str2;
            this.action = action;
            this.data = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        public final String getDeeplink() {
            return this.deeplink;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            Integer num = this.timerDuration;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeString(this.deeplink);
            dest.writeString(this.action);
            Map<String, Object> map = this.data;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
    }

    public static final class a implements Parcelable.Creator<OtpDTO> {
        @Override // android.os.Parcelable.Creator
        public final OtpDTO createFromParcel(Parcel parcel) {
            OzonSpannableString ozonSpannableString;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            int i11 = 0;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b valueOf = b.valueOf(parcel.readString());
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                ozonSpannableString = null;
            } else {
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString2, 63), '\n'));
            }
            MessengerOtpCell createFromParcel = parcel.readInt() == 0 ? null : MessengerOtpCell.CREATOR.createFromParcel(parcel);
            Input createFromParcel2 = parcel.readInt() == 0 ? null : Input.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i12 = 0; i12 != readInt; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(OtpDTO.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i11 != readInt2) {
                    i11 = Ak.b.b(HintButton.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new OtpDTO(valueOf, readString, ozonSpannableString, createFromParcel, createFromParcel2, readString3, linkedHashMap, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : PhoneExample.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContinueButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AgreementSheet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DisclaimerDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RetryButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? CallInCell.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OtpDTO[] newArray(int i11) {
            return new OtpDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "ErrorDefault", "ErrorTimeout", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @i(name = "otpDefault")
        public static final b Default = new b("Default", 0);

        @i(name = "otpErrorDefault")
        public static final b ErrorDefault = new b("ErrorDefault", 1);

        @i(name = "otpErrorTimeout")
        public static final b ErrorTimeout = new b("ErrorTimeout", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{Default, ErrorDefault, ErrorTimeout};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private b(String str, int i11) {
        }

        @NotNull
        public static Xc.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public OtpDTO(@NotNull b pageType, @NotNull String title, OzonSpannableString ozonSpannableString, MessengerOtpCell messengerOtpCell, Input input, String str, Map<String, ? extends Object> map, List<HintButton> list, Integer num, PhoneExample phoneExample, ContinueButton continueButton, AgreementSheet agreementSheet, DisclaimerDTO disclaimerDTO, RetryButton retryButton, String str2, CallInCell callInCell) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.pageType = pageType;
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.messengerOtpCell = messengerOtpCell;
        this.input = input;
        this.action = str;
        this.data = map;
        this.hintButtons = list;
        this.otpLength = num;
        this.phoneExample = phoneExample;
        this.continueButton = continueButton;
        this.agreementSheet = agreementSheet;
        this.disclaimer = disclaimerDTO;
        this.retryButton = retryButton;
        this.errorLogoUrl = str2;
        this.callInCell = callInCell;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final b getPageType() {
        return this.pageType;
    }

    /* renamed from: component10, reason: from getter */
    public final PhoneExample getPhoneExample() {
        return this.phoneExample;
    }

    /* renamed from: component11, reason: from getter */
    public final ContinueButton getContinueButton() {
        return this.continueButton;
    }

    /* renamed from: component12, reason: from getter */
    public final AgreementSheet getAgreementSheet() {
        return this.agreementSheet;
    }

    /* renamed from: component13, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component14, reason: from getter */
    public final RetryButton getRetryButton() {
        return this.retryButton;
    }

    /* renamed from: component15, reason: from getter */
    public final String getErrorLogoUrl() {
        return this.errorLogoUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final CallInCell getCallInCell() {
        return this.callInCell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final MessengerOtpCell getMessengerOtpCell() {
        return this.messengerOtpCell;
    }

    /* renamed from: component5, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Map<String, Object> component7() {
        return this.data;
    }

    public final List<HintButton> component8() {
        return this.hintButtons;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final OtpDTO copy(@NotNull b pageType, @NotNull String title, OzonSpannableString subtitle, MessengerOtpCell messengerOtpCell, Input input, String action, Map<String, ? extends Object> data, List<HintButton> hintButtons, Integer otpLength, PhoneExample phoneExample, ContinueButton continueButton, AgreementSheet agreementSheet, DisclaimerDTO disclaimer, RetryButton retryButton, String errorLogoUrl, CallInCell callInCell) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(title, "title");
        return new OtpDTO(pageType, title, subtitle, messengerOtpCell, input, action, data, hintButtons, otpLength, phoneExample, continueButton, agreementSheet, disclaimer, retryButton, errorLogoUrl, callInCell);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpDTO)) {
            return false;
        }
        OtpDTO otpDTO = (OtpDTO) other;
        return this.pageType == otpDTO.pageType && Intrinsics.d(this.title, otpDTO.title) && Intrinsics.d(this.subtitle, otpDTO.subtitle) && Intrinsics.d(this.messengerOtpCell, otpDTO.messengerOtpCell) && Intrinsics.d(this.input, otpDTO.input) && Intrinsics.d(this.action, otpDTO.action) && Intrinsics.d(this.data, otpDTO.data) && Intrinsics.d(this.hintButtons, otpDTO.hintButtons) && Intrinsics.d(this.otpLength, otpDTO.otpLength) && Intrinsics.d(this.phoneExample, otpDTO.phoneExample) && Intrinsics.d(this.continueButton, otpDTO.continueButton) && Intrinsics.d(this.agreementSheet, otpDTO.agreementSheet) && Intrinsics.d(this.disclaimer, otpDTO.disclaimer) && Intrinsics.d(this.retryButton, otpDTO.retryButton) && Intrinsics.d(this.errorLogoUrl, otpDTO.errorLogoUrl) && Intrinsics.d(this.callInCell, otpDTO.callInCell);
    }

    public final String getAction() {
        return this.action;
    }

    public final AgreementSheet getAgreementSheet() {
        return this.agreementSheet;
    }

    public final CallInCell getCallInCell() {
        return this.callInCell;
    }

    public final ContinueButton getContinueButton() {
        return this.continueButton;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
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

    public final MessengerOtpCell getMessengerOtpCell() {
        return this.messengerOtpCell;
    }

    public final Integer getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final b getPageType() {
        return this.pageType;
    }

    public final PhoneExample getPhoneExample() {
        return this.phoneExample;
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
        int a11 = g.a(this.pageType.hashCode() * 31, 31, this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode = (a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        MessengerOtpCell messengerOtpCell = this.messengerOtpCell;
        int hashCode2 = (hashCode + (messengerOtpCell == null ? 0 : messengerOtpCell.hashCode())) * 31;
        Input input = this.input;
        int hashCode3 = (hashCode2 + (input == null ? 0 : input.hashCode())) * 31;
        String str = this.action;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.data;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List<HintButton> list = this.hintButtons;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.otpLength;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        PhoneExample phoneExample = this.phoneExample;
        int hashCode8 = (hashCode7 + (phoneExample == null ? 0 : phoneExample.hashCode())) * 31;
        ContinueButton continueButton = this.continueButton;
        int hashCode9 = (hashCode8 + (continueButton == null ? 0 : continueButton.hashCode())) * 31;
        AgreementSheet agreementSheet = this.agreementSheet;
        int hashCode10 = (hashCode9 + (agreementSheet == null ? 0 : agreementSheet.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode11 = (hashCode10 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        RetryButton retryButton = this.retryButton;
        int hashCode12 = (hashCode11 + (retryButton == null ? 0 : retryButton.hashCode())) * 31;
        String str2 = this.errorLogoUrl;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CallInCell callInCell = this.callInCell;
        return hashCode13 + (callInCell != null ? callInCell.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        b bVar = this.pageType;
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "OtpDTO(pageType=" + bVar + ", title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", messengerOtpCell=" + this.messengerOtpCell + ", input=" + this.input + ", action=" + this.action + ", data=" + this.data + ", hintButtons=" + this.hintButtons + ", otpLength=" + this.otpLength + ", phoneExample=" + this.phoneExample + ", continueButton=" + this.continueButton + ", agreementSheet=" + this.agreementSheet + ", disclaimer=" + this.disclaimer + ", retryButton=" + this.retryButton + ", errorLogoUrl=" + this.errorLogoUrl + ", callInCell=" + this.callInCell + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.pageType.name());
        dest.writeString(this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        Intrinsics.checkNotNullParameter(dest, "parcel");
        if (ozonSpannableString == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        MessengerOtpCell messengerOtpCell = this.messengerOtpCell;
        if (messengerOtpCell == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messengerOtpCell.writeToParcel(dest, flags);
        }
        Input input = this.input;
        if (input == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            input.writeToParcel(dest, flags);
        }
        dest.writeString(this.action);
        Map<String, Object> map = this.data;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        List<HintButton> list = this.hintButtons;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((HintButton) c11.next()).writeToParcel(dest, flags);
            }
        }
        Integer num = this.otpLength;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        PhoneExample phoneExample = this.phoneExample;
        if (phoneExample == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            phoneExample.writeToParcel(dest, flags);
        }
        ContinueButton continueButton = this.continueButton;
        if (continueButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            continueButton.writeToParcel(dest, flags);
        }
        AgreementSheet agreementSheet = this.agreementSheet;
        if (agreementSheet == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            agreementSheet.writeToParcel(dest, flags);
        }
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        if (disclaimerDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclaimerDTO.writeToParcel(dest, flags);
        }
        RetryButton retryButton = this.retryButton;
        if (retryButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            retryButton.writeToParcel(dest, flags);
        }
        dest.writeString(this.errorLogoUrl);
        CallInCell callInCell = this.callInCell;
        if (callInCell == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            callInCell.writeToParcel(dest, flags);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO$Agreement;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "isConfirmationRequired", "", "isCheckboxConfirmed", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ZZ)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Agreement implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Agreement> CREATOR = new a();
        private final boolean isCheckboxConfirmed;
        private final boolean isConfirmationRequired;

        @NotNull
        private final OzonSpannableString text;

        public static final class a implements Parcelable.Creator<Agreement> {
            @Override // android.os.Parcelable.Creator
            public final Agreement createFromParcel(Parcel parcel) {
                OzonSpannableString ozonSpannableString;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    ozonSpannableString = null;
                } else {
                    String readString = parcel.readString();
                    if (readString == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString, 63), '\n'));
                }
                return new Agreement(ozonSpannableString, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Agreement[] newArray(int i11) {
                return new Agreement[i11];
            }
        }

        public Agreement(@NotNull OzonSpannableString text, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isConfirmationRequired = z11;
            this.isCheckboxConfirmed = z12;
        }

        public static /* synthetic */ Agreement copy$default(Agreement agreement, OzonSpannableString ozonSpannableString, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = agreement.text;
            }
            if ((i11 & 2) != 0) {
                z11 = agreement.isConfirmationRequired;
            }
            if ((i11 & 4) != 0) {
                z12 = agreement.isCheckboxConfirmed;
            }
            return agreement.copy(ozonSpannableString, z11, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsConfirmationRequired() {
            return this.isConfirmationRequired;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckboxConfirmed() {
            return this.isCheckboxConfirmed;
        }

        @NotNull
        public final Agreement copy(@NotNull OzonSpannableString text, boolean isConfirmationRequired, boolean isCheckboxConfirmed) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Agreement(text, isConfirmationRequired, isCheckboxConfirmed);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Agreement)) {
                return false;
            }
            Agreement agreement = (Agreement) other;
            return Intrinsics.d(this.text, agreement.text) && this.isConfirmationRequired == agreement.isConfirmationRequired && this.isCheckboxConfirmed == agreement.isCheckboxConfirmed;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCheckboxConfirmed) + C3532b.a(this.text.hashCode() * 31, 31, this.isConfirmationRequired);
        }

        public final boolean isCheckboxConfirmed() {
            return this.isCheckboxConfirmed;
        }

        public final boolean isConfirmationRequired() {
            return this.isConfirmationRequired;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            boolean z11 = this.isConfirmationRequired;
            boolean z12 = this.isCheckboxConfirmed;
            StringBuilder sb2 = new StringBuilder("Agreement(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", isConfirmationRequired=");
            sb2.append(z11);
            sb2.append(", isCheckboxConfirmed=");
            return Pk0.a.a(")", sb2, z12);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableString ozonSpannableString = this.text;
            Intrinsics.checkNotNullParameter(dest, "parcel");
            if (ozonSpannableString == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(Html.toHtml(ozonSpannableString, 1));
            }
            dest.writeInt(this.isConfirmationRequired ? 1 : 0);
            dest.writeInt(this.isCheckboxConfirmed ? 1 : 0);
        }

        public /* synthetic */ Agreement(OzonSpannableString ozonSpannableString, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
        }
    }

    public /* synthetic */ OtpDTO(b bVar, String str, OzonSpannableString ozonSpannableString, MessengerOtpCell messengerOtpCell, Input input, String str2, Map map, List list, Integer num, PhoneExample phoneExample, ContinueButton continueButton, AgreementSheet agreementSheet, DisclaimerDTO disclaimerDTO, RetryButton retryButton, String str3, CallInCell callInCell, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? b.Default : bVar, str, ozonSpannableString, messengerOtpCell, input, str2, map, list, num, phoneExample, continueButton, agreementSheet, disclaimerDTO, retryButton, str3, callInCell);
    }
}
