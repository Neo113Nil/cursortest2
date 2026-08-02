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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersUserFullProfileMutualFriendDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserFullProfileMutualFriendDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserFullProfileMutualFriendDto> CREATOR = new a();

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    /* compiled from: UsersUserFullProfileMutualFriendDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserFullProfileMutualFriendDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileMutualFriendDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(UsersUserFullProfileMutualFriendDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UsersUserFullProfileMutualFriendDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileMutualFriendDto[] newArray(int i) {
            return new UsersUserFullProfileMutualFriendDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersUserFullProfileMutualFriendDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<UsersUserFullDto> d() {
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
        return (obj instanceof UsersUserFullProfileMutualFriendDto) && epx.f(this.items, ((UsersUserFullProfileMutualFriendDto) obj).items);
    }

    public final int hashCode() {
        List<UsersUserFullDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("UsersUserFullProfileMutualFriendDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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

    public UsersUserFullProfileMutualFriendDto(List<UsersUserFullDto> list) {
        this.items = list;
    }

    public /* synthetic */ UsersUserFullProfileMutualFriendDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
