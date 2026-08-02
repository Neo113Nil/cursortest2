package com.vk.api.generated.status.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.specials.dto.SpecialsPopupDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StatusGetImagePopupResponseDto.kt */
/* loaded from: classes15.dex */
public final class StatusGetImagePopupResponseDto implements Parcelable {
    public static final Parcelable.Creator<StatusGetImagePopupResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("popup")
    private final SpecialsPopupDto popup;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    /* compiled from: StatusGetImagePopupResponseDto.kt */
    public static final class a implements Parcelable.Creator<StatusGetImagePopupResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StatusGetImagePopupResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            SpecialsPopupDto createFromParcel = parcel.readInt() == 0 ? null : SpecialsPopupDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(StatusGetImagePopupResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(StatusGetImagePopupResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new StatusGetImagePopupResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final StatusGetImagePopupResponseDto[] newArray(int i) {
            return new StatusGetImagePopupResponseDto[i];
        }
    }

    public StatusGetImagePopupResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusGetImagePopupResponseDto)) {
            return false;
        }
        StatusGetImagePopupResponseDto statusGetImagePopupResponseDto = (StatusGetImagePopupResponseDto) obj;
        return epx.f(this.popup, statusGetImagePopupResponseDto.popup) && epx.f(this.profiles, statusGetImagePopupResponseDto.profiles) && epx.f(this.groups, statusGetImagePopupResponseDto.groups);
    }

    public final int hashCode() {
        SpecialsPopupDto specialsPopupDto = this.popup;
        int hashCode = (specialsPopupDto == null ? 0 : specialsPopupDto.hashCode()) * 31;
        List<UsersUserDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusGetImagePopupResponseDto(popup=");
        sb.append(this.popup);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SpecialsPopupDto specialsPopupDto = this.popup;
        if (specialsPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsPopupDto.writeToParcel(parcel, i);
        }
        List<UsersUserDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public StatusGetImagePopupResponseDto(SpecialsPopupDto specialsPopupDto, List<UsersUserDto> list, List<GroupsGroupDto> list2) {
        this.popup = specialsPopupDto;
        this.profiles = list;
        this.groups = list2;
    }

    public /* synthetic */ StatusGetImagePopupResponseDto(SpecialsPopupDto specialsPopupDto, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : specialsPopupDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
