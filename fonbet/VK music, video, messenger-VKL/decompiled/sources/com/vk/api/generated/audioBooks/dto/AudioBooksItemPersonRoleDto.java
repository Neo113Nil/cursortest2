package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioBooksItemPersonRoleDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksItemPersonRoleDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksItemPersonRoleDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    /* compiled from: AudioBooksItemPersonRoleDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksItemPersonRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksItemPersonRoleDto createFromParcel(Parcel parcel) {
            return new AudioBooksItemPersonRoleDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksItemPersonRoleDto[] newArray(int i) {
            return new AudioBooksItemPersonRoleDto[i];
        }
    }

    public AudioBooksItemPersonRoleDto(String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioBooksItemPersonRoleDto) && epx.f(this.id, ((AudioBooksItemPersonRoleDto) obj).id);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AudioBooksItemPersonRoleDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
    }
}
