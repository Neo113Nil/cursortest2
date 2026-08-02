package com.vk.api.generated.narratives.dto;

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

/* compiled from: NarrativesEditResponseDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesEditResponseDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesEditResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("narrative")
    private final NarrativesNarrativeDto narrative;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: NarrativesEditResponseDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesEditResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesEditResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            NarrativesNarrativeDto narrativesNarrativeDto = (NarrativesNarrativeDto) parcel.readParcelable(NarrativesEditResponseDto.class.getClassLoader());
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(NarrativesEditResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(NarrativesEditResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new NarrativesEditResponseDto(narrativesNarrativeDto, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesEditResponseDto[] newArray(int i) {
            return new NarrativesEditResponseDto[i];
        }
    }

    public NarrativesEditResponseDto(NarrativesNarrativeDto narrativesNarrativeDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.narrative = narrativesNarrativeDto;
        this.profiles = list;
        this.groups = list2;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NarrativesNarrativeDto e() {
        return this.narrative;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NarrativesEditResponseDto)) {
            return false;
        }
        NarrativesEditResponseDto narrativesEditResponseDto = (NarrativesEditResponseDto) obj;
        return epx.f(this.narrative, narrativesEditResponseDto.narrative) && epx.f(this.profiles, narrativesEditResponseDto.profiles) && epx.f(this.groups, narrativesEditResponseDto.groups);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int hashCode() {
        int hashCode = this.narrative.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NarrativesEditResponseDto(narrative=");
        sb.append(this.narrative);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.narrative, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
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

    public /* synthetic */ NarrativesEditResponseDto(NarrativesNarrativeDto narrativesNarrativeDto, List list, List list2, int i, zcl zclVar) {
        this(narrativesNarrativeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
