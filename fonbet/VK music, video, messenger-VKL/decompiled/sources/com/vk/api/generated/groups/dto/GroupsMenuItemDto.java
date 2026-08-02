package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsMenuItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMenuItemDto> CREATOR = new a();

    @pmi0("counter")
    private final Integer counter;

    @pmi0("cover")
    private final List<BaseImageDto> cover;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final GroupsMenuItemTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMenuItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            GroupsMenuItemTypeDto createFromParcel = GroupsMenuItemTypeDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsMenuItemDto(readString, createFromParcel, readString2, valueOf, arrayList, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMenuItemDto[] newArray(int i) {
            return new GroupsMenuItemDto[i];
        }
    }

    public GroupsMenuItemDto(String str, GroupsMenuItemTypeDto groupsMenuItemTypeDto, String str2, Integer num, List<BaseImageDto> list, Integer num2, Boolean bool) {
        this.title = str;
        this.type = groupsMenuItemTypeDto;
        this.url = str2;
        this.id = num;
        this.cover = list;
        this.counter = num2;
        this.isHidden = bool;
    }

    public final List<BaseImageDto> d() {
        return this.cover;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMenuItemDto)) {
            return false;
        }
        GroupsMenuItemDto groupsMenuItemDto = (GroupsMenuItemDto) obj;
        return epx.f(this.title, groupsMenuItemDto.title) && this.type == groupsMenuItemDto.type && epx.f(this.url, groupsMenuItemDto.url) && epx.f(this.id, groupsMenuItemDto.id) && epx.f(this.cover, groupsMenuItemDto.cover) && epx.f(this.counter, groupsMenuItemDto.counter) && epx.f(this.isHidden, groupsMenuItemDto.isHidden);
    }

    public final GroupsMenuItemTypeDto f() {
        return this.type;
    }

    public final Boolean g() {
        return this.isHidden;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.type.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.url);
        Integer num = this.id;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.cover;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.counter;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isHidden;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsMenuItemDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(", isHidden=");
        return tn.a(sb, this.isHidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.cover;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.counter;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GroupsMenuItemDto(String str, GroupsMenuItemTypeDto groupsMenuItemTypeDto, String str2, Integer num, List list, Integer num2, Boolean bool, int i, zcl zclVar) {
        this(str, groupsMenuItemTypeDto, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool);
    }
}
