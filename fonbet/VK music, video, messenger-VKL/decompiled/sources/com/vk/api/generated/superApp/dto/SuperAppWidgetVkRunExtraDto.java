package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SuperAppWidgetVkRunExtraDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetVkRunExtraDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetVkRunExtraDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("main_text")
    private final String mainText;

    /* compiled from: SuperAppWidgetVkRunExtraDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetVkRunExtraDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkRunExtraDto createFromParcel(Parcel parcel) {
            return new SuperAppWidgetVkRunExtraDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkRunExtraDto[] newArray(int i) {
            return new SuperAppWidgetVkRunExtraDto[i];
        }
    }

    public SuperAppWidgetVkRunExtraDto(String str, String str2) {
        this.mainText = str;
        this.buttonText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetVkRunExtraDto)) {
            return false;
        }
        SuperAppWidgetVkRunExtraDto superAppWidgetVkRunExtraDto = (SuperAppWidgetVkRunExtraDto) obj;
        return epx.f(this.mainText, superAppWidgetVkRunExtraDto.mainText) && epx.f(this.buttonText, superAppWidgetVkRunExtraDto.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + (this.mainText.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetVkRunExtraDto(mainText=");
        sb.append(this.mainText);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mainText);
        parcel.writeString(this.buttonText);
    }
}
