package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import defpackage.ddb;
import defpackage.pcj;
import defpackage.r5o;
import defpackage.vlo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqb {
    public final Clock a;
    public final zzeqd b;
    public final zzfte c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T7)).booleanValue();
    public final zzemv f;
    public boolean g;
    public long h;
    public long i;

    public zzeqb(Clock clock, zzeqd zzeqdVar, zzemv zzemvVar, zzfte zzfteVar) {
        this.a = clock;
        this.b = zzeqdVar;
        this.f = zzemvVar;
        this.c = zzfteVar;
    }

    public final synchronized void a(List list) {
        this.i = this.a.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfld zzfldVar = (zzfld) it.next();
            String str = zzfldVar.w;
            if (!TextUtils.isEmpty(str)) {
                this.d.put(zzfldVar, new r5o(str, zzfldVar.f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(zzflo zzfloVar, zzfld zzfldVar, ddb ddbVar, zzfta zzftaVar) {
        zzflg zzflgVar = zzfloVar.b.b;
        long elapsedRealtime = this.a.elapsedRealtime();
        String str = zzfldVar.w;
        if (str != null) {
            this.d.put(zzfldVar, new r5o(str, zzfldVar.f0, 9, 0L, null));
            pcj pcjVar = new pcj(this, elapsedRealtime, zzflgVar, zzfldVar, str, zzftaVar, zzfloVar);
            ddbVar.addListener(new vlo(0, ddbVar, pcjVar), zzcgj.h);
        }
    }

    public final synchronized void c(zzfld zzfldVar) {
        r5o r5oVar = (r5o) this.d.get(zzfldVar);
        if (r5oVar == null || this.g) {
            return;
        }
        r5oVar.c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                r5o r5oVar = (r5o) ((Map.Entry) it.next()).getValue();
                if (r5oVar.c != Integer.MAX_VALUE) {
                    arrayList.add(r5oVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
