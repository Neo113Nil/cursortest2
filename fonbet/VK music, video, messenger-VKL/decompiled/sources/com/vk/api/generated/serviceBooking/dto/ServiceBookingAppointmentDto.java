package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServiceBookingAppointmentDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingAppointmentDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingAppointmentDto> CREATOR = new a();

    @pmi0("datetime")
    private final String datetime;

    @pmi0("id")
    private final int id;

    @pmi0("service_ids")
    private final List<Integer> serviceIds;

    @pmi0("staff_id")
    private final Integer staffId;

    /* compiled from: ServiceBookingAppointmentDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingAppointmentDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAppointmentDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new ServiceBookingAppointmentDto(readInt, readString, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAppointmentDto[] newArray(int i) {
            return new ServiceBookingAppointmentDto[i];
        }
    }

    public ServiceBookingAppointmentDto(int i, String str, List<Integer> list, Integer num) {
        this.id = i;
        this.datetime = str;
        this.serviceIds = list;
        this.staffId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingAppointmentDto)) {
            return false;
        }
        ServiceBookingAppointmentDto serviceBookingAppointmentDto = (ServiceBookingAppointmentDto) obj;
        return this.id == serviceBookingAppointmentDto.id && epx.f(this.datetime, serviceBookingAppointmentDto.datetime) && epx.f(this.serviceIds, serviceBookingAppointmentDto.serviceIds) && epx.f(this.staffId, serviceBookingAppointmentDto.staffId);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.datetime), 31, this.serviceIds);
        Integer num = this.staffId;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingAppointmentDto(id=");
        sb.append(this.id);
        sb.append(", datetime=");
        sb.append(this.datetime);
        sb.append(", serviceIds=");
        sb.append(this.serviceIds);
        sb.append(", staffId=");
        return uqi.b(sb, this.staffId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.datetime);
        Iterator a2 = ao.a(parcel, this.serviceIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        Integer num = this.staffId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ServiceBookingAppointmentDto(int i, String str, List list, Integer num, int i2, zcl zclVar) {
        this(i, str, list, (i2 & 8) != 0 ? null : num);
    }
}
