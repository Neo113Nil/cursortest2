package b6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.e0;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import io.sentry.android.core.w0;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import s7.a0;
import s7.e2;
import s7.f1;
import s7.l0;
import s7.p2;
import s7.v3;
import s7.x;
import s7.x0;
import s7.y2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3056a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3061f;

    public /* synthetic */ j(a aVar, Intent intent, Context context, boolean z5, BroadcastReceiver.PendingResult pendingResult) {
        this.f3058c = aVar;
        this.f3059d = intent;
        this.f3060e = context;
        this.f3057b = z5;
        this.f3061f = pendingResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:27:0x0083, B:32:0x0105, B:34:0x0110, B:37:0x011d, B:39:0x0123, B:40:0x0138, B:41:0x0143, B:45:0x014b, B:48:0x0166, B:49:0x0175, B:51:0x016d, B:52:0x0188, B:54:0x018e, B:56:0x0194, B:58:0x019a, B:60:0x01a0, B:62:0x01a8, B:64:0x01b0, B:66:0x01b6, B:69:0x01c8, B:72:0x0096, B:74:0x009c, B:76:0x00a4, B:78:0x00aa, B:80:0x00b0, B:82:0x00b6, B:84:0x00be, B:86:0x00c6, B:88:0x00ce, B:90:0x00d6, B:91:0x00ea, B:93:0x00f8), top: B:26:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:27:0x0083, B:32:0x0105, B:34:0x0110, B:37:0x011d, B:39:0x0123, B:40:0x0138, B:41:0x0143, B:45:0x014b, B:48:0x0166, B:49:0x0175, B:51:0x016d, B:52:0x0188, B:54:0x018e, B:56:0x0194, B:58:0x019a, B:60:0x01a0, B:62:0x01a8, B:64:0x01b0, B:66:0x01b6, B:69:0x01c8, B:72:0x0096, B:74:0x009c, B:76:0x00a4, B:78:0x00aa, B:80:0x00b0, B:82:0x00b6, B:84:0x00be, B:86:0x00c6, B:88:0x00ce, B:90:0x00d6, B:91:0x00ea, B:93:0x00f8), top: B:26:0x0083 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Executor executor;
        int i5;
        com.google.firebase.messaging.m mVar;
        Bundle k0;
        x0 x0Var;
        switch (this.f3056a) {
            case 0:
                a aVar = (a) this.f3058c;
                Intent intent = (Intent) this.f3059d;
                Context context = (Context) this.f3060e;
                boolean z5 = this.f3057b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f3061f;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i5 = aVar.c(context, intent2);
                    } else if (intent.getExtras() == null) {
                        i5 = 500;
                    } else {
                        CloudMessage cloudMessage = new CloudMessage(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (a.class) {
                            try {
                                SoftReference softReference = a.f3031b;
                                executor = softReference != null ? (Executor) softReference.get() : null;
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e0("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    a.f3031b = new SoftReference(executor);
                                }
                            } finally {
                            }
                        }
                        executor.execute(new i((Object) context, (Object) cloudMessage, (Object) countDownLatch, 0));
                        int a7 = aVar.a(context, cloudMessage);
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                w0.m("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e7) {
                            w0.m("CloudMessagingReceiver", "Message ack failed: ".concat(e7.toString()));
                        }
                        i5 = a7;
                    }
                    if (z5 && pendingResult != null) {
                        pendingResult.setResultCode(i5);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                y2 p10 = ((AppMeasurementDynamiteService) this.f3061f).f5780a.p();
                n0 n0Var = (n0) this.f3058c;
                String str = (String) this.f3059d;
                String str2 = (String) this.f3060e;
                boolean z7 = this.f3057b;
                p10.j();
                p10.k();
                p10.x(new p2(p10, str, str2, p10.z(false), z7, n0Var));
                return;
            case 2:
                String str3 = (String) this.f3059d;
                String str4 = (String) this.f3060e;
                boolean z10 = this.f3057b;
                y2 p11 = ((f1) ((e2) this.f3061f).f3328a).p();
                AtomicReference atomicReference = (AtomicReference) this.f3058c;
                p11.j();
                p11.k();
                p11.x(new p2(p11, atomicReference, str3, str4, p11.z(false), z10));
                return;
            case 3:
                com.google.firebase.messaging.m mVar2 = (com.google.firebase.messaging.m) this.f3061f;
                e2 e2Var = (e2) mVar2.f6159b;
                e2Var.j();
                f1 f1Var = (f1) e2Var.f3328a;
                x0 x0Var2 = e2Var.f22709r;
                String str5 = (String) this.f3060e;
                Uri uri = (Uri) this.f3058c;
                try {
                    v3 v3Var = f1Var.f22748i;
                    mVar = mVar2;
                    try {
                        s7.n0 n0Var2 = f1Var.f22745f;
                        f1.k(v3Var);
                        if (!TextUtils.isEmpty(str5)) {
                            if (str5.contains("gclid") || str5.contains("gbraid") || str5.contains("utm_campaign") || str5.contains("utm_source") || str5.contains("utm_medium") || str5.contains("utm_id") || str5.contains("dclid") || str5.contains("srsltid") || str5.contains("sfmc_id")) {
                                k0 = v3Var.k0(Uri.parse("https://google.com/search?".concat(str5)));
                                if (k0 != null) {
                                    k0.putString("_cis", "referrer");
                                }
                                String str6 = (String) this.f3059d;
                                if (this.f3057b) {
                                    v3 v3Var2 = f1Var.f22748i;
                                    f1.k(v3Var2);
                                    Bundle k02 = v3Var2.k0(uri);
                                    if (k02 != null) {
                                        k02.putString("_cis", "intent");
                                        if (!k02.containsKey("gclid") && k0 != null && k0.containsKey("gclid")) {
                                            k02.putString("_cer", "gclid=" + k0.getString("gclid"));
                                        }
                                        e2Var.q(str6, "_cmp", k02);
                                        x0Var = x0Var2;
                                        x0Var.c(k02, str6);
                                        if (TextUtils.isEmpty(str5)) {
                                            return;
                                        }
                                        f1.m(n0Var2);
                                        l0 l0Var = n0Var2.f22909m;
                                        l0Var.b(str5, "Activity created with referrer");
                                        if (f1Var.f22743d.t(null, x.H0)) {
                                            if (k0 != null) {
                                                e2Var.q(str6, "_cmp", k0);
                                                x0Var.c(k0, str6);
                                            } else {
                                                f1.m(n0Var2);
                                                l0Var.b(str5, "Referrer does not contain valid parameters");
                                            }
                                            f1Var.f22749k.getClass();
                                            e2Var.t("auto", "_ldl", null, true, System.currentTimeMillis());
                                            return;
                                        }
                                        if (!str5.contains("gclid") || (!str5.contains("utm_campaign") && !str5.contains("utm_source") && !str5.contains("utm_medium") && !str5.contains("utm_term") && !str5.contains("utm_content"))) {
                                            f1.m(n0Var2);
                                            l0Var.a("Activity created with data 'referrer' without required params");
                                            return;
                                        } else {
                                            if (TextUtils.isEmpty(str5)) {
                                                return;
                                            }
                                            f1Var.f22749k.getClass();
                                            e2Var.t("auto", "_ldl", str5, true, System.currentTimeMillis());
                                            return;
                                        }
                                    }
                                }
                                x0Var = x0Var2;
                                if (TextUtils.isEmpty(str5)) {
                                }
                            } else {
                                s7.n0 n0Var3 = ((f1) v3Var.f3328a).f22745f;
                                f1.m(n0Var3);
                                n0Var3.f22909m.a("Activity created with data 'referrer' without required params");
                            }
                        }
                        k0 = null;
                        String str62 = (String) this.f3059d;
                        if (this.f3057b) {
                        }
                        x0Var = x0Var2;
                        if (TextUtils.isEmpty(str5)) {
                        }
                    } catch (RuntimeException e9) {
                        e = e9;
                        s7.n0 n0Var4 = ((f1) ((e2) mVar.f6159b).f3328a).f22745f;
                        f1.m(n0Var4);
                        n0Var4.f22903f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    mVar = mVar2;
                }
                break;
            default:
                zzr zzrVar = (zzr) this.f3058c;
                y2 y2Var = (y2) this.f3061f;
                a0 a0Var = y2Var.f23257d;
                f1 f1Var2 = (f1) y2Var.f3328a;
                if (a0Var == null) {
                    s7.n0 n0Var5 = f1Var2.f22745f;
                    f1.m(n0Var5);
                    n0Var5.f22903f.a("Failed to send default event parameters to service");
                    return;
                }
                if (f1Var2.f22743d.t(null, x.f23181c1)) {
                    y2Var.B(a0Var, this.f3057b ? null : (zzbe) this.f3059d, zzrVar);
                    return;
                }
                try {
                    a0Var.A((Bundle) this.f3060e, zzrVar);
                    y2Var.w();
                    return;
                } catch (RemoteException e11) {
                    s7.n0 n0Var6 = f1Var2.f22745f;
                    f1.m(n0Var6);
                    n0Var6.f22903f.b(e11, "Failed to send default event parameters to service");
                    return;
                }
        }
    }

    public j(AppMeasurementDynamiteService appMeasurementDynamiteService, n0 n0Var, String str, String str2, boolean z5) {
        this.f3058c = n0Var;
        this.f3059d = str;
        this.f3060e = str2;
        this.f3057b = z5;
        this.f3061f = appMeasurementDynamiteService;
    }

    public j(com.google.firebase.messaging.m mVar, boolean z5, Uri uri, String str, String str2) {
        this.f3057b = z5;
        this.f3058c = uri;
        this.f3059d = str;
        this.f3060e = str2;
        this.f3061f = mVar;
    }

    public j(e2 e2Var, AtomicReference atomicReference, String str, String str2, boolean z5) {
        this.f3058c = atomicReference;
        this.f3059d = str;
        this.f3060e = str2;
        this.f3057b = z5;
        Objects.requireNonNull(e2Var);
        this.f3061f = e2Var;
    }

    public j(y2 y2Var, zzr zzrVar, boolean z5, zzbe zzbeVar, Bundle bundle) {
        this.f3058c = zzrVar;
        this.f3057b = z5;
        this.f3059d = zzbeVar;
        this.f3060e = bundle;
        Objects.requireNonNull(y2Var);
        this.f3061f = y2Var;
    }
}
