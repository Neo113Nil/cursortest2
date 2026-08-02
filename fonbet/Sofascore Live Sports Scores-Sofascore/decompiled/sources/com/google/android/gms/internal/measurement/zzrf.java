package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import defpackage.b0a;
import defpackage.cn8;
import defpackage.ddb;
import defpackage.g8;
import defpackage.hd8;
import defpackage.hkg;
import defpackage.hv9;
import defpackage.iwo;
import defpackage.lvc;
import defpackage.o0p;
import defpackage.owo;
import defpackage.ru9;
import defpackage.tmi;
import java.io.IOException;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrf {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final tmi b;
    public final tmi c;
    public final tmi d;
    public final tmi e;
    public final tmi f;
    public final Uri g;
    public volatile zzni h;
    public final Uri i;

    public zzrf(Context context, tmi tmiVar, tmi tmiVar2, tmi tmiVar3) {
        this.a = context;
        this.c = tmiVar;
        this.b = tmiVar3;
        this.d = tmiVar2;
        Pattern pattern = zzsa.a;
        zzrz zzrzVar = new zzrz(context);
        zzrzVar.a("phenotype_storage_info");
        zzrzVar.b("storage-info.pb");
        this.g = zzrzVar.c();
        zzrz zzrzVar2 = new zzrz(context);
        zzrzVar2.a("phenotype_storage_info");
        zzrzVar2.b("device-encrypted-storage-info.pb");
        Set set = zzsa.d;
        zzsq.a(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        zzrzVar2.b = "directboot-files";
        this.i = zzrzVar2.c();
        int i = 1;
        this.e = b0a.M(new iwo(this, i));
        this.f = b0a.M(new owo(tmiVar, i));
    }

    public final void a() {
        if (!zzky.b(this.a) || c().C() + 86400000 >= System.currentTimeMillis()) {
            ru9 ru9Var = ru9.b;
            return;
        }
        lvc lvcVar = (lvc) this.c.get();
        lvcVar.getClass();
        ddb h0 = hkg.h0((ddb) this.f.get());
        int i = hd8.h;
        g8.q(h0 instanceof hd8 ? (hd8) h0 : new cn8(h0), new o0p(this, 2), lvcVar);
    }

    public final zzqn b() {
        zzni c = c();
        return new zzqn(c.A(), hv9.v(c.F()), c.z(), c.B(), (c.G() && c.H().z() == ((long) Build.VERSION.SDK_INT)) ? c.H().y() : "", hv9.v(c.D()), hv9.v(c.E()), c.y(), c.J(), c.I(), c.K());
    }

    public final zzni c() {
        zzni zzniVar;
        zzni zzniVar2 = this.h;
        if (zzniVar2 != null) {
            return zzniVar2;
        }
        synchronized (j) {
            try {
                zzniVar = this.h;
                if (zzniVar == null) {
                    zzniVar = zzni.M();
                    if (zzky.b(this.a)) {
                        zzss zzssVar = new zzss(zzniVar.m());
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            try {
                                zzni zzniVar3 = (zzni) ((zzru) this.d.get()).a(this.g, zzssVar);
                                StrictMode.setThreadPolicy(threadPolicy);
                                zzniVar = zzniVar3;
                            } catch (IOException unused) {
                            }
                            this.h = zzniVar;
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzniVar;
    }
}
