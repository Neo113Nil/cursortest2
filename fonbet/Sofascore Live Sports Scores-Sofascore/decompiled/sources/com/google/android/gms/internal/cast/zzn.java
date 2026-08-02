package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzaa;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.dno;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn {
    public static final Logger j = new Logger("ApplicationAnalytics", null);
    public final zzj a;
    public final zzax b;
    public final zzp c;
    public final SharedPreferences f;
    public zzo g;
    public CastSession h;
    public boolean i;
    public final zzfk e = new zzfk(Looper.getMainLooper());
    public final dno d = new dno(this, 4);

    public zzn(SharedPreferences sharedPreferences, zzj zzjVar, zzax zzaxVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = zzjVar;
        this.b = zzaxVar;
        this.c = new zzp(bundle, str);
    }

    public final void a() {
        zzo zzoVar = this.g;
        zzoVar.getClass();
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences == null) {
            return;
        }
        zzo.q.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", zzoVar.b);
        edit.putString("receiver_metrics_id", zzoVar.c);
        edit.putLong("analytics_session_id", zzoVar.d);
        edit.putInt("event_sequence_number", zzoVar.e);
        edit.putString("receiver_session_id", zzoVar.f);
        edit.putInt("device_capabilities", zzoVar.g);
        edit.putString("device_model_name", zzoVar.h);
        edit.putString("manufacturer", zzoVar.i);
        edit.putString("product_name", zzoVar.j);
        edit.putString("build_type", zzoVar.k);
        edit.putString("cast_build_version", zzoVar.l);
        edit.putString("system_build_number", zzoVar.m);
        edit.putInt("device_category", zzoVar.n);
        edit.putInt("analytics_session_start_type", zzoVar.p);
        edit.putBoolean("is_output_switcher_enabled", zzoVar.o);
        edit.apply();
    }

    public final void b(int i) {
        j.a("log session ended with error = %d", Integer.valueOf(i));
        e();
        this.a.a(this.c.a(this.g, i), 228);
        this.e.removeCallbacks(this.d);
        if (this.i) {
            return;
        }
        this.g = null;
    }

    public final void c() {
        this.e.postDelayed(this.d, 300000L);
    }

    public final void d() {
        j.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        zzo zzoVar = new zzo(this.b);
        zzo.r++;
        this.g = zzoVar;
        CastSession castSession = this.h;
        zzoVar.o = castSession != null && castSession.g.zzo();
        zzo zzoVar2 = this.g;
        Preconditions.i(zzoVar2);
        Logger logger = CastContext.l;
        Preconditions.e("Must be called from the main thread.");
        CastContext castContext = CastContext.n;
        Preconditions.i(castContext);
        Preconditions.e("Must be called from the main thread.");
        zzoVar2.b = castContext.e.a;
        CastSession castSession2 = this.h;
        CastDevice j2 = castSession2 == null ? null : castSession2.j();
        if (j2 != null) {
            f(j2);
        }
        zzo zzoVar3 = this.g;
        Preconditions.i(zzoVar3);
        CastSession castSession3 = this.h;
        zzoVar3.p = castSession3 != null ? castSession3.i() : 0;
        Preconditions.i(this.g);
    }

    public final void e() {
        if (!g()) {
            j.c("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            d();
            return;
        }
        CastSession castSession = this.h;
        CastDevice j2 = castSession != null ? castSession.j() : null;
        if (j2 != null && !TextUtils.equals(this.g.c, j2.l)) {
            f(j2);
        }
        Preconditions.i(this.g);
    }

    public final void f(CastDevice castDevice) {
        zzo zzoVar = this.g;
        if (zzoVar == null) {
            return;
        }
        zzoVar.c = castDevice.l;
        zzoVar.g = castDevice.i.a;
        zzoVar.h = castDevice.e;
        zzoVar.n = castDevice.a1();
        zzaa Z0 = castDevice.Z0();
        if (Z0 != null) {
            String str = Z0.d;
            if (str != null) {
                zzoVar.i = str;
            }
            String str2 = Z0.e;
            if (str2 != null) {
                zzoVar.j = str2;
            }
            String str3 = Z0.f;
            if (str3 != null) {
                zzoVar.k = str3;
            }
            String str4 = Z0.g;
            if (str4 != null) {
                zzoVar.l = str4;
            }
            String str5 = Z0.h;
            if (str5 != null) {
                zzoVar.m = str5;
            }
        }
    }

    public final boolean g() {
        String str;
        Logger logger = j;
        if (this.g == null) {
            logger.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        Logger logger2 = CastContext.l;
        Preconditions.e("Must be called from the main thread.");
        CastContext castContext = CastContext.n;
        Preconditions.i(castContext);
        Preconditions.e("Must be called from the main thread.");
        String str2 = castContext.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            logger.a("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        Preconditions.i(this.g);
        return true;
    }

    public final boolean h(String str) {
        String str2;
        if (!g()) {
            return false;
        }
        Preconditions.i(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
