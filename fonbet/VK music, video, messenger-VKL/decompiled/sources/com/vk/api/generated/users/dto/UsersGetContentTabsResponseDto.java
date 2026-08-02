package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersGetContentTabsResponseDto.kt */
/* loaded from: classes15.dex */
public final class UsersGetContentTabsResponseDto implements Parcelable {
    public static final Parcelable.Creator<UsersGetContentTabsResponseDto> CREATOR = new a();

    @pmi0("pinned_tab")
    private final UsersContentTabDto pinnedTab;

    @pmi0("tabs")
    private final List<UsersContentTabDto> tabs;

    @pmi0("tabs_settings")
    private final List<UsersTabSettingsDto> tabsSettings;

    /* compiled from: UsersGetContentTabsResponseDto.kt */
    public static final class a implements Parcelable.Creator<UsersGetContentTabsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGetContentTabsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(UsersContentTabDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            UsersContentTabDto createFromParcel = parcel.readInt() == 0 ? null : UsersContentTabDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(UsersTabSettingsDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new UsersGetContentTabsResponseDto(arrayList, createFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGetContentTabsResponseDto[] newArray(int i) {
            return new UsersGetContentTabsResponseDto[i];
        }
    }

    public UsersGetContentTabsResponseDto() {
        this(null, null, null, 7, null);
    }

    public final List<UsersTabSettingsDto> d() {
        return this.tabsSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetContentTabsResponseDto)) {
            return false;
        }
        UsersGetContentTabsResponseDto usersGetContentTabsResponseDto = (UsersGetContentTabsResponseDto) obj;
        return epx.f(this.tabs, usersGetContentTabsResponseDto.tabs) && this.pinnedTab == usersGetContentTabsResponseDto.pinnedTab && epx.f(this.tabsSettings, usersGetContentTabsResponseDto.tabsSettings);
    }

    public final int hashCode() {
        List<UsersContentTabDto> list = this.tabs;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        UsersContentTabDto usersContentTabDto = this.pinnedTab;
        int hashCode2 = (hashCode + (usersContentTabDto == null ? 0 : usersContentTabDto.hashCode())) * 31;
        List<UsersTabSettingsDto> list2 = this.tabsSettings;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersGetContentTabsResponseDto(tabs=");
        sb.append(this.tabs);
        sb.append(", pinnedTab=");
        sb.append(this.pinnedTab);
        sb.append(", tabsSettings=");
        return ms9.a(')', sb, this.tabsSettings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<UsersContentTabDto> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((UsersContentTabDto) f.next()).writeToParcel(parcel, i);
            }
        }
        UsersContentTabDto usersContentTabDto = this.pinnedTab;
        if (usersContentTabDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersContentTabDto.writeToParcel(parcel, i);
        }
        List<UsersTabSettingsDto> list2 = this.tabsSettings;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((UsersTabSettingsDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersGetContentTabsResponseDto(List<? extends UsersContentTabDto> list, UsersContentTabDto usersContentTabDto, List<UsersTabSettingsDto> list2) {
        this.tabs = list;
        this.pinnedTab = usersContentTabDto;
        this.tabsSettings = list2;
    }

    public /* synthetic */ UsersGetContentTabsResponseDto(List list, UsersContentTabDto usersContentTabDto, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : usersContentTabDto, (i & 4) != 0 ? null : list2);
    }
}
