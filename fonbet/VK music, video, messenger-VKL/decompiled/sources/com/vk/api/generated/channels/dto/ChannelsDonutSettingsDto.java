package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelsDonutSettingsDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsDonutSettingsDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsDonutSettingsDto> CREATOR = new a();

    @pmi0("is_one_time_payments_enabled")
    private final Boolean isOneTimePaymentsEnabled;

    @pmi0("paid_reactions_config")
    private final ChannelsPaidReactionsConfigDto paidReactionsConfig;

    @pmi0("paid_reactions_enabled")
    private final Boolean paidReactionsEnabled;

    /* compiled from: ChannelsDonutSettingsDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsDonutSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsDonutSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChannelsDonutSettingsDto(valueOf, valueOf2, parcel.readInt() != 0 ? ChannelsPaidReactionsConfigDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsDonutSettingsDto[] newArray(int i) {
            return new ChannelsDonutSettingsDto[i];
        }
    }

    public ChannelsDonutSettingsDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.paidReactionsEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isOneTimePaymentsEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsDonutSettingsDto)) {
            return false;
        }
        ChannelsDonutSettingsDto channelsDonutSettingsDto = (ChannelsDonutSettingsDto) obj;
        return epx.f(this.isOneTimePaymentsEnabled, channelsDonutSettingsDto.isOneTimePaymentsEnabled) && epx.f(this.paidReactionsEnabled, channelsDonutSettingsDto.paidReactionsEnabled) && epx.f(this.paidReactionsConfig, channelsDonutSettingsDto.paidReactionsConfig);
    }

    public final int hashCode() {
        Boolean bool = this.isOneTimePaymentsEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.paidReactionsEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ChannelsPaidReactionsConfigDto channelsPaidReactionsConfigDto = this.paidReactionsConfig;
        return hashCode2 + (channelsPaidReactionsConfigDto != null ? channelsPaidReactionsConfigDto.hashCode() : 0);
    }

    public final String toString() {
        return "ChannelsDonutSettingsDto(isOneTimePaymentsEnabled=" + this.isOneTimePaymentsEnabled + ", paidReactionsEnabled=" + this.paidReactionsEnabled + ", paidReactionsConfig=" + this.paidReactionsConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isOneTimePaymentsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.paidReactionsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        ChannelsPaidReactionsConfigDto channelsPaidReactionsConfigDto = this.paidReactionsConfig;
        if (channelsPaidReactionsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsPaidReactionsConfigDto.writeToParcel(parcel, i);
        }
    }

    public ChannelsDonutSettingsDto(Boolean bool, Boolean bool2, ChannelsPaidReactionsConfigDto channelsPaidReactionsConfigDto) {
        this.isOneTimePaymentsEnabled = bool;
        this.paidReactionsEnabled = bool2;
        this.paidReactionsConfig = channelsPaidReactionsConfigDto;
    }

    public /* synthetic */ ChannelsDonutSettingsDto(Boolean bool, Boolean bool2, ChannelsPaidReactionsConfigDto channelsPaidReactionsConfigDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : channelsPaidReactionsConfigDto);
    }
}
