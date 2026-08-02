package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: DonutAttachDonatorsInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutAttachDonatorsInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutAttachDonatorsInfoDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("friends")
    private final List<UserId> friends;

    @pmi0("friends_count")
    private final int friendsCount;

    /* compiled from: DonutAttachDonatorsInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutAttachDonatorsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutAttachDonatorsInfoDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(DonutAttachDonatorsInfoDto.class, parcel, arrayList, i, 1);
            }
            return new DonutAttachDonatorsInfoDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutAttachDonatorsInfoDto[] newArray(int i) {
            return new DonutAttachDonatorsInfoDto[i];
        }
    }

    public DonutAttachDonatorsInfoDto(int i, int i2, List<UserId> list) {
        this.count = i;
        this.friendsCount = i2;
        this.friends = list;
    }

    public final List<UserId> d() {
        return this.friends;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.friendsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutAttachDonatorsInfoDto)) {
            return false;
        }
        DonutAttachDonatorsInfoDto donutAttachDonatorsInfoDto = (DonutAttachDonatorsInfoDto) obj;
        return this.count == donutAttachDonatorsInfoDto.count && this.friendsCount == donutAttachDonatorsInfoDto.friendsCount && epx.f(this.friends, donutAttachDonatorsInfoDto.friends);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.friends.hashCode() + shy.a(this.friendsCount, Integer.hashCode(this.count) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutAttachDonatorsInfoDto(count=");
        sb.append(this.count);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", friends=");
        return ms9.a(')', sb, this.friends);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeInt(this.friendsCount);
        Iterator a2 = ao.a(parcel, this.friends);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
