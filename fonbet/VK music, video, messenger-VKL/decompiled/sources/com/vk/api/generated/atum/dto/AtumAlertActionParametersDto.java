package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AtumAlertActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumAlertActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumAlertActionParametersDto> CREATOR = new a();

    @pmi0("action_title")
    private final String actionTitle;

    @pmi0("message")
    private final String message;

    @pmi0("title")
    private final String title;

    /* compiled from: AtumAlertActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumAlertActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumAlertActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumAlertActionParametersDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumAlertActionParametersDto[] newArray(int i) {
            return new AtumAlertActionParametersDto[i];
        }
    }

    public AtumAlertActionParametersDto(String str, String str2, String str3) {
        this.title = str;
        this.message = str2;
        this.actionTitle = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumAlertActionParametersDto)) {
            return false;
        }
        AtumAlertActionParametersDto atumAlertActionParametersDto = (AtumAlertActionParametersDto) obj;
        return epx.f(this.title, atumAlertActionParametersDto.title) && epx.f(this.message, atumAlertActionParametersDto.message) && epx.f(this.actionTitle, atumAlertActionParametersDto.actionTitle);
    }

    public final int hashCode() {
        return this.actionTitle.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumAlertActionParametersDto(title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", actionTitle=");
        return ho8.a(sb, this.actionTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.actionTitle);
    }
}
