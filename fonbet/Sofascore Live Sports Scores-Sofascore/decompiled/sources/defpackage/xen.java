package defpackage;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzagr;
import com.google.android.gms.internal.measurement.zzlg;
import com.google.android.gms.internal.measurement.zzmg;
import com.google.android.gms.internal.measurement.zzmi;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zznh;
import com.google.android.gms.internal.measurement.zzni;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzqw;
import com.google.android.gms.internal.measurement.zzqx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xen implements xs8 {
    public static final /* synthetic */ xen b = new xen(0);
    public static final /* synthetic */ xen c = new xen(1);
    public static final /* synthetic */ xen d = new xen(2);
    public static final /* synthetic */ xen e = new xen(3);
    public final /* synthetic */ int a;

    public /* synthetic */ xen(int i) {
        this.a = i;
    }

    @Override // defpackage.xs8
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                String str = zzagr.b;
                if (str == null) {
                    synchronized (zzagr.class) {
                        try {
                            str = zzagr.b;
                            if (str == null) {
                                str = zzlg.b(context, "com.google.android.gms.measurement");
                                zzagr.b = str;
                            }
                        } finally {
                        }
                    }
                }
                return str;
            case 1:
                zzpe zzpeVar = zzpg.h;
                return "";
            case 2:
                zzmg zzmgVar = (zzmg) obj;
                zzqu E = zzqv.E();
                if (zzmgVar == null) {
                    return (zzqv) E.m();
                }
                for (zzmi zzmiVar : zzmgVar.C()) {
                    zzqw E2 = zzqx.E();
                    String y = zzmiVar.y();
                    E2.k();
                    ((zzqx) E2.b).F(y);
                    int M = zzmiVar.M();
                    int i = M - 1;
                    if (M == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long z = zzmiVar.z();
                        E2.k();
                        ((zzqx) E2.b).G(z);
                    } else if (i == 1) {
                        boolean A = zzmiVar.A();
                        E2.k();
                        ((zzqx) E2.b).H(A);
                    } else if (i == 2) {
                        double B = zzmiVar.B();
                        E2.k();
                        ((zzqx) E2.b).I(B);
                    } else if (i == 3) {
                        String C = zzmiVar.C();
                        E2.k();
                        ((zzqx) E2.b).J(C);
                    } else {
                        if (i != 4) {
                            a70.r("No known flag type");
                            return null;
                        }
                        zzacr D = zzmiVar.D();
                        E2.k();
                        ((zzqx) E2.b).K(D);
                    }
                    zzqx zzqxVar = (zzqx) E2.m();
                    E.k();
                    ((zzqv) E.b).K(zzqxVar);
                }
                String B2 = zzmgVar.B();
                E.k();
                ((zzqv) E.b).I(B2);
                String y2 = zzmgVar.y();
                E.k();
                ((zzqv) E.b).G(y2);
                long D2 = zzmgVar.D();
                E.k();
                ((zzqv) E.b).J(D2);
                if (zzmgVar.z()) {
                    zzacr A2 = zzmgVar.A();
                    E.k();
                    ((zzqv) E.b).H(A2);
                }
                return (zzqv) E.m();
            default:
                zzmk zzmkVar = (zzmk) obj;
                if (zzmkVar.a != 29514) {
                    throw zzmkVar;
                }
                zznn B3 = zzno.B();
                zznh L = zzni.L();
                long currentTimeMillis = System.currentTimeMillis();
                L.k();
                ((zzni) L.b).N(currentTimeMillis);
                B3.k();
                ((zzno) B3.b).C((zzni) L.m());
                return (zzno) B3.m();
        }
    }
}
