package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FavePageDto.kt */
/* loaded from: classes14.dex */
public final class FavePageDto implements Parcelable {
    public static final Parcelable.Creator<FavePageDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("tags")
    private final List<FaveTagDto> tags;

    @pmi0("type")
    private final FavePageTypeDto type;

    @pmi0("updated_date")
    private final Integer updatedDate;

    @pmi0("user")
    private final UsersUserFullDto user;

    /* compiled from: FavePageDto.kt */
    public static final class a implements Parcelable.Creator<FavePageDto> {
        @Override // android.os.Parcelable.Creator
        public final FavePageDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(FaveTagDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new FavePageDto(readString, arrayList, FavePageTypeDto.CREATOR.createFromParcel(parcel), (GroupsGroupFullDto) parcel.readParcelable(FavePageDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UsersUserFullDto) parcel.readParcelable(FavePageDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FavePageDto[] newArray(int i) {
            return new FavePageDto[i];
        }
    }

    public FavePageDto(String str, List<FaveTagDto> list, FavePageTypeDto favePageTypeDto, GroupsGroupFullDto groupsGroupFullDto, Integer num, UsersUserFullDto usersUserFullDto) {
        this.description = str;
        this.tags = list;
        this.type = favePageTypeDto;
        this.group = groupsGroupFullDto;
        this.updatedDate = num;
        this.user = usersUserFullDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavePageDto)) {
            return false;
        }
        FavePageDto favePageDto = (FavePageDto) obj;
        return epx.f(this.description, favePageDto.description) && epx.f(this.tags, favePageDto.tags) && this.type == favePageDto.type && epx.f(this.group, favePageDto.group) && epx.f(this.updatedDate, favePageDto.updatedDate) && epx.f(this.user, favePageDto.user);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + fw3.a(this.description.hashCode() * 31, 31, this.tags)) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode2 = (hashCode + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        Integer num = this.updatedDate;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.user;
        return hashCode3 + (usersUserFullDto != null ? usersUserFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "FavePageDto(description=" + this.description + ", tags=" + this.tags + ", type=" + this.type + ", group=" + this.group + ", updatedDate=" + this.updatedDate + ", user=" + this.user + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.tags);
        while (a2.hasNext()) {
            ((FaveTagDto) a2.next()).writeToParcel(parcel, i);
        }
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.group, i);
        Integer num = this.updatedDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.user, i);
    }

    public /* synthetic */ FavePageDto(String str, List list, FavePageTypeDto favePageTypeDto, GroupsGroupFullDto groupsGroupFullDto, Integer num, UsersUserFullDto usersUserFullDto, int i, zcl zclVar) {
        this(str, list, favePageTypeDto, (i & 8) != 0 ? null : groupsGroupFullDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : usersUserFullDto);
    }
}
