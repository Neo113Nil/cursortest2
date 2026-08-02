package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarusiaServerTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaServerTypeDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaServerTypeDto> CREATOR = new a();

    @pmi0("server_type")
    private final String serverType;

    @pmi0("server_url")
    private final String serverUrl;

    @pmi0("skill")
    private final String skill;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: MarusiaServerTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaServerTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaServerTypeDto createFromParcel(Parcel parcel) {
            return new MarusiaServerTypeDto((UserId) parcel.readParcelable(MarusiaServerTypeDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaServerTypeDto[] newArray(int i) {
            return new MarusiaServerTypeDto[i];
        }
    }

    public MarusiaServerTypeDto(UserId userId, String str, String str2, String str3) {
        this.userId = userId;
        this.skill = str;
        this.serverType = str2;
        this.serverUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaServerTypeDto)) {
            return false;
        }
        MarusiaServerTypeDto marusiaServerTypeDto = (MarusiaServerTypeDto) obj;
        return epx.f(this.userId, marusiaServerTypeDto.userId) && epx.f(this.skill, marusiaServerTypeDto.skill) && epx.f(this.serverType, marusiaServerTypeDto.serverType) && epx.f(this.serverUrl, marusiaServerTypeDto.serverUrl);
    }

    public final int hashCode() {
        return this.serverUrl.hashCode() + urd0.a(urd0.a(Long.hashCode(this.userId.b) * 31, 31, this.skill), 31, this.serverType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaServerTypeDto(userId=");
        sb.append(this.userId);
        sb.append(", skill=");
        sb.append(this.skill);
        sb.append(", serverType=");
        sb.append(this.serverType);
        sb.append(", serverUrl=");
        return ho8.a(sb, this.serverUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.skill);
        parcel.writeString(this.serverType);
        parcel.writeString(this.serverUrl);
    }
}
