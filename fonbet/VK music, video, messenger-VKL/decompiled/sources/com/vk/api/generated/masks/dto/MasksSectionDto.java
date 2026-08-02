package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MasksSectionDto.kt */
/* loaded from: classes15.dex */
public final class MasksSectionDto implements Parcelable {
    public static final Parcelable.Creator<MasksSectionDto> CREATOR = new a();

    @pmi0("has_new")
    private final boolean hasNew;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: MasksSectionDto.kt */
    public static final class a implements Parcelable.Creator<MasksSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksSectionDto createFromParcel(Parcel parcel) {
            return new MasksSectionDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MasksSectionDto[] newArray(int i) {
            return new MasksSectionDto[i];
        }
    }

    public MasksSectionDto(int i, String str, String str2, boolean z) {
        this.id = i;
        this.icon = str;
        this.name = str2;
        this.hasNew = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksSectionDto)) {
            return false;
        }
        MasksSectionDto masksSectionDto = (MasksSectionDto) obj;
        return this.id == masksSectionDto.id && epx.f(this.icon, masksSectionDto.icon) && epx.f(this.name, masksSectionDto.name) && this.hasNew == masksSectionDto.hasNew;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasNew) + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.icon), 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksSectionDto(id=");
        sb.append(this.id);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", hasNew=");
        return q0.a(sb, this.hasNew, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.icon);
        parcel.writeString(this.name);
        parcel.writeInt(this.hasNew ? 1 : 0);
    }
}
