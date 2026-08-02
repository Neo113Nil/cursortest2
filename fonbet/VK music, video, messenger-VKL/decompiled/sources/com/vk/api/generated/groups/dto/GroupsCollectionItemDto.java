package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsCollectionItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCollectionItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCollectionItemDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("explore_position")
    private final Integer explorePosition;

    @pmi0("group_ids")
    private final List<UserId> groupIds;

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("images_card")
    private final List<BaseImageDto> imagesCard;

    @pmi0("images_wide")
    private final List<BaseImageDto> imagesWide;

    @pmi0("link_text")
    private final String linkText;

    @pmi0("match")
    private final Integer match;

    @pmi0("name")
    private final String name;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsCollectionItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCollectionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCollectionItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(GroupsCollectionItemDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(GroupsCollectionItemDto.class, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(GroupsCollectionItemDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(GroupsCollectionItemDto.class, parcel, arrayList6, i, 1);
                }
                arrayList4 = arrayList6;
            }
            return new GroupsCollectionItemDto(readString, readString2, readString3, readString4, readString5, valueOf, arrayList, arrayList2, arrayList3, arrayList4, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCollectionItemDto[] newArray(int i) {
            return new GroupsCollectionItemDto[i];
        }
    }

    public GroupsCollectionItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final Integer d() {
        return this.explorePosition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.groupIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCollectionItemDto)) {
            return false;
        }
        GroupsCollectionItemDto groupsCollectionItemDto = (GroupsCollectionItemDto) obj;
        return epx.f(this.id, groupsCollectionItemDto.id) && epx.f(this.name, groupsCollectionItemDto.name) && epx.f(this.description, groupsCollectionItemDto.description) && epx.f(this.shortDescription, groupsCollectionItemDto.shortDescription) && epx.f(this.url, groupsCollectionItemDto.url) && epx.f(this.match, groupsCollectionItemDto.match) && epx.f(this.images, groupsCollectionItemDto.images) && epx.f(this.imagesWide, groupsCollectionItemDto.imagesWide) && epx.f(this.imagesCard, groupsCollectionItemDto.imagesCard) && epx.f(this.groupIds, groupsCollectionItemDto.groupIds) && epx.f(this.linkText, groupsCollectionItemDto.linkText) && epx.f(this.explorePosition, groupsCollectionItemDto.explorePosition);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final List<BaseImageDto> g() {
        return this.imagesCard;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shortDescription;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.match;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.imagesWide;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BaseImageDto> list3 = this.imagesCard;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UserId> list4 = this.groupIds;
        int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str6 = this.linkText;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.explorePosition;
        return hashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final List<BaseImageDto> i() {
        return this.imagesWide;
    }

    public final String j() {
        return this.linkText;
    }

    public final String k() {
        return this.name;
    }

    public final String l() {
        return this.shortDescription;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCollectionItemDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", shortDescription=");
        sb.append(this.shortDescription);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", match=");
        sb.append(this.match);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", imagesWide=");
        sb.append(this.imagesWide);
        sb.append(", imagesCard=");
        sb.append(this.imagesCard);
        sb.append(", groupIds=");
        sb.append(this.groupIds);
        sb.append(", linkText=");
        sb.append(this.linkText);
        sb.append(", explorePosition=");
        return uqi.b(sb, this.explorePosition, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.shortDescription);
        parcel.writeString(this.url);
        Integer num = this.match;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.imagesWide;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<BaseImageDto> list3 = this.imagesCard;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<UserId> list4 = this.groupIds;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeString(this.linkText);
        Integer num2 = this.explorePosition;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public GroupsCollectionItemDto(String str, String str2, String str3, String str4, String str5, Integer num, List<BaseImageDto> list, List<BaseImageDto> list2, List<BaseImageDto> list3, List<UserId> list4, String str6, Integer num2) {
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.shortDescription = str4;
        this.url = str5;
        this.match = num;
        this.images = list;
        this.imagesWide = list2;
        this.imagesCard = list3;
        this.groupIds = list4;
        this.linkText = str6;
        this.explorePosition = num2;
    }

    public /* synthetic */ GroupsCollectionItemDto(String str, String str2, String str3, String str4, String str5, Integer num, List list, List list2, List list3, List list4, String str6, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : num2);
    }
}
