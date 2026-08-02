package com.vk.ecomm.onlinebooking.impl.services.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.hn50;
import xsna.ln50;
import xsna.ms9;
import xsna.on50;

/* compiled from: BookingServicesScreenTask.kt */
/* loaded from: classes18.dex */
public interface BookingServicesScreenTask extends hn50, Parcelable {

    /* compiled from: BookingServicesScreenTask.kt */
    public static final class LoadAvailableServices implements BookingServicesScreenTask {
        public static final Parcelable.Creator<LoadAvailableServices> CREATOR = new a();
        public final UserId b;
        public final BookingMaster c;
        public final List<BookingServiceModel> d;

        /* compiled from: BookingServicesScreenTask.kt */
        public static final class a implements Parcelable.Creator<LoadAvailableServices> {
            @Override // android.os.Parcelable.Creator
            public final LoadAvailableServices createFromParcel(Parcel parcel) {
                UserId userId = (UserId) parcel.readParcelable(LoadAvailableServices.class.getClassLoader());
                BookingMaster createFromParcel = parcel.readInt() == 0 ? null : BookingMaster.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BookingServiceModel.CREATOR, parcel, arrayList, i, 1);
                }
                return new LoadAvailableServices(userId, createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final LoadAvailableServices[] newArray(int i) {
                return new LoadAvailableServices[i];
            }
        }

        public LoadAvailableServices(UserId userId, BookingMaster bookingMaster, List<BookingServiceModel> list) {
            this.b = userId;
            this.c = bookingMaster;
            this.d = list;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadAvailableServices)) {
                return false;
            }
            LoadAvailableServices loadAvailableServices = (LoadAvailableServices) obj;
            return epx.f(this.b, loadAvailableServices.b) && epx.f(this.c, loadAvailableServices.c) && epx.f(this.d, loadAvailableServices.d);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            BookingMaster bookingMaster = this.c;
            return this.d.hashCode() + ((hashCode + (bookingMaster == null ? 0 : bookingMaster.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadAvailableServices(groupId=");
            sb.append(this.b);
            sb.append(", master=");
            sb.append(this.c);
            sb.append(", selectedServicesWithCurrent=");
            return ms9.a(')', sb, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            BookingMaster bookingMaster = this.c;
            if (bookingMaster == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bookingMaster.writeToParcel(parcel, i);
            }
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                ((BookingServiceModel) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: BookingServicesScreenTask.kt */
    public static final class LoadData implements BookingServicesScreenTask {
        public static final Parcelable.Creator<LoadData> CREATOR = new a();
        public final BookingScreenParams b;

        /* compiled from: BookingServicesScreenTask.kt */
        public static final class a implements Parcelable.Creator<LoadData> {
            @Override // android.os.Parcelable.Creator
            public final LoadData createFromParcel(Parcel parcel) {
                return new LoadData(BookingScreenParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LoadData[] newArray(int i) {
                return new LoadData[i];
            }
        }

        public LoadData(BookingScreenParams bookingScreenParams) {
            this.b = bookingScreenParams;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadData) && epx.f(this.b, ((LoadData) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoadData(params=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }
}
