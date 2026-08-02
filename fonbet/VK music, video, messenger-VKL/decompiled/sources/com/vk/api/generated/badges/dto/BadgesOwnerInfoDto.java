package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BadgesOwnerInfoDto.kt */
/* loaded from: classes14.dex */
public final class BadgesOwnerInfoDto implements Parcelable {
    public static final Parcelable.Creator<BadgesOwnerInfoDto> CREATOR = new a();

    @pmi0("counters")
    private final List<BadgesOwnerEntriesCounterDto> counters;

    @pmi0("id")
    private final UserId id;

    /* compiled from: BadgesOwnerInfoDto.kt */
    public static final class a implements Parcelable.Creator<BadgesOwnerInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesOwnerInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId = (UserId) parcel.readParcelable(BadgesOwnerInfoDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BadgesOwnerEntriesCounterDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BadgesOwnerInfoDto(userId, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesOwnerInfoDto[] newArray(int i) {
            return new BadgesOwnerInfoDto[i];
        }
    }

    public BadgesOwnerInfoDto(UserId userId, List<BadgesOwnerEntriesCounterDto> list) {
        this.id = userId;
        this.counters = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesOwnerInfoDto)) {
            return false;
        }
        BadgesOwnerInfoDto badgesOwnerInfoDto = (BadgesOwnerInfoDto) obj;
        return epx.f(this.id, badgesOwnerInfoDto.id) && epx.f(this.counters, badgesOwnerInfoDto.counters);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        List<BadgesOwnerEntriesCounterDto> list = this.counters;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesOwnerInfoDto(id=");
        sb.append(this.id);
        sb.append(", counters=");
        return ms9.a(')', sb, this.counters);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        List<BadgesOwnerEntriesCounterDto> list = this.counters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BadgesOwnerEntriesCounterDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BadgesOwnerInfoDto(UserId userId, List list, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : list);
    }
}
