package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoChallengePinnedItemDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengePinnedItemDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengePinnedItemDto> CREATOR = new a();

    @pmi0("label")
    private final String label;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: ShortVideoChallengePinnedItemDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengePinnedItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengePinnedItemDto createFromParcel(Parcel parcel) {
            return new ShortVideoChallengePinnedItemDto((VideoVideoFullDto) parcel.readParcelable(ShortVideoChallengePinnedItemDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengePinnedItemDto[] newArray(int i) {
            return new ShortVideoChallengePinnedItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoChallengePinnedItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoVideoFullDto e() {
        return this.video;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengePinnedItemDto)) {
            return false;
        }
        ShortVideoChallengePinnedItemDto shortVideoChallengePinnedItemDto = (ShortVideoChallengePinnedItemDto) obj;
        return epx.f(this.video, shortVideoChallengePinnedItemDto.video) && epx.f(this.label, shortVideoChallengePinnedItemDto.label);
    }

    public final int hashCode() {
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode = (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode()) * 31;
        String str = this.label;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChallengePinnedItemDto(video=");
        sb.append(this.video);
        sb.append(", label=");
        return ho8.a(sb, this.label, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.video, i);
        parcel.writeString(this.label);
    }

    public ShortVideoChallengePinnedItemDto(VideoVideoFullDto videoVideoFullDto, String str) {
        this.video = videoVideoFullDto;
        this.label = str;
    }

    public /* synthetic */ ShortVideoChallengePinnedItemDto(VideoVideoFullDto videoVideoFullDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoVideoFullDto, (i & 2) != 0 ? null : str);
    }
}
