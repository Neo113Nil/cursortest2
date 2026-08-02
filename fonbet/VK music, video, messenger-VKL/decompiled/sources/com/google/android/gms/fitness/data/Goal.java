package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzgo;
import java.util.ArrayList;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class Goal extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Goal> CREATOR = new d();
    public final long b;
    public final long c;
    public final ArrayList d;
    public final Recurrence e;
    public final int f;
    public final MetricObjective g;
    public final DurationObjective h;
    public final FrequencyObjective i;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static class DurationObjective extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<DurationObjective> CREATOR = new b();
        public final long b;

        public DurationObjective(long j) {
            this.b = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof DurationObjective) && this.b == ((DurationObjective) obj).b;
        }

        public final int hashCode() {
            return (int) this.b;
        }

        @NonNull
        public final String toString() {
            dq70.a aVar = new dq70.a(this);
            aVar.a(Long.valueOf(this.b), "duration");
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 8);
            parcel.writeLong(this.b);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static class FrequencyObjective extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<FrequencyObjective> CREATOR = new c();
        public final int b;

        public FrequencyObjective(int i) {
            this.b = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof FrequencyObjective) && this.b == ((FrequencyObjective) obj).b;
        }

        public final int hashCode() {
            return this.b;
        }

        @NonNull
        public final String toString() {
            dq70.a aVar = new dq70.a(this);
            aVar.a(Integer.valueOf(this.b), "frequency");
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static class MetricObjective extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<MetricObjective> CREATOR = new e();
        public final String b;
        public final double c;
        public final double d;

        public MetricObjective(@NonNull String str, double d, double d2) {
            this.b = str;
            this.c = d;
            this.d = d2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricObjective)) {
                return false;
            }
            MetricObjective metricObjective = (MetricObjective) obj;
            return dq70.b(this.b, metricObjective.b) && this.c == metricObjective.c && this.d == metricObjective.d;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        @NonNull
        public final String toString() {
            dq70.a aVar = new dq70.a(this);
            aVar.a(this.b, "dataTypeName");
            aVar.a(Double.valueOf(this.c), "value");
            aVar.a(Double.valueOf(this.d), "initialValue");
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.q(parcel, 1, this.b, false);
            ozg0.v(parcel, 2, 8);
            parcel.writeDouble(this.c);
            ozg0.v(parcel, 3, 8);
            parcel.writeDouble(this.d);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static class MismatchedGoalException extends IllegalStateException {
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static class Recurrence extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<Recurrence> CREATOR = new a();
        public final int b;
        public final int c;

        public Recurrence(int i, int i2) {
            this.b = i;
            boolean z = false;
            if (i2 > 0 && i2 <= 3) {
                z = true;
            }
            exc0.l(z);
            this.c = i2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            return this.b == recurrence.b && this.c == recurrence.c;
        }

        public final int hashCode() {
            return this.c;
        }

        @NonNull
        public final String toString() {
            String str;
            dq70.a aVar = new dq70.a(this);
            aVar.a(Integer.valueOf(this.b), "count");
            int i = this.c;
            if (i == 1) {
                str = "day";
            } else if (i == 2) {
                str = "week";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("invalid unit value");
                }
                str = "month";
            }
            aVar.a(str, "unit");
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b);
            ozg0.v(parcel, 2, 4);
            parcel.writeInt(this.c);
            ozg0.x(w, parcel);
        }
    }

    public Goal(long j, long j2, ArrayList arrayList, Recurrence recurrence, int i, MetricObjective metricObjective, DurationObjective durationObjective, FrequencyObjective frequencyObjective) {
        this.b = j;
        this.c = j2;
        this.d = arrayList;
        this.e = recurrence;
        this.f = i;
        this.g = metricObjective;
        this.h = durationObjective;
        this.i = frequencyObjective;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Goal)) {
            return false;
        }
        Goal goal = (Goal) obj;
        return this.b == goal.b && this.c == goal.c && dq70.b(this.d, goal.d) && dq70.b(this.e, goal.e) && this.f == goal.f && dq70.b(this.g, goal.g) && dq70.b(this.h, goal.h) && dq70.b(this.i, goal.i);
    }

    public final int hashCode() {
        return this.f;
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        ArrayList arrayList = this.d;
        aVar.a((arrayList.isEmpty() || arrayList.size() > 1) ? null : zzgo.zzb(((Integer) arrayList.get(0)).intValue()), "activity");
        aVar.a(this.e, "recurrence");
        aVar.a(this.g, "metricObjective");
        aVar.a(this.h, "durationObjective");
        aVar.a(this.i, "frequencyObjective");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.l(parcel, this.d, 3);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.p(parcel, 6, this.g, i, false);
        ozg0.p(parcel, 7, this.h, i, false);
        ozg0.p(parcel, 8, this.i, i, false);
        ozg0.x(w, parcel);
    }
}
