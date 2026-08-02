package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiAnyActionDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiAnyActionDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiAnyActionDto> CREATOR = new a();

    @pmi0("action")
    private final AtumAnyActionDto action;

    /* compiled from: AtumVkuiAnyActionDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiAnyActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiAnyActionDto createFromParcel(Parcel parcel) {
            return new AtumVkuiAnyActionDto((AtumAnyActionDto) parcel.readParcelable(AtumVkuiAnyActionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiAnyActionDto[] newArray(int i) {
            return new AtumVkuiAnyActionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumVkuiAnyActionDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AtumAnyActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumVkuiAnyActionDto) && epx.f(this.action, ((AtumVkuiAnyActionDto) obj).action);
    }

    public final int hashCode() {
        AtumAnyActionDto atumAnyActionDto = this.action;
        if (atumAnyActionDto == null) {
            return 0;
        }
        return atumAnyActionDto.hashCode();
    }

    public final String toString() {
        return "AtumVkuiAnyActionDto(action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
    }

    public AtumVkuiAnyActionDto(AtumAnyActionDto atumAnyActionDto) {
        this.action = atumAnyActionDto;
    }

    public /* synthetic */ AtumVkuiAnyActionDto(AtumAnyActionDto atumAnyActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumAnyActionDto);
    }
}
