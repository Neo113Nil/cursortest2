package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SuperAppAccessibilityLabelDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppAccessibilityLabelDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppAccessibilityLabelDto> CREATOR = new a();

    @pmi0("lang")
    private final String lang;

    @pmi0("value")
    private final String value;

    /* compiled from: SuperAppAccessibilityLabelDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppAccessibilityLabelDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppAccessibilityLabelDto createFromParcel(Parcel parcel) {
            return new SuperAppAccessibilityLabelDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppAccessibilityLabelDto[] newArray(int i) {
            return new SuperAppAccessibilityLabelDto[i];
        }
    }

    public SuperAppAccessibilityLabelDto(String str, String str2) {
        this.value = str;
        this.lang = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppAccessibilityLabelDto)) {
            return false;
        }
        SuperAppAccessibilityLabelDto superAppAccessibilityLabelDto = (SuperAppAccessibilityLabelDto) obj;
        return epx.f(this.value, superAppAccessibilityLabelDto.value) && epx.f(this.lang, superAppAccessibilityLabelDto.lang);
    }

    public final int hashCode() {
        return this.lang.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppAccessibilityLabelDto(value=");
        sb.append(this.value);
        sb.append(", lang=");
        return ho8.a(sb, this.lang, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        parcel.writeString(this.lang);
    }
}
