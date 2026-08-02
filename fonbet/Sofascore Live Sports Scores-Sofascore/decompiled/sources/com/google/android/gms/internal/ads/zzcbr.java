package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.lrn;
import defpackage.xlo;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcbr extends zzcbo {
    public final Context b;
    public SharedPreferences c;
    public final zzbve d;
    public final VersionInfoParcel e;
    public final hsn g;
    public final Object a = new Object();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zzcbr(Context context, zzbve zzbveVar, VersionInfoParcel versionInfoParcel, hsn hsnVar) {
        this.b = context.getApplicationContext();
        this.e = versionInfoParcel;
        this.d = zzbveVar;
        this.g = hsnVar;
    }

    public static JSONObject b(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzblh.f.c()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzblh.g.c());
            jSONObject.put("cl", "919173219");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final ddb a() {
        SharedPreferences sharedPreferences;
        int i;
        synchronized (this.a) {
            try {
                sharedPreferences = this.c;
                i = 0;
                if (sharedPreferences == null) {
                    sharedPreferences = this.b.getSharedPreferences("google_ads_flags_meta", 0);
                    this.c = sharedPreferences;
                }
            } finally {
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzblh.h.c()).longValue()) {
            return xlo.b;
        }
        return zzhcy.i(this.d.a(b(this.b, this.e)), new lrn(this, i), ((Boolean) zzblh.m.c()).booleanValue() ? this.g : zzcgj.h);
    }
}
