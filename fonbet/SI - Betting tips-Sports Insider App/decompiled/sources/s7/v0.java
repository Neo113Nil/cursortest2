package s7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends l1 {

    /* renamed from: z, reason: collision with root package name */
    public static final Pair f23123z = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f23124c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f23125d;

    /* renamed from: e, reason: collision with root package name */
    public g3.d f23126e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.android.core.s f23127f;

    /* renamed from: g, reason: collision with root package name */
    public final com.android.billingclient.api.i f23128g;

    /* renamed from: h, reason: collision with root package name */
    public String f23129h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23130i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public final io.sentry.android.core.s f23131k;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f23132l;

    /* renamed from: m, reason: collision with root package name */
    public final com.android.billingclient.api.i f23133m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.firebase.messaging.x f23134n;

    /* renamed from: o, reason: collision with root package name */
    public final u0 f23135o;

    /* renamed from: p, reason: collision with root package name */
    public final io.sentry.android.core.s f23136p;
    public final io.sentry.android.core.s q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23137r;

    /* renamed from: s, reason: collision with root package name */
    public final u0 f23138s;

    /* renamed from: t, reason: collision with root package name */
    public final u0 f23139t;

    /* renamed from: u, reason: collision with root package name */
    public final io.sentry.android.core.s f23140u;

    /* renamed from: v, reason: collision with root package name */
    public final com.android.billingclient.api.i f23141v;

    /* renamed from: w, reason: collision with root package name */
    public final com.android.billingclient.api.i f23142w;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.android.core.s f23143x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.firebase.messaging.x f23144y;

    public v0(f1 f1Var) {
        super(f1Var);
        this.f23131k = new io.sentry.android.core.s(this, "session_timeout", 1800000L);
        this.f23132l = new u0(this, "start_new_session", true);
        this.f23136p = new io.sentry.android.core.s(this, "last_pause_time", 0L);
        this.q = new io.sentry.android.core.s(this, "session_id", 0L);
        this.f23133m = new com.android.billingclient.api.i(this, "non_personalized_ads");
        this.f23134n = new com.google.firebase.messaging.x(this, "last_received_uri_timestamps_by_source");
        this.f23135o = new u0(this, "allow_remote_dynamite", false);
        this.f23127f = new io.sentry.android.core.s(this, "first_open_time", 0L);
        g6.v.e("app_install_time");
        this.f23128g = new com.android.billingclient.api.i(this, "app_instance_id");
        this.f23138s = new u0(this, "app_backgrounded", false);
        this.f23139t = new u0(this, "deep_link_retrieval_complete", false);
        this.f23140u = new io.sentry.android.core.s(this, "deep_link_retrieval_attempts", 0L);
        this.f23141v = new com.android.billingclient.api.i(this, "firebase_feature_rollouts");
        this.f23142w = new com.android.billingclient.api.i(this, "deferred_attribution_cache");
        this.f23143x = new io.sentry.android.core.s(this, "deferred_attribution_cache_timestamp", 0L);
        this.f23144y = new com.google.firebase.messaging.x(this, "default_event_parameters");
    }

    @Override // s7.l1
    public final boolean k() {
        return true;
    }

    public final SharedPreferences n() {
        j();
        l();
        g6.v.h(this.f23124c);
        return this.f23124c;
    }

    public final SharedPreferences o() {
        j();
        l();
        if (this.f23125d == null) {
            f1 f1Var = (f1) this.f3328a;
            String valueOf = String.valueOf(f1Var.f22740a.getPackageName());
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            l0 l0Var = n0Var.f22910n;
            String concat = valueOf.concat("_preferences");
            l0Var.b(concat, "Default prefs file");
            this.f23125d = f1Var.f22740a.getSharedPreferences(concat, 0);
        }
        return this.f23125d;
    }

    public final SparseArray p() {
        Bundle R = this.f23134n.R();
        int[] intArray = R.getIntArray("uriSources");
        long[] longArray = R.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i5 = 0; i5 < intArray.length; i5++) {
            sparseArray.put(intArray[i5], Long.valueOf(longArray[i5]));
        }
        return sparseArray;
    }

    public final q1 q() {
        j();
        return q1.c(n().getInt("consent_source", 100), n().getString("consent_settings", "G1"));
    }

    public final boolean r(g3 g3Var) {
        j();
        String string = n().getString("stored_tcf_param", "");
        String a7 = g3Var.a();
        if (a7.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = n().edit();
        edit.putString("stored_tcf_param", a7);
        edit.apply();
        return true;
    }

    public final void s(boolean z5) {
        j();
        n0 n0Var = ((f1) this.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22910n.b(Boolean.valueOf(z5), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = n().edit();
        edit.putBoolean("deferred_analytics_collection", z5);
        edit.apply();
    }

    public final boolean t(long j) {
        return j - this.f23131k.a() > this.f23136p.a();
    }
}
