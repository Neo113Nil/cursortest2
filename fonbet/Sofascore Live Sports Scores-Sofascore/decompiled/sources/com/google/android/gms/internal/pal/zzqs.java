package com.google.android.gms.internal.pal;

import defpackage.g3p;
import defpackage.n0p;
import defpackage.n3p;
import defpackage.t0p;
import defpackage.w1p;
import defpackage.y1p;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqs {
    static {
        new zzqr();
        int i = zzwx.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zzlf.c(new n3p());
        zzlf.b(new zzqr());
        if (zznb.a()) {
            return;
        }
        zzlf.b(new zzqh());
        y1p y1pVar = g3p.a;
        zzpj zzpjVar = zzpj.b;
        y1p y1pVar2 = g3p.a;
        synchronized (zzpjVar) {
            zzpv zzpvVar = new zzpv((zzqb) zzpjVar.a.get());
            zzpvVar.d(y1pVar2);
            zzpjVar.a.set(new zzqb(zzpvVar));
        }
        w1p w1pVar = g3p.b;
        synchronized (zzpjVar) {
            zzpv zzpvVar2 = new zzpv((zzqb) zzpjVar.a.get());
            zzpvVar2.c(w1pVar);
            zzpjVar.a.set(new zzqb(zzpvVar2));
        }
        t0p t0pVar = g3p.c;
        synchronized (zzpjVar) {
            zzpv zzpvVar3 = new zzpv((zzqb) zzpjVar.a.get());
            zzpvVar3.b(t0pVar);
            zzpjVar.a.set(new zzqb(zzpvVar3));
        }
        n0p n0pVar = g3p.d;
        synchronized (zzpjVar) {
            zzpv zzpvVar4 = new zzpv((zzqb) zzpjVar.a.get());
            zzpvVar4.a(n0pVar);
            zzpjVar.a.set(new zzqb(zzpvVar4));
        }
    }
}
