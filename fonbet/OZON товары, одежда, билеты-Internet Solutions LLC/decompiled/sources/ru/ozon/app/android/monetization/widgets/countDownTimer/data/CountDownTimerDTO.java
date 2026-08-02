package ru.ozon.app.android.monetization.widgets.countDownTimer.data;

import D40.a;
import D40.d;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/monetization/widgets/countDownTimer/data/CountDownTimerDTO;", "", "deadlineDate", "Lorg/joda/time/DateTime;", "defaultTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "defaultSubtitle", "expiredTitle", "expiredSubtitle", "timerBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDeadlineDate", "()Lorg/joda/time/DateTime;", "getDefaultTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDefaultSubtitle", "getExpiredTitle", "getExpiredSubtitle", "getTimerBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CountDownTimerDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final DateTime deadlineDate;
    private final TextDTO defaultSubtitle;

    @NotNull
    private final TextDTO defaultTitle;
    private final TextDTO expiredSubtitle;

    @NotNull
    private final TextDTO expiredTitle;
    private final BadgeDTO timerBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CountDownTimerDTO(@NotNull DateTime deadlineDate, @NotNull TextDTO defaultTitle, TextDTO textDTO, @NotNull TextDTO expiredTitle, TextDTO textDTO2, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(deadlineDate, "deadlineDate");
        Intrinsics.checkNotNullParameter(defaultTitle, "defaultTitle");
        Intrinsics.checkNotNullParameter(expiredTitle, "expiredTitle");
        this.deadlineDate = deadlineDate;
        this.defaultTitle = defaultTitle;
        this.defaultSubtitle = textDTO;
        this.expiredTitle = expiredTitle;
        this.expiredSubtitle = textDTO2;
        this.timerBadge = badgeDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CountDownTimerDTO copy$default(CountDownTimerDTO countDownTimerDTO, DateTime dateTime, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dateTime = countDownTimerDTO.deadlineDate;
        }
        if ((i11 & 2) != 0) {
            textDTO = countDownTimerDTO.defaultTitle;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = countDownTimerDTO.defaultSubtitle;
        }
        if ((i11 & 8) != 0) {
            textDTO3 = countDownTimerDTO.expiredTitle;
        }
        if ((i11 & 16) != 0) {
            textDTO4 = countDownTimerDTO.expiredSubtitle;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = countDownTimerDTO.timerBadge;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = countDownTimerDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = countDownTimerDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        TextDTO textDTO5 = textDTO4;
        BadgeDTO badgeDTO2 = badgeDTO;
        return countDownTimerDTO.copy(dateTime, textDTO, textDTO2, textDTO3, textDTO5, badgeDTO2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DateTime getDeadlineDate() {
        return this.deadlineDate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getDefaultTitle() {
        return this.defaultTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getDefaultSubtitle() {
        return this.defaultSubtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getExpiredTitle() {
        return this.expiredTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getExpiredSubtitle() {
        return this.expiredSubtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final CountDownTimerDTO copy(@NotNull DateTime deadlineDate, @NotNull TextDTO defaultTitle, TextDTO defaultSubtitle, @NotNull TextDTO expiredTitle, TextDTO expiredSubtitle, BadgeDTO timerBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(deadlineDate, "deadlineDate");
        Intrinsics.checkNotNullParameter(defaultTitle, "defaultTitle");
        Intrinsics.checkNotNullParameter(expiredTitle, "expiredTitle");
        return new CountDownTimerDTO(deadlineDate, defaultTitle, defaultSubtitle, expiredTitle, expiredSubtitle, timerBadge, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountDownTimerDTO)) {
            return false;
        }
        CountDownTimerDTO countDownTimerDTO = (CountDownTimerDTO) other;
        return Intrinsics.d(this.deadlineDate, countDownTimerDTO.deadlineDate) && Intrinsics.d(this.defaultTitle, countDownTimerDTO.defaultTitle) && Intrinsics.d(this.defaultSubtitle, countDownTimerDTO.defaultSubtitle) && Intrinsics.d(this.expiredTitle, countDownTimerDTO.expiredTitle) && Intrinsics.d(this.expiredSubtitle, countDownTimerDTO.expiredSubtitle) && Intrinsics.d(this.timerBadge, countDownTimerDTO.timerBadge) && Intrinsics.d(this.action, countDownTimerDTO.action) && Intrinsics.d(this.trackingInfo, countDownTimerDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final DateTime getDeadlineDate() {
        return this.deadlineDate;
    }

    public final TextDTO getDefaultSubtitle() {
        return this.defaultSubtitle;
    }

    @NotNull
    public final TextDTO getDefaultTitle() {
        return this.defaultTitle;
    }

    public final TextDTO getExpiredSubtitle() {
        return this.expiredSubtitle;
    }

    @NotNull
    public final TextDTO getExpiredTitle() {
        return this.expiredTitle;
    }

    public final BadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.defaultTitle, this.deadlineDate.hashCode() * 31, 31);
        TextDTO textDTO = this.defaultSubtitle;
        int a12 = b.a(this.expiredTitle, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        TextDTO textDTO2 = this.expiredSubtitle;
        int hashCode = (a12 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.timerBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DateTime dateTime = this.deadlineDate;
        TextDTO textDTO = this.defaultTitle;
        TextDTO textDTO2 = this.defaultSubtitle;
        TextDTO textDTO3 = this.expiredTitle;
        TextDTO textDTO4 = this.expiredSubtitle;
        BadgeDTO badgeDTO = this.timerBadge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CountDownTimerDTO(deadlineDate=");
        sb2.append(dateTime);
        sb2.append(", defaultTitle=");
        sb2.append(textDTO);
        sb2.append(", defaultSubtitle=");
        d.e(", expiredTitle=", ", expiredSubtitle=", sb2, textDTO2, textDTO3);
        sb2.append(textDTO4);
        sb2.append(", timerBadge=");
        sb2.append(badgeDTO);
        sb2.append(", action=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
