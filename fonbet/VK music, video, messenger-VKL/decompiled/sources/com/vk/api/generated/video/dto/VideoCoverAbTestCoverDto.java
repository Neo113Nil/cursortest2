package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoCoverAbTestCoverDto.kt */
/* loaded from: classes15.dex */
public final class VideoCoverAbTestCoverDto implements Parcelable {
    public static final Parcelable.Creator<VideoCoverAbTestCoverDto> CREATOR = new a();

    @pmi0("is_selected")
    private final Boolean isSelected;

    @pmi0("is_winner")
    private final Boolean isWinner;

    @pmi0("photo_id")
    private final int photoId;

    @pmi0("score")
    private final Integer score;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoCoverAbTestCoverDto.kt */
    public static final class a implements Parcelable.Creator<VideoCoverAbTestCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCoverAbTestCoverDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoCoverAbTestCoverDto(readInt, readString, valueOf2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCoverAbTestCoverDto[] newArray(int i) {
            return new VideoCoverAbTestCoverDto[i];
        }
    }

    public VideoCoverAbTestCoverDto(int i, String str, Integer num, Boolean bool, Boolean bool2) {
        this.photoId = i;
        this.url = str;
        this.score = num;
        this.isSelected = bool;
        this.isWinner = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCoverAbTestCoverDto)) {
            return false;
        }
        VideoCoverAbTestCoverDto videoCoverAbTestCoverDto = (VideoCoverAbTestCoverDto) obj;
        return this.photoId == videoCoverAbTestCoverDto.photoId && epx.f(this.url, videoCoverAbTestCoverDto.url) && epx.f(this.score, videoCoverAbTestCoverDto.score) && epx.f(this.isSelected, videoCoverAbTestCoverDto.isSelected) && epx.f(this.isWinner, videoCoverAbTestCoverDto.isWinner);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.photoId) * 31, 31, this.url);
        Integer num = this.score;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isWinner;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCoverAbTestCoverDto(photoId=");
        sb.append(this.photoId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", score=");
        sb.append(this.score);
        sb.append(", isSelected=");
        sb.append(this.isSelected);
        sb.append(", isWinner=");
        return tn.a(sb, this.isWinner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.photoId);
        parcel.writeString(this.url);
        Integer num = this.score;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isWinner;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ VideoCoverAbTestCoverDto(int i, String str, Integer num, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2);
    }
}
