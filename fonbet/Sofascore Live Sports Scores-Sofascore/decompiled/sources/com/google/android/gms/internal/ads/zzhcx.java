package com.google.android.gms.internal.ads;

import defpackage.qlo;
import defpackage.rlo;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhcx {
    public final boolean a;
    public final zzgxm b;

    public /* synthetic */ zzhcx(zzgxm zzgxmVar, boolean z) {
        this.a = z;
        this.b = zzgxmVar;
    }

    public final rlo a(Executor executor, Callable callable) {
        rlo rloVar = new rlo(this.b, this.a, false);
        rloVar.p = new qlo(rloVar, callable, executor);
        rloVar.v();
        return rloVar;
    }
}
