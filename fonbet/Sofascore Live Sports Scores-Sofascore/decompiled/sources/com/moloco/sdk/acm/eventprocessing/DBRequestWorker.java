package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.facebook.login.i;
import com.ironsource.L6;
import com.moloco.sdk.acm.db.MetricsDb;
import com.moloco.sdk.acm.db.j;
import defpackage.a70;
import defpackage.gdb;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.mqi;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.vh9;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.yx1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class DBRequestWorker extends CoroutineWorker {
    public final String a;
    public final j b;
    public final String c;
    public final yx1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = "DBRequestWorker";
        this.b = MetricsDb.a.e(context).b();
        this.c = getInputData().e("url");
        Map h = tub.h(new Pair("AppKey", getInputData().e("AppKey")), new Pair("AppBundle", getInputData().e("AppBundle")), new Pair("AppVersion", getInputData().e("AppVersion")), new Pair("OS", getInputData().e("OS")), new Pair(L6.G, getInputData().e(L6.G)), new Pair("SdkVersion", getInputData().e("SdkVersion")), new Pair("Mediator", getInputData().e("Mediator")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : h.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str = (String) linkedHashMap.get("SdkVersion");
        String str2 = (String) linkedHashMap.get(L6.G);
        this.d = new yx1((String) linkedHashMap.get("AppBundle"), (String) linkedHashMap.get("AppVersion"), (String) linkedHashMap.get("AppKey"), str, (String) linkedHashMap.get("Mediator"), str2, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        a aVar;
        int i;
        try {
            if (rq3Var instanceof a) {
                aVar = (a) rq3Var;
                int i2 = aVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.s;
                    lu3 lu3Var = lu3.a;
                    i = aVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        String str = this.c;
                        if (str != null) {
                            vh9 vh9Var = com.moloco.sdk.acm.http.a.a;
                            vh9 vh9Var2 = (vh9) com.moloco.sdk.acm.http.b.a.getValue();
                            vh9Var2.getClass();
                            if (com.moloco.sdk.acm.http.a.a == null) {
                                com.moloco.sdk.acm.http.a.a = vh9Var2;
                                com.moloco.sdk.acm.http.a.b = str;
                            }
                            i iVar = new i((com.moloco.sdk.acm.http.e) com.moloco.sdk.acm.http.a.c.getValue(), this.b, new com.facebook.b(new com.facebook.b(14)), this.d);
                            aVar.r = this;
                            aVar.u = 1;
                            if (iVar.e(aVar) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        DBRequestWorker dBRequestWorker = aVar.r;
                        y6a.M(obj);
                        Object obj2 = ((w2g) obj).a;
                    }
                    return jdb.a();
                }
            }
            if (i != 0) {
            }
            return jdb.a();
        } catch (Exception e) {
            mqi mqiVar = com.moloco.sdk.acm.services.c.a;
            com.moloco.sdk.acm.services.c.c(this.a, "Work Manager failure: " + e.getMessage(), 12);
            return new gdb();
        }
        aVar = new a(this, (sq3) rq3Var);
        Object obj3 = aVar.s;
        lu3 lu3Var2 = lu3.a;
        i = aVar.u;
    }
}
