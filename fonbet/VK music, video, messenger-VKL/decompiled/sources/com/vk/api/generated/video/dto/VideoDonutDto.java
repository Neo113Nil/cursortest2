package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoDonutDto.kt */
/* loaded from: classes15.dex */
public final class VideoDonutDto implements Parcelable {
    public static final Parcelable.Creator<VideoDonutDto> CREATOR = new a();

    @pmi0("chip")
    private final VideoDonutChipDto chip;

    @pmi0("is_don")
    private final boolean isDon;

    @pmi0("level_id")
    private final int levelId;

    @pmi0("popup")
    private final VideoDonutPopupDto popup;

    @pmi0("tooltip_text")
    private final String tooltipText;

    /* compiled from: VideoDonutDto.kt */
    public static final class a implements Parcelable.Creator<VideoDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDonutDto createFromParcel(Parcel parcel) {
            return new VideoDonutDto(parcel.readInt() != 0, parcel.readInt(), VideoDonutChipDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoDonutPopupDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDonutDto[] newArray(int i) {
            return new VideoDonutDto[i];
        }
    }

    public VideoDonutDto(boolean z, int i, VideoDonutChipDto videoDonutChipDto, VideoDonutPopupDto videoDonutPopupDto, String str) {
        this.isDon = z;
        this.levelId = i;
        this.chip = videoDonutChipDto;
        this.popup = videoDonutPopupDto;
        this.tooltipText = str;
    }

    public final VideoDonutChipDto d() {
        return this.chip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.levelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutDto)) {
            return false;
        }
        VideoDonutDto videoDonutDto = (VideoDonutDto) obj;
        return this.isDon == videoDonutDto.isDon && this.levelId == videoDonutDto.levelId && epx.f(this.chip, videoDonutDto.chip) && epx.f(this.popup, videoDonutDto.popup) && epx.f(this.tooltipText, videoDonutDto.tooltipText);
    }

    public final VideoDonutPopupDto f() {
        return this.popup;
    }

    public final boolean g() {
        return this.isDon;
    }

    public final int hashCode() {
        int hashCode = (this.chip.hashCode() + shy.a(this.levelId, Boolean.hashCode(this.isDon) * 31, 31)) * 31;
        VideoDonutPopupDto videoDonutPopupDto = this.popup;
        int hashCode2 = (hashCode + (videoDonutPopupDto == null ? 0 : videoDonutPopupDto.hashCode())) * 31;
        String str = this.tooltipText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDonutDto(isDon=");
        sb.append(this.isDon);
        sb.append(", levelId=");
        sb.append(this.levelId);
        sb.append(", chip=");
        sb.append(this.chip);
        sb.append(", popup=");
        sb.append(this.popup);
        sb.append(", tooltipText=");
        return ho8.a(sb, this.tooltipText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDon ? 1 : 0);
        parcel.writeInt(this.levelId);
        this.chip.writeToParcel(parcel, i);
        VideoDonutPopupDto videoDonutPopupDto = this.popup;
        if (videoDonutPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDonutPopupDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tooltipText);
    }

    public /* synthetic */ VideoDonutDto(boolean z, int i, VideoDonutChipDto videoDonutChipDto, VideoDonutPopupDto videoDonutPopupDto, String str, int i2, zcl zclVar) {
        this(z, i, videoDonutChipDto, (i2 & 8) != 0 ? null : videoDonutPopupDto, (i2 & 16) != 0 ? null : str);
    }
}
