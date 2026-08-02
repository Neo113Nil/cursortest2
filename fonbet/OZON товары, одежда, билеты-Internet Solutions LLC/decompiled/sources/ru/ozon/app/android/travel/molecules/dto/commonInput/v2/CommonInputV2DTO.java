package ru.ozon.app.android.travel.molecules.dto.commonInput.v2;

import B90.C2616s;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Pk0.f;
import V.e;
import Xc.a;
import Xc.b;
import com.google.android.gms.common.Scopes;
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
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001:\u0004stuvBã\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010(\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u000fHÆ\u0003J\t\u0010Z\u001a\u00020\u000fHÆ\u0003J\t\u0010[\u001a\u00020\u000fHÆ\u0003J\t\u0010\\\u001a\u00020\u000fHÆ\u0003J\t\u0010]\u001a\u00020\u000fHÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010c\u001a\u00020\u000fHÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010BJ\u0017\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003J\u0017\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003J\u0017\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003J\u0017\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010l\u001a\u00020)HÆ\u0003J\u0096\u0003\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020)HÆ\u0001¢\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020\u000f2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\u001eHÖ\u0001J\t\u0010r\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00108R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00108R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00108R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00108R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u001c\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u00108R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u001f\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bH\u0010ER\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0015\u0010&\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0013\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010/R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bN\u0010O¨\u0006w"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "", "type", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "defaultValue", FormPageDTO.Field.FIELD_TYPE_RANGE, "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;", HammersV3BodyDTO.PLACEHOLDER, "subtext", AppMeasurementSdk.ConditionalUserProperty.NAME, FormPageDTO.Field.FIELD_TYPE_MASK, "maskPattern", "isReadOnly", "", "isDisabled", "isTouched", "isInvalid", "checked", "errors", "", "options", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$SelectorOptionV2;", "onClick", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onChange", "onFocusLost", "isMultiline", "maxLength", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "inputTrackingInfo", "selectTrackingInfo", "focusLostTrackingInfo", "label", "showMaxLengthCounter", "icon", "status", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;)V", "getType", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;", "getValue", "()Ljava/lang/String;", "getDefaultValue", "getRange", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;", "getPlaceholder", "getSubtext", "getName", "getMask", "getMaskPattern", "()Z", "getChecked", "getErrors", "()Ljava/util/List;", "getOptions", "getOnClick", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOnChange", "getOnFocusLost", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "getInputTrackingInfo", "getSelectTrackingInfo", "getFocusLostTrackingInfo", "getLabel", "getShowMaxLengthCounter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "getStatus", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;)Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "equals", "other", "hashCode", "toString", "InputType", "InputStatus", "SelectorOptionV2", "DateRangeV2", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonInputV2DTO {
    private final boolean checked;
    private final String defaultValue;
    private final List<String> errors;
    private final Map<String, TokenizedTrackingInfo> focusLostTrackingInfo;
    private final String icon;
    private final Map<String, TokenizedTrackingInfo> inputTrackingInfo;
    private final boolean isDisabled;
    private final boolean isInvalid;
    private final boolean isMultiline;
    private final boolean isReadOnly;
    private final boolean isTouched;
    private final String label;
    private final String mask;
    private final String maskPattern;
    private final Integer maxLength;

    @NotNull
    private final String name;
    private final AtomActionDTO onChange;
    private final AtomActionDTO onClick;
    private final AtomActionDTO onFocusLost;
    private final List<SelectorOptionV2> options;
    private final String placeholder;
    private final DateRangeV2 range;
    private final Map<String, TokenizedTrackingInfo> selectTrackingInfo;
    private final Boolean showMaxLengthCounter;

    @NotNull
    private final InputStatus status;
    private final String subtext;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @EnumNullFallback
    private final InputType type;
    private final String value;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;", "", "start", "Lorg/joda/time/DateTime;", "finish", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getStart", "()Lorg/joda/time/DateTime;", "getFinish", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateRangeV2 {

        @NotNull
        private final DateTime finish;

        @NotNull
        private final DateTime start;

        public DateRangeV2(@NotNull DateTime start, @NotNull DateTime finish) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(finish, "finish");
            this.start = start;
            this.finish = finish;
        }

        public static /* synthetic */ DateRangeV2 copy$default(DateRangeV2 dateRangeV2, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dateTime = dateRangeV2.start;
            }
            if ((i11 & 2) != 0) {
                dateTime2 = dateRangeV2.finish;
            }
            return dateRangeV2.copy(dateTime, dateTime2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DateTime getStart() {
            return this.start;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DateTime getFinish() {
            return this.finish;
        }

        @NotNull
        public final DateRangeV2 copy(@NotNull DateTime start, @NotNull DateTime finish) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(finish, "finish");
            return new DateRangeV2(start, finish);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateRangeV2)) {
                return false;
            }
            DateRangeV2 dateRangeV2 = (DateRangeV2) other;
            return Intrinsics.d(this.start, dateRangeV2.start) && Intrinsics.d(this.finish, dateRangeV2.finish);
        }

        @NotNull
        public final DateTime getFinish() {
            return this.finish;
        }

        @NotNull
        public final DateTime getStart() {
            return this.start;
        }

        public int hashCode() {
            return this.finish.hashCode() + (this.start.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DateRangeV2(start=" + this.start + ", finish=" + this.finish + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "SUCCESS", "ERROR", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputStatus[] $VALUES;

        @i(name = "neutral")
        public static final InputStatus NEUTRAL = new InputStatus("NEUTRAL", 0);

        @i(name = "success")
        public static final InputStatus SUCCESS = new InputStatus("SUCCESS", 1);

        @i(name = "error")
        public static final InputStatus ERROR = new InputStatus("ERROR", 2);

        private static final /* synthetic */ InputStatus[] $values() {
            return new InputStatus[]{NEUTRAL, SUCCESS, ERROR};
        }

        static {
            InputStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private InputStatus(String str, int i11) {
        }

        public static InputStatus valueOf(String str) {
            return (InputStatus) Enum.valueOf(InputStatus.class, str);
        }

        public static InputStatus[] values() {
            return (InputStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBER", "SEARCH", "DATE", "EMAIL", "TELEPHONE", "CHECKBOX", "SELECT", "TEXT", "DIGITAL", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;

        @i(name = "number")
        public static final InputType NUMBER = new InputType("NUMBER", 0);

        @i(name = "search")
        public static final InputType SEARCH = new InputType("SEARCH", 1);

        @i(name = "date")
        public static final InputType DATE = new InputType("DATE", 2);

        @i(name = Scopes.EMAIL)
        public static final InputType EMAIL = new InputType("EMAIL", 3);

        @i(name = "tel")
        public static final InputType TELEPHONE = new InputType("TELEPHONE", 4);

        @i(name = "checkbox")
        public static final InputType CHECKBOX = new InputType("CHECKBOX", 5);

        @i(name = "select")
        public static final InputType SELECT = new InputType("SELECT", 6);

        @i(name = "text")
        public static final InputType TEXT = new InputType("TEXT", 7);

        @i(name = "digital")
        public static final InputType DIGITAL = new InputType("DIGITAL", 8);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{NUMBER, SEARCH, DATE, EMAIL, TELEPHONE, CHECKBOX, SELECT, TEXT, DIGITAL};
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private InputType(String str, int i11) {
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$SelectorOptionV2;", "", "code", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorOptionV2 {

        @NotNull
        private final String code;

        @NotNull
        private final String value;

        public SelectorOptionV2(@NotNull String code, @NotNull String value) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(value, "value");
            this.code = code;
            this.value = value;
        }

        public static /* synthetic */ SelectorOptionV2 copy$default(SelectorOptionV2 selectorOptionV2, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectorOptionV2.code;
            }
            if ((i11 & 2) != 0) {
                str2 = selectorOptionV2.value;
            }
            return selectorOptionV2.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final SelectorOptionV2 copy(@NotNull String code, @NotNull String value) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(value, "value");
            return new SelectorOptionV2(code, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorOptionV2)) {
                return false;
            }
            SelectorOptionV2 selectorOptionV2 = (SelectorOptionV2) other;
            return Intrinsics.d(this.code, selectorOptionV2.code) && Intrinsics.d(this.value, selectorOptionV2.value);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.code.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("SelectorOptionV2(code=", this.code, ", value=", this.value, ")");
        }
    }

    public CommonInputV2DTO(InputType inputType, String str, String str2, DateRangeV2 dateRangeV2, String str3, String str4, @NotNull String name, String str5, String str6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List<String> list, List<SelectorOptionV2> list2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, boolean z16, Integer num, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, String str7, Boolean bool, String str8, @NotNull InputStatus status) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        this.type = inputType;
        this.value = str;
        this.defaultValue = str2;
        this.range = dateRangeV2;
        this.placeholder = str3;
        this.subtext = str4;
        this.name = name;
        this.mask = str5;
        this.maskPattern = str6;
        this.isReadOnly = z11;
        this.isDisabled = z12;
        this.isTouched = z13;
        this.isInvalid = z14;
        this.checked = z15;
        this.errors = list;
        this.options = list2;
        this.onClick = atomActionDTO;
        this.onChange = atomActionDTO2;
        this.onFocusLost = atomActionDTO3;
        this.isMultiline = z16;
        this.maxLength = num;
        this.trackingInfo = map;
        this.inputTrackingInfo = map2;
        this.selectTrackingInfo = map3;
        this.focusLostTrackingInfo = map4;
        this.label = str7;
        this.showMaxLengthCounter = bool;
        this.icon = str8;
        this.status = status;
    }

    public static /* synthetic */ CommonInputV2DTO copy$default(CommonInputV2DTO commonInputV2DTO, InputType inputType, String str, String str2, DateRangeV2 dateRangeV2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, List list2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, boolean z16, Integer num, Map map, Map map2, Map map3, Map map4, String str8, Boolean bool, String str9, InputStatus inputStatus, int i11, Object obj) {
        InputStatus inputStatus2;
        String str10;
        InputType inputType2 = (i11 & 1) != 0 ? commonInputV2DTO.type : inputType;
        String str11 = (i11 & 2) != 0 ? commonInputV2DTO.value : str;
        String str12 = (i11 & 4) != 0 ? commonInputV2DTO.defaultValue : str2;
        DateRangeV2 dateRangeV22 = (i11 & 8) != 0 ? commonInputV2DTO.range : dateRangeV2;
        String str13 = (i11 & 16) != 0 ? commonInputV2DTO.placeholder : str3;
        String str14 = (i11 & 32) != 0 ? commonInputV2DTO.subtext : str4;
        String str15 = (i11 & 64) != 0 ? commonInputV2DTO.name : str5;
        String str16 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? commonInputV2DTO.mask : str6;
        String str17 = (i11 & 256) != 0 ? commonInputV2DTO.maskPattern : str7;
        boolean z17 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? commonInputV2DTO.isReadOnly : z11;
        boolean z18 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? commonInputV2DTO.isDisabled : z12;
        boolean z19 = (i11 & 2048) != 0 ? commonInputV2DTO.isTouched : z13;
        boolean z21 = (i11 & 4096) != 0 ? commonInputV2DTO.isInvalid : z14;
        boolean z22 = (i11 & 8192) != 0 ? commonInputV2DTO.checked : z15;
        InputType inputType3 = inputType2;
        List list3 = (i11 & 16384) != 0 ? commonInputV2DTO.errors : list;
        List list4 = (i11 & 32768) != 0 ? commonInputV2DTO.options : list2;
        AtomActionDTO atomActionDTO4 = (i11 & 65536) != 0 ? commonInputV2DTO.onClick : atomActionDTO;
        AtomActionDTO atomActionDTO5 = (i11 & 131072) != 0 ? commonInputV2DTO.onChange : atomActionDTO2;
        AtomActionDTO atomActionDTO6 = (i11 & 262144) != 0 ? commonInputV2DTO.onFocusLost : atomActionDTO3;
        boolean z23 = (i11 & 524288) != 0 ? commonInputV2DTO.isMultiline : z16;
        Integer num2 = (i11 & 1048576) != 0 ? commonInputV2DTO.maxLength : num;
        Map map5 = (i11 & 2097152) != 0 ? commonInputV2DTO.trackingInfo : map;
        Map map6 = (i11 & 4194304) != 0 ? commonInputV2DTO.inputTrackingInfo : map2;
        Map map7 = (i11 & 8388608) != 0 ? commonInputV2DTO.selectTrackingInfo : map3;
        Map map8 = (i11 & 16777216) != 0 ? commonInputV2DTO.focusLostTrackingInfo : map4;
        String str18 = (i11 & 33554432) != 0 ? commonInputV2DTO.label : str8;
        Boolean bool2 = (i11 & 67108864) != 0 ? commonInputV2DTO.showMaxLengthCounter : bool;
        String str19 = (i11 & 134217728) != 0 ? commonInputV2DTO.icon : str9;
        if ((i11 & 268435456) != 0) {
            str10 = str19;
            inputStatus2 = commonInputV2DTO.status;
        } else {
            inputStatus2 = inputStatus;
            str10 = str19;
        }
        return commonInputV2DTO.copy(inputType3, str11, str12, dateRangeV22, str13, str14, str15, str16, str17, z17, z18, z19, z21, z22, list3, list4, atomActionDTO4, atomActionDTO5, atomActionDTO6, z23, num2, map5, map6, map7, map8, str18, bool2, str10, inputStatus2);
    }

    /* renamed from: component1, reason: from getter */
    public final InputType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsTouched() {
        return this.isTouched;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsInvalid() {
        return this.isInvalid;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    public final List<String> component15() {
        return this.errors;
    }

    public final List<SelectorOptionV2> component16() {
        return this.options;
    }

    /* renamed from: component17, reason: from getter */
    public final AtomActionDTO getOnClick() {
        return this.onClick;
    }

    /* renamed from: component18, reason: from getter */
    public final AtomActionDTO getOnChange() {
        return this.onChange;
    }

    /* renamed from: component19, reason: from getter */
    public final AtomActionDTO getOnFocusLost() {
        return this.onFocusLost;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsMultiline() {
        return this.isMultiline;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Map<String, TokenizedTrackingInfo> component22() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component23() {
        return this.inputTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component24() {
        return this.selectTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component25() {
        return this.focusLostTrackingInfo;
    }

    /* renamed from: component26, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getShowMaxLengthCounter() {
        return this.showMaxLengthCounter;
    }

    /* renamed from: component28, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final InputStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component4, reason: from getter */
    public final DateRangeV2 getRange() {
        return this.range;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMaskPattern() {
        return this.maskPattern;
    }

    @NotNull
    public final CommonInputV2DTO copy(InputType type, String value, String defaultValue, DateRangeV2 range, String placeholder, String subtext, @NotNull String name, String mask, String maskPattern, boolean isReadOnly, boolean isDisabled, boolean isTouched, boolean isInvalid, boolean checked, List<String> errors, List<SelectorOptionV2> options, AtomActionDTO onClick, AtomActionDTO onChange, AtomActionDTO onFocusLost, boolean isMultiline, Integer maxLength, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> inputTrackingInfo, Map<String, TokenizedTrackingInfo> selectTrackingInfo, Map<String, TokenizedTrackingInfo> focusLostTrackingInfo, String label, Boolean showMaxLengthCounter, String icon, @NotNull InputStatus status) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        return new CommonInputV2DTO(type, value, defaultValue, range, placeholder, subtext, name, mask, maskPattern, isReadOnly, isDisabled, isTouched, isInvalid, checked, errors, options, onClick, onChange, onFocusLost, isMultiline, maxLength, trackingInfo, inputTrackingInfo, selectTrackingInfo, focusLostTrackingInfo, label, showMaxLengthCounter, icon, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonInputV2DTO)) {
            return false;
        }
        CommonInputV2DTO commonInputV2DTO = (CommonInputV2DTO) other;
        return this.type == commonInputV2DTO.type && Intrinsics.d(this.value, commonInputV2DTO.value) && Intrinsics.d(this.defaultValue, commonInputV2DTO.defaultValue) && Intrinsics.d(this.range, commonInputV2DTO.range) && Intrinsics.d(this.placeholder, commonInputV2DTO.placeholder) && Intrinsics.d(this.subtext, commonInputV2DTO.subtext) && Intrinsics.d(this.name, commonInputV2DTO.name) && Intrinsics.d(this.mask, commonInputV2DTO.mask) && Intrinsics.d(this.maskPattern, commonInputV2DTO.maskPattern) && this.isReadOnly == commonInputV2DTO.isReadOnly && this.isDisabled == commonInputV2DTO.isDisabled && this.isTouched == commonInputV2DTO.isTouched && this.isInvalid == commonInputV2DTO.isInvalid && this.checked == commonInputV2DTO.checked && Intrinsics.d(this.errors, commonInputV2DTO.errors) && Intrinsics.d(this.options, commonInputV2DTO.options) && Intrinsics.d(this.onClick, commonInputV2DTO.onClick) && Intrinsics.d(this.onChange, commonInputV2DTO.onChange) && Intrinsics.d(this.onFocusLost, commonInputV2DTO.onFocusLost) && this.isMultiline == commonInputV2DTO.isMultiline && Intrinsics.d(this.maxLength, commonInputV2DTO.maxLength) && Intrinsics.d(this.trackingInfo, commonInputV2DTO.trackingInfo) && Intrinsics.d(this.inputTrackingInfo, commonInputV2DTO.inputTrackingInfo) && Intrinsics.d(this.selectTrackingInfo, commonInputV2DTO.selectTrackingInfo) && Intrinsics.d(this.focusLostTrackingInfo, commonInputV2DTO.focusLostTrackingInfo) && Intrinsics.d(this.label, commonInputV2DTO.label) && Intrinsics.d(this.showMaxLengthCounter, commonInputV2DTO.showMaxLengthCounter) && Intrinsics.d(this.icon, commonInputV2DTO.icon) && this.status == commonInputV2DTO.status;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final Map<String, TokenizedTrackingInfo> getFocusLostTrackingInfo() {
        return this.focusLostTrackingInfo;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Map<String, TokenizedTrackingInfo> getInputTrackingInfo() {
        return this.inputTrackingInfo;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getMaskPattern() {
        return this.maskPattern;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final AtomActionDTO getOnChange() {
        return this.onChange;
    }

    public final AtomActionDTO getOnClick() {
        return this.onClick;
    }

    public final AtomActionDTO getOnFocusLost() {
        return this.onFocusLost;
    }

    public final List<SelectorOptionV2> getOptions() {
        return this.options;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final DateRangeV2 getRange() {
        return this.range;
    }

    public final Map<String, TokenizedTrackingInfo> getSelectTrackingInfo() {
        return this.selectTrackingInfo;
    }

    public final Boolean getShowMaxLengthCounter() {
        return this.showMaxLengthCounter;
    }

    @NotNull
    public final InputStatus getStatus() {
        return this.status;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final InputType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        InputType inputType = this.type;
        int hashCode = (inputType == null ? 0 : inputType.hashCode()) * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateRangeV2 dateRangeV2 = this.range;
        int hashCode4 = (hashCode3 + (dateRangeV2 == null ? 0 : dateRangeV2.hashCode())) * 31;
        String str3 = this.placeholder;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtext;
        int a11 = g.a((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.name);
        String str5 = this.mask;
        int hashCode6 = (a11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maskPattern;
        int a12 = C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isReadOnly), 31, this.isDisabled), 31, this.isTouched), 31, this.isInvalid), 31, this.checked);
        List<String> list = this.errors;
        int hashCode7 = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        List<SelectorOptionV2> list2 = this.options;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.onClick;
        int hashCode9 = (hashCode8 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.onChange;
        int hashCode10 = (hashCode9 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        AtomActionDTO atomActionDTO3 = this.onFocusLost;
        int a13 = C3532b.a((hashCode10 + (atomActionDTO3 == null ? 0 : atomActionDTO3.hashCode())) * 31, 31, this.isMultiline);
        Integer num = this.maxLength;
        int hashCode11 = (a13 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.inputTrackingInfo;
        int hashCode13 = (hashCode12 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.selectTrackingInfo;
        int hashCode14 = (hashCode13 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map4 = this.focusLostTrackingInfo;
        int hashCode15 = (hashCode14 + (map4 == null ? 0 : map4.hashCode())) * 31;
        String str7 = this.label;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.showMaxLengthCounter;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.icon;
        return this.status.hashCode() + ((hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isInvalid() {
        return this.isInvalid;
    }

    public final boolean isMultiline() {
        return this.isMultiline;
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public final boolean isTouched() {
        return this.isTouched;
    }

    @NotNull
    public String toString() {
        InputType inputType = this.type;
        String str = this.value;
        String str2 = this.defaultValue;
        DateRangeV2 dateRangeV2 = this.range;
        String str3 = this.placeholder;
        String str4 = this.subtext;
        String str5 = this.name;
        String str6 = this.mask;
        String str7 = this.maskPattern;
        boolean z11 = this.isReadOnly;
        boolean z12 = this.isDisabled;
        boolean z13 = this.isTouched;
        boolean z14 = this.isInvalid;
        boolean z15 = this.checked;
        List<String> list = this.errors;
        List<SelectorOptionV2> list2 = this.options;
        AtomActionDTO atomActionDTO = this.onClick;
        AtomActionDTO atomActionDTO2 = this.onChange;
        AtomActionDTO atomActionDTO3 = this.onFocusLost;
        boolean z16 = this.isMultiline;
        Integer num = this.maxLength;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.inputTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.selectTrackingInfo;
        Map<String, TokenizedTrackingInfo> map4 = this.focusLostTrackingInfo;
        String str8 = this.label;
        Boolean bool = this.showMaxLengthCounter;
        String str9 = this.icon;
        InputStatus inputStatus = this.status;
        StringBuilder sb2 = new StringBuilder("CommonInputV2DTO(type=");
        sb2.append(inputType);
        sb2.append(", value=");
        sb2.append(str);
        sb2.append(", defaultValue=");
        sb2.append(str2);
        sb2.append(", range=");
        sb2.append(dateRangeV2);
        sb2.append(", placeholder=");
        Nh.a.h(sb2, str3, ", subtext=", str4, ", name=");
        Nh.a.h(sb2, str5, ", mask=", str6, ", maskPattern=");
        C2880a.c(str7, ", isReadOnly=", ", isDisabled=", sb2, z11);
        f.c(", isTouched=", ", isInvalid=", sb2, z12, z13);
        f.c(", checked=", ", errors=", sb2, z14, z15);
        C2616s.g(", options=", ", onClick=", sb2, list, list2);
        sb2.append(atomActionDTO);
        sb2.append(", onChange=");
        sb2.append(atomActionDTO2);
        sb2.append(", onFocusLost=");
        sb2.append(atomActionDTO3);
        sb2.append(", isMultiline=");
        sb2.append(z16);
        sb2.append(", maxLength=");
        sb2.append(num);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", inputTrackingInfo=");
        Tl.b.g(sb2, map2, ", selectTrackingInfo=", map3, ", focusLostTrackingInfo=");
        sb2.append(map4);
        sb2.append(", label=");
        sb2.append(str8);
        sb2.append(", showMaxLengthCounter=");
        HY.b.c(bool, ", icon=", str9, ", status=", sb2);
        sb2.append(inputStatus);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ CommonInputV2DTO(InputType inputType, String str, String str2, DateRangeV2 dateRangeV2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, List list2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, boolean z16, Integer num, Map map, Map map2, Map map3, Map map4, String str8, Boolean bool, String str9, InputStatus inputStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputType, str, str2, dateRangeV2, str3, str4, str5, str6, str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z12, (i11 & 2048) != 0 ? false : z13, (i11 & 4096) != 0 ? false : z14, (i11 & 8192) != 0 ? false : z15, list, list2, atomActionDTO, atomActionDTO2, atomActionDTO3, (524288 & i11) != 0 ? false : z16, num, map, map2, map3, map4, str8, bool, str9, (i11 & 268435456) != 0 ? InputStatus.NEUTRAL : inputStatus);
    }
}
