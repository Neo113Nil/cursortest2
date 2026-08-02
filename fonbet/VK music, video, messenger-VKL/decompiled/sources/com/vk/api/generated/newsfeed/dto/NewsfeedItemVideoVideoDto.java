package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemVideoVideoDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemVideoVideoDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemVideoVideoDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    /* compiled from: NewsfeedItemVideoVideoDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemVideoVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemVideoVideoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedItemVideoVideoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NewsfeedItemVideoVideoDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemVideoVideoDto[] newArray(int i) {
            return new NewsfeedItemVideoVideoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemVideoVideoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<VideoVideoFullDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemVideoVideoDto)) {
            return false;
        }
        NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto = (NewsfeedItemVideoVideoDto) obj;
        return epx.f(this.count, newsfeedItemVideoVideoDto.count) && epx.f(this.items, newsfeedItemVideoVideoDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VideoVideoFullDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemVideoVideoDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<VideoVideoFullDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public NewsfeedItemVideoVideoDto(Integer num, List<VideoVideoFullDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemVideoVideoDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
