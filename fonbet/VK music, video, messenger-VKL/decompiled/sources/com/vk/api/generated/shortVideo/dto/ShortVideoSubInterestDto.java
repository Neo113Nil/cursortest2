package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoSubInterestDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSubInterestDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSubInterestDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("ids")
    private final List<Integer> ids;

    @pmi0("name")
    private final String name;

    /* compiled from: ShortVideoSubInterestDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSubInterestDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSubInterestDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoSubInterestDto(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSubInterestDto[] newArray(int i) {
            return new ShortVideoSubInterestDto[i];
        }
    }

    public ShortVideoSubInterestDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoSubInterestDto)) {
            return false;
        }
        ShortVideoSubInterestDto shortVideoSubInterestDto = (ShortVideoSubInterestDto) obj;
        return epx.f(this.ids, shortVideoSubInterestDto.ids) && epx.f(this.name, shortVideoSubInterestDto.name) && epx.f(this.icon, shortVideoSubInterestDto.icon);
    }

    public final int hashCode() {
        List<Integer> list = this.ids;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoSubInterestDto(ids=");
        sb.append(this.ids);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        return ho8.a(sb, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Integer> list = this.ids;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
    }

    public ShortVideoSubInterestDto(List<Integer> list, String str, String str2) {
        this.ids = list;
        this.name = str;
        this.icon = str2;
    }

    public /* synthetic */ ShortVideoSubInterestDto(List list, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
