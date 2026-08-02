package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveSearchFiltersDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveSearchFiltersDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveSearchFiltersDto> CREATOR = new a();

    @pmi0("stream_type")
    private final List<VideoLiveSearchStreamTypeFilterDto> streamType;

    /* compiled from: VideoLiveSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveSearchFiltersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoLiveSearchStreamTypeFilterDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoLiveSearchFiltersDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveSearchFiltersDto[] newArray(int i) {
            return new VideoLiveSearchFiltersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoLiveSearchFiltersDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoLiveSearchFiltersDto) && epx.f(this.streamType, ((VideoLiveSearchFiltersDto) obj).streamType);
    }

    public final int hashCode() {
        List<VideoLiveSearchStreamTypeFilterDto> list = this.streamType;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoLiveSearchFiltersDto(streamType="), this.streamType);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoLiveSearchStreamTypeFilterDto> list = this.streamType;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoLiveSearchStreamTypeFilterDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoLiveSearchFiltersDto(List<VideoLiveSearchStreamTypeFilterDto> list) {
        this.streamType = list;
    }

    public /* synthetic */ VideoLiveSearchFiltersDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
