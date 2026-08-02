package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.media.AudioManager;
import android.os.Binder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.CastRemoteDisplayLocalService;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.cast.internal.zzav;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzadz;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f2n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public f2n(zacm zacmVar) {
        this.a = 1;
        Objects.requireNonNull(zacmVar);
        this.b = zacmVar;
    }

    private final void a() {
        pmn pmnVar = (pmn) this.b;
        synchronized (pmnVar.c) {
            if (pmnVar.d.get() && pmnVar.e) {
                pmnVar.d.set(false);
                int i = zze.zza;
                zzo.zzd("App went background");
                Iterator it = pmnVar.f.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbga) it.next()).zza(false);
                    } catch (Exception e) {
                        zzo.zzg("", e);
                    }
                }
            } else {
                int i2 = zze.zza;
                zzo.zzd("App is still foreground");
            }
        }
    }

    private final void b() {
        zzbij zzbijVar = (zzbij) this.b;
        synchronized (zzbijVar) {
            try {
                zzbik zzbikVar = zzbijVar.c;
                if (zzbikVar.b) {
                    zzbikVar.a.o1(zzbijVar.a);
                    zzbikVar.a.h(0);
                    zzbikVar.a.p(zzbijVar.b);
                    zzbikVar.a.w();
                    zzbikVar.a.zzf();
                }
            } catch (RemoteException e) {
                zzo.zze("Clearcut log failed", e);
            }
        }
    }

    private final void c() {
        LinkedHashMap linkedHashMap;
        zzbjl zzbjlVar = (zzbjl) this.b;
        zzbjlVar.getClass();
        while (true) {
            try {
                zzbjv zzbjvVar = (zzbjv) zzbjlVar.a.take();
                zzbju b = zzbjvVar.b();
                if (!TextUtils.isEmpty(b.a)) {
                    LinkedHashMap linkedHashMap2 = zzbjlVar.b;
                    synchronized (zzbjvVar.c) {
                        zzt.zzh().a();
                        linkedHashMap = zzbjvVar.b;
                    }
                    zzbjlVar.b(zzbjlVar.a(linkedHashMap2, linkedHashMap), b);
                }
            } catch (InterruptedException e) {
                int i = zze.zza;
                zzo.zzj("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0393 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        s9o s9oVar;
        Class<?> cls;
        Class<?>[] interfaces;
        String name;
        int length;
        int i;
        boolean z;
        String b;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                ((zabk) this.b).a();
                return;
            case 1:
                ((zacm) this.b).g.b(new ConnectionResult(4, null, null));
                return;
            case 2:
                g gVar = (g) this.b;
                Lock lock = gVar.m;
                lock.lock();
                try {
                    gVar.h();
                    return;
                } finally {
                    lock.unlock();
                }
            case 3:
                ((zzabc) this.b).n();
                return;
            case 4:
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = (CastRemoteDisplayLocalService) this.b;
                boolean z4 = castRemoteDisplayLocalService.a;
                StringBuilder sb = new StringBuilder(String.valueOf(z4).length() + 54);
                sb.append("onCreate after delay. The local service been started: ");
                sb.append(z4);
                castRemoteDisplayLocalService.a(sb.toString());
                if (castRemoteDisplayLocalService.a) {
                    return;
                }
                CastRemoteDisplayLocalService.d.c("[Instance: %s] %s", castRemoteDisplayLocalService, "The local service has not been been started, stopping it");
                castRemoteDisplayLocalService.stopSelf();
                return;
            case 5:
                ((x9n) this.b).i.zza();
                return;
            case 6:
                zzadz zzadzVar = (zzadz) this.b;
                zzadzVar.m--;
                return;
            case 7:
                zin zinVar = (zin) this.b;
                n8p n8pVar = zinVar.b;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    WebViewInitData webViewInitData = (WebViewInitData) zinVar.c.f.get();
                    WebViewInitData.JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData = webViewInitData.initData;
                    Boolean enableInstrumentation = javaScriptNativeBridgeInitData.enableInstrumentation();
                    if (enableInstrumentation != null) {
                        t6o t6oVar = zinVar.d;
                        boolean booleanValue = enableInstrumentation.booleanValue();
                        ConcurrentLinkedQueue concurrentLinkedQueue = t6oVar.a;
                        if (booleanValue) {
                            t6oVar.d = 2;
                            for (lda ldaVar = (lda) concurrentLinkedQueue.poll(); ldaVar != null; ldaVar = (lda) concurrentLinkedQueue.poll()) {
                                ((mqn) t6oVar.b).d(ldaVar);
                            }
                        } else {
                            t6oVar.d = 3;
                            concurrentLinkedQueue.clear();
                        }
                    }
                    if (javaScriptNativeBridgeInitData.espAdapterTimeoutMs() != null && javaScriptNativeBridgeInitData.espAdapters() != null) {
                        rbo rboVar = zinVar.k;
                        List<String> espAdapters = javaScriptNativeBridgeInitData.espAdapters();
                        Integer espAdapterTimeoutMs = javaScriptNativeBridgeInitData.espAdapterTimeoutMs();
                        TaskCompletionSource taskCompletionSource = rboVar.b;
                        ArrayList arrayList = rboVar.a;
                        if (espAdapters == null || espAdapterTimeoutMs == null || espAdapterTimeoutMs.intValue() == 0) {
                            taskCompletionSource.trySetException(new Exception("No adapters to load"));
                            taskCompletionSource.getTask();
                        } else {
                            rboVar.g = espAdapterTimeoutMs;
                            for (String str : espAdapters) {
                                try {
                                    cls = Class.forName(str, z2, rbo.class.getClassLoader());
                                    interfaces = cls.getInterfaces();
                                    name = vzg.class.getName();
                                    length = interfaces.length;
                                    i = 0;
                                } catch (Throwable unused) {
                                }
                                while (i < length) {
                                    Class<?>[] clsArr = interfaces;
                                    if (!interfaces[i].getName().equals(name)) {
                                        i++;
                                        interfaces = clsArr;
                                    } else if (cls.getDeclaredConstructor(null).newInstance(null) != null) {
                                        throw new ClassCastException();
                                        break;
                                    } else {
                                        s9oVar = new s9o(str, rboVar.d);
                                        if (s9oVar == null) {
                                            try {
                                                arrayList.add(s9oVar);
                                            } catch (Exception e) {
                                                rboVar.f.d(InstrumentationData.Component.NATIVE_ESP, InstrumentationData.Method.LOAD_ADAPTER, new Exception("Exception with SecureSignalsAdapter ".concat(String.valueOf(str)), e));
                                            }
                                        }
                                        z2 = false;
                                    }
                                }
                                s9oVar = null;
                                if (s9oVar == null) {
                                }
                                z2 = false;
                            }
                            taskCompletionSource.trySetResult(arrayList);
                            taskCompletionSource.getTask();
                        }
                        Task task = rboVar.b.getTask();
                        u8f u8fVar = new u8f(18);
                        b7p b7pVar = rboVar.e;
                        task.continueWith(b7pVar, u8fVar).continueWithTask(b7pVar, new mxn(rboVar, 10)).continueWith(b7pVar, new bgf(17)).continueWith(b7pVar, new ohn(rboVar, 19));
                        rboVar.c.getTask();
                    }
                    w8o w8oVar = zinVar.j;
                    javaScriptNativeBridgeInitData.platformSignalCollectorTimeoutMs();
                    w8oVar.a.setResult(u1p.a);
                    mqn mqnVar = zinVar.c;
                    Context context = zinVar.a;
                    b7p b7pVar2 = zinVar.n;
                    z3p z3pVar = h4o.c;
                    WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig = javaScriptNativeBridgeInitData.consentSettingsConfig();
                    if (consentSettingsConfig != null && consentSettingsConfig.consentKeyTypes() != null) {
                        z3pVar = z3p.c(consentSettingsConfig.consentKeyTypes());
                    }
                    Boolean disableJsIdLessEvaluation = javaScriptNativeBridgeInitData.disableJsIdLessEvaluation();
                    h4o h4oVar = new h4o(z3pVar, disableJsIdLessEvaluation == null || !disableJsIdLessEvaluation.booleanValue());
                    t6o t6oVar2 = zinVar.d;
                    p4o p4oVar = new p4o(mqnVar, context, b7pVar2, h4oVar, t6oVar2);
                    zinVar.p = p4oVar;
                    p4oVar.d = p4oVar.c();
                    a5f.d(context.getApplicationContext()).registerOnSharedPreferenceChangeListener(new w3o(p4oVar, 0));
                    sen senVar = (sen) t6oVar2.c.e;
                    qen c = t6o.c(currentTimeMillis, System.currentTimeMillis());
                    senVar.b();
                    ((uen) senVar.b).v(c);
                    n8pVar.d(webViewInitData);
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    n8pVar.e(e2);
                    zinVar.f.v(new zjo(new tf(1, 1, "core component initialization failed", null)));
                    return;
                }
            case 8:
                hkn hknVar = (hkn) this.b;
                try {
                    SQLiteDatabase H0 = hknVar.H0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    H0.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e3) {
                    zzgu zzguVar = ((zzic) hknVar.b).f;
                    zzic.m(zzguVar);
                    zzguVar.g.b(e3, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 9:
                zzav zzavVar = (zzav) this.b;
                synchronized (zzav.j) {
                    try {
                        if (zzavVar.b()) {
                            zzavVar.e(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                l2a l2aVar = (l2a) this.b;
                Activity activity = (Activity) l2aVar.b;
                View view = (View) l2aVar.d;
                if (view == null) {
                    return;
                }
                if (activity.isInPictureInPictureMode()) {
                    View view2 = (View) l2aVar.d;
                    if (view2 == null) {
                        return;
                    }
                    ((Activity) l2aVar.b).runOnUiThread(new wjn(false ? 1 : 0, l2aVar, view2));
                    return;
                }
                try {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height), (int) (rha.G(activity) * 0.6f));
                        if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                            layoutParams.width = rha.F(activity, 640);
                        } else {
                            layoutParams.width = -1;
                        }
                        ((WindowManager) l2aVar.c).updateViewLayout(view, layoutParams);
                        return;
                    }
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 11:
                zzbav zzbavVar = (zzbav) this.b;
                synchronized (zzbavVar.o) {
                    if (zzbavVar.p) {
                        return;
                    }
                    zzbavVar.p = true;
                    try {
                        zzbavVar.c();
                    } catch (Exception e4) {
                        ((zzbav) this.b).f.c(2023, -1L, e4);
                    }
                    zzbav zzbavVar2 = (zzbav) this.b;
                    synchronized (zzbavVar2.o) {
                        zzbavVar2.p = false;
                    }
                    return;
                }
            case 12:
                zzbax zzbaxVar = (zzbax) this.b;
                if (zzbaxVar.b != null) {
                    return;
                }
                synchronized (zzbax.c) {
                    if (zzbaxVar.b != null) {
                        return;
                    }
                    try {
                        z = ((Boolean) zzbjg.z3.c()).booleanValue();
                    } catch (IllegalStateException unused3) {
                        z = false;
                    }
                    if (z) {
                        try {
                            zzbax.d = zzgae.a(((zzbax) this.b).a.a, "ADSHIELD");
                        } catch (Throwable unused4) {
                        }
                    }
                    z3 = z;
                    ((zzbax) this.b).b = Boolean.valueOf(z3);
                    zzbax.c.open();
                    return;
                }
            case 13:
                ((zzbcn) this.b).c();
                return;
            case 14:
                zzbds zzbdsVar = (zzbds) this.b;
                try {
                    zzbcg zzbcgVar = zzbdsVar.a;
                    DexClassLoader dexClassLoader = zzbcgVar.c;
                    byte[] bArr = zzbcgVar.e;
                    String str2 = zzbdsVar.b;
                    zzbcgVar.d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(zzbbl.b(str2, bArr), C.UTF8_NAME));
                    if (loadClass != null) {
                        byte[] bArr2 = zzbcgVar.e;
                        String str3 = zzbdsVar.c;
                        zzbdsVar.a.d.getClass();
                        zzbdsVar.d = loadClass.getMethod(new String(zzbbl.b(str3, bArr2), C.UTF8_NAME), zzbdsVar.e);
                    }
                } catch (zzbbk | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused5) {
                } catch (Throwable th) {
                    zzbdsVar.f.countDown();
                    throw th;
                }
                zzbdsVar.f.countDown();
                return;
            case 15:
                ((zzbfi) this.b).d(3);
                return;
            case 16:
                a();
                return;
            case 17:
                ((zzbhn) this.b).c();
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                i1k i1kVar = (i1k) ((zxc) this.b).b;
                IInterface iInterface = (IInterface) i1kVar.k;
                if (iInterface != null) {
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath((fnn) i1kVar.i, 0);
                    i1kVar.k = null;
                    i1kVar.l();
                }
                i1kVar.a = false;
                return;
            case 21:
                zzbkf zzbkfVar = (zzbkf) this.b;
                Context context2 = zzbkfVar.c;
                if (zzbkfVar.f != null || context2 == null || (b = ba4.b(context2)) == null || b.equals(context2.getPackageName())) {
                    return;
                }
                ba4.a(context2, b, zzbkfVar);
                return;
            case 22:
                ((zzbkl) this.b).d();
                return;
            case 23:
                zzbsg zzbsgVar = (zzbsg) this.b;
                if (zzbsgVar.a == null) {
                    return;
                }
                zzbsgVar.a.disconnect();
                Binder.flushPendingCommands();
                return;
            case 24:
                zze.zza("maybeDestroy > Destroying engine.");
                zzbth zzbthVar = (zzbth) this.b;
                zzbthVar.a0("/result", zzbqg.j);
                zzbthVar.zzj();
                return;
            case 25:
                ((CastSeekBar) this.b).sendAccessibilityEvent(4);
                return;
            case 26:
                ((zzcbr) this.b).f.set(false);
                return;
            case 27:
                rrn rrnVar = (rrn) this.b;
                AtomicBoolean atomicBoolean = rrnVar.e;
                AudioManager audioManager = rrnVar.c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) rrnVar.d.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    rrnVar.a.post(new mrn(this, f, false ? 1 : 0));
                    return;
                }
                return;
            case 28:
                vdb vdbVar = (vdb) this.b;
                if (vdbVar.b) {
                    return;
                }
                vdbVar.b = true;
                if (((b2p) vdbVar.c).d()) {
                    ((fln) ((b2p) vdbVar.c).g()).a.destroy();
                    vdbVar.c = u1p.a;
                }
                vdbVar.e = null;
                vdbVar.f = null;
                Set set = (Set) vdbVar.i;
                q3p u = q3p.u(set);
                int size = u.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bun) u.get(i2)).zzc();
                }
                set.clear();
                return;
            default:
                ((AtomicBoolean) this.b).getAndSet(true);
                return;
        }
    }

    public /* synthetic */ f2n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
