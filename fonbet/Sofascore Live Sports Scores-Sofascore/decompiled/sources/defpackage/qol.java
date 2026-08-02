package defpackage;

import com.ironsource.Ua;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qol extends s18 {
    public static final uae f;
    public final uae c;
    public final s18 d;
    public final LinkedHashMap e;

    static {
        String str = uae.b;
        f = tnf.j("/", false);
    }

    public qol(uae uaeVar, s18 s18Var, LinkedHashMap linkedHashMap) {
        s18Var.getClass();
        this.c = uaeVar;
        this.d = s18Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.s18
    public final tha C(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.s18
    public final ejh H(uae uaeVar, boolean z) {
        uaeVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s18
    public final cwh M(uae uaeVar) {
        Throwable th;
        lof lofVar;
        uaeVar.getClass();
        uae uaeVar2 = f;
        uaeVar2.getClass();
        pol polVar = (pol) this.e.get(i.a(uaeVar2, uaeVar, true));
        if (polVar == null) {
            hg6.h(uaeVar, "no such file: ");
            return null;
        }
        long j = polVar.f;
        tha t = this.d.t(this.c);
        try {
            lofVar = new lof(t.f(polVar.h));
            try {
                t.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th4) {
                    de6.a(th3, th4);
                }
            }
            th = th3;
            lofVar = null;
        }
        if (th != null) {
            throw th;
        }
        lofVar.getClass();
        qha.M(lofVar, null);
        if (polVar.g == 0) {
            return new j68(lofVar, j, true);
        }
        return new j68(new n2a(new lof(new j68(lofVar, polVar.e, true)), new Inflater(true)), j, false);
    }

    @Override // defpackage.s18
    public final ejh e(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s18
    public final void f(uae uaeVar, uae uaeVar2) {
        uaeVar.getClass();
        uaeVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s18
    public final void h(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s18
    public final void i(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s18
    public final List m(uae uaeVar) {
        uaeVar.getClass();
        uae uaeVar2 = f;
        uaeVar2.getClass();
        pol polVar = (pol) this.e.get(i.a(uaeVar2, uaeVar, true));
        if (polVar == null) {
            yhk.u(uaeVar, "not a directory: ");
            return null;
        }
        List S0 = CollectionsKt.S0(polVar.q);
        S0.getClass();
        return S0;
    }

    @Override // defpackage.s18
    public final ux4 p(uae uaeVar) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf;
        Throwable th;
        Throwable th2;
        uaeVar.getClass();
        uae uaeVar2 = f;
        uaeVar2.getClass();
        pol polVar = (pol) this.e.get(i.a(uaeVar2, uaeVar, true));
        if (polVar == null) {
            return null;
        }
        long j = polVar.h;
        if (j != -1) {
            tha t = this.d.t(this.c);
            try {
                lof lofVar = new lof(t.f(j));
                try {
                    polVar = qha.M(lofVar, polVar);
                    polVar.getClass();
                    try {
                        lofVar.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        lofVar.close();
                    } catch (Throwable th5) {
                        de6.a(th4, th5);
                    }
                    th2 = th4;
                    polVar = null;
                }
            } catch (Throwable th6) {
                if (t != null) {
                    try {
                        t.close();
                    } catch (Throwable th7) {
                        de6.a(th6, th7);
                    }
                }
                th = th6;
                polVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                t.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z2 = polVar.b;
        boolean z3 = !z2;
        Long valueOf2 = z2 ? null : Long.valueOf(polVar.f);
        Long l4 = polVar.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / Ua.s) - 11644473600000L);
            z = true;
        } else {
            if (polVar.p != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = polVar.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / Ua.s) - 11644473600000L);
        } else {
            if (polVar.n != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = polVar.j;
                if (i != -1) {
                    int i2 = polVar.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = polVar.l;
        if (l6 != null) {
            valueOf = Long.valueOf((l6.longValue() / Ua.s) - 11644473600000L);
        } else {
            if (polVar.o == null) {
                l3 = null;
                return new ux4(z3, z2, null, valueOf2, l, l2, l3);
            }
            valueOf = Long.valueOf(r1.intValue() * 1000);
        }
        l3 = valueOf;
        return new ux4(z3, z2, null, valueOf2, l, l2, l3);
    }

    @Override // defpackage.s18
    public final tha t(uae uaeVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
