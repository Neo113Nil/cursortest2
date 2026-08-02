package ru.ozon.id.nativeauth.data.models;

import C.J;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010/J\u001e\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bG\u0010/J\u0012\u0010H\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bH\u0010IJÞ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bL\u0010/J\u0010\u0010M\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bM\u0010+J\u001a\u0010P\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\bY\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\b\\\u0010/R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b^\u00108R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bb\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010e\u001a\u0004\bf\u0010@R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010g\u001a\u0004\bh\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bj\u0010DR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010k\u001a\u0004\bl\u0010FR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010T\u001a\u0004\bm\u0010/R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010n\u001a\u0004\bo\u0010I¨\u0006p"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpVO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "pageType", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "messengerOtpCell", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "input", "action", "", "", "data", "", "Lru/ozon/id/nativeauth/data/models/OtpDTO$HintButton;", "hintButtons", "", "otpLength", "Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "phoneExample", "Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "continueButton", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "agreementSheet", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "retryButton", "errorLogoUrl", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "callInCell", "<init>", "(Lru/ozon/id/nativeauth/data/models/OtpDTO$b;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;Lru/ozon/id/common/disclaimer/DisclaimerDTO;Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "component2", "()Ljava/lang/String;", "component3", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component4", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "component5", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "component6", "component7", "()Ljava/util/Map;", "component8", "()Ljava/util/List;", "component9", "()Ljava/lang/Integer;", "component10", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "component11", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "component12", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "component13", "()Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "component14", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "component15", "component16", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "copy", "(Lru/ozon/id/nativeauth/data/models/OtpDTO$b;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;Lru/ozon/id/common/disclaimer/DisclaimerDTO;Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;)Lru/ozon/id/nativeauth/data/models/OtpVO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "getPageType", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "getMessengerOtpCell", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "getInput", "getAction", "Ljava/util/Map;", "getData", "Ljava/util/List;", "getHintButtons", "Ljava/lang/Integer;", "getOtpLength", "Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "getPhoneExample", "Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "getContinueButton", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "getAgreementSheet", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "getDisclaimer", "Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "getRetryButton", "getErrorLogoUrl", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "getCallInCell", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OtpVO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtpVO> CREATOR = new a();
    private final String action;
    private final OtpDTO.AgreementSheet agreementSheet;
    private final OtpDTO.CallInCell callInCell;
    private final OtpDTO.ContinueButton continueButton;
    private final Map<String, Object> data;
    private final DisclaimerDTO disclaimer;
    private final String errorLogoUrl;
    private final List<OtpDTO.HintButton> hintButtons;
    private final OtpDTO.Input input;
    private final OtpDTO.MessengerOtpCell messengerOtpCell;
    private final Integer otpLength;

    @NotNull
    private final OtpDTO.b pageType;
    private final OtpDTO.PhoneExample phoneExample;
    private final OtpDTO.RetryButton retryButton;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    public static final class a implements Parcelable.Creator<OtpVO> {
        @Override // android.os.Parcelable.Creator
        public final OtpVO createFromParcel(Parcel parcel) {
            OzonSpannableString ozonSpannableString;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            int i11 = 0;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OtpDTO.b valueOf = OtpDTO.b.valueOf(parcel.readString());
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
            OtpDTO.MessengerOtpCell createFromParcel = parcel.readInt() == 0 ? null : OtpDTO.MessengerOtpCell.CREATOR.createFromParcel(parcel);
            OtpDTO.Input createFromParcel2 = parcel.readInt() == 0 ? null : OtpDTO.Input.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i12 = 0; i12 != readInt; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(OtpVO.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i11 != readInt2) {
                    i11 = Ak.b.b(OtpDTO.HintButton.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new OtpVO(valueOf, readString, ozonSpannableString, createFromParcel, createFromParcel2, readString3, linkedHashMap, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : OtpDTO.PhoneExample.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OtpDTO.ContinueButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OtpDTO.AgreementSheet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DisclaimerDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OtpDTO.RetryButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? OtpDTO.CallInCell.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OtpVO[] newArray(int i11) {
            return new OtpVO[i11];
        }
    }

    public OtpVO(@NotNull OtpDTO.b pageType, @NotNull String title, OzonSpannableString ozonSpannableString, OtpDTO.MessengerOtpCell messengerOtpCell, OtpDTO.Input input, String str, Map<String, ? extends Object> map, List<OtpDTO.HintButton> list, Integer num, OtpDTO.PhoneExample phoneExample, OtpDTO.ContinueButton continueButton, OtpDTO.AgreementSheet agreementSheet, DisclaimerDTO disclaimerDTO, OtpDTO.RetryButton retryButton, String str2, OtpDTO.CallInCell callInCell) {
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
    public final OtpDTO.b getPageType() {
        return this.pageType;
    }

    /* renamed from: component10, reason: from getter */
    public final OtpDTO.PhoneExample getPhoneExample() {
        return this.phoneExample;
    }

    /* renamed from: component11, reason: from getter */
    public final OtpDTO.ContinueButton getContinueButton() {
        return this.continueButton;
    }

    /* renamed from: component12, reason: from getter */
    public final OtpDTO.AgreementSheet getAgreementSheet() {
        return this.agreementSheet;
    }

    /* renamed from: component13, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component14, reason: from getter */
    public final OtpDTO.RetryButton getRetryButton() {
        return this.retryButton;
    }

    /* renamed from: component15, reason: from getter */
    public final String getErrorLogoUrl() {
        return this.errorLogoUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final OtpDTO.CallInCell getCallInCell() {
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
    public final OtpDTO.MessengerOtpCell getMessengerOtpCell() {
        return this.messengerOtpCell;
    }

    /* renamed from: component5, reason: from getter */
    public final OtpDTO.Input getInput() {
        return this.input;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Map<String, Object> component7() {
        return this.data;
    }

    public final List<OtpDTO.HintButton> component8() {
        return this.hintButtons;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final OtpVO copy(@NotNull OtpDTO.b pageType, @NotNull String title, OzonSpannableString subtitle, OtpDTO.MessengerOtpCell messengerOtpCell, OtpDTO.Input input, String action, Map<String, ? extends Object> data, List<OtpDTO.HintButton> hintButtons, Integer otpLength, OtpDTO.PhoneExample phoneExample, OtpDTO.ContinueButton continueButton, OtpDTO.AgreementSheet agreementSheet, DisclaimerDTO disclaimer, OtpDTO.RetryButton retryButton, String errorLogoUrl, OtpDTO.CallInCell callInCell) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(title, "title");
        return new OtpVO(pageType, title, subtitle, messengerOtpCell, input, action, data, hintButtons, otpLength, phoneExample, continueButton, agreementSheet, disclaimer, retryButton, errorLogoUrl, callInCell);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpVO)) {
            return false;
        }
        OtpVO otpVO = (OtpVO) other;
        return this.pageType == otpVO.pageType && Intrinsics.d(this.title, otpVO.title) && Intrinsics.d(this.subtitle, otpVO.subtitle) && Intrinsics.d(this.messengerOtpCell, otpVO.messengerOtpCell) && Intrinsics.d(this.input, otpVO.input) && Intrinsics.d(this.action, otpVO.action) && Intrinsics.d(this.data, otpVO.data) && Intrinsics.d(this.hintButtons, otpVO.hintButtons) && Intrinsics.d(this.otpLength, otpVO.otpLength) && Intrinsics.d(this.phoneExample, otpVO.phoneExample) && Intrinsics.d(this.continueButton, otpVO.continueButton) && Intrinsics.d(this.agreementSheet, otpVO.agreementSheet) && Intrinsics.d(this.disclaimer, otpVO.disclaimer) && Intrinsics.d(this.retryButton, otpVO.retryButton) && Intrinsics.d(this.errorLogoUrl, otpVO.errorLogoUrl) && Intrinsics.d(this.callInCell, otpVO.callInCell);
    }

    public final String getAction() {
        return this.action;
    }

    public final OtpDTO.AgreementSheet getAgreementSheet() {
        return this.agreementSheet;
    }

    public final OtpDTO.CallInCell getCallInCell() {
        return this.callInCell;
    }

    public final OtpDTO.ContinueButton getContinueButton() {
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

    public final List<OtpDTO.HintButton> getHintButtons() {
        return this.hintButtons;
    }

    public final OtpDTO.Input getInput() {
        return this.input;
    }

    public final OtpDTO.MessengerOtpCell getMessengerOtpCell() {
        return this.messengerOtpCell;
    }

    public final Integer getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final OtpDTO.b getPageType() {
        return this.pageType;
    }

    public final OtpDTO.PhoneExample getPhoneExample() {
        return this.phoneExample;
    }

    public final OtpDTO.RetryButton getRetryButton() {
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
        OtpDTO.MessengerOtpCell messengerOtpCell = this.messengerOtpCell;
        int hashCode2 = (hashCode + (messengerOtpCell == null ? 0 : messengerOtpCell.hashCode())) * 31;
        OtpDTO.Input input = this.input;
        int hashCode3 = (hashCode2 + (input == null ? 0 : input.hashCode())) * 31;
        String str = this.action;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.data;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List<OtpDTO.HintButton> list = this.hintButtons;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.otpLength;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        OtpDTO.PhoneExample phoneExample = this.phoneExample;
        int hashCode8 = (hashCode7 + (phoneExample == null ? 0 : phoneExample.hashCode())) * 31;
        OtpDTO.ContinueButton continueButton = this.continueButton;
        int hashCode9 = (hashCode8 + (continueButton == null ? 0 : continueButton.hashCode())) * 31;
        OtpDTO.AgreementSheet agreementSheet = this.agreementSheet;
        int hashCode10 = (hashCode9 + (agreementSheet == null ? 0 : agreementSheet.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode11 = (hashCode10 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        OtpDTO.RetryButton retryButton = this.retryButton;
        int hashCode12 = (hashCode11 + (retryButton == null ? 0 : retryButton.hashCode())) * 31;
        String str2 = this.errorLogoUrl;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OtpDTO.CallInCell callInCell = this.callInCell;
        return hashCode13 + (callInCell != null ? callInCell.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OtpDTO.b bVar = this.pageType;
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "OtpVO(pageType=" + bVar + ", title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", messengerOtpCell=" + this.messengerOtpCell + ", input=" + this.input + ", action=" + this.action + ", data=" + this.data + ", hintButtons=" + this.hintButtons + ", otpLength=" + this.otpLength + ", phoneExample=" + this.phoneExample + ", continueButton=" + this.continueButton + ", agreementSheet=" + this.agreementSheet + ", disclaimer=" + this.disclaimer + ", retryButton=" + this.retryButton + ", errorLogoUrl=" + this.errorLogoUrl + ", callInCell=" + this.callInCell + ")";
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
        OtpDTO.MessengerOtpCell messengerOtpCell = this.messengerOtpCell;
        if (messengerOtpCell == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messengerOtpCell.writeToParcel(dest, flags);
        }
        OtpDTO.Input input = this.input;
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
        List<OtpDTO.HintButton> list = this.hintButtons;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((OtpDTO.HintButton) c11.next()).writeToParcel(dest, flags);
            }
        }
        Integer num = this.otpLength;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        OtpDTO.PhoneExample phoneExample = this.phoneExample;
        if (phoneExample == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            phoneExample.writeToParcel(dest, flags);
        }
        OtpDTO.ContinueButton continueButton = this.continueButton;
        if (continueButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            continueButton.writeToParcel(dest, flags);
        }
        OtpDTO.AgreementSheet agreementSheet = this.agreementSheet;
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
        OtpDTO.RetryButton retryButton = this.retryButton;
        if (retryButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            retryButton.writeToParcel(dest, flags);
        }
        dest.writeString(this.errorLogoUrl);
        OtpDTO.CallInCell callInCell = this.callInCell;
        if (callInCell == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            callInCell.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ OtpVO(OtpDTO.b bVar, String str, OzonSpannableString ozonSpannableString, OtpDTO.MessengerOtpCell messengerOtpCell, OtpDTO.Input input, String str2, Map map, List list, Integer num, OtpDTO.PhoneExample phoneExample, OtpDTO.ContinueButton continueButton, OtpDTO.AgreementSheet agreementSheet, DisclaimerDTO disclaimerDTO, OtpDTO.RetryButton retryButton, String str3, OtpDTO.CallInCell callInCell, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? OtpDTO.b.Default : bVar, str, ozonSpannableString, messengerOtpCell, input, str2, map, list, num, phoneExample, continueButton, agreementSheet, disclaimerDTO, retryButton, str3, callInCell);
    }
}
