package com.sofascore.results.service;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.U3;
import com.sofascore.model.FirebaseBundle;
import defpackage.a70;
import defpackage.be5;
import defpackage.d17;
import defpackage.f5d;
import defpackage.gdb;
import defpackage.hdb;
import defpackage.ia0;
import defpackage.jdb;
import defpackage.k5a;
import defpackage.lu3;
import defpackage.me4;
import defpackage.n9e;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.wba;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.y6a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/results/service/InstallReferrerWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstallReferrerWorker extends CoroutineWorker {
    public InstallReferrerClient a;
    public final LinkedHashMap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.b = tub.g(new Pair("utm_id", null), new Pair("utm_source", null), new Pair("utm_medium", null), new Pair("utm_term", null), new Pair("utm_content", null), new Pair("utm_campaign", null));
    }

    public final void a(String str) {
        LinkedHashMap linkedHashMap = this.b;
        for (Object obj : linkedHashMap.keySet()) {
            obj.getClass();
            String str2 = (String) obj;
            String h0 = StringsKt.h0(StringsKt.d0(str, str2.concat(U3.j.b), ""), U3.j.c);
            if (h0.length() > 0) {
                linkedHashMap.put(str2, Uri.decode(h0));
            }
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("utm_link", str);
        firebaseBundle.putString("utm_campaign", (String) linkedHashMap.get("utm_campaign"));
        firebaseBundle.putString("utm_content", (String) linkedHashMap.get("utm_content"));
        firebaseBundle.putString("utm_id", (String) linkedHashMap.get("utm_id"));
        firebaseBundle.putString("utm_medium", (String) linkedHashMap.get("utm_medium"));
        firebaseBundle.putString("utm_source", (String) linkedHashMap.get("utm_source"));
        firebaseBundle.putString("utm_term", (String) linkedHashMap.get("utm_term"));
        ia0 ia0Var = ia0.q;
        FirebaseAnalytics d = me4.d((f5d) me4.e(), "install_attribution", firebaseBundle, applicationContext);
        d.a.e(n9e.K(firebaseBundle), null, "install_attribution", false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(10:5|6|(1:(1:9)(2:42|43))(2:44|(1:46))|10|(1:12)(1:41)|(1:40)(4:18|19|(1:38)(1:25)|26)|28|29|(1:31)|33))|47|6|(0)(0)|10|(0)(0)|(1:14)|40|28|29|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: all -> 0x00a1, CancellationException -> 0x00a2, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x00a2, all -> 0x00a1, blocks: (B:29:0x009a, B:31:0x009e), top: B:28:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        k5a k5aVar;
        int i;
        Integer num;
        Object hdbVar;
        InstallReferrerClient installReferrerClient;
        InstallReferrerClient installReferrerClient2;
        ReferrerDetails installReferrer;
        String installReferrer2;
        if (rq3Var instanceof k5a) {
            k5aVar = (k5a) rq3Var;
            int i2 = k5aVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k5aVar.t = i2 - Integer.MIN_VALUE;
                Object obj = k5aVar.r;
                lu3 lu3Var = lu3.a;
                i = k5aVar.t;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    this.a = InstallReferrerClient.newBuilder(getApplicationContext()).build();
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(10, be5.SECONDS);
                    d17 d17Var = new d17(this, rq3Var2, 28);
                    k5aVar.t = 1;
                    obj = wba.W(R, d17Var, k5aVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                num = (Integer) obj;
                if ((num == null ? num.intValue() : -1) == 0 || (installReferrerClient2 = this.a) == null || !installReferrerClient2.isReady()) {
                    hdbVar = new hdb();
                } else {
                    try {
                        InstallReferrerClient installReferrerClient3 = this.a;
                        if (installReferrerClient3 == null || (installReferrer = installReferrerClient3.getInstallReferrer()) == null || (installReferrer2 = installReferrer.getInstallReferrer()) == null) {
                            hdbVar = new hdb();
                        } else {
                            a(installReferrer2);
                            hdbVar = jdb.a();
                        }
                    } catch (RemoteException unused) {
                        hdbVar = new gdb();
                    }
                }
                installReferrerClient = this.a;
                if (installReferrerClient != null) {
                    installReferrerClient.endConnection();
                }
                return hdbVar;
            }
        }
        k5aVar = new k5a(this, (sq3) rq3Var);
        Object obj2 = k5aVar.r;
        lu3 lu3Var2 = lu3.a;
        i = k5aVar.t;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        num = (Integer) obj2;
        if ((num == null ? num.intValue() : -1) == 0) {
        }
        hdbVar = new hdb();
        installReferrerClient = this.a;
        if (installReferrerClient != null) {
        }
        return hdbVar;
    }
}
