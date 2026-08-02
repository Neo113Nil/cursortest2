package com.google.android.gms.internal.measurement;

import android.content.Context;
import defpackage.b0a;
import defpackage.kvd;
import defpackage.l49;
import defpackage.lvc;
import defpackage.owo;
import defpackage.tgj;
import defpackage.tmi;
import defpackage.wo0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlk {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile zzlk l = null;
    public static final tmi m = b0a.M(l49.b);
    public final zzol a = new zzol();
    public final Context b;
    public final tmi c;
    public final tmi d;
    public final tmi e;
    public final tmi f;
    public final zzrf g;
    public final tmi h;
    public final zzqe i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface zza {
        kvd zza();
    }

    public zzlk(Context context, tmi tmiVar, tmi tmiVar2, tmi tmiVar3, tmi tmiVar4, tmi tmiVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        tmiVar.getClass();
        tmiVar2.getClass();
        tmiVar3.getClass();
        tmiVar4.getClass();
        tmiVar5.getClass();
        tmi M = b0a.M(tmiVar);
        tmi M2 = b0a.M(tmiVar2);
        tmi M3 = b0a.M(new owo(tmiVar3, 0));
        tmi M4 = b0a.M(tmiVar4);
        tmi M5 = b0a.M(tmiVar5);
        this.b = applicationContext;
        this.c = M;
        this.d = M2;
        this.e = M3;
        this.f = M4;
        this.g = new zzrf(applicationContext, M, M4, M2);
        this.h = M5;
        this.i = new zzqe(applicationContext, M, M3, M2);
    }

    public static void b() {
        synchronized (tgj.i) {
        }
        if (k.get() == null && tgj.j == null) {
            tgj.j = new wo0();
        }
    }

    public final lvc a() {
        return (lvc) this.c.get();
    }
}
