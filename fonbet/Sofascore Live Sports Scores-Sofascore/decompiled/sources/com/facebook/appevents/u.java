package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.facebook.internal.k0;
import com.facebook.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import defpackage.cjc;
import defpackage.cw3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u {
    public static SharedPreferences b;
    public static final u a = new u();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    public final HashMap a() {
        ConcurrentHashMap concurrentHashMap = e;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = cjc.d;
            HashSet hashSet = new HashSet();
            Iterator it = cjc.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((cjc) it.next()).b());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final synchronized void b() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(w.a());
            defaultSharedPreferences.getClass();
            b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                Intrinsics.i("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            d.putAll(k0.D(string));
            e.putAll(k0.D(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.d(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = str2.subSequence(i, length + 1).toString().toLowerCase();
            lowerCase.getClass();
            if ("em".equals(str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return "";
                }
            } else {
                if ("ph".equals(str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if ("ge".equals(str)) {
                    String substring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                    return (InneractiveMediationDefs.GENDER_FEMALE.equals(substring) || InneractiveMediationDefs.GENDER_MALE.equals(substring)) ? substring : "";
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }
}
