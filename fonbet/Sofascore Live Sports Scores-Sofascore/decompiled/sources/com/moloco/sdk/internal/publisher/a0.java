package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import defpackage.a70;
import defpackage.ad2;
import defpackage.bf3;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.pdk;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.v0l;
import defpackage.w2g;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a0 implements AdLoad {
    public final Function1 a;
    public final String b;
    public final Function1 c;
    public final com.moloco.sdk.internal.ortb.d d;
    public final com.facebook.b e;
    public final AdFormatType f;
    public final com.moloco.sdk.internal.services.j g;
    public final com.moloco.sdk.acm.recorder.c h;
    public final Function0 i;
    public final ad2 j;
    public boolean k;
    public String l;
    public com.moloco.sdk.internal.ortb.model.c0 m;
    public final com.moloco.sdk.acm.h n;
    public g9i o;

    public a0(ad2 ad2Var, Function1 function1, String str, Function1 function12, com.moloco.sdk.internal.ortb.d dVar, com.facebook.b bVar, AdFormatType adFormatType, com.moloco.sdk.internal.services.j jVar, com.moloco.sdk.acm.recorder.c cVar, Function0 function0) {
        str.getClass();
        dVar.getClass();
        adFormatType.getClass();
        jVar.getClass();
        this.a = function1;
        this.b = str;
        this.c = function12;
        this.d = dVar;
        this.e = bVar;
        this.f = adFormatType;
        this.g = jVar;
        this.h = cVar;
        this.i = function0;
        hs4 hs4Var = z45.a;
        this.j = s9a.F(ad2Var, rob.a);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        this.n = cVar.c("load_ad_time");
    }

    public static com.moloco.sdk.internal.ortb.model.y a(com.moloco.sdk.internal.ortb.model.c0 c0Var) {
        List list;
        com.moloco.sdk.internal.ortb.model.j jVar;
        List list2;
        if (c0Var == null || (list = c0Var.a) == null || (jVar = (com.moloco.sdk.internal.ortb.model.j) list.get(0)) == null || (list2 = jVar.a) == null) {
            return null;
        }
        return (com.moloco.sdk.internal.ortb.model.y) list2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, sq3 sq3Var) {
        w wVar;
        int i;
        if (sq3Var instanceof w) {
            wVar = (w) sq3Var;
            int i2 = wVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.u = i2 - Integer.MIN_VALUE;
                Object obj = wVar.s;
                lu3 lu3Var = lu3.a;
                i = wVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    wVar.r = str;
                    wVar.u = 1;
                    obj = xw3.R(z45.a, new pdk(this.e, str, rq3Var, 17), wVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = wVar.r;
                    y6a.M(obj);
                }
                String str2 = (String) obj;
                return str2 == null ? str2 : str;
            }
        }
        wVar = new w(this, sq3Var);
        Object obj2 = wVar.s;
        lu3 lu3Var2 = lu3.a;
        i = wVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        if (str22 == null) {
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String str, AdLoad.Listener listener) {
        Object u2gVar;
        str.getClass();
        com.moloco.sdk.internal.services.j jVar = this.g;
        Context context = jVar.a;
        int i = v0l.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            try {
                String str2 = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
                if (str2 != null) {
                    currentWebViewPackage = context.getPackageManager().getPackageInfo(str2, 0);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            currentWebViewPackage = null;
        }
        if (currentWebViewPackage == null) {
            jVar.a("no_package");
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(new Exception("No current WebView package exists"));
        } else {
            try {
                int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(currentWebViewPackage.packageName);
                if (applicationEnabledSetting == 2) {
                    jVar.a("disabled_by_system");
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(new Exception("WebView component is disabled by system"));
                } else if (applicationEnabledSetting == 3) {
                    jVar.a("disabled_by_user");
                    p2g p2gVar3 = w2g.b;
                    u2gVar = new u2g(new Exception("WebView component is disabled by user"));
                } else if (applicationEnabledSetting != 4) {
                    p2g p2gVar4 = w2g.b;
                    u2gVar = Unit.a;
                } else {
                    jVar.a("disabled_until_used");
                    p2g p2gVar5 = w2g.b;
                    u2gVar = new u2g(new Exception("WebView component is disabled until used"));
                }
            } catch (IllegalArgumentException e) {
                jVar.a("unknown_package");
                p2g p2gVar6 = w2g.b;
                u2gVar = new u2g(e);
            }
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            MolocoLogger.INSTANCE.error("AdLoad", bf3.o(new StringBuilder("WebView Error: "), a), a, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.b, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        com.moloco.sdk.service_locator.i.b().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: ".concat(str), false, 4, null);
        ((AtomicLong) this.n.a.b).set(System.currentTimeMillis());
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("load_ad_attempted");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = this.f.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        dVar.a("ad_type", lowerCase);
        this.h.a(dVar);
        xw3.L(this.j, null, null, new v(this, str, listener, currentTimeMillis, null), 3);
    }
}
