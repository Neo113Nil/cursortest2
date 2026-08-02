package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.f0o;
import defpackage.hsn;
import defpackage.n5o;
import defpackage.vlo;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepl {
    public final Context a;
    public final zzfrg b;
    public final hsn c;
    public final ScheduledExecutorService d;
    public final zzcyo e;
    public final zzeqb f;
    public final zzfta g;
    public final zzhdr h = zzhdr.r();
    public final AtomicBoolean i = new AtomicBoolean();
    public n5o j;
    public zzflo k;

    public zzepl(Context context, zzfrg zzfrgVar, hsn hsnVar, ScheduledExecutorService scheduledExecutorService, zzcyo zzcyoVar, zzeqb zzeqbVar, zzfta zzftaVar) {
        this.a = context;
        this.b = zzfrgVar;
        this.c = hsnVar;
        this.d = scheduledExecutorService;
        this.e = zzcyoVar;
        this.f = zzeqbVar;
        this.g = zzftaVar;
    }

    public final void a(zzfld zzfldVar) {
        int i;
        ddb b;
        synchronized (this) {
            Iterator it = zzfldVar.a.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    b = zzhcy.b(new zzefb(3));
                    break;
                }
                zzemq a = this.e.a(zzfldVar.b, (String) it.next());
                if (a != null && a.b(this.k, zzfldVar)) {
                    b = zzhcy.g(a.a(this.k, zzfldVar), zzfldVar.R, TimeUnit.MILLISECONDS, this.d);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ra)).booleanValue()) {
                        zzfqw e = zzfqw.e(12, this.a);
                        e.zzi(zzfldVar.E);
                        e.zza();
                        zzfrf.c(b, this.b, e, false);
                    }
                }
            }
        }
        this.f.b(this.k, zzfldVar, b, this.g);
        b.addListener(new vlo(i, b, new f0o(this, zzfldVar, false, 10)), this.c);
    }
}
