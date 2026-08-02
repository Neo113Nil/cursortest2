package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AudioAudioPermissionsDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioPermissionsDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioPermissionsDto> CREATOR = new a();

    @pmi0("edit")
    private final Boolean edit;

    /* compiled from: AudioAudioPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioPermissionsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioAudioPermissionsDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioPermissionsDto[] newArray(int i) {
            return new AudioAudioPermissionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioAudioPermissionsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioAudioPermissionsDto) && epx.f(this.edit, ((AudioAudioPermissionsDto) obj).edit);
    }

    public final int hashCode() {
        Boolean bool = this.edit;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("AudioAudioPermissionsDto(edit="), this.edit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.edit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AudioAudioPermissionsDto(Boolean bool) {
        this.edit = bool;
    }

    public /* synthetic */ AudioAudioPermissionsDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
