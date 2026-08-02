package com.google.android.gms.internal.ads;

import defpackage.c0l;
import defpackage.ewm;
import defpackage.hsn;
import defpackage.vlo;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public class zzcgv {
    public final zzcgo a;
    public final AtomicInteger b;

    public zzcgv() {
        zzcgo zzcgoVar = new zzcgo();
        this.a = zzcgoVar;
        this.b = new AtomicInteger(0);
        ewm ewmVar = new ewm(this, 9);
        zzcgoVar.addListener(new vlo(0, zzcgoVar, ewmVar), zzcgj.h);
    }

    public final void a(zzcgs zzcgsVar, zzcgq zzcgqVar) {
        c0l c0lVar = new c0l(21, this, zzcgsVar, zzcgqVar);
        hsn hsnVar = zzcgj.h;
        zzcgo zzcgoVar = this.a;
        zzcgoVar.addListener(new vlo(0, zzcgoVar, c0lVar), hsnVar);
    }

    public final void b() {
        this.a.zzd(new Exception());
    }

    public final void c(String str, Throwable th) {
        this.a.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L8)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().e(str, th);
        }
    }
}
