package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ad2;
import defpackage.ajj;
import defpackage.av8;
import defpackage.bkh;
import defpackage.ct8;
import defpackage.d7e;
import defpackage.ddi;
import defpackage.dh3;
import defpackage.dmi;
import defpackage.e12;
import defpackage.e1d;
import defpackage.ei;
import defpackage.ema;
import defpackage.eqf;
import defpackage.f70;
import defpackage.fc6;
import defpackage.fcp;
import defpackage.fsf;
import defpackage.ft8;
import defpackage.g12;
import defpackage.g6b;
import defpackage.gt8;
import defpackage.haa;
import defpackage.hf3;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.hsk;
import defpackage.ht8;
import defpackage.hz8;
import defpackage.if3;
import defpackage.kx4;
import defpackage.l98;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.mqi;
import defpackage.mv1;
import defpackage.mz1;
import defpackage.n12;
import defpackage.n7g;
import defpackage.n9e;
import defpackage.nea;
import defpackage.nf3;
import defpackage.of3;
import defpackage.os8;
import defpackage.oyn;
import defpackage.p23;
import defpackage.p75;
import defpackage.pdk;
import defpackage.q23;
import defpackage.rd4;
import defpackage.rfo;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s6a;
import defpackage.s75;
import defpackage.s7l;
import defpackage.s9a;
import defpackage.sea;
import defpackage.sq3;
import defpackage.t3e;
import defpackage.t89;
import defpackage.tc3;
import defpackage.u0a;
import defpackage.uah;
import defpackage.up3;
import defpackage.utc;
import defpackage.uxf;
import defpackage.v98;
import defpackage.vh9;
import defpackage.waa;
import defpackage.wnn;
import defpackage.x7k;
import defpackage.xtc;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y7k;
import defpackage.yqo;
import defpackage.z45;
import defpackage.z88;
import defpackage.zg3;
import defpackage.zzl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class f1 {
    public static final tc3 a(long j, long j2, long j3, mv1 mv1Var, t3e t3eVar, long j4, d7e d7eVar, d7e d7eVar2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(447650301);
        long j5 = (i & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b : j;
        long j6 = (i & 2) != 0 ? j5 : j2;
        n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
        long j7 = (i & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.c : j3;
        mv1 mv1Var2 = (i & 16) != 0 ? uxf.c : mv1Var;
        t3e t3eVar2 = (i & 32) != 0 ? new t3e(4.0f, 4.0f, 4.0f, 4.0f) : t3eVar;
        long b = (i & 64) != 0 ? ((p23) av8Var.k(q23.a)).b() : j4;
        tc3 y = yqo.y(-545982054, av8Var, new b1(mv1Var2, t3eVar2, (i & 128) != 0 ? haa.t(R.drawable.ic_round_volume_off_24, 0, av8Var) : d7eVar, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? haa.t(R.drawable.ic_round_volume_up_24, 0, av8Var) : d7eVar2, b, j5, j6, n7gVar, j7));
        av8Var.s(false);
        return y;
    }

    public static final tc3 b(mv1 mv1Var, t3e t3eVar, long j, long j2, long j3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u uVar, com.moloco.sdk.internal.ortb.model.h0 h0Var, of3 of3Var, int i) {
        t3e t3eVar2;
        av8 av8Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u uVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(1043664790);
        mv1 mv1Var2 = (i & 1) != 0 ? uxf.e : mv1Var;
        if ((i & 2) != 0) {
            n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
            t3eVar2 = new t3e(4.0f, 4.0f, 4.0f, 4.0f);
        } else {
            t3eVar2 = t3eVar;
        }
        long b = (i & 4) != 0 ? ((p23) av8Var2.k(q23.a)).b() : j;
        long j4 = (i & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b : j2;
        long j5 = (i & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a : j3;
        if ((i & 32) != 0) {
            uVar2 = g(null, 0L, 0L, av8Var2, 15);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            uVar2 = uVar;
        }
        tc3 b2 = s.b(mv1Var2, t3eVar2, b, j4, j5, uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.b, (i & 128) != 0 ? null : h0Var, av8Var);
        av8Var.s(false);
        return b2;
    }

    public static final tc3 c(mv1 mv1Var, t3e t3eVar, long j, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(716005120);
        if ((i & 1) != 0) {
            mv1Var = uxf.j;
        }
        if ((i & 2) != 0) {
            t3eVar = new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if ((i & 4) != 0) {
            j = ((p23) av8Var.k(q23.a)).b();
        }
        tc3 y = yqo.y(1967084142, av8Var, new c1(mv1Var, t3eVar, j));
        av8Var.s(false);
        return y;
    }

    public static s7l d(g6b g6bVar, ct8 ct8Var, ct8 ct8Var2, com.moloco.sdk.internal.publisher.nativead.ui.l lVar, Function2 function2, u0 u0Var, f0 f0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, boolean z, com.moloco.sdk.internal.publisher.nativead.b bVar, int i) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar2;
        g6b g6bVar2 = (i & 1) != 0 ? null : g6bVar;
        com.moloco.sdk.internal.publisher.nativead.ui.l lVar2 = (i & 16) != 0 ? null : lVar;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            mqi mqiVar = com.moloco.sdk.service_locator.i.a;
            qVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q();
        } else {
            qVar2 = qVar;
        }
        return new s7l(g6bVar2, ct8Var, ct8Var2, lVar2, function2, u0Var, f0Var, qVar2, (i & 512) != 0 ? true : z, com.moloco.sdk.service_locator.i.a(), (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? new com.moloco.sdk.service_locator.h(23) : bVar);
    }

    public static final Context e(Context context) {
        if (context != null) {
            s.a = context.getApplicationContext();
        }
        Context context2 = s.a;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.i(U3.i.X);
        throw null;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a[dVar.ordinal()]) {
            case 1:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.k;
            case 2:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.l;
            case 3:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.m;
            case 4:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.n;
            case 5:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e;
            case 6:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.k;
            case 7:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.l;
            case 8:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.m;
            case 9:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.n;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return dVar;
            default:
                zzl.b();
                return null;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s g(d7e d7eVar, long j, long j2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(-571269297);
        if ((i & 1) != 0) {
            d7eVar = haa.t(R.drawable.ic_round_skip_next_24, 0, av8Var);
        }
        d7e d7eVar2 = d7eVar;
        if ((i & 2) != 0) {
            j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b;
        }
        long j3 = j;
        n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
        if ((i & 8) != 0) {
            j2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.c;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s(d7eVar2, "Skip", j3, n7gVar, j2);
        av8Var.s(false);
        return sVar;
    }

    public static final v h(Context context, z88 z88Var) {
        return new v(context, z88Var, 8388691, context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(vh9 vh9Var, String str, sq3 sq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f fVar;
        int i;
        if (sq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f) {
            fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f) sq3Var;
            int i2 = fVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.s = i2 - Integer.MIN_VALUE;
                Object obj = fVar.r;
                lu3 lu3Var = lu3.a;
                i = fVar.s;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    hq4 hq4Var = hq4.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(vh9Var, str, rq3Var, 21);
                    fVar.s = 1;
                    obj = xw3.R(hq4Var, aVar, fVar);
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
                boolean z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f(sq3Var);
        Object obj2 = fVar.r;
        lu3 lu3Var2 = lu3.a;
        i = fVar.s;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        boolean z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(vh9 vh9Var, String str, byte[] bArr, up3 up3Var, String str2, sq3 sq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g gVar;
        int i;
        if (sq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g) {
            gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g) sq3Var;
            int i2 = gVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.s = i2 - Integer.MIN_VALUE;
                Object obj = gVar.r;
                lu3 lu3Var = lu3.a;
                i = gVar.s;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    hq4 hq4Var = hq4.c;
                    ajj ajjVar = new ajj(vh9Var, str, str2, bArr, up3Var, null, 17);
                    gVar.s = 1;
                    obj = xw3.R(hq4Var, ajjVar, gVar);
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
                boolean z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g(sq3Var);
        Object obj2 = gVar.r;
        lu3 lu3Var2 = lu3.a;
        i = gVar.s;
        if (i != 0) {
        }
        boolean z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var, Context context, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var, int i, int i2, Function0 function0, Function1 function1, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, sq3 sq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t tVar;
        int i3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q qVar;
        fsf fsfVar;
        Context context2;
        com.moloco.sdk.internal.services.events.c cVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var2;
        Function0 function02;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar2;
        boolean z2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var2;
        Function1 function12;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        String str;
        Integer num;
        Object obj;
        fsf fsfVar5;
        fsf fsfVar6;
        String o;
        Object obj2;
        String str2;
        String str3;
        Integer num2;
        if (sq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t) {
            tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t) sq3Var;
            int i4 = tVar.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tVar.B = i4 - Integer.MIN_VALUE;
                Object obj3 = tVar.A;
                lu3 lu3Var = lu3.a;
                i3 = tVar.B;
                rq3 rq3Var = null;
                if (i3 != 0) {
                    y6a.M(obj3);
                    i0Var.getClass();
                    if (i0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) i0Var).a;
                        if (a0Var.b == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.a) {
                            qVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q(a0Var.a, i, i2);
                            if (qVar == null) {
                                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s(qVar, null);
                            }
                            fsfVar = new fsf();
                            hs4 hs4Var = z45.a;
                            pdk pdkVar = new pdk(fsfVar, i0Var, rq3Var, 29);
                            tVar.r = i0Var;
                            context2 = context;
                            tVar.s = context2;
                            cVar2 = cVar;
                            tVar.t = cVar2;
                            t0Var2 = t0Var;
                            tVar.u = t0Var2;
                            function02 = function0;
                            tVar.v = function02;
                            tVar.w = function1;
                            tVar.x = kVar;
                            tVar.y = fsfVar;
                            tVar.z = z;
                            tVar.B = 1;
                            if (xw3.R(hs4Var, pdkVar, tVar) != lu3Var) {
                                kVar2 = kVar;
                                z2 = z;
                                i0Var2 = i0Var;
                                function12 = function1;
                            }
                            return lu3Var;
                        }
                    }
                    qVar = null;
                    if (qVar == null) {
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fsfVar5 = (fsf) tVar.t;
                        fsfVar6 = (fsf) tVar.s;
                        fsf fsfVar7 = (fsf) tVar.r;
                        y6a.M(obj3);
                        fsfVar2 = fsfVar7;
                        obj = obj3;
                        num = null;
                        if (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0) {
                            fsfVar4 = fsfVar5;
                            obj2 = num;
                        } else {
                            obj2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0) obj;
                            fsfVar4 = fsfVar5;
                        }
                        fsfVar3 = fsfVar6;
                        if (obj2 == null) {
                            LinkedHashMap linkedHashMap = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a;
                            int hashCode = obj2.hashCode();
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a.put(Integer.valueOf(hashCode), obj2);
                            num2 = new Integer(hashCode);
                        } else {
                            num2 = num;
                        }
                        return num2 == null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p(num2.intValue()), new com.moloco.sdk.internal.publisher.nativead.n(num2, fsfVar2, fsfVar3, fsfVar4)) : num;
                    }
                    boolean z3 = tVar.z;
                    fsfVar = tVar.y;
                    kVar2 = tVar.x;
                    Function1 function13 = tVar.w;
                    Function0 function03 = tVar.v;
                    t0Var2 = tVar.u;
                    com.moloco.sdk.internal.services.events.c cVar3 = (com.moloco.sdk.internal.services.events.c) tVar.t;
                    Context context3 = (Context) tVar.s;
                    i0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) tVar.r;
                    y6a.M(obj3);
                    function02 = function03;
                    cVar2 = cVar3;
                    z2 = z3;
                    function12 = function13;
                    context2 = context3;
                }
                fsfVar2 = new fsf();
                fsfVar3 = new fsf();
                fsfVar4 = new fsf();
                str = (String) fsfVar.a;
                if (str == null) {
                    com.moloco.sdk.service_locator.h hVar = new com.moloco.sdk.service_locator.h(24);
                    com.moloco.sdk.service_locator.h hVar2 = new com.moloco.sdk.service_locator.h(25);
                    hs4 hs4Var2 = z45.a;
                    ad2 c = s9a.c(rob.a);
                    context2.getClass();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r(context2, str, hVar, hVar2, function02, function12, t0Var2, new rd4(context2, c, z2), kVar2, 1024);
                    fsfVar2.a = rVar;
                    tVar.r = fsfVar2;
                    tVar.s = fsfVar3;
                    tVar.t = fsfVar4;
                    num = null;
                    tVar.u = null;
                    tVar.v = null;
                    tVar.w = null;
                    tVar.x = null;
                    tVar.y = null;
                    tVar.B = 2;
                    Object f = rVar.f(tVar);
                    if (f != lu3Var) {
                        obj = f;
                        fsfVar5 = fsfVar4;
                        fsfVar6 = fsfVar3;
                        if (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0) {
                        }
                        fsfVar3 = fsfVar6;
                        if (obj2 == null) {
                        }
                        if (num2 == null) {
                        }
                    }
                    return lu3Var;
                }
                Context applicationContext = context2.getApplicationContext();
                applicationContext.getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c(applicationContext, new com.moloco.sdk.internal.services.z(t0Var2, cVar2), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n(), false, 50);
                fsfVar3.a = cVar4;
                hs4 hs4Var3 = z45.a;
                ad2 c2 = s9a.c(rob.a);
                fsfVar4.a = c2;
                fcp.m0(new v98(cVar4.getClickthroughEvent(), new nea(function02, rq3Var, 5), 3), c2);
                xw3.L(c2, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(cVar4, function12, rq3Var, 17), 3);
                i0Var2.getClass();
                if (i0Var2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) i0Var2).a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar = a0Var2.b;
                    String str4 = a0Var2.a;
                    int i5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.w.a[nVar.ordinal()];
                    if (i5 == 1) {
                        str2 = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"";
                        str3 = "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
                    } else {
                        if (i5 != 2) {
                            zzl.b();
                            return null;
                        }
                        str2 = "<script src=\"";
                        str3 = "\"></script>";
                    }
                    o = lnb.o(str2, str4, str3);
                } else if (i0Var2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f0) {
                    o = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f0) i0Var2).a.a;
                } else {
                    if (!(i0Var2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g0)) {
                        zzl.b();
                        return null;
                    }
                    o = mz1.o(new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\""), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g0) i0Var2).a.a, "\"></iframe>");
                }
                try {
                    cVar4.getHtmlCssFixer().getClass();
                } catch (Exception e) {
                    e = e;
                }
                try {
                    cVar4.loadDataWithBaseURL("https://appassets.androidplatform.net", "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        ".concat(o), "text/html", C4427z5.O, null);
                } catch (Exception e2) {
                    e = e2;
                    cVar4 = cVar4;
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "BaseWebView", e.toString(), e, false, 8, null);
                    obj2 = cVar4;
                    num = null;
                    if (obj2 == null) {
                    }
                    if (num2 == null) {
                    }
                }
                obj2 = cVar4;
                num = null;
                if (obj2 == null) {
                }
                if (num2 == null) {
                }
            }
        }
        tVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(sq3Var);
        Object obj32 = tVar.A;
        lu3 lu3Var2 = lu3.a;
        i3 = tVar.B;
        rq3 rq3Var2 = null;
        if (i3 != 0) {
        }
        fsfVar2 = new fsf();
        fsfVar3 = new fsf();
        fsfVar4 = new fsf();
        str = (String) fsfVar.a;
        if (str == null) {
        }
    }

    public static final void l(t89 t89Var, MediationInfo mediationInfo) {
        String str = Build.VERSION.RELEASE;
        StringBuilder q = fc6.q("MolocoSDK/4.10.1;");
        if (mediationInfo != null) {
            q.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str != null) {
            q.append("Android/" + str + ';');
        }
        t89Var.i("X-Moloco-User-Agent", q.toString());
    }

    public static final void m(ddi ddiVar, Function0 function0, Function1 function1, os8 os8Var, boolean z, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(706979519);
        Object obj = n12.a;
        int i2 = i | (av8Var.g(obj) ? 4 : 2) | (av8Var.g(ddiVar) ? 32 : 16) | (av8Var.g(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(function1) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.g(os8Var) ? 16384 : 8192) | (av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if ((74899 & i2) == 74898 && av8Var.D()) {
            av8Var.W();
        } else {
            e1d x = rfo.x(ddiVar, av8Var, (i2 >> 3) & 14);
            av8Var.e0(-2101080690);
            Object O = av8Var.O();
            int i3 = 0;
            Object obj2 = nf3.a;
            Object obj3 = O;
            if (O == obj2) {
                Object f = androidx.compose.runtime.e.f(0);
                av8Var.n0(f);
                obj3 = f;
            }
            e1d e1dVar = (e1d) obj3;
            av8Var.s(false);
            Unit unit = Unit.a;
            av8Var.e0(-2101078598);
            boolean g = av8Var.g(x) | av8Var.g(e1dVar);
            Object O2 = av8Var.O();
            Object obj4 = O2;
            if (g || O2 == obj2) {
                Object mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m(x, e1dVar, false ? 1 : 0, i3);
                av8Var.n0(mVar);
                obj4 = mVar;
            }
            av8Var.s(false);
            hz8.o(av8Var, unit, (Function2) obj4);
            int intValue = ((Number) e1dVar.getValue()).intValue();
            x7k x7kVar = y7k.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) x.getValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVar = fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) fVar : null;
            int i4 = dVar != null ? dVar.a : 0;
            Object valueOf = Boolean.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) x.getValue()) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c);
            Object valueOf2 = Boolean.valueOf(!(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) x.getValue()) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e));
            Object valueOf3 = Boolean.valueOf(z);
            Object y7kVar = new y7k(intValue);
            Object y7kVar2 = new y7k(i4);
            av8Var.e0(-2101047518);
            Object O3 = av8Var.O();
            Object obj5 = O3;
            if (O3 == obj2) {
                Object hVar = new com.moloco.sdk.service_locator.h(16);
                av8Var.n0(hVar);
                obj5 = hVar;
            }
            av8Var.s(false);
            int i5 = i2 << 3;
            os8Var.invoke(obj, valueOf, valueOf2, function0, function1, valueOf3, y7kVar, y7kVar2, (Function0) obj5, av8Var, Integer.valueOf((i5 & 7168) | (i2 & 14) | 100663296 | (57344 & i5) | (i2 & 458752) | ((i2 << 15) & 1879048192)));
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(ddiVar, function0, function1, os8Var, z, i);
        }
    }

    public static final void n(View view, boolean z, long j, TimeInterpolator timeInterpolator, com.moloco.sdk.internal.b bVar) {
        timeInterpolator.getClass();
        view.animate().cancel();
        if (!z) {
            view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).setInterpolator(timeInterpolator).withEndAction(new com.facebook.v(8, view, bVar)).start();
        } else {
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).withEndAction(new com.appsflyer.b(bVar, 12)).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0377, code lost:
    
        if (r5 == r4) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar, xtc xtcVar, final long j, final ht8 ht8Var, final os8 os8Var, final os8 os8Var2, os8 os8Var3, final ht8 ht8Var2, final f0 f0Var, final ft8 ft8Var, gt8 gt8Var, final ht8 ht8Var3, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, boolean z, of3 of3Var, final int i, final int i2) {
        xtc xtcVar2;
        int i3;
        os8 os8Var4;
        gt8 gt8Var2;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        gt8 gt8Var3;
        os8 os8Var5;
        xtc xtcVar3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        n12 n12Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar2;
        av8 av8Var;
        av8 av8Var2;
        final os8 os8Var6;
        final boolean z3;
        final xtc xtcVar4;
        final gt8 gt8Var4;
        Object obj5;
        n12 n12Var2;
        av8 av8Var3;
        sVar.getClass();
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(1488753766);
        int i10 = (av8Var4.g(sVar) ? 4 : 2) | i;
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 = i10 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i10 | (av8Var4.g(xtcVar2) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= av8Var4.f(j) ? 256 : 128;
        }
        int i12 = i3 | (av8Var4.g(ht8Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i12 |= av8Var4.g(os8Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            os8Var4 = os8Var2;
            i12 |= av8Var4.g(os8Var4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            os8Var4 = os8Var2;
        }
        os8 os8Var7 = os8Var3;
        int i13 = i12 | (((i2 & 64) == 0 && av8Var4.g(os8Var7)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((i & 12582912) == 0) {
            i13 |= av8Var4.g(ht8Var2) ? 8388608 : 4194304;
        }
        int i14 = i13 | (av8Var4.g(f0Var) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i14 |= av8Var4.g(ft8Var) ? 536870912 : 268435456;
        }
        if ((i2 & 1024) == 0) {
            gt8Var2 = gt8Var;
            if (av8Var4.g(gt8Var2)) {
                c = 4;
                i4 = i14;
                int i15 = c | (!av8Var4.g(ht8Var3) ? ' ' : (char) 16) | (av8Var4.g(qVar) ? (char) 256 : (char) 128);
                i5 = i2 & 8192;
                if (i5 == 0) {
                    i6 = i15 | 3072;
                } else {
                    i6 = i15 | (av8Var4.h(z) ? (char) 2048 : (char) 1024);
                }
                if ((i4 & 306783379) != 306783378 && (i6 & 1171) == 1170 && av8Var4.D()) {
                    av8Var4.W();
                    os8Var6 = os8Var7;
                    gt8Var4 = gt8Var2;
                    xtcVar4 = xtcVar2;
                    av8Var2 = av8Var4;
                    z3 = z;
                } else {
                    av8Var4.Y();
                    i7 = i & 1;
                    utc utcVar = utc.a;
                    if (i7 != 0 || av8Var4.B()) {
                        if (i11 != 0) {
                            xtcVar2 = utcVar;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = i4 & (-3670017);
                            os8Var7 = os8Var4;
                        } else {
                            i8 = i4;
                        }
                        gt8 d = (i2 & 1024) == 0 ? s.d(null, null, av8Var4, 3) : gt8Var2;
                        if (i5 == 0) {
                            i9 = i8;
                            gt8Var3 = d;
                            os8Var5 = os8Var7;
                            xtcVar3 = xtcVar2;
                            z2 = true;
                            av8Var4.t();
                            xtc q = n9e.q(xtcVar3.z(bkh.c), j, oyn.e);
                            av8Var4.e0(733328855);
                            g12 e = e12.e(uxf.c, av8Var4, 0);
                            av8Var4.e0(-1323940314);
                            kx4 kx4Var = (kx4) av8Var4.k(dh3.h);
                            ema emaVar = (ema) av8Var4.k(dh3.n);
                            hsk hskVar = (hsk) av8Var4.k(dh3.t);
                            if3.k7.getClass();
                            xtc xtcVar5 = xtcVar3;
                            zg3 zg3Var = hf3.b;
                            tc3 F = s6a.F(q);
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.q0();
                            } else {
                                av8Var4.l(zg3Var);
                            }
                            av8Var4.y = false;
                            waa.K(av8Var4, e, hf3.g);
                            waa.K(av8Var4, kx4Var, hf3.e);
                            waa.K(av8Var4, emaVar, hf3.h);
                            F.invoke(com.appsflyer.internal.i.f(av8Var4, hskVar, hf3.i, av8Var4), av8Var4, 0);
                            av8Var4.e0(2058660585);
                            av8Var4.e0(-2137368960);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) sVar;
                            e1d l = sea.l(mVar.e, av8Var4, 0);
                            gt8 gt8Var5 = gt8Var3;
                            wnn.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) l.getValue(), null, null, yqo.y(1218472412, av8Var4, new w0(f0Var, ht8Var, ft8Var, gt8Var3, ht8Var3, qVar, sVar)), av8Var4, 3072, 6);
                            os8 os8Var8 = os8Var5;
                            p(sVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) l.getValue(), os8Var4, os8Var, os8Var8, av8Var4, ((i9 << 3) & 112) | 6 | ((i9 >> 6) & 7168) | (i9 & 57344) | ((i9 >> 3) & 458752), 0);
                            av8Var4.e0(-1443689911);
                            Object obj6 = nf3.a;
                            n12 n12Var3 = n12.a;
                            if (ht8Var2 != null) {
                                obj4 = obj6;
                                av8Var = av8Var4;
                                n12Var = n12Var3;
                                sVar2 = sVar;
                            } else {
                                Object obj7 = (Boolean) sea.l(mVar.f, av8Var4, 0).getValue();
                                obj7.getClass();
                                Object obj8 = mVar.e;
                                av8Var4.e0(1864349683);
                                boolean g = av8Var4.g(sVar);
                                Object O = av8Var4.O();
                                if (g || O == obj6) {
                                    obj = obj8;
                                    obj2 = obj6;
                                    Object l0Var = new com.moloco.sdk.internal.publisher.l0(1, sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 10);
                                    av8Var4.n0(l0Var);
                                    O = l0Var;
                                } else {
                                    obj2 = obj6;
                                    obj = obj8;
                                }
                                Object obj9 = (KFunction) O;
                                av8Var4.s(false);
                                av8Var4.e0(1864351176);
                                boolean g2 = av8Var4.g(sVar);
                                Object O2 = av8Var4.O();
                                if (g2) {
                                    obj3 = obj2;
                                } else {
                                    Object obj10 = obj2;
                                    if (O2 == obj10) {
                                        obj3 = obj10;
                                    } else {
                                        obj4 = obj10;
                                        Object obj11 = (KFunction) O2;
                                        av8Var4.s(false);
                                        n12Var = n12Var3;
                                        sVar2 = sVar;
                                        ht8Var2.invoke(n12Var, obj7, obj, obj9, obj11, av8Var4, 6);
                                        av8Var = av8Var4;
                                        Unit unit = Unit.a;
                                    }
                                }
                                obj4 = obj3;
                                Object bVar = new com.moloco.sdk.internal.publisher.nativead.b(0, sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "onCTA", "onCTA()V", 0, 20);
                                av8Var4.n0(bVar);
                                O2 = bVar;
                                Object obj112 = (KFunction) O2;
                                av8Var4.s(false);
                                n12Var = n12Var3;
                                sVar2 = sVar;
                                ht8Var2.invoke(n12Var, obj7, obj, obj9, obj112, av8Var4, 6);
                                av8Var = av8Var4;
                                Unit unit2 = Unit.a;
                            }
                            av8Var.s(false);
                            av8Var.e0(-1443680835);
                            if (z2) {
                                av8Var2 = av8Var;
                            } else {
                                xtc b0 = l98.b0(n12Var.a(utcVar, uxf.i), 12.0f);
                                av8Var.e0(-1665380566);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 a = com.moloco.sdk.service_locator.i.a();
                                av8Var.e0(-819746537);
                                boolean g3 = av8Var.g(a) | av8Var.g("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                                Object O3 = av8Var.O();
                                if (g3) {
                                    obj5 = obj4;
                                } else {
                                    obj5 = obj4;
                                }
                                O3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(a, 0);
                                av8Var.n0(O3);
                                av8Var.s(false);
                                tc3 y = yqo.y(781429248, av8Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(b0, (Function1) O3));
                                av8Var.s(false);
                                av8Var.e0(-1443674828);
                                boolean g4 = av8Var.g(sVar2);
                                Object O4 = av8Var.O();
                                if (g4 || O4 == obj5) {
                                    n12Var2 = n12Var;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar3 = sVar2;
                                    av8Var3 = av8Var;
                                    Object l0Var2 = new com.moloco.sdk.internal.publisher.l0(1, sVar3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 11);
                                    av8Var3.n0(l0Var2);
                                    O4 = l0Var2;
                                } else {
                                    av8Var3 = av8Var;
                                    n12Var2 = n12Var;
                                }
                                av8Var3.s(false);
                                av8Var2 = av8Var3;
                                y.invoke(n12Var2, (KFunction) O4, mVar.e, av8Var2, 6);
                            }
                            com.appsflyer.internal.i.p(av8Var2, false, false, false, true);
                            av8Var2.s(false);
                            av8Var2.s(false);
                            os8Var6 = os8Var8;
                            z3 = z2;
                            xtcVar4 = xtcVar5;
                            gt8Var4 = gt8Var5;
                        } else {
                            z2 = z;
                            i9 = i8;
                            gt8Var3 = d;
                            os8Var5 = os8Var7;
                        }
                    } else {
                        av8Var4.W();
                        z2 = z;
                        i9 = (i2 & 64) != 0 ? i4 & (-3670017) : i4;
                        os8Var5 = os8Var7;
                        gt8Var3 = gt8Var2;
                    }
                    xtcVar3 = xtcVar2;
                    av8Var4.t();
                    xtc q2 = n9e.q(xtcVar3.z(bkh.c), j, oyn.e);
                    av8Var4.e0(733328855);
                    g12 e2 = e12.e(uxf.c, av8Var4, 0);
                    av8Var4.e0(-1323940314);
                    kx4 kx4Var2 = (kx4) av8Var4.k(dh3.h);
                    ema emaVar2 = (ema) av8Var4.k(dh3.n);
                    hsk hskVar2 = (hsk) av8Var4.k(dh3.t);
                    if3.k7.getClass();
                    xtc xtcVar52 = xtcVar3;
                    zg3 zg3Var2 = hf3.b;
                    tc3 F2 = s6a.F(q2);
                    av8Var4.h0();
                    if (av8Var4.S) {
                    }
                    av8Var4.y = false;
                    waa.K(av8Var4, e2, hf3.g);
                    waa.K(av8Var4, kx4Var2, hf3.e);
                    waa.K(av8Var4, emaVar2, hf3.h);
                    F2.invoke(com.appsflyer.internal.i.f(av8Var4, hskVar2, hf3.i, av8Var4), av8Var4, 0);
                    av8Var4.e0(2058660585);
                    av8Var4.e0(-2137368960);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) sVar;
                    e1d l2 = sea.l(mVar2.e, av8Var4, 0);
                    gt8 gt8Var52 = gt8Var3;
                    wnn.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) l2.getValue(), null, null, yqo.y(1218472412, av8Var4, new w0(f0Var, ht8Var, ft8Var, gt8Var3, ht8Var3, qVar, sVar)), av8Var4, 3072, 6);
                    os8 os8Var82 = os8Var5;
                    p(sVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) l2.getValue(), os8Var4, os8Var, os8Var82, av8Var4, ((i9 << 3) & 112) | 6 | ((i9 >> 6) & 7168) | (i9 & 57344) | ((i9 >> 3) & 458752), 0);
                    av8Var4.e0(-1443689911);
                    Object obj62 = nf3.a;
                    n12 n12Var32 = n12.a;
                    if (ht8Var2 != null) {
                    }
                    av8Var.s(false);
                    av8Var.e0(-1443680835);
                    if (z2) {
                    }
                    com.appsflyer.internal.i.p(av8Var2, false, false, false, true);
                    av8Var2.s(false);
                    av8Var2.s(false);
                    os8Var6 = os8Var82;
                    z3 = z2;
                    xtcVar4 = xtcVar52;
                    gt8Var4 = gt8Var52;
                }
                eqf u = av8Var2.u();
                if (u != null) {
                    u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            int i16 = i | 1;
                            f1.o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.this, xtcVar4, j, ht8Var, os8Var, os8Var2, os8Var6, ht8Var2, f0Var, ft8Var, gt8Var4, ht8Var3, qVar, z3, (of3) obj12, i16, i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            gt8Var2 = gt8Var;
        }
        c = 2;
        i4 = i14;
        int i152 = c | (!av8Var4.g(ht8Var3) ? ' ' : (char) 16) | (av8Var4.g(qVar) ? (char) 256 : (char) 128);
        i5 = i2 & 8192;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        av8Var4.Y();
        i7 = i & 1;
        utc utcVar2 = utc.a;
        if (i7 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 1024) == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r rVar, os8 os8Var, os8 os8Var2, os8 os8Var3, of3 of3Var, int i, int i2) {
        int i3;
        os8 os8Var4;
        os8 os8Var5;
        Boolean valueOf;
        os8 os8Var6;
        sVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-449567267);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(n12.a) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(rVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.g(os8Var) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var.g(os8Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ((i2 & 16) == 0 && av8Var.g(os8Var3)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i3 & 74899) == 74898 && av8Var.D()) {
            av8Var.W();
            os8Var6 = os8Var3;
        } else {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
                int i4 = i2 & 16;
            } else if ((i2 & 16) != 0) {
                os8Var4 = os8Var;
                av8Var.t();
                os8Var5 = null;
                valueOf = rVar == null ? Boolean.valueOf(rVar.a()) : null;
                if (!Intrinsics.c(valueOf, Boolean.TRUE)) {
                    os8Var5 = os8Var2;
                } else if (Intrinsics.c(valueOf, Boolean.FALSE)) {
                    if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) {
                        os8Var5 = os8Var;
                    } else {
                        if (!(rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) && !(rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) && !(rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) && rVar != null) {
                            zzl.b();
                            return;
                        }
                        os8Var5 = os8Var4;
                    }
                } else if (valueOf != null) {
                    zzl.b();
                    return;
                }
                boolean z = rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
                boolean z2 = (z || (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) || !(rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p)) ? false : true;
                if (os8Var5 != null) {
                    tc3 y = yqo.y(-880292845, av8Var, new com.moloco.sdk.internal.n(sVar, os8Var5, z2));
                    if (z) {
                        av8Var.e0(-1024203648);
                        y.invoke(av8Var, 6);
                        av8Var.s(false);
                    } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) {
                        av8Var.e0(-1024201856);
                        y.invoke(av8Var, 6);
                        av8Var.s(false);
                    } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) {
                        av8Var.e0(-1024199968);
                        y.invoke(av8Var, 6);
                        av8Var.s(false);
                    } else {
                        av8Var.e0(-1685393183);
                        av8Var.s(false);
                    }
                }
                os8Var6 = os8Var4;
            }
            os8Var4 = os8Var3;
            av8Var.t();
            os8Var5 = null;
            if (rVar == null) {
            }
            if (!Intrinsics.c(valueOf, Boolean.TRUE)) {
            }
            boolean z3 = rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
            if (z3) {
                if (os8Var5 != null) {
                }
                os8Var6 = os8Var4;
            }
            if (os8Var5 != null) {
            }
            os8Var6 = os8Var4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ei(sVar, rVar, os8Var, os8Var2, os8Var6, i, i2, 7);
        }
    }

    public static final void q(final String str, final d7e d7eVar, final String str2, final long j, final uah uahVar, final long j2, final long j3, final long j4, final boolean z, final boolean z2, final long j5, final Function0 function0, of3 of3Var, final int i) {
        uahVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2051575724);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(d7eVar) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.g(uahVar) ? 16384 : 8192) | (av8Var.f(j2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.f(j4) ? 8388608 : 4194304) | (av8Var.h(z) ? 67108864 : 33554432) | (av8Var.h(z2) ? 536870912 : 268435456);
        int i3 = (av8Var.f(j5) ? (char) 4 : (char) 2) | (av8Var.g(function0) ? ' ' : (char) 16);
        if ((i2 & 306783379) == 306783378 && (i3 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            p75 p75Var = new p75(s75.a(j3));
            p75 p75Var2 = new p75(s75.a(j));
            if (p75Var.compareTo(p75Var2) < 0) {
                p75Var = p75Var2;
            }
            int i4 = i2 >> 9;
            u0a.m(null, uahVar, j2, 0L, yqo.y(-1541935208, av8Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0(p75Var.a, str2, function0, z, z2, str, j4, j5, j, d7eVar)), av8Var, (i4 & 112) | 1572864 | (i4 & 896));
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, d7eVar, str2, j, uahVar, j2, j3, j4, z, z2, j5, function0, i) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0
                public final /* synthetic */ String a;
                public final /* synthetic */ d7e b;
                public final /* synthetic */ String c;
                public final /* synthetic */ long d;
                public final /* synthetic */ uah e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ long k;
                public final /* synthetic */ Function0 l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f1.q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (of3) obj, 1572865);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean r(String str) {
        str.getClass();
        boolean matches = Patterns.WEB_URL.matcher(str).matches();
        if (!matches) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpRequestClient", dmi.q("URL is invalid. ", str), null, false, 12, null);
        }
        return matches;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a[dVar.ordinal()]) {
            case 1:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f;
            case 2:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.g;
            case 3:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.h;
            case 4:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.i;
            case 5:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return dVar;
            case 11:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f;
            case 12:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.g;
            case 13:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.h;
            case 14:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.i;
            default:
                zzl.b();
                return null;
        }
    }

    public static Bundle t(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public static void u(String str) {
        boolean contains;
        str.getClass();
        if (str.length() == 0 || str.length() > 40) {
            throw new com.facebook.q(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
        }
        HashSet hashSet = com.facebook.appevents.e.f;
        synchronized (hashSet) {
            contains = hashSet.contains(str);
            Unit unit = Unit.a;
        }
        if (contains) {
            return;
        }
        if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").f(str)) {
            throw new com.facebook.q(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
        }
        synchronized (hashSet) {
            hashSet.add(str);
        }
    }
}
