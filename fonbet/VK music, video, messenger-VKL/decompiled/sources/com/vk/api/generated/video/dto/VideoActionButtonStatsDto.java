package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoActionButtonStatsDto.kt */
/* loaded from: classes15.dex */
public final class VideoActionButtonStatsDto implements Parcelable {
    public static final Parcelable.Creator<VideoActionButtonStatsDto> CREATOR = new a();

    @pmi0("clicks")
    private final Integer clicks;

    @pmi0("link")
    private final ActionLinksActionDto link;

    @pmi0("views")
    private final Integer views;

    /* compiled from: VideoActionButtonStatsDto.kt */
    public static final class a implements Parcelable.Creator<VideoActionButtonStatsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoActionButtonStatsDto createFromParcel(Parcel parcel) {
            return new VideoActionButtonStatsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ActionLinksActionDto) parcel.readParcelable(VideoActionButtonStatsDto.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoActionButtonStatsDto[] newArray(int i) {
            return new VideoActionButtonStatsDto[i];
        }
    }

    public VideoActionButtonStatsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoActionButtonStatsDto)) {
            return false;
        }
        VideoActionButtonStatsDto videoActionButtonStatsDto = (VideoActionButtonStatsDto) obj;
        return epx.f(this.clicks, videoActionButtonStatsDto.clicks) && epx.f(this.link, videoActionButtonStatsDto.link) && epx.f(this.views, videoActionButtonStatsDto.views);
    }

    public final int hashCode() {
        Integer num = this.clicks;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ActionLinksActionDto actionLinksActionDto = this.link;
        int hashCode2 = (hashCode + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
        Integer num2 = this.views;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoActionButtonStatsDto(clicks=");
        sb.append(this.clicks);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", views=");
        return uqi.b(sb, this.views, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.clicks;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.link, i);
        Integer num2 = this.views;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public VideoActionButtonStatsDto(Integer num, ActionLinksActionDto actionLinksActionDto, Integer num2) {
        this.clicks = num;
        this.link = actionLinksActionDto;
        this.views = num2;
    }

    public /* synthetic */ VideoActionButtonStatsDto(Integer num, ActionLinksActionDto actionLinksActionDto, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : actionLinksActionDto, (i & 4) != 0 ? null : num2);
    }
}
