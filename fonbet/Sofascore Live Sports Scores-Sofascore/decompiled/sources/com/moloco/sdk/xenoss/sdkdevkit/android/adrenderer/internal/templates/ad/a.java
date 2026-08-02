package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.blaze.ima.ImaHandler;
import com.facebook.internal.t;
import com.google.android.gms.internal.ads.zzgdh;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.internal.publisher.o0;
import com.moloco.sdk.internal.services.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l;
import defpackage.a70;
import defpackage.aeh;
import defpackage.ak9;
import defpackage.aq4;
import defpackage.b1d;
import defpackage.d11;
import defpackage.ddi;
import defpackage.e1d;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.hje;
import defpackage.hoi;
import defpackage.i3l;
import defpackage.ij9;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.n8k;
import defpackage.pdk;
import defpackage.pm0;
import defpackage.pog;
import defpackage.pvd;
import defpackage.qze;
import defpackage.r69;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.sea;
import defpackage.vf;
import defpackage.vh9;
import defpackage.wj9;
import defpackage.wt3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yj9;
import defpackage.z88;
import defpackage.zjo;
import defpackage.zk9;
import defpackage.zzl;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new a((b) this.t, (t) obj2, rq3Var, 0);
            case 1:
                return new a((f) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) obj2, rq3Var, 1);
            case 2:
                return new a((j) this.t, (WebView) obj2, rq3Var, 2);
            case 3:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b) this.t, (String) obj2, rq3Var, 3);
            case 4:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f) this.t, (e) obj2, rq3Var, 4);
            case 5:
                a aVar = new a((VastActivity) obj2, rq3Var, 5);
                aVar.t = obj;
                return aVar;
            case 6:
                return new a((u) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj2, rq3Var, 6);
            case 7:
                return new a((d) this.t, (m) obj2, rq3Var, 7);
            case 8:
                a aVar2 = new a((fdi) obj2, rq3Var, 8);
                aVar2.t = obj;
                return aVar2;
            case 9:
                return new a((fdi) this.t, (fdi) obj2, rq3Var, 9);
            case 10:
                return new a((g) obj2, rq3Var, 10);
            case 11:
                return new a((g) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e) obj2, rq3Var, 11);
            case 12:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) obj2, rq3Var, 12);
            case 13:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) obj2, rq3Var, 13);
            case 14:
                return new a((l) obj2, rq3Var, 14);
            case 15:
                a aVar3 = new a((g) obj2, rq3Var, 15);
                aVar3.t = obj;
                return aVar3;
            case 16:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a) obj2, rq3Var, 16);
            case 17:
                return new a((c) this.t, (Function1) obj2, rq3Var, 17);
            case 18:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) obj2, rq3Var, 18);
            case 19:
                return new a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) obj2, rq3Var, 19);
            case 20:
                return new a((e1d) this.t, (f1d) obj2, rq3Var, 20);
            case 21:
                return new a((vh9) this.t, (String) obj2, rq3Var, 21);
            case 22:
                return new a((ImaHandler) this.t, (vf) obj2, rq3Var, 22);
            default:
                return new a((zzgdh) this.t, (String) obj2, rq3Var, 23);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((a) create((d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((a) create((x) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((a) create((qze) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return new a((ImaHandler) this.t, (vf) this.u, (rq3) obj2, 22).invokeSuspend(Unit.a);
            default:
                return ((a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0246, code lost:
    
        if (defpackage.n4o.y(50, r19) == r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02b6, code lost:
    
        if (r7.a(r19) == r0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x065b, code lost:
    
        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) r19.t).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) r7, r19) == r0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x064a, code lost:
    
        if (defpackage.n4o.y(1500, r19) == r0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
    
        if (r2.collect(r3, r19) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        if (r0.a(r19) == r1) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d2  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object z;
        Object obj2;
        d dVar;
        z88 z88Var;
        g gVar;
        Object k;
        View c;
        View view;
        View view2;
        Object z2;
        Object i;
        b1d b1dVar;
        int i2 = this.r;
        boolean z3 = false;
        z3 = false;
        int i3 = 2;
        Object obj3 = this.u;
        int i4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (i2) {
            case 0:
                b bVar = (b) this.t;
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    fdi fdiVar = bVar.g;
                    Boolean bool = Boolean.TRUE;
                    fdiVar.getClass();
                    fdiVar.m(null, bool);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show called, isAdDisplaying: " + ((Boolean) bVar.g.getValue()).booleanValue(), null, false, 12, null);
                    ddi unrecoverableError = bVar.d.getUnrecoverableError();
                    d11 d11Var = new d11(i3, objArr == true ? 1 : 0, 25);
                    this.s = 1;
                    z = rd0.z(unrecoverableError, d11Var, this);
                    if (z == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    z = obj;
                }
                f0 f0Var = (f0) z;
                if (f0Var != null) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show error: " + f0Var, null, false, 12, null);
                    ((t) obj3).a(f0Var);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.s = 2;
                int i7 = f.h;
                break;
            case 2:
                j jVar = (j) this.t;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    long j = (jVar.k * 1000) + 1000;
                    this.s = 1;
                    if (n4o.y(j, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) jVar.e.getValue()).booleanValue()) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Skip reload; content already loaded after backoff", null, false, 12, null);
                    return Unit.a;
                }
                g9i g9iVar = jVar.o;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                g9i g9iVar2 = jVar.m;
                if (g9iVar2 != null) {
                    g9iVar2.e(null);
                }
                ((WebView) obj3).reload();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Reload attempt: " + jVar.k, null, false, 12, null);
                return Unit.a;
            case 3:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b) this.t;
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    z zVar = bVar2.a;
                    String str = (String) obj3;
                    str.getClass();
                    aeh aehVar = bVar2.c;
                    this.s = 1;
                    if (zVar.a.a(str)) {
                        obj2 = Unit.a;
                        Object emit = aehVar.emit(obj2, this);
                        if (emit == lu3Var4) {
                            obj2 = emit;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                    if (obj2 == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f) this.t).c.emit((e) obj3, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    d dVar2 = (d) this.t;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "VastActivity received event: " + dVar2, null, false, 12, null);
                    aeh aehVar2 = VastActivity.e;
                    this.t = dVar2;
                    this.s = 1;
                    if (aehVar2.emit(dVar2, this) == lu3Var6) {
                        return lu3Var6;
                    }
                    dVar = dVar2;
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (d) this.t;
                    y6a.M(obj);
                }
                aeh aehVar3 = VastActivity.e;
                if ((dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c) || Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.d)) {
                    ((VastActivity) obj3).finish();
                }
                return Unit.a;
            case 6:
                u uVar = (u) this.t;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar2 = uVar.c;
                String str2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj3).a.d;
                jVar2.getClass();
                str2.getClass();
                l0 b = jVar2.b();
                if (b instanceof j0) {
                    z88Var = new pog(new hje((j0) b, objArr4 == true ? 1 : 0, 24));
                } else {
                    if (!(b instanceof k0)) {
                        zzl.b();
                        return null;
                    }
                    File file = (File) ((k0) b).a;
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Collecting status for media file: ".concat(str2), null, false, 12, null);
                    File file2 = new File(file, i0.d(str2));
                    if (file2.exists() && n.h(file2)) {
                        z88Var = new pog(new i3l(file2, objArr2 == true ? 1 : 0, 26));
                    } else {
                        MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Media file needs to be downloaded: ".concat(str2), null, false, 12, null);
                        ConcurrentHashMap concurrentHashMap = jVar2.g;
                        Object obj4 = concurrentHashMap.get(str2);
                        if (obj4 == null) {
                            MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Download has not yet started for: ".concat(str2), null, false, 12, null);
                            obj4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file2, i.a));
                            Object putIfAbsent = concurrentHashMap.putIfAbsent(str2, obj4);
                            if (putIfAbsent != null) {
                                obj4 = putIfAbsent;
                            }
                        }
                        z88Var = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj4).b;
                    }
                }
                pdk pdkVar = new pdk(uVar, objArr3 == true ? 1 : 0, 27);
                this.s = 1;
                Object B = rd0.B(z88Var, pdkVar, this);
                return B == lu3Var7 ? lu3Var7 : B;
            case 7:
                d dVar3 = (d) this.t;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdController", "Emitting event: " + dVar3, null, false, 12, null);
                    aeh aehVar4 = ((m) obj3).h;
                    this.s = 1;
                    if (aehVar4.emit(dVar3, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                fdi fdiVar2 = (fdi) obj3;
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                x xVar = (x) this.t;
                if (!(xVar instanceof v)) {
                    fdiVar2.l(null);
                    return Unit.a;
                }
                fdi fdiVar3 = ((v) xVar).a.A;
                o0 o0Var = new o0(fdiVar2, 5);
                this.s = 1;
                fdiVar3.collect(o0Var, this);
                return lu3Var9;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    fdi fdiVar4 = (fdi) this.t;
                    a aVar = new a((fdi) obj3, objArr5 == true ? 1 : 0, 8);
                    this.s = 1;
                    if (fcp.c0(fdiVar4, aVar, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    gVar = (g) obj3;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b bVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b) gVar.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var = bVar3.a;
                    Context context = gVar.a;
                    com.moloco.sdk.internal.services.events.c cVar = (com.moloco.sdk.internal.services.events.c) gVar.e;
                    t0 t0Var = (t0) gVar.f;
                    int i17 = bVar3.b;
                    int i18 = bVar3.c;
                    com.moloco.sdk.acm.services.d dVar4 = new com.moloco.sdk.acm.services.d(gVar, 17);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f(gVar, z3 ? 1 : 0);
                    boolean z4 = gVar.b;
                    k kVar = (k) gVar.g;
                    this.t = gVar;
                    this.s = 1;
                    k = f1.k(i0Var, context, cVar, t0Var, i17, i18, dVar4, fVar, z4, kVar, this);
                    if (k == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g gVar2 = (g) this.t;
                    y6a.M(obj);
                    gVar = gVar2;
                    k = obj;
                }
                s sVar = (s) k;
                gVar.n = sVar;
                ((fdi) gVar.o).l(sVar != null ? sVar.a : null);
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((aeh) ((g) this.t).l).emit((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e) obj3, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) obj3;
                lu3 lu3Var13 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    c = jVar3.c();
                    if (c != null) {
                        c.setVisibility(4);
                    }
                    this.t = c;
                    this.s = 1;
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        view = (View) this.t;
                        y6a.M(obj);
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        return Unit.a;
                    }
                    c = (View) this.t;
                    y6a.M(obj);
                }
                if (c != null) {
                    c.setVisibility(0);
                }
                this.t = c;
                this.s = 2;
                if (n4o.y(50L, this) != lu3Var13) {
                    view = c;
                    if (view != null) {
                    }
                    if (view != null) {
                    }
                    return Unit.a;
                }
                return lu3Var13;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    r69 r69Var = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f.m;
                    pdk pdkVar2 = new pdk((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) this.t, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) obj3, objArr6 == true ? 1 : 0, 28);
                    this.s = 1;
                    if (xw3.R(r69Var, pdkVar2, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar4 = ((l) obj3).a;
                lu3 lu3Var15 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    View c2 = jVar4.c();
                    if (c2 == null) {
                        return Unit.a;
                    }
                    c2.setVisibility(4);
                    this.t = c2;
                    this.s = 1;
                    if (jVar4.a(this) != lu3Var15) {
                        view2 = c2;
                    }
                    return lu3Var15;
                }
                if (i22 != 1) {
                    if (i22 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    view2 = (View) this.t;
                    y6a.M(obj);
                    view2.setVisibility(4);
                    view2.setVisibility(0);
                    return Unit.a;
                }
                view2 = (View) this.t;
                y6a.M(obj);
                view2.setVisibility(0);
                this.t = view2;
                this.s = 2;
                break;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    qze qzeVar = (qze) this.t;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a((g) obj3, i4);
                    this.s = 1;
                    if (com.facebook.appevents.n.e(qzeVar, aVar2, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.t).f.emit((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a) obj3, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    ddi unrecoverableError2 = ((c) this.t).getUnrecoverableError();
                    d11 d11Var2 = new d11(i3, objArr7 == true ? 1 : 0, 29);
                    this.s = 1;
                    z2 = rd0.z(unrecoverableError2, d11Var2, this);
                    if (z2 == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    z2 = obj;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) z2;
                if (gVar3 != null) {
                    ((Function1) obj3).invoke(gVar3);
                }
                return Unit.a;
            case 18:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) this.t;
                lu3 lu3Var19 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        pvd.x();
                        return null;
                    }
                    y6a.M(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) obj3;
                aVar3.q = true;
                ddi ddiVar = aVar3.g;
                if (ddiVar == null) {
                    aVar3.a();
                    return Unit.a;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e(aVar3, jVar5, 3);
                this.s = 2;
                break;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.t).j.emit((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) obj3, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    pog y = sea.y(new com.moloco.sdk.acm.services.d((e1d) this.t, 18));
                    o0 o0Var2 = new o0((f1d) obj3, 9);
                    this.s = 1;
                    if (y.collect(o0Var2, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    vh9 vh9Var = (vh9) this.t;
                    String str3 = (String) obj3;
                    yj9 yj9Var = new yj9();
                    pm0 pm0Var = ak9.a;
                    str3.getClass();
                    n8k.b(yj9Var.a, str3);
                    com.facebook.appevents.n.i(yj9Var, 5000L);
                    yj9Var.d(ij9.b);
                    wj9 wj9Var = new wj9(yj9Var, vh9Var);
                    this.s = 1;
                    i = wj9Var.i(this);
                    if (i == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    i = obj;
                }
                zk9 d = ((aq4) i).d();
                zk9 zk9Var = zk9.c;
                d.getClass();
                int i30 = d.a;
                zk9Var.getClass();
                if (i30 - zk9Var.a >= 0) {
                    zk9 zk9Var2 = zk9.k;
                    zk9Var2.getClass();
                    if (i30 - zk9Var2.a < 0) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    b1dVar = ((ImaHandler) this.t)._adErrorEvent;
                    String message = ((zjo) ((vf) obj3)).a.getMessage();
                    this.s = 1;
                    if (b1dVar.emit(message, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var24 = lu3.a;
                int i32 = this.s;
                y6a.M(obj);
                if (i32 == 0) {
                    this.s = 1;
                    if (((zzgdh) this.t).e((String) obj3, this) == lu3Var24) {
                        return lu3Var24;
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }
}
