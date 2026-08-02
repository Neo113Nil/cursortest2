package com.vk.api.generated.tabbar.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
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

/* compiled from: TabbarGetSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class TabbarGetSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<TabbarGetSettingsResponseDto> CREATOR = new a();

    @pmi0("animation_switch_empty")
    private final String animationSwitchEmpty;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<TabbarItemDto> items;

    /* compiled from: TabbarGetSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<TabbarGetSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final TabbarGetSettingsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(TabbarItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(TabbarGetSettingsResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new TabbarGetSettingsResponseDto(readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarGetSettingsResponseDto[] newArray(int i) {
            return new TabbarGetSettingsResponseDto[i];
        }
    }

    public TabbarGetSettingsResponseDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.animationSwitchEmpty;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<TabbarItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabbarGetSettingsResponseDto)) {
            return false;
        }
        TabbarGetSettingsResponseDto tabbarGetSettingsResponseDto = (TabbarGetSettingsResponseDto) obj;
        return epx.f(this.animationSwitchEmpty, tabbarGetSettingsResponseDto.animationSwitchEmpty) && epx.f(this.items, tabbarGetSettingsResponseDto.items) && epx.f(this.groups, tabbarGetSettingsResponseDto.groups);
    }

    public final int hashCode() {
        String str = this.animationSwitchEmpty;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TabbarItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarGetSettingsResponseDto(animationSwitchEmpty=");
        sb.append(this.animationSwitchEmpty);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.animationSwitchEmpty);
        List<TabbarItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((TabbarItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public TabbarGetSettingsResponseDto(String str, List<TabbarItemDto> list, List<GroupsGroupFullDto> list2) {
        this.animationSwitchEmpty = str;
        this.items = list;
        this.groups = list2;
    }

    public /* synthetic */ TabbarGetSettingsResponseDto(String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
