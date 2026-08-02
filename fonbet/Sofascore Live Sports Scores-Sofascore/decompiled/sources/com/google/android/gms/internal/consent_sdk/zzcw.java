package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcw {
    public static zzcu a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new zzcu(str2, str3);
    }

    public static void b(Context context, HashSet hashSet) {
        HashMap hashMap;
        zzcv zzcvVar = new zzcv(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = zzcvVar.c;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            zzcu a = a(context, str);
            if (a == null) {
                "clearKeys: unable to process key: ".concat(String.valueOf(str));
            } else {
                String str2 = a.a;
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, zzcvVar.b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) hashMap.get(str2)).remove(a.b);
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }
}
