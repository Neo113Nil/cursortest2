package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AppsLeaderboardDto.kt */
/* loaded from: classes14.dex */
public final class AppsLeaderboardDto implements Parcelable {
    public static final Parcelable.Creator<AppsLeaderboardDto> CREATOR = new a();

    @pmi0("level")
    private final Integer level;

    @pmi0("points")
    private final Integer points;

    @pmi0("score")
    private final Integer score;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: AppsLeaderboardDto.kt */
    public static final class a implements Parcelable.Creator<AppsLeaderboardDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLeaderboardDto createFromParcel(Parcel parcel) {
            return new AppsLeaderboardDto((UserId) parcel.readParcelable(AppsLeaderboardDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLeaderboardDto[] newArray(int i) {
            return new AppsLeaderboardDto[i];
        }
    }

    public AppsLeaderboardDto(UserId userId, Integer num, Integer num2, Integer num3) {
        this.userId = userId;
        this.level = num;
        this.points = num2;
        this.score = num3;
    }

    public final Integer d() {
        return this.level;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.points;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLeaderboardDto)) {
            return false;
        }
        AppsLeaderboardDto appsLeaderboardDto = (AppsLeaderboardDto) obj;
        return epx.f(this.userId, appsLeaderboardDto.userId) && epx.f(this.level, appsLeaderboardDto.level) && epx.f(this.points, appsLeaderboardDto.points) && epx.f(this.score, appsLeaderboardDto.score);
    }

    public final Integer f() {
        return this.score;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.userId.b) * 31;
        Integer num = this.level;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.points;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.score;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLeaderboardDto(userId=");
        sb.append(this.userId);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", points=");
        sb.append(this.points);
        sb.append(", score=");
        return uqi.b(sb, this.score, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        Integer num = this.level;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.points;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.score;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ AppsLeaderboardDto(UserId userId, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
