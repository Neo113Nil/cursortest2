package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhns {
    public static final zzhns b = new zzhns();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, zzhfj zzhfjVar) {
        try {
            HashMap hashMap = this.a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, zzhfjVar);
                return;
            }
            if (((zzhfj) hashMap.get(str)).equals(zzhfjVar)) {
                return;
            }
            String valueOf = String.valueOf(hashMap.get(str));
            String valueOf2 = String.valueOf(zzhfjVar);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + valueOf.length() + 17 + valueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(valueOf);
            sb.append("), cannot insert ");
            sb.append(valueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (zzhfj) entry.getValue());
        }
    }
}
