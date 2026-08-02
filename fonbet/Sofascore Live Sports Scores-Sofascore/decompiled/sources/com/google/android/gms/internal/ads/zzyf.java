package com.google.android.gms.internal.ads;

import defpackage.ajo;
import defpackage.djo;
import defpackage.jdp;
import defpackage.ldp;
import defpackage.rfp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzyf extends zzww {
    public static final zzak r;
    public final zzxq[] k;
    public final ArrayList l;
    public final zzbf[] m;
    public final ArrayList n;
    public int o = -1;
    public long[][] p;
    public zzyd q;

    static {
        zzz zzzVar = new zzz();
        zzzVar.a = "MergingMediaSource";
        r = zzzVar.a();
    }

    public zzyf(zzwz zzwzVar, zzxq... zzxqVarArr) {
        this.k = zzxqVarArr;
        this.n = new ArrayList(Arrays.asList(zzxqVarArr));
        this.l = new ArrayList(zzxqVarArr.length);
        int i = 0;
        while (true) {
            int length = zzxqVarArr.length;
            if (i >= length) {
                this.m = new zzbf[length];
                this.p = new long[0][];
                new HashMap();
                ajo ajoVar = new ajo();
                new djo(ajoVar);
                zzguk.a(ajoVar.a().isEmpty());
                return;
            }
            this.l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzak b() {
        zzxq[] zzxqVarArr = this.k;
        return zzxqVarArr.length > 0 ? zzxqVarArr[0].b() : r;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void c(zzxm zzxmVar) {
        jdp jdpVar = (jdp) zzxmVar;
        int i = 0;
        while (true) {
            zzxq[] zzxqVarArr = this.k;
            if (i >= zzxqVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = jdpVar.b;
            zzxm[] zzxmVarArr = jdpVar.a;
            zzxm zzxmVar2 = zArr[i] ? ((rfp) zzxmVarArr[i]).a : zzxmVarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((ldp) list.get(i2)).b.equals(zzxmVar2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzxqVarArr[i].c(jdpVar.b[i] ? ((rfp) zzxmVarArr[i]).a : zzxmVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void g(zzak zzakVar) {
        this.k[0].g(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxm k(zzxo zzxoVar, zzabp zzabpVar, long j) {
        zzxq[] zzxqVarArr = this.k;
        int length = zzxqVarArr.length;
        zzxm[] zzxmVarArr = new zzxm[length];
        zzbf[] zzbfVarArr = this.m;
        int e = zzbfVarArr[0].e(zzxoVar.a);
        for (int i = 0; i < length; i++) {
            zzxo a = zzxoVar.a(zzbfVarArr[i].f(e));
            zzxmVarArr[i] = zzxqVarArr[i].k(a, zzabpVar, j - this.p[e][i]);
            ((List) this.l.get(i)).add(new ldp(a, zzxmVarArr[i]));
        }
        return new jdp(this.p[e], zzxmVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzwp
    public final void o(zziq zziqVar) {
        super.o(zziqVar);
        int i = 0;
        while (true) {
            zzxq[] zzxqVarArr = this.k;
            if (i >= zzxqVarArr.length) {
                return;
            }
            t(Integer.valueOf(i), zzxqVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzwp
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void s(Object obj, zzwp zzwpVar, zzbf zzbfVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            i = zzbfVar.c();
            this.o = i;
        } else {
            int c = zzbfVar.c();
            int i2 = this.o;
            if (c != i2) {
                this.q = new zzyd();
                return;
            }
            i = i2;
        }
        int length = this.p.length;
        zzbf[] zzbfVarArr = this.m;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, zzbfVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(zzwpVar);
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            r(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final /* synthetic */ zzxo v(Object obj, zzxo zzxoVar) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ldp) list.get(i)).a.equals(zzxoVar)) {
                return ((ldp) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzxq
    public final void zzu() {
        zzyd zzydVar = this.q;
        if (zzydVar != null) {
            throw zzydVar;
        }
        super.zzu();
    }
}
