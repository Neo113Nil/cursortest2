package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsActivityMediaDto.kt */
/* loaded from: classes14.dex */
public final class AppsActivityMediaDto implements Parcelable {
    public static final Parcelable.Creator<AppsActivityMediaDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    /* compiled from: AppsActivityMediaDto.kt */
    public static final class a implements Parcelable.Creator<AppsActivityMediaDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsActivityMediaDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsActivityMediaDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsActivityMediaDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsActivityMediaDto[] newArray(int i) {
            return new AppsActivityMediaDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsActivityMediaDto() {
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
        return (obj instanceof AppsActivityMediaDto) && epx.f(this.images, ((AppsActivityMediaDto) obj).images);
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AppsActivityMediaDto(images="), this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public AppsActivityMediaDto(List<BaseImageDto> list) {
        this.images = list;
    }

    public /* synthetic */ AppsActivityMediaDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
