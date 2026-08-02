package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: IdentityPhoneDto.kt */
/* loaded from: classes14.dex */
public final class IdentityPhoneDto implements Parcelable {
    public static final Parcelable.Creator<IdentityPhoneDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("label")
    private final IdentityLabelDto label;

    @pmi0("number")
    private final String number;

    /* compiled from: IdentityPhoneDto.kt */
    public static final class a implements Parcelable.Creator<IdentityPhoneDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityPhoneDto createFromParcel(Parcel parcel) {
            return new IdentityPhoneDto(IdentityLabelDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityPhoneDto[] newArray(int i) {
            return new IdentityPhoneDto[i];
        }
    }

    public IdentityPhoneDto(IdentityLabelDto identityLabelDto, String str, Integer num) {
        this.label = identityLabelDto;
        this.number = str;
        this.id = num;
    }

    public final Integer d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final IdentityLabelDto e() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityPhoneDto)) {
            return false;
        }
        IdentityPhoneDto identityPhoneDto = (IdentityPhoneDto) obj;
        return epx.f(this.label, identityPhoneDto.label) && epx.f(this.number, identityPhoneDto.number) && epx.f(this.id, identityPhoneDto.id);
    }

    public final String f() {
        return this.number;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.label.hashCode() * 31, 31, this.number);
        Integer num = this.id;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityPhoneDto(label=");
        sb.append(this.label);
        sb.append(", number=");
        sb.append(this.number);
        sb.append(", id=");
        return uqi.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.label.writeToParcel(parcel, i);
        parcel.writeString(this.number);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ IdentityPhoneDto(IdentityLabelDto identityLabelDto, String str, Integer num, int i, zcl zclVar) {
        this(identityLabelDto, str, (i & 4) != 0 ? null : num);
    }
}
