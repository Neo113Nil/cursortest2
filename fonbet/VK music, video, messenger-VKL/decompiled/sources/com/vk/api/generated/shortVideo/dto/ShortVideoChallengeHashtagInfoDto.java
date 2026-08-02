package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ShortVideoChallengeHashtagInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeHashtagInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeHashtagInfoDto> CREATOR = new a();

    @pmi0("is_trend")
    private final Boolean isTrend;

    @pmi0("tag")
    private final String tag;

    /* compiled from: ShortVideoChallengeHashtagInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeHashtagInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeHashtagInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoChallengeHashtagInfoDto(valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeHashtagInfoDto[] newArray(int i) {
            return new ShortVideoChallengeHashtagInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoChallengeHashtagInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.tag;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isTrend;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeHashtagInfoDto)) {
            return false;
        }
        ShortVideoChallengeHashtagInfoDto shortVideoChallengeHashtagInfoDto = (ShortVideoChallengeHashtagInfoDto) obj;
        return epx.f(this.isTrend, shortVideoChallengeHashtagInfoDto.isTrend) && epx.f(this.tag, shortVideoChallengeHashtagInfoDto.tag);
    }

    public final int hashCode() {
        Boolean bool = this.isTrend;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.tag;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChallengeHashtagInfoDto(isTrend=");
        sb.append(this.isTrend);
        sb.append(", tag=");
        return ho8.a(sb, this.tag, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isTrend;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.tag);
    }

    public ShortVideoChallengeHashtagInfoDto(Boolean bool, String str) {
        this.isTrend = bool;
        this.tag = str;
    }

    public /* synthetic */ ShortVideoChallengeHashtagInfoDto(Boolean bool, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }
}
