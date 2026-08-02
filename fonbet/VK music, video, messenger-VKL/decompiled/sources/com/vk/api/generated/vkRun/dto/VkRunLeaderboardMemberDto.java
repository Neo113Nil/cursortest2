package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkRunLeaderboardMemberDto.kt */
/* loaded from: classes15.dex */
public final class VkRunLeaderboardMemberDto implements Parcelable {
    public static final Parcelable.Creator<VkRunLeaderboardMemberDto> CREATOR = new a();

    @pmi0("days_passed")
    private final Integer daysPassed;

    @pmi0("distance")
    private final int distance;

    @pmi0("is_failed")
    private final Boolean isFailed;

    @pmi0("is_passed")
    private final Boolean isPassed;

    @pmi0("season_level")
    private final Integer seasonLevel;

    @pmi0("steps")
    private final int steps;

    @pmi0("user")
    private final VkRunLeaderboardMemberUserDto user;

    /* compiled from: VkRunLeaderboardMemberDto.kt */
    public static final class a implements Parcelable.Creator<VkRunLeaderboardMemberDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunLeaderboardMemberDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            VkRunLeaderboardMemberUserDto createFromParcel = VkRunLeaderboardMemberUserDto.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkRunLeaderboardMemberDto(readInt, readInt2, createFromParcel, valueOf3, valueOf, valueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunLeaderboardMemberDto[] newArray(int i) {
            return new VkRunLeaderboardMemberDto[i];
        }
    }

    public VkRunLeaderboardMemberDto(int i, int i2, VkRunLeaderboardMemberUserDto vkRunLeaderboardMemberUserDto, Integer num, Boolean bool, Boolean bool2, Integer num2) {
        this.steps = i;
        this.distance = i2;
        this.user = vkRunLeaderboardMemberUserDto;
        this.seasonLevel = num;
        this.isPassed = bool;
        this.isFailed = bool2;
        this.daysPassed = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunLeaderboardMemberDto)) {
            return false;
        }
        VkRunLeaderboardMemberDto vkRunLeaderboardMemberDto = (VkRunLeaderboardMemberDto) obj;
        return this.steps == vkRunLeaderboardMemberDto.steps && this.distance == vkRunLeaderboardMemberDto.distance && epx.f(this.user, vkRunLeaderboardMemberDto.user) && epx.f(this.seasonLevel, vkRunLeaderboardMemberDto.seasonLevel) && epx.f(this.isPassed, vkRunLeaderboardMemberDto.isPassed) && epx.f(this.isFailed, vkRunLeaderboardMemberDto.isFailed) && epx.f(this.daysPassed, vkRunLeaderboardMemberDto.daysPassed);
    }

    public final int hashCode() {
        int hashCode = (this.user.hashCode() + shy.a(this.distance, Integer.hashCode(this.steps) * 31, 31)) * 31;
        Integer num = this.seasonLevel;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isPassed;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFailed;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.daysPassed;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunLeaderboardMemberDto(steps=");
        sb.append(this.steps);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", seasonLevel=");
        sb.append(this.seasonLevel);
        sb.append(", isPassed=");
        sb.append(this.isPassed);
        sb.append(", isFailed=");
        sb.append(this.isFailed);
        sb.append(", daysPassed=");
        return uqi.b(sb, this.daysPassed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
        this.user.writeToParcel(parcel, i);
        Integer num = this.seasonLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isPassed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isFailed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num2 = this.daysPassed;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ VkRunLeaderboardMemberDto(int i, int i2, VkRunLeaderboardMemberUserDto vkRunLeaderboardMemberUserDto, Integer num, Boolean bool, Boolean bool2, Integer num2, int i3, zcl zclVar) {
        this(i, i2, vkRunLeaderboardMemberUserDto, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : bool2, (i3 & 64) != 0 ? null : num2);
    }
}
