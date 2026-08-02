package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: IdentityEmailDto.kt */
/* loaded from: classes14.dex */
public final class IdentityEmailDto implements Parcelable {
    public static final Parcelable.Creator<IdentityEmailDto> CREATOR = new a();

    @pmi0("email")
    private final String email;

    @pmi0("id")
    private final Integer id;

    @pmi0("label")
    private final IdentityLabelDto label;

    /* compiled from: IdentityEmailDto.kt */
    public static final class a implements Parcelable.Creator<IdentityEmailDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityEmailDto createFromParcel(Parcel parcel) {
            return new IdentityEmailDto(parcel.readString(), IdentityLabelDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityEmailDto[] newArray(int i) {
            return new IdentityEmailDto[i];
        }
    }

    public IdentityEmailDto(String str, IdentityLabelDto identityLabelDto, Integer num) {
        this.email = str;
        this.label = identityLabelDto;
        this.id = num;
    }

    public final String d() {
        return this.email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityEmailDto)) {
            return false;
        }
        IdentityEmailDto identityEmailDto = (IdentityEmailDto) obj;
        return epx.f(this.email, identityEmailDto.email) && epx.f(this.label, identityEmailDto.label) && epx.f(this.id, identityEmailDto.id);
    }

    public final IdentityLabelDto f() {
        return this.label;
    }

    public final int hashCode() {
        int hashCode = (this.label.hashCode() + (this.email.hashCode() * 31)) * 31;
        Integer num = this.id;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityEmailDto(email=");
        sb.append(this.email);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", id=");
        return uqi.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.email);
        this.label.writeToParcel(parcel, i);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ IdentityEmailDto(String str, IdentityLabelDto identityLabelDto, Integer num, int i, zcl zclVar) {
        this(str, identityLabelDto, (i & 4) != 0 ? null : num);
    }
}
