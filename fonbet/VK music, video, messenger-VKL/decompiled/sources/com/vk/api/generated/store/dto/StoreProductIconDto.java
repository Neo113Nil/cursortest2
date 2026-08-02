package com.vk.api.generated.store.dto;

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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreProductIconDto.kt */
/* loaded from: classes15.dex */
public final class StoreProductIconDto implements Parcelable {
    public static final Parcelable.Creator<StoreProductIconDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("version")
    private final Integer version;

    /* compiled from: StoreProductIconDto.kt */
    public static final class a implements Parcelable.Creator<StoreProductIconDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreProductIconDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoreProductIconDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoreProductIconDto(readString, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreProductIconDto[] newArray(int i) {
            return new StoreProductIconDto[i];
        }
    }

    public StoreProductIconDto(String str, Integer num, List<BaseImageDto> list) {
        this.baseUrl = str;
        this.version = num;
        this.images = list;
    }

    public final String d() {
        return this.baseUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreProductIconDto)) {
            return false;
        }
        StoreProductIconDto storeProductIconDto = (StoreProductIconDto) obj;
        return epx.f(this.baseUrl, storeProductIconDto.baseUrl) && epx.f(this.version, storeProductIconDto.version) && epx.f(this.images, storeProductIconDto.images);
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreProductIconDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
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

    public /* synthetic */ StoreProductIconDto(String str, Integer num, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
