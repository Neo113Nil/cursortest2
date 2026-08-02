package com.vk.media.pipeline.metrics;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.alb0;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;

/* compiled from: MetricsCalculationConfig.kt */
/* loaded from: classes3.dex */
public interface MetricsCalculationConfig extends Parcelable {

    /* compiled from: MetricsCalculationConfig.kt */
    public static final class CanBeCalculated implements MetricsCalculationConfig {
        public static final Parcelable.Creator<CanBeCalculated> CREATOR = new a();
        public final List<ComparableVideoFragmentInfo> b;
        public final Uri c;

        /* compiled from: MetricsCalculationConfig.kt */
        public static final class a implements Parcelable.Creator<CanBeCalculated> {
            @Override // android.os.Parcelable.Creator
            public final CanBeCalculated createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ComparableVideoFragmentInfo.CREATOR, parcel, arrayList, i, 1);
                }
                return new CanBeCalculated(arrayList, (Uri) parcel.readParcelable(CanBeCalculated.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CanBeCalculated[] newArray(int i) {
                return new CanBeCalculated[i];
            }
        }

        public CanBeCalculated(List<ComparableVideoFragmentInfo> list, Uri uri) {
            this.b = list;
            this.c = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CanBeCalculated)) {
                return false;
            }
            CanBeCalculated canBeCalculated = (CanBeCalculated) obj;
            return epx.f(this.b, canBeCalculated.b) && epx.f(this.c, canBeCalculated.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CanBeCalculated(fragmentsInfo=");
            sb.append(this.b);
            sb.append(", transcodedFileUri=");
            return alb0.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((ComparableVideoFragmentInfo) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: MetricsCalculationConfig.kt */
    public static final class CanNotBeCalculated implements MetricsCalculationConfig {
        public static final Parcelable.Creator<CanNotBeCalculated> CREATOR = new a();
        public final String b;

        /* compiled from: MetricsCalculationConfig.kt */
        public static final class a implements Parcelable.Creator<CanNotBeCalculated> {
            @Override // android.os.Parcelable.Creator
            public final CanNotBeCalculated createFromParcel(Parcel parcel) {
                return new CanNotBeCalculated(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CanNotBeCalculated[] newArray(int i) {
                return new CanNotBeCalculated[i];
            }
        }

        public CanNotBeCalculated(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CanNotBeCalculated) && epx.f(this.b, ((CanNotBeCalculated) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CanNotBeCalculated(cause="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
