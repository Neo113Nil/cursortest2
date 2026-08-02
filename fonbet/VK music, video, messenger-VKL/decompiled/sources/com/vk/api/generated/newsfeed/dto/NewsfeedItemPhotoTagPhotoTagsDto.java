package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
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

/* compiled from: NewsfeedItemPhotoTagPhotoTagsDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemPhotoTagPhotoTagsDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemPhotoTagPhotoTagsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    /* compiled from: NewsfeedItemPhotoTagPhotoTagsDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemPhotoTagPhotoTagsDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemPhotoTagPhotoTagsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedItemPhotoTagPhotoTagsDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NewsfeedItemPhotoTagPhotoTagsDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemPhotoTagPhotoTagsDto[] newArray(int i) {
            return new NewsfeedItemPhotoTagPhotoTagsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemPhotoTagPhotoTagsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<PhotosPhotoDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPhotoTagPhotoTagsDto)) {
            return false;
        }
        NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto = (NewsfeedItemPhotoTagPhotoTagsDto) obj;
        return epx.f(this.count, newsfeedItemPhotoTagPhotoTagsDto.count) && epx.f(this.items, newsfeedItemPhotoTagPhotoTagsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PhotosPhotoDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemPhotoTagPhotoTagsDto(count=");
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
        List<PhotosPhotoDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public NewsfeedItemPhotoTagPhotoTagsDto(Integer num, List<PhotosPhotoDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemPhotoTagPhotoTagsDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
