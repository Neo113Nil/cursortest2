package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.li01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes.dex */
public final class DataType extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final DataType A;

    @NonNull
    public static final DataType B;

    @NonNull
    public static final DataType C;

    @NonNull
    public static final Parcelable.Creator<DataType> CREATOR = new li01();

    @NonNull
    public static final DataType D;

    @NonNull
    public static final DataType E;

    @NonNull
    public static final DataType F;

    @NonNull
    public static final DataType G;

    @NonNull
    public static final DataType H;

    @NonNull
    public static final DataType I;

    @NonNull
    public static final DataType J;

    @NonNull
    public static final DataType K;

    @NonNull
    public static final DataType f;

    @NonNull
    public static final DataType g;

    @NonNull
    public static final DataType h;

    @NonNull
    public static final DataType i;

    @NonNull
    public static final DataType j;

    @NonNull
    public static final DataType k;

    @NonNull
    public static final DataType l;

    @NonNull
    public static final DataType m;

    @NonNull
    public static final DataType n;

    @NonNull
    public static final DataType o;

    @NonNull
    public static final DataType p;

    @NonNull
    public static final DataType q;

    @NonNull
    public static final DataType r;

    @NonNull
    public static final DataType s;

    @NonNull
    public static final DataType t;

    @NonNull
    public static final DataType u;

    @NonNull
    public static final DataType v;

    @NonNull
    public static final DataType w;

    @NonNull
    public static final DataType x;

    @NonNull
    public static final DataType y;

    @NonNull
    public static final DataType z;
    public final String b;
    public final List c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    static {
        Field field = Field.g;
        DataType dataType = new DataType("com.google.step_count.delta", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field);
        f = dataType;
        new DataType("com.google.step_count.cumulative", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field);
        Field field2 = Field.s;
        new DataType("com.google.step_count.cadence", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field2);
        new DataType("com.google.internal.goal", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.S);
        Field field3 = Field.e;
        g = new DataType("com.google.activity.segment", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field3);
        new DataType("com.google.internal.sleep_disordered_breathing_features", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.Z);
        new DataType("com.google.sleep.segment", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.f);
        new DataType("com.google.internal.sleep_soundscape", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.b0);
        Field field4 = Field.u;
        DataType dataType2 = new DataType("com.google.calories.expended", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field4);
        h = dataType2;
        i = new DataType("com.google.calories.bmr", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field4);
        j = new DataType("com.google.power.sample", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.v);
        new DataType("com.google.sensor.events", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.T, Field.U, Field.V);
        k = new DataType("com.google.heart_rate.bpm", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.i);
        new DataType("com.google.respiratory_rate", 1, "https://www.googleapis.com/auth/fitness.respiratory_rate.read", "https://www.googleapis.com/auth/fitness.respiratory_rate.write", Field.R);
        Field field5 = Field.j;
        Field field6 = Field.k;
        Field field7 = Field.l;
        Field field8 = Field.m;
        l = new DataType("com.google.location.sample", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field5, field6, field7, field8);
        new DataType("com.google.location.track", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field5, field6, field7, field8);
        DataType dataType3 = new DataType("com.google.distance.delta", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.n);
        m = dataType3;
        n = new DataType("com.google.speed", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.r);
        Field field9 = Field.t;
        new DataType("com.google.cycling.wheel_revolution.cumulative", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field9);
        new DataType("com.google.cycling.wheel_revolution.rpm", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field2);
        new DataType("com.google.cycling.pedaling.cumulative", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field9);
        new DataType("com.google.cycling.pedaling.cadence", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field2);
        o = new DataType("com.google.height", 1, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.o);
        p = new DataType("com.google.weight", 1, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.p);
        q = new DataType("com.google.body.fat.percentage", 1, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.q);
        Field field10 = Field.z;
        Field field11 = Field.x;
        r = new DataType("com.google.nutrition", 1, "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", field10, field11, Field.y);
        DataType dataType4 = new DataType("com.google.hydration", 1, "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.w);
        s = dataType4;
        new DataType("com.google.activity.exercise", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.A, Field.B, Field.Q, Field.D, Field.C);
        Field field12 = Field.h;
        DataType dataType5 = new DataType("com.google.active_minutes", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field12);
        t = dataType5;
        u = dataType5;
        new DataType("com.google.device_on_body", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.X);
        v = new DataType("com.google.activity.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field3, field12, Field.E);
        Field field13 = Field.F;
        Field field14 = Field.G;
        Field field15 = Field.H;
        w = new DataType("com.google.calories.bmr.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field13, field14, field15);
        x = dataType;
        y = dataType3;
        z = dataType2;
        Field field16 = Field.N;
        A = new DataType("com.google.heart_minutes", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field16);
        B = new DataType("com.google.heart_minutes.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field16, field12);
        C = new DataType("com.google.heart_rate.summary", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", field13, field14, field15);
        D = new DataType("com.google.location.bounding_box", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.I, Field.J, Field.K, Field.L);
        E = new DataType("com.google.power.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field13, field14, field15);
        F = new DataType("com.google.speed.summary", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field13, field14, field15);
        G = new DataType("com.google.body.fat.percentage.summary", 2, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", field13, field14, field15);
        H = new DataType("com.google.weight.summary", 2, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", field13, field14, field15);
        I = new DataType("com.google.height.summary", 2, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", field13, field14, field15);
        J = new DataType("com.google.nutrition.summary", 2, "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", field10, field11);
        K = dataType4;
        new DataType("com.google.activity.samples", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.W);
        new DataType("com.google.internal.sleep_attributes", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.Y);
        new DataType("com.google.internal.sleep_schedule", 1, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.a0);
        new DataType("com.google.internal.paced_walking_attributes", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.c0);
        new DataType("com.google.time_zone_change", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.d0);
        new DataType("com.google.internal.met", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.e0);
        new DataType("com.google.internal.internal_device_temperature", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.f0);
        new DataType("com.google.internal.skin_temperature", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.g0);
        Field field17 = Field.h0;
        Field field18 = Field.O;
        Field field19 = Field.P;
        new DataType("com.google.internal.custom_heart_rate_zone", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", field17, field18, field19);
        new DataType("com.google.internal.active_minutes_combined", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.i0, Field.j0, Field.k0);
        new DataType("com.google.internal.sedentary_time", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.l0);
        new DataType("com.google.internal.live_pace", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.m0);
        new DataType("com.google.internal.custom_max_heart_rate", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", field19);
        new DataType("com.google.internal.momentary_stress_algorithm", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.n0);
        new DataType("com.google.internal.magnetic_field_presence", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.o0);
        new DataType("com.google.internal.momentary_stress_windows", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.p0);
        new DataType("com.google.internal.exercise_detection_thresholds", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.q0);
        new DataType("com.google.internal.recovery_heart_rate", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.r0);
        new DataType("com.google.internal.heart_rate_variability", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.s0);
        new DataType("com.google.internal.heart_rate_variability_summary", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.t0);
        new DataType("com.google.internal.continuous_eda", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.u0);
        new DataType("com.google.internal.altitude_sample", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field8);
        new DataType("com.google.internal.time_in_sleep_stages", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.v0);
        new DataType("com.google.internal.grok_data", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.w0);
        new DataType("com.google.internal.wake_magnitude", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.x0);
        new DataType("com.google.internal.active_zone_minutes_summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.y0, Field.z0, Field.A0, Field.B0);
        new DataType("com.google.internal.sleep_coefficient", 1, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.C0);
        new DataType("com.google.internal.run_vo2_max", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.D0);
        new DataType("com.google.internal.demographic_vo2_max", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.G0);
        new DataType("com.google.internal.sleep_setting", 1, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.H0);
        new DataType("com.google.internal.values_in_heart_rate_zones", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.I0);
        new DataType("com.google.internal.heart_histogram", 1, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.J0);
        new DataType("com.google.internal.respiratory_rate_summary", 1, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.L0);
        new DataType("com.google.internal.stress_score", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", Field.K0);
        new DataType("com.google.internal.device_location", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", field5, field6, field7, Field.E0, Field.F0);
        new DataType("com.google.internal.daily_skin_sleep_temperature_derivations", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.M0);
        new DataType("com.google.internal.swim_lengths_data", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.N0);
        new DataType("com.google.internal.daily_sleep", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.O0);
        new DataType("com.google.internal.daily_internal_device_temperature_sleep_temperature_derivations", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", Field.P0);
    }

    public DataType(@NonNull String str, int i2, @Nullable String str2, @Nullable String str3, @NonNull Field... fieldArr) {
        this.b = str;
        this.c = Collections.unmodifiableList(Arrays.asList(fieldArr));
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataType)) {
            return false;
        }
        DataType dataType = (DataType) obj;
        return this.b.equals(dataType.b) && this.c.equals(dataType.c);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @NonNull
    public final String toString() {
        return String.format("DataType{%s%s}", this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int w2 = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.u(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.x(w2, parcel);
    }

    @NonNull
    public final String zzc() {
        String str = this.b;
        return str.startsWith("com.google.") ? str.substring(11) : str;
    }

    public DataType(String str, @Nullable String str2, @Nullable String str3, ArrayList arrayList) {
        this.b = str;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = str2;
        this.e = str3;
    }
}
