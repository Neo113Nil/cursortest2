package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzgfd;
import com.google.android.gms.internal.ads.zzgfg;
import com.google.android.gms.internal.ads.zzggq;
import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzggs;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgnu;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzifu;
import defpackage.bfo;
import defpackage.iko;
import defpackage.ilo;
import defpackage.mpo;
import defpackage.slo;
import defpackage.uko;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgnu implements zzgni {
    public final Context a;
    public final ExecutorService b;
    public final zzgfh c;
    public final String d;
    public final String e;
    public final zzgrh f;
    public final bfo g;
    public final int h;

    public zzgnu(Context context, ExecutorService executorService, zzgei zzgeiVar, zzgfh zzgfhVar, zzgrh zzgrhVar, bfo bfoVar) {
        this.a = context;
        this.b = executorService;
        this.c = zzgfhVar;
        this.f = zzgrhVar;
        this.g = bfoVar;
        this.d = zzgeiVar.V();
        int O = zzgeiVar.O();
        if (O == 1) {
            zzifz.a();
            throw null;
        }
        int i = O - 2;
        this.h = i != 0 ? i != 1 ? i != 2 ? 5 : 4 : 3 : 2;
        this.e = zzgeiVar.b0().F();
    }

    public static zzggr a(int i) {
        zzggq G = zzggr.G();
        G.n();
        ((zzggr) G.b).L(i);
        return (zzggr) G.o();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final zzhcq zza() {
        int i;
        zzbdz D = zzbea.D();
        byte[] a = zzavo.a();
        mpo mpoVar = zziei.b;
        final int i2 = 0;
        mpo B = zziei.B(0, a.length, a);
        D.n();
        ((zzbea) D.b).E(B);
        long j = Build.VERSION.SDK_INT;
        D.n();
        ((zzbea) D.b).F(j);
        String str = Build.MODEL;
        D.n();
        ((zzbea) D.b).G(str);
        Context context = this.a;
        String packageName = context.getPackageName();
        D.n();
        ((zzbea) D.b).H(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        D.n();
        ((zzbea) D.b).I(i);
        D.n();
        ((zzbea) D.b).J(this.d);
        D.n();
        ((zzbea) D.b).K(3);
        D.n();
        ((zzbea) D.b).L(this.h);
        byte[] d = ((zzbea) D.o()).d();
        iko ikoVar = zzhah.b;
        Character ch = ikoVar.e;
        zzhah zzhahVar = ikoVar;
        if (ch != null) {
            zzhahVar = ikoVar.h(ikoVar.d, null);
        }
        final int i3 = 2;
        ilo i4 = zzhcy.i(zzhcq.r(this.c.zza(Uri.parse(this.e).buildUpon().appendQueryParameter("aspq", zzhahVar.f(d.length, d)).build().toString())), new zzgub(this) { // from class: afo
            public final /* synthetic */ zzgnu b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                zzggr a2;
                int i5 = i3;
                zzgnu zzgnuVar = this.b;
                switch (i5) {
                    case 0:
                        zzgnuVar.f.b(20007);
                        return zzgnu.a(13);
                    case 1:
                        zzgnuVar.f.b(20008);
                        return zzgnu.a(13);
                    default:
                        zzgfg zzgfgVar = (zzgfg) obj;
                        zzgrh zzgrhVar = zzgnuVar.f;
                        if (zzgfgVar.zza() != 200) {
                            zzgrhVar.c(20003, new String(zzavo.a(), StandardCharsets.UTF_8));
                            return zzgnu.a(7);
                        }
                        try {
                            String zzb = zzgfgVar.zzb();
                            if (TextUtils.isEmpty(zzb)) {
                                zzgrhVar.b(20004);
                                a2 = zzgnu.a(8);
                            } else {
                                zzbec F = zzbec.F(zzgfd.a(zzb, true), zziew.a());
                                if (F.D().F() && F.D().D()) {
                                    if (zzgnuVar.g.a(F)) {
                                        zzggq G = zzggr.G();
                                        zzggs I = zzggt.I();
                                        zzbep E = F.D().E();
                                        I.n();
                                        ((zzggt) I.b).L(E);
                                        List E2 = F.E();
                                        I.n();
                                        ((zzggt) I.b).N((zzifu) E2);
                                        zzggt zzggtVar = (zzggt) I.o();
                                        G.n();
                                        ((zzggr) G.b).H(zzggtVar);
                                        zziei G2 = F.D().G();
                                        G.n();
                                        ((zzggr) G.b).I(G2);
                                        G.n();
                                        ((zzggr) G.b).L(2);
                                        a2 = (zzggr) G.o();
                                    } else {
                                        zzgrhVar.b(20006);
                                        a2 = zzgnu.a(12);
                                    }
                                }
                                zzgrhVar.b(20004);
                                a2 = zzgnu.a(8);
                            }
                            return a2;
                        } catch (Throwable th) {
                            zzgrhVar.d(20005, th);
                            return zzgnu.a(6);
                        }
                }
            }
        }, this.b);
        zzgub zzgubVar = new zzgub(this) { // from class: afo
            public final /* synthetic */ zzgnu b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                zzggr a2;
                int i5 = i2;
                zzgnu zzgnuVar = this.b;
                switch (i5) {
                    case 0:
                        zzgnuVar.f.b(20007);
                        return zzgnu.a(13);
                    case 1:
                        zzgnuVar.f.b(20008);
                        return zzgnu.a(13);
                    default:
                        zzgfg zzgfgVar = (zzgfg) obj;
                        zzgrh zzgrhVar = zzgnuVar.f;
                        if (zzgfgVar.zza() != 200) {
                            zzgrhVar.c(20003, new String(zzavo.a(), StandardCharsets.UTF_8));
                            return zzgnu.a(7);
                        }
                        try {
                            String zzb = zzgfgVar.zzb();
                            if (TextUtils.isEmpty(zzb)) {
                                zzgrhVar.b(20004);
                                a2 = zzgnu.a(8);
                            } else {
                                zzbec F = zzbec.F(zzgfd.a(zzb, true), zziew.a());
                                if (F.D().F() && F.D().D()) {
                                    if (zzgnuVar.g.a(F)) {
                                        zzggq G = zzggr.G();
                                        zzggs I = zzggt.I();
                                        zzbep E = F.D().E();
                                        I.n();
                                        ((zzggt) I.b).L(E);
                                        List E2 = F.E();
                                        I.n();
                                        ((zzggt) I.b).N((zzifu) E2);
                                        zzggt zzggtVar = (zzggt) I.o();
                                        G.n();
                                        ((zzggr) G.b).H(zzggtVar);
                                        zziei G2 = F.D().G();
                                        G.n();
                                        ((zzggr) G.b).I(G2);
                                        G.n();
                                        ((zzggr) G.b).L(2);
                                        a2 = (zzggr) G.o();
                                    } else {
                                        zzgrhVar.b(20006);
                                        a2 = zzgnu.a(12);
                                    }
                                }
                                zzgrhVar.b(20004);
                                a2 = zzgnu.a(8);
                            }
                            return a2;
                        } catch (Throwable th) {
                            zzgrhVar.d(20005, th);
                            return zzgnu.a(6);
                        }
                }
            }
        };
        slo sloVar = slo.a;
        final int i5 = 1;
        uko e = zzhcy.e(zzhcy.e(i4, UnknownHostException.class, zzgubVar, sloVar), SocketException.class, new zzgub(this) { // from class: afo
            public final /* synthetic */ zzgnu b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                zzggr a2;
                int i52 = i5;
                zzgnu zzgnuVar = this.b;
                switch (i52) {
                    case 0:
                        zzgnuVar.f.b(20007);
                        return zzgnu.a(13);
                    case 1:
                        zzgnuVar.f.b(20008);
                        return zzgnu.a(13);
                    default:
                        zzgfg zzgfgVar = (zzgfg) obj;
                        zzgrh zzgrhVar = zzgnuVar.f;
                        if (zzgfgVar.zza() != 200) {
                            zzgrhVar.c(20003, new String(zzavo.a(), StandardCharsets.UTF_8));
                            return zzgnu.a(7);
                        }
                        try {
                            String zzb = zzgfgVar.zzb();
                            if (TextUtils.isEmpty(zzb)) {
                                zzgrhVar.b(20004);
                                a2 = zzgnu.a(8);
                            } else {
                                zzbec F = zzbec.F(zzgfd.a(zzb, true), zziew.a());
                                if (F.D().F() && F.D().D()) {
                                    if (zzgnuVar.g.a(F)) {
                                        zzggq G = zzggr.G();
                                        zzggs I = zzggt.I();
                                        zzbep E = F.D().E();
                                        I.n();
                                        ((zzggt) I.b).L(E);
                                        List E2 = F.E();
                                        I.n();
                                        ((zzggt) I.b).N((zzifu) E2);
                                        zzggt zzggtVar = (zzggt) I.o();
                                        G.n();
                                        ((zzggr) G.b).H(zzggtVar);
                                        zziei G2 = F.D().G();
                                        G.n();
                                        ((zzggr) G.b).I(G2);
                                        G.n();
                                        ((zzggr) G.b).L(2);
                                        a2 = (zzggr) G.o();
                                    } else {
                                        zzgrhVar.b(20006);
                                        a2 = zzgnu.a(12);
                                    }
                                }
                                zzgrhVar.b(20004);
                                a2 = zzgnu.a(8);
                            }
                            return a2;
                        } catch (Throwable th) {
                            zzgrhVar.d(20005, th);
                            return zzgnu.a(6);
                        }
                }
            }
        }, sloVar);
        this.f.e(20002, e);
        return e;
    }
}
