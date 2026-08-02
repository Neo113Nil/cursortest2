package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zzbjv {
    public final LinkedList a = new LinkedList();
    public final LinkedHashMap b;
    public final Object c;

    public zzbjv(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public final void a(zzbjs zzbjsVar, long j, String... strArr) {
        synchronized (this.c) {
            this.a.add(new zzbjs(j, strArr[0], zzbjsVar));
        }
    }

    public final zzbju b() {
        zzbju zzbjuVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            try {
                LinkedList<zzbjs> linkedList = this.a;
                for (zzbjs zzbjsVar : linkedList) {
                    long j = zzbjsVar.a;
                    String str = zzbjsVar.b;
                    zzbjs zzbjsVar2 = zzbjsVar.c;
                    if (zzbjsVar2 != null && j > 0) {
                        long j2 = j - zzbjsVar2.a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j2);
                        sb.append(',');
                        if (booleanValue) {
                            boolean containsKey = hashMap.containsKey(Long.valueOf(zzbjsVar2.a));
                            long j3 = zzbjsVar2.a;
                            if (containsKey) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(j3));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                hashMap.put(Long.valueOf(j3), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append((((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzk().a());
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                zzbjuVar = new zzbju(sb.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbjuVar;
    }

    public final void c(String str, String str2) {
        zzbjl a;
        if (TextUtils.isEmpty(str2) || (a = com.google.android.gms.ads.internal.zzt.zzh().a()) == null) {
            return;
        }
        synchronized (this.c) {
            zzbjr zzbjrVar = (zzbjr) a.c.get(str);
            if (zzbjrVar == null) {
                zzbjrVar = zzbjr.a;
            }
            LinkedHashMap linkedHashMap = this.b;
            linkedHashMap.put(str, zzbjrVar.a((String) linkedHashMap.get(str), str2));
        }
    }
}
