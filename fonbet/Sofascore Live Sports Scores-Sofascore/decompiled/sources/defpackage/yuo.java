package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.os.Handler;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzx;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzlv;
import com.google.android.gms.internal.ads.zzqf;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzqm;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.DataEventBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yuo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public yuo(zznl zznlVar, zzlu zzluVar) {
        this.a = 2;
        this.b = zzluVar;
        Objects.requireNonNull(zznlVar);
        this.c = zznlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0 A[Catch: CancellationException -> 0x00c4, ExecutionException -> 0x00c7, TryCatch #8 {CancellationException -> 0x00c4, ExecutionException -> 0x00c7, blocks: (B:38:0x00a7, B:40:0x00bf, B:43:0x00d2, B:45:0x00e0, B:47:0x00ec, B:50:0x00fd, B:52:0x0101, B:55:0x00c9, B:67:0x012e), top: B:37:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101 A[Catch: CancellationException -> 0x00c4, ExecutionException -> 0x00c7, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x00c4, ExecutionException -> 0x00c7, blocks: (B:38:0x00a7, B:40:0x00bf, B:43:0x00d2, B:45:0x00e0, B:47:0x00ec, B:50:0x00fd, B:52:0x0101, B:55:0x00c9, B:67:0x012e), top: B:37:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        long j;
        boolean z;
        n72 n72Var;
        int i2 = 1;
        boolean z2 = true;
        i2 = 1;
        switch (this.a) {
            case 0:
                cwo cwoVar = (cwo) this.b;
                zzlv zzlvVar = (zzlv) this.c;
                int i3 = cwoVar.E - zzlvVar.c;
                cwoVar.E = i3;
                if (zzlvVar.d) {
                    cwoVar.F = zzlvVar.e;
                    cwoVar.G = true;
                }
                if (i3 == 0) {
                    zzbf zzbfVar = zzlvVar.b.a;
                    int i4 = -1;
                    if (!cwoVar.V.a.g() && zzbfVar.g()) {
                        cwoVar.W = -1;
                        cwoVar.X = 0L;
                    }
                    if (!zzbfVar.g()) {
                        List asList = Arrays.asList(((tyo) zzbfVar).h);
                        int size = asList.size();
                        ArrayList arrayList = cwoVar.o;
                        zzguk.f(size == arrayList.size());
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((uvo) arrayList.get(i5)).b = (zzbf) asList.get(i5);
                        }
                    }
                    boolean z3 = cwoVar.G;
                    long j2 = C.TIME_UNSET;
                    if (z3) {
                        Object[] objArr = zzlvVar.b.a.g() && cwoVar.V.a.g();
                        boolean c = zzlvVar.b.b.c(cwoVar.V.b);
                        long j3 = zzlvVar.b.d;
                        long j4 = cwoVar.V.r;
                        if (objArr != false || (c && j3 == j4)) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            i4 = cwoVar.zzs();
                            if (zzbfVar.g() || zzlvVar.b.b.b()) {
                                j2 = zzlvVar.b.d;
                            } else {
                                eyo eyoVar = zzlvVar.b;
                                zzxo zzxoVar = eyoVar.b;
                                long j5 = eyoVar.d;
                                zzbfVar.o(zzxoVar.a, cwoVar.n);
                                j2 = j5;
                            }
                        }
                        i = i4;
                        j = j2;
                        z = i2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = false;
                    }
                    cwoVar.G = false;
                    cwoVar.h(zzlvVar.b, 1, z, cwoVar.F, j, i);
                    return;
                }
                return;
            case 1:
                zznl zznlVar = (zznl) this.c;
                zzic zzicVar = (zzic) zznlVar.b;
                zzgb zzgbVar = zznlVar.e;
                if (zzgbVar == null) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.a("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        zzgbVar.B2((zzr) this.b);
                    } catch (RemoteException e) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.b(e, "Failed to reset data on the service: remote exception");
                    }
                    zznlVar.d0();
                    return;
                }
            case 2:
                zznl zznlVar2 = (zznl) this.c;
                zzgb zzgbVar2 = zznlVar2.e;
                zzic zzicVar2 = (zzic) zznlVar2.b;
                if (zzgbVar2 == null) {
                    zzgu zzguVar3 = zzicVar2.f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.a("Failed to send current screen to service");
                    return;
                }
                try {
                    zzlu zzluVar = (zzlu) this.b;
                    if (zzluVar == null) {
                        zzgbVar2.y2(0L, null, null, zzicVar2.a.getPackageName());
                    } else {
                        zzgbVar2.y2(zzluVar.c, zzluVar.a, zzluVar.b, zzicVar2.a.getPackageName());
                    }
                    zznlVar2.d0();
                    return;
                } catch (RemoteException e2) {
                    zzgu zzguVar4 = ((zzic) zznlVar2.b).f;
                    zzic.m(zzguVar4);
                    zzguVar4.g.b(e2, "Failed to send current screen to the service");
                    return;
                }
            case 3:
                zznf zznfVar = (zznf) this.c;
                synchronized (zznfVar) {
                    try {
                        zznfVar.a = false;
                        zznl zznlVar3 = zznfVar.c;
                        if (!zznlVar3.h0()) {
                            zzgu zzguVar5 = ((zzic) zznlVar3.b).f;
                            zzic.m(zzguVar5);
                            zzguVar5.o.a("Connected to service");
                            zzgb zzgbVar3 = (zzgb) this.b;
                            zznlVar3.Q();
                            zznlVar3.e = zzgbVar3;
                            zznlVar3.d0();
                            zznlVar3.f0();
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                s3p s3pVar = (s3p) this.c;
                b1p b1pVar = (b1p) this.b;
                int i6 = s3pVar.a;
                synchronized (b1pVar) {
                    SparseArray sparseArray = b1pVar.e;
                    s3p s3pVar2 = (s3p) sparseArray.get(i6);
                    if (s3pVar2 != null) {
                        new StringBuilder(String.valueOf(i6).length() + 20);
                        sparseArray.remove(i6);
                        s3pVar2.c(new zzt("Timed out waiting for response", null));
                        b1pVar.l();
                    }
                }
                return;
            case 5:
                ((TaskCompletionSource) this.c).setResult(u0p.a((Context) this.b, "GLAS"));
                return;
            case 6:
                zzpg zzpgVar = (zzpg) this.b;
                try {
                    zzqv zzqvVar = (zzqv) hkg.P((f8) this.c);
                    n72 n72Var2 = new n72(zzqvVar, new uif(6, 2, 17));
                    boolean z4 = zzpgVar.d;
                    if (!z4) {
                        n72Var = zzpgVar.a;
                        if (n72Var == null) {
                        }
                        if (!aik.H((awf) n72Var2.d, (awf) n72Var.d)) {
                            zzqm zzqmVar = (zzqm) zzpgVar.b.e.get();
                            if (zzqmVar != null) {
                                zzqmVar.zza();
                                return;
                            }
                            return;
                        }
                        if (zzpgVar.d) {
                            return;
                        }
                        zzlk zzlkVar = zzpgVar.b;
                        b1 zzb = ((zzmj) zzlkVar.d.get()).zzb(zzqvVar.y());
                        nub nubVar = new nub(zzpgVar, i2);
                        lvc a = zzlkVar.a();
                        int i7 = d1.l;
                        c1 c1Var = new c1(zzb, Throwable.class, nubVar);
                        zzb.addListener(c1Var, oea.u(a, c1Var));
                        return;
                    }
                    synchronized (zzpgVar) {
                        if (!z4) {
                            n72Var = zzpgVar.a;
                            if (n72Var != null) {
                                if (!aik.H((awf) n72Var2.d, (awf) n72Var.d)) {
                                }
                            }
                        }
                        zzpgVar.a = n72Var2;
                        zzpgVar.f.a.incrementAndGet();
                    }
                    if (zzpgVar.d) {
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    if (e.getCause() instanceof SecurityException) {
                        new StringBuilder(String.valueOf(zzpgVar.c).length() + 64);
                        return;
                    }
                    return;
                } catch (ExecutionException e4) {
                    e = e4;
                    if (e.getCause() instanceof SecurityException) {
                    }
                }
            case 7:
                ((zzqf) this.b).v((PlaybackStateEvent) this.c);
                return;
            case 8:
                ((zzqf) this.b).t((PlaybackErrorEvent) this.c);
                return;
            case 9:
                qpn qpnVar = (qpn) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) qpnVar.d).post(new vvo(7, qpnVar, routedDevice));
                    return;
                }
                return;
            case 10:
                zzx zzxVar = (zzx) this.b;
                String str = ((zza) this.c).a;
                if (CastUtils.c(str, zzxVar.O)) {
                    z2 = false;
                } else {
                    zzxVar.O = str;
                }
                zzx.a0.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zzxVar.Q));
                t8p t8pVar = zzxVar.K;
                if (t8pVar != null && (z2 || zzxVar.Q)) {
                    t8pVar.d();
                }
                zzxVar.Q = false;
                return;
            case 11:
                DataEventBuffer dataEventBuffer = new DataEventBuffer((DataHolder) this.b);
                try {
                    ((qfn) this.c).S1("onDataChanged");
                    return;
                } finally {
                    dataEventBuffer.release();
                }
            default:
                ((zzdu) this.b).mo13zza((zzxz) this.c);
                return;
        }
    }

    public /* synthetic */ yuo(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ yuo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public yuo(y9p y9pVar, zzx zzxVar, zza zzaVar) {
        this.a = 10;
        this.b = zzxVar;
        this.c = zzaVar;
    }
}
