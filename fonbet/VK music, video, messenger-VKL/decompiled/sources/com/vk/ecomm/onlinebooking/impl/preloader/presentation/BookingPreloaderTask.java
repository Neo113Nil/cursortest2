package com.vk.ecomm.onlinebooking.impl.preloader.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.preloader.domain.model.ReBookingArgs;
import xsna.epx;
import xsna.hn50;
import xsna.ln50;
import xsna.on50;

/* compiled from: BookingPreloaderTask.kt */
/* loaded from: classes18.dex */
public interface BookingPreloaderTask extends hn50, Parcelable {

    /* compiled from: BookingPreloaderTask.kt */
    public static final class LoadRebooking implements BookingPreloaderTask {
        public static final Parcelable.Creator<LoadRebooking> CREATOR = new a();
        public final ReBookingArgs b;
        public final BookingScreenParams c;

        /* compiled from: BookingPreloaderTask.kt */
        public static final class a implements Parcelable.Creator<LoadRebooking> {
            @Override // android.os.Parcelable.Creator
            public final LoadRebooking createFromParcel(Parcel parcel) {
                return new LoadRebooking(ReBookingArgs.CREATOR.createFromParcel(parcel), BookingScreenParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LoadRebooking[] newArray(int i) {
                return new LoadRebooking[i];
            }
        }

        public LoadRebooking(ReBookingArgs reBookingArgs, BookingScreenParams bookingScreenParams) {
            this.b = reBookingArgs;
            this.c = bookingScreenParams;
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
            if (!(obj instanceof LoadRebooking)) {
                return false;
            }
            LoadRebooking loadRebooking = (LoadRebooking) obj;
            return epx.f(this.b, loadRebooking.b) && epx.f(this.c, loadRebooking.c);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "LoadRebooking(reBookingArgs=" + this.b + ", params=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            this.c.writeToParcel(parcel, i);
        }
    }

    /* compiled from: BookingPreloaderTask.kt */
    public static final class Reload implements BookingPreloaderTask {
        public static final Parcelable.Creator<Reload> CREATOR = new a();
        public final BookingScreenParams b;

        /* compiled from: BookingPreloaderTask.kt */
        public static final class a implements Parcelable.Creator<Reload> {
            @Override // android.os.Parcelable.Creator
            public final Reload createFromParcel(Parcel parcel) {
                return new Reload(BookingScreenParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Reload[] newArray(int i) {
                return new Reload[i];
            }
        }

        public Reload(BookingScreenParams bookingScreenParams) {
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
            return (obj instanceof Reload) && epx.f(this.b, ((Reload) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Reload(params=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }
}
