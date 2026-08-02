package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.store.dto.StoreSpecialEventDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: UsersSpecialEventsDto.kt */
/* loaded from: classes15.dex */
public final class UsersSpecialEventsDto implements Parcelable {
    public static final Parcelable.Creator<UsersSpecialEventsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<StoreSpecialEventDto> items;

    /* compiled from: UsersSpecialEventsDto.kt */
    public static final class a implements Parcelable.Creator<UsersSpecialEventsDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersSpecialEventsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StoreSpecialEventDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new UsersSpecialEventsDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersSpecialEventsDto[] newArray(int i) {
            return new UsersSpecialEventsDto[i];
        }
    }

    public UsersSpecialEventsDto(int i, List<StoreSpecialEventDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSpecialEventsDto)) {
            return false;
        }
        UsersSpecialEventsDto usersSpecialEventsDto = (UsersSpecialEventsDto) obj;
        return this.count == usersSpecialEventsDto.count && epx.f(this.items, usersSpecialEventsDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersSpecialEventsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoreSpecialEventDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
