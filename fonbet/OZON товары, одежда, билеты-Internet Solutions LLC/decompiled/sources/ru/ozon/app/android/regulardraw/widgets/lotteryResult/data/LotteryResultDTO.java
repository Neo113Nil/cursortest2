package ru.ozon.app.android.regulardraw.widgets.lotteryResult.data;

import Ak.C2436a;
import D40.a;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001:Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0087\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006;"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "", "date", "Lorg/joda/time/DateTime;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rightIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "winStatusBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "values", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO$Values;", "drawStatusBadge", "drawStatusBadgeColor", "", "broadcastDate", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO$Values;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDate", "()Lorg/joda/time/DateTime;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getWinStatusBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getValues", "()Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO$Values;", "getDrawStatusBadge", "getDrawStatusBadgeColor", "()Ljava/lang/String;", "getBroadcastDate", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Values", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryResultDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final DateTime broadcastDate;

    @NotNull
    private final DateTime date;
    private final BadgeDTO drawStatusBadge;
    private final String drawStatusBadgeColor;

    @NotNull
    private final IconButtonV3DTO rightIcon;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Values values;
    private final BadgeDTO winStatusBadge;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO$Values;", "", "leftValues", "", "", "rightValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLeftValues", "()Ljava/util/List;", "getRightValues", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Values {
        public static final int $stable = 8;
        private final List<String> leftValues;
        private final List<String> rightValues;

        public Values(List<String> list, List<String> list2) {
            this.leftValues = list;
            this.rightValues = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Values copy$default(Values values, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = values.leftValues;
            }
            if ((i11 & 2) != 0) {
                list2 = values.rightValues;
            }
            return values.copy(list, list2);
        }

        public final List<String> component1() {
            return this.leftValues;
        }

        public final List<String> component2() {
            return this.rightValues;
        }

        @NotNull
        public final Values copy(List<String> leftValues, List<String> rightValues) {
            return new Values(leftValues, rightValues);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Values)) {
                return false;
            }
            Values values = (Values) other;
            return Intrinsics.d(this.leftValues, values.leftValues) && Intrinsics.d(this.rightValues, values.rightValues);
        }

        public final List<String> getLeftValues() {
            return this.leftValues;
        }

        public final List<String> getRightValues() {
            return this.rightValues;
        }

        public int hashCode() {
            List<String> list = this.leftValues;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.rightValues;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2436a.b("Values(leftValues=", this.leftValues, ", rightValues=", ")", this.rightValues);
        }
    }

    public LotteryResultDTO(@NotNull DateTime date, @NotNull TextDTO title, @NotNull IconButtonV3DTO rightIcon, BadgeDTO badgeDTO, Values values, BadgeDTO badgeDTO2, String str, DateTime dateTime, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        this.date = date;
        this.title = title;
        this.rightIcon = rightIcon;
        this.winStatusBadge = badgeDTO;
        this.values = values;
        this.drawStatusBadge = badgeDTO2;
        this.drawStatusBadgeColor = str;
        this.broadcastDate = dateTime;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ LotteryResultDTO copy$default(LotteryResultDTO lotteryResultDTO, DateTime dateTime, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, Values values, BadgeDTO badgeDTO2, String str, DateTime dateTime2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dateTime = lotteryResultDTO.date;
        }
        if ((i11 & 2) != 0) {
            textDTO = lotteryResultDTO.title;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = lotteryResultDTO.rightIcon;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = lotteryResultDTO.winStatusBadge;
        }
        if ((i11 & 16) != 0) {
            values = lotteryResultDTO.values;
        }
        if ((i11 & 32) != 0) {
            badgeDTO2 = lotteryResultDTO.drawStatusBadge;
        }
        if ((i11 & 64) != 0) {
            str = lotteryResultDTO.drawStatusBadgeColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            dateTime2 = lotteryResultDTO.broadcastDate;
        }
        if ((i11 & 256) != 0) {
            atomActionDTO = lotteryResultDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = lotteryResultDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        String str2 = str;
        DateTime dateTime3 = dateTime2;
        Values values2 = values;
        BadgeDTO badgeDTO3 = badgeDTO2;
        return lotteryResultDTO.copy(dateTime, textDTO, iconButtonV3DTO, badgeDTO, values2, badgeDTO3, str2, dateTime3, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DateTime getDate() {
        return this.date;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getRightIcon() {
        return this.rightIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getWinStatusBadge() {
        return this.winStatusBadge;
    }

    /* renamed from: component5, reason: from getter */
    public final Values getValues() {
        return this.values;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getDrawStatusBadge() {
        return this.drawStatusBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDrawStatusBadgeColor() {
        return this.drawStatusBadgeColor;
    }

    /* renamed from: component8, reason: from getter */
    public final DateTime getBroadcastDate() {
        return this.broadcastDate;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final LotteryResultDTO copy(@NotNull DateTime date, @NotNull TextDTO title, @NotNull IconButtonV3DTO rightIcon, BadgeDTO winStatusBadge, Values values, BadgeDTO drawStatusBadge, String drawStatusBadgeColor, DateTime broadcastDate, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        return new LotteryResultDTO(date, title, rightIcon, winStatusBadge, values, drawStatusBadge, drawStatusBadgeColor, broadcastDate, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryResultDTO)) {
            return false;
        }
        LotteryResultDTO lotteryResultDTO = (LotteryResultDTO) other;
        return Intrinsics.d(this.date, lotteryResultDTO.date) && Intrinsics.d(this.title, lotteryResultDTO.title) && Intrinsics.d(this.rightIcon, lotteryResultDTO.rightIcon) && Intrinsics.d(this.winStatusBadge, lotteryResultDTO.winStatusBadge) && Intrinsics.d(this.values, lotteryResultDTO.values) && Intrinsics.d(this.drawStatusBadge, lotteryResultDTO.drawStatusBadge) && Intrinsics.d(this.drawStatusBadgeColor, lotteryResultDTO.drawStatusBadgeColor) && Intrinsics.d(this.broadcastDate, lotteryResultDTO.broadcastDate) && Intrinsics.d(this.action, lotteryResultDTO.action) && Intrinsics.d(this.trackingInfo, lotteryResultDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final DateTime getBroadcastDate() {
        return this.broadcastDate;
    }

    @NotNull
    public final DateTime getDate() {
        return this.date;
    }

    public final BadgeDTO getDrawStatusBadge() {
        return this.drawStatusBadge;
    }

    public final String getDrawStatusBadgeColor() {
        return this.drawStatusBadgeColor;
    }

    @NotNull
    public final IconButtonV3DTO getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Values getValues() {
        return this.values;
    }

    public final BadgeDTO getWinStatusBadge() {
        return this.winStatusBadge;
    }

    public int hashCode() {
        int c11 = b.c(this.rightIcon, Ns.b.a(this.title, this.date.hashCode() * 31, 31), 31);
        BadgeDTO badgeDTO = this.winStatusBadge;
        int hashCode = (c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Values values = this.values;
        int hashCode2 = (hashCode + (values == null ? 0 : values.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.drawStatusBadge;
        int hashCode3 = (hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        String str = this.drawStatusBadgeColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.broadcastDate;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DateTime dateTime = this.date;
        TextDTO textDTO = this.title;
        IconButtonV3DTO iconButtonV3DTO = this.rightIcon;
        BadgeDTO badgeDTO = this.winStatusBadge;
        Values values = this.values;
        BadgeDTO badgeDTO2 = this.drawStatusBadge;
        String str = this.drawStatusBadgeColor;
        DateTime dateTime2 = this.broadcastDate;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("LotteryResultDTO(date=");
        sb2.append(dateTime);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", rightIcon=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", winStatusBadge=");
        sb2.append(badgeDTO);
        sb2.append(", values=");
        sb2.append(values);
        sb2.append(", drawStatusBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", drawStatusBadgeColor=");
        sb2.append(str);
        sb2.append(", broadcastDate=");
        sb2.append(dateTime2);
        sb2.append(", action=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
