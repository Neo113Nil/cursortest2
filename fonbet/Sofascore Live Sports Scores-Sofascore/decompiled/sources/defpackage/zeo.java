package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfyr;
import com.google.android.gms.internal.ads.zzfzf;
import com.google.android.gms.internal.ads.zzfzw;
import com.google.android.gms.internal.ads.zzggq;
import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzggs;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgme;
import com.google.android.gms.internal.ads.zzgni;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzinq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zeo implements zzgni {
    public final Context a;
    public final zzinq b;
    public final zzgnz c;
    public final zzgrh d;
    public final ExecutorService e;
    public final zzgme f;
    public final zzfyi g;

    public zeo(Context context, zzinq zzinqVar, zzgnz zzgnzVar, zzgrh zzgrhVar, ExecutorService executorService, zzgme zzgmeVar, zzfyi zzfyiVar) {
        this.a = context;
        this.b = zzinqVar;
        this.c = zzgnzVar;
        this.d = zzgrhVar;
        this.e = executorService;
        this.f = zzgmeVar;
        this.g = zzfyiVar;
    }

    public static zzggr a(int i) {
        zzggq G = zzggr.G();
        G.n();
        ((zzggr) G.b).L(i);
        return (zzggr) G.o();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final zzhcq zza() {
        zzinq zzinqVar = this.b;
        Objects.requireNonNull(zzinqVar);
        q7o q7oVar = new q7o(zzinqVar, 14);
        ExecutorService executorService = this.e;
        zzhcq r = zzhcq.r(zzhcy.c(executorService, q7oVar));
        final int i = 1;
        zzgub zzgubVar = new zzgub(this) { // from class: yeo
            public final /* synthetic */ zeo b;

            {
                this.b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                int i2 = i;
                boolean z = false;
                zeo zeoVar = this.b;
                switch (i2) {
                    case 0:
                        zzggt zzggtVar = (zzggt) obj;
                        zzinq zzinqVar2 = zeoVar.b;
                        String D = zzggtVar.D().D();
                        String E = zzggtVar.D().E();
                        zzgrh zzgrhVar = zeoVar.d;
                        zzgrf a = zzgrhVar.a(15203);
                        try {
                            a.a();
                            zzfzw a2 = zzfyr.a(zeoVar.a, (zzbei) zzinqVar2.zzb(), D, E, zeoVar.g);
                            int i3 = a2.c;
                            a.c();
                            int i4 = 2;
                            if (i3 == 2) {
                                zzgrhVar.b(15208);
                                return zeo.a(4);
                            }
                            byte[] bArr = a2.b;
                            if (bArr == null || bArr.length == 0) {
                                zzgrhVar.b(IronSourceConstants.errorCode_destroy);
                                return zeo.a(8);
                            }
                            try {
                                zzbek H = zzbek.H(bArr, zziew.a());
                                if (H.D().D().isEmpty() || H.D().E().isEmpty() || H.F().d().length == 0) {
                                    zzgrhVar.b(15207);
                                } else {
                                    if (zzggtVar.equals(zzggt.J()) || !TextUtils.equals(zzggtVar.D().D(), H.D().D()) || !TextUtils.equals(zzggtVar.D().E(), H.D().E())) {
                                        if (i3 == 4) {
                                            zzgme zzgmeVar = zeoVar.f;
                                            byte[] d = H.E().d();
                                            File file = zzgmeVar.a;
                                            try {
                                                zzhat.b(file);
                                                zzhat.a(file, d);
                                                z = zzgmeVar.b.a(file);
                                            } catch (IOException | GeneralSecurityException e) {
                                                zzgmeVar.c.d(2027, e);
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z) {
                                                zzgrhVar.b(15206);
                                                return zeo.a(12);
                                            }
                                            i3 = 4;
                                        }
                                        zzggq G = zzggr.G();
                                        if (i3 == 2) {
                                            i4 = 4;
                                        } else if (i3 != 3) {
                                            i4 = i3 != 4 ? i3 != 6 ? 1 : 5 : 3;
                                        }
                                        G.n();
                                        ((zzggr) G.b).L(i4);
                                        zzggs I = zzggt.I();
                                        zzber D2 = H.D();
                                        I.n();
                                        ((zzggt) I.b).K(D2);
                                        zzbei zzbeiVar = (zzbei) zzinqVar2.zzb();
                                        I.n();
                                        ((zzggt) I.b).M(zzbeiVar);
                                        zzggt zzggtVar2 = (zzggt) I.o();
                                        G.n();
                                        ((zzggr) G.b).H(zzggtVar2);
                                        zziei E2 = H.E();
                                        G.n();
                                        ((zzggr) G.b).J(E2);
                                        zziei F = H.F();
                                        G.n();
                                        ((zzggr) G.b).I(F);
                                        return (zzggr) G.o();
                                    }
                                    zzgrhVar.b(15209);
                                }
                                return zeo.a(11);
                            } catch (zzige e2) {
                                zzgrhVar.d(15205, e2);
                                return zeo.a(9);
                            } catch (NullPointerException unused2) {
                                zzgrhVar.b(15210);
                                return zeo.a(10);
                            }
                        } catch (Throwable th) {
                            try {
                                a.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a.c();
                                throw th2;
                            }
                        }
                    default:
                        zzbei zzbeiVar2 = (zzbei) obj;
                        if (zzfzf.a(zzbeiVar2)) {
                            return new Integer(0);
                        }
                        zeoVar.d.c(15204, zzbeiVar2.name());
                        throw new xeo();
                }
            }
        };
        slo sloVar = slo.a;
        final int i2 = 0;
        uko e = zzhcy.e(zzhcy.i(zzhcy.h(zzhcy.i(r, zzgubVar, sloVar), new cpn(this, 16), sloVar), new zzgub(this) { // from class: yeo
            public final /* synthetic */ zeo b;

            {
                this.b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                int i22 = i2;
                boolean z = false;
                zeo zeoVar = this.b;
                switch (i22) {
                    case 0:
                        zzggt zzggtVar = (zzggt) obj;
                        zzinq zzinqVar2 = zeoVar.b;
                        String D = zzggtVar.D().D();
                        String E = zzggtVar.D().E();
                        zzgrh zzgrhVar = zeoVar.d;
                        zzgrf a = zzgrhVar.a(15203);
                        try {
                            a.a();
                            zzfzw a2 = zzfyr.a(zeoVar.a, (zzbei) zzinqVar2.zzb(), D, E, zeoVar.g);
                            int i3 = a2.c;
                            a.c();
                            int i4 = 2;
                            if (i3 == 2) {
                                zzgrhVar.b(15208);
                                return zeo.a(4);
                            }
                            byte[] bArr = a2.b;
                            if (bArr == null || bArr.length == 0) {
                                zzgrhVar.b(IronSourceConstants.errorCode_destroy);
                                return zeo.a(8);
                            }
                            try {
                                zzbek H = zzbek.H(bArr, zziew.a());
                                if (H.D().D().isEmpty() || H.D().E().isEmpty() || H.F().d().length == 0) {
                                    zzgrhVar.b(15207);
                                } else {
                                    if (zzggtVar.equals(zzggt.J()) || !TextUtils.equals(zzggtVar.D().D(), H.D().D()) || !TextUtils.equals(zzggtVar.D().E(), H.D().E())) {
                                        if (i3 == 4) {
                                            zzgme zzgmeVar = zeoVar.f;
                                            byte[] d = H.E().d();
                                            File file = zzgmeVar.a;
                                            try {
                                                zzhat.b(file);
                                                zzhat.a(file, d);
                                                z = zzgmeVar.b.a(file);
                                            } catch (IOException | GeneralSecurityException e2) {
                                                zzgmeVar.c.d(2027, e2);
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z) {
                                                zzgrhVar.b(15206);
                                                return zeo.a(12);
                                            }
                                            i3 = 4;
                                        }
                                        zzggq G = zzggr.G();
                                        if (i3 == 2) {
                                            i4 = 4;
                                        } else if (i3 != 3) {
                                            i4 = i3 != 4 ? i3 != 6 ? 1 : 5 : 3;
                                        }
                                        G.n();
                                        ((zzggr) G.b).L(i4);
                                        zzggs I = zzggt.I();
                                        zzber D2 = H.D();
                                        I.n();
                                        ((zzggt) I.b).K(D2);
                                        zzbei zzbeiVar = (zzbei) zzinqVar2.zzb();
                                        I.n();
                                        ((zzggt) I.b).M(zzbeiVar);
                                        zzggt zzggtVar2 = (zzggt) I.o();
                                        G.n();
                                        ((zzggr) G.b).H(zzggtVar2);
                                        zziei E2 = H.E();
                                        G.n();
                                        ((zzggr) G.b).J(E2);
                                        zziei F = H.F();
                                        G.n();
                                        ((zzggr) G.b).I(F);
                                        return (zzggr) G.o();
                                    }
                                    zzgrhVar.b(15209);
                                }
                                return zeo.a(11);
                            } catch (zzige e22) {
                                zzgrhVar.d(15205, e22);
                                return zeo.a(9);
                            } catch (NullPointerException unused2) {
                                zzgrhVar.b(15210);
                                return zeo.a(10);
                            }
                        } catch (Throwable th) {
                            try {
                                a.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a.c();
                                throw th2;
                            }
                        }
                    default:
                        zzbei zzbeiVar2 = (zzbei) obj;
                        if (zzfzf.a(zzbeiVar2)) {
                            return new Integer(0);
                        }
                        zeoVar.d.c(15204, zzbeiVar2.name());
                        throw new xeo();
                }
            }
        }, executorService), xeo.class, ueo.c, sloVar);
        this.d.e(15202, e);
        return e;
    }
}
