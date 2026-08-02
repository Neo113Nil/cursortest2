package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoNavigationDto.kt */
/* loaded from: classes15.dex */
public final class VideoNavigationDto implements Parcelable {
    public static final Parcelable.Creator<VideoNavigationDto> CREATOR = new a();

    @pmi0("source_block")
    private final String sourceBlock;

    @pmi0("source_prev_screen")
    private final String sourcePrevScreen;

    @pmi0("source_screen")
    private final String sourceScreen;

    /* compiled from: VideoNavigationDto.kt */
    public static final class a implements Parcelable.Creator<VideoNavigationDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoNavigationDto createFromParcel(Parcel parcel) {
            return new VideoNavigationDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoNavigationDto[] newArray(int i) {
            return new VideoNavigationDto[i];
        }
    }

    public VideoNavigationDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.sourceBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sourcePrevScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoNavigationDto)) {
            return false;
        }
        VideoNavigationDto videoNavigationDto = (VideoNavigationDto) obj;
        return epx.f(this.sourceScreen, videoNavigationDto.sourceScreen) && epx.f(this.sourceBlock, videoNavigationDto.sourceBlock) && epx.f(this.sourcePrevScreen, videoNavigationDto.sourcePrevScreen);
    }

    public final String f() {
        return this.sourceScreen;
    }

    public final int hashCode() {
        String str = this.sourceScreen;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceBlock;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourcePrevScreen;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoNavigationDto(sourceScreen=");
        sb.append(this.sourceScreen);
        sb.append(", sourceBlock=");
        sb.append(this.sourceBlock);
        sb.append(", sourcePrevScreen=");
        return ho8.a(sb, this.sourcePrevScreen, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sourceScreen);
        parcel.writeString(this.sourceBlock);
        parcel.writeString(this.sourcePrevScreen);
    }

    public VideoNavigationDto(String str, String str2, String str3) {
        this.sourceScreen = str;
        this.sourceBlock = str2;
        this.sourcePrevScreen = str3;
    }

    public /* synthetic */ VideoNavigationDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
