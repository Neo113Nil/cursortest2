package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoSearchInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoSearchInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoSearchInfoDto> CREATOR = new a();

    @pmi0("search_iid")
    private final Integer searchIid;

    @pmi0("search_query_id")
    private final String searchQueryId;

    /* compiled from: VideoSearchInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoSearchInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSearchInfoDto createFromParcel(Parcel parcel) {
            return new VideoSearchInfoDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSearchInfoDto[] newArray(int i) {
            return new VideoSearchInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSearchInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.searchIid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.searchQueryId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSearchInfoDto)) {
            return false;
        }
        VideoSearchInfoDto videoSearchInfoDto = (VideoSearchInfoDto) obj;
        return epx.f(this.searchQueryId, videoSearchInfoDto.searchQueryId) && epx.f(this.searchIid, videoSearchInfoDto.searchIid);
    }

    public final int hashCode() {
        String str = this.searchQueryId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.searchIid;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSearchInfoDto(searchQueryId=");
        sb.append(this.searchQueryId);
        sb.append(", searchIid=");
        return uqi.b(sb, this.searchIid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.searchQueryId);
        Integer num = this.searchIid;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoSearchInfoDto(String str, Integer num) {
        this.searchQueryId = str;
        this.searchIid = num;
    }

    public /* synthetic */ VideoSearchInfoDto(String str, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
