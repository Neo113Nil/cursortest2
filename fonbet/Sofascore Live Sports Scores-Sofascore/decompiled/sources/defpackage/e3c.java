package defpackage;

import android.graphics.Region;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zak;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.common.internal.service.zau;
import com.google.android.gms.internal.ads.zzafu;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhn;
import com.google.android.gms.internal.ads.zzhr;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.pal.zzabi;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzadg;
import com.google.android.gms.internal.pal.zzaef;
import com.google.android.gms.internal.wearable.zzbr;
import com.google.android.gms.internal.wearable.zzc;
import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcn;
import com.google.android.gms.internal.wearable.zzel;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.internal.zzgq;
import com.google.android.gms.wearable.internal.zzin;
import com.google.android.gms.wearable.internal.zzkf;
import com.google.android.gms.wearable.internal.zzko;
import com.sofascore.results.service.WatchService;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Proxy;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e3c implements bj0, PAGBidCallback, crf, vu3, qli, tf0, tec, zdk, k80, spk, v8l, RemoteCall, ycn, zzhb, zzcgs, zzhcv, zzhr {
    public final /* synthetic */ int a;
    public Object b;

    public e3c(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new Region();
                break;
            case 13:
                this.b = new ubf(2);
                break;
            case 14:
                this.b = new zic(21);
                break;
        }
    }

    @Override // defpackage.ycn
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ycn[]) this.b)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ycn
    public ndn b(Class cls) {
        for (int i = 0; i < 2; i++) {
            ycn ycnVar = ((ycn[]) this.b)[i];
            if (ycnVar.a(cls)) {
                return ycnVar.b(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.zdk
    public FileChannel c() {
        return new FileInputStream((File) this.b).getChannel();
    }

    @Override // defpackage.spk
    public void d(bnk bnkVar) {
        bnkVar.d(((WindowManager) this.b).getDefaultDisplay());
    }

    @Override // defpackage.tf0
    public Object e(oug ougVar, Float f, Float f2, Function1 function1, fnh fnhVar) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object o = kda.o(ougVar, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, t62.a(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue2), (c80) this.b, function1, fnhVar);
        return o == lu3.a ? o : (z70) o;
    }

    @Override // defpackage.vu3
    public Object f(uu3 uu3Var) {
        return ((Function1) this.b).invoke(uu3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ void g(long j, zzeu zzeuVar) {
        zzafu.b(j, zzeuVar, (zzaht[]) ((l2a) this.b).c);
    }

    @Override // defpackage.k80
    public u78 get(int i) {
        return (e88) this.b;
    }

    @Override // defpackage.bj0
    public Object i(Object obj, Object obj2) {
        String str = (String) obj2;
        str.getClass();
        q3d q3dVar = (q3d) this.b;
        wck wckVar = q3dVar.a;
        gef gefVar = wckVar.a;
        List list = q3dVar.b;
        Integer num = (Integer) gefVar.i(obj, Integer.valueOf(list.indexOf(str) + wckVar.b));
        if (num != null) {
            return (String) list.get(num.intValue() - wckVar.b);
        }
        return null;
    }

    @Override // defpackage.tec
    public void j(vec vecVar) {
        Toolbar toolbar = (Toolbar) this.b;
        dc dcVar = toolbar.a.e;
        if (dcVar == null || !dcVar.k()) {
            Iterator it = toolbar.G.b.iterator();
            while (it.hasNext()) {
                ((zfc) it.next()).b(vecVar);
            }
        }
        cqa cqaVar = toolbar.O;
        if (cqaVar != null) {
            cqaVar.j(vecVar);
        }
    }

    public Object k(KClass kClass, Function1 function1) {
        kClass.getClass();
        zn3 zn3Var = new zn3(kClass, function1, 1);
        ClassLoader classLoader = (ClassLoader) this.b;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Predicate");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, zn3Var);
        newProxyInstance.getClass();
        return newProxyInstance;
    }

    public void l(float f, float f2, float f3) {
        zfe zfeVar = (zfe) this.b;
        if (zfeVar.d() < zfeVar.e || f < 1.0f) {
            zfeVar.m.postScale(f, f, f2, f3);
            zfeVar.a();
        }
    }

    public void m(x6a x6aVar) {
        ((Region) this.b).set(x6aVar.a, x6aVar.b, x6aVar.c, x6aVar.d);
    }

    public void n(qic qicVar, byte[] bArr) {
        jde.c();
        try {
            String concat = "/".concat((String) ((lod) this.b).h.b);
            if (bArr != null) {
                ((lod) this.b).o = true;
                concat = concat + "?" + q21.e.c(bArr);
            }
            synchronized (((lod) this.b).l.v) {
                ((lod) this.b).l.i(qicVar, concat);
            }
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void o(int i, int i2) {
        ((h8n) this.b).s(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
    public void onBiddingTokenCollected(String str) {
        ((SignalCallbacks) this.b).onSuccess(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
    public void onBiddingTokenFailed(PAGBidError pAGBidError) {
        ((SignalCallbacks) this.b).onFailure(new AdError(pAGBidError.getCode(), pAGBidError.getMessage(), "com.pangle.ads"));
    }

    @Override // defpackage.tec
    public boolean p(vec vecVar, MenuItem menuItem) {
        return false;
    }

    public void q(int i, long j) {
        ((h8n) this.b).u(i, (j >> 63) ^ (j + j));
    }

    public void r(int i, zzaby zzabyVar) {
        ((h8n) this.b).j(i, zzabyVar);
    }

    public void s(int i, Object obj, kcn kcnVar) {
        h8n h8nVar = (h8n) this.b;
        h8nVar.r(i, 3);
        kcnVar.e((zzaef) obj, h8nVar.a);
        h8nVar.r(i, 4);
    }

    public void t(int i, Object obj, s6o s6oVar) {
        zzcn zzcnVar = (zzcn) this.b;
        zzbr zzbrVar = (zzbr) obj;
        zzcnVar.a(i, 2);
        zzcnVar.n(zzbrVar.b(s6oVar));
        s6oVar.d(zzbrVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        switch (this.a) {
            case 21:
                Api api = zat.l;
                zak zakVar = (zak) ((zau) anyClient).getService();
                TelemetryData telemetryData = (TelemetryData) this.b;
                Parcel J = zakVar.J();
                zac.b(J, telemetryData);
                try {
                    zakVar.a.transact(1, J, null, 1);
                    J.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    J.recycle();
                    throw th;
                }
            default:
                zzkf zzkfVar = (zzkf) anyClient;
                yro yroVar = new yro(taskCompletionSource);
                WatchService watchService = (WatchService) this.b;
                HashMap hashMap = zzkfVar.S.a;
                synchronized (hashMap) {
                    try {
                        zzko zzkoVar = (zzko) hashMap.remove(watchService);
                        if (zzkoVar == null) {
                            if (Log.isLoggable("WearableClient", 2)) {
                                new StringBuilder(String.valueOf(watchService).length() + 25);
                            }
                            yroVar.a(new Status(4002, null, null, null));
                            return;
                        }
                        zzkoVar.S1();
                        if (Log.isLoggable("WearableClient", 2)) {
                            new StringBuilder(String.valueOf(watchService).length() + 24);
                        }
                        zzgq zzgqVar = (zzgq) zzkfVar.getService();
                        ngo ngoVar = new ngo(hashMap, watchService, yroVar);
                        zzin zzinVar = new zzin(zzkoVar);
                        Parcel S1 = zzgqVar.S1();
                        zzc.b(S1, ngoVar);
                        S1.writeInt(1);
                        zzinVar.writeToParcel(S1, 0);
                        zzgqVar.J(S1, 17);
                        return;
                    } finally {
                    }
                }
        }
    }

    public void v(int i, Object obj) {
        boolean z = obj instanceof zzcg;
        zzcn zzcnVar = (zzcn) this.b;
        if (z) {
            zzcnVar.k(i, (zzcg) obj);
        } else {
            zzcnVar.j(i, (zzel) obj);
        }
    }

    public void w(int i, Object obj, kcn kcnVar) {
        h8n h8nVar = (h8n) this.b;
        Object obj2 = (zzaef) obj;
        h8nVar.t((i << 3) | 2);
        zzabi zzabiVar = (zzabi) obj2;
        int b = zzabiVar.b();
        if (b == -1) {
            b = kcnVar.zza(zzabiVar);
            zzabiVar.c(b);
        }
        h8nVar.t(b);
        kcnVar.e(obj2, h8nVar.a);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        zzbum zzbumVar = (zzbum) this.b;
        zzbumVar.getClass();
        if (((zzbth) obj).zzk()) {
            zzbumVar.g = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public /* synthetic */ void zzb(Object obj) {
        zzcea.l.remove((ddb) this.b);
    }

    @Override // defpackage.spk
    public void h() {
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public /* synthetic */ zzhs zza() {
        int i = zzcku.w;
        return new zzhn((byte[]) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzcea.l.remove((ddb) this.b);
    }

    public e3c(zzcea zzceaVar, ddb ddbVar) {
        this.a = 27;
        this.b = ddbVar;
    }

    public e3c(zzcn zzcnVar) {
        this.a = 29;
        this.b = zzcnVar;
        zzcnVar.a = this;
    }

    public e3c(h8n h8nVar) {
        this.a = 22;
        Charset charset = zzadg.a;
        this.b = h8nVar;
        h8nVar.a = this;
    }

    public e3c(lal lalVar, k8l k8lVar, zid zidVar) {
        this.a = 20;
        this.b = k8lVar;
    }

    public /* synthetic */ e3c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public e3c(float f, float f2) {
        this.a = 18;
        this.b = new e88(f, f2, 0.01f);
    }
}
