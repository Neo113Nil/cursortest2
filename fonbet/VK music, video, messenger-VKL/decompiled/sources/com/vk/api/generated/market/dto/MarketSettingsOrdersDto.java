package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: MarketSettingsOrdersDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsOrdersDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsOrdersDto> CREATOR = new a();

    @pmi0("im_notification")
    private final boolean imNotification;

    @pmi0("notification")
    private final boolean notification;

    @pmi0("push_notification")
    private final boolean pushNotification;

    /* renamed from: receivers, reason: collision with root package name */
    @pmi0("receivers")
    private final MarketNotificationReceiversSettingsDto f74receivers;

    /* compiled from: MarketSettingsOrdersDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsOrdersDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsOrdersDto createFromParcel(Parcel parcel) {
            return new MarketSettingsOrdersDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : MarketNotificationReceiversSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsOrdersDto[] newArray(int i) {
            return new MarketSettingsOrdersDto[i];
        }
    }

    public MarketSettingsOrdersDto(boolean z, boolean z2, boolean z3, MarketNotificationReceiversSettingsDto marketNotificationReceiversSettingsDto) {
        this.notification = z;
        this.pushNotification = z2;
        this.imNotification = z3;
        this.f74receivers = marketNotificationReceiversSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsOrdersDto)) {
            return false;
        }
        MarketSettingsOrdersDto marketSettingsOrdersDto = (MarketSettingsOrdersDto) obj;
        return this.notification == marketSettingsOrdersDto.notification && this.pushNotification == marketSettingsOrdersDto.pushNotification && this.imNotification == marketSettingsOrdersDto.imNotification && epx.f(this.f74receivers, marketSettingsOrdersDto.f74receivers);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.notification) * 31, 31, this.pushNotification), 31, this.imNotification);
        MarketNotificationReceiversSettingsDto marketNotificationReceiversSettingsDto = this.f74receivers;
        return b + (marketNotificationReceiversSettingsDto == null ? 0 : marketNotificationReceiversSettingsDto.hashCode());
    }

    public final String toString() {
        return "MarketSettingsOrdersDto(notification=" + this.notification + ", pushNotification=" + this.pushNotification + ", imNotification=" + this.imNotification + ", receivers=" + this.f74receivers + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.notification ? 1 : 0);
        parcel.writeInt(this.pushNotification ? 1 : 0);
        parcel.writeInt(this.imNotification ? 1 : 0);
        MarketNotificationReceiversSettingsDto marketNotificationReceiversSettingsDto = this.f74receivers;
        if (marketNotificationReceiversSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketNotificationReceiversSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSettingsOrdersDto(boolean z, boolean z2, boolean z3, MarketNotificationReceiversSettingsDto marketNotificationReceiversSettingsDto, int i, zcl zclVar) {
        this(z, z2, z3, (i & 8) != 0 ? null : marketNotificationReceiversSettingsDto);
    }
}
