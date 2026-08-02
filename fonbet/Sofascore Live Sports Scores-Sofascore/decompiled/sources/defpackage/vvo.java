package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioDeviceInfo;
import android.media.metrics.TrackChangeEvent;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzqf;
import com.google.android.gms.internal.ads.zzql;
import com.google.android.gms.internal.ads.zzqr;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zzsq;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzyd;
import com.google.android.gms.internal.measurement.zzyf;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.internal.zzhk;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vvo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public vvo(zzyf zzyfVar, zzyd zzydVar) {
        this.a = 10;
        this.b = zzydVar;
        Objects.requireNonNull(zzyfVar);
        this.c = zzyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqr zzqrVar;
        switch (this.a) {
            case 0:
                zzic zzicVar = (zzic) ((zzlj) this.b).b;
                zzgi q = zzicVar.q();
                String str = (String) this.c;
                String str2 = q.s;
                boolean z = (str2 == null || str2.equals(str)) ? false : true;
                q.s = str;
                if (z) {
                    zzicVar.q().V();
                    return;
                }
                return;
            case 1:
                ((zznf) this.c).c.b0((ComponentName) this.b);
                return;
            case 2:
                zznf zznfVar = (zznf) this.c;
                synchronized (zznfVar) {
                    try {
                        zznfVar.a = false;
                        zznl zznlVar = zznfVar.c;
                        if (!zznlVar.h0()) {
                            zzgu zzguVar = ((zzic) zznlVar.b).f;
                            zzic.m(zzguVar);
                            zzguVar.n.a("Connected to remote service");
                            zzgb zzgbVar = (zzgb) this.b;
                            zznlVar.Q();
                            Preconditions.i(zzgbVar);
                            zznlVar.e = zzgbVar;
                            zznlVar.d0();
                            zznlVar.f0();
                        }
                    } finally {
                    }
                }
                zznl zznlVar2 = ((zznf) this.c).c;
                ScheduledExecutorService scheduledExecutorService = zznlVar2.h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    zznlVar2.h = null;
                    return;
                }
                return;
            case 3:
                zzpg zzpgVar = (zzpg) this.b;
                zzpgVar.W();
                Runnable runnable = (Runnable) this.c;
                zzpgVar.d().Q();
                ArrayList arrayList = zzpgVar.p;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    zzpgVar.p = arrayList;
                }
                arrayList.add(runnable);
                zzpgVar.q();
                return;
            case 4:
                Context context = ((zzlk) this.b).b;
                awf awfVar = zzpp.c;
                if (awfVar == null) {
                    synchronized (zzpp.b) {
                        awfVar = zzpp.c;
                        if (awfVar == null) {
                            b10 d = lv9.d();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str3 : list) {
                                        if (str3.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb = new StringBuilder(str3.length() + 10);
                                                sb.append("phenotype/");
                                                sb.append(str3);
                                                InputStream open = assets.open(sb.toString());
                                                try {
                                                    zzadf zzadfVar = zzadf.b;
                                                    int i = j8n.a;
                                                    zzpp zzppVar = new zzpp(context, zzpr.A(open, zzadf.c));
                                                    d.A(zzppVar.a, zzppVar);
                                                    if (open != null) {
                                                        open.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (open != null) {
                                                        try {
                                                            open.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                    }
                                                    throw th;
                                                    break;
                                                }
                                            } catch (zzaeh unused) {
                                                new StringBuilder(str3.length() + 45);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException unused2) {
                            }
                            awf c = d.c(true);
                            zzpp.c = c;
                            awfVar = c;
                        }
                    }
                }
                String str4 = (String) this.c;
                if (awfVar.containsKey(str4)) {
                    return;
                }
                new StringBuilder(str4.length() + TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
                return;
            case 5:
                ((zzqf) this.b).w((TrackChangeEvent) this.c);
                return;
            case 6:
                zzry zzryVar = (zzry) this.b;
                zzjc zzjcVar = (zzjc) this.c;
                String str5 = zzfm.a;
                zzryVar.b.a.C.e(zzjcVar);
                return;
            case 7:
                qpn qpnVar = (qpn) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((y5p) qpnVar.e) == null || (zzqrVar = ((c7p) ((zzsq) qpnVar.c)).a.f) == null || audioDeviceInfo.equals(zzqrVar.i)) {
                    return;
                }
                zzqrVar.i = audioDeviceInfo;
                Context context2 = zzqrVar.a;
                zzd zzdVar = zzqrVar.j;
                List a = zzqrVar.a();
                s sVar = zzql.e;
                zzqrVar.b(zzql.a(context2, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context2, null), zzdVar, audioDeviceInfo, a));
                return;
            case 8:
                fl0 fl0Var = (fl0) this.b;
                jyo jyoVar = (jyo) this.c;
                ((p9p) fl0Var.e).zzg();
                ml0 ml0Var = (ml0) fl0Var.d;
                synchronized (ml0Var.b) {
                    ml0Var.d();
                    jyoVar.run();
                }
                return;
            case 9:
                WearableListenerService S1 = ((qfn) this.c).S1("onMessageReceived");
                if (S1 == null) {
                    return;
                }
                S1.g((zzhk) this.b);
                return;
            default:
                ((zzyf) this.c).a.remove((zzyd) this.b);
                return;
        }
    }

    public /* synthetic */ vvo(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ vvo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public vvo(zznt zzntVar, zzpg zzpgVar, Runnable runnable) {
        this.a = 3;
        this.b = zzpgVar;
        this.c = runnable;
    }
}
