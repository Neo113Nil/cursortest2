package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveSpectatorsDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveSpectatorsDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveSpectatorsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    /* compiled from: VideoLiveSpectatorsDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveSpectatorsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveSpectatorsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(VideoLiveSpectatorsDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoLiveSpectatorsDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveSpectatorsDto[] newArray(int i) {
            return new VideoLiveSpectatorsDto[i];
        }
    }

    public VideoLiveSpectatorsDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveSpectatorsDto)) {
            return false;
        }
        VideoLiveSpectatorsDto videoLiveSpectatorsDto = (VideoLiveSpectatorsDto) obj;
        return this.count == videoLiveSpectatorsDto.count && epx.f(this.items, videoLiveSpectatorsDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        List<UserId> list = this.items;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLiveSpectatorsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        List<UserId> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ VideoLiveSpectatorsDto(int i, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
