package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpacesSettingsDto.kt */
/* loaded from: classes15.dex */
public final class SpacesSettingsDto implements Parcelable {
    public static final Parcelable.Creator<SpacesSettingsDto> CREATOR = new a();

    @pmi0("notification_settings")
    private final SpacesNotificationSettingsDto notificationSettings;

    @pmi0("space_id")
    private final long spaceId;

    /* compiled from: SpacesSettingsDto.kt */
    public static final class a implements Parcelable.Creator<SpacesSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesSettingsDto createFromParcel(Parcel parcel) {
            return new SpacesSettingsDto(parcel.readLong(), parcel.readInt() == 0 ? null : SpacesNotificationSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesSettingsDto[] newArray(int i) {
            return new SpacesSettingsDto[i];
        }
    }

    public SpacesSettingsDto(long j, SpacesNotificationSettingsDto spacesNotificationSettingsDto) {
        this.spaceId = j;
        this.notificationSettings = spacesNotificationSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesSettingsDto)) {
            return false;
        }
        SpacesSettingsDto spacesSettingsDto = (SpacesSettingsDto) obj;
        return this.spaceId == spacesSettingsDto.spaceId && epx.f(this.notificationSettings, spacesSettingsDto.notificationSettings);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.spaceId) * 31;
        SpacesNotificationSettingsDto spacesNotificationSettingsDto = this.notificationSettings;
        return hashCode + (spacesNotificationSettingsDto == null ? 0 : spacesNotificationSettingsDto.hashCode());
    }

    public final String toString() {
        return "SpacesSettingsDto(spaceId=" + this.spaceId + ", notificationSettings=" + this.notificationSettings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spaceId);
        SpacesNotificationSettingsDto spacesNotificationSettingsDto = this.notificationSettings;
        if (spacesNotificationSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacesNotificationSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SpacesSettingsDto(long j, SpacesNotificationSettingsDto spacesNotificationSettingsDto, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : spacesNotificationSettingsDto);
    }
}
