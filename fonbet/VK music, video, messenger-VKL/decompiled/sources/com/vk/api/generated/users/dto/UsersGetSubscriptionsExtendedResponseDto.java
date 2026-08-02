package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersGetSubscriptionsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class UsersGetSubscriptionsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<UsersGetSubscriptionsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersSubscriptionsItemDto> items;

    @pmi0("track_codes")
    private final List<UsersSubscriptionItemTrackCodeDto> trackCodes;

    /* compiled from: UsersGetSubscriptionsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<UsersGetSubscriptionsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGetSubscriptionsExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(UsersGetSubscriptionsExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(UsersSubscriptionItemTrackCodeDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new UsersGetSubscriptionsExtendedResponseDto(readInt, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGetSubscriptionsExtendedResponseDto[] newArray(int i) {
            return new UsersGetSubscriptionsExtendedResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersGetSubscriptionsExtendedResponseDto(int i, List<? extends UsersSubscriptionsItemDto> list, List<UsersSubscriptionItemTrackCodeDto> list2) {
        this.count = i;
        this.items = list;
        this.trackCodes = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetSubscriptionsExtendedResponseDto)) {
            return false;
        }
        UsersGetSubscriptionsExtendedResponseDto usersGetSubscriptionsExtendedResponseDto = (UsersGetSubscriptionsExtendedResponseDto) obj;
        return this.count == usersGetSubscriptionsExtendedResponseDto.count && epx.f(this.items, usersGetSubscriptionsExtendedResponseDto.items) && epx.f(this.trackCodes, usersGetSubscriptionsExtendedResponseDto.trackCodes);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersSubscriptionItemTrackCodeDto> list = this.trackCodes;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersGetSubscriptionsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", trackCodes=");
        return ms9.a(')', sb, this.trackCodes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<UsersSubscriptionItemTrackCodeDto> list = this.trackCodes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((UsersSubscriptionItemTrackCodeDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ UsersGetSubscriptionsExtendedResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
