package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsSectionItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsSectionItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsSectionItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: AppsSectionItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsSectionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSectionItemDto createFromParcel(Parcel parcel) {
            return new AppsSectionItemDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSectionItemDto[] newArray(int i) {
            return new AppsSectionItemDto[i];
        }
    }

    public AppsSectionItemDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsSectionItemDto)) {
            return false;
        }
        AppsSectionItemDto appsSectionItemDto = (AppsSectionItemDto) obj;
        return this.id == appsSectionItemDto.id && epx.f(this.name, appsSectionItemDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsSectionItemDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
}
