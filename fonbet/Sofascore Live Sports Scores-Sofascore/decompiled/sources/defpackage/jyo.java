package defpackage;

import android.app.job.JobParameters;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.internal.zzx;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zzma;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzqf;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zzvz;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzpp;
import com.ironsource.W3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jyo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public jyo(y9p y9pVar, zzx zzxVar, zzac zzacVar) {
        this.a = 6;
        this.b = zzxVar;
        this.c = zzacVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.c;
                zzpp zzppVar = appMeasurementDynamiteService.a.i;
                zzic.k(zzppVar);
                zzic zzicVar = appMeasurementDynamiteService.a;
                zzppVar.H0((zzcs) this.b, zzicVar.y != null && zzicVar.y.booleanValue());
                break;
            case 1:
                zznl zznlVar = ((zznf) this.c).c;
                zznlVar.e = null;
                if (((ConnectionResult) this.b).b != 7777) {
                    zznlVar.f0();
                    break;
                } else {
                    ScheduledExecutorService scheduledExecutorService = zznlVar.h;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.newScheduledThreadPool(1);
                        zznlVar.h = scheduledExecutorService;
                    }
                    scheduledExecutorService.schedule(new dno(this, 10), ((Long) zzfy.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                    break;
                }
            case 2:
                ((zznp) ((zznt) this.b).a).c((JobParameters) this.c);
                break;
            case 3:
                ((zzqf) this.b).u((NetworkEvent) this.c);
                break;
            case 4:
                ((zzqf) this.b).x((PlaybackMetrics) this.c);
                break;
            case 5:
                zzry zzryVar = (zzry) this.b;
                synchronized (((zzje) this.c)) {
                }
                String str = zzfm.a;
                zzpv zzpvVar = zzryVar.b.a.q;
                zzpvVar.n(zzpvVar.q((zzxo) zzpvVar.d.f), W3.i, new jpe(27));
                break;
            case 6:
                zzx zzxVar = (zzx) this.b;
                zzac zzacVar = (zzac) this.c;
                t8p t8pVar = zzxVar.K;
                ApplicationMetadata applicationMetadata = zzacVar.d;
                zzao zzaoVar = zzacVar.f;
                if (!CastUtils.c(applicationMetadata, zzxVar.I)) {
                    zzxVar.I = applicationMetadata;
                    t8pVar.c(applicationMetadata);
                }
                double d = zzacVar.a;
                if (Double.isNaN(d) || Math.abs(d - zzxVar.S) <= 1.0E-7d) {
                    z = false;
                } else {
                    zzxVar.S = d;
                    z = true;
                }
                boolean z5 = zzacVar.b;
                if (z5 != zzxVar.P) {
                    zzxVar.P = z5;
                    z = true;
                }
                Double.isNaN(zzacVar.g);
                Logger logger = zzx.a0;
                logger.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(zzxVar.R));
                if (t8pVar != null && (z || zzxVar.R)) {
                    t8pVar.g();
                }
                int i = zzacVar.c;
                if (i != zzxVar.U) {
                    zzxVar.U = i;
                    z2 = true;
                } else {
                    z2 = false;
                }
                logger.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zzxVar.R));
                if (t8pVar != null && (z2 || zzxVar.R)) {
                    t8pVar.a(zzxVar.U);
                }
                int i2 = zzacVar.e;
                if (i2 != zzxVar.V) {
                    zzxVar.V = i2;
                } else {
                    z3 = false;
                }
                logger.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(zzxVar.R));
                if (t8pVar != null && (z3 || zzxVar.R)) {
                    t8pVar.f(zzxVar.V);
                }
                if (!CastUtils.c(zzxVar.T, zzaoVar)) {
                    zzxVar.T = zzaoVar;
                }
                zzxVar.R = false;
                break;
            case 7:
                zzvz zzvzVar = (zzvz) this.b;
                zzvzVar.C.set(zzvzVar.r((zzma) this.c, zzvzVar.w, 0));
                break;
            case 8:
                rfn rfnVar = (rfn) this.b;
                Bundle bundle = (Bundle) this.c;
                try {
                    ako akoVar = (ako) ((IInterface) rfnVar.b.k);
                    if (akoVar != null) {
                        o4n o4nVar = rfnVar.d;
                        a7o a7oVar = (a7o) akoVar;
                        Parcel J = a7oVar.J();
                        int i3 = zzc.a;
                        J.writeInt(1);
                        bundle.writeToParcel(J, 0);
                        if (o4nVar == null) {
                            J.writeStrongBinder(null);
                        } else {
                            J.writeStrongBinder(o4nVar);
                        }
                        a7oVar.S1(J, 4);
                        break;
                    } else {
                        break;
                    }
                } catch (DeadObjectException | RemoteException unused) {
                    return;
                }
            default:
                kep kepVar = (kep) this.b;
                zzahk zzahkVar = (zzahk) this.c;
                kepVar.z = kepVar.q == null ? zzahkVar : new zzahj(C.TIME_UNSET, 0L);
                kepVar.A = zzahkVar.zza();
                if (!kepVar.H && zzahkVar.zza() == C.TIME_UNSET) {
                    z4 = true;
                }
                kepVar.B = z4;
                kepVar.C = true == z4 ? 7 : 1;
                if (!kepVar.v) {
                    kepVar.o();
                    break;
                } else {
                    kepVar.f.s(kepVar.A, zzahkVar, z4);
                    break;
                }
        }
    }

    public /* synthetic */ jyo(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ jyo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }
}
