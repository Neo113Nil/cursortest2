package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoTabbarDto.kt */
/* loaded from: classes15.dex */
public final class VideoTabbarDto implements Parcelable {
    public static final Parcelable.Creator<VideoTabbarDto> CREATOR = new a();

    @pmi0("hide_titles")
    private final Boolean hideTitles;

    @pmi0("items")
    private final List<VideoTabbarItemDto> items;

    /* compiled from: VideoTabbarDto.kt */
    public static final class a implements Parcelable.Creator<VideoTabbarDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTabbarDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoTabbarItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoTabbarDto(arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTabbarDto[] newArray(int i) {
            return new VideoTabbarDto[i];
        }
    }

    public VideoTabbarDto(List<VideoTabbarItemDto> list, Boolean bool) {
        this.items = list;
        this.hideTitles = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTabbarDto)) {
            return false;
        }
        VideoTabbarDto videoTabbarDto = (VideoTabbarDto) obj;
        return epx.f(this.items, videoTabbarDto.items) && epx.f(this.hideTitles, videoTabbarDto.hideTitles);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Boolean bool = this.hideTitles;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTabbarDto(items=");
        sb.append(this.items);
        sb.append(", hideTitles=");
        return tn.a(sb, this.hideTitles, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoTabbarItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.hideTitles;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoTabbarDto(List list, Boolean bool, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : bool);
    }
}
