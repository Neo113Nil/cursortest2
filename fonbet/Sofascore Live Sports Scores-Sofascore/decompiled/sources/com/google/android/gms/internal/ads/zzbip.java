package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbip implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Object a = new Object();
    public SharedPreferences b = null;
    public JSONObject c = new JSONObject();

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (this.a) {
            try {
                if (this.b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                com.google.android.gms.ads.internal.client.zzba.zza();
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException e) {
                    zzo.zzj("", e);
                    sharedPreferences = null;
                }
                this.b = sharedPreferences;
                b(sharedPreferences);
                if (!((Boolean) zzblh.b.c()).booleanValue() && (sharedPreferences2 = this.b) != null) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                    String string = sharedPreferences.getString("flag_configuration", "{}");
                    StrictMode.setThreadPolicy(threadPolicy);
                    this.c = new JSONObject(string);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b(sharedPreferences);
        }
    }
}
