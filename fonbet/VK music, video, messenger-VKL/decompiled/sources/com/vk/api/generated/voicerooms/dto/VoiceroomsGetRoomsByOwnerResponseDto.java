package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VoiceroomsGetRoomsByOwnerResponseDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsGetRoomsByOwnerResponseDto implements Parcelable {
    public static final Parcelable.Creator<VoiceroomsGetRoomsByOwnerResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VoiceroomsRoomDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: VoiceroomsGetRoomsByOwnerResponseDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsGetRoomsByOwnerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsGetRoomsByOwnerResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(VoiceroomsGetRoomsByOwnerResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VoiceroomsGetRoomsByOwnerResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(VoiceroomsGetRoomsByOwnerResponseDto.class, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new VoiceroomsGetRoomsByOwnerResponseDto(arrayList, readString, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsGetRoomsByOwnerResponseDto[] newArray(int i) {
            return new VoiceroomsGetRoomsByOwnerResponseDto[i];
        }
    }

    public VoiceroomsGetRoomsByOwnerResponseDto() {
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
        if (!(obj instanceof VoiceroomsGetRoomsByOwnerResponseDto)) {
            return false;
        }
        VoiceroomsGetRoomsByOwnerResponseDto voiceroomsGetRoomsByOwnerResponseDto = (VoiceroomsGetRoomsByOwnerResponseDto) obj;
        return epx.f(this.items, voiceroomsGetRoomsByOwnerResponseDto.items) && epx.f(this.nextFrom, voiceroomsGetRoomsByOwnerResponseDto.nextFrom) && epx.f(this.profiles, voiceroomsGetRoomsByOwnerResponseDto.profiles) && epx.f(this.groups, voiceroomsGetRoomsByOwnerResponseDto.groups);
    }

    public final int hashCode() {
        List<VoiceroomsRoomDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceroomsGetRoomsByOwnerResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VoiceroomsRoomDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.nextFrom);
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

    public VoiceroomsGetRoomsByOwnerResponseDto(List<VoiceroomsRoomDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.nextFrom = str;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ VoiceroomsGetRoomsByOwnerResponseDto(List list, String str, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
