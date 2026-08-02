package com.vk.api.generated.services.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ServicesCurrencyDto.kt */
/* loaded from: classes15.dex */
public final class ServicesCurrencyDto implements Parcelable {
    public static final Parcelable.Creator<ServicesCurrencyDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: ServicesCurrencyDto.kt */
    public static final class a implements Parcelable.Creator<ServicesCurrencyDto> {
        @Override // android.os.Parcelable.Creator
        public final ServicesCurrencyDto createFromParcel(Parcel parcel) {
            return new ServicesCurrencyDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesCurrencyDto[] newArray(int i) {
            return new ServicesCurrencyDto[i];
        }
    }

    public ServicesCurrencyDto(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesCurrencyDto)) {
            return false;
        }
        ServicesCurrencyDto servicesCurrencyDto = (ServicesCurrencyDto) obj;
        return this.id == servicesCurrencyDto.id && epx.f(this.name, servicesCurrencyDto.name) && epx.f(this.title, servicesCurrencyDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesCurrencyDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
    }
}
