package com.google.android.gms.internal.ads;

import defpackage.btn;
import defpackage.fn0;
import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavb extends zzinh implements Closeable {
    static {
        zzino.b(zzavb.class);
    }

    public zzavb(btn btnVar, zzava zzavaVar) {
        long zzb = btnVar.zzb();
        this.b = btnVar;
        this.d = btnVar.zzc();
        btnVar.l(btnVar.zzc() + zzb);
        this.e = btnVar.zzc();
        this.a = zzavaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzinh
    public final String toString() {
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(fn0.c(7, obj));
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzinh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
