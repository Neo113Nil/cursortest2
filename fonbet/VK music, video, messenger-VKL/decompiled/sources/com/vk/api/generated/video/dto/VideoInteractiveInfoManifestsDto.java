package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoInteractiveInfoManifestsDto.kt */
/* loaded from: classes15.dex */
public final class VideoInteractiveInfoManifestsDto implements Parcelable {
    public static final Parcelable.Creator<VideoInteractiveInfoManifestsDto> CREATOR = new a();

    @pmi0(X3.i.Z)
    private final String main;

    /* compiled from: VideoInteractiveInfoManifestsDto.kt */
    public static final class a implements Parcelable.Creator<VideoInteractiveInfoManifestsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveInfoManifestsDto createFromParcel(Parcel parcel) {
            return new VideoInteractiveInfoManifestsDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveInfoManifestsDto[] newArray(int i) {
            return new VideoInteractiveInfoManifestsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoInteractiveInfoManifestsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.main;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoInteractiveInfoManifestsDto) && epx.f(this.main, ((VideoInteractiveInfoManifestsDto) obj).main);
    }

    public final int hashCode() {
        String str = this.main;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoInteractiveInfoManifestsDto(main="), this.main, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.main);
    }

    public VideoInteractiveInfoManifestsDto(String str) {
        this.main = str;
    }

    public /* synthetic */ VideoInteractiveInfoManifestsDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
