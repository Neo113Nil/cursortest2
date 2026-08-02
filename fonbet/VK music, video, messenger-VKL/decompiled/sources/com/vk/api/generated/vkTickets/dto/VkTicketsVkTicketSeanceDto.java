package com.vk.api.generated.vkTickets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkTicketsVkTicketSeanceDto.kt */
/* loaded from: classes15.dex */
public final class VkTicketsVkTicketSeanceDto implements Parcelable {
    public static final Parcelable.Creator<VkTicketsVkTicketSeanceDto> CREATOR = new a();

    @pmi0("city")
    private final String city;

    @pmi0("city_alias")
    private final String cityAlias;

    @pmi0("date")
    private final String date;

    @pmi0("id")
    private final String id;

    /* compiled from: VkTicketsVkTicketSeanceDto.kt */
    public static final class a implements Parcelable.Creator<VkTicketsVkTicketSeanceDto> {
        @Override // android.os.Parcelable.Creator
        public final VkTicketsVkTicketSeanceDto createFromParcel(Parcel parcel) {
            return new VkTicketsVkTicketSeanceDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkTicketsVkTicketSeanceDto[] newArray(int i) {
            return new VkTicketsVkTicketSeanceDto[i];
        }
    }

    public VkTicketsVkTicketSeanceDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.city;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.cityAlias;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkTicketsVkTicketSeanceDto)) {
            return false;
        }
        VkTicketsVkTicketSeanceDto vkTicketsVkTicketSeanceDto = (VkTicketsVkTicketSeanceDto) obj;
        return epx.f(this.id, vkTicketsVkTicketSeanceDto.id) && epx.f(this.city, vkTicketsVkTicketSeanceDto.city) && epx.f(this.cityAlias, vkTicketsVkTicketSeanceDto.cityAlias) && epx.f(this.date, vkTicketsVkTicketSeanceDto.date);
    }

    public final String f() {
        return this.date;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cityAlias;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.date;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkTicketsVkTicketSeanceDto(id=");
        sb.append(this.id);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", cityAlias=");
        sb.append(this.cityAlias);
        sb.append(", date=");
        return ho8.a(sb, this.date, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.city);
        parcel.writeString(this.cityAlias);
        parcel.writeString(this.date);
    }

    public VkTicketsVkTicketSeanceDto(String str, String str2, String str3, String str4) {
        this.id = str;
        this.city = str2;
        this.cityAlias = str3;
        this.date = str4;
    }

    public /* synthetic */ VkTicketsVkTicketSeanceDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
