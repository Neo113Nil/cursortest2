package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VideoVideoDownloadDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoDownloadDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoDownloadDto> CREATOR = new a();

    @pmi0("can_download_for_offline_view")
    private final Boolean canDownloadForOfflineView;

    @pmi0("can_download_to_device")
    private final Boolean canDownloadToDevice;

    @pmi0("unavailable_for_offline_view")
    private final String unavailableForOfflineView;

    /* compiled from: VideoVideoDownloadDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoDownloadDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoDownloadDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoVideoDownloadDto(valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoDownloadDto[] newArray(int i) {
            return new VideoVideoDownloadDto[i];
        }
    }

    public VideoVideoDownloadDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.canDownloadForOfflineView;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canDownloadToDevice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoDownloadDto)) {
            return false;
        }
        VideoVideoDownloadDto videoVideoDownloadDto = (VideoVideoDownloadDto) obj;
        return epx.f(this.canDownloadForOfflineView, videoVideoDownloadDto.canDownloadForOfflineView) && epx.f(this.canDownloadToDevice, videoVideoDownloadDto.canDownloadToDevice) && epx.f(this.unavailableForOfflineView, videoVideoDownloadDto.unavailableForOfflineView);
    }

    public final String f() {
        return this.unavailableForOfflineView;
    }

    public final int hashCode() {
        Boolean bool = this.canDownloadForOfflineView;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.canDownloadToDevice;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.unavailableForOfflineView;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoDownloadDto(canDownloadForOfflineView=");
        sb.append(this.canDownloadForOfflineView);
        sb.append(", canDownloadToDevice=");
        sb.append(this.canDownloadToDevice);
        sb.append(", unavailableForOfflineView=");
        return ho8.a(sb, this.unavailableForOfflineView, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canDownloadForOfflineView;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canDownloadToDevice;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.unavailableForOfflineView);
    }

    public VideoVideoDownloadDto(Boolean bool, Boolean bool2, String str) {
        this.canDownloadForOfflineView = bool;
        this.canDownloadToDevice = bool2;
        this.unavailableForOfflineView = str;
    }

    public /* synthetic */ VideoVideoDownloadDto(Boolean bool, Boolean bool2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str);
    }
}
