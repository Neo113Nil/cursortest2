package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BadgesGetCatalogResponseDto.kt */
/* loaded from: classes14.dex */
public final class BadgesGetCatalogResponseDto implements Parcelable {
    public static final Parcelable.Creator<BadgesGetCatalogResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("catalog")
    private final BadgesCatalogDto catalog;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("users")
    private final List<UsersUserFullDto> users;

    /* compiled from: BadgesGetCatalogResponseDto.kt */
    public static final class a implements Parcelable.Creator<BadgesGetCatalogResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesGetCatalogResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3 = null;
            BadgesCatalogDto createFromParcel = parcel.readInt() == 0 ? null : BadgesCatalogDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(BadgesGetCatalogResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(BadgesGetCatalogResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new BadgesGetCatalogResponseDto(createFromParcel, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesGetCatalogResponseDto[] newArray(int i) {
            return new BadgesGetCatalogResponseDto[i];
        }
    }

    public BadgesGetCatalogResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesGetCatalogResponseDto)) {
            return false;
        }
        BadgesGetCatalogResponseDto badgesGetCatalogResponseDto = (BadgesGetCatalogResponseDto) obj;
        return epx.f(this.catalog, badgesGetCatalogResponseDto.catalog) && epx.f(this.users, badgesGetCatalogResponseDto.users) && epx.f(this.groups, badgesGetCatalogResponseDto.groups) && epx.f(this.badges, badgesGetCatalogResponseDto.badges);
    }

    public final int hashCode() {
        BadgesCatalogDto badgesCatalogDto = this.catalog;
        int hashCode = (badgesCatalogDto == null ? 0 : badgesCatalogDto.hashCode()) * 31;
        List<UsersUserFullDto> list = this.users;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BadgesBadgeDto> list3 = this.badges;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesGetCatalogResponseDto(catalog=");
        sb.append(this.catalog);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", badges=");
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BadgesCatalogDto badgesCatalogDto = this.catalog;
        if (badgesCatalogDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesCatalogDto.writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.users;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<BadgesBadgeDto> list3 = this.badges;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((BadgesBadgeDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public BadgesGetCatalogResponseDto(BadgesCatalogDto badgesCatalogDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<BadgesBadgeDto> list3) {
        this.catalog = badgesCatalogDto;
        this.users = list;
        this.groups = list2;
        this.badges = list3;
    }

    public /* synthetic */ BadgesGetCatalogResponseDto(BadgesCatalogDto badgesCatalogDto, List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : badgesCatalogDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
