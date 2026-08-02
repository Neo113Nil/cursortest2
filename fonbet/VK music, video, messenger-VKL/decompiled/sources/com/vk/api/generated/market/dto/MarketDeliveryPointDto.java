package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketDeliveryPointDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryPointDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryPointDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final GroupsAddressDto address;

    @pmi0("cash_only")
    private final boolean cashOnly;

    @pmi0("display_title")
    private final String displayTitle;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("id")
    private final int id;

    @pmi0("metro")
    private final DatabaseStationDto metro;

    @pmi0("outpost_only")
    private final boolean outpostOnly;

    @pmi0("service_id")
    private final int serviceId;

    /* compiled from: MarketDeliveryPointDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryPointDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryPointDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryPointDto(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (GroupsAddressDto) parcel.readParcelable(MarketDeliveryPointDto.class.getClassLoader()), parcel.readString(), parcel.readInt(), (DatabaseStationDto) parcel.readParcelable(MarketDeliveryPointDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryPointDto[] newArray(int i) {
            return new MarketDeliveryPointDto[i];
        }
    }

    public MarketDeliveryPointDto(int i, String str, boolean z, boolean z2, GroupsAddressDto groupsAddressDto, String str2, int i2, DatabaseStationDto databaseStationDto) {
        this.id = i;
        this.externalId = str;
        this.outpostOnly = z;
        this.cashOnly = z2;
        this.address = groupsAddressDto;
        this.displayTitle = str2;
        this.serviceId = i2;
        this.metro = databaseStationDto;
    }

    public final GroupsAddressDto d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.displayTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryPointDto)) {
            return false;
        }
        MarketDeliveryPointDto marketDeliveryPointDto = (MarketDeliveryPointDto) obj;
        return this.id == marketDeliveryPointDto.id && epx.f(this.externalId, marketDeliveryPointDto.externalId) && this.outpostOnly == marketDeliveryPointDto.outpostOnly && this.cashOnly == marketDeliveryPointDto.cashOnly && epx.f(this.address, marketDeliveryPointDto.address) && epx.f(this.displayTitle, marketDeliveryPointDto.displayTitle) && this.serviceId == marketDeliveryPointDto.serviceId && epx.f(this.metro, marketDeliveryPointDto.metro);
    }

    public final String f() {
        return this.externalId;
    }

    public final int g() {
        return this.serviceId;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.serviceId, urd0.a((this.address.hashCode() + qoy.b(qoy.b(urd0.a(Integer.hashCode(this.id) * 31, 31, this.externalId), 31, this.outpostOnly), 31, this.cashOnly)) * 31, 31, this.displayTitle), 31);
        DatabaseStationDto databaseStationDto = this.metro;
        return a2 + (databaseStationDto == null ? 0 : databaseStationDto.hashCode());
    }

    public final String toString() {
        return "MarketDeliveryPointDto(id=" + this.id + ", externalId=" + this.externalId + ", outpostOnly=" + this.outpostOnly + ", cashOnly=" + this.cashOnly + ", address=" + this.address + ", displayTitle=" + this.displayTitle + ", serviceId=" + this.serviceId + ", metro=" + this.metro + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.externalId);
        parcel.writeInt(this.outpostOnly ? 1 : 0);
        parcel.writeInt(this.cashOnly ? 1 : 0);
        parcel.writeParcelable(this.address, i);
        parcel.writeString(this.displayTitle);
        parcel.writeInt(this.serviceId);
        parcel.writeParcelable(this.metro, i);
    }

    public /* synthetic */ MarketDeliveryPointDto(int i, String str, boolean z, boolean z2, GroupsAddressDto groupsAddressDto, String str2, int i2, DatabaseStationDto databaseStationDto, int i3, zcl zclVar) {
        this(i, str, z, z2, groupsAddressDto, str2, i2, (i3 & 128) != 0 ? null : databaseStationDto);
    }
}
