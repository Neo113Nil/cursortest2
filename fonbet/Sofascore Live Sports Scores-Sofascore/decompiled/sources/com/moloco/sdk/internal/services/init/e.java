package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import android.os.Build;
import com.ironsource.Ua;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a70;
import defpackage.ak9;
import defpackage.aq4;
import defpackage.hk9;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ij9;
import defpackage.lu3;
import defpackage.luj;
import defpackage.n8k;
import defpackage.pm0;
import defpackage.sq3;
import defpackage.t89;
import defpackage.vh9;
import defpackage.wj9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yj9;
import defpackage.z45;
import defpackage.zk9;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    public final s a;
    public final u b;
    public final com.moloco.sdk.internal.services.usertracker.c c;
    public final vh9 d;
    public final Uri e;

    public e(s sVar, u uVar, com.moloco.sdk.internal.services.usertracker.c cVar, vh9 vh9Var) {
        sVar.getClass();
        uVar.getClass();
        cVar.getClass();
        vh9Var.getClass();
        this.a = sVar;
        this.b = uVar;
        this.c = cVar;
        this.d = vh9Var;
        this.e = Uri.parse(BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178 A[Catch: Exception -> 0x01b3, TRY_LEAVE, TryCatch #7 {Exception -> 0x01b3, blocks: (B:49:0x016a, B:52:0x0178, B:57:0x01b6, B:59:0x01be, B:66:0x0202), top: B:48:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6 A[Catch: Exception -> 0x01b3, TRY_ENTER, TryCatch #7 {Exception -> 0x01b3, blocks: (B:49:0x016a, B:52:0x0178, B:57:0x01b6, B:59:0x01be, B:66:0x0202), top: B:48:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.moloco.sdk.acm.recorder.b] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.b bVar, sq3 sq3Var) {
        d dVar;
        Object obj;
        lu3 lu3Var;
        int i;
        com.moloco.sdk.acm.recorder.c cVar;
        Exception exc;
        e eVar;
        com.moloco.sdk.acm.h hVar;
        String str2;
        t tVar;
        MediationInfo mediationInfo2;
        c0 c0Var;
        String str3;
        String str4;
        com.moloco.sdk.acm.h hVar2;
        e eVar2;
        com.moloco.sdk.acm.recorder.c cVar2;
        zk9 d;
        com.moloco.sdk.acm.recorder.c cVar3;
        e eVar3;
        if (sq3Var instanceof d) {
            dVar = (d) sq3Var;
            int i2 = dVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.A = i2 - Integer.MIN_VALUE;
                obj = dVar.y;
                lu3Var = lu3.a;
                i = dVar.A;
                if (i != 0) {
                    y6a.M(obj);
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    cVar = (com.moloco.sdk.acm.recorder.c) bVar;
                    com.moloco.sdk.acm.h c = cVar.c("sdk_init_request_time_ms");
                    try {
                        c0 a = this.a.a();
                        t a2 = this.b.a();
                        com.moloco.sdk.internal.services.usertracker.c cVar4 = this.c;
                        dVar.r = this;
                        dVar.s = str;
                        dVar.t = mediationInfo;
                        dVar.u = cVar;
                        dVar.v = c;
                        dVar.w = a;
                        dVar.x = a2;
                        dVar.A = 1;
                        obj = cVar4.a(dVar);
                        if (obj != lu3Var) {
                            str2 = str;
                            eVar = this;
                            tVar = a2;
                            mediationInfo2 = mediationInfo;
                            hVar = c;
                            c0Var = a;
                        }
                        return lu3Var;
                    } catch (Exception e) {
                        exc = e;
                        eVar = this;
                        hVar = c;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            hVar2 = (com.moloco.sdk.acm.h) dVar.t;
                            com.moloco.sdk.acm.recorder.b bVar2 = (com.moloco.sdk.acm.recorder.b) dVar.s;
                            eVar2 = dVar.r;
                            try {
                                y6a.M(obj);
                                str3 = "SDK Init failed with status code: ";
                                cVar2 = bVar2;
                                try {
                                    aq4 aq4Var = (aq4) obj;
                                    d = aq4Var.d();
                                    try {
                                        if (!Intrinsics.c(d, zk9.c)) {
                                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                                            hVar2.a("result", "success");
                                            com.moloco.sdk.acm.recorder.c cVar5 = cVar2;
                                            cVar5.b(hVar2);
                                            hs4 hs4Var = z45.a;
                                            hq4 hq4Var = hq4.c;
                                            luj lujVar = new luj(aq4Var, null, 15);
                                            dVar.r = eVar2;
                                            dVar.s = cVar5;
                                            dVar.t = hVar2;
                                            dVar.A = 3;
                                            obj = xw3.R(hq4Var, lujVar, dVar);
                                            if (obj != lu3Var) {
                                                cVar3 = cVar5;
                                                eVar3 = eVar2;
                                                return new k0(obj);
                                            }
                                            return lu3Var;
                                        }
                                        if (!Intrinsics.c(d, zk9.l)) {
                                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                                            hVar2.a("result", "failure");
                                            hVar2.a("reason", String.valueOf(d.a));
                                            cVar2.b(hVar2);
                                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", str3 + d, null, false, 12, null);
                                            return new j0(new i(d.a));
                                        }
                                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                                        hVar2.a("result", "failure");
                                        hVar2.a("reason", String.valueOf(d.a));
                                        com.moloco.sdk.acm.recorder.c cVar6 = cVar2;
                                        cVar6.b(hVar2);
                                        try {
                                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "http status " + d + ": App not found or AppKey is not correct", null, false, 12, null);
                                            return new j0(new i(d.a));
                                        } catch (Exception e2) {
                                            e = e2;
                                            cVar2 = cVar6;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        cVar2 = "http status ";
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                cVar2 = bVar2;
                            }
                        } else {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hVar2 = (com.moloco.sdk.acm.h) dVar.t;
                            cVar2 = (com.moloco.sdk.acm.recorder.b) dVar.s;
                            eVar3 = dVar.r;
                            try {
                                y6a.M(obj);
                                cVar3 = cVar2;
                                try {
                                    return new k0(obj);
                                } catch (Exception e6) {
                                    e = e6;
                                    hVar = hVar2;
                                    cVar = cVar3;
                                    eVar = eVar3;
                                    exc = e;
                                    eVar.getClass();
                                    b bVar3 = exc instanceof hk9 ? b.a : exc instanceof SSLHandshakeException ? b.d : exc instanceof SocketException ? b.c : exc instanceof UnknownHostException ? b.b : b.f;
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "SDK Init failed with client exception", exc, false, 8, null);
                                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.a;
                                    hVar.a("result", "failure");
                                    hVar.a("reason", bVar3.name());
                                    cVar.b(hVar);
                                    return new j0(new h(bVar3));
                                }
                            } catch (Exception e7) {
                                e = e7;
                                eVar2 = eVar3;
                            }
                        }
                        exc = e;
                        hVar = hVar2;
                        cVar = cVar2;
                        eVar = eVar2;
                        eVar.getClass();
                        b bVar32 = exc instanceof hk9 ? b.a : exc instanceof SSLHandshakeException ? b.d : exc instanceof SocketException ? b.c : exc instanceof UnknownHostException ? b.b : b.f;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "SDK Init failed with client exception", exc, false, 8, null);
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr42 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        hVar.a("result", "failure");
                        hVar.a("reason", bVar32.name());
                        cVar.b(hVar);
                        return new j0(new h(bVar32));
                    }
                    tVar = dVar.x;
                    c0Var = dVar.w;
                    hVar = dVar.v;
                    cVar = dVar.u;
                    mediationInfo2 = (MediationInfo) dVar.t;
                    str2 = (String) dVar.s;
                    eVar = dVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Exception e8) {
                        e = e8;
                        exc = e;
                        eVar.getClass();
                        b bVar322 = exc instanceof hk9 ? b.a : exc instanceof SSLHandshakeException ? b.d : exc instanceof SocketException ? b.c : exc instanceof UnknownHostException ? b.b : b.f;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "SDK Init failed with client exception", exc, false, 8, null);
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr422 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        hVar.a("result", "failure");
                        hVar.a("reason", bVar322.name());
                        cVar.b(hVar);
                        return new j0(new h(bVar322));
                    }
                }
                String str5 = (String) obj;
                c0 c0Var2 = c0Var;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitApi", "Requesting Init with appKey: " + str2 + ", mref: " + str5 + ", url: " + eVar.e, false, 4, null);
                vh9 vh9Var = eVar.d;
                str3 = "SDK Init failed with status code: ";
                String uri = eVar.e.buildUpon().appendQueryParameter("app_key", str2).appendQueryParameter("rid", str5).build().toString();
                uri.getClass();
                yj9 yj9Var = new yj9();
                pm0 pm0Var = ak9.a;
                n8k.b(yj9Var.a, uri);
                t89 t89Var = yj9Var.c;
                c0Var2.getClass();
                String str6 = Build.VERSION.RELEASE;
                f1.l(t89Var, mediationInfo2);
                str4 = tVar.a;
                if (Intrinsics.c(str4, "com.example.demo2")) {
                    str4 = "com.trickytribe.penetrator";
                }
                t89Var.i("X-Moloco-App-Bundle", str4);
                Unit unit = Unit.a;
                com.facebook.appevents.n.i(yj9Var, Ua.C);
                yj9Var.d(ij9.b);
                wj9 wj9Var = new wj9(yj9Var, vh9Var);
                dVar.r = eVar;
                dVar.s = cVar;
                dVar.t = hVar;
                dVar.u = null;
                dVar.v = null;
                dVar.w = null;
                dVar.x = null;
                dVar.A = 2;
                obj = wj9Var.i(dVar);
                if (obj != lu3Var) {
                    hVar2 = hVar;
                    eVar2 = eVar;
                    cVar2 = cVar;
                    aq4 aq4Var2 = (aq4) obj;
                    d = aq4Var2.d();
                    if (!Intrinsics.c(d, zk9.c)) {
                    }
                }
                return lu3Var;
            }
        }
        dVar = new d(this, sq3Var);
        obj = dVar.y;
        lu3Var = lu3.a;
        i = dVar.A;
        if (i != 0) {
        }
        String str52 = (String) obj;
        c0 c0Var22 = c0Var;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitApi", "Requesting Init with appKey: " + str2 + ", mref: " + str52 + ", url: " + eVar.e, false, 4, null);
        vh9 vh9Var2 = eVar.d;
        str3 = "SDK Init failed with status code: ";
        String uri2 = eVar.e.buildUpon().appendQueryParameter("app_key", str2).appendQueryParameter("rid", str52).build().toString();
        uri2.getClass();
        yj9 yj9Var2 = new yj9();
        pm0 pm0Var2 = ak9.a;
        n8k.b(yj9Var2.a, uri2);
        t89 t89Var2 = yj9Var2.c;
        c0Var22.getClass();
        String str62 = Build.VERSION.RELEASE;
        f1.l(t89Var2, mediationInfo2);
        str4 = tVar.a;
        if (Intrinsics.c(str4, "com.example.demo2")) {
        }
        t89Var2.i("X-Moloco-App-Bundle", str4);
        Unit unit2 = Unit.a;
        com.facebook.appevents.n.i(yj9Var2, Ua.C);
        yj9Var2.d(ij9.b);
        wj9 wj9Var2 = new wj9(yj9Var2, vh9Var2);
        dVar.r = eVar;
        dVar.s = cVar;
        dVar.t = hVar;
        dVar.u = null;
        dVar.v = null;
        dVar.w = null;
        dVar.x = null;
        dVar.A = 2;
        obj = wj9Var2.i(dVar);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
