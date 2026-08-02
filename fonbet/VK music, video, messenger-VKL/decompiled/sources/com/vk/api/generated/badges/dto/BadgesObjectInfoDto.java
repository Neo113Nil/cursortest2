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
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: BadgesObjectInfoDto.kt */
/* loaded from: classes14.dex */
public final class BadgesObjectInfoDto implements Parcelable {
    public static final Parcelable.Creator<BadgesObjectInfoDto> CREATOR = new a();

    @pmi0("counters")
    private final List<BadgesObjectEntriesCounterDto> counters;

    @pmi0("donut_miniapp_url")
    private final String donutMiniappUrl;

    @pmi0("id")
    private final int id;

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("type")
    private final int type;

    /* compiled from: BadgesObjectInfoDto.kt */
    public static final class a implements Parcelable.Creator<BadgesObjectInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesObjectInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(BadgesObjectInfoDto.class.getClassLoader());
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(BadgesObjectEntriesCounterDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BadgesObjectInfoDto(readInt, readInt2, userId, valueOf, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesObjectInfoDto[] newArray(int i) {
            return new BadgesObjectInfoDto[i];
        }
    }

    public BadgesObjectInfoDto(int i, int i2, UserId userId, Boolean bool, List<BadgesObjectEntriesCounterDto> list, String str) {
        this.type = i;
        this.id = i2;
        this.ownerId = userId;
        this.isDisabled = bool;
        this.counters = list;
        this.donutMiniappUrl = str;
    }

    public final List<BadgesObjectEntriesCounterDto> d() {
        return this.counters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesObjectInfoDto)) {
            return false;
        }
        BadgesObjectInfoDto badgesObjectInfoDto = (BadgesObjectInfoDto) obj;
        return this.type == badgesObjectInfoDto.type && this.id == badgesObjectInfoDto.id && epx.f(this.ownerId, badgesObjectInfoDto.ownerId) && epx.f(this.isDisabled, badgesObjectInfoDto.isDisabled) && epx.f(this.counters, badgesObjectInfoDto.counters) && epx.f(this.donutMiniappUrl, badgesObjectInfoDto.donutMiniappUrl);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.id, Integer.hashCode(this.type) * 31, 31);
        UserId userId = this.ownerId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.isDisabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BadgesObjectEntriesCounterDto> list = this.counters;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.donutMiniappUrl;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesObjectInfoDto(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", isDisabled=");
        sb.append(this.isDisabled);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", donutMiniappUrl=");
        return ho8.a(sb, this.donutMiniappUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<BadgesObjectEntriesCounterDto> list = this.counters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BadgesObjectEntriesCounterDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.donutMiniappUrl);
    }

    public /* synthetic */ BadgesObjectInfoDto(int i, int i2, UserId userId, Boolean bool, List list, String str, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : userId, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : list, (i3 & 32) != 0 ? null : str);
    }
}
