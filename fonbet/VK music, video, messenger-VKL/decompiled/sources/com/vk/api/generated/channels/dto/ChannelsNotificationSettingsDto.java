package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ChannelsNotificationSettingsDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsNotificationSettingsDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsNotificationSettingsDto> CREATOR = new a();

    @pmi0("disable_duration")
    private final Integer disableDuration;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: ChannelsNotificationSettingsDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsNotificationSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsNotificationSettingsDto createFromParcel(Parcel parcel) {
            return new ChannelsNotificationSettingsDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsNotificationSettingsDto[] newArray(int i) {
            return new ChannelsNotificationSettingsDto[i];
        }
    }

    public ChannelsNotificationSettingsDto(boolean z, Integer num) {
        this.isEnabled = z;
        this.disableDuration = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsNotificationSettingsDto)) {
            return false;
        }
        ChannelsNotificationSettingsDto channelsNotificationSettingsDto = (ChannelsNotificationSettingsDto) obj;
        return this.isEnabled == channelsNotificationSettingsDto.isEnabled && epx.f(this.disableDuration, channelsNotificationSettingsDto.disableDuration);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Integer num = this.disableDuration;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsNotificationSettingsDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", disableDuration=");
        return uqi.b(sb, this.disableDuration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Integer num = this.disableDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ChannelsNotificationSettingsDto(boolean z, Integer num, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num);
    }
}
