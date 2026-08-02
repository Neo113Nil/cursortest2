package com.facebook.appevents;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import com.facebook.appevents.j;
import com.facebook.c0;
import com.facebook.internal.a0;
import com.facebook.k0;
import com.facebook.w;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.m0;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a99;
import defpackage.aqd;
import defpackage.av8;
import defpackage.bkh;
import defpackage.bzd;
import defpackage.cw3;
import defpackage.d7e;
import defpackage.dh3;
import defpackage.dje;
import defpackage.ds6;
import defpackage.e12;
import defpackage.e1d;
import defpackage.ema;
import defpackage.eqf;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.g12;
import defpackage.g28;
import defpackage.gdi;
import defpackage.hf3;
import defpackage.hsk;
import defpackage.hz8;
import defpackage.if3;
import defpackage.kx4;
import defpackage.l98;
import defpackage.ljg;
import defpackage.lq9;
import defpackage.m5g;
import defpackage.mp3;
import defpackage.mv1;
import defpackage.mz1;
import defpackage.n12;
import defpackage.n9e;
import defpackage.nf3;
import defpackage.ns8;
import defpackage.o19;
import defpackage.o3h;
import defpackage.of3;
import defpackage.os8;
import defpackage.oyn;
import defpackage.q19;
import defpackage.qv0;
import defpackage.r13;
import defpackage.rc3;
import defpackage.rq3;
import defpackage.s6a;
import defpackage.s75;
import defpackage.sea;
import defpackage.tc3;
import defpackage.td4;
import defpackage.tol;
import defpackage.u5g;
import defpackage.uah;
import defpackage.utc;
import defpackage.uxf;
import defpackage.waa;
import defpackage.wnn;
import defpackage.wx1;
import defpackage.wzc;
import defpackage.xtc;
import defpackage.y7k;
import defpackage.yqo;
import defpackage.z88;
import defpackage.zg3;
import defpackage.zzl;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class j {
    public static final float a(int i, int i2) {
        if (Integer.compareUnsigned(i2, 1) <= 0) {
            if (i == 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        return (((float) ((((i >>> 31) << 30) * 2.0d) + (i & Integer.MAX_VALUE))) - 1.0f) / (((float) ((((i2 >>> 31) << 30) * 2.0d) + (Integer.MAX_VALUE & i2))) - 1.0f);
    }

    public static ImageView b(Context context, int i, int i2, int i3, int i4, String str, Integer num, Function0 function0) {
        Drawable drawable;
        int color;
        context.getClass();
        int i5 = (i3 - i4) / 2;
        if (i5 < 0) {
            i5 = 0;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i3, i3));
        if (num != null) {
            int intValue = num.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(intValue);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(-1);
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true) || (color = typedValue.data) == 0) {
                color = context.getColor(com.sofascore.results.R.color.moloco_icon_button_ripple_fallback);
            }
            drawable = new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable, gradientDrawable2);
        } else {
            drawable = context.getDrawable(com.sofascore.results.R.drawable.moloco_icon_button_background);
        }
        imageView.setBackground(drawable);
        imageView.setPadding(i5, i5, i5, i5);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(i);
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        imageView.setEnabled(true);
        imageView.setFocusable(true);
        imageView.setContentDescription(str);
        imageView.setOnClickListener(new com.moloco.sdk.internal.publisher.nativead.ui.e(1, function0));
        return imageView;
    }

    public static final ImageView c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q qVar) {
        context.getClass();
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        float f = context.getResources().getDisplayMetrics().density;
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) (qVar.b * f), (int) (qVar.c * f)));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.a(imageView, qVar.a);
        return imageView;
    }

    public static com.moloco.sdk.internal.publisher.b d(AdShowListener adShowListener, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, Function0 function0, Function0 function02, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.b bVar, Function0 function03, int i) {
        m0 m0Var = (m0) com.moloco.sdk.internal.a.a.getValue();
        com.moloco.sdk.internal.s sVar = (com.moloco.sdk.internal.s) com.moloco.sdk.internal.t.a.getValue();
        com.facebook.internal.t tVar = new com.facebook.internal.t(bVar);
        Function0 function04 = (i & 1024) != 0 ? null : function03;
        rVar.getClass();
        cVar.getClass();
        m0Var.getClass();
        sVar.getClass();
        adFormatType.getClass();
        bVar.getClass();
        return new com.moloco.sdk.internal.publisher.b(adShowListener, rVar, cVar, function0, function02, m0Var, sVar, adFormatType, bVar, tVar, function04);
    }

    public static void e() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        WeakReference weakReference = FullscreenWebviewActivity.j;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Closing ad", null, false, 12, null);
        FullscreenWebviewActivity.j.clear();
        f1d f1dVar = FullscreenWebviewActivity.m;
        if (f1dVar != null) {
            ((fdi) f1dVar).m(null, Boolean.FALSE);
        }
        FullscreenWebviewActivity.m = null;
        FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) FullscreenWebviewActivity.k.get();
        if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
            fullscreenWebviewActivity.finish();
        }
        FullscreenWebviewActivity.k.clear();
        FullscreenWebviewActivity.l.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final d7e d7eVar, final Function0 function0, xtc xtcVar, boolean z, final String str, final long j, long j2, long j3, uah uahVar, long j4, of3 of3Var, final int i, final int i2) {
        xtc xtcVar2;
        int i3;
        boolean z2;
        int i4;
        String str2;
        long j5;
        long j6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j7;
        long j8;
        uah uahVar2;
        utc utcVar;
        long j9;
        Object O;
        av8 av8Var;
        final boolean z3;
        final long j10;
        final long j11;
        final long j12;
        final uah uahVar3;
        d7eVar.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2002285559);
        int i13 = (av8Var2.g(d7eVar) ? 4 : 2) | i | (av8Var2.g(function0) ? 32 : 16);
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 = i13 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i13 | (av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i15 = i2 & 8;
        if (i15 != 0) {
            i4 = i3 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (av8Var2.h(z2) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i4 |= av8Var2.g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i) == 0) {
            j5 = j;
            i4 |= av8Var2.f(j5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            j5 = j;
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i5 = i4 | 1572864;
            j6 = j2;
        } else {
            j6 = j2;
            i5 = i4 | (av8Var2.f(j6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i17 = i5;
        if ((i2 & 128) == 0 && av8Var2.f(j3)) {
            i6 = 8388608;
            int i18 = i17 | i6;
            i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i7 == 0) {
                i8 = i18 | 100663296;
            } else {
                i8 = i18 | (av8Var2.g(uahVar) ? 67108864 : 33554432);
            }
            i9 = i2 & 512;
            if (i9 == 0) {
                i11 = i8 | 805306368;
                i10 = i9;
            } else {
                i10 = i9;
                i11 = i8 | (av8Var2.f(j4) ? 536870912 : 268435456);
            }
            if ((i11 & 306783379) == 306783378 || !av8Var2.D()) {
                av8Var2.Y();
                i12 = i & 1;
                utc utcVar2 = utc.a;
                if (i12 != 0 || av8Var2.B()) {
                    if (i14 != 0) {
                        xtcVar2 = utcVar2;
                    }
                    if (i15 != 0) {
                        z2 = true;
                    }
                    j7 = i16 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b : j6;
                    if ((i2 & 128) == 0) {
                        i11 &= -29360129;
                        j8 = j7;
                    } else {
                        j8 = j3;
                    }
                    uahVar2 = i7 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d : uahVar;
                    if (i10 == 0) {
                        utcVar = utcVar2;
                        j9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.c;
                        av8Var2.t();
                        g28 g28Var = bkh.a;
                        xtc q = n9e.q(wnn.A(bkh.m(xtcVar2, s75.b(j7), s75.a(j7)), uahVar2), j9, oyn.e);
                        dje a = m5g.a(av8Var2);
                        av8Var2.e0(-1646968890);
                        O = av8Var2.O();
                        long j13 = j9;
                        if (O == nf3.a) {
                            O = mz1.e(av8Var2);
                        }
                        av8Var2.s(false);
                        xtc t = oyn.t(q, (wzc) O, a, z2, str2, new u5g(0), function0);
                        mv1 mv1Var = uxf.g;
                        av8Var2.e0(733328855);
                        g12 e = e12.e(mv1Var, av8Var2, 6);
                        av8Var2.e0(-1323940314);
                        kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
                        ema emaVar = (ema) av8Var2.k(dh3.n);
                        hsk hskVar = (hsk) av8Var2.k(dh3.t);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        tc3 F = s6a.F(t);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.q0();
                        } else {
                            av8Var2.l(zg3Var);
                        }
                        av8Var2.y = false;
                        waa.K(av8Var2, e, hf3.g);
                        waa.K(av8Var2, kx4Var, hf3.e);
                        waa.K(av8Var2, emaVar, hf3.h);
                        F.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar, hf3.i, av8Var2), av8Var2, 0);
                        av8Var2.e0(2058660585);
                        av8Var2.e0(-2137368960);
                        lq9.a((i11 & 14) | ((i11 >> 9) & 112) | ((i11 >> 6) & 7168), j5, av8Var2, bkh.m(utcVar, s75.b(j8), s75.a(j8)), d7eVar, str);
                        av8Var = av8Var2;
                        com.appsflyer.internal.i.p(av8Var, false, false, true, false);
                        av8Var.s(false);
                        z3 = z2;
                        j10 = j7;
                        j11 = j13;
                        j12 = j8;
                        uahVar3 = uahVar2;
                    } else {
                        utcVar = utcVar2;
                    }
                } else {
                    av8Var2.W();
                    if ((i2 & 128) != 0) {
                        i11 &= -29360129;
                    }
                    j8 = j3;
                    uahVar2 = uahVar;
                    utcVar = utcVar2;
                    j7 = j6;
                }
                j9 = j4;
                av8Var2.t();
                g28 g28Var2 = bkh.a;
                xtc q2 = n9e.q(wnn.A(bkh.m(xtcVar2, s75.b(j7), s75.a(j7)), uahVar2), j9, oyn.e);
                dje a2 = m5g.a(av8Var2);
                av8Var2.e0(-1646968890);
                O = av8Var2.O();
                long j132 = j9;
                if (O == nf3.a) {
                }
                av8Var2.s(false);
                xtc t2 = oyn.t(q2, (wzc) O, a2, z2, str2, new u5g(0), function0);
                mv1 mv1Var2 = uxf.g;
                av8Var2.e0(733328855);
                g12 e2 = e12.e(mv1Var2, av8Var2, 6);
                av8Var2.e0(-1323940314);
                kx4 kx4Var2 = (kx4) av8Var2.k(dh3.h);
                ema emaVar2 = (ema) av8Var2.k(dh3.n);
                hsk hskVar2 = (hsk) av8Var2.k(dh3.t);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                tc3 F2 = s6a.F(t2);
                av8Var2.h0();
                if (av8Var2.S) {
                }
                av8Var2.y = false;
                waa.K(av8Var2, e2, hf3.g);
                waa.K(av8Var2, kx4Var2, hf3.e);
                waa.K(av8Var2, emaVar2, hf3.h);
                F2.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar2, hf3.i, av8Var2), av8Var2, 0);
                av8Var2.e0(2058660585);
                av8Var2.e0(-2137368960);
                lq9.a((i11 & 14) | ((i11 >> 9) & 112) | ((i11 >> 6) & 7168), j5, av8Var2, bkh.m(utcVar, s75.b(j8), s75.a(j8)), d7eVar, str);
                av8Var = av8Var2;
                com.appsflyer.internal.i.p(av8Var, false, false, true, false);
                av8Var.s(false);
                z3 = z2;
                j10 = j7;
                j11 = j132;
                j12 = j8;
                uahVar3 = uahVar2;
            } else {
                av8Var2.W();
                j12 = j3;
                uahVar3 = uahVar;
                av8Var = av8Var2;
                z3 = z2;
                j10 = j6;
                j11 = j4;
            }
            final xtc xtcVar3 = xtcVar2;
            eqf u = av8Var.u();
            if (u != null) {
                u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int i19 = i | 1;
                        com.facebook.appevents.j.f(d7e.this, function0, xtcVar3, z3, str, j, j10, j12, uahVar3, j11, (of3) obj, i19, i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i6 = 4194304;
        int i182 = i17 | i6;
        i7 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i7 == 0) {
        }
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        if ((i11 & 306783379) == 306783378) {
        }
        av8Var2.Y();
        i12 = i & 1;
        utc utcVar22 = utc.a;
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i7 == 0) {
        }
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    public static final void g(Activity activity, WebView webView, int i, Function1 function1, Function0 function0, ns8 ns8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, Function0 function02, of3 of3Var, int i2) {
        f1d f1dVar;
        ?? r4;
        Object obj;
        av8 av8Var;
        webView.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-204806360);
        int i3 = i2 | (av8Var2.g(activity) ? 4 : 2) | (av8Var2.g(webView) ? 32 : 16) | (av8Var2.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(function1) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.g(function0) ? 16384 : 8192) | (av8Var2.g(ns8Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(tVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((4793491 & i3) == 4793490 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            xtc q = n9e.q(bkh.c, r13.b, oyn.e);
            av8Var2.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var2, 0);
            av8Var2.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            ema emaVar = (ema) av8Var2.k(dh3.n);
            hsk hskVar = (hsk) av8Var2.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(q);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            av8Var2.y = false;
            waa.K(av8Var2, e, hf3.g);
            waa.K(av8Var2, kx4Var, hf3.e);
            waa.K(av8Var2, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar, hf3.i, av8Var2), av8Var2, 0);
            av8Var2.e0(2058660585);
            av8Var2.e0(-2137368960);
            av8Var2.e0(1609987203);
            boolean e2 = av8Var2.e(i);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            Object obj2 = O;
            if (e2 || O == a99Var) {
                fdi a = gdi.a(Boolean.valueOf(i == 0));
                av8Var2.n0(a);
                obj2 = a;
            }
            f1d f1dVar2 = (f1d) obj2;
            av8Var2.s(false);
            av8Var2.e0(1609994792);
            boolean g = av8Var2.g(ns8Var) | av8Var2.g(webView) | av8Var2.e(i) | av8Var2.g(f1dVar2) | av8Var2.g(function1) | av8Var2.g(function0) | av8Var2.g(function02) | av8Var2.g(tVar);
            Object O2 = av8Var2.O();
            if (g || O2 == a99Var) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b(ns8Var, webView, i, f1dVar2, function1, function02, tVar, function0);
                f1dVar = f1dVar2;
                av8Var2.n0(bVar);
                O2 = bVar;
            } else {
                f1dVar = f1dVar2;
            }
            av8Var2.s(false);
            av8 av8Var3 = av8Var2;
            td4.a((Function1) O2, null, null, av8Var3, 0, 6);
            av8Var3.e0(1610008760);
            boolean g2 = av8Var3.g(f1dVar) | av8Var3.g(function0);
            Object O3 = av8Var3.O();
            if (g2 || O3 == a99Var) {
                r4 = 0;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(f1dVar, function0, false ? 1 : 0);
                av8Var3.n0(cVar);
                obj = cVar;
            } else {
                r4 = 0;
                obj = O3;
            }
            av8Var3.s(r4);
            tol.a(r4, 1, av8Var3, (Function0) obj, r4);
            h0.j(activity, av8Var3, i3 & 14);
            av8Var3.s(r4);
            av8Var3.s(r4);
            ljg.t(av8Var3, true, r4, r4);
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc3(activity, webView, i, function1, function0, ns8Var, tVar, function02, i2);
        }
    }

    public static final void h(final Activity activity, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar, final WebView webView, final int i, final Function1 function1, Function0 function0, final ns8 ns8Var, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, final os8 os8Var, final tc3 tc3Var, final Function0 function02, of3 of3Var, final int i2) {
        Function0 function03;
        av8 av8Var;
        webView.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(772404782);
        int i3 = i2 | (av8Var2.g(activity) ? 4 : 2) | (av8Var2.g(sVar) ? 32 : 16) | (av8Var2.g(webView) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(i) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.g(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(ns8Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(tVar) ? 8388608 : 4194304) | (av8Var2.g(os8Var) ? 67108864 : 33554432) | (av8Var2.g(tc3Var) ? 536870912 : 268435456);
        if ((306783379 & i3) == 306783378 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
            function03 = function0;
        } else {
            xtc J = n9e.J(n9e.q(bkh.c, r13.b, oyn.e), "MraidAdContainerScreen");
            av8Var2.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var2, 0);
            av8Var2.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            ema emaVar = (ema) av8Var2.k(dh3.n);
            hsk hskVar = (hsk) av8Var2.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(J);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            av8Var2.y = false;
            waa.K(av8Var2, e, hf3.g);
            waa.K(av8Var2, kx4Var, hf3.e);
            waa.K(av8Var2, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar, hf3.i, av8Var2), av8Var2, 0);
            av8Var2.e0(2058660585);
            av8Var2.e0(-2137368960);
            av8Var2.e0(1204620122);
            boolean e2 = av8Var2.e(i);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            int i4 = 1;
            if (e2 || O == a99Var) {
                O = gdi.a(Boolean.valueOf(i == 0));
                av8Var2.n0(O);
            }
            f1d f1dVar = (f1d) O;
            av8Var2.s(false);
            e1d l = sea.l(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) sVar).e, av8Var2, 0);
            function03 = function0;
            av8Var = av8Var2;
            wnn.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) l.getValue(), null, null, yqo.y(-448887432, av8Var2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g(ns8Var, webView, i, f1dVar, function1, tVar, function03, function02)), av8Var, 3072, 6);
            f1.p(sVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) l.getValue(), tc3Var, os8Var, null, av8Var, (i3 & 112) | 6 | ((i3 >> 18) & 7168) | ((i3 >> 12) & 57344), 16);
            av8Var.e0(1204685583);
            boolean g = av8Var.g(f1dVar) | av8Var.g(function03);
            Object O2 = av8Var.O();
            if (g || O2 == a99Var) {
                O2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(f1dVar, function03, i4);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            tol.a(0, 1, av8Var, (Function0) O2, false);
            h0.j(activity, av8Var, i3 & 14);
            av8Var.s(false);
            av8Var.s(false);
            ljg.t(av8Var, true, false, false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            final Function0 function04 = function03;
            u.d = new Function2(activity, sVar, webView, i, function1, function04, ns8Var, tVar, os8Var, tc3Var, function02, i2) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d
                public final /* synthetic */ Activity a;
                public final /* synthetic */ s b;
                public final /* synthetic */ WebView c;
                public final /* synthetic */ int d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ ns8 g;
                public final /* synthetic */ t h;
                public final /* synthetic */ os8 i;
                public final /* synthetic */ tc3 j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (of3) obj, 24577);
                    return Unit.a;
                }
            };
        }
    }

    public static void i(Context context, fdi fdiVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar, com.moloco.sdk.acm.recorder.c cVar, fdi fdiVar2) {
        fdiVar.getClass();
        bVar.getClass();
        fdiVar2.getClass();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        WeakReference weakReference = FullscreenWebviewActivity.j;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Showing ad", null, false, 12, null);
        FullscreenWebviewActivity.j = new WeakReference(bVar);
        FullscreenWebviewActivity.m = fdiVar;
        FullscreenWebviewActivity.n = fdiVar2;
        FullscreenWebviewActivity.l = new WeakReference(cVar);
        Intent intent = new Intent(context, (Class<?>) FullscreenWebviewActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static final void j(final WebView webView, final int i, final e1d e1dVar, Function1 function1, final Function0 function0, final Function0 function02, xtc xtcVar, final long j, final os8 os8Var, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, float f, final boolean z, final z88 z88Var, of3 of3Var, final int i2) {
        xtc xtcVar2;
        float f2;
        utc utcVar;
        final Function1 function12;
        final xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1361070397);
        int i3 = i2 | (av8Var.g(webView) ? 4 : 2) | (av8Var.e(i) ? 32 : 16) | (av8Var.g(function1) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.g(function0) ? 16384 : 8192) | (av8Var.g(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864 | (av8Var.f(j) ? 8388608 : 4194304) | (av8Var.g(os8Var) ? 67108864 : 33554432) | (av8Var.g(tVar) ? 536870912 : 268435456);
        int i4 = (av8Var.d(f) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(z88Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i3 & 306783379) == 306783378 && (i4 & 147) == 146 && av8Var.D()) {
            av8Var.W();
            function12 = function1;
            xtcVar3 = xtcVar;
            f2 = f;
        } else {
            av8Var.Y();
            int i5 = i2 & 1;
            utc utcVar2 = utc.a;
            if (i5 == 0 || av8Var.B()) {
                xtcVar2 = utcVar2;
            } else {
                av8Var.W();
                xtcVar2 = xtcVar;
            }
            av8Var.t();
            g28 g28Var = bkh.c;
            xtc xtcVar4 = xtcVar2;
            xtc q = n9e.q(xtcVar2.z(g28Var), j, oyn.e);
            av8Var.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var, 0);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            Function0 function03 = hf3.b;
            tc3 F = s6a.F(q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function03);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, e, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            g.e(webView, g28Var, tVar, av8Var, (i3 & 14) | 48 | ((i3 >> 21) & 896));
            av8Var.e0(-1422935541);
            Object obj = nf3.a;
            if (os8Var == null) {
                function12 = function1;
                f2 = f;
                utcVar = utcVar2;
            } else {
                av8Var.e0(1485624565);
                boolean e2 = av8Var.e(i);
                Object O = av8Var.O();
                if (e2 || O == obj) {
                    O = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u(new y7k(i < 0 ? 0 : i));
                    av8Var.n0(O);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) O;
                av8Var.s(false);
                boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                av8Var.e0(1485637484);
                boolean g = av8Var.g(e1dVar) | av8Var.g(function02);
                Object O2 = av8Var.O();
                if (g || O2 == obj) {
                    O2 = new com.moloco.sdk.internal.b(8, e1dVar, function02);
                    av8Var.n0(O2);
                }
                av8Var.s(false);
                int i6 = i4 << 21;
                f2 = f;
                utcVar = utcVar2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.m(uVar, booleanValue, (Function0) O2, function0, function1, os8Var, z, z88Var, av8Var, ((i3 << 3) & 458752) | 390 | ((i3 << 9) & 3670016) | (234881024 & i6) | (i6 & 1879048192));
                function12 = function1;
                Unit unit = Unit.a;
            }
            av8Var.s(false);
            mv1 mv1Var = uxf.i;
            n12 n12Var = n12.a;
            xtc b0 = l98.b0(n12Var.a(utcVar, mv1Var), f2);
            av8Var.e0(-1806921710);
            t0 a = com.moloco.sdk.service_locator.i.a();
            av8Var.e0(-763795258);
            boolean g2 = av8Var.g(a) | av8Var.g("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
            Object O3 = av8Var.O();
            if (g2 || O3 == obj) {
                O3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(a, 1);
                av8Var.n0(O3);
            }
            av8Var.s(false);
            tc3 y = yqo.y(-652534615, av8Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c(b0, (Function1) O3));
            av8Var.s(false);
            y.invoke(n12Var, function12, av8Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
            xtcVar3 = xtcVar4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final float f3 = f2;
            u.d = new Function2(webView, i, e1dVar, function12, function0, function02, xtcVar3, j, os8Var, tVar, f3, z, z88Var, i2) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f
                public final /* synthetic */ WebView a;
                public final /* synthetic */ int b;
                public final /* synthetic */ e1d c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ xtc g;
                public final /* synthetic */ long h;
                public final /* synthetic */ os8 i;
                public final /* synthetic */ t j;
                public final /* synthetic */ float k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ z88 m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    j.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (of3) obj2, 385);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(com.moloco.sdk.internal.ortb.model.h0 h0Var, int i, int i2, Function0 function0, of3 of3Var, int i3) {
        int i4;
        av8 av8Var;
        boolean z;
        h0Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1599911995);
        if ((i3 & 6) == 0) {
            i4 = (av8Var2.g(h0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var2.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var2.g(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i4 & 1171) == 1170 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            float f = h0Var.c;
            long i5 = hz8.i(f, f);
            mv1 a = com.moloco.sdk.internal.r.a(h0Var.e, h0Var.f);
            long j = h0Var.h;
            long j2 = h0Var.g;
            g28 g28Var = bkh.c;
            av8Var2.e0(733328855);
            g12 e = e12.e(a, av8Var2, 0);
            av8Var2.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            int i6 = i4;
            ema emaVar = (ema) av8Var2.k(dh3.n);
            hsk hskVar = (hsk) av8Var2.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(g28Var);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            av8Var2.y = false;
            waa.K(av8Var2, e, hf3.g);
            waa.K(av8Var2, kx4Var, hf3.e);
            waa.K(av8Var2, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var2, hskVar, hf3.i, av8Var2), av8Var2, 0);
            av8Var2.e0(2058660585);
            av8Var2.e0(-2137368960);
            boolean z2 = h0Var.b;
            a99 a99Var = nf3.a;
            utc utcVar = utc.a;
            if (z2) {
                av8Var2.e0(2067666933);
                av8Var2.e0(-210384916);
                boolean g = av8Var2.g("rewarded_countdown_timer");
                Object O = av8Var2.O();
                int i7 = 18;
                if (g || O == a99Var) {
                    O = new com.appsflyer.internal.a(i7);
                    av8Var2.n0(O);
                }
                av8Var2.s(false);
                xtc a2 = o3h.a(utcVar, false, (Function1) O);
                float b = s75.b(i5);
                int i8 = i6 << 18;
                z = false;
                h0.i(j, j2, a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, function0, null, i, i2, av8Var2, (234881024 & i8) | (458752 & (i6 << 6)) | (29360128 & i8));
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                z = false;
                String str = h0Var.a;
                if (str == null || str.length() <= 0) {
                    av8Var.e0(2069220715);
                    av8Var.s(false);
                } else {
                    av8Var.e0(2068452876);
                    String str2 = h0Var.a;
                    av8Var.e0(-210357300);
                    boolean g2 = av8Var.g("rewarded_countdown_timer_custom");
                    Object O2 = av8Var.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new com.appsflyer.internal.a(19);
                        av8Var.n0(O2);
                    }
                    av8Var.s(false);
                    int i9 = i6 << 21;
                    n.h(j, j2, o3h.a(utcVar, false, (Function1) O2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s75.b(i5), function0, str2, null, i, i2, av8Var, (234881024 & i9) | (458752 & (i6 << 6)) | (1879048192 & i9));
                    av8Var.s(false);
                }
            }
            com.appsflyer.internal.i.p(av8Var, z, z, true, z);
            av8Var.s(z);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ds6(h0Var, i, i2, function0, i3);
        }
    }

    public static final void l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q qVar, xtc xtcVar, of3 of3Var, int i, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1666152349);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(qVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i4 != 0) {
                xtcVar = utc.a;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.b(qVar.a, mp3.b, bkh.m(xtcVar, qVar.b, qVar.c), av8Var, 48);
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(qVar, xtcVar2, i, i2, 12);
        }
    }

    public static final void m(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        rVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1900222419);
        if ((((av8Var.g(rVar) ? 4 : 2) | i | (av8Var.g(function0) ? 32 : 16) | (av8Var.g(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072) & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            Unit unit = Unit.a;
            av8Var.e0(1568428746);
            boolean g = av8Var.g(function0);
            Object O = av8Var.O();
            rq3 rq3Var = null;
            if (g || O == nf3.a) {
                O = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u(function0, rq3Var, 1);
                av8Var.n0(O);
            }
            av8Var.s(false);
            hz8.o(av8Var, unit, (Function2) O);
            utc utcVar = utc.a;
            xtc o = bkh.o(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 48.0f, 3);
            if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) {
                av8Var.e0(1376897229);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.k((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) rVar, o, av8Var, 0);
                av8Var.s(false);
            } else if (!(rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q)) {
                av8Var.e0(1568435090);
                av8Var.s(false);
                zzl.b();
                return;
            } else {
                av8Var.e0(1377073185);
                l((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) rVar, oyn.v(o, null, function02, 7), av8Var, 0, 0);
                av8Var.s(false);
            }
            xtcVar2 = utcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v(rVar, function0, function02, xtcVar2, i);
        }
    }

    public static byte[] n(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                Unit unit = Unit.a;
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static Pair o(Bundle bundle, p pVar, boolean z) {
        String str = qv0.c() ? "1" : "0";
        Map map = p.b;
        Pair o = h0.o("is_implicit_purchase_logging_enabled", str, bundle, pVar);
        Object x = h0.x("fb_iap_product_id", bundle, pVar);
        String str2 = x instanceof String ? (String) x : null;
        if (!z) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                Pair o2 = h0.o("fb_content_id", str2, bundle, pVar);
                o = h0.o("android_dynamic_ads_content_id", "client_manual", (Bundle) o2.a, (p) o2.b);
            }
        }
        Pair o3 = h0.o("is_autolog_app_events_enabled", k0.c() ? "1" : "0", (Bundle) o.a, (p) o.b);
        return new Pair((Bundle) o3.a, (p) o3.b);
    }

    public static final String p(String str) {
        if (!t(str)) {
            com.facebook.t.a("Invalid Code Verifier.");
            return null;
        }
        try {
            byte[] bytes = str.getBytes(Charsets.d);
            bytes.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            encodeToString.getClass();
            return encodeToString;
        } catch (Exception e) {
            throw new com.facebook.q(e);
        }
    }

    public static int q() {
        int i;
        synchronized (l.c()) {
            i = !cw3.a.contains(l.class) ? 1 : 0;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r() {
        com.facebook.t tVar;
        if (!cw3.a.contains(l.class)) {
            try {
                tVar = l.g;
            } catch (Throwable th) {
                cw3.a(l.class, th);
            }
            tVar.getClass();
            if (!w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(w.a()).build();
                try {
                    build.startConnection(new c0(4, build, tVar));
                } catch (Exception unused) {
                }
            }
            return w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }
        tVar = null;
        tVar.getClass();
        if (!w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
        }
        return w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    public static void s() {
        synchronized (l.c()) {
            if (l.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!cw3.a.contains(l.class)) {
                try {
                    l.c = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    cw3.a(l.class, th);
                }
            }
            Unit unit = Unit.a;
            com.appsflyer.internal.w wVar = new com.appsflyer.internal.w(5);
            ScheduledThreadPoolExecutor b = l.b();
            if (b != null) {
                b.scheduleAtFixedRate(wVar, 0L, 86400L, TimeUnit.SECONDS);
            } else {
                a70.r("Required value was null.");
            }
        }
    }

    public static final boolean t(String str) {
        if (str.length() != 0 && str.length() >= 43 && str.length() <= 128) {
            return new Regex("^[-._~A-Za-z0-9]+$").f(str);
        }
        return false;
    }

    public static void u(e eVar, b bVar) {
        c0 c0Var = i.a;
        if (!cw3.a.contains(i.class)) {
            try {
                bVar.getClass();
                i.b.execute(new com.facebook.v(2, bVar, eVar));
            } catch (Throwable th) {
                cw3.a(i.class, th);
            }
        }
        boolean z = false;
        int i = 1;
        if (com.facebook.internal.q.b(com.facebook.internal.o.OnDevicePostInstallEventProcessing) && aqd.a()) {
            String str = bVar.a;
            Set set = cw3.a;
            if (!set.contains(aqd.class)) {
                try {
                    aqd aqdVar = aqd.a;
                    if (!set.contains(aqdVar)) {
                        try {
                            boolean z2 = eVar.c && aqd.b.contains(eVar.e);
                            if (!eVar.c || z2) {
                                w.c().execute(new o19(str, eVar, i));
                            }
                        } catch (Throwable th2) {
                            cw3.a(aqdVar, th2);
                        }
                    }
                } catch (Throwable th3) {
                    cw3.a(aqd.class, th3);
                }
            }
        }
        if (com.facebook.internal.q.b(com.facebook.internal.o.GPSARATriggers)) {
            q19.a.d(bVar.a, eVar);
        }
        if (com.facebook.internal.q.b(com.facebook.internal.o.GPSPACAProcessing)) {
            bzd bzdVar = bzd.a;
            String str2 = bVar.a;
            if (!cw3.a.contains(bzdVar)) {
                try {
                    if (!bzd.c) {
                        bzd.a();
                    }
                    if (bzd.b) {
                        String str3 = null;
                        try {
                            JSONObject jSONObject = eVar.a;
                            if (jSONObject != null) {
                                str3 = jSONObject.getString("_eventName");
                            }
                        } catch (JSONException unused) {
                        }
                        bzdVar.b(str2, str3);
                    }
                } catch (Throwable th4) {
                    cw3.a(bzdVar, th4);
                }
            }
        }
        if (eVar.c) {
            return;
        }
        if (!cw3.a.contains(l.class)) {
            try {
                z = l.f;
            } catch (Throwable th5) {
                cw3.a(l.class, th5);
            }
        }
        if (z) {
            return;
        }
        if (!Intrinsics.c(eVar.e, "fb_mobile_activate_app")) {
            com.facebook.b bVar2 = a0.a;
            synchronized (w.b) {
            }
        } else {
            if (cw3.a.contains(l.class)) {
                return;
            }
            try {
                l.f = true;
            } catch (Throwable th6) {
                cw3.a(l.class, th6);
            }
        }
    }

    public static final synchronized void v(c0 c0Var) {
        t tVar;
        synchronized (j.class) {
            if (cw3.a.contains(j.class)) {
                return;
            }
            try {
                c0Var.getClass();
                s r = g.r();
                for (b bVar : c0Var.l()) {
                    synchronized (c0Var) {
                        bVar.getClass();
                        tVar = (t) ((HashMap) c0Var.b).get(bVar);
                    }
                    if (tVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    r.a(bVar, tVar.c());
                }
                g.s(r);
            } catch (Throwable th) {
                cw3.a(j.class, th);
            }
        }
    }

    public static final synchronized void w(b bVar, t tVar) {
        synchronized (j.class) {
            if (cw3.a.contains(j.class)) {
                return;
            }
            try {
                s r = g.r();
                r.a(bVar, tVar.c());
                g.s(r);
            } catch (Throwable th) {
                cw3.a(j.class, th);
            }
        }
    }

    public static void x(AuthenticationToken authenticationToken) {
        com.facebook.b bVar = com.facebook.k.d;
        com.facebook.k kVar = com.facebook.k.e;
        boolean z = true;
        if (kVar == null) {
            synchronized (bVar) {
                kVar = com.facebook.k.e;
                if (kVar == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(w.a());
                    localBroadcastManager.getClass();
                    com.facebook.k kVar2 = new com.facebook.k(localBroadcastManager, new com.facebook.c(1));
                    com.facebook.k.e = kVar2;
                    kVar = kVar2;
                }
            }
        }
        AuthenticationToken authenticationToken2 = (AuthenticationToken) kVar.c;
        kVar.c = authenticationToken;
        com.facebook.c cVar = (com.facebook.c) kVar.b;
        if (authenticationToken != null) {
            try {
                cVar.a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            cVar.a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            com.facebook.internal.k0.c(w.a());
        }
        if (authenticationToken2 != null) {
            z = authenticationToken2.equals(authenticationToken);
        } else if (authenticationToken != null) {
            z = false;
        }
        if (z) {
            return;
        }
        Intent intent = new Intent(w.a(), (Class<?>) AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
        kVar.a.sendBroadcast(intent);
    }
}
