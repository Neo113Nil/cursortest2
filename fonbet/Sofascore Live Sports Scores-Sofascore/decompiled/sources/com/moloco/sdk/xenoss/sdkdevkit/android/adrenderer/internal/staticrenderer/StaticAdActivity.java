package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.tc3;
import defpackage.zb3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class StaticAdActivity extends ComponentActivity {
    public static e c;
    public static c d;
    public static StaticAdActivity e;
    public static Function0 f;
    public static Function0 g;
    public static t i;
    public static com.moloco.sdk.acm.recorder.b j;
    public static Function1 k;
    public static final b b = new b();
    public static final fdi h = gdi.a(Boolean.FALSE);

    public final void k(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticAdActivity", "Compose dependency not available, cannot show fullscreen static ad", th, false, 8, null);
        com.moloco.sdk.acm.recorder.b bVar = j;
        if (bVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            ((com.moloco.sdk.acm.recorder.c) bVar).a(new com.moloco.sdk.acm.d("fullscreen_ad_compose_not_available"));
        }
        Function1 function1 = k;
        if (function1 != null) {
            function1.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.b);
        }
        b.b();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f1.e(getApplicationContext());
        e = this;
        e eVar = c;
        c cVar = d;
        if (cVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: WebView is missing", null, false, 12, null);
            b.b();
            return;
        }
        if (eVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: StaticRenderer is missing", null, false, 12, null);
            b.b();
            return;
        }
        try {
            zb3.a(this, new tc3(-1596214, new m(1, this, cVar, eVar), true));
        } catch (ClassNotFoundException e2) {
            k(e2);
        } catch (NoClassDefFoundError e3) {
            k(e3);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Function0 function0 = f;
        if (function0 != null) {
            function0.invoke();
        }
        e = null;
    }
}
