package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetUpcomingLivesResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetUpcomingLivesResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetUpcomingLivesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoDto> items;

    @pmi0("items_full")
    private final List<VideoVideoFullDto> itemsFull;

    /* compiled from: VideoGetUpcomingLivesResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetUpcomingLivesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetUpcomingLivesResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(VideoGetUpcomingLivesResponseDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(VideoGetUpcomingLivesResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new VideoGetUpcomingLivesResponseDto(readInt, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetUpcomingLivesResponseDto[] newArray(int i) {
            return new VideoGetUpcomingLivesResponseDto[i];
        }
    }

    public VideoGetUpcomingLivesResponseDto(int i, List<VideoVideoDto> list, List<VideoVideoFullDto> list2) {
        this.count = i;
        this.items = list;
        this.itemsFull = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetUpcomingLivesResponseDto)) {
            return false;
        }
        VideoGetUpcomingLivesResponseDto videoGetUpcomingLivesResponseDto = (VideoGetUpcomingLivesResponseDto) obj;
        return this.count == videoGetUpcomingLivesResponseDto.count && epx.f(this.items, videoGetUpcomingLivesResponseDto.items) && epx.f(this.itemsFull, videoGetUpcomingLivesResponseDto.itemsFull);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<VideoVideoFullDto> list = this.itemsFull;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetUpcomingLivesResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", itemsFull=");
        return ms9.a(')', sb, this.itemsFull);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<VideoVideoFullDto> list = this.itemsFull;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ VideoGetUpcomingLivesResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
