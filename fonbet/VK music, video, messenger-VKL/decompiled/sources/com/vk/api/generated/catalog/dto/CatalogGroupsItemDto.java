package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.groups.dto.GroupsGroupFriendsDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogGroupsItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGroupsItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogGroupsItemDto> CREATOR = new a();

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("city")
    private final String city;

    @pmi0("coords")
    private final CatalogCoordsDto coords;

    @pmi0("counter")
    private final Integer counter;

    @pmi0("description")
    private final String description;

    @pmi0("friends")
    private final GroupsGroupFriendsDto friends;

    @pmi0("id")
    private final UserId id;

    @pmi0("item_section_id")
    private final String itemSectionId;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: CatalogGroupsItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGroupsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGroupsItemDto createFromParcel(Parcel parcel) {
            return new CatalogGroupsItemDto((UserId) parcel.readParcelable(CatalogGroupsItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CatalogCoordsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (GroupsGroupFriendsDto) parcel.readParcelable(CatalogGroupsItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CatalogBadgeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGroupsItemDto[] newArray(int i) {
            return new CatalogGroupsItemDto[i];
        }
    }

    public CatalogGroupsItemDto(UserId userId, String str, String str2, String str3, CatalogCoordsDto catalogCoordsDto, Float f, Integer num, GroupsGroupFriendsDto groupsGroupFriendsDto, String str4, String str5, CatalogBadgeDto catalogBadgeDto) {
        this.id = userId;
        this.description = str;
        this.city = str2;
        this.subtitle = str3;
        this.coords = catalogCoordsDto;
        this.rating = f;
        this.counter = num;
        this.friends = groupsGroupFriendsDto;
        this.trackCode = str4;
        this.itemSectionId = str5;
        this.badge = catalogBadgeDto;
    }

    public final String d() {
        return this.city;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CatalogCoordsDto e() {
        return this.coords;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogGroupsItemDto)) {
            return false;
        }
        CatalogGroupsItemDto catalogGroupsItemDto = (CatalogGroupsItemDto) obj;
        return epx.f(this.id, catalogGroupsItemDto.id) && epx.f(this.description, catalogGroupsItemDto.description) && epx.f(this.city, catalogGroupsItemDto.city) && epx.f(this.subtitle, catalogGroupsItemDto.subtitle) && epx.f(this.coords, catalogGroupsItemDto.coords) && epx.f(this.rating, catalogGroupsItemDto.rating) && epx.f(this.counter, catalogGroupsItemDto.counter) && epx.f(this.friends, catalogGroupsItemDto.friends) && epx.f(this.trackCode, catalogGroupsItemDto.trackCode) && epx.f(this.itemSectionId, catalogGroupsItemDto.itemSectionId) && epx.f(this.badge, catalogGroupsItemDto.badge);
    }

    public final Integer f() {
        return this.counter;
    }

    public final GroupsGroupFriendsDto g() {
        return this.friends;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CatalogCoordsDto catalogCoordsDto = this.coords;
        int hashCode5 = (hashCode4 + (catalogCoordsDto == null ? 0 : catalogCoordsDto.hashCode())) * 31;
        Float f = this.rating;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.counter;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        GroupsGroupFriendsDto groupsGroupFriendsDto = this.friends;
        int hashCode8 = (hashCode7 + (groupsGroupFriendsDto == null ? 0 : groupsGroupFriendsDto.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemSectionId;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        return hashCode10 + (catalogBadgeDto != null ? catalogBadgeDto.hashCode() : 0);
    }

    public final UserId i() {
        return this.id;
    }

    public final Float j() {
        return this.rating;
    }

    public final String k() {
        return this.subtitle;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "CatalogGroupsItemDto(id=" + this.id + ", description=" + this.description + ", city=" + this.city + ", subtitle=" + this.subtitle + ", coords=" + this.coords + ", rating=" + this.rating + ", counter=" + this.counter + ", friends=" + this.friends + ", trackCode=" + this.trackCode + ", itemSectionId=" + this.itemSectionId + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.description);
        parcel.writeString(this.city);
        parcel.writeString(this.subtitle);
        CatalogCoordsDto catalogCoordsDto = this.coords;
        if (catalogCoordsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogCoordsDto.writeToParcel(parcel, i);
        }
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Integer num = this.counter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.friends, i);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.itemSectionId);
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogGroupsItemDto(UserId userId, String str, String str2, String str3, CatalogCoordsDto catalogCoordsDto, Float f, Integer num, GroupsGroupFriendsDto groupsGroupFriendsDto, String str4, String str5, CatalogBadgeDto catalogBadgeDto, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : catalogCoordsDto, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : groupsGroupFriendsDto, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : catalogBadgeDto);
    }
}
