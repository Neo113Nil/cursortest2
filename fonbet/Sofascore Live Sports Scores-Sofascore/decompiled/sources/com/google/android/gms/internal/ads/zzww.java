package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzww;
import defpackage.hbp;
import defpackage.jbp;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzww extends zzwp {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void n() {
        for (jbp jbpVar : this.i.values()) {
            jbpVar.a.i(jbpVar.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public void o(zziq zziqVar) {
        this.j = zzfm.p();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void p() {
        for (jbp jbpVar : this.i.values()) {
            jbpVar.a.j(jbpVar.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public void q() {
        HashMap hashMap = this.i;
        for (jbp jbpVar : hashMap.values()) {
            zzxq zzxqVar = jbpVar.a;
            zzxqVar.h(jbpVar.b);
            hbp hbpVar = jbpVar.c;
            zzxqVar.e(hbpVar);
            zzxqVar.d(hbpVar);
        }
        hashMap.clear();
    }

    public abstract void s(Object obj, zzwp zzwpVar, zzbf zzbfVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zzxp, fbp] */
    public final void t(final Integer num, zzxq zzxqVar) {
        HashMap hashMap = this.i;
        zzguk.a(!hashMap.containsKey(num));
        ?? r1 = new zzxp() { // from class: fbp
            @Override // com.google.android.gms.internal.ads.zzxp
            public final /* synthetic */ void a(zzwp zzwpVar, zzbf zzbfVar) {
                zzww.this.s(num, zzwpVar, zzbfVar);
            }
        };
        hbp hbpVar = new hbp(this, num);
        hashMap.put(num, new jbp(zzxqVar, r1, hbpVar));
        Handler handler = this.j;
        handler.getClass();
        zzxqVar.a(handler, hbpVar);
        Handler handler2 = this.j;
        handler2.getClass();
        zzxqVar.m(handler2, hbpVar);
        zzqj zzqjVar = this.g;
        zzqjVar.getClass();
        zzabu zzabuVar = this.h;
        zzabuVar.getClass();
        zzxqVar.f(r1, zzqjVar, zzabuVar);
        if (this.b.isEmpty()) {
            zzxqVar.j(r1);
        }
    }

    public zzxo v(Object obj, zzxo zzxoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public void zzu() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((jbp) it.next()).a.zzu();
        }
    }

    public void u(Object obj) {
    }

    public void w(Object obj, long j) {
    }
}
