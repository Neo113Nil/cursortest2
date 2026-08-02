package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GroupsGetContentTabsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetContentTabsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetContentTabsResponseDto> CREATOR = new a();

    @pmi0("tabs")
    private final List<String> tabs;

    /* compiled from: GroupsGetContentTabsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetContentTabsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetContentTabsResponseDto createFromParcel(Parcel parcel) {
            return new GroupsGetContentTabsResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetContentTabsResponseDto[] newArray(int i) {
            return new GroupsGetContentTabsResponseDto[i];
        }
    }

    public GroupsGetContentTabsResponseDto(List<String> list) {
        this.tabs = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsGetContentTabsResponseDto) && epx.f(this.tabs, ((GroupsGetContentTabsResponseDto) obj).tabs);
    }

    public final int hashCode() {
        return this.tabs.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("GroupsGetContentTabsResponseDto(tabs="), this.tabs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.tabs);
    }
}
