package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.lgn;
import defpackage.t01;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzal extends t01 {
    public Boolean c;
    public String d;
    public lgn e;
    public Boolean f;

    public final boolean R(String str) {
        zzic.k(((zzic) this.b).i);
        if (zzpp.s0((String) zzfy.g1.a(null), str) || zzpp.s0((String) zzfy.h1.a(null), str) || zzpp.s0((String) zzfy.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.e.zza(str, "gaia_collection_enabled"));
    }

    public final boolean S(String str) {
        return "1".equals(this.e.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean T() {
        Boolean bool = this.c;
        if (bool == null) {
            bool = d0("app_measurement_lite");
            this.c = bool;
            if (bool == null) {
                bool = Boolean.FALSE;
                this.c = bool;
            }
        }
        return bool.booleanValue() || !((zzic) this.b).b;
    }

    public final String U(String str) {
        zzic zzicVar = (zzic) this.b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.i(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.g.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            zzgu zzguVar4 = zzicVar.f;
            zzic.m(zzguVar4);
            zzguVar4.g.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int V(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(Z(str, zzfy.g0), 500), 100) : 500, NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public final void W() {
        ((zzic) this.b).getClass();
    }

    public final String X(String str, zzfx zzfxVar) {
        return TextUtils.isEmpty(str) ? (String) zzfxVar.a(null) : (String) zzfxVar.a(this.e.zza(str, zzfxVar.a));
    }

    public final long Y(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfxVar.a(null)).longValue();
        }
        String zza = this.e.zza(str, zzfxVar.a);
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzfxVar.a(null)).longValue();
        }
        try {
            return ((Long) zzfxVar.a(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfxVar.a(null)).longValue();
        }
    }

    public final int Z(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfxVar.a(null)).intValue();
        }
        String zza = this.e.zza(str, zzfxVar.a);
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzfxVar.a(null)).intValue();
        }
        try {
            return ((Integer) zzfxVar.a(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfxVar.a(null)).intValue();
        }
    }

    public final double a0(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfxVar.a(null)).doubleValue();
        }
        String zza = this.e.zza(str, zzfxVar.a);
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzfxVar.a(null)).doubleValue();
        }
        try {
            return ((Double) zzfxVar.a(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfxVar.a(null)).doubleValue();
        }
    }

    public final boolean b0(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfxVar.a(null)).booleanValue();
        }
        String zza = this.e.zza(str, zzfxVar.a);
        return TextUtils.isEmpty(zza) ? ((Boolean) zzfxVar.a(null)).booleanValue() : ((Boolean) zzfxVar.a(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final Bundle c0() {
        zzic zzicVar = (zzic) this.b;
        try {
            Context context = zzicVar.a;
            Context context2 = zzicVar.a;
            zzgu zzguVar = zzicVar.f;
            if (context.getPackageManager() == null) {
                zzic.m(zzguVar);
                zzguVar.g.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = Wrappers.a(context2).a(128, context2.getPackageName());
            if (a != null) {
                return a.metaData;
            }
            zzic.m(zzguVar);
            zzguVar.g.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean d0(String str) {
        Preconditions.f(str);
        Bundle c0 = c0();
        if (c0 != null) {
            if (c0.containsKey(str)) {
                return Boolean.valueOf(c0.getBoolean(str));
            }
            return null;
        }
        zzgu zzguVar = ((zzic) this.b).f;
        zzic.m(zzguVar);
        zzguVar.g.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean e0() {
        ((zzic) this.b).getClass();
        Boolean d0 = d0("firebase_analytics_collection_deactivated");
        return d0 != null && d0.booleanValue();
    }

    public final boolean f0() {
        Boolean d0 = d0("google_analytics_automatic_screen_reporting_enabled");
        return d0 == null || d0.booleanValue();
    }

    public final zzji g0(String str, boolean z) {
        Object obj;
        Preconditions.f(str);
        zzic zzicVar = (zzic) this.b;
        Bundle c0 = c0();
        if (c0 == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = c0.get(str);
        }
        zzji zzjiVar = zzji.UNINITIALIZED;
        if (obj == null) {
            return zzjiVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        zzgu zzguVar2 = zzicVar.f;
        zzic.m(zzguVar2);
        zzguVar2.j.b(str, "Invalid manifest metadata for");
        return zzjiVar;
    }
}
