package com.google.android.gms.internal.measurement;

import defpackage.fn0;
import defpackage.hbo;
import defpackage.j8n;
import defpackage.oy1;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznd {
    public static final zznd c = new zznd(zzmw.b, zzmq.F());
    public final zzmw a;
    public final zzmq b;

    public zznd(zzmw zzmwVar, zzmq zzmqVar) {
        zzmwVar.getClass();
        this.a = zzmwVar;
        this.b = zzmqVar;
    }

    public static zznd a(zzacv zzacvVar, boolean z) {
        zzmw a;
        int C = zzacvVar.C();
        if (C > 1) {
            hbo.o(fn0.k(C, "Unsupported version: ", ". Current version is: 1", new StringBuilder(String.valueOf(C).length() + 44)));
            return null;
        }
        zzacvVar.C();
        int a2 = zzacvVar.a(zzacvVar.A());
        zzadf zzadfVar = zzadf.b;
        int i = j8n.a;
        zzmq E = zzmq.E(zzacvVar, zzadf.c);
        zzacvVar.b(a2);
        zzmu h = zzmu.h();
        Inflater inflater = h.a;
        try {
            if (!z) {
                inflater.setInput(zzacvVar.z());
                try {
                    a = zzmw.a(zzacv.h(new oy1(h, 5), 4096));
                    h.close();
                    return new zznd(a, E);
                } finally {
                }
            }
            int a3 = zzacvVar.a(zzacvVar.A());
            int c2 = zzacvVar.c();
            try {
                a = zzmw.a(zzacv.h(new InflaterInputStream(new oy1(h, zzacvVar), inflater, c2 < 0 ? 4096 : Math.min(c2, 4096)), 4096));
                inflater.reset();
                if (zzacvVar.c() != 0) {
                    throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                }
                zzacvVar.b(a3);
                h.close();
                return new zznd(a, E);
            } finally {
            }
        } finally {
            try {
                h.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }
}
