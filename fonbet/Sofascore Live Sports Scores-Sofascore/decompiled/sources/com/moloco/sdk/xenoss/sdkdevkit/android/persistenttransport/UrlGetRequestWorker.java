package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a70;
import defpackage.duf;
import defpackage.gdb;
import defpackage.hdb;
import defpackage.ief;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.rub;
import defpackage.sq3;
import defpackage.vh9;
import defpackage.y6a;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlGetRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "url", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UrlGetRequestWorker extends CoroutineWorker {
    public static final /* synthetic */ KProperty[] a = {duf.a.property0(new ief(UrlGetRequestWorker.class))};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlGetRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(f1.e(context), workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public static final String a(Map map) {
        map.getClass();
        return (String) rub.a(a[0].getName(), map);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        a aVar;
        Object obj;
        int i;
        Map unmodifiableMap;
        if (rq3Var instanceof a) {
            aVar = (a) rq3Var;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                obj = aVar.t;
                lu3 lu3Var = lu3.a;
                i = aVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vh9 a2 = com.moloco.sdk.service_locator.j.a();
                    unmodifiableMap = Collections.unmodifiableMap(getInputData().a);
                    unmodifiableMap.getClass();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Sending request to " + a(unmodifiableMap), null, false, 12, null);
                    String a3 = a(unmodifiableMap);
                    aVar.r = this;
                    aVar.s = unmodifiableMap;
                    aVar.v = 1;
                    obj = f1.i(a2, a3, aVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map = aVar.s;
                    UrlGetRequestWorker urlGetRequestWorker = aVar.r;
                    y6a.M(obj);
                    unmodifiableMap = map;
                    this = urlGetRequestWorker;
                }
                if (!((Boolean) obj).booleanValue()) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "[Success] Sent request to " + a(unmodifiableMap), null, false, 12, null);
                    return jdb.a();
                }
                if (this.getRunAttemptCount() >= 5) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "[Failure] Request to " + a(unmodifiableMap), null, false, 12, null);
                    return new gdb();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "[Failure][Retrying] Request to " + a(unmodifiableMap), null, false, 12, null);
                return new hdb();
            }
        }
        aVar = new a(this, (sq3) rq3Var);
        obj = aVar.t;
        lu3 lu3Var2 = lu3.a;
        i = aVar.v;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
