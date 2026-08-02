package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: UsersUserFullProfileRequestsBlockDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserFullProfileRequestsBlockDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserFullProfileRequestsBlockDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    /* compiled from: UsersUserFullProfileRequestsBlockDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserFullProfileRequestsBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileRequestsBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(UsersUserFullProfileRequestsBlockDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UsersUserFullProfileRequestsBlockDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileRequestsBlockDto[] newArray(int i) {
            return new UsersUserFullProfileRequestsBlockDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersUserFullProfileRequestsBlockDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFullProfileRequestsBlockDto)) {
            return false;
        }
        UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto = (UsersUserFullProfileRequestsBlockDto) obj;
        return epx.f(this.count, usersUserFullProfileRequestsBlockDto.count) && epx.f(this.items, usersUserFullProfileRequestsBlockDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UsersUserFullDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserFullProfileRequestsBlockDto(count=");
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
        List<UsersUserFullDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public UsersUserFullProfileRequestsBlockDto(Integer num, List<UsersUserFullDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ UsersUserFullProfileRequestsBlockDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
