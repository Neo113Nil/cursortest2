package com.vk.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import io.reactivex.rxjava3.core.v;
import java.util.NoSuchElementException;
import xsna.b25;
import xsna.brn0;
import xsna.daj;
import xsna.drm0;
import xsna.jon0;
import xsna.paj0;
import xsna.pej;
import xsna.qaj0;
import xsna.xdf;
import xsna.yqw;
import xsna.zhy0;

/* compiled from: ContactsSyncPrefs.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class f {
    public static v<daj> b;
    public static Context c;
    public static b25 d;
    public static paj0 g;
    public static paj0 h;
    public static final f a = new f();
    public static final SharedPreferences e = Preference.f("contacts_sync_common");
    public static final Object f = new Object();
    public static final a i = new a();

    /* compiled from: ContactsSyncPrefs.kt */
    public static final class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str == null) {
                return;
            }
            if (!drm0.D(str, "key_sync_state", false)) {
                if (drm0.D(str, "key_in_app_permission_granted", false)) {
                    paj0 paj0Var = f.g;
                    boolean z = paj0Var != null ? paj0Var.getBoolean("key_in_app_permission_granted", false) : false;
                    v<daj> vVar = f.b;
                    (vVar != null ? vVar : null).onNext(new yqw(z));
                    return;
                }
                if (drm0.D(str, "key_system_permission_granted", false)) {
                    paj0 paj0Var2 = f.g;
                    boolean z2 = paj0Var2 != null ? paj0Var2.getBoolean("key_system_permission_granted", false) : false;
                    v<daj> vVar2 = f.b;
                    (vVar2 != null ? vVar2 : null).onNext(new brn0(z2));
                    return;
                }
                return;
            }
            paj0 paj0Var3 = f.g;
            int i = paj0Var3 != null ? paj0Var3.getInt("key_sync_state", ContactSyncState.NOT_PERMITTED.h()) : ContactSyncState.NOT_PERMITTED.h();
            v<daj> vVar3 = f.b;
            v<daj> vVar4 = vVar3 != null ? vVar3 : null;
            ContactSyncState.Companion.getClass();
            for (ContactSyncState contactSyncState : ContactSyncState.values()) {
                if (contactSyncState.h() == i) {
                    vVar4.onNext(new jon0(contactSyncState));
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static SharedPreferences a() {
        paj0 b2;
        paj0 paj0Var = h;
        if (paj0Var != null) {
            return paj0Var;
        }
        synchronized (f) {
            Context context = c;
            if (context == null) {
                context = null;
            }
            b2 = qaj0.b(context, new pej(0));
            h = b2;
        }
        return b2;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder("contacts_sync_options_");
        b25 b25Var = d;
        if (b25Var == null) {
            b25Var = null;
        }
        sb.append(b25Var.c().b);
        return sb.toString();
    }

    public static SharedPreferences c() {
        paj0 b2;
        paj0 paj0Var = g;
        if (paj0Var != null) {
            return paj0Var;
        }
        synchronized (f) {
            Context context = c;
            if (context == null) {
                context = null;
            }
            b2 = qaj0.b(context, new xdf(1));
            b2.registerOnSharedPreferenceChangeListener(i);
            g = b2;
        }
        return b2;
    }

    public static void d(boolean z) {
        L.e("VkContactManager", zhy0.a("inAppPermGranted=", z));
        qaj0.c(c(), "key_in_app_permission_granted", Boolean.valueOf(z));
    }
}
