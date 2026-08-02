package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: OwnersContentTabBaseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabBaseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabBaseDto> CREATOR = new a();

    @pmi0("can_add")
    private final Boolean canAdd;

    @pmi0("can_move_to_section")
    private final Boolean canMoveToSection;

    @pmi0("content_types")
    private final List<String> contentTypes;

    /* compiled from: OwnersContentTabBaseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabBaseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabBaseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OwnersContentTabBaseDto(createStringArrayList, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabBaseDto[] newArray(int i) {
            return new OwnersContentTabBaseDto[i];
        }
    }

    public OwnersContentTabBaseDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.canAdd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canMoveToSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersContentTabBaseDto)) {
            return false;
        }
        OwnersContentTabBaseDto ownersContentTabBaseDto = (OwnersContentTabBaseDto) obj;
        return epx.f(this.contentTypes, ownersContentTabBaseDto.contentTypes) && epx.f(this.canAdd, ownersContentTabBaseDto.canAdd) && epx.f(this.canMoveToSection, ownersContentTabBaseDto.canMoveToSection);
    }

    public final List<String> f() {
        return this.contentTypes;
    }

    public final int hashCode() {
        List<String> list = this.contentTypes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.canAdd;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canMoveToSection;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersContentTabBaseDto(contentTypes=");
        sb.append(this.contentTypes);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", canMoveToSection=");
        return tn.a(sb, this.canMoveToSection, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.contentTypes);
        Boolean bool = this.canAdd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canMoveToSection;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public OwnersContentTabBaseDto(List<String> list, Boolean bool, Boolean bool2) {
        this.contentTypes = list;
        this.canAdd = bool;
        this.canMoveToSection = bool2;
    }

    public /* synthetic */ OwnersContentTabBaseDto(List list, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
