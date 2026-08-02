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
import defpackage.md4;
import defpackage.rq3;
import defpackage.rub;
import defpackage.sq3;
import defpackage.up3;
import defpackage.vh9;
import defpackage.y6a;
import defpackage.yhk;
import defpackage.yqo;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "url", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UrlPostRequestWorker extends CoroutineWorker {
    public static final /* synthetic */ KProperty[] a = {duf.a.property0(new ief(UrlPostRequestWorker.class))};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlPostRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(f1.e(context), workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public static final String a(Map map) {
        map.getClass();
        return (String) rub.a(a[0].getName(), map);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        b bVar;
        int i;
        UrlPostRequestWorker urlPostRequestWorker;
        Map map;
        if (rq3Var instanceof b) {
            bVar = (b) rq3Var;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.t;
                lu3 lu3Var = lu3.a;
                i = bVar2.v;
                byte[] bArr = null;
                if (i != 0) {
                    y6a.M(obj);
                    vh9 a2 = com.moloco.sdk.service_locator.j.a();
                    Map unmodifiableMap = Collections.unmodifiableMap(getInputData().a);
                    unmodifiableMap.getClass();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Sending request to " + a(unmodifiableMap), null, false, 12, null);
                    md4 inputData = getInputData();
                    inputData.getClass();
                    Object obj2 = inputData.a.get("body");
                    if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        int length = objArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            Object obj3 = objArr[i3];
                            if (obj3 == null) {
                                yhk.s("null cannot be cast to non-null type kotlin.Byte");
                                return null;
                            }
                            bArr2[i3] = ((Byte) obj3).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        return new gdb();
                    }
                    String e = getInputData().e("contentType");
                    if (e != null) {
                        up3 up3Var = up3.e;
                        up3 G = yqo.G(e);
                        if (G != null) {
                            String e2 = getInputData().e("contentEncoding");
                            byte[] bArr3 = bArr;
                            String a3 = a(unmodifiableMap);
                            bVar2.r = this;
                            bVar2.s = unmodifiableMap;
                            bVar2.v = 1;
                            Object j = f1.j(a2, a3, bArr3, G, e2, bVar2);
                            if (j == lu3Var) {
                                return lu3Var;
                            }
                            urlPostRequestWorker = this;
                            map = unmodifiableMap;
                            obj = j;
                        }
                    }
                    return new gdb();
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = bVar2.s;
                urlPostRequestWorker = bVar2.r;
                y6a.M(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Request to " + a(map) + " was successful: " + booleanValue, null, false, 12, null);
                return !booleanValue ? jdb.a() : urlPostRequestWorker.getRunAttemptCount() >= 5 ? new gdb() : new hdb();
            }
        }
        bVar = new b(this, (sq3) rq3Var);
        b bVar22 = bVar;
        Object obj4 = bVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = bVar22.v;
        byte[] bArr4 = null;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Request to " + a(map) + " was successful: " + booleanValue2, null, false, 12, null);
        if (!booleanValue2) {
        }
    }
}
