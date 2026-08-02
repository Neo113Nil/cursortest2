package defpackage;

import android.database.sqlite.SQLiteException;
import com.facebook.login.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.acm.db.c;
import com.moloco.sdk.acm.db.j;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.ortb.model.a0;
import com.moloco.sdk.internal.ortb.model.d;
import com.moloco.sdk.internal.ortb.model.n0;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class vo3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ long u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(String str, i iVar, c cVar, long j, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.t = str;
        this.v = iVar;
        this.w = cVar;
        this.u = j;
        this.x = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                vo3 vo3Var = new vo3((wo3) this.v, (idk) obj3, (a42) obj2, this.u, rq3Var);
                vo3Var.t = obj;
                return vo3Var;
            case 1:
                vo3 vo3Var2 = new vo3((g6f) this.v, (lcj) obj3, this.u, (wzc) obj2, rq3Var);
                vo3Var2.t = obj;
                return vo3Var2;
            case 2:
                return new vo3((String) this.t, (i) this.v, (c) obj3, this.u, (ArrayList) obj2, rq3Var);
            case 3:
                vo3 vo3Var3 = new vo3((n) obj3, (g) obj2, this.u, rq3Var, 3);
                vo3Var3.t = obj;
                return vo3Var3;
            case 4:
                return new vo3((f) obj3, (String) obj2, this.u, rq3Var, 4);
            default:
                vo3 vo3Var4 = new vo3((x0) obj3, (g) obj2, this.u, rq3Var, 5);
                vo3Var4.t = obj;
                return vo3Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vo3) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x04d2, code lost:
    
        if (r1.e(r34) == r4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0574, code lost:
    
        if (r8.a(r3, r34) == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0552, code lost:
    
        if (r3 == r2) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x040d  */
    /* JADX WARN: Type inference failed for: r2v38, types: [av4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v48, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        svg svgVar;
        m1d m1dVar;
        Object E;
        ku3 ku3Var;
        Object i;
        l0 l0Var;
        av4 t;
        Object h;
        n0 n0Var;
        l0 l0Var2;
        a aVar;
        Object T;
        b bVar;
        h hVar;
        Object R;
        h c;
        Object W;
        String str;
        CancellationException cancellationException2;
        ?? t2;
        Object w;
        a0 a0Var;
        d dVar;
        n0 n0Var2;
        Object T2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g gVar;
        x0 x0Var;
        int i2 = this.r;
        long j = this.u;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i2) {
            case 0:
                wo3 wo3Var = (wo3) this.v;
                j0l j0lVar = wo3Var.t;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                try {
                    if (i3 == 0) {
                        y6a.M(obj);
                        yda x = bea.x(((ku3) this.t).getCoroutineContext());
                        try {
                            wo3Var.w = true;
                            svgVar = wo3Var.p;
                            m1dVar = m1d.a;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            uo3 uo3Var = new uo3((idk) obj3, wo3Var, (a42) obj2, this.u, x, null);
                            this.s = 1;
                            if (svgVar.f(m1dVar, uo3Var, this) == lu3Var) {
                                return lu3Var;
                            }
                        } catch (CancellationException e) {
                            e = e;
                            wo3Var = wo3Var;
                            cancellationException = e;
                            try {
                                throw cancellationException;
                            } catch (Throwable th2) {
                                th = th2;
                                wo3Var.w = false;
                                j0lVar.k(cancellationException);
                                wo3Var.u = false;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            wo3Var = wo3Var;
                            cancellationException = null;
                            wo3Var.w = false;
                            j0lVar.k(cancellationException);
                            wo3Var.u = false;
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            y6a.M(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            cancellationException = null;
                            wo3Var.w = false;
                            j0lVar.k(cancellationException);
                            wo3Var.u = false;
                            throw th;
                        }
                    }
                    j0lVar.u();
                    wo3Var.w = false;
                    j0lVar.k(null);
                    wo3Var.u = false;
                    return Unit.a;
                } catch (CancellationException e2) {
                    e = e2;
                }
            case 1:
                lcj lcjVar = (lcj) obj3;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    xw3.L((ku3) this.t, null, null, new h2((lcj) obj3, this.u, (wzc) obj2, (rq3) null, 8), 3);
                    g6f g6fVar = (g6f) this.v;
                    this.s = 1;
                    E = g6fVar.E(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        lcjVar.w = null;
                        return Unit.a;
                    }
                    y6a.M(obj);
                    E = obj;
                }
                boolean booleanValue = ((Boolean) E).booleanValue();
                l6f l6fVar = lcjVar.w;
                if (l6fVar != null) {
                    wzc wzcVar = (wzc) obj2;
                    i7a m6fVar = booleanValue ? new m6f(l6fVar) : new k6f(l6fVar);
                    this.s = 2;
                    break;
                }
                lcjVar.w = null;
                return Unit.a;
            case 2:
                i iVar = (i) this.v;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                try {
                } catch (SQLiteException e3) {
                    mqi mqiVar = com.moloco.sdk.acm.services.c.a;
                    com.moloco.sdk.acm.services.c.b("EventProcessor", "Database error: " + e3.getMessage());
                } catch (Exception e4) {
                    mqi mqiVar2 = com.moloco.sdk.acm.services.c.a;
                    com.moloco.sdk.acm.services.c.b("EventProcessor", "Unexpected error while processing event: " + e4.getMessage());
                }
                if (i5 == 0) {
                    y6a.M(obj);
                    ((j) iVar.b).a(new com.moloco.sdk.acm.db.b(0L, (String) this.t, System.currentTimeMillis(), (c) obj3, new Long(j), (ArrayList) obj2));
                    com.moloco.sdk.acm.eventprocessing.f fVar = (com.moloco.sdk.acm.eventprocessing.f) iVar.c;
                    this.s = 1;
                    if (fVar.c(this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                i iVar2 = (i) iVar.d;
                this.s = 2;
                break;
            case 3:
                g gVar2 = (g) obj2;
                n nVar = (n) obj3;
                y yVar = nVar.a;
                u uVar = nVar.c;
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.t;
                    if (nVar.g instanceof k0) {
                        gVar2.a();
                        return Unit.a;
                    }
                    String str2 = yVar.a;
                    String str3 = yVar.d.b;
                    if (str3 == null) {
                        str3 = "UNKNOWN_MTID";
                    }
                    this.t = ku3Var;
                    this.s = 1;
                    i = uVar.i(str2, str3, true, this);
                    if (i == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj);
                                nVar.h.m(null, Boolean.TRUE);
                                gVar2.a();
                                return Unit.a;
                            }
                            a aVar2 = (a) this.t;
                            y6a.M(obj);
                            aVar = aVar2;
                            T = obj;
                            a a = a.a(aVar, (m0) T);
                            nVar.g = new k0(a);
                            bVar = nVar.f;
                            if (bVar == null) {
                                com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                                hVar = ((com.moloco.sdk.acm.recorder.c) bVar).c("vast_show_file_not_exists_load_to_show_ms");
                            } else {
                                hVar = null;
                            }
                            nVar.k = hVar;
                            this.t = null;
                            this.s = 4;
                            hs4 hs4Var = z45.a;
                            R = xw3.R(hq4.c, new pdk(nVar, a, null, 20), this);
                            if (R != lu3Var4) {
                                R = Unit.a;
                            }
                            if (R == lu3Var4) {
                                return lu3Var4;
                            }
                            nVar.h.m(null, Boolean.TRUE);
                            gVar2.a();
                            return Unit.a;
                        }
                        t = (av4) this.v;
                        l0 l0Var3 = (l0) this.t;
                        y6a.M(obj);
                        l0Var = l0Var3;
                        h = obj;
                        l0Var2 = (l0) h;
                        if (l0Var2 instanceof k0) {
                            if (!(l0Var2 instanceof j0)) {
                                zzl.b();
                                return null;
                            }
                            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "VastAdLoad", "main VAST ad didn't load due to failure or timeout", false, 4, null);
                            Object obj4 = ((j0) l0Var2).a;
                            k kVar = (k) obj4;
                            kVar.getClass();
                            if (kVar == k.x || kVar == k.y || kVar == k.z) {
                                t.e(null);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.a;
                                nVar.g = new j0((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj4);
                                gVar2.b(aVar3);
                            } else {
                                nVar.b(t, gVar2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj4);
                            }
                            return Unit.a;
                        }
                        aVar = (a) ((k0) l0Var).a;
                        this.t = aVar;
                        this.v = null;
                        this.s = 3;
                        T = t.T(this);
                        if (T == lu3Var4) {
                            return lu3Var4;
                        }
                        a a2 = a.a(aVar, (m0) T);
                        nVar.g = new k0(a2);
                        bVar = nVar.f;
                        if (bVar == null) {
                        }
                        nVar.k = hVar;
                        this.t = null;
                        this.s = 4;
                        hs4 hs4Var2 = z45.a;
                        R = xw3.R(hq4.c, new pdk(nVar, a2, null, 20), this);
                        if (R != lu3Var4) {
                        }
                        if (R == lu3Var4) {
                        }
                        nVar.h.m(null, Boolean.TRUE);
                        gVar2.a();
                        return Unit.a;
                    }
                    ku3Var = (ku3) this.t;
                    y6a.M(obj);
                    i = obj;
                }
                l0Var = (l0) i;
                d dVar2 = yVar.d.a;
                t = xw3.t(ku3Var, null, new m(this.u, (dVar2 == null || (n0Var = dVar2.i) == null) ? null : h0.b(n0Var), nVar, null, 1), 3);
                if (!(l0Var instanceof k0)) {
                    if (l0Var instanceof j0) {
                        nVar.b(t, gVar2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var).a);
                        return Unit.a;
                    }
                    zzl.b();
                    return null;
                }
                a aVar4 = (a) ((k0) l0Var).a;
                this.t = l0Var;
                this.v = t;
                this.s = 2;
                h = uVar.h(aVar4, j, this);
                if (h == lu3Var4) {
                    return lu3Var4;
                }
                l0Var2 = (l0) h;
                if (l0Var2 instanceof k0) {
                }
                break;
            case 4:
                f fVar2 = (f) obj3;
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    com.moloco.sdk.acm.recorder.c cVar = fVar2.b;
                    com.moloco.sdk.acm.recorder.c cVar2 = fVar2.b;
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr2 = com.moloco.sdk.internal.client_metrics_data.c.b;
                    c = cVar.c("webview_load_ad_ms");
                    String b = f.b();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Loading ad in webView, with webview version: ".concat(b), null, false, 12, null);
                    try {
                        ((f) obj3).loadDataWithBaseURL(null, (String) obj2, "text/html", C.UTF8_NAME, null);
                        luj lujVar = new luj(fVar2, null, 19);
                        this.t = c;
                        this.v = b;
                        this.s = 1;
                        W = wba.W(j, lujVar, this);
                        if (W == lu3Var5) {
                            return lu3Var5;
                        }
                        str = b;
                    } catch (Exception e5) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "loadHtml failed to load the provided html", e5, false, 8, null);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("webview_load_ad");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar3.a("result", "failure");
                        dVar3.a("reason", "invalid_url");
                        dVar3.a("webview_version", b);
                        cVar2.a(dVar3);
                        c.a("result", "failure");
                        c.a("reason", "invalid_url");
                        c.a("webview_version", b);
                        cVar2.b(c);
                        return new j0(f0.b);
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.v;
                    h hVar2 = (h) this.t;
                    y6a.M(obj);
                    c = hVar2;
                    W = obj;
                }
                if (W == null) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to timeout", null, false, 12, null);
                    com.moloco.sdk.acm.recorder.c cVar3 = fVar2.b;
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d("webview_load_ad");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar4.a("result", "failure");
                    dVar4.a("reason", "timeout_error");
                    dVar4.a("webview_version", str);
                    cVar3.a(dVar4);
                    com.moloco.sdk.acm.recorder.c cVar4 = fVar2.b;
                    c.a("result", "failure");
                    c.a("reason", "timeout_error");
                    c.a("webview_version", str);
                    cVar4.b(c);
                    return new j0(f0.f);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.j jVar = fVar2.c;
                com.moloco.sdk.acm.recorder.c cVar5 = fVar2.b;
                boolean booleanValue2 = ((Boolean) jVar.f.getValue()).booleanValue();
                f0 f0Var = (f0) fVar2.c.j.a.getValue();
                if (f0Var != null) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unrecoverable error: " + f0Var.name(), null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar5 = new com.moloco.sdk.acm.d("webview_load_ad");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar5.a("result", "failure");
                    dVar5.a("reason", f0Var.name());
                    dVar5.a("webview_version", str);
                    cVar5.a(dVar5);
                    c.a("result", "failure");
                    c.a("reason", f0Var.name());
                    c.a("webview_version", str);
                    cVar5.b(c);
                    return new j0(f0Var);
                }
                if (booleanValue2) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad loaded successfully in webView", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar6 = new com.moloco.sdk.acm.d("webview_load_ad");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar6.a("result", "success");
                    dVar6.a("webview_version", str);
                    cVar5.a(dVar6);
                    c.a("result", "success");
                    c.a("webview_version", str);
                    cVar5.b(c);
                    return new k0(Unit.a);
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unknown error", null, false, 12, null);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr5 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar7 = new com.moloco.sdk.acm.d("webview_load_ad");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr5 = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar7.a("result", "failure");
                dVar7.a("reason", "unknown_error");
                dVar7.a("webview_version", str);
                cVar5.a(dVar7);
                c.a("result", "failure");
                c.a("reason", "unknown_error");
                c.a("webview_version", str);
                cVar5.b(c);
                return new j0(f0.a);
            default:
                g gVar3 = (g) obj2;
                x0 x0Var2 = (x0) obj3;
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                rq3 rq3Var = null;
                if (i8 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.t;
                    if (x0Var2.g instanceof k0) {
                        gVar3.a();
                        return Unit.a;
                    }
                    cancellationException2 = null;
                    av4 t3 = xw3.t(ku3Var2, null, new z40(this.u, x0Var2, rq3Var, 13), 3);
                    y yVar2 = x0Var2.b;
                    a74 a74Var = new a74(this.u, (yVar2 == null || (a0Var = yVar2.d) == null || (dVar = a0Var.a) == null || (n0Var2 = dVar.i) == null) ? null : h0.b(n0Var2), x0Var2, (rq3) null);
                    x0Var2 = x0Var2;
                    t2 = xw3.t(ku3Var2, null, a74Var, 3);
                    try {
                        this.t = t2;
                        this.s = 1;
                        w = t3.w(this);
                        t2 = t2;
                        if (w == lu3Var6) {
                            return lu3Var6;
                        }
                    } catch (qij unused) {
                        ((kea) t2).e(cancellationException2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e;
                        x0Var2.g = new j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e);
                        gVar3.b(aVar5);
                        return Unit.a;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g) this.v;
                        x0 x0Var3 = (x0) this.t;
                        y6a.M(obj);
                        x0Var = x0Var3;
                        cancellationException2 = null;
                        T2 = obj;
                        gVar.getClass();
                        k0 k0Var = new k0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g((m0) T2));
                        x0Var.getClass();
                        x0Var.g = k0Var;
                        x0Var2.e.m(cancellationException2, Boolean.TRUE);
                        gVar3.a();
                        return Unit.a;
                    }
                    t2 = (zu4) this.t;
                    try {
                        y6a.M(obj);
                        w = obj;
                        cancellationException2 = null;
                        t2 = t2;
                    } catch (qij unused2) {
                        cancellationException2 = null;
                        ((kea) t2).e(cancellationException2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar52 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e;
                        x0Var2.g = new j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e);
                        gVar3.b(aVar52);
                        return Unit.a;
                    }
                }
                l0 l0Var4 = (l0) w;
                if (l0Var4 == null) {
                    gVar3.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b);
                } else {
                    if (!(l0Var4 instanceof j0)) {
                        if (!(l0Var4 instanceof k0)) {
                            zzl.b();
                            return null;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g gVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g) ((k0) l0Var4).a;
                        this.t = x0Var2;
                        this.v = gVar4;
                        this.s = 2;
                        T2 = t2.T(this);
                        if (T2 != lu3Var6) {
                            gVar = gVar4;
                            x0Var = x0Var2;
                            gVar.getClass();
                            k0 k0Var2 = new k0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g((m0) T2));
                            x0Var.getClass();
                            x0Var.g = k0Var2;
                            x0Var2.e.m(cancellationException2, Boolean.TRUE);
                            gVar3.a();
                        }
                        return lu3Var6;
                    }
                    gVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var4).a);
                    ((kea) t2).e(cancellationException2);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(g6f g6fVar, lcj lcjVar, long j, wzc wzcVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.v = g6fVar;
        this.w = lcjVar;
        this.u = j;
        this.x = wzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo3(Object obj, Object obj2, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.x = obj2;
        this.u = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(wo3 wo3Var, idk idkVar, a42 a42Var, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.v = wo3Var;
        this.w = idkVar;
        this.x = a42Var;
        this.u = j;
    }
}
