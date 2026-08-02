package ru.ozon.app.android.travel.molecules.dto.commonInput.v1;

import B90.C2616s;
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

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001:\u0003`abB£\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u000eHÆ\u0003J\t\u0010K\u001a\u00020\u000eHÆ\u0003J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\t\u0010M\u001a\u00020\u000eHÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010R\u001a\u00020\u000eHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010:J\u0017\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\u0017\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\t\u0010X\u001a\u00020\u000eHÆ\u0003J\t\u0010Y\u001a\u00020\u000eHÆ\u0003JÌ\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u001cHÖ\u0001J\t\u0010_\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u00101R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00101R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00101R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00101R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u001f\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001f\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0011\u0010\"\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010#\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u00101¨\u0006c"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "", "type", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "defaultValue", FormPageDTO.Field.FIELD_TYPE_RANGE, "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;", HammersV3BodyDTO.PLACEHOLDER, "subtext", AppMeasurementSdk.ConditionalUserProperty.NAME, FormPageDTO.Field.FIELD_TYPE_MASK, "isReadOnly", "", "isDisabled", "isTouched", "isInvalid", "errors", "", "options", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$SelectorOption;", "onClick", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onChange", "isMultiline", "selectedAction", "maxLength", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "selectTrackingInfo", "unfocusedTrackingInfo", "scrollOnMount", "focusOnMount", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZZ)V", "getType", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;", "getValue", "()Ljava/lang/String;", "getDefaultValue", "getRange", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;", "getPlaceholder", "getSubtext", "getName", "getMask", "()Z", "getErrors", "()Ljava/util/List;", "getOptions", "getOnClick", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOnChange", "getSelectedAction", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "getSelectTrackingInfo", "getUnfocusedTrackingInfo", "getScrollOnMount", "getFocusOnMount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZZ)Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "equals", "other", "hashCode", "toString", "InputType", "SelectorOption", "DateRange", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonInputDTO {
    private final String defaultValue;
    private final List<String> errors;
    private final boolean focusOnMount;
    private final boolean isDisabled;
    private final boolean isInvalid;
    private final boolean isMultiline;
    private final boolean isReadOnly;
    private final boolean isTouched;
    private final String mask;
    private final Integer maxLength;

    @NotNull
    private final String name;
    private final AtomActionDTO onChange;
    private final AtomActionDTO onClick;
    private final List<SelectorOption> options;
    private final String placeholder;
    private final DateRange range;
    private final boolean scrollOnMount;
    private final Map<String, TokenizedTrackingInfo> selectTrackingInfo;
    private final AtomActionDTO selectedAction;
    private final String subtext;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final InputType type;
    private final Map<String, TokenizedTrackingInfo> unfocusedTrackingInfo;
    private final String value;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;", "", "start", "Lorg/joda/time/DateTime;", "finish", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getStart", "()Lorg/joda/time/DateTime;", "getFinish", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateRange {

        @NotNull
        private final DateTime finish;

        @NotNull
        private final DateTime start;

        public DateRange(@NotNull DateTime start, @NotNull DateTime finish) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(finish, "finish");
            this.start = start;
            this.finish = finish;
        }

        public static /* synthetic */ DateRange copy$default(DateRange dateRange, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dateTime = dateRange.start;
            }
            if ((i11 & 2) != 0) {
                dateTime2 = dateRange.finish;
            }
            return dateRange.copy(dateTime, dateTime2);
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
        public final DateRange copy(@NotNull DateTime start, @NotNull DateTime finish) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(finish, "finish");
            return new DateRange(start, finish);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateRange)) {
                return false;
            }
            DateRange dateRange = (DateRange) other;
            return Intrinsics.d(this.start, dateRange.start) && Intrinsics.d(this.finish, dateRange.finish);
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
            return "DateRange(start=" + this.start + ", finish=" + this.finish + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBER", "SEARCH", "DATE", "EMAIL", "TELEPHONE", "CHECKBOX", "SELECT", "TEXT", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{NUMBER, SEARCH, DATE, EMAIL, TELEPHONE, CHECKBOX, SELECT, TEXT};
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$SelectorOption;", "", "code", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorOption {

        @NotNull
        private final String code;

        @NotNull
        private final String value;

        public SelectorOption(@NotNull String code, @NotNull String value) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(value, "value");
            this.code = code;
            this.value = value;
        }

        public static /* synthetic */ SelectorOption copy$default(SelectorOption selectorOption, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectorOption.code;
            }
            if ((i11 & 2) != 0) {
                str2 = selectorOption.value;
            }
            return selectorOption.copy(str, str2);
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
        public final SelectorOption copy(@NotNull String code, @NotNull String value) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(value, "value");
            return new SelectorOption(code, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorOption)) {
                return false;
            }
            SelectorOption selectorOption = (SelectorOption) other;
            return Intrinsics.d(this.code, selectorOption.code) && Intrinsics.d(this.value, selectorOption.value);
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
            return e.a("SelectorOption(code=", this.code, ", value=", this.value, ")");
        }
    }

    public CommonInputDTO(@NotNull InputType type, String str, String str2, DateRange dateRange, String str3, String str4, @NotNull String name, String str5, boolean z11, boolean z12, boolean z13, boolean z14, List<String> list, List<SelectorOption> list2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, boolean z15, AtomActionDTO atomActionDTO3, Integer num, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, boolean z16, boolean z17) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = type;
        this.value = str;
        this.defaultValue = str2;
        this.range = dateRange;
        this.placeholder = str3;
        this.subtext = str4;
        this.name = name;
        this.mask = str5;
        this.isReadOnly = z11;
        this.isDisabled = z12;
        this.isTouched = z13;
        this.isInvalid = z14;
        this.errors = list;
        this.options = list2;
        this.onClick = atomActionDTO;
        this.onChange = atomActionDTO2;
        this.isMultiline = z15;
        this.selectedAction = atomActionDTO3;
        this.maxLength = num;
        this.trackingInfo = map;
        this.selectTrackingInfo = map2;
        this.unfocusedTrackingInfo = map3;
        this.scrollOnMount = z16;
        this.focusOnMount = z17;
    }

    public static /* synthetic */ CommonInputDTO copy$default(CommonInputDTO commonInputDTO, InputType inputType, String str, String str2, DateRange dateRange, String str3, String str4, String str5, String str6, boolean z11, boolean z12, boolean z13, boolean z14, List list, List list2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, boolean z15, AtomActionDTO atomActionDTO3, Integer num, Map map, Map map2, Map map3, boolean z16, boolean z17, int i11, Object obj) {
        boolean z18;
        boolean z19;
        InputType inputType2 = (i11 & 1) != 0 ? commonInputDTO.type : inputType;
        String str7 = (i11 & 2) != 0 ? commonInputDTO.value : str;
        String str8 = (i11 & 4) != 0 ? commonInputDTO.defaultValue : str2;
        DateRange dateRange2 = (i11 & 8) != 0 ? commonInputDTO.range : dateRange;
        String str9 = (i11 & 16) != 0 ? commonInputDTO.placeholder : str3;
        String str10 = (i11 & 32) != 0 ? commonInputDTO.subtext : str4;
        String str11 = (i11 & 64) != 0 ? commonInputDTO.name : str5;
        String str12 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? commonInputDTO.mask : str6;
        boolean z21 = (i11 & 256) != 0 ? commonInputDTO.isReadOnly : z11;
        boolean z22 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? commonInputDTO.isDisabled : z12;
        boolean z23 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? commonInputDTO.isTouched : z13;
        boolean z24 = (i11 & 2048) != 0 ? commonInputDTO.isInvalid : z14;
        List list3 = (i11 & 4096) != 0 ? commonInputDTO.errors : list;
        List list4 = (i11 & 8192) != 0 ? commonInputDTO.options : list2;
        InputType inputType3 = inputType2;
        AtomActionDTO atomActionDTO4 = (i11 & 16384) != 0 ? commonInputDTO.onClick : atomActionDTO;
        AtomActionDTO atomActionDTO5 = (i11 & 32768) != 0 ? commonInputDTO.onChange : atomActionDTO2;
        boolean z25 = (i11 & 65536) != 0 ? commonInputDTO.isMultiline : z15;
        AtomActionDTO atomActionDTO6 = (i11 & 131072) != 0 ? commonInputDTO.selectedAction : atomActionDTO3;
        Integer num2 = (i11 & 262144) != 0 ? commonInputDTO.maxLength : num;
        Map map4 = (i11 & 524288) != 0 ? commonInputDTO.trackingInfo : map;
        Map map5 = (i11 & 1048576) != 0 ? commonInputDTO.selectTrackingInfo : map2;
        Map map6 = (i11 & 2097152) != 0 ? commonInputDTO.unfocusedTrackingInfo : map3;
        boolean z26 = (i11 & 4194304) != 0 ? commonInputDTO.scrollOnMount : z16;
        if ((i11 & 8388608) != 0) {
            z19 = z26;
            z18 = commonInputDTO.focusOnMount;
        } else {
            z18 = z17;
            z19 = z26;
        }
        return commonInputDTO.copy(inputType3, str7, str8, dateRange2, str9, str10, str11, str12, z21, z22, z23, z24, list3, list4, atomActionDTO4, atomActionDTO5, z25, atomActionDTO6, num2, map4, map5, map6, z19, z18);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsTouched() {
        return this.isTouched;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsInvalid() {
        return this.isInvalid;
    }

    public final List<String> component13() {
        return this.errors;
    }

    public final List<SelectorOption> component14() {
        return this.options;
    }

    /* renamed from: component15, reason: from getter */
    public final AtomActionDTO getOnClick() {
        return this.onClick;
    }

    /* renamed from: component16, reason: from getter */
    public final AtomActionDTO getOnChange() {
        return this.onChange;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsMultiline() {
        return this.isMultiline;
    }

    /* renamed from: component18, reason: from getter */
    public final AtomActionDTO getSelectedAction() {
        return this.selectedAction;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Map<String, TokenizedTrackingInfo> component20() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component21() {
        return this.selectTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component22() {
        return this.unfocusedTrackingInfo;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getScrollOnMount() {
        return this.scrollOnMount;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getFocusOnMount() {
        return this.focusOnMount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component4, reason: from getter */
    public final DateRange getRange() {
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
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @NotNull
    public final CommonInputDTO copy(@NotNull InputType type, String value, String defaultValue, DateRange range, String placeholder, String subtext, @NotNull String name, String mask, boolean isReadOnly, boolean isDisabled, boolean isTouched, boolean isInvalid, List<String> errors, List<SelectorOption> options, AtomActionDTO onClick, AtomActionDTO onChange, boolean isMultiline, AtomActionDTO selectedAction, Integer maxLength, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> selectTrackingInfo, Map<String, TokenizedTrackingInfo> unfocusedTrackingInfo, boolean scrollOnMount, boolean focusOnMount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        return new CommonInputDTO(type, value, defaultValue, range, placeholder, subtext, name, mask, isReadOnly, isDisabled, isTouched, isInvalid, errors, options, onClick, onChange, isMultiline, selectedAction, maxLength, trackingInfo, selectTrackingInfo, unfocusedTrackingInfo, scrollOnMount, focusOnMount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonInputDTO)) {
            return false;
        }
        CommonInputDTO commonInputDTO = (CommonInputDTO) other;
        return this.type == commonInputDTO.type && Intrinsics.d(this.value, commonInputDTO.value) && Intrinsics.d(this.defaultValue, commonInputDTO.defaultValue) && Intrinsics.d(this.range, commonInputDTO.range) && Intrinsics.d(this.placeholder, commonInputDTO.placeholder) && Intrinsics.d(this.subtext, commonInputDTO.subtext) && Intrinsics.d(this.name, commonInputDTO.name) && Intrinsics.d(this.mask, commonInputDTO.mask) && this.isReadOnly == commonInputDTO.isReadOnly && this.isDisabled == commonInputDTO.isDisabled && this.isTouched == commonInputDTO.isTouched && this.isInvalid == commonInputDTO.isInvalid && Intrinsics.d(this.errors, commonInputDTO.errors) && Intrinsics.d(this.options, commonInputDTO.options) && Intrinsics.d(this.onClick, commonInputDTO.onClick) && Intrinsics.d(this.onChange, commonInputDTO.onChange) && this.isMultiline == commonInputDTO.isMultiline && Intrinsics.d(this.selectedAction, commonInputDTO.selectedAction) && Intrinsics.d(this.maxLength, commonInputDTO.maxLength) && Intrinsics.d(this.trackingInfo, commonInputDTO.trackingInfo) && Intrinsics.d(this.selectTrackingInfo, commonInputDTO.selectTrackingInfo) && Intrinsics.d(this.unfocusedTrackingInfo, commonInputDTO.unfocusedTrackingInfo) && this.scrollOnMount == commonInputDTO.scrollOnMount && this.focusOnMount == commonInputDTO.focusOnMount;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final boolean getFocusOnMount() {
        return this.focusOnMount;
    }

    public final String getMask() {
        return this.mask;
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

    public final List<SelectorOption> getOptions() {
        return this.options;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final DateRange getRange() {
        return this.range;
    }

    public final boolean getScrollOnMount() {
        return this.scrollOnMount;
    }

    public final Map<String, TokenizedTrackingInfo> getSelectTrackingInfo() {
        return this.selectTrackingInfo;
    }

    public final AtomActionDTO getSelectedAction() {
        return this.selectedAction;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final InputType getType() {
        return this.type;
    }

    public final Map<String, TokenizedTrackingInfo> getUnfocusedTrackingInfo() {
        return this.unfocusedTrackingInfo;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateRange dateRange = this.range;
        int hashCode4 = (hashCode3 + (dateRange == null ? 0 : dateRange.hashCode())) * 31;
        String str3 = this.placeholder;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtext;
        int a11 = g.a((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.name);
        String str5 = this.mask;
        int a12 = C3532b.a(C3532b.a(C3532b.a(C3532b.a((a11 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.isReadOnly), 31, this.isDisabled), 31, this.isTouched), 31, this.isInvalid);
        List<String> list = this.errors;
        int hashCode6 = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        List<SelectorOption> list2 = this.options;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.onClick;
        int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.onChange;
        int a13 = C3532b.a((hashCode8 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31, 31, this.isMultiline);
        AtomActionDTO atomActionDTO3 = this.selectedAction;
        int hashCode9 = (a13 + (atomActionDTO3 == null ? 0 : atomActionDTO3.hashCode())) * 31;
        Integer num = this.maxLength;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.selectTrackingInfo;
        int hashCode12 = (hashCode11 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.unfocusedTrackingInfo;
        return Boolean.hashCode(this.focusOnMount) + C3532b.a((hashCode12 + (map3 != null ? map3.hashCode() : 0)) * 31, 31, this.scrollOnMount);
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
        DateRange dateRange = this.range;
        String str3 = this.placeholder;
        String str4 = this.subtext;
        String str5 = this.name;
        String str6 = this.mask;
        boolean z11 = this.isReadOnly;
        boolean z12 = this.isDisabled;
        boolean z13 = this.isTouched;
        boolean z14 = this.isInvalid;
        List<String> list = this.errors;
        List<SelectorOption> list2 = this.options;
        AtomActionDTO atomActionDTO = this.onClick;
        AtomActionDTO atomActionDTO2 = this.onChange;
        boolean z15 = this.isMultiline;
        AtomActionDTO atomActionDTO3 = this.selectedAction;
        Integer num = this.maxLength;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.selectTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.unfocusedTrackingInfo;
        boolean z16 = this.scrollOnMount;
        boolean z17 = this.focusOnMount;
        StringBuilder sb2 = new StringBuilder("CommonInputDTO(type=");
        sb2.append(inputType);
        sb2.append(", value=");
        sb2.append(str);
        sb2.append(", defaultValue=");
        sb2.append(str2);
        sb2.append(", range=");
        sb2.append(dateRange);
        sb2.append(", placeholder=");
        Nh.a.h(sb2, str3, ", subtext=", str4, ", name=");
        Nh.a.h(sb2, str5, ", mask=", str6, ", isReadOnly=");
        f.c(", isDisabled=", ", isTouched=", sb2, z11, z12);
        f.c(", isInvalid=", ", errors=", sb2, z13, z14);
        C2616s.g(", options=", ", onClick=", sb2, list, list2);
        sb2.append(atomActionDTO);
        sb2.append(", onChange=");
        sb2.append(atomActionDTO2);
        sb2.append(", isMultiline=");
        sb2.append(z15);
        sb2.append(", selectedAction=");
        sb2.append(atomActionDTO3);
        sb2.append(", maxLength=");
        sb2.append(num);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", selectTrackingInfo=");
        Tl.b.g(sb2, map2, ", unfocusedTrackingInfo=", map3, ", scrollOnMount=");
        sb2.append(z16);
        sb2.append(", focusOnMount=");
        sb2.append(z17);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ CommonInputDTO(InputType inputType, String str, String str2, DateRange dateRange, String str3, String str4, String str5, String str6, boolean z11, boolean z12, boolean z13, boolean z14, List list, List list2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, boolean z15, AtomActionDTO atomActionDTO3, Integer num, Map map, Map map2, Map map3, boolean z16, boolean z17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputType, str, str2, dateRange, str3, str4, str5, str6, (i11 & 256) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z12, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z13, (i11 & 2048) != 0 ? false : z14, list, list2, atomActionDTO, atomActionDTO2, (65536 & i11) != 0 ? false : z15, atomActionDTO3, num, map, map2, map3, (4194304 & i11) != 0 ? false : z16, (i11 & 8388608) != 0 ? false : z17);
    }
}
