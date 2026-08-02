package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import defpackage.i8p;
import defpackage.mcp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzwp implements zzxq {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final zzxy c = new zzxy();
    public final zzun d = new zzun();
    public Looper e;
    public zzbf f;
    public zzqj g;
    public zzabu h;

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void a(Handler handler, zzxz zzxzVar) {
        zzxy zzxyVar = this.c;
        zzxyVar.getClass();
        zzxyVar.b.add(new mcp(handler, zzxzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void d(zzuo zzuoVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i8p i8pVar = (i8p) it.next();
            if (i8pVar.a == zzuoVar) {
                copyOnWriteArrayList.remove(i8pVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void e(zzxz zzxzVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            mcp mcpVar = (mcp) it.next();
            if (mcpVar.b == zzxzVar) {
                copyOnWriteArrayList.remove(mcpVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void f(zzxp zzxpVar, zzqj zzqjVar, zzabu zzabuVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzguk.a(z);
        this.g = zzqjVar;
        this.h = zzabuVar;
        zzbf zzbfVar = this.f;
        this.a.add(zzxpVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(zzxpVar);
            o(zzabuVar.zze());
        } else if (zzbfVar != null) {
            i(zzxpVar);
            zzxpVar.a(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void h(zzxp zzxpVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(zzxpVar);
        if (!arrayList.isEmpty()) {
            j(zzxpVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void i(zzxp zzxpVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzxpVar);
        if (isEmpty) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void j(zzxp zzxpVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(zzxpVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        p();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void m(Handler handler, zzuo zzuoVar) {
        zzun zzunVar = this.d;
        zzunVar.getClass();
        zzunVar.b.add(new i8p(zzuoVar));
    }

    public abstract void o(zziq zziqVar);

    public abstract void q();

    public final void r(zzbf zzbfVar) {
        this.f = zzbfVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzxp) arrayList.get(i)).a(this, zzbfVar);
        }
    }

    public void n() {
    }

    public void p() {
    }
}
