package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.exc0;
import xsna.fo01;
import xsna.fw3;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes.dex */
public final class Field extends AbstractSafeParcelable {

    @NonNull
    public static final Field A;

    @NonNull
    public static final Field A0;

    @NonNull
    public static final Field B;

    @NonNull
    public static final Field B0;

    @NonNull
    public static final Field C;

    @NonNull
    public static final Field C0;

    @NonNull
    public static final Field D;

    @NonNull
    public static final Field D0;

    @NonNull
    public static final Field E;

    @NonNull
    public static final Field E0;

    @NonNull
    public static final Field F;

    @NonNull
    public static final Field F0;

    @NonNull
    public static final Field G;

    @NonNull
    public static final Field G0;

    @NonNull
    public static final Field H;

    @NonNull
    public static final Field H0;

    @NonNull
    public static final Field I;

    @NonNull
    public static final Field I0;

    @NonNull
    public static final Field J;

    @NonNull
    public static final Field J0;

    @NonNull
    public static final Field K;

    @NonNull
    public static final Field K0;

    @NonNull
    public static final Field L;

    @NonNull
    public static final Field L0;

    @NonNull
    public static final Field M;

    @NonNull
    public static final Field M0;

    @NonNull
    public static final Field N;

    @NonNull
    public static final Field N0;

    @NonNull
    public static final Field O;

    @NonNull
    public static final Field O0;

    @NonNull
    public static final Field P;

    @NonNull
    public static final Field P0;

    @NonNull
    public static final Field Q;

    @NonNull
    public static final Field R;

    @NonNull
    public static final Field S;

    @NonNull
    public static final Field T;

    @NonNull
    public static final Field U;

    @NonNull
    public static final Field V;

    @NonNull
    public static final Field W;

    @NonNull
    public static final Field X;

    @NonNull
    public static final Field Y;

    @NonNull
    public static final Field Z;

    @NonNull
    public static final Field a0;

    @NonNull
    public static final Field b0;

    @NonNull
    public static final Field c0;

    @NonNull
    public static final Field d0;

    @NonNull
    public static final Field e0;

    @NonNull
    public static final Field f0;

    @NonNull
    public static final Field g;

    @NonNull
    public static final Field g0;

    @NonNull
    public static final Field h;

    @NonNull
    public static final Field h0;

    @NonNull
    public static final Field i;

    @NonNull
    public static final Field i0;

    @NonNull
    public static final Field j;

    @NonNull
    public static final Field j0;

    @NonNull
    public static final Field k;

    @NonNull
    public static final Field k0;

    @NonNull
    public static final Field l;

    @NonNull
    public static final Field l0;

    @NonNull
    public static final Field m;

    @NonNull
    public static final Field m0;

    @NonNull
    public static final Field n;

    @NonNull
    public static final Field n0;

    @NonNull
    public static final Field o;

    @NonNull
    public static final Field o0;

    @NonNull
    public static final Field p;

    @NonNull
    public static final Field p0;

    @NonNull
    public static final Field q;

    @NonNull
    public static final Field q0;

    @NonNull
    public static final Field r;

    @NonNull
    public static final Field r0;

    @NonNull
    public static final Field s;

    @NonNull
    public static final Field s0;

    @NonNull
    public static final Field t;

    @NonNull
    public static final Field t0;

    @NonNull
    public static final Field u;

    @NonNull
    public static final Field u0;

    @NonNull
    public static final Field v;

    @NonNull
    public static final Field v0;

    @NonNull
    public static final Field w;

    @NonNull
    public static final Field w0;

    @NonNull
    public static final Field x;

    @NonNull
    public static final Field x0;

    @NonNull
    public static final Field y;

    @NonNull
    public static final Field y0;

    @NonNull
    public static final Field z;

    @NonNull
    public static final Field z0;
    public final String b;
    public final int c;

    @Nullable
    public final Boolean d;

    @NonNull
    public static final Parcelable.Creator<Field> CREATOR = new fo01();

    @NonNull
    public static final Field e = j("activity");

    @NonNull
    public static final Field f = j("sleep_segment_type");

    static {
        i("confidence");
        g = j("steps");
        i("step_length");
        h = j("duration");
        Q = k("duration");
        new Field("activity_duration.ascending", 4, null);
        new Field("activity_duration.descending", 4, null);
        i = i("bpm");
        R = i("respiratory_rate");
        j = i("latitude");
        k = i("longitude");
        l = i("accuracy");
        Boolean bool = Boolean.TRUE;
        m = new Field("altitude", 2, bool);
        n = i("distance");
        o = i("height");
        p = i("weight");
        q = i("percentage");
        r = i("speed");
        s = i("rpm");
        S = b("google.android.fitness.GoalV2");
        b("google.android.fitness.Device");
        t = j("revolutions");
        u = i(com.huawei.hms.hihealth.data.Field.NUTRIENTS_FACTS_CALORIES);
        v = i("watts");
        w = i("volume");
        x = k("meal_type");
        y = new Field("food_item", 3, bool);
        z = new Field("nutrients", 4, null);
        A = new Field("exercise", 3, null);
        B = k("repetitions");
        C = new Field("resistance", 2, bool);
        D = k("resistance_type");
        E = j("num_segments");
        F = i("average");
        G = i(InneractiveMediationNameConsts.MAX);
        H = i(UcumUtils.UCUM_MINUTES);
        I = i("low_latitude");
        J = i("low_longitude");
        K = i("high_latitude");
        L = i("high_longitude");
        M = j("occurrences");
        T = j("sensor_type");
        U = new Field("timestamps", 5, null);
        V = new Field("sensor_values", 6, null);
        N = i("intensity");
        W = new Field("activity_confidence", 4, null);
        X = i("probability");
        Y = b("google.android.fitness.SleepAttributes");
        Z = b("google.android.fitness.SleepDisorderedBreathingFeatures");
        a0 = b("google.android.fitness.SleepSchedule");
        b0 = b("google.android.fitness.SleepSoundscape");
        i("circumference");
        c0 = b("google.android.fitness.PacedWalkingAttributes");
        d0 = new Field("zone_id", 3, null);
        e0 = i("met");
        f0 = i("internal_device_temperature");
        g0 = i("skin_temperature");
        h0 = j("custom_heart_rate_zone_status");
        O = j("min_int");
        P = j("max_int");
        i0 = k("lightly_active_duration");
        j0 = k("moderately_active_duration");
        k0 = k("very_active_duration");
        l0 = b("google.android.fitness.SedentaryTime");
        m0 = b("google.android.fitness.LivePace");
        n0 = b("google.android.fitness.MomentaryStressAlgorithm");
        o0 = j("magnet_presence");
        p0 = b("google.android.fitness.MomentaryStressWindows");
        q0 = b("google.android.fitness.ExerciseDetectionThresholds");
        r0 = b("google.android.fitness.RecoveryHeartRate");
        s0 = b("google.android.fitness.HeartRateVariability");
        t0 = b("google.android.fitness.HeartRateVariabilitySummary");
        u0 = b("google.android.fitness.ContinuousEDA");
        v0 = b("google.android.fitness.TimeInSleepStages");
        w0 = b("google.android.fitness.Grok");
        x0 = b("google.android.fitness.WakeMagnitude");
        y0 = j("google.android.fitness.FatBurnMinutes");
        z0 = j("google.android.fitness.CardioMinutes");
        A0 = j("google.android.fitness.PeakHeartRateMinutes");
        B0 = j("google.android.fitness.ActiveZoneMinutes");
        C0 = b("google.android.fitness.SleepCoefficient");
        D0 = b("google.android.fitness.RunVO2Max");
        E0 = j("device_location_type");
        F0 = new Field("device_id", 3, null);
        G0 = b("google.android.fitness.DemographicVO2Max");
        H0 = b("google.android.fitness.SleepSetting");
        I0 = b("google.android.fitness.ValuesInHeartRateZones");
        J0 = b("google.android.fitness.HeartHistogram");
        K0 = b("google.android.fitness.StressScore");
        L0 = b("google.android.fitness.RespiratoryRateSummary");
        M0 = b("google.android.fitness.DailySkinSleepTemperatureDerivations");
        N0 = b("google.android.fitness.SwimLengthsData");
        O0 = b("google.android.fitness.DailySleep");
        P0 = b("google.android.fitness.DailyInternalDeviceTemperatureSleepTemperatureDerivations");
    }

    public Field(@NonNull String str, int i2, @Nullable Boolean bool) {
        exc0.i(str);
        this.b = str;
        this.c = i2;
        this.d = bool;
    }

    @NonNull
    public static Field b(@NonNull String str) {
        return new Field(str, 7, null);
    }

    @NonNull
    public static Field i(@NonNull String str) {
        return new Field(str, 2, null);
    }

    @NonNull
    public static Field j(@NonNull String str) {
        return new Field(str, 1, null);
    }

    @NonNull
    public static Field k(@NonNull String str) {
        return new Field(str, 1, Boolean.TRUE);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        return this.b.equals(field.b) && this.c == field.c;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @NonNull
    public final String toString() {
        return fw3.c(this.b, "(", this.c == 1 ? "i" : InneractiveMediationDefs.GENDER_FEMALE, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int w2 = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.c(parcel, 3, this.d);
        ozg0.x(w2, parcel);
    }
}
