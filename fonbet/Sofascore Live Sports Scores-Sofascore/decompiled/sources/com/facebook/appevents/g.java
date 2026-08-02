package com.facebook.appevents;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Base64;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.internal.k0;
import com.facebook.w;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.b1;
import com.moloco.sdk.internal.ortb.model.h0;
import com.moloco.sdk.internal.ortb.model.k1;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a99;
import defpackage.av8;
import defpackage.bkh;
import defpackage.cw3;
import defpackage.dch;
import defpackage.dh3;
import defpackage.e12;
import defpackage.ema;
import defpackage.eqf;
import defpackage.fch;
import defpackage.fcp;
import defpackage.ff5;
import defpackage.fgi;
import defpackage.g12;
import defpackage.gz8;
import defpackage.hf3;
import defpackage.hkg;
import defpackage.hsk;
import defpackage.hz8;
import defpackage.if3;
import defpackage.kx4;
import defpackage.l98;
import defpackage.ljg;
import defpackage.lq3;
import defpackage.mo3;
import defpackage.mv1;
import defpackage.n4o;
import defpackage.n7g;
import defpackage.nf3;
import defpackage.nhf;
import defpackage.o55;
import defpackage.of3;
import defpackage.opg;
import defpackage.p23;
import defpackage.ph0;
import defpackage.q23;
import defpackage.qz1;
import defpackage.r13;
import defpackage.r72;
import defpackage.rz8;
import defpackage.s6a;
import defpackage.s75;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.td4;
import defpackage.un4;
import defpackage.uxf;
import defpackage.waa;
import defpackage.wnn;
import defpackage.x7k;
import defpackage.xtc;
import defpackage.y7k;
import defpackage.yqo;
import defpackage.zg3;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g {
    public static final int a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.mlcColorPrimary});
        obtainStyledAttributes.getClass();
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        if (hasValue) {
            return color;
        }
        TypedArray obtainStyledAttributes2 = new lq3(context, R.style.Theme_Moloco).obtainStyledAttributes(new int[]{R.attr.mlcColorPrimary});
        obtainStyledAttributes2.getClass();
        boolean hasValue2 = obtainStyledAttributes2.hasValue(0);
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        return hasValue2 ? color2 : context.getColor(R.color.moloco_primary);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, t0 t0Var, Context context, com.moloco.sdk.internal.services.events.c cVar, boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t tVar;
        aVar.getClass();
        t0Var.getClass();
        context.getClass();
        cVar.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = aVar.a;
        v vVar = new v(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e(iVar, z, bool, i, z2, z3, context, cVar, t0Var, kVar, jVar));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b bVar = aVar.b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u uVar = null;
        if (bVar != null) {
            int i4 = i2 < 0 ? 0 : i2;
            x7k x7kVar = y7k.b;
            tVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g(bVar, i4, context, cVar, t0Var, z, kVar));
        } else {
            tVar = null;
        }
        m0 m0Var = aVar.e;
        if (m0Var != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar = iVar.g;
            int i5 = i3 < 0 ? 0 : i3;
            x7k x7kVar2 = y7k.b;
            uVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b(m0Var, hVar, i5, context, cVar, t0Var, kVar));
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m(ph0.x(new x[]{vVar, tVar, uVar}), new com.moloco.sdk.internal.publisher.nativead.n(aVar.c, (List) iVar.f.n, aVar.d));
    }

    public static final void d(xtc xtcVar, String str, long j, Function0 function0, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        str.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1735772917);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.f(j) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            xtc x = gz8.x(bkh.q(bkh.e(xtcVar, 48.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 156.0f, 1), null, null, 3);
            t3e B = l98.B(4.0f, 2);
            tc3 y = yqo.y(1553541117, av8Var2, new nhf(str, j));
            int i3 = ((i2 >> 12) & 14) | 905969664;
            n7g n7gVar = ((dch) av8Var2.k(fch.a)).a;
            float f = r72.d;
            ff5 ff5Var = q23.a;
            qz1 H = fcp.H(r13.c(((p23) av8Var2.k(ff5Var)).a(), 0.12f), f);
            long c = ((p23) av8Var2.k(ff5Var)).c();
            long b = ((p23) av8Var2.k(ff5Var)).b();
            long a = ((p23) av8Var2.k(ff5Var)).a();
            long j2 = ((r13) av8Var2.k(mo3.a)).a;
            if (((p23) av8Var2.k(ff5Var)).d()) {
                hkg.e0(j2);
            } else {
                hkg.e0(j2);
            }
            av8Var = av8Var2;
            rz8.b(function0, x, true, null, n7gVar, H, new un4(c, b, c, r13.c(a, 0.38f)), B, y, av8Var, i3 & 2147483646, 0);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fgi(xtcVar, str, j, function0, i);
        }
    }

    public static final void e(final WebView webView, xtc xtcVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1111633024);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(webView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(tVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.e0(1539491972);
            av8Var.e0(1539459945);
            boolean g = av8Var.g(webView);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            final int i3 = 0;
            if (g || O == a99Var) {
                O = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        WebView webView2 = webView;
                        switch (i4) {
                            case 0:
                                Context context = (Context) obj;
                                context.getClass();
                                FrameLayout frameLayout = new FrameLayout(context);
                                webView2.setBackgroundColor(0);
                                webView2.setVisibility(0);
                                frameLayout.addView(webView2, new ViewGroup.LayoutParams(-1, -1));
                                return frameLayout;
                            default:
                                ((o55) obj).getClass();
                                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h(webView2, 1);
                        }
                    }
                };
                av8Var.n0(O);
            }
            av8Var.s(false);
            td4.a((Function1) O, xtcVar, null, av8Var, i2 & 112, 4);
            Unit unit = Unit.a;
            av8Var.e0(1539492737);
            final int i4 = 1;
            if (tVar != null) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b) tVar).a(yqo.y(1018657295, av8Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c(i4)), av8Var, ((i2 >> 3) & 112) | 6);
            }
            av8Var.s(false);
            av8Var.s(false);
            av8Var.e0(1539499311);
            boolean g2 = av8Var.g(webView);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i42 = i4;
                        WebView webView2 = webView;
                        switch (i42) {
                            case 0:
                                Context context = (Context) obj;
                                context.getClass();
                                FrameLayout frameLayout = new FrameLayout(context);
                                webView2.setBackgroundColor(0);
                                webView2.setVisibility(0);
                                frameLayout.addView(webView2, new ViewGroup.LayoutParams(-1, -1));
                                return frameLayout;
                            default:
                                ((o55) obj).getClass();
                                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h(webView2, 1);
                        }
                    }
                };
                av8Var.n0(O2);
            }
            av8Var.s(false);
            hz8.d(webView, (Function1) O2, av8Var);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(webView, xtcVar, tVar, i, 24);
        }
    }

    public static final void g(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u uVar, final xtc xtcVar, final Function0 function0, final boolean z, final long j, final long j2, final long j3, final h0 h0Var, final Function0 function02, of3 of3Var, final int i) {
        int i2;
        long j4;
        Function0 function03;
        uVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1730954989);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            j4 = j2;
            i2 |= av8Var.f(j4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            j4 = j2;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.f(j3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var.g(h0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function03 = function02;
            i2 |= av8Var.g(function03) ? 67108864 : 33554432;
        } else {
            function03 = function02;
        }
        int i3 = i2;
        if ((i3 & 38347923) == 38347922 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            xtc m = bkh.m(bkh.c, s75.b(j4), s75.a(j2));
            mv1 mv1Var = uxf.e;
            av8Var.e0(733328855);
            g12 e = e12.e(mv1Var, av8Var, 6);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(m);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
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
            av8Var.e0(523924163);
            if ((uVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r) && h0Var != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r) uVar;
                if (rVar.a) {
                    j.k(h0Var, rVar.b, rVar.c, function03, av8Var, ((i3 >> 21) & 14) | ((i3 >> 15) & 7168));
                    av8Var = av8Var;
                }
            }
            av8Var.s(false);
            wnn.c(uVar, xtcVar, null, yqo.y(2052010049, av8Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q(function0, z, j, j2, j3)), av8Var, (i3 & 14) | 3072 | (i3 & 112), 4);
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i4 = i | 1;
                    com.facebook.appevents.g.g(u.this, xtcVar, function0, z, j, j2, j3, h0Var, function02, (of3) obj, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean h(com.moloco.sdk.internal.bidtoken.a aVar, long j) {
        aVar.getClass();
        long millis = TimeUnit.SECONDS.toMillis(aVar.a);
        boolean z = j >= millis - UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder o = ljg.o("[sbt] currentTimeInMillis: ", j, ", expirationTimeMillis: ");
        o.append(millis);
        o.append(", expiredThresholdMillis: 120000, expired: ");
        o.append(z);
        MolocoLogger.debugBuildLog$default(molocoLogger, "ServerBidTokenCache", o.toString(), false, 4, null);
        return z;
    }

    public static final boolean i(y yVar) {
        b1 b1Var;
        yVar.getClass();
        k1 k1Var = yVar.d.c;
        if (k1Var == null || (b1Var = k1Var.b) == null) {
            return false;
        }
        return Intrinsics.c(b1Var.b, Boolean.TRUE);
    }

    public static AccessToken j(Bundle bundle, String str) {
        String string;
        bundle.getClass();
        str.getClass();
        Date m = k0.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date m2 = k0.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new AccessToken(string2, str, string, stringArrayList, null, null, com.facebook.j.FACEBOOK_APPLICATION_SERVICE, m, new Date(), m2, bundle.getString("graph_domain"));
    }

    public static AccessToken k(Collection collection, Bundle bundle, com.facebook.j jVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List split$default;
        List split$default2;
        List split$default3;
        List split$default4;
        bundle.getClass();
        str.getClass();
        Date m = k0.m(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date m2 = k0.m(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                split$default4 = StringsKt__StringsKt.split$default(string2, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                String[] strArr = (String[]) split$default4.toArray(new String[0]);
                collection = kotlin.collections.b.e(Arrays.copyOf(strArr, strArr.length));
            }
            Collection collection2 = collection;
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayList = null;
            } else {
                split$default3 = StringsKt__StringsKt.split$default(string3, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                String[] strArr2 = (String[]) split$default3.toArray(new String[0]);
                arrayList = kotlin.collections.b.e(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayList2 = null;
            } else {
                split$default2 = StringsKt__StringsKt.split$default(string4, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                String[] strArr3 = (String[]) split$default2.toArray(new String[0]);
                arrayList2 = kotlin.collections.b.e(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!k0.A(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    com.facebook.t.a("Authorization response does not contain the signed_request");
                    return null;
                }
                try {
                    split$default = StringsKt__StringsKt.split$default(string6, new String[]{"."}, false, 0, 6, null);
                    String[] strArr4 = (String[]) split$default.toArray(new String[0]);
                    if (strArr4.length == 2) {
                        byte[] decode = Base64.decode(strArr4[1], 0);
                        decode.getClass();
                        String string7 = new JSONObject(new String(decode, Charsets.UTF_8)).getString("user_id");
                        string7.getClass();
                        return new AccessToken(string, str, string7, collection2, arrayList, arrayList2, jVar, m, new Date(), m2, string5);
                    }
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                com.facebook.t.a("Failed to retrieve user_id from signed_request");
                return null;
            }
        }
        return null;
    }

    public static AuthenticationToken l(Bundle bundle, String str) {
        bundle.getClass();
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new AuthenticationToken(string, str);
        } catch (Exception e) {
            throw new com.facebook.q(e.getMessage(), e);
        }
    }

    public static AccessToken m(JSONObject jSONObject) {
        if (jSONObject.getInt("version") > 1) {
            com.facebook.t.a("Unknown AccessToken serialization format.");
            return null;
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string2 = jSONObject.getString("source");
        string2.getClass();
        com.facebook.j valueOf = com.facebook.j.valueOf(string2);
        String string3 = jSONObject.getString("application_id");
        String string4 = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String optString = jSONObject.optString("graph_domain", null);
        string.getClass();
        string3.getClass();
        string4.getClass();
        jSONArray.getClass();
        ArrayList C = k0.C(jSONArray);
        jSONArray2.getClass();
        return new AccessToken(string, string3, string4, C, k0.C(jSONArray2), optJSONArray == null ? new ArrayList() : k0.C(optJSONArray), valueOf, date, date2, date3, optString);
    }

    public static int n(Context context, float f) {
        context.getClass();
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String o(Context context) {
        context.getClass();
        if (l.a() == null) {
            synchronized (l.c()) {
                try {
                    if (l.a() == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        if (!cw3.a.contains(l.class)) {
                            try {
                                l.e = string;
                            } catch (Throwable th) {
                                cw3.a(l.class, th);
                            }
                        }
                        if (l.a() == null) {
                            String str = "XZ" + UUID.randomUUID();
                            if (!cw3.a.contains(l.class)) {
                                try {
                                    l.e = str;
                                } catch (Throwable th2) {
                                    cw3.a(l.class, th2);
                                }
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", l.a()).apply();
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        String a = l.a();
        if (a != null) {
            return a;
        }
        a70.r("Required value was null.");
        return null;
    }

    public static AccessToken p() {
        return com.facebook.i.f.i().c;
    }

    public static boolean q() {
        AccessToken accessToken = com.facebook.i.f.i().c;
        return (accessToken == null || new Date().after(accessToken.a)) ? false : true;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0037: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:56), block:B:48:0x0037 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:58), block:B:46:0x0039 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:60), block:B:42:0x003b */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[Catch: all -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0003, B:14:0x0029, B:16:0x006e, B:38:0x0049, B:39:0x0052, B:49:0x0053, B:44:0x0059, B:47:0x005e, B:43:0x0065, B:7:0x0008, B:12:0x0026, B:28:0x0045, B:29:0x0048), top: B:3:0x0003, inners: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized s r() {
        File fileStreamPath;
        s sVar;
        s sVar2;
        s sVar3;
        s sVar4;
        Throwable th;
        synchronized (g.class) {
            Context a = w.a();
            s sVar5 = null;
            try {
                try {
                    try {
                        try {
                            FileInputStream openFileInput = a.openFileInput("AppEventsLogger.persistedevents");
                            openFileInput.getClass();
                            f fVar = new f(new BufferedInputStream(openFileInput));
                            try {
                                Object readObject = fVar.readObject();
                                readObject.getClass();
                                sVar4 = (s) readObject;
                                try {
                                    Unit unit = Unit.a;
                                    fVar.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        n4o.x(fVar, th);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Exception unused) {
                            sVar4 = sVar5;
                            if (sVar4 == null) {
                            }
                            return sVar4;
                        }
                    } finally {
                        try {
                            a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (FileNotFoundException unused3) {
                    sVar5 = sVar3;
                    fileStreamPath = a.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    sVar4 = sVar5;
                    if (sVar4 == null) {
                    }
                    return sVar4;
                } catch (IOException unused4) {
                    sVar5 = sVar2;
                    fileStreamPath = a.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    sVar4 = sVar5;
                    if (sVar4 == null) {
                    }
                    return sVar4;
                } catch (ClassNotFoundException unused5) {
                    sVar5 = sVar;
                    fileStreamPath = a.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    sVar4 = sVar5;
                    if (sVar4 == null) {
                    }
                    return sVar4;
                }
            } catch (FileNotFoundException unused6) {
                fileStreamPath = a.getFileStreamPath("AppEventsLogger.persistedevents");
                fileStreamPath.delete();
                sVar4 = sVar5;
                if (sVar4 == null) {
                }
                return sVar4;
            } catch (IOException unused7) {
                fileStreamPath = a.getFileStreamPath("AppEventsLogger.persistedevents");
                fileStreamPath.delete();
                sVar4 = sVar5;
                if (sVar4 == null) {
                }
                return sVar4;
            } catch (ClassNotFoundException unused8) {
                fileStreamPath = a.getFileStreamPath("AppEventsLogger.persistedevents");
                fileStreamPath.delete();
                sVar4 = sVar5;
                if (sVar4 == null) {
                }
                return sVar4;
            }
            if (sVar4 == null) {
                sVar4 = new s();
            }
        }
        return sVar4;
    }

    public static final void s(s sVar) {
        Context a = w.a();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(a.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(sVar);
                Unit unit = Unit.a;
                objectOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
            a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
    }
}
