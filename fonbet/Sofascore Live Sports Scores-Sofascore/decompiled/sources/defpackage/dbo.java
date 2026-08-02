package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.measurement.internal.zzx;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dbo implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public dbo(zzlj zzljVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.c = atomicReference;
        this.d = str;
        this.e = str2;
        this.b = z;
        Objects.requireNonNull(zzljVar);
        this.f = zzljVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0102 A[Catch: RuntimeException -> 0x00e4, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x00e4, blocks: (B:24:0x0080, B:29:0x0102, B:31:0x010d, B:34:0x011a, B:36:0x0120, B:37:0x0135, B:38:0x0140, B:40:0x0146, B:43:0x0161, B:44:0x0170, B:46:0x0168, B:47:0x0183, B:49:0x0189, B:51:0x018f, B:53:0x0195, B:55:0x019b, B:57:0x01a3, B:59:0x01ab, B:61:0x01b1, B:64:0x01c3, B:68:0x0095, B:70:0x009b, B:72:0x00a3, B:74:0x00a9, B:76:0x00af, B:78:0x00b5, B:80:0x00bd, B:82:0x00c5, B:84:0x00cd, B:86:0x00d5, B:87:0x00e7, B:89:0x00f5), top: B:23:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146 A[Catch: RuntimeException -> 0x00e4, TryCatch #2 {RuntimeException -> 0x00e4, blocks: (B:24:0x0080, B:29:0x0102, B:31:0x010d, B:34:0x011a, B:36:0x0120, B:37:0x0135, B:38:0x0140, B:40:0x0146, B:43:0x0161, B:44:0x0170, B:46:0x0168, B:47:0x0183, B:49:0x0189, B:51:0x018f, B:53:0x0195, B:55:0x019b, B:57:0x01a3, B:59:0x01ab, B:61:0x01b1, B:64:0x01c3, B:68:0x0095, B:70:0x009b, B:72:0x00a3, B:74:0x00a9, B:76:0x00af, B:78:0x00b5, B:80:0x00bd, B:82:0x00c5, B:84:0x00cd, B:86:0x00d5, B:87:0x00e7, B:89:0x00f5), top: B:23:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Executor executor;
        Bundle R0;
        zzx zzxVar;
        switch (this.a) {
            case 0:
                CloudMessagingReceiver cloudMessagingReceiver = (CloudMessagingReceiver) this.c;
                Intent intent = (Intent) this.d;
                Context context = (Context) this.e;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int i = 500;
                    if (intent2 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        if (Objects.equals(intent2.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
                            cloudMessagingReceiver.b(extras);
                            i = -1;
                        }
                    } else if (intent.getExtras() != null) {
                        CloudMessage cloudMessage = new CloudMessage(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (CloudMessagingReceiver.class) {
                            try {
                                SoftReference softReference = CloudMessagingReceiver.b;
                                executor = softReference != null ? (Executor) softReference.get() : null;
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    CloudMessagingReceiver.b = new SoftReference(executor);
                                }
                            } finally {
                            }
                        }
                        executor.execute(new lv4(context, cloudMessage, countDownLatch, false, 25));
                        i = cloudMessagingReceiver.a(context, cloudMessage);
                        try {
                            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            "Message ack failed: ".concat(e.toString());
                        }
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                zznl o = ((AppMeasurementDynamiteService) this.f).a.o();
                zzcs zzcsVar = (zzcs) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                boolean z2 = this.b;
                o.Q();
                o.R();
                o.e0(new oco(o, str, str2, o.g0(false), z2, zzcsVar));
                return;
            case 2:
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                boolean z3 = this.b;
                zznl o2 = ((zzic) ((zzlj) this.f).b).o();
                AtomicReference atomicReference = (AtomicReference) this.c;
                o2.Q();
                o2.R();
                o2.e0(new oco(o2, atomicReference, str3, str4, o2.g0(false), z3));
                return;
            case 3:
                zzlj zzljVar = (zzlj) ((gt7) this.f).b;
                zzic zzicVar = (zzic) zzljVar.b;
                zzljVar.Q();
                zzx zzxVar2 = zzljVar.r;
                String str5 = (String) this.e;
                Uri uri = (Uri) this.c;
                try {
                    zzpp zzppVar = zzicVar.i;
                    zzgu zzguVar = zzicVar.f;
                    zzic.k(zzppVar);
                    if (!TextUtils.isEmpty(str5)) {
                        if (str5.contains("gclid") || str5.contains("gbraid") || str5.contains("utm_campaign") || str5.contains("utm_source") || str5.contains("utm_medium") || str5.contains("utm_id") || str5.contains("dclid") || str5.contains("srsltid") || str5.contains("sfmc_id")) {
                            R0 = zzppVar.R0(Uri.parse("https://google.com/search?".concat(str5)));
                            if (R0 != null) {
                                R0.putString("_cis", Payload.RFR);
                            }
                            String str6 = (String) this.d;
                            if (this.b) {
                                zzpp zzppVar2 = zzicVar.i;
                                zzic.k(zzppVar2);
                                Bundle R02 = zzppVar2.R0(uri);
                                if (R02 != null) {
                                    R02.putString("_cis", "intent");
                                    if (!R02.containsKey("gclid") && R0 != null && R0.containsKey("gclid")) {
                                        R02.putString("_cer", "gclid=" + R0.getString("gclid"));
                                    }
                                    zzljVar.X(str6, R02, "_cmp");
                                    zzxVar = zzxVar2;
                                    zzxVar.a(R02, str6);
                                    if (TextUtils.isEmpty(str5)) {
                                        return;
                                    }
                                    zzic.m(zzguVar);
                                    zzgs zzgsVar = zzguVar.n;
                                    zzgsVar.b(str5, "Activity created with referrer");
                                    if (zzicVar.d.b0(null, zzfy.G0)) {
                                        if (R0 != null) {
                                            zzljVar.X(str6, R0, "_cmp");
                                            zzxVar.a(R0, str6);
                                        } else {
                                            zzic.m(zzguVar);
                                            zzgsVar.b(str5, "Referrer does not contain valid parameters");
                                        }
                                        zzicVar.k.getClass();
                                        zzljVar.a0("auto", "_ldl", null, true, System.currentTimeMillis());
                                        return;
                                    }
                                    if (!str5.contains("gclid") || (!str5.contains("utm_campaign") && !str5.contains("utm_source") && !str5.contains("utm_medium") && !str5.contains("utm_term") && !str5.contains("utm_content"))) {
                                        zzic.m(zzguVar);
                                        zzgsVar.a("Activity created with data 'referrer' without required params");
                                        return;
                                    } else {
                                        if (TextUtils.isEmpty(str5)) {
                                            return;
                                        }
                                        zzicVar.k.getClass();
                                        zzljVar.a0("auto", "_ldl", str5, true, System.currentTimeMillis());
                                        return;
                                    }
                                }
                            }
                            zzxVar = zzxVar2;
                            if (TextUtils.isEmpty(str5)) {
                            }
                        } else {
                            zzgu zzguVar2 = ((zzic) zzppVar.b).f;
                            zzic.m(zzguVar2);
                            zzguVar2.n.a("Activity created with data 'referrer' without required params");
                        }
                    }
                    R0 = null;
                    String str62 = (String) this.d;
                    if (this.b) {
                    }
                    zzxVar = zzxVar2;
                    if (TextUtils.isEmpty(str5)) {
                    }
                } catch (RuntimeException e2) {
                    zzgu zzguVar3 = ((zzic) zzljVar.b).f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.b(e2, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                zznl zznlVar = (zznl) this.f;
                zzgb zzgbVar = zznlVar.e;
                zzic zzicVar2 = (zzic) zznlVar.b;
                if (zzgbVar == null) {
                    zzgu zzguVar4 = zzicVar2.f;
                    zzic.m(zzguVar4);
                    zzguVar4.g.a("Failed to send default event parameters to service");
                    return;
                }
                boolean b0 = zzicVar2.d.b0(null, zzfy.W0);
                zzr zzrVar = (zzr) this.c;
                if (b0) {
                    zznlVar.i0(zzgbVar, this.b ? null : (zzbf) this.d, zzrVar);
                    return;
                }
                try {
                    zzgbVar.x3((Bundle) this.e, zzrVar);
                    zznlVar.d0();
                    return;
                } catch (RemoteException e3) {
                    zzgu zzguVar5 = zzicVar2.f;
                    zzic.m(zzguVar5);
                    zzguVar5.g.b(e3, "Failed to send default event parameters to service");
                    return;
                }
        }
    }

    public dbo(gt7 gt7Var, boolean z, Uri uri, String str, String str2) {
        this.b = z;
        this.c = uri;
        this.d = str;
        this.e = str2;
        this.f = gt7Var;
    }

    public dbo(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcs zzcsVar, String str, String str2, boolean z) {
        this.c = zzcsVar;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = appMeasurementDynamiteService;
    }

    public /* synthetic */ dbo(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = cloudMessagingReceiver;
        this.d = intent;
        this.e = context;
        this.b = z;
        this.f = pendingResult;
    }

    public dbo(zznl zznlVar, zzr zzrVar, boolean z, zzbf zzbfVar, Bundle bundle) {
        this.c = zzrVar;
        this.b = z;
        this.d = zzbfVar;
        this.e = bundle;
        Objects.requireNonNull(zznlVar);
        this.f = zznlVar;
    }
}
