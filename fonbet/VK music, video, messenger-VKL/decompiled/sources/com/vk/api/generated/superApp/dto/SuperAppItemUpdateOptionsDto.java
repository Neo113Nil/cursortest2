package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SuperAppItemUpdateOptionsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppItemUpdateOptionsDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppItemUpdateOptionsDto> CREATOR = new a();

    @pmi0("ttl")
    private final Integer ttl;

    @pmi0("update_on_close")
    private final Boolean updateOnClose;

    @pmi0("update_on_open")
    private final Boolean updateOnOpen;

    /* compiled from: SuperAppItemUpdateOptionsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppItemUpdateOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppItemUpdateOptionsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppItemUpdateOptionsDto(valueOf, valueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppItemUpdateOptionsDto[] newArray(int i) {
            return new SuperAppItemUpdateOptionsDto[i];
        }
    }

    public SuperAppItemUpdateOptionsDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.ttl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.updateOnClose;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppItemUpdateOptionsDto)) {
            return false;
        }
        SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto = (SuperAppItemUpdateOptionsDto) obj;
        return epx.f(this.updateOnClose, superAppItemUpdateOptionsDto.updateOnClose) && epx.f(this.updateOnOpen, superAppItemUpdateOptionsDto.updateOnOpen) && epx.f(this.ttl, superAppItemUpdateOptionsDto.ttl);
    }

    public final int hashCode() {
        Boolean bool = this.updateOnClose;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.updateOnOpen;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.ttl;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppItemUpdateOptionsDto(updateOnClose=");
        sb.append(this.updateOnClose);
        sb.append(", updateOnOpen=");
        sb.append(this.updateOnOpen);
        sb.append(", ttl=");
        return uqi.b(sb, this.ttl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.updateOnClose;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.updateOnOpen;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.ttl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public SuperAppItemUpdateOptionsDto(Boolean bool, Boolean bool2, Integer num) {
        this.updateOnClose = bool;
        this.updateOnOpen = bool2;
        this.ttl = num;
    }

    public /* synthetic */ SuperAppItemUpdateOptionsDto(Boolean bool, Boolean bool2, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num);
    }
}
