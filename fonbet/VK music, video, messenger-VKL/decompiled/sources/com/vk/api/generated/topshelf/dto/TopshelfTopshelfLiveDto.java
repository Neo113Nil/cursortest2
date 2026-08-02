package com.vk.api.generated.topshelf.dto;

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

/* compiled from: TopshelfTopshelfLiveDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfLiveDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfLiveDto> CREATOR = new a();

    @pmi0("info")
    private final List<TopshelfTopshelfLiveItemDto> info;

    /* compiled from: TopshelfTopshelfLiveDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfLiveDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfLiveDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(TopshelfTopshelfLiveItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new TopshelfTopshelfLiveDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfLiveDto[] newArray(int i) {
            return new TopshelfTopshelfLiveDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopshelfTopshelfLiveDto() {
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
        return (obj instanceof TopshelfTopshelfLiveDto) && epx.f(this.info, ((TopshelfTopshelfLiveDto) obj).info);
    }

    public final int hashCode() {
        List<TopshelfTopshelfLiveItemDto> list = this.info;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("TopshelfTopshelfLiveDto(info="), this.info);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<TopshelfTopshelfLiveItemDto> list = this.info;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((TopshelfTopshelfLiveItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public TopshelfTopshelfLiveDto(List<TopshelfTopshelfLiveItemDto> list) {
        this.info = list;
    }

    public /* synthetic */ TopshelfTopshelfLiveDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
