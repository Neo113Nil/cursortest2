package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
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

/* compiled from: StoriesSituationalRepliedUsersDto.kt */
/* loaded from: classes15.dex */
public final class StoriesSituationalRepliedUsersDto implements Parcelable {
    public static final Parcelable.Creator<StoriesSituationalRepliedUsersDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("items")
    private final List<UserId> items;

    /* compiled from: StoriesSituationalRepliedUsersDto.kt */
    public static final class a implements Parcelable.Creator<StoriesSituationalRepliedUsersDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesSituationalRepliedUsersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoriesSituationalRepliedUsersDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoriesSituationalRepliedUsersDto(valueOf, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesSituationalRepliedUsersDto[] newArray(int i) {
            return new StoriesSituationalRepliedUsersDto[i];
        }
    }

    public StoriesSituationalRepliedUsersDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.friendsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesSituationalRepliedUsersDto)) {
            return false;
        }
        StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto = (StoriesSituationalRepliedUsersDto) obj;
        return epx.f(this.count, storiesSituationalRepliedUsersDto.count) && epx.f(this.friendsCount, storiesSituationalRepliedUsersDto.friendsCount) && epx.f(this.items, storiesSituationalRepliedUsersDto.items);
    }

    public final List<UserId> f() {
        return this.items;
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.friendsCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UserId> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesSituationalRepliedUsersDto(count=");
        sb.append(this.count);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
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
        Integer num2 = this.friendsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UserId> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public StoriesSituationalRepliedUsersDto(Integer num, Integer num2, List<UserId> list) {
        this.count = num;
        this.friendsCount = num2;
        this.items = list;
    }

    public /* synthetic */ StoriesSituationalRepliedUsersDto(Integer num, Integer num2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list);
    }
}
