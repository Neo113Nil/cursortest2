package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lmo extends fso {
    public static final Pair A = new Pair("", 0L);
    public SharedPreferences d;
    public SharedPreferences e;
    public zzhf f;
    public final zzhe g;
    public final zzhg h;
    public String i;
    public boolean j;
    public long k;
    public final zzhe l;
    public final zzhc m;
    public final zzhg n;
    public final zzhd o;
    public final zzhc p;
    public final zzhe q;
    public final zzhe r;
    public boolean s;
    public final zzhc t;
    public final zzhc u;
    public final zzhe v;
    public final zzhg w;
    public final zzhg x;
    public final zzhe y;
    public final zzhd z;

    public lmo(zzic zzicVar) {
        super(zzicVar);
        this.l = new zzhe(this, "session_timeout", 1800000L);
        this.m = new zzhc(this, "start_new_session", true);
        this.q = new zzhe(this, "last_pause_time", 0L);
        this.r = new zzhe(this, "session_id", 0L);
        this.n = new zzhg(this, "non_personalized_ads");
        this.o = new zzhd(this, "last_received_uri_timestamps_by_source");
        this.p = new zzhc(this, "allow_remote_dynamite", false);
        this.g = new zzhe(this, "first_open_time", 0L);
        new zzhe(this, "app_install_time", 0L);
        this.h = new zzhg(this, "app_instance_id");
        this.t = new zzhc(this, "app_backgrounded", false);
        this.u = new zzhc(this, "deep_link_retrieval_complete", false);
        this.v = new zzhe(this, "deep_link_retrieval_attempts", 0L);
        this.w = new zzhg(this, "firebase_feature_rollouts");
        this.x = new zzhg(this, "deferred_attribution_cache");
        this.y = new zzhe(this, "deferred_attribution_cache_timestamp", 0L);
        this.z = new zzhd(this, "default_event_parameters");
    }

    @Override // defpackage.fso
    public final boolean R() {
        return true;
    }

    public final SharedPreferences U() {
        Q();
        S();
        Preconditions.i(this.d);
        return this.d;
    }

    public final SharedPreferences V() {
        Q();
        S();
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        zzic zzicVar = (zzic) this.b;
        String valueOf = String.valueOf(zzicVar.a.getPackageName());
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.o;
        String concat = valueOf.concat("_preferences");
        zzgsVar.b(concat, "Default prefs file");
        SharedPreferences sharedPreferences2 = zzicVar.a.getSharedPreferences(concat, 0);
        this.e = sharedPreferences2;
        return sharedPreferences2;
    }

    public final SparseArray W() {
        Bundle a = this.o.a();
        int[] intArray = a.getIntArray("uriSources");
        long[] longArray = a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final zzjl X() {
        Q();
        return zzjl.c(U().getInt("consent_source", 100), U().getString("consent_settings", "G1"));
    }

    public final void Y(boolean z) {
        Q();
        zzgu zzguVar = ((zzic) this.b).f;
        zzic.m(zzguVar);
        zzguVar.o.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = U().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean Z(long j) {
        return j - this.l.a() > this.q.a();
    }
}
