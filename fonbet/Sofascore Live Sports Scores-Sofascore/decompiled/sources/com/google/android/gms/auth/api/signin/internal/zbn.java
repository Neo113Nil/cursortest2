package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbn {
    public static zbn b;
    public final Storage a;

    public zbn(Context context) {
        String e;
        Storage a = Storage.a(context);
        this.a = a;
        a.b();
        String e2 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = a.e(Storage.f("googleSignInOptions", e2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.Y0(e);
        } catch (JSONException unused) {
        }
    }

    public static synchronized zbn a(Context context) {
        zbn zbnVar;
        synchronized (zbn.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (zbn.class) {
                zbnVar = b;
                if (zbnVar == null) {
                    zbnVar = new zbn(applicationContext);
                    b = zbnVar;
                }
            }
            return zbnVar;
        }
        return zbnVar;
    }

    public final synchronized void b() {
        Storage storage = this.a;
        ReentrantLock reentrantLock = storage.a;
        reentrantLock.lock();
        try {
            storage.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
