package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
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

/* compiled from: MasksGetEffectsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MasksGetEffectsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MasksGetEffectsExtendedResponseDto> CREATOR = new a();

    @pmi0("counters")
    private final List<MasksCounterDto> counters;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MasksEffectDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MasksGetEffectsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MasksGetEffectsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksGetEffectsExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MasksGetEffectsExtendedResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MasksGetEffectsExtendedResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MasksGetEffectsExtendedResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(MasksCounterDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new MasksGetEffectsExtendedResponseDto(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MasksGetEffectsExtendedResponseDto[] newArray(int i) {
            return new MasksGetEffectsExtendedResponseDto[i];
        }
    }

    public MasksGetEffectsExtendedResponseDto() {
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
        if (!(obj instanceof MasksGetEffectsExtendedResponseDto)) {
            return false;
        }
        MasksGetEffectsExtendedResponseDto masksGetEffectsExtendedResponseDto = (MasksGetEffectsExtendedResponseDto) obj;
        return epx.f(this.items, masksGetEffectsExtendedResponseDto.items) && epx.f(this.profiles, masksGetEffectsExtendedResponseDto.profiles) && epx.f(this.groups, masksGetEffectsExtendedResponseDto.groups) && epx.f(this.counters, masksGetEffectsExtendedResponseDto.counters);
    }

    public final int hashCode() {
        List<MasksEffectDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MasksCounterDto> list4 = this.counters;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksGetEffectsExtendedResponseDto(items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", counters=");
        return ms9.a(')', sb, this.counters);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MasksEffectDto> list = this.items;
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
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<MasksCounterDto> list4 = this.counters;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((MasksCounterDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public MasksGetEffectsExtendedResponseDto(List<MasksEffectDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MasksCounterDto> list4) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.counters = list4;
    }

    public /* synthetic */ MasksGetEffectsExtendedResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
