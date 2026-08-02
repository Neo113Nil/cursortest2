package com.vk.api.generated.storage.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StorageValueDto.kt */
/* loaded from: classes15.dex */
public final class StorageValueDto implements Parcelable {
    public static final Parcelable.Creator<StorageValueDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    /* compiled from: StorageValueDto.kt */
    public static final class a implements Parcelable.Creator<StorageValueDto> {
        @Override // android.os.Parcelable.Creator
        public final StorageValueDto createFromParcel(Parcel parcel) {
            return new StorageValueDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StorageValueDto[] newArray(int i) {
            return new StorageValueDto[i];
        }
    }

    public StorageValueDto(String str, String str2) {
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
        if (!(obj instanceof StorageValueDto)) {
            return false;
        }
        StorageValueDto storageValueDto = (StorageValueDto) obj;
        return epx.f(this.key, storageValueDto.key) && epx.f(this.value, storageValueDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageValueDto(key=");
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
