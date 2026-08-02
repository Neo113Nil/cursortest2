package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import defpackage.mio;
import defpackage.qpk;
import defpackage.x9n;
import defpackage.yan;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadz implements zzbt {
    public final Context a;
    public final yan b;
    public final SparseArray c;
    public final boolean d;
    public final x9n e;
    public final zzdp f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final qpk i;
    public zzfi j = new zzfi(0);
    public zzea k;
    public Pair l;
    public int m;
    public int n;

    public zzadz(zzadr zzadrVar) {
        this.a = zzadrVar.a;
        yan yanVar = zzadrVar.c;
        yanVar.getClass();
        this.b = yanVar;
        this.c = new SparseArray();
        mio mioVar = zzgxm.b;
        s sVar = s.e;
        this.d = zzadrVar.d;
        zzdp zzdpVar = zzadrVar.e;
        this.f = zzdpVar;
        this.h = -zzadrVar.g;
        qpk qpkVar = zzadrVar.h;
        this.i = qpkVar;
        this.e = new x9n(zzadrVar.b, qpkVar, zzdpVar);
        this.g = new CopyOnWriteArraySet();
        new zzv(new zzt());
        this.n = 0;
    }
}
