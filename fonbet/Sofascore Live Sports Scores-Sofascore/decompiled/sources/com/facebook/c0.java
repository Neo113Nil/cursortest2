package com.facebook;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.sdk_base.referrer.Payload;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a70;
import defpackage.ak9;
import defpackage.aq4;
import defpackage.cw3;
import defpackage.dii;
import defpackage.duf;
import defpackage.h5k;
import defpackage.hk9;
import defpackage.hs4;
import defpackage.ij9;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.n8k;
import defpackage.pdk;
import defpackage.pm0;
import defpackage.qp3;
import defpackage.rob;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.swd;
import defpackage.t89;
import defpackage.vh9;
import defpackage.wj9;
import defpackage.wt3;
import defpackage.xh9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yj9;
import defpackage.z45;
import defpackage.zk9;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c0 implements b0, AdViewParentApi, InstallReferrerStateListener, AdShowListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k {
    public final /* synthetic */ int a;
    public Object b;

    public c0(Bundle bundle, String str) {
        Uri a;
        String str2;
        this.a = 3;
        bundle = bundle == null ? new Bundle() : bundle;
        int[] D = wt3.D(2);
        ArrayList arrayList = new ArrayList(D.length);
        for (int i : D) {
            if (i == 1) {
                str2 = "context_choose";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "join_tournament";
            }
            arrayList.add(str2);
        }
        if (arrayList.contains(str)) {
            w wVar = w.a;
            a = com.facebook.internal.k0.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), bundle, "/dialog/".concat(str));
        } else {
            a = com.facebook.internal.k0.a(com.facebook.internal.k0.o(), bundle, w.d() + "/dialog/" + str);
        }
        this.b = a;
    }

    public static String c(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.left);
        sb.append(',');
        sb.append(rect.top);
        sb.append(',');
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }

    public static byte[] f() {
        byte[] byteArray = ((com.moloco.sdk.c) com.moloco.sdk.c.h().build()).toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static String h(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }

    @Override // com.facebook.b0
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((ArrayList) this.b).add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, C.UTF8_NAME)}, 2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: InvalidProtocolBufferException -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #2 {InvalidProtocolBufferException -> 0x0120, blocks: (B:11:0x0029, B:13:0x00e1, B:15:0x0101, B:16:0x0111, B:19:0x010f, B:20:0x0118, B:21:0x011f, B:29:0x00bf, B:32:0x00cf), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(String str, sq3 sq3Var) {
        com.moloco.sdk.internal.services.bidtoken.e eVar;
        int i;
        KType kType;
        aq4 aq4Var;
        KType kType2;
        try {
            try {
                if (sq3Var instanceof com.moloco.sdk.internal.services.bidtoken.e) {
                    eVar = (com.moloco.sdk.internal.services.bidtoken.e) sq3Var;
                    int i2 = eVar.u;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        eVar.u = i2 - Integer.MIN_VALUE;
                        Object obj = eVar.s;
                        lu3 lu3Var = lu3.a;
                        i = eVar.u;
                        if (i != 0) {
                            y6a.M(obj);
                            vh9 vh9Var = (vh9) this.b;
                            yj9 yj9Var = new yj9();
                            yj9Var.d(ij9.c);
                            pm0 pm0Var = ak9.a;
                            str.getClass();
                            n8k.b(yj9Var.a, str);
                            t89 t89Var = yj9Var.c;
                            String str2 = Build.VERSION.RELEASE;
                            f1.l(t89Var, null);
                            Unit unit = Unit.a;
                            xw3.D(yj9Var, qp3.b);
                            byte[] f = f();
                            if (f instanceof swd) {
                                yj9Var.d = f;
                                yj9Var.b(null);
                            } else {
                                yj9Var.d = f;
                                KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(byte[].class);
                                try {
                                    kType = duf.b(byte[].class);
                                } catch (Throwable unused) {
                                    kType = null;
                                }
                                yj9Var.b(new h5k(orCreateKotlinClass, kType));
                            }
                            com.facebook.appevents.n.i(yj9Var, 2800L);
                            yj9Var.d(ij9.c);
                            wj9 wj9Var = new wj9(yj9Var, vh9Var);
                            eVar.r = this;
                            eVar.u = 1;
                            obj = wj9Var.i(eVar);
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj);
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                                com.moloco.sdk.g l = com.moloco.sdk.g.l((byte[]) obj);
                                String h = l.h();
                                h.getClass();
                                String j = l.j();
                                j.getClass();
                                com.moloco.sdk.internal.services.bidtoken.g gVar = com.moloco.sdk.internal.services.bidtoken.f.a;
                                return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.services.bidtoken.m(h, j, l.k() ? new com.moloco.sdk.internal.services.bidtoken.g(l.i().i()) : com.moloco.sdk.internal.services.bidtoken.f.a));
                            }
                            this = eVar.r;
                            y6a.M(obj);
                        }
                        aq4Var = (aq4) obj;
                        if (Intrinsics.c(aq4Var.d(), zk9.c)) {
                            return new com.moloco.sdk.internal.j0(new com.moloco.sdk.internal.y("bidtoken request failed", aq4Var.d().a));
                        }
                        xh9 b = aq4Var.b();
                        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(byte[].class);
                        try {
                            kType2 = duf.b(byte[].class);
                        } catch (Throwable unused2) {
                            kType2 = null;
                        }
                        h5k h5kVar = new h5k(orCreateKotlinClass2, kType2);
                        eVar.r = null;
                        eVar.u = 2;
                        obj = b.a(h5kVar, eVar);
                    }
                }
                if (i != 0) {
                }
                aq4Var = (aq4) obj;
                if (Intrinsics.c(aq4Var.d(), zk9.c)) {
                }
            } catch (InvalidProtocolBufferException e) {
                return new com.moloco.sdk.internal.j0(new com.moloco.sdk.internal.y("Bidtoken parsing failed. Reason: " + e, zk9.k.a));
            }
        } catch (hk9 e2) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            this.getClass();
            MolocoLogger.error$default(molocoLogger, "BidTokenApi", "Request timeout exception", e2, false, 8, null);
            com.moloco.sdk.internal.services.bidtoken.c[] cVarArr = com.moloco.sdk.internal.services.bidtoken.c.a;
            return new com.moloco.sdk.internal.j0(new com.moloco.sdk.internal.y("bidtoken request failed due to timeout", -101));
        } catch (UnknownHostException e3) {
            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
            this.getClass();
            MolocoLogger.error$default(molocoLogger2, "BidTokenApi", "Unknown Host Request exception", e3, false, 8, null);
            com.moloco.sdk.internal.services.bidtoken.c[] cVarArr2 = com.moloco.sdk.internal.services.bidtoken.c.a;
            return new com.moloco.sdk.internal.j0(new com.moloco.sdk.internal.y("bidtoken request failed due to not being able to connect to host", -102));
        } catch (Exception e4) {
            MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
            this.getClass();
            MolocoLogger.error$default(molocoLogger3, "BidTokenApi", "Bid Token API Request exception", e4, false, 8, null);
            com.moloco.sdk.internal.services.bidtoken.c[] cVarArr3 = com.moloco.sdk.internal.services.bidtoken.c.a;
            return new com.moloco.sdk.internal.j0(new com.moloco.sdk.internal.y("bidtoken request failed due to unknown exception", -100));
        }
        eVar = new com.moloco.sdk.internal.services.bidtoken.e(this, sq3Var);
        Object obj2 = eVar.s;
        lu3 lu3Var2 = lu3.a;
        i = eVar.u;
    }

    public String d(String str) {
        str.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e) this.b;
        String a = eVar.a("mraid.js");
        String a2 = eVar.a("mraid-bridge.js");
        byte[] bytes = dii.c(kotlin.text.c.r("\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        ".concat(str), "<script src=\"mraid.js\"></script>", lnb.o("<script>", a, "</script>"), false)).getBytes(Charsets.UTF_8);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 1);
        encodeToString.getClass();
        return dii.c("\n            <script>" + a2 + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + encodeToString + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }

    public void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0 b0Var) {
        b0Var.getClass();
        StringBuilder sb = new StringBuilder("\n                mraidbridge.setScreenSize(");
        sb.append(h((Rect) b0Var.c));
        sb.append(");\n                mraidbridge.setMaxSize(");
        sb.append(h((Rect) b0Var.e));
        sb.append(");\n                mraidbridge.setCurrentPosition(");
        Rect rect = (Rect) b0Var.g;
        sb.append(c(rect));
        sb.append(");\n                mraidbridge.setDefaultPosition(");
        sb.append(c((Rect) b0Var.i));
        sb.append(");\n                mraidbridge.notifySizeChangeEvent(");
        sb.append(h(rect));
        sb.append(");\n            ");
        b(sb.toString());
    }

    public synchronized void g(com.facebook.appevents.s sVar) {
        Set<Map.Entry> set = null;
        if (!cw3.a.contains(sVar)) {
            try {
                Set entrySet = sVar.a.entrySet();
                entrySet.getClass();
                set = entrySet;
            } catch (Throwable th) {
                cw3.a(sVar, th);
            }
        }
        for (Map.Entry entry : set) {
            com.facebook.appevents.t k = k((com.facebook.appevents.b) entry.getKey());
            if (k != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    k.a((com.facebook.appevents.e) it.next());
                }
            }
        }
    }

    public synchronized int j() {
        int i;
        int size;
        i = 0;
        for (com.facebook.appevents.t tVar : ((HashMap) this.b).values()) {
            synchronized (tVar) {
                if (!cw3.a.contains(tVar)) {
                    try {
                        size = tVar.c.size();
                    } catch (Throwable th) {
                        cw3.a(tVar, th);
                    }
                }
                size = 0;
            }
            i += size;
        }
        return i;
    }

    public synchronized com.facebook.appevents.t k(com.facebook.appevents.b bVar) {
        Context a;
        com.facebook.internal.c b;
        com.facebook.appevents.t tVar = (com.facebook.appevents.t) ((HashMap) this.b).get(bVar);
        if (tVar == null && (b = com.facebook.internal.h.b((a = w.a()))) != null) {
            tVar = new com.facebook.appevents.t(b, com.facebook.appevents.g.o(a));
        }
        if (tVar == null) {
            return null;
        }
        ((HashMap) this.b).put(bVar, tVar);
        return tVar;
    }

    public synchronized Set l() {
        Set keySet;
        keySet = ((HashMap) this.b).keySet();
        keySet.getClass();
        return keySet;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        AdShowListener adShowListener = (AdShowListener) this.b;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        AdShowListener adShowListener = (AdShowListener) this.b;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        AdShowListener adShowListener = (AdShowListener) this.b;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        AdShowListener adShowListener = (AdShowListener) this.b;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.b;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    installReferrer.getClass();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        if (!StringsKt.J(installReferrer2, "fb", false)) {
                            if (StringsKt.J(installReferrer2, Payload.SOURCE_FACEBOOK, false)) {
                            }
                        }
                        if (!set.contains(com.facebook.appevents.l.class)) {
                            try {
                                w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer2).apply();
                            } catch (Throwable th) {
                                cw3.a(com.facebook.appevents.l.class, th);
                            }
                        }
                    }
                    w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            installReferrerClient.endConnection();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cw3.a(this, th3);
            }
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    private final void i(String str) {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void a(String str) {
        str.getClass();
        ((t0) this.b).a(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void c(String str) {
    }

    public /* synthetic */ c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public c0(vh9 vh9Var, com.moloco.sdk.internal.services.bidtoken.l lVar, com.moloco.sdk.internal.services.bidtoken.h hVar) {
        this.a = 8;
        this.b = vh9Var;
    }

    public c0(b bVar) {
        this.a = 6;
        this.b = new AtomicLong(0L);
    }

    public c0(t0 t0Var) {
        this.a = 12;
        t0Var.getClass();
        this.b = t0Var;
    }

    public c0(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new Regex("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void b(String str) {
        switch (this.a) {
            case 10:
                hs4 hs4Var = z45.a;
                xw3.L(s9a.c(rob.a), null, null, new pdk(this, str, null, 23), 3);
                break;
        }
    }
}
