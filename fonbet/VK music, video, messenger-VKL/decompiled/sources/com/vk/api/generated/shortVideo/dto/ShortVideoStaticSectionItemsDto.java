package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoStaticSectionItemsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoStaticSectionItemsDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoStaticSectionItemsDto> CREATOR = new a();

    @pmi0("item_key")
    private final String itemKey;

    @pmi0("sizes")
    private final List<BaseImageDto> sizes;

    @pmi0("url")
    private final String url;

    /* compiled from: ShortVideoStaticSectionItemsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoStaticSectionItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoStaticSectionItemsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoStaticSectionItemsDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoStaticSectionItemsDto(readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoStaticSectionItemsDto[] newArray(int i) {
            return new ShortVideoStaticSectionItemsDto[i];
        }
    }

    public ShortVideoStaticSectionItemsDto(String str, List<BaseImageDto> list, String str2) {
        this.itemKey = str;
        this.sizes = list;
        this.url = str2;
    }

    public final String d() {
        return this.itemKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.sizes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoStaticSectionItemsDto)) {
            return false;
        }
        ShortVideoStaticSectionItemsDto shortVideoStaticSectionItemsDto = (ShortVideoStaticSectionItemsDto) obj;
        return epx.f(this.itemKey, shortVideoStaticSectionItemsDto.itemKey) && epx.f(this.sizes, shortVideoStaticSectionItemsDto.sizes) && epx.f(this.url, shortVideoStaticSectionItemsDto.url);
    }

    public final int hashCode() {
        int hashCode = this.itemKey.hashCode() * 31;
        List<BaseImageDto> list = this.sizes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoStaticSectionItemsDto(itemKey=");
        sb.append(this.itemKey);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemKey);
        List<BaseImageDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.url);
    }

    public /* synthetic */ ShortVideoStaticSectionItemsDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
