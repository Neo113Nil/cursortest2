package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: DonutGoalDonInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutGoalDonInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutGoalDonInfoDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: DonutGoalDonInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutGoalDonInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGoalDonInfoDto createFromParcel(Parcel parcel) {
            return new DonutGoalDonInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGoalDonInfoDto[] newArray(int i) {
            return new DonutGoalDonInfoDto[i];
        }
    }

    public DonutGoalDonInfoDto(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGoalDonInfoDto)) {
            return false;
        }
        DonutGoalDonInfoDto donutGoalDonInfoDto = (DonutGoalDonInfoDto) obj;
        return epx.f(this.title, donutGoalDonInfoDto.title) && epx.f(this.description, donutGoalDonInfoDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGoalDonInfoDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
