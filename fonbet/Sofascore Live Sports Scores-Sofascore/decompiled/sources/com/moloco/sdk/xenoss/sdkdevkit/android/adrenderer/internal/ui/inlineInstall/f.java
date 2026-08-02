package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import com.appsflyer.sdk_base.referrer.Payload;
import com.facebook.c0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.ct8;
import defpackage.de;
import defpackage.dmi;
import defpackage.k6b;
import defpackage.nl4;
import defpackage.rq3;
import defpackage.xw3;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final nl4 a;
    public final String b;
    public final c0 c;
    public final c d;
    public final b e;
    public final com.moloco.sdk.acm.recorder.b f;
    public final AtomicBoolean g;

    public f(nl4 nl4Var, String str, c0 c0Var, c cVar, b bVar, com.moloco.sdk.acm.recorder.b bVar2) {
        nl4Var.getClass();
        this.a = nl4Var;
        this.b = str;
        this.c = c0Var;
        this.d = cVar;
        this.e = bVar;
        this.f = bVar2;
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(t0 t0Var, String str, Function1 function1) {
        Uri parse;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String queryParameter;
        Regex regex = (Regex) this.c.b;
        int i = 0;
        int i2 = 1;
        rq3 rq3Var = null;
        String str7 = this.b;
        if (str7 == null || !regex.f(str7)) {
            if (str == null) {
                str4 = null;
                if (str != null) {
                    try {
                        Uri parse2 = Uri.parse(str);
                        parse2.getClass();
                        String scheme = parse2.getScheme();
                        if (scheme != null) {
                            str5 = scheme.toLowerCase(Locale.ROOT);
                            str5.getClass();
                        } else {
                            str5 = null;
                        }
                        String host = parse2.getHost();
                        if (host != null) {
                            str6 = host.toLowerCase(Locale.ROOT);
                            str6.getClass();
                        } else {
                            str6 = null;
                        }
                        if (Intrinsics.c(str5, "market")) {
                            queryParameter = parse2.getQueryParameter(Payload.RFR);
                        } else if (str6 != null && StringsKt.J(str6, "play.google.com", false)) {
                            queryParameter = parse2.getQueryParameter(Payload.RFR);
                        }
                    } catch (Exception e) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "BundleExtractor", "Failed to parse URL for referrer", e, false, 8, null);
                    }
                    h hVar = h.a;
                    if (str4 != null || !regex.f(str4)) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", dmi.q("Store URL found but bundle extraction/validation failed: ", str), null, false, 12, null);
                        if (str == null || str.length() == 0) {
                            return;
                        }
                        t0Var.a(str);
                        function1.invoke(hVar);
                        return;
                    }
                    com.moloco.sdk.acm.db.e eVar = new com.moloco.sdk.acm.db.e(function1, 8);
                    nl4 nl4Var = this.a;
                    nl4Var.getClass();
                    k6b k6bVar = (k6b) nl4Var.d;
                    nl4Var.i();
                    ct8 ct8Var = (ct8) nl4Var.f;
                    ComponentActivity componentActivity = (ComponentActivity) nl4Var.b;
                    String packageName = componentActivity.getPackageName();
                    packageName.getClass();
                    Intent intent = (Intent) ct8Var.invoke(str4, queryParameter, packageName);
                    Function2 function2 = (Function2) nl4Var.g;
                    PackageManager packageManager = componentActivity.getPackageManager();
                    packageManager.getClass();
                    if (((Boolean) function2.invoke(packageManager, intent)).booleanValue()) {
                        nl4Var.h = new l(eVar, xw3.L(k6bVar, null, null, new m(nl4Var, rq3Var, i2), 3), xw3.L(k6bVar, null, null, new m(nl4Var, rq3Var, i), 3));
                        ((de) nl4Var.c).a(intent, null);
                        return;
                    } else {
                        if (str != null) {
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "Cannot resolve app install intent", null, false, 12, null);
                            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_fallback", null, false, 12, null);
                            t0Var.a(str);
                            function1.invoke(hVar);
                            return;
                        }
                        return;
                    }
                }
                queryParameter = null;
                h hVar2 = h.a;
                if (str4 != null) {
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", dmi.q("Store URL found but bundle extraction/validation failed: ", str), null, false, 12, null);
                if (str == null) {
                    return;
                } else {
                    return;
                }
            }
            try {
                parse = Uri.parse(str);
                parse.getClass();
                String scheme2 = parse.getScheme();
                if (scheme2 != null) {
                    str2 = scheme2.toLowerCase(Locale.ROOT);
                    str2.getClass();
                } else {
                    str2 = null;
                }
                String host2 = parse.getHost();
                if (host2 != null) {
                    str3 = host2.toLowerCase(Locale.ROOT);
                    str3.getClass();
                } else {
                    str3 = null;
                }
            } catch (Exception e2) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "BundleExtractor", "Failed to parse URL for bundle ID", e2, false, 8, null);
            }
            if (Intrinsics.c(str2, "market")) {
                str7 = parse.getQueryParameter("id");
            } else {
                if (str3 != null && StringsKt.J(str3, "play.google.com", false)) {
                    str7 = parse.getQueryParameter("id");
                }
                str7 = null;
            }
        }
        str4 = str7;
        if (str != null) {
        }
        queryParameter = null;
        h hVar22 = h.a;
        if (str4 != null) {
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", dmi.q("Store URL found but bundle extraction/validation failed: ", str), null, false, 12, null);
        if (str == null) {
        }
    }

    public final void b(String str, t0 t0Var) {
        b bVar = this.e;
        if (bVar == null || !bVar.a) {
            return;
        }
        com.moloco.sdk.acm.recorder.b bVar2 = this.f;
        if (bVar2 != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("store_launch_started");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("step", "auto_inline");
            ((com.moloco.sdk.acm.recorder.c) bVar2).a(dVar);
        }
        String str2 = bVar.d;
        if (str2 != null) {
            str = str2;
        }
        a(t0Var, str, new e(this, 0));
        String str3 = bVar.c;
        if (str3 != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_halfsheet_shown success", null, false, 12, null);
            com.moloco.sdk.service_locator.j.b().a(str3);
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_inline_success fire this event once: ".concat(str3), null, false, 12, null);
            if (bVar2 != null) {
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("store_launch_complete");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar2.a("result", "auto_halfsheet_shown");
                ((com.moloco.sdk.acm.recorder.c) bVar2).a(dVar2);
            }
        }
    }
}
