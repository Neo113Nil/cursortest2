package com.vk.api.generated.explore.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreGetWidgetsTestResponseDto.kt */
/* loaded from: classes14.dex */
public final class ExploreGetWidgetsTestResponseDto implements Parcelable {
    public static final Parcelable.Creator<ExploreGetWidgetsTestResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("mini_apps")
    private final List<AppsAppMinDto> miniApps;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("widgets")
    private final List<ExploreWidgetObjectDto> widgets;

    /* compiled from: ExploreGetWidgetsTestResponseDto.kt */
    public static final class a implements Parcelable.Creator<ExploreGetWidgetsTestResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreGetWidgetsTestResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ExploreWidgetObjectDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ExploreGetWidgetsTestResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(ExploreGetWidgetsTestResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ExploreGetWidgetsTestResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new ExploreGetWidgetsTestResponseDto(arrayList3, arrayList, arrayList2, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreGetWidgetsTestResponseDto[] newArray(int i) {
            return new ExploreGetWidgetsTestResponseDto[i];
        }
    }

    public ExploreGetWidgetsTestResponseDto(List<ExploreWidgetObjectDto> list, List<AppsAppMinDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4) {
        this.widgets = list;
        this.miniApps = list2;
        this.profiles = list3;
        this.groups = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreGetWidgetsTestResponseDto)) {
            return false;
        }
        ExploreGetWidgetsTestResponseDto exploreGetWidgetsTestResponseDto = (ExploreGetWidgetsTestResponseDto) obj;
        return epx.f(this.widgets, exploreGetWidgetsTestResponseDto.widgets) && epx.f(this.miniApps, exploreGetWidgetsTestResponseDto.miniApps) && epx.f(this.profiles, exploreGetWidgetsTestResponseDto.profiles) && epx.f(this.groups, exploreGetWidgetsTestResponseDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.widgets.hashCode() * 31;
        List<AppsAppMinDto> list = this.miniApps;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreGetWidgetsTestResponseDto(widgets=");
        sb.append(this.widgets);
        sb.append(", miniApps=");
        sb.append(this.miniApps);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.widgets);
        while (a2.hasNext()) {
            ((ExploreWidgetObjectDto) a2.next()).writeToParcel(parcel, i);
        }
        List<AppsAppMinDto> list = this.miniApps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public /* synthetic */ ExploreGetWidgetsTestResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
