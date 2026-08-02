package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dwo implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Object a = new Object();
    public SharedPreferences b = null;

    public dwo() {
        new JSONObject();
    }

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
                rwo rwoVar = bwo.e.b;
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException unused) {
                    sharedPreferences = null;
                }
                this.b = sharedPreferences;
                if (sharedPreferences != null) {
                    try {
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        try {
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                            String string = sharedPreferences.getString("flag_configuration", "{}");
                            StrictMode.setThreadPolicy(threadPolicy);
                            new JSONObject(string);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    } catch (JSONException unused2) {
                    }
                }
                if (!((Boolean) gxo.a.J()).booleanValue() && (sharedPreferences2 = this.b) != null) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }
}
