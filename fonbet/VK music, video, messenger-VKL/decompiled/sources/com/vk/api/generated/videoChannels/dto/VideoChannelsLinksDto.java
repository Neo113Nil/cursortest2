package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoChannelsLinksDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsLinksDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsLinksDto> CREATOR = new a();

    @pmi0("enabled")
    private final Boolean enabled;

    @pmi0("links")
    private final List<VideoChannelsOneLinkDto> links;

    @pmi0("total_links_count")
    private final int totalLinksCount;

    /* compiled from: VideoChannelsLinksDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsLinksDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(VideoChannelsOneLinkDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoChannelsLinksDto(readInt, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsLinksDto[] newArray(int i) {
            return new VideoChannelsLinksDto[i];
        }
    }

    public VideoChannelsLinksDto(int i, List<VideoChannelsOneLinkDto> list, Boolean bool) {
        this.totalLinksCount = i;
        this.links = list;
        this.enabled = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsLinksDto)) {
            return false;
        }
        VideoChannelsLinksDto videoChannelsLinksDto = (VideoChannelsLinksDto) obj;
        return this.totalLinksCount == videoChannelsLinksDto.totalLinksCount && epx.f(this.links, videoChannelsLinksDto.links) && epx.f(this.enabled, videoChannelsLinksDto.enabled);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.totalLinksCount) * 31, 31, this.links);
        Boolean bool = this.enabled;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsLinksDto(totalLinksCount=");
        sb.append(this.totalLinksCount);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(", enabled=");
        return tn.a(sb, this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalLinksCount);
        Iterator a2 = ao.a(parcel, this.links);
        while (a2.hasNext()) {
            ((VideoChannelsOneLinkDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoChannelsLinksDto(int i, List list, Boolean bool, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : bool);
    }
}
