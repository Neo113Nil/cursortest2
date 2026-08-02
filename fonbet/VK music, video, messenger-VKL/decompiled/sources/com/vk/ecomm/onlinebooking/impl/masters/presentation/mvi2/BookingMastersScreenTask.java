package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import xsna.epx;
import xsna.hn50;
import xsna.ln50;
import xsna.on50;

/* compiled from: BookingMastersScreenTask.kt */
/* loaded from: classes18.dex */
public interface BookingMastersScreenTask extends hn50, Parcelable {

    /* compiled from: BookingMastersScreenTask.kt */
    public static final class OpenScreen implements BookingMastersScreenTask {
        public static final Parcelable.Creator<OpenScreen> CREATOR = new a();
        public final BookingScreenParams b;

        /* compiled from: BookingMastersScreenTask.kt */
        public static final class a implements Parcelable.Creator<OpenScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenScreen createFromParcel(Parcel parcel) {
                return new OpenScreen(BookingScreenParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenScreen[] newArray(int i) {
                return new OpenScreen[i];
            }
        }

        public OpenScreen(BookingScreenParams bookingScreenParams) {
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
            return (obj instanceof OpenScreen) && epx.f(this.b, ((OpenScreen) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenScreen(params=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }
}
