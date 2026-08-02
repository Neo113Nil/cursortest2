package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SpacesSectionDto.kt */
/* loaded from: classes15.dex */
public final class SpacesSectionDto implements Parcelable {
    public static final Parcelable.Creator<SpacesSectionDto> CREATOR = new a();

    @pmi0("entity_version")
    private final int entityVersion;

    @pmi0("id")
    private final long id;

    @pmi0("is_service")
    private final Boolean isService;

    @pmi0("name")
    private final String name;

    @pmi0(X3.i.L)
    private final String position;

    /* compiled from: SpacesSectionDto.kt */
    public static final class a implements Parcelable.Creator<SpacesSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesSectionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SpacesSectionDto(readLong, readString, readInt, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesSectionDto[] newArray(int i) {
            return new SpacesSectionDto[i];
        }
    }

    public SpacesSectionDto(long j, String str, int i, String str2, Boolean bool) {
        this.id = j;
        this.name = str;
        this.entityVersion = i;
        this.position = str2;
        this.isService = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesSectionDto)) {
            return false;
        }
        SpacesSectionDto spacesSectionDto = (SpacesSectionDto) obj;
        return this.id == spacesSectionDto.id && epx.f(this.name, spacesSectionDto.name) && this.entityVersion == spacesSectionDto.entityVersion && epx.f(this.position, spacesSectionDto.position) && epx.f(this.isService, spacesSectionDto.isService);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.entityVersion, urd0.a(Long.hashCode(this.id) * 31, 31, this.name), 31), 31, this.position);
        Boolean bool = this.isService;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesSectionDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", entityVersion=");
        sb.append(this.entityVersion);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", isService=");
        return tn.a(sb, this.isService, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.entityVersion);
        parcel.writeString(this.position);
        Boolean bool = this.isService;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ SpacesSectionDto(long j, String str, int i, String str2, Boolean bool, int i2, zcl zclVar) {
        this(j, str, i, str2, (i2 & 16) != 0 ? null : bool);
    }
}
