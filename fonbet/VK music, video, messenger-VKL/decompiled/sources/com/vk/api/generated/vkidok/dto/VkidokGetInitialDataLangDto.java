package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VkidokGetInitialDataLangDto.kt */
/* loaded from: classes15.dex */
public final class VkidokGetInitialDataLangDto implements Parcelable {
    public static final Parcelable.Creator<VkidokGetInitialDataLangDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    /* compiled from: VkidokGetInitialDataLangDto.kt */
    public static final class a implements Parcelable.Creator<VkidokGetInitialDataLangDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokGetInitialDataLangDto createFromParcel(Parcel parcel) {
            return new VkidokGetInitialDataLangDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokGetInitialDataLangDto[] newArray(int i) {
            return new VkidokGetInitialDataLangDto[i];
        }
    }

    public VkidokGetInitialDataLangDto(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokGetInitialDataLangDto)) {
            return false;
        }
        VkidokGetInitialDataLangDto vkidokGetInitialDataLangDto = (VkidokGetInitialDataLangDto) obj;
        return epx.f(this.key, vkidokGetInitialDataLangDto.key) && epx.f(this.value, vkidokGetInitialDataLangDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokGetInitialDataLangDto(key=");
        sb.append(this.key);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
