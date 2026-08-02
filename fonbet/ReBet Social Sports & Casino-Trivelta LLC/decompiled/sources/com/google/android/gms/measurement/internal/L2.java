package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3191o;
import t9.C6452a;

/* loaded from: classes2.dex */
public final class L2 extends P3 {

    /* renamed from: A, reason: collision with root package name */
    public static final Pair f33512A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f33513c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f33514d;

    /* renamed from: e, reason: collision with root package name */
    public J2 f33515e;

    /* renamed from: f, reason: collision with root package name */
    public final I2 f33516f;

    /* renamed from: g, reason: collision with root package name */
    public final I2 f33517g;

    /* renamed from: h, reason: collision with root package name */
    public final K2 f33518h;

    /* renamed from: i, reason: collision with root package name */
    public String f33519i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33520j;

    /* renamed from: k, reason: collision with root package name */
    public long f33521k;

    /* renamed from: l, reason: collision with root package name */
    public final I2 f33522l;

    /* renamed from: m, reason: collision with root package name */
    public final G2 f33523m;

    /* renamed from: n, reason: collision with root package name */
    public final K2 f33524n;

    /* renamed from: o, reason: collision with root package name */
    public final H2 f33525o;

    /* renamed from: p, reason: collision with root package name */
    public final G2 f33526p;

    /* renamed from: q, reason: collision with root package name */
    public final I2 f33527q;

    /* renamed from: r, reason: collision with root package name */
    public final I2 f33528r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33529s;

    /* renamed from: t, reason: collision with root package name */
    public final G2 f33530t;

    /* renamed from: u, reason: collision with root package name */
    public final G2 f33531u;

    /* renamed from: v, reason: collision with root package name */
    public final I2 f33532v;

    /* renamed from: w, reason: collision with root package name */
    public final K2 f33533w;

    /* renamed from: x, reason: collision with root package name */
    public final K2 f33534x;

    /* renamed from: y, reason: collision with root package name */
    public final I2 f33535y;

    /* renamed from: z, reason: collision with root package name */
    public final H2 f33536z;

    public L2(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33522l = new I2(this, "session_timeout", 1800000L);
        this.f33523m = new G2(this, "start_new_session", true);
        this.f33527q = new I2(this, "last_pause_time", 0L);
        this.f33528r = new I2(this, "session_id", 0L);
        this.f33524n = new K2(this, "non_personalized_ads", null);
        this.f33525o = new H2(this, "last_received_uri_timestamps_by_source", null);
        this.f33526p = new G2(this, "allow_remote_dynamite", false);
        this.f33516f = new I2(this, "first_open_time", 0L);
        this.f33517g = new I2(this, "app_install_time", 0L);
        this.f33518h = new K2(this, "app_instance_id", null);
        this.f33530t = new G2(this, "app_backgrounded", false);
        this.f33531u = new G2(this, "deep_link_retrieval_complete", false);
        this.f33532v = new I2(this, "deep_link_retrieval_attempts", 0L);
        this.f33533w = new K2(this, "firebase_feature_rollouts", null);
        this.f33534x = new K2(this, "deferred_attribution_cache", null);
        this.f33535y = new I2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f33536z = new H2(this, "default_event_parameters", null);
    }

    public final boolean A(long j10) {
        return j10 - this.f33522l.a() > this.f33527q.a();
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final void j() {
        C3298l3 c3298l3 = this.f33578a;
        SharedPreferences sharedPreferences = c3298l3.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f33513c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f33529s = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f33513c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        c3298l3.w();
        this.f33515e = new J2(this, "health_monitor", Math.max(0L, ((Long) AbstractC3209a2.f33861d.b(null)).longValue()), null);
    }

    public final Pair o(String str) {
        h();
        if (!w().o(U3.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        C3298l3 c3298l3 = this.f33578a;
        long b10 = c3298l3.e().b();
        String str2 = this.f33519i;
        if (str2 != null && b10 < this.f33521k) {
            return new Pair(str2, Boolean.valueOf(this.f33520j));
        }
        this.f33521k = b10 + c3298l3.w().D(str, AbstractC3209a2.f33855b);
        C6452a.b(true);
        try {
            C6452a.C0912a a10 = C6452a.a(c3298l3.d());
            this.f33519i = "";
            String a11 = a10.a();
            if (a11 != null) {
                this.f33519i = a11;
            }
            this.f33520j = a10.b();
        } catch (Exception e10) {
            this.f33578a.a().v().b("Unable to get advertising id", e10);
            this.f33519i = "";
        }
        C6452a.b(false);
        return new Pair(this.f33519i, Boolean.valueOf(this.f33520j));
    }

    public final SharedPreferences p() {
        h();
        l();
        AbstractC3191o.m(this.f33513c);
        return this.f33513c;
    }

    public final SharedPreferences q() {
        h();
        l();
        if (this.f33514d == null) {
            C3298l3 c3298l3 = this.f33578a;
            String valueOf = String.valueOf(c3298l3.d().getPackageName());
            C3376v2 w10 = c3298l3.a().w();
            String concat = valueOf.concat("_preferences");
            w10.b("Default prefs file", concat);
            this.f33514d = c3298l3.d().getSharedPreferences(concat, 0);
        }
        return this.f33514d;
    }

    public final SparseArray r() {
        Bundle a10 = this.f33525o.a();
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f33578a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = p().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final C3389x u() {
        h();
        return C3389x.g(p().getString("dma_consent_settings", null));
    }

    public final boolean v(int i10) {
        return V3.u(i10, p().getInt("consent_source", 100));
    }

    public final V3 w() {
        h();
        return V3.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    public final boolean x(C3356s6 c3356s6) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String a10 = c3356s6.a();
        if (a10.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = p().edit();
        edit.putString("stored_tcf_param", a10);
        edit.apply();
        return true;
    }

    public final void y(boolean z10) {
        h();
        this.f33578a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = p().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean z() {
        SharedPreferences sharedPreferences = this.f33513c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
