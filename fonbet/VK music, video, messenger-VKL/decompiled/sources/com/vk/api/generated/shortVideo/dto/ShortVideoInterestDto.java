package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoInterestDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoInterestDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoInterestDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("sub_items")
    private final List<ShortVideoSubInterestDto> subItems;

    /* compiled from: ShortVideoInterestDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoInterestDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterestDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ShortVideoSubInterestDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoInterestDto(valueOf, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterestDto[] newArray(int i) {
            return new ShortVideoInterestDto[i];
        }
    }

    public ShortVideoInterestDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoInterestDto)) {
            return false;
        }
        ShortVideoInterestDto shortVideoInterestDto = (ShortVideoInterestDto) obj;
        return epx.f(this.id, shortVideoInterestDto.id) && epx.f(this.name, shortVideoInterestDto.name) && epx.f(this.icon, shortVideoInterestDto.icon) && epx.f(this.subItems, shortVideoInterestDto.subItems);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ShortVideoSubInterestDto> list = this.subItems;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoInterestDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", subItems=");
        return ms9.a(')', sb, this.subItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        List<ShortVideoSubInterestDto> list = this.subItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ShortVideoSubInterestDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public ShortVideoInterestDto(Integer num, String str, String str2, List<ShortVideoSubInterestDto> list) {
        this.id = num;
        this.name = str;
        this.icon = str2;
        this.subItems = list;
    }

    public /* synthetic */ ShortVideoInterestDto(Integer num, String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
