package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGameVideoItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsGameVideoItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsGameVideoItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: AppsGameVideoItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsGameVideoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGameVideoItemDto createFromParcel(Parcel parcel) {
            return new AppsGameVideoItemDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (VideoVideoFullDto) parcel.readParcelable(AppsGameVideoItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGameVideoItemDto[] newArray(int i) {
            return new AppsGameVideoItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsGameVideoItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGameVideoItemDto)) {
            return false;
        }
        AppsGameVideoItemDto appsGameVideoItemDto = (AppsGameVideoItemDto) obj;
        return epx.f(this.appId, appsGameVideoItemDto.appId) && epx.f(this.video, appsGameVideoItemDto.video);
    }

    public final int hashCode() {
        Integer num = this.appId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsGameVideoItemDto(appId=" + this.appId + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.video, i);
    }

    public AppsGameVideoItemDto(Integer num, VideoVideoFullDto videoVideoFullDto) {
        this.appId = num;
        this.video = videoVideoFullDto;
    }

    public /* synthetic */ AppsGameVideoItemDto(Integer num, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : videoVideoFullDto);
    }
}
