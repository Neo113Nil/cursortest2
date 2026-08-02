package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qa {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public final SharedPreferences a;

    public Qa(Context context, String str) {
        this.a = context.getSharedPreferences(str, 0);
    }

    public final boolean a(String str) {
        str.getClass();
        str.getClass();
        if (!this.a.contains(str)) {
            return false;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(str);
        edit.apply();
        return true;
    }

    public final void b(Set set) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putStringSet("reported_events", set);
        edit.apply();
    }

    public static void a(Qa qa, String str, boolean z) {
        str.getClass();
        SharedPreferences.Editor edit = qa.a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final void a(String str, String str2, boolean z) {
        str.getClass();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public final Set a(Set set) {
        return this.a.getStringSet("reported_events", set);
    }

    public final void a(String str, int i, boolean z) {
        str.getClass();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public final void a(String str, long j, boolean z) {
        str.getClass();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong(str, j);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
