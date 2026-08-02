package defpackage;

import android.net.Uri;
import com.facebook.internal.t;
import com.ironsource.C4427z5;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.b;
import com.moloco.sdk.internal.publisher.d0;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.internal.publisher.nativead.m;
import com.moloco.sdk.internal.publisher.nativead.model.e;
import com.moloco.sdk.internal.publisher.nativead.model.h;
import com.moloco.sdk.internal.s;
import com.moloco.sdk.internal.services.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import java.text.SimpleDateFormat;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a74 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a74(u6b u6bVar, Function1 function1, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 7;
        e6b e6bVar = e6b.a;
        this.u = u6bVar;
        this.v = function1;
        this.t = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new a74((qj4) this.u, this.t, (Function1) obj2, rq3Var, 0);
            case 1:
                a74 a74Var = new a74((x95) obj2, this.t, rq3Var, 1);
                a74Var.u = obj;
                return a74Var;
            case 2:
                a74 a74Var2 = new a74((hc6) obj2, this.t, rq3Var, 2);
                a74Var2.u = obj;
                return a74Var2;
            case 3:
                return new a74((u6b) this.u, (hc6) obj2, this.t, rq3Var, 3);
            case 4:
                return new a74((q50) this.u, this.t, (Function0) obj2, rq3Var, 4);
            case 5:
                return new a74((pjh) this.u, this.t, (rjh) obj2, rq3Var, 5);
            case 6:
                a74 a74Var3 = new a74((Function1) obj2, this.t, rq3Var, 6);
                a74Var3.u = obj;
                return a74Var3;
            case 7:
                u6b u6bVar = (u6b) this.u;
                e6b e6bVar = e6b.a;
                return new a74(u6bVar, (Function1) obj2, this.t, rq3Var);
            case 8:
                return new a74((n) this.u, this.t, (Function1) obj2, rq3Var, 8);
            case 9:
                return new a74((b) this.u, this.t, (d0) obj2, rq3Var, 9);
            case 10:
                return new a74((m) this.u, (h) obj2, this.t, rq3Var, 10);
            case 11:
                return new a74((e) this.u, (mqi) obj2, this.t, rq3Var, 11);
            case 12:
                return new a74((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) this.u, this.t, (g) obj2, rq3Var, 12);
            case 13:
                return new a74((d) this.u, this.t, (g) obj2, rq3Var, 13);
            case 14:
                return new a74((g0) this.u, this.t, (g) obj2, rq3Var, 14);
            case 15:
                return new a74((c) this.u, (String) obj2, this.t, rq3Var, 15);
            case 16:
                return new a74((a) this.u, this.t, (g) obj2, rq3Var, 16);
            default:
                return new a74(this.t, (m0) this.u, (x0) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((a74) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x040c, code lost:
    
        if (defpackage.n4o.z(r5, r17) == r1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0401, code lost:
    
        if (((kotlin.jvm.functions.Function1) r3).invoke(r17) == r1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x040c -> B:168:0x03f0). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Function2 function2;
        Object b;
        Object r;
        Object R;
        Object W;
        Object R2;
        Object W2;
        int i = this.r;
        int i2 = 19;
        int i3 = 2;
        long j = this.t;
        Object obj2 = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    pog y = sea.y(new h63((qj4) this.u, 11));
                    z64 z64Var = new z64(j, (Function1) obj2);
                    this.s = 1;
                    if (y.collect(z64Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.u;
                    ct8 ct8Var = ((x95) obj2).M;
                    dnd dndVar = new dnd(j);
                    this.s = 1;
                    if (ct8Var.invoke(ku3Var, dndVar, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0 && i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var2)) {
                    ((hc6) obj2).k();
                    this.u = ku3Var2;
                    this.s = 1;
                    if (n4o.z(j, this) == lu3Var3) {
                        return lu3Var3;
                    }
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.u;
                    e6b e6bVar = e6b.e;
                    a74 a74Var = new a74((hc6) obj2, this.t, (rq3) null, 2);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, a74Var, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    q50 q50Var = (q50) this.u;
                    dnd dndVar2 = new dnd(j);
                    i4k h0 = s02.h0(((Number) ((Function0) obj2).invoke()).intValue(), 0, jg5.d, 2);
                    this.s = 1;
                    if (q50.a(q50Var, dndVar2, h0, null, this, 12) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                rjh rjhVar = (rjh) obj2;
                pjh pjhVar = (pjh) this.u;
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    q50 q50Var2 = pjhVar.a;
                    c7a c7aVar = new c7a(j);
                    c80 c80Var = rjhVar.p;
                    this.s = 1;
                    a = q50.a(q50Var2, c7aVar, c80Var, null, this, 12);
                    if (a == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                a80 a80Var = (a80) a;
                if (a80Var.b == u70.b && (function2 = rjhVar.r) != null) {
                    function2.invoke(new c7a(pjhVar.b), ((eoh) a80Var.a.b).getValue());
                }
                return Unit.a;
            case 6:
                ku3 ku3Var3 = (ku3) this.u;
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        this.u = ku3Var3;
                        this.s = 2;
                        break;
                    } else if (i10 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                y6a.M(obj);
                if (!s9a.w(ku3Var3)) {
                    return Unit.a;
                }
                this.u = ku3Var3;
                this.s = 1;
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    u6b u6bVar2 = (u6b) this.u;
                    e6b e6bVar2 = e6b.e;
                    a74 a74Var2 = new a74((Function1) obj2, this.t, (rq3) null, 6);
                    this.s = 1;
                    if (b6a.A(u6bVar2, e6bVar2, a74Var2, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                n nVar = (n) this.u;
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) nVar.e;
                    ((i) nVar.c).getClass();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", wt3.m((String) nVar.d, " scheduled at ", new StringBuilder("Task "), simpleDateFormat.format(new Long(xd5.e(j) + System.currentTimeMillis()))), null, false, 12, null);
                    this.s = 1;
                    if (n4o.z(j, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xw3.L((ad2) nVar.a, null, null, new i3l(nVar, (Function1) obj2, rq3Var, i2), 3);
                return Unit.a;
            case 9:
                b bVar = (b) this.u;
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    com.moloco.sdk.internal.services.events.c cVar = bVar.c;
                    String str = ((d0) obj2).a;
                    this.s = 1;
                    b = cVar.b(this.t, f.a, str, this);
                    if (b == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                String str2 = (String) b;
                s sVar = bVar.g;
                str2.getClass();
                try {
                    Uri parse = Uri.parse(str2);
                    k kVar = sVar.a;
                    String uri = parse.toString();
                    uri.getClass();
                    kVar.a(uri);
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e.toString(), null, false, 12, null);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object b2 = ((m) this.u).b((h) obj2, j, this);
                    return b2 == lu3Var11 ? lu3Var11 : b2;
                }
                if (i14 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                e eVar = (e) this.u;
                lu3 lu3Var12 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    r = h0.r(eVar, (mqi) obj2, j, this);
                    if (r == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                l0 l0Var = (l0) r;
                if (l0Var instanceof k0) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully prepared native asset: " + eVar.a, null, false, 12, null);
                    return new Pair(eVar, l0Var);
                }
                if (!(l0Var instanceof j0)) {
                    zzl.b();
                    return null;
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare required native asset: " + eVar.a, null, false, 12, null);
                throw new com.moloco.sdk.internal.publisher.nativead.parser.a(eVar.a, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var).a);
            case 12:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) this.u;
                lu3 lu3Var13 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    eVar2.getAdLoader().a(j, (g) obj2);
                    ddi isLoaded = eVar2.isLoaded();
                    jk0 jk0Var = new jk0(i3, rq3Var, 6);
                    this.s = 1;
                    if (rd0.z(isLoaded, jk0Var, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eVar2.b();
                return Unit.a;
            case 13:
                g gVar = (g) obj2;
                d dVar = (d) this.u;
                lu3 lu3Var14 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    c cVar2 = dVar.c;
                    String str3 = dVar.a;
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    R = xw3.R(rob.a, new a74(cVar2, str3, this.t, (rq3) null, 15), this);
                    if (R == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                l0 l0Var2 = (l0) R;
                if (l0Var2 instanceof k0) {
                    dVar.d.m(null, Boolean.TRUE);
                    gVar.a();
                } else {
                    if (!(l0Var2 instanceof j0)) {
                        zzl.b();
                        return null;
                    }
                    gVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var2).a);
                }
                return Unit.a;
            case 14:
                g0 g0Var = (g0) this.u;
                lu3 lu3Var15 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (g0Var.b(this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                p d = g0Var.d();
                if (d != null) {
                    d.a(j, new t(12, (g) obj2, g0Var));
                }
                return Unit.a;
            case 15:
                c cVar3 = (c) this.u;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.d dVar2 = cVar3.d;
                lu3 lu3Var16 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    try {
                        String str4 = (String) obj2;
                        cVar3.getHtmlCssFixer().getClass();
                        str4.getClass();
                        cVar3.loadDataWithBaseURL("https://appassets.androidplatform.net", "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        ".concat(str4), "text/html", C4427z5.O, null);
                        luj lujVar = new luj(cVar3, rq3Var, 18);
                        this.s = 1;
                        W = wba.W(j, lujVar, this);
                        if (W == lu3Var16) {
                            return lu3Var16;
                        }
                    } catch (Exception e2) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticWebView", "loadHtml", e2, false, 8, null);
                        return new j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.b);
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    W = obj;
                }
                if (W == null) {
                    fdi fdiVar = dVar2.d;
                    Boolean bool = Boolean.TRUE;
                    fdiVar.getClass();
                    fdiVar.m(null, bool);
                }
                boolean booleanValue = ((Boolean) dVar2.e.getValue()).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) dVar2.i.a.getValue();
                return gVar2 != null ? new j0(gVar2) : booleanValue ? new k0(Unit.a) : new j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.a);
            case 16:
                g gVar3 = (g) obj2;
                a aVar = (a) this.u;
                fdi fdiVar2 = aVar.d;
                lu3 lu3Var17 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar = aVar.c;
                    String str5 = aVar.a;
                    this.s = 1;
                    fVar.getClass();
                    hs4 hs4Var2 = z45.a;
                    R2 = xw3.R(rob.a, new vo3(fVar, str5, this.t, (rq3) null, 4), this);
                    if (R2 == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R2 = obj;
                }
                l0 l0Var3 = (l0) R2;
                if (l0Var3 instanceof k0) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load success", null, false, 12, null);
                    fdiVar2.m(null, Boolean.TRUE);
                    gVar3.a();
                } else {
                    if (!(l0Var3 instanceof j0)) {
                        zzl.b();
                        return null;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load failure", null, false, 12, null);
                    fdiVar2.m(null, Boolean.FALSE);
                    gVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var3).a);
                }
                return Unit.a;
            default:
                m0 m0Var = (m0) this.u;
                lu3 lu3Var18 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    fdl fdlVar = new fdl(m0Var, (x0) obj2, rq3Var, i2);
                    this.s = 1;
                    W2 = wba.W(j, fdlVar, this);
                    if (W2 == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    W2 = obj;
                }
                m0 m0Var2 = (m0) W2;
                return m0Var2 == null ? m0Var : m0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a74(long j, m0 m0Var, x0 x0Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 17;
        this.t = j;
        this.u = m0Var;
        this.v = x0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a74(Object obj, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.t = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a74(Object obj, long j, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = j;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a74(Object obj, Object obj2, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.t = j;
    }
}
