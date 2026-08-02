package com.vk.api.generated.owners.dto;

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
import xsna.sn;
import xsna.zcl;

/* compiled from: OwnersMenuDto.kt */
/* loaded from: classes15.dex */
public final class OwnersMenuDto implements Parcelable {
    public static final Parcelable.Creator<OwnersMenuDto> CREATOR = new a();

    @pmi0("can_add")
    private final Boolean canAdd;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("items")
    private final List<OwnersMenuItemDto> items;

    @pmi0("max_items")
    private final Integer maxItems;

    /* compiled from: OwnersMenuDto.kt */
    public static final class a implements Parcelable.Creator<OwnersMenuDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersMenuDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(OwnersMenuItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OwnersMenuDto(valueOf, valueOf2, valueOf3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersMenuDto[] newArray(int i) {
            return new OwnersMenuDto[i];
        }
    }

    public OwnersMenuDto() {
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
        if (!(obj instanceof OwnersMenuDto)) {
            return false;
        }
        OwnersMenuDto ownersMenuDto = (OwnersMenuDto) obj;
        return epx.f(this.isHidden, ownersMenuDto.isHidden) && epx.f(this.canAdd, ownersMenuDto.canAdd) && epx.f(this.maxItems, ownersMenuDto.maxItems) && epx.f(this.items, ownersMenuDto.items);
    }

    public final int hashCode() {
        Boolean bool = this.isHidden;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.canAdd;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.maxItems;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<OwnersMenuItemDto> list = this.items;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersMenuDto(isHidden=");
        sb.append(this.isHidden);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", maxItems=");
        sb.append(this.maxItems);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canAdd;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.maxItems;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<OwnersMenuItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((OwnersMenuItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public OwnersMenuDto(Boolean bool, Boolean bool2, Integer num, List<OwnersMenuItemDto> list) {
        this.isHidden = bool;
        this.canAdd = bool2;
        this.maxItems = num;
        this.items = list;
    }

    public /* synthetic */ OwnersMenuDto(Boolean bool, Boolean bool2, Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list);
    }
}
