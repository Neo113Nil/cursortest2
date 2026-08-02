package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketDeliveryPointWithGroupDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryPointWithGroupDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryPointWithGroupDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final GroupsAddressDto address;

    @pmi0("cash_only")
    private final boolean cashOnly;

    @pmi0("display_title")
    private final String displayTitle;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final int id;

    @pmi0("metro")
    private final DatabaseStationDto metro;

    @pmi0("outpost_only")
    private final boolean outpostOnly;

    @pmi0("placemark")
    private final MarketDeliveryPointPlacemarkDto placemark;

    @pmi0("service_id")
    private final int serviceId;

    /* compiled from: MarketDeliveryPointWithGroupDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryPointWithGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryPointWithGroupDto createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MarketDeliveryPointWithGroupDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                cls = MarketDeliveryPointWithGroupDto.class;
                z = true;
            } else {
                cls = MarketDeliveryPointWithGroupDto.class;
                z = false;
            }
            return new MarketDeliveryPointWithGroupDto(readInt, userId, readString, z, parcel.readInt() != 0, (GroupsAddressDto) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt(), (DatabaseStationDto) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? null : MarketDeliveryPointPlacemarkDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryPointWithGroupDto[] newArray(int i) {
            return new MarketDeliveryPointWithGroupDto[i];
        }
    }

    public MarketDeliveryPointWithGroupDto(int i, UserId userId, String str, boolean z, boolean z2, GroupsAddressDto groupsAddressDto, String str2, int i2, DatabaseStationDto databaseStationDto, MarketDeliveryPointPlacemarkDto marketDeliveryPointPlacemarkDto) {
        this.id = i;
        this.groupId = userId;
        this.externalId = str;
        this.outpostOnly = z;
        this.cashOnly = z2;
        this.address = groupsAddressDto;
        this.displayTitle = str2;
        this.serviceId = i2;
        this.metro = databaseStationDto;
        this.placemark = marketDeliveryPointPlacemarkDto;
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
        if (!(obj instanceof MarketDeliveryPointWithGroupDto)) {
            return false;
        }
        MarketDeliveryPointWithGroupDto marketDeliveryPointWithGroupDto = (MarketDeliveryPointWithGroupDto) obj;
        return this.id == marketDeliveryPointWithGroupDto.id && epx.f(this.groupId, marketDeliveryPointWithGroupDto.groupId) && epx.f(this.externalId, marketDeliveryPointWithGroupDto.externalId) && this.outpostOnly == marketDeliveryPointWithGroupDto.outpostOnly && this.cashOnly == marketDeliveryPointWithGroupDto.cashOnly && epx.f(this.address, marketDeliveryPointWithGroupDto.address) && epx.f(this.displayTitle, marketDeliveryPointWithGroupDto.displayTitle) && this.serviceId == marketDeliveryPointWithGroupDto.serviceId && epx.f(this.metro, marketDeliveryPointWithGroupDto.metro) && epx.f(this.placemark, marketDeliveryPointWithGroupDto.placemark);
    }

    public final String f() {
        return this.externalId;
    }

    public final UserId g() {
        return this.groupId;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.serviceId, urd0.a((this.address.hashCode() + qoy.b(qoy.b(urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.groupId.b), 31, this.externalId), 31, this.outpostOnly), 31, this.cashOnly)) * 31, 31, this.displayTitle), 31);
        DatabaseStationDto databaseStationDto = this.metro;
        int hashCode = (a2 + (databaseStationDto == null ? 0 : databaseStationDto.hashCode())) * 31;
        MarketDeliveryPointPlacemarkDto marketDeliveryPointPlacemarkDto = this.placemark;
        return hashCode + (marketDeliveryPointPlacemarkDto != null ? marketDeliveryPointPlacemarkDto.hashCode() : 0);
    }

    public final MarketDeliveryPointPlacemarkDto i() {
        return this.placemark;
    }

    public final int j() {
        return this.serviceId;
    }

    public final String toString() {
        return "MarketDeliveryPointWithGroupDto(id=" + this.id + ", groupId=" + this.groupId + ", externalId=" + this.externalId + ", outpostOnly=" + this.outpostOnly + ", cashOnly=" + this.cashOnly + ", address=" + this.address + ", displayTitle=" + this.displayTitle + ", serviceId=" + this.serviceId + ", metro=" + this.metro + ", placemark=" + this.placemark + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeString(this.externalId);
        parcel.writeInt(this.outpostOnly ? 1 : 0);
        parcel.writeInt(this.cashOnly ? 1 : 0);
        parcel.writeParcelable(this.address, i);
        parcel.writeString(this.displayTitle);
        parcel.writeInt(this.serviceId);
        parcel.writeParcelable(this.metro, i);
        MarketDeliveryPointPlacemarkDto marketDeliveryPointPlacemarkDto = this.placemark;
        if (marketDeliveryPointPlacemarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryPointPlacemarkDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketDeliveryPointWithGroupDto(int i, UserId userId, String str, boolean z, boolean z2, GroupsAddressDto groupsAddressDto, String str2, int i2, DatabaseStationDto databaseStationDto, MarketDeliveryPointPlacemarkDto marketDeliveryPointPlacemarkDto, int i3, zcl zclVar) {
        this(i, userId, str, z, z2, groupsAddressDto, str2, i2, (i3 & 256) != 0 ? null : databaseStationDto, (i3 & 512) != 0 ? null : marketDeliveryPointPlacemarkDto);
    }
}
