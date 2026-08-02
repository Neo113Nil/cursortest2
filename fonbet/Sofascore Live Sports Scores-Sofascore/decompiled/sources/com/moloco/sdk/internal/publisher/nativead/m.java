package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.d0;
import com.moloco.sdk.internal.e0;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.c0;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.internal.publisher.h1;
import com.moloco.sdk.internal.publisher.u0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a70;
import defpackage.a74;
import defpackage.be5;
import defpackage.ccj;
import defpackage.dy9;
import defpackage.hs4;
import defpackage.km5;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wba;
import defpackage.wh4;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    public final Context a;
    public final String b;
    public final u0 c;
    public final dy9 d;
    public final com.moloco.sdk.acm.recorder.c e;
    public final AdFormatType f;
    public final com.moloco.sdk.acm.h g;

    public m(Context context, String str, u0 u0Var, com.facebook.b bVar, dy9 dy9Var, com.moloco.sdk.acm.recorder.c cVar, com.moloco.sdk.internal.services.i iVar) {
        str.getClass();
        this.a = context;
        this.b = str;
        this.c = u0Var;
        this.d = dy9Var;
        this.e = cVar;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.f = adFormatType;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        com.moloco.sdk.acm.h c = cVar.c("ad_create_to_load_ms");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        c.a("ad_type", lowerCase);
        this.g = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (r0 == r8) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.internal.ortb.model.h hVar, com.moloco.sdk.internal.publisher.nativead.model.h hVar2, h1 h1Var, long j, sq3 sq3Var) {
        g gVar;
        int i;
        com.moloco.sdk.internal.ortb.model.h hVar3;
        h1 h1Var2;
        l0 l0Var;
        d0 d0Var;
        d0 d0Var2;
        m mVar = this;
        if (sq3Var instanceof g) {
            gVar = (g) sq3Var;
            int i2 = gVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.w = i2 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.u;
                lu3 lu3Var = lu3.a;
                i = gVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    long a = mVar.d.a();
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    StringBuilder o = ljg.o("Native ad load startTimestampMs=", j, ", remainingTimeoutMs=");
                    o.append(xd5.e(a));
                    MolocoLogger.info$default(molocoLogger, "NativeAdLoader", o.toString(), null, false, 12, null);
                    a74 a74Var = new a74(mVar, hVar2, a, (rq3) null, 10);
                    gVar2.r = mVar;
                    hVar3 = hVar;
                    gVar2.s = hVar3;
                    h1Var2 = h1Var;
                    gVar2.t = h1Var2;
                    gVar2.w = 1;
                    obj = wba.W(a, a74Var, gVar2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            d0Var2 = (d0) gVar2.r;
                            y6a.M(obj);
                            p2g p2gVar = w2g.b;
                            return new u2g(new Exception(d0Var2.toString()));
                        }
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d0Var = (d0) gVar2.r;
                        y6a.M(obj);
                        p2g p2gVar2 = w2g.b;
                        return new u2g(new Exception(d0Var.toString()));
                    }
                    h1 h1Var3 = gVar2.t;
                    hVar3 = gVar2.s;
                    m mVar2 = (m) gVar2.r;
                    y6a.M(obj);
                    h1Var2 = h1Var3;
                    mVar = mVar2;
                }
                l0Var = (l0) obj;
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, "NativeAdLoader", "Handling native ad load result: " + l0Var, null, false, 12, null);
                if (l0Var != null) {
                    MolocoLogger.warn$default(molocoLogger2, "NativeAdLoader", "Native ad load timeout", null, false, 12, null);
                    d0 a2 = e0.a(mVar.b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.c);
                    gVar2.r = a2;
                    gVar2.s = null;
                    gVar2.t = null;
                    gVar2.w = 2;
                    if (mVar.c(h1Var2, a2, hVar3, gVar2) != lu3Var) {
                        d0Var2 = a2;
                        p2g p2gVar3 = w2g.b;
                        return new u2g(new Exception(d0Var2.toString()));
                    }
                } else {
                    if (!(l0Var instanceof j0)) {
                        if (l0Var instanceof k0) {
                            p2g p2gVar4 = w2g.b;
                            return ((k0) l0Var).a;
                        }
                        zzl.b();
                        return null;
                    }
                    d0 a3 = e0.a(mVar.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var).a);
                    gVar2.r = a3;
                    gVar2.s = null;
                    gVar2.t = null;
                    gVar2.w = 3;
                    if (mVar.c(h1Var2, a3, hVar3, gVar2) != lu3Var) {
                        d0Var = a3;
                        p2g p2gVar22 = w2g.b;
                        return new u2g(new Exception(d0Var.toString()));
                    }
                }
                return lu3Var;
            }
        }
        gVar = new g(mVar, sq3Var);
        g gVar22 = gVar;
        Object obj2 = gVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = gVar22.w;
        if (i != 0) {
        }
        l0Var = (l0) obj2;
        MolocoLogger molocoLogger22 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger22, "NativeAdLoader", "Handling native ad load result: " + l0Var, null, false, 12, null);
        if (l0Var != null) {
        }
        return lu3Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.moloco.sdk.internal.publisher.nativead.model.h hVar, long j, sq3 sq3Var) {
        f fVar;
        int i;
        com.moloco.sdk.acm.h c;
        String str;
        l0 l0Var;
        m mVar = this;
        if (sq3Var instanceof f) {
            fVar = (f) sq3Var;
            int i2 = fVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.w = i2 - Integer.MIN_VALUE;
                Object obj = fVar.u;
                lu3 lu3Var = lu3.a;
                i = fVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    long e = xd5.e(j) - (System.currentTimeMillis() - System.currentTimeMillis());
                    if (e < 0) {
                        e = 0;
                    }
                    long S = wkn.S(e, be5.MILLISECONDS);
                    List list = hVar.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof com.moloco.sdk.internal.publisher.nativead.model.d) {
                            arrayList.add(obj2);
                        }
                    }
                    String str2 = !arrayList.isEmpty() ? "video" : "image";
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    com.moloco.sdk.acm.recorder.c cVar = mVar.e;
                    c = cVar.c("native_ad_load_prepare_time");
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("native_ad_load_attempted");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    dVar.a("ad_type", lowerCase);
                    cVar.a(dVar);
                    List list2 = hVar.a;
                    fVar.r = mVar;
                    fVar.s = str2;
                    fVar.t = c;
                    fVar.w = 1;
                    Object f = mVar.f(list2, S, fVar);
                    if (f == lu3Var) {
                        return lu3Var;
                    }
                    String str3 = str2;
                    obj = f;
                    str = str3;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.moloco.sdk.acm.h hVar2 = fVar.t;
                    str = fVar.s;
                    m mVar2 = fVar.r;
                    y6a.M(obj);
                    c = hVar2;
                    mVar = mVar2;
                }
                l0Var = (l0) obj;
                if (l0Var instanceof j0) {
                    if (!(l0Var instanceof k0)) {
                        zzl.b();
                        return null;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdLoader", "NativeAd load successfully parsed and loaded all assets", null, false, 12, null);
                    com.moloco.sdk.acm.recorder.c cVar2 = mVar.e;
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("native_ad_load");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar2.a("result", "success");
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = str.toLowerCase(locale);
                    lowerCase2.getClass();
                    dVar2.a("ad_type", lowerCase2);
                    cVar2.a(dVar2);
                    com.moloco.sdk.acm.recorder.c cVar3 = mVar.e;
                    c.a("result", "success");
                    String lowerCase3 = str.toLowerCase(locale);
                    lowerCase3.getClass();
                    c.a("ad_type", lowerCase3);
                    cVar3.b(c);
                    return new k0(((k0) l0Var).a);
                }
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("NativeAd load failed: ");
                com.moloco.sdk.internal.publisher.nativead.parser.a aVar = (com.moloco.sdk.internal.publisher.nativead.parser.a) ((j0) l0Var).a;
                sb.append(aVar.b);
                MolocoLogger.info$default(molocoLogger, "NativeAdLoader", sb.toString(), null, false, 12, null);
                com.moloco.sdk.acm.recorder.c cVar4 = mVar.e;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("native_ad_load");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar3.a("result", "failure");
                Locale locale2 = Locale.ROOT;
                String lowerCase4 = str.toLowerCase(locale2);
                lowerCase4.getClass();
                dVar3.a("ad_type", lowerCase4);
                dVar3.a("reason", aVar.b.a());
                dVar3.a("asset_id", String.valueOf(aVar.a));
                cVar4.a(dVar3);
                com.moloco.sdk.acm.recorder.c cVar5 = mVar.e;
                c.a("result", "failure");
                String lowerCase5 = str.toLowerCase(locale2);
                lowerCase5.getClass();
                c.a("ad_type", lowerCase5);
                c.a("reason", aVar.b.a());
                c.a("asset_id", String.valueOf(aVar.a));
                cVar5.b(c);
                return new j0(aVar.b);
            }
        }
        fVar = new f(mVar, sq3Var);
        Object obj3 = fVar.u;
        lu3 lu3Var2 = lu3.a;
        i = fVar.w;
        if (i != 0) {
        }
        l0Var = (l0) obj3;
        if (l0Var instanceof j0) {
        }
    }

    public final Object c(h1 h1Var, d0 d0Var, com.moloco.sdk.internal.ortb.model.h hVar, sq3 sq3Var) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new ccj(h1Var, d0Var, hVar, null, 5), sq3Var);
        return R == lu3.a ? R : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, com.moloco.sdk.acm.h hVar, h1 h1Var, sq3 sq3Var) {
        h hVar2;
        int i;
        l0 l0Var;
        l0 l0Var2;
        if (sq3Var instanceof h) {
            hVar2 = (h) sq3Var;
            int i2 = hVar2.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar2.w = i2 - Integer.MIN_VALUE;
                Object obj = hVar2.u;
                lu3 lu3Var = lu3.a;
                i = hVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    hVar2.r = this;
                    hVar2.s = hVar;
                    hVar2.t = h1Var;
                    hVar2.w = 1;
                    obj = this.c.b(this.b, str, hVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l0Var2 = (l0) hVar2.r;
                        y6a.M(obj);
                        p2g p2gVar = w2g.b;
                        return new u2g(new Exception(((d0) ((j0) l0Var2).a).toString()));
                    }
                    h1Var = hVar2.t;
                    hVar = hVar2.s;
                    this = (m) hVar2.r;
                    y6a.M(obj);
                }
                l0Var = (l0) obj;
                if (l0Var instanceof j0) {
                    if (l0Var instanceof k0) {
                        p2g p2gVar2 = w2g.b;
                        return ((k0) l0Var).a;
                    }
                    zzl.b();
                    return null;
                }
                com.moloco.sdk.acm.recorder.c cVar = this.e;
                AdFormatType adFormatType = this.f;
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                hVar.a("result", "failure");
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                hVar.a("reason", String.valueOf(errorType.getErrorCode()));
                String name = adFormatType.name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                hVar.a("ad_type", lowerCase);
                cVar.b(hVar);
                com.moloco.sdk.acm.recorder.c cVar2 = this.e;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("load_ad_failed");
                dVar.a("reason", String.valueOf(errorType.getErrorCode()));
                String lowerCase2 = adFormatType.name().toLowerCase(locale);
                lowerCase2.getClass();
                dVar.a("ad_type", lowerCase2);
                cVar2.a(dVar);
                d0 d0Var = (d0) ((j0) l0Var).a;
                hVar2.r = l0Var;
                hVar2.s = null;
                hVar2.t = null;
                hVar2.w = 2;
                if (this.c(h1Var, d0Var, null, hVar2) != lu3Var) {
                    l0Var2 = l0Var;
                    p2g p2gVar3 = w2g.b;
                    return new u2g(new Exception(((d0) ((j0) l0Var2).a).toString()));
                }
                return lu3Var;
            }
        }
        hVar2 = new h(this, sq3Var);
        Object obj2 = hVar2.u;
        lu3 lu3Var2 = lu3.a;
        i = hVar2.w;
        if (i != 0) {
        }
        l0Var = (l0) obj2;
        if (l0Var instanceof j0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, com.moloco.sdk.internal.ortb.model.h hVar, h1 h1Var, sq3 sq3Var) {
        i iVar;
        int i;
        Object u2gVar;
        List list;
        List list2;
        if (sq3Var instanceof i) {
            iVar = (i) sq3Var;
            int i2 = iVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.v = i2 - Integer.MIN_VALUE;
                Object obj = iVar.t;
                Object obj2 = lu3.a;
                i = iVar.v;
                com.moloco.sdk.internal.publisher.nativead.model.g gVar = null;
                if (i == 0) {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = iVar.r;
                    y6a.M(obj);
                    return obj3;
                }
                y6a.M(obj);
                str.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject(IronSourceConstants.EVENTS_NATIVE);
                    if (optJSONObject != null) {
                        jSONObject = optJSONObject;
                    }
                    p2g p2gVar = w2g.b;
                    if (jSONObject.has("ver")) {
                        jSONObject.getString("ver");
                    }
                    List d = com.facebook.b.d(jSONObject.optJSONArray("assets"));
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("link");
                    if (optJSONObject2 != null) {
                        String string = optJSONObject2.getString("url");
                        if (optJSONObject2.has("fallback")) {
                            optJSONObject2.getString("fallback");
                        }
                        JSONArray optJSONArray = optJSONObject2.optJSONArray("clicktrackers");
                        if (optJSONArray == null) {
                            list = km5.a;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                arrayList.add(optJSONArray.getString(i3));
                            }
                            list = arrayList;
                        }
                        string.getClass();
                        gVar = new com.moloco.sdk.internal.publisher.nativead.model.g(string, list, 0);
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("imptrackers");
                    if (optJSONArray2 == null) {
                        list2 = km5.a;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = optJSONArray2.length();
                        for (int i4 = 0; i4 < length2; i4++) {
                            arrayList2.add(optJSONArray2.getString(i4));
                        }
                        list2 = arrayList2;
                    }
                    List f = com.facebook.b.f(jSONObject.optJSONArray("eventtrackers"));
                    if (jSONObject.has("privacy")) {
                        jSONObject.getString("privacy");
                    }
                    u2gVar = new com.moloco.sdk.internal.publisher.nativead.model.h(d, gVar, list2, f);
                } catch (Exception e) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(e);
                }
                Throwable a = w2g.a(u2gVar);
                if (a != null) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdLoader", "handleOrtbParsing", a, false, 8, null);
                    d0 a2 = e0.a(this.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.a);
                    iVar.r = u2gVar;
                    iVar.s = u2gVar;
                    iVar.v = 1;
                    if (c(h1Var, a2, hVar, iVar) == obj2) {
                        return obj2;
                    }
                }
                return u2gVar;
            }
        }
        iVar = new i(this, sq3Var);
        Object obj4 = iVar.t;
        Object obj22 = lu3.a;
        i = iVar.v;
        com.moloco.sdk.internal.publisher.nativead.model.g gVar2 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(List list, long j, sq3 sq3Var) {
        l lVar;
        int i;
        l0 l0Var;
        if (sq3Var instanceof l) {
            lVar = (l) sq3Var;
            int i2 = lVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.t = i2 - Integer.MIN_VALUE;
                Object obj = lVar.r;
                lu3 lu3Var = lu3.a;
                i = lVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    lVar.t = 1;
                    obj = h0.e(this.a, list, j, lVar);
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
                l0Var = (l0) obj;
                if (!(l0Var instanceof k0)) {
                    return new k0(((k0) l0Var).a);
                }
                if (!(l0Var instanceof j0)) {
                    zzl.b();
                    return null;
                }
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                Object obj2 = ((j0) l0Var).a;
                MolocoLogger.error$default(molocoLogger, "NativeAdLoader", "NativeAd prepareAssets failed", (Throwable) obj2, false, 8, null);
                return new j0(obj2);
            }
        }
        lVar = new l(this, sq3Var);
        Object obj3 = lVar.r;
        lu3 lu3Var2 = lu3.a;
        i = lVar.t;
        if (i != 0) {
        }
        l0Var = (l0) obj3;
        if (!(l0Var instanceof k0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, com.moloco.sdk.acm.h hVar, c0 c0Var, sq3 sq3Var) {
        j jVar;
        int i;
        if (sq3Var instanceof j) {
            jVar = (j) sq3Var;
            int i2 = jVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.t = i2 - Integer.MIN_VALUE;
                Object obj = jVar.r;
                lu3 lu3Var = lu3.a;
                i = jVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    wh4 wh4Var = new wh4(this, hVar, str, c0Var, null);
                    jVar.t = 1;
                    obj = xw3.R(hs4Var, wh4Var, jVar);
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
                return ((w2g) obj).a;
            }
        }
        jVar = new j(this, sq3Var);
        Object obj2 = jVar.r;
        lu3 lu3Var2 = lu3.a;
        i = jVar.t;
        if (i != 0) {
        }
        return ((w2g) obj2).a;
    }
}
