package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkRunLeaderboardDto.kt */
/* loaded from: classes15.dex */
public final class VkRunLeaderboardDto implements Parcelable {
    public static final Parcelable.Creator<VkRunLeaderboardDto> CREATOR = new a();

    @pmi0("distance")
    private final Integer distance;

    @pmi0("leaderboard")
    private final List<VkRunLeaderboardMemberDto> leaderboard;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("position_text")
    private final String positionText;

    @pmi0("steps")
    private final Integer steps;

    @pmi0("target")
    private final Integer target;

    /* compiled from: VkRunLeaderboardDto.kt */
    public static final class a implements Parcelable.Creator<VkRunLeaderboardDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunLeaderboardDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VkRunLeaderboardMemberDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VkRunLeaderboardDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunLeaderboardDto[] newArray(int i) {
            return new VkRunLeaderboardDto[i];
        }
    }

    public VkRunLeaderboardDto(List<VkRunLeaderboardMemberDto> list, Integer num, String str, Integer num2, Integer num3, Integer num4) {
        this.leaderboard = list;
        this.position = num;
        this.positionText = str;
        this.target = num2;
        this.steps = num3;
        this.distance = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunLeaderboardDto)) {
            return false;
        }
        VkRunLeaderboardDto vkRunLeaderboardDto = (VkRunLeaderboardDto) obj;
        return epx.f(this.leaderboard, vkRunLeaderboardDto.leaderboard) && epx.f(this.position, vkRunLeaderboardDto.position) && epx.f(this.positionText, vkRunLeaderboardDto.positionText) && epx.f(this.target, vkRunLeaderboardDto.target) && epx.f(this.steps, vkRunLeaderboardDto.steps) && epx.f(this.distance, vkRunLeaderboardDto.distance);
    }

    public final int hashCode() {
        int hashCode = this.leaderboard.hashCode() * 31;
        Integer num = this.position;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.positionText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.target;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.steps;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.distance;
        return hashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunLeaderboardDto(leaderboard=");
        sb.append(this.leaderboard);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", positionText=");
        sb.append(this.positionText);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", distance=");
        return uqi.b(sb, this.distance, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.leaderboard);
        while (a2.hasNext()) {
            ((VkRunLeaderboardMemberDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.positionText);
        Integer num2 = this.target;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.steps;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.distance;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ VkRunLeaderboardDto(List list, Integer num, String str, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}
