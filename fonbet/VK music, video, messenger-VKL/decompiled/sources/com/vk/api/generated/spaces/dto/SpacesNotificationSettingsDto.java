package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.qoy;
import xsna.vu5;

/* compiled from: SpacesNotificationSettingsDto.kt */
/* loaded from: classes15.dex */
public final class SpacesNotificationSettingsDto implements Parcelable {
    public static final Parcelable.Creator<SpacesNotificationSettingsDto> CREATOR = new a();

    @pmi0("entity_version")
    private final long entityVersion;

    @pmi0("mute_till")
    private final int muteTill;

    @pmi0("use_sound")
    private final boolean useSound;

    /* compiled from: SpacesNotificationSettingsDto.kt */
    public static final class a implements Parcelable.Creator<SpacesNotificationSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesNotificationSettingsDto createFromParcel(Parcel parcel) {
            return new SpacesNotificationSettingsDto(parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesNotificationSettingsDto[] newArray(int i) {
            return new SpacesNotificationSettingsDto[i];
        }
    }

    public SpacesNotificationSettingsDto(int i, boolean z, long j) {
        this.muteTill = i;
        this.useSound = z;
        this.entityVersion = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesNotificationSettingsDto)) {
            return false;
        }
        SpacesNotificationSettingsDto spacesNotificationSettingsDto = (SpacesNotificationSettingsDto) obj;
        return this.muteTill == spacesNotificationSettingsDto.muteTill && this.useSound == spacesNotificationSettingsDto.useSound && this.entityVersion == spacesNotificationSettingsDto.entityVersion;
    }

    public final int hashCode() {
        return Long.hashCode(this.entityVersion) + qoy.b(Integer.hashCode(this.muteTill) * 31, 31, this.useSound);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesNotificationSettingsDto(muteTill=");
        sb.append(this.muteTill);
        sb.append(", useSound=");
        sb.append(this.useSound);
        sb.append(", entityVersion=");
        return vu5.a(')', this.entityVersion, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.muteTill);
        parcel.writeInt(this.useSound ? 1 : 0);
        parcel.writeLong(this.entityVersion);
    }
}
