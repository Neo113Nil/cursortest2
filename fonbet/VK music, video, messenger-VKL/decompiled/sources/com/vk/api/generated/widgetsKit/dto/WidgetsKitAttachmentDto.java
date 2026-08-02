package com.vk.api.generated.widgetsKit.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WidgetsKitAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class WidgetsKitAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<WidgetsKitAttachmentDto> CREATOR = new a();

    @pmi0("games")
    private final List<AppsAppDto> games;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final WidgetsKitAttachmentItemDto item;

    @pmi0("mini_apps")
    private final List<AppsAppMinDto> miniApps;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: WidgetsKitAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<WidgetsKitAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final WidgetsKitAttachmentDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            WidgetsKitAttachmentItemDto createFromParcel = WidgetsKitAttachmentItemDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(WidgetsKitAttachmentDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(WidgetsKitAttachmentDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(WidgetsKitAttachmentDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(WidgetsKitAttachmentDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new WidgetsKitAttachmentDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetsKitAttachmentDto[] newArray(int i) {
            return new WidgetsKitAttachmentDto[i];
        }
    }

    public WidgetsKitAttachmentDto(WidgetsKitAttachmentItemDto widgetsKitAttachmentItemDto, List<AppsAppMinDto> list, List<AppsAppDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4) {
        this.item = widgetsKitAttachmentItemDto;
        this.miniApps = list;
        this.games = list2;
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
        if (!(obj instanceof WidgetsKitAttachmentDto)) {
            return false;
        }
        WidgetsKitAttachmentDto widgetsKitAttachmentDto = (WidgetsKitAttachmentDto) obj;
        return epx.f(this.item, widgetsKitAttachmentDto.item) && epx.f(this.miniApps, widgetsKitAttachmentDto.miniApps) && epx.f(this.games, widgetsKitAttachmentDto.games) && epx.f(this.profiles, widgetsKitAttachmentDto.profiles) && epx.f(this.groups, widgetsKitAttachmentDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        List<AppsAppMinDto> list = this.miniApps;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AppsAppDto> list2 = this.games;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupFullDto> list4 = this.groups;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetsKitAttachmentDto(item=");
        sb.append(this.item);
        sb.append(", miniApps=");
        sb.append(this.miniApps);
        sb.append(", games=");
        sb.append(this.games);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.item.writeToParcel(parcel, i);
        List<AppsAppMinDto> list = this.miniApps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<AppsAppDto> list2 = this.games;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<GroupsGroupFullDto> list4 = this.groups;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public /* synthetic */ WidgetsKitAttachmentDto(WidgetsKitAttachmentItemDto widgetsKitAttachmentItemDto, List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(widgetsKitAttachmentItemDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
