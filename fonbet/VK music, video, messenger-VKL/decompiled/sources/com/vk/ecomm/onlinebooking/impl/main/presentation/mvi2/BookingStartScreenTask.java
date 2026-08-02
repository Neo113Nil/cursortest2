package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.hn50;
import xsna.ho8;
import xsna.ln50;
import xsna.nr;
import xsna.on50;
import xsna.shy;

/* compiled from: BookingStartScreenTask.kt */
/* loaded from: classes18.dex */
public interface BookingStartScreenTask extends hn50, Parcelable {

    /* compiled from: BookingStartScreenTask.kt */
    public static final class CancelRecord implements BookingStartScreenTask {
        public static final Parcelable.Creator<CancelRecord> CREATOR = new a();
        public final UserId b;
        public final int c;
        public final String d;

        /* compiled from: BookingStartScreenTask.kt */
        public static final class a implements Parcelable.Creator<CancelRecord> {
            @Override // android.os.Parcelable.Creator
            public final CancelRecord createFromParcel(Parcel parcel) {
                return new CancelRecord((UserId) parcel.readParcelable(CancelRecord.class.getClassLoader()), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CancelRecord[] newArray(int i) {
                return new CancelRecord[i];
            }
        }

        public CancelRecord(UserId userId, int i, String str) {
            this.b = userId;
            this.c = i;
            this.d = str;
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
            if (!(obj instanceof CancelRecord)) {
                return false;
            }
            CancelRecord cancelRecord = (CancelRecord) obj;
            return epx.f(this.b, cancelRecord.b) && this.c == cancelRecord.c && epx.f(this.d, cancelRecord.d);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelRecord(groupId=");
            sb.append(this.b);
            sb.append(", recordId=");
            sb.append(this.c);
            sb.append(", recordHash=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: BookingStartScreenTask.kt */
    public static final class RetryLoad implements BookingStartScreenTask {
        public static final Parcelable.Creator<RetryLoad> CREATOR = new a();
        public final UserId b;
        public final Integer c;
        public final String d;

        /* compiled from: BookingStartScreenTask.kt */
        public static final class a implements Parcelable.Creator<RetryLoad> {
            @Override // android.os.Parcelable.Creator
            public final RetryLoad createFromParcel(Parcel parcel) {
                return new RetryLoad((UserId) parcel.readParcelable(RetryLoad.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RetryLoad[] newArray(int i) {
                return new RetryLoad[i];
            }
        }

        public RetryLoad(UserId userId, Integer num, String str) {
            this.b = userId;
            this.c = num;
            this.d = str;
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
            if (!(obj instanceof RetryLoad)) {
                return false;
            }
            RetryLoad retryLoad = (RetryLoad) obj;
            return epx.f(this.b, retryLoad.b) && epx.f(this.c, retryLoad.c) && epx.f(this.d, retryLoad.d);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            Integer num = this.c;
            return this.d.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RetryLoad(groupId=");
            sb.append(this.b);
            sb.append(", recordId=");
            sb.append(this.c);
            sb.append(", recordHash=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            Integer num = this.c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.d);
        }
    }
}
