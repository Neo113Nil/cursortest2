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
import xsna.zcl;

/* compiled from: GroupsAppButtonDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAppButtonDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAppButtonDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("app_module")
    private final GroupsAppModuleDto appModule;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsAppButtonDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAppButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAppButtonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsAppButtonDto(readString, valueOf, arrayList, parcel.readInt() != 0 ? GroupsAppModuleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAppButtonDto[] newArray(int i) {
            return new GroupsAppButtonDto[i];
        }
    }

    public GroupsAppButtonDto() {
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
        if (!(obj instanceof GroupsAppButtonDto)) {
            return false;
        }
        GroupsAppButtonDto groupsAppButtonDto = (GroupsAppButtonDto) obj;
        return epx.f(this.title, groupsAppButtonDto.title) && epx.f(this.appId, groupsAppButtonDto.appId) && epx.f(this.images, groupsAppButtonDto.images) && epx.f(this.appModule, groupsAppButtonDto.appModule);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.appId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsAppModuleDto groupsAppModuleDto = this.appModule;
        return hashCode3 + (groupsAppModuleDto != null ? groupsAppModuleDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsAppButtonDto(title=" + this.title + ", appId=" + this.appId + ", images=" + this.images + ", appModule=" + this.appModule + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Integer num = this.appId;
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
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GroupsAppModuleDto groupsAppModuleDto = this.appModule;
        if (groupsAppModuleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAppModuleDto.writeToParcel(parcel, i);
        }
    }

    public GroupsAppButtonDto(String str, Integer num, List<BaseImageDto> list, GroupsAppModuleDto groupsAppModuleDto) {
        this.title = str;
        this.appId = num;
        this.images = list;
        this.appModule = groupsAppModuleDto;
    }

    public /* synthetic */ GroupsAppButtonDto(String str, Integer num, List list, GroupsAppModuleDto groupsAppModuleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : groupsAppModuleDto);
    }
}
