package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunProgressDto.kt */
/* loaded from: classes15.dex */
public final class VkRunProgressDto implements Parcelable {
    public static final Parcelable.Creator<VkRunProgressDto> CREATOR = new a();

    @pmi0("current_season")
    private final VkRunUserSeasonDataDto currentSeason;

    @pmi0("distance")
    private final int distance;

    @pmi0("emoji_status")
    private final VkRunUserEmojiStatusDto emojiStatus;

    @pmi0("giv")
    private final VkRunGivDto giv;

    @pmi0("has_annual_stats")
    private final Boolean hasAnnualStats;

    @pmi0("has_google_services")
    private final Boolean hasGoogleServices;

    @pmi0("has_monthly_stats")
    private final Boolean hasMonthlyStats;

    @pmi0("has_new_achievements")
    private final boolean hasNewAchievements;

    @pmi0("has_new_challenges")
    private final boolean hasNewChallenges;

    @pmi0("last_30_days_steps")
    private final int last30DaysSteps;

    @pmi0("mascot")
    private final VkRunMascotDto mascot;

    @pmi0("onboarding_status")
    private final OnboardingStatusDto onboardingStatus;

    @pmi0("percentile")
    private final int percentile;

    @pmi0("steps")
    private final int steps;

    @pmi0("strike")
    private final Integer strike;

    @pmi0("strike_record")
    private final Integer strikeRecord;

    @pmi0("target")
    private final int target;

    @pmi0("yesterday_steps")
    private final int yesterdaySteps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunProgressDto.kt */
    public static final class OnboardingStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingStatusDto[] $VALUES;
        public static final Parcelable.Creator<OnboardingStatusDto> CREATOR;

        @pmi0("not_started")
        public static final OnboardingStatusDto NOT_STARTED;

        @pmi0("passed")
        public static final OnboardingStatusDto PASSED;
        private final String value;

        /* compiled from: VkRunProgressDto.kt */
        public static final class a implements Parcelable.Creator<OnboardingStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingStatusDto createFromParcel(Parcel parcel) {
                return OnboardingStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingStatusDto[] newArray(int i) {
                return new OnboardingStatusDto[i];
            }
        }

        static {
            OnboardingStatusDto onboardingStatusDto = new OnboardingStatusDto("NOT_STARTED", 0, "not_started");
            NOT_STARTED = onboardingStatusDto;
            OnboardingStatusDto onboardingStatusDto2 = new OnboardingStatusDto("PASSED", 1, "passed");
            PASSED = onboardingStatusDto2;
            OnboardingStatusDto[] onboardingStatusDtoArr = {onboardingStatusDto, onboardingStatusDto2};
            $VALUES = onboardingStatusDtoArr;
            $ENTRIES = new asp(onboardingStatusDtoArr);
            CREATOR = new a();
        }

        private OnboardingStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OnboardingStatusDto valueOf(String str) {
            return (OnboardingStatusDto) Enum.valueOf(OnboardingStatusDto.class, str);
        }

        public static OnboardingStatusDto[] values() {
            return (OnboardingStatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VkRunProgressDto.kt */
    public static final class a implements Parcelable.Creator<VkRunProgressDto> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.api.generated.vkRun.dto.VkRunProgressDto, still in use, count: 2, list:
              (r1v0 com.vk.api.generated.vkRun.dto.VkRunProgressDto) from 0x002b: MOVE (r8v1 com.vk.api.generated.vkRun.dto.VkRunProgressDto) = (r1v0 com.vk.api.generated.vkRun.dto.VkRunProgressDto) (LINE:44)
              (r1v0 com.vk.api.generated.vkRun.dto.VkRunProgressDto) from 0x0028: MOVE (r8v6 com.vk.api.generated.vkRun.dto.VkRunProgressDto) = (r1v0 com.vk.api.generated.vkRun.dto.VkRunProgressDto) (LINE:41)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.vkRun.dto.VkRunProgressDto createFromParcel(android.os.Parcel r23) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.vkRun.dto.VkRunProgressDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunProgressDto[] newArray(int i) {
            return new VkRunProgressDto[i];
        }
    }

    public VkRunProgressDto(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, OnboardingStatusDto onboardingStatusDto, Integer num, Integer num2, Boolean bool, VkRunUserSeasonDataDto vkRunUserSeasonDataDto, VkRunUserEmojiStatusDto vkRunUserEmojiStatusDto, Boolean bool2, VkRunMascotDto vkRunMascotDto, Boolean bool3, VkRunGivDto vkRunGivDto) {
        this.percentile = i;
        this.last30DaysSteps = i2;
        this.yesterdaySteps = i3;
        this.target = i4;
        this.steps = i5;
        this.distance = i6;
        this.hasNewChallenges = z;
        this.hasNewAchievements = z2;
        this.onboardingStatus = onboardingStatusDto;
        this.strike = num;
        this.strikeRecord = num2;
        this.hasGoogleServices = bool;
        this.currentSeason = vkRunUserSeasonDataDto;
        this.emojiStatus = vkRunUserEmojiStatusDto;
        this.hasAnnualStats = bool2;
        this.mascot = vkRunMascotDto;
        this.hasMonthlyStats = bool3;
        this.giv = vkRunGivDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunProgressDto)) {
            return false;
        }
        VkRunProgressDto vkRunProgressDto = (VkRunProgressDto) obj;
        return this.percentile == vkRunProgressDto.percentile && this.last30DaysSteps == vkRunProgressDto.last30DaysSteps && this.yesterdaySteps == vkRunProgressDto.yesterdaySteps && this.target == vkRunProgressDto.target && this.steps == vkRunProgressDto.steps && this.distance == vkRunProgressDto.distance && this.hasNewChallenges == vkRunProgressDto.hasNewChallenges && this.hasNewAchievements == vkRunProgressDto.hasNewAchievements && this.onboardingStatus == vkRunProgressDto.onboardingStatus && epx.f(this.strike, vkRunProgressDto.strike) && epx.f(this.strikeRecord, vkRunProgressDto.strikeRecord) && epx.f(this.hasGoogleServices, vkRunProgressDto.hasGoogleServices) && epx.f(this.currentSeason, vkRunProgressDto.currentSeason) && epx.f(this.emojiStatus, vkRunProgressDto.emojiStatus) && epx.f(this.hasAnnualStats, vkRunProgressDto.hasAnnualStats) && epx.f(this.mascot, vkRunProgressDto.mascot) && epx.f(this.hasMonthlyStats, vkRunProgressDto.hasMonthlyStats) && epx.f(this.giv, vkRunProgressDto.giv);
    }

    public final int hashCode() {
        int hashCode = (this.onboardingStatus.hashCode() + qoy.b(qoy.b(shy.a(this.distance, shy.a(this.steps, shy.a(this.target, shy.a(this.yesterdaySteps, shy.a(this.last30DaysSteps, Integer.hashCode(this.percentile) * 31, 31), 31), 31), 31), 31), 31, this.hasNewChallenges), 31, this.hasNewAchievements)) * 31;
        Integer num = this.strike;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.strikeRecord;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasGoogleServices;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        VkRunUserSeasonDataDto vkRunUserSeasonDataDto = this.currentSeason;
        int hashCode5 = (hashCode4 + (vkRunUserSeasonDataDto == null ? 0 : vkRunUserSeasonDataDto.hashCode())) * 31;
        VkRunUserEmojiStatusDto vkRunUserEmojiStatusDto = this.emojiStatus;
        int hashCode6 = (hashCode5 + (vkRunUserEmojiStatusDto == null ? 0 : vkRunUserEmojiStatusDto.hashCode())) * 31;
        Boolean bool2 = this.hasAnnualStats;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VkRunMascotDto vkRunMascotDto = this.mascot;
        int hashCode8 = (hashCode7 + (vkRunMascotDto == null ? 0 : vkRunMascotDto.hashCode())) * 31;
        Boolean bool3 = this.hasMonthlyStats;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        VkRunGivDto vkRunGivDto = this.giv;
        return hashCode9 + (vkRunGivDto != null ? vkRunGivDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkRunProgressDto(percentile=" + this.percentile + ", last30DaysSteps=" + this.last30DaysSteps + ", yesterdaySteps=" + this.yesterdaySteps + ", target=" + this.target + ", steps=" + this.steps + ", distance=" + this.distance + ", hasNewChallenges=" + this.hasNewChallenges + ", hasNewAchievements=" + this.hasNewAchievements + ", onboardingStatus=" + this.onboardingStatus + ", strike=" + this.strike + ", strikeRecord=" + this.strikeRecord + ", hasGoogleServices=" + this.hasGoogleServices + ", currentSeason=" + this.currentSeason + ", emojiStatus=" + this.emojiStatus + ", hasAnnualStats=" + this.hasAnnualStats + ", mascot=" + this.mascot + ", hasMonthlyStats=" + this.hasMonthlyStats + ", giv=" + this.giv + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.percentile);
        parcel.writeInt(this.last30DaysSteps);
        parcel.writeInt(this.yesterdaySteps);
        parcel.writeInt(this.target);
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
        parcel.writeInt(this.hasNewChallenges ? 1 : 0);
        parcel.writeInt(this.hasNewAchievements ? 1 : 0);
        this.onboardingStatus.writeToParcel(parcel, i);
        Integer num = this.strike;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.strikeRecord;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.hasGoogleServices;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        VkRunUserSeasonDataDto vkRunUserSeasonDataDto = this.currentSeason;
        if (vkRunUserSeasonDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunUserSeasonDataDto.writeToParcel(parcel, i);
        }
        VkRunUserEmojiStatusDto vkRunUserEmojiStatusDto = this.emojiStatus;
        if (vkRunUserEmojiStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunUserEmojiStatusDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.hasAnnualStats;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        VkRunMascotDto vkRunMascotDto = this.mascot;
        if (vkRunMascotDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunMascotDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.hasMonthlyStats;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        VkRunGivDto vkRunGivDto = this.giv;
        if (vkRunGivDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunGivDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunProgressDto(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, OnboardingStatusDto onboardingStatusDto, Integer num, Integer num2, Boolean bool, VkRunUserSeasonDataDto vkRunUserSeasonDataDto, VkRunUserEmojiStatusDto vkRunUserEmojiStatusDto, Boolean bool2, VkRunMascotDto vkRunMascotDto, Boolean bool3, VkRunGivDto vkRunGivDto, int i7, zcl zclVar) {
        this(i, i2, i3, i4, i5, i6, z, z2, onboardingStatusDto, (i7 & 512) != 0 ? null : num, (i7 & 1024) != 0 ? null : num2, (i7 & 2048) != 0 ? null : bool, (i7 & 4096) != 0 ? null : vkRunUserSeasonDataDto, (i7 & 8192) != 0 ? null : vkRunUserEmojiStatusDto, (i7 & 16384) != 0 ? null : bool2, (32768 & i7) != 0 ? null : vkRunMascotDto, (65536 & i7) != 0 ? null : bool3, (i7 & 131072) != 0 ? null : vkRunGivDto);
    }
}
