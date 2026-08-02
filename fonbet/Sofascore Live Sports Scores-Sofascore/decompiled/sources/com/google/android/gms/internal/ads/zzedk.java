package com.google.android.gms.internal.ads;

import defpackage.f3o;
import defpackage.g3o;
import defpackage.nkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedk {
    public final zzecu a;
    public final zzdxx b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public boolean e;

    public zzedk(zzecu zzecuVar, zzdxx zzdxxVar) {
        this.a = zzecuVar;
        this.b = zzdxxVar;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    zzecu zzecuVar = this.a;
                    if (!zzecuVar.b) {
                        f3o f3oVar = new f3o(this);
                        zzecu zzecuVar2 = this.a;
                        zzecuVar2.getClass();
                        zzecuVar2.e.addListener(new nkn(zzecuVar2, f3oVar, false, 16), zzecuVar2.j);
                        return jSONArray;
                    }
                    b(zzecuVar.b());
                }
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((g3o) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        String str;
        String str2;
        zzbyi zzbyiVar;
        zzdxw b;
        zzbyi zzbyiVar2;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbsh zzbshVar = (zzbsh) it.next();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ra)).booleanValue()) {
                        zzdxw b2 = this.b.b(zzbshVar.a);
                        if (b2 != null && (zzbyiVar2 = b2.c) != null) {
                            str = zzbyiVar2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sa)).booleanValue() && (b = this.b.b(zzbshVar.a)) != null && b.d;
                    ArrayList arrayList = this.d;
                    String str4 = zzbshVar.a;
                    zzdxw b3 = this.b.b(str4);
                    if (b3 != null && (zzbyiVar = b3.b) != null) {
                        str2 = zzbyiVar.toString();
                        arrayList.add(new g3o(str4, str3, str2, zzbshVar.b ? 1 : 0, zzbshVar.d, zzbshVar.c, z));
                    }
                    str2 = "";
                    arrayList.add(new g3o(str4, str3, str2, zzbshVar.b ? 1 : 0, zzbshVar.d, zzbshVar.c, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
