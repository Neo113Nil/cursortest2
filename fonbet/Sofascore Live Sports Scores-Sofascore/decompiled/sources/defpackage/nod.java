package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nod implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ Object e;

    public nod(ood oodVar, pg9 pg9Var) {
        this.a = 0;
        this.e = oodVar;
        Level level = Level.FINE;
        this.c = new by9(11);
        this.b = true;
        this.d = pg9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e;
        ood oodVar;
        xei xeiVar;
        switch (this.a) {
            case 0:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName("OkHttpClientTransport");
                while (true) {
                    try {
                        e = ((pg9) this.d).e(this);
                        oodVar = (ood) this.e;
                    } catch (Throwable th) {
                        try {
                            ood oodVar2 = (ood) this.e;
                            up5 up5Var = up5.PROTOCOL_ERROR;
                            xei g = xei.l.h("error in frame handler").g(th);
                            Map map = ood.P;
                            oodVar2.q(0, up5Var, g);
                            try {
                                ((pg9) this.d).close();
                            } catch (IOException e2) {
                                e = e2;
                                ood.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            } catch (RuntimeException e3) {
                                if (!"bio == null".equals(e3.getMessage())) {
                                    throw e3;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                ((pg9) this.d).close();
                            } catch (IOException e4) {
                                ood.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e4);
                            } catch (RuntimeException e5) {
                                if (!"bio == null".equals(e5.getMessage())) {
                                    throw e5;
                                }
                            }
                            ((ood) this.e).h.r();
                            Thread.currentThread().setName(name);
                            throw th2;
                        }
                    }
                    if (!e) {
                        synchronized (oodVar.k) {
                            xeiVar = ((ood) this.e).v;
                        }
                        if (xeiVar == null) {
                            xeiVar = xei.m.h("End of stream or IOException");
                        }
                        ((ood) this.e).q(0, up5.INTERNAL_ERROR, xeiVar);
                        try {
                            ((pg9) this.d).close();
                        } catch (IOException e6) {
                            e = e6;
                            ood.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e7) {
                            if (!"bio == null".equals(e7.getMessage())) {
                                throw e7;
                            }
                        }
                        ((ood) this.e).h.r();
                        Thread.currentThread().setName(name);
                        return;
                    }
                    oia oiaVar = oodVar.F;
                    if (oiaVar != null) {
                        oiaVar.a();
                    }
                }
            case 1:
                zznl zznlVar = (zznl) this.e;
                zzgb zzgbVar = zznlVar.e;
                if (zzgbVar != null) {
                    zznlVar.i0(zzgbVar, this.b ? null : (zzpl) this.d, (zzr) this.c);
                    zznlVar.d0();
                    return;
                } else {
                    zzgu zzguVar = ((zzic) zznlVar.b).f;
                    zzic.m(zzguVar);
                    zzguVar.g.a("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                zznl zznlVar2 = (zznl) this.e;
                zzgb zzgbVar2 = zznlVar2.e;
                if (zzgbVar2 != null) {
                    zznlVar2.i0(zzgbVar2, this.b ? null : (zzbh) this.d, (zzr) this.c);
                    zznlVar2.d0();
                    return;
                } else {
                    zzgu zzguVar2 = ((zzic) zznlVar2.b).f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                zznl zznlVar3 = (zznl) this.e;
                zzgb zzgbVar3 = zznlVar3.e;
                if (zzgbVar3 == null) {
                    zzgu zzguVar3 = ((zzic) zznlVar3.b).f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    zznlVar3.i0(zzgbVar3, this.b ? null : (zzah) this.d, (zzr) this.c);
                    zznlVar3.d0();
                    return;
                }
        }
    }

    public nod(zznl zznlVar, zzr zzrVar, boolean z, zzah zzahVar) {
        this.a = 3;
        this.c = zzrVar;
        this.b = z;
        this.d = zzahVar;
        Objects.requireNonNull(zznlVar);
        this.e = zznlVar;
    }

    public /* synthetic */ nod(zznl zznlVar, zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.c = zzrVar;
        this.b = z;
        this.d = abstractSafeParcelable;
        this.e = zznlVar;
    }
}
