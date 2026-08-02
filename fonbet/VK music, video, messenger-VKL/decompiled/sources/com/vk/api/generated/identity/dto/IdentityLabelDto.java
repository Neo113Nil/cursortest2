package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: IdentityLabelDto.kt */
/* loaded from: classes14.dex */
public final class IdentityLabelDto implements Parcelable {
    public static final Parcelable.Creator<IdentityLabelDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    /* compiled from: IdentityLabelDto.kt */
    public static final class a implements Parcelable.Creator<IdentityLabelDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityLabelDto createFromParcel(Parcel parcel) {
            return new IdentityLabelDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityLabelDto[] newArray(int i) {
            return new IdentityLabelDto[i];
        }
    }

    public IdentityLabelDto(String str, Integer num) {
        this.name = str;
        this.id = num;
    }

    public final Integer d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityLabelDto)) {
            return false;
        }
        IdentityLabelDto identityLabelDto = (IdentityLabelDto) obj;
        return epx.f(this.name, identityLabelDto.name) && epx.f(this.id, identityLabelDto.id);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Integer num = this.id;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityLabelDto(name=");
        sb.append(this.name);
        sb.append(", id=");
        return uqi.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ IdentityLabelDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
