package com.vk.newsfeed.posting.impl.domain.model.upload;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.oq;
import xsna.shy;
import xsna.vu5;

/* compiled from: UploadUpdate.kt */
/* loaded from: classes4.dex */
public interface UploadUpdate extends Parcelable {

    /* compiled from: UploadUpdate.kt */
    public static final class Cancel implements UploadUpdate {
        public static final Parcelable.Creator<Cancel> CREATOR = new a();
        public final int b;

        /* compiled from: UploadUpdate.kt */
        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                return new Cancel(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }

        public Cancel(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancel) && this.b == ((Cancel) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Cancel(uploadId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: UploadUpdate.kt */
    public static final class Done implements UploadUpdate {
        public static final Parcelable.Creator<Done> CREATOR = new a();
        public final int b;
        public final Parcelable c;

        /* compiled from: UploadUpdate.kt */
        public static final class a implements Parcelable.Creator<Done> {
            @Override // android.os.Parcelable.Creator
            public final Done createFromParcel(Parcel parcel) {
                return new Done(parcel.readInt(), parcel.readParcelable(Done.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Done[] newArray(int i) {
                return new Done[i];
            }
        }

        public Done(int i, Parcelable parcelable) {
            this.b = i;
            this.c = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Done)) {
                return false;
            }
            Done done = (Done) obj;
            return this.b == done.b && epx.f(this.c, done.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Parcelable parcelable = this.c;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public final String toString() {
            return "Done(uploadId=" + this.b + ", result=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: UploadUpdate.kt */
    public static final class Failed implements UploadUpdate {
        public static final Parcelable.Creator<Failed> CREATOR = new a();
        public final int b;
        public final Throwable c;

        /* compiled from: UploadUpdate.kt */
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                return new Failed(parcel.readInt(), (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        public Failed(int i, Throwable th) {
            this.b = i;
            this.c = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return this.b == failed.b && epx.f(this.c, failed.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Throwable th = this.c;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failed(uploadId=");
            sb.append(this.b);
            sb.append(", error=");
            return oq.c(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeSerializable(this.c);
        }
    }

    /* compiled from: UploadUpdate.kt */
    public static final class Progress implements UploadUpdate {
        public static final Parcelable.Creator<Progress> CREATOR = new a();
        public final int b;
        public final int c;
        public final int d;

        /* compiled from: UploadUpdate.kt */
        public static final class a implements Parcelable.Creator<Progress> {
            @Override // android.os.Parcelable.Creator
            public final Progress createFromParcel(Parcel parcel) {
                return new Progress(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Progress[] newArray(int i) {
                return new Progress[i];
            }
        }

        public Progress(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return this.b == progress.b && this.c == progress.c && this.d == progress.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(uploadId=");
            sb.append(this.b);
            sb.append(", loaded=");
            sb.append(this.c);
            sb.append(", total=");
            return vu5.b(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
        }
    }

    /* compiled from: UploadUpdate.kt */
    public static final class Start implements UploadUpdate {
        public static final Parcelable.Creator<Start> CREATOR = new a();
        public final int b;
        public final int c;
        public final long d;

        /* compiled from: UploadUpdate.kt */
        public static final class a implements Parcelable.Creator<Start> {
            @Override // android.os.Parcelable.Creator
            public final Start createFromParcel(Parcel parcel) {
                return new Start(parcel.readInt(), parcel.readInt(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Start[] newArray(int i) {
                return new Start[i];
            }
        }

        public Start(int i, int i2, long j) {
            this.b = i;
            this.c = i2;
            this.d = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Start)) {
                return false;
            }
            Start start = (Start) obj;
            return this.b == start.b && this.c == start.c && this.d == start.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Start(oldId=");
            sb.append(this.b);
            sb.append(", newId=");
            sb.append(this.c);
            sb.append(", uploadSize=");
            return vu5.a(')', this.d, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeLong(this.d);
        }
    }
}
