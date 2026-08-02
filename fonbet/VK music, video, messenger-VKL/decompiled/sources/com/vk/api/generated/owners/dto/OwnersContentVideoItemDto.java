package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: OwnersContentVideoItemDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentVideoItemDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentVideoItemDto> CREATOR = new a();

    @pmi0("is_on_main_tab")
    private final Boolean isOnMainTab;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: OwnersContentVideoItemDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentVideoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentVideoItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(OwnersContentVideoItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OwnersContentVideoItemDto(videoVideoFullDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentVideoItemDto[] newArray(int i) {
            return new OwnersContentVideoItemDto[i];
        }
    }

    public OwnersContentVideoItemDto(VideoVideoFullDto videoVideoFullDto, Boolean bool) {
        this.video = videoVideoFullDto;
        this.isOnMainTab = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersContentVideoItemDto)) {
            return false;
        }
        OwnersContentVideoItemDto ownersContentVideoItemDto = (OwnersContentVideoItemDto) obj;
        return epx.f(this.video, ownersContentVideoItemDto.video) && epx.f(this.isOnMainTab, ownersContentVideoItemDto.isOnMainTab);
    }

    public final int hashCode() {
        int hashCode = this.video.hashCode() * 31;
        Boolean bool = this.isOnMainTab;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersContentVideoItemDto(video=");
        sb.append(this.video);
        sb.append(", isOnMainTab=");
        return tn.a(sb, this.isOnMainTab, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.video, i);
        Boolean bool = this.isOnMainTab;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ OwnersContentVideoItemDto(VideoVideoFullDto videoVideoFullDto, Boolean bool, int i, zcl zclVar) {
        this(videoVideoFullDto, (i & 2) != 0 ? null : bool);
    }
}
