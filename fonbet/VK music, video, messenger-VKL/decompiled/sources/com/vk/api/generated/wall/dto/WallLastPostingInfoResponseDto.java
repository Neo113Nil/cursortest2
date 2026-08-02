package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: WallLastPostingInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallLastPostingInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallLastPostingInfoResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("last_posting_from")
    private final UserId lastPostingFrom;

    @pmi0("last_updated_time")
    private final Integer lastUpdatedTime;

    /* compiled from: WallLastPostingInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallLastPostingInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallLastPostingInfoResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(WallLastPostingInfoResponseDto.class, parcel, arrayList, i, 1);
            }
            return new WallLastPostingInfoResponseDto(readInt, arrayList, (UserId) parcel.readParcelable(WallLastPostingInfoResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallLastPostingInfoResponseDto[] newArray(int i) {
            return new WallLastPostingInfoResponseDto[i];
        }
    }

    public WallLastPostingInfoResponseDto(int i, List<UserId> list, UserId userId, Integer num) {
        this.count = i;
        this.items = list;
        this.lastPostingFrom = userId;
        this.lastUpdatedTime = num;
    }

    public final UserId d() {
        return this.lastPostingFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallLastPostingInfoResponseDto)) {
            return false;
        }
        WallLastPostingInfoResponseDto wallLastPostingInfoResponseDto = (WallLastPostingInfoResponseDto) obj;
        return this.count == wallLastPostingInfoResponseDto.count && epx.f(this.items, wallLastPostingInfoResponseDto.items) && epx.f(this.lastPostingFrom, wallLastPostingInfoResponseDto.lastPostingFrom) && epx.f(this.lastUpdatedTime, wallLastPostingInfoResponseDto.lastUpdatedTime);
    }

    public final int hashCode() {
        int a2 = bh10.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.lastPostingFrom.b);
        Integer num = this.lastUpdatedTime;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallLastPostingInfoResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", lastPostingFrom=");
        sb.append(this.lastPostingFrom);
        sb.append(", lastUpdatedTime=");
        return uqi.b(sb, this.lastUpdatedTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.lastPostingFrom, i);
        Integer num = this.lastUpdatedTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ WallLastPostingInfoResponseDto(int i, List list, UserId userId, Integer num, int i2, zcl zclVar) {
        this(i, list, userId, (i2 & 8) != 0 ? null : num);
    }
}
