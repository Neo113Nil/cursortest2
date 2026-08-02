package com.vk.api.generated.base.dto;

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

/* compiled from: BaseLikesDto.kt */
/* loaded from: classes14.dex */
public final class BaseLikesDto implements Parcelable {
    public static final Parcelable.Creator<BaseLikesDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("friend_ids")
    private final List<UserId> friendIds;

    @pmi0("user_likes")
    private final BaseBoolIntDto userLikes;

    /* compiled from: BaseLikesDto.kt */
    public static final class a implements Parcelable.Creator<BaseLikesDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLikesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(BaseLikesDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BaseLikesDto(valueOf, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLikesDto[] newArray(int i) {
            return new BaseLikesDto[i];
        }
    }

    public BaseLikesDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.userLikes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLikesDto)) {
            return false;
        }
        BaseLikesDto baseLikesDto = (BaseLikesDto) obj;
        return epx.f(this.count, baseLikesDto.count) && this.userLikes == baseLikesDto.userLikes && epx.f(this.friendIds, baseLikesDto.friendIds);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.userLikes;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        List<UserId> list = this.friendIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLikesDto(count=");
        sb.append(this.count);
        sb.append(", userLikes=");
        sb.append(this.userLikes);
        sb.append(", friendIds=");
        return ms9.a(')', sb, this.friendIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        BaseBoolIntDto baseBoolIntDto = this.userLikes;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        List<UserId> list = this.friendIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public BaseLikesDto(Integer num, BaseBoolIntDto baseBoolIntDto, List<UserId> list) {
        this.count = num;
        this.userLikes = baseBoolIntDto;
        this.friendIds = list;
    }

    public /* synthetic */ BaseLikesDto(Integer num, BaseBoolIntDto baseBoolIntDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : list);
    }
}
