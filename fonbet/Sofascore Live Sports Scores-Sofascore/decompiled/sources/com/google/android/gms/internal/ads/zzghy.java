package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgid;
import defpackage.ddb;
import defpackage.slo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzghy {
    public final zzhdi a;
    public final zzgid b;
    public final Set c;
    public final String d;
    public final zzaya e;
    public final zzgiw f;
    public final zzgrh g;

    public zzghy(zzhdi zzhdiVar, zzgid zzgidVar, zzgiw zzgiwVar, zzgff zzgffVar, String str, zzaya zzayaVar, zzioi zzioiVar, zzioi zzioiVar2, zzioi zzioiVar3, zzgrh zzgrhVar) {
        this.a = zzhdiVar;
        this.b = zzgidVar;
        this.d = str;
        this.f = zzgiwVar;
        this.e = zzayaVar;
        this.g = zzgrhVar;
        int ordinal = zzgffVar.ordinal();
        if (ordinal == 0) {
            this.c = zzioiVar.zzb();
            return;
        }
        if (ordinal == 1) {
            this.c = zzioiVar2.zzb();
        } else if (ordinal == 2) {
            this.c = zzioiVar3.zzb();
        } else {
            defpackage.zzl.s();
            throw null;
        }
    }

    public final ddb a() {
        boolean z;
        zzhdi zzhdiVar = this.a;
        zzgid zzgidVar = this.b;
        synchronized (zzgidVar) {
            z = zzgidVar.d;
        }
        if (!z) {
            return zzhcy.a(Integer.toString(7));
        }
        if (!this.f.zzb()) {
            final int i = 1;
            return zzhcy.c(zzhdiVar, new Callable(this) { // from class: hdo
                public final /* synthetic */ zzghy b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String encodeToString;
                    int i2 = i;
                    zzghy zzghyVar = this.b;
                    switch (i2) {
                        case 0:
                            try {
                                zzghyVar.g.a(101).a();
                                zzaza zzazaVar = (zzaza) zzghyVar.e.o();
                                String str = zzghyVar.d;
                                zzgid zzgidVar2 = zzghyVar.b;
                                try {
                                    encodeToString = Base64.encodeToString(((zzazt) zzgidVar2.d(str, zzazaVar.d()).o()).d(), 11);
                                } catch (IllegalArgumentException unused) {
                                    zzgidVar2.getClass();
                                    zzaya G0 = zzaza.G0();
                                    G0.r(4096L);
                                    encodeToString = Base64.encodeToString(zzgidVar2.b(str, ((zzaza) G0.o()).d(), true), 11);
                                }
                                return encodeToString;
                            } finally {
                            }
                        default:
                            String str2 = zzghyVar.d;
                            zzgid zzgidVar3 = zzghyVar.b;
                            zzgidVar3.getClass();
                            zzaya G02 = zzaza.G0();
                            G02.r(16384L);
                            return Base64.encodeToString(zzgidVar3.b(str2, ((zzaza) G02.o()).d(), true), 11);
                    }
                }
            });
        }
        Set set = this.c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(zzhdiVar.submit((zzgjz) it.next()));
        }
        zzgxm x = zzgxm.x(arrayList);
        final int i2 = 0;
        return new zzhcx(x, false).a(slo.a, new Callable(this) { // from class: hdo
            public final /* synthetic */ zzghy b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String encodeToString;
                int i22 = i2;
                zzghy zzghyVar = this.b;
                switch (i22) {
                    case 0:
                        try {
                            zzghyVar.g.a(101).a();
                            zzaza zzazaVar = (zzaza) zzghyVar.e.o();
                            String str = zzghyVar.d;
                            zzgid zzgidVar2 = zzghyVar.b;
                            try {
                                encodeToString = Base64.encodeToString(((zzazt) zzgidVar2.d(str, zzazaVar.d()).o()).d(), 11);
                            } catch (IllegalArgumentException unused) {
                                zzgidVar2.getClass();
                                zzaya G0 = zzaza.G0();
                                G0.r(4096L);
                                encodeToString = Base64.encodeToString(zzgidVar2.b(str, ((zzaza) G0.o()).d(), true), 11);
                            }
                            return encodeToString;
                        } finally {
                        }
                    default:
                        String str2 = zzghyVar.d;
                        zzgid zzgidVar3 = zzghyVar.b;
                        zzgidVar3.getClass();
                        zzaya G02 = zzaza.G0();
                        G02.r(16384L);
                        return Base64.encodeToString(zzgidVar3.b(str2, ((zzaza) G02.o()).d(), true), 11);
                }
            }
        });
    }
}
