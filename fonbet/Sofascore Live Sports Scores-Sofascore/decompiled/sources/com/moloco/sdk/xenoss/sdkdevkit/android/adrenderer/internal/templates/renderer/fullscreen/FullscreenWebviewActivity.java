package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.appevents.j;
import com.facebook.internal.t;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.recorder.b;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.dmi;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.hs4;
import defpackage.ljg;
import defpackage.px0;
import defpackage.rob;
import defpackage.s6a;
import defpackage.s9a;
import defpackage.upd;
import defpackage.v98;
import defpackage.z45;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "com/facebook/appevents/j", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FullscreenWebviewActivity extends AppCompatActivity {
    public static WeakReference j = new WeakReference(null);
    public static WeakReference k = new WeakReference(null);
    public static WeakReference l = new WeakReference(null);
    public static f1d m;
    public static f1d n;
    public px0 i;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "onCreate called", null, false, 12, null);
        b bVar = (b) l.get();
        if (bVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            ((c) bVar).a(new d("fullscreen_webview_activity_create"));
        }
        upd onBackPressedDispatcher = getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        this.i = s6a.o(onBackPressedDispatcher, this, new com.appsflyer.internal.a(16));
        k = new WeakReference(this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b) j.get();
        if (bVar2 == null) {
            MolocoLogger.error$default(molocoLogger, "FullscreenWebviewActivity", "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        f fVar = bVar2.d;
        if (fVar.getParent() != null) {
            ViewParent parent = fVar.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(fVar);
        }
        setContentView(fVar);
        f1d f1dVar = m;
        if (f1dVar != null) {
            ((fdi) f1dVar).m(null, Boolean.TRUE);
        }
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "WebView is not null, proceeding to notify viewReady and viewVisible", null, false, 12, null);
        final t tVar = bVar2.e;
        tVar.getClass();
        MolocoLogger.info$default(molocoLogger, "TemplateBridgeImpl", "viewReady called, invoking notifyReadyEvent in WebView", null, false, 12, null);
        c cVar = (c) tVar.c;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
        d dVar = new d("template_bridge_notify_ready_invoked");
        f fVar2 = (f) tVar.b;
        dVar.a("attached", String.valueOf(fVar2.isAttachedToWindow()));
        cVar.a(dVar);
        fVar2.evaluateJavascript("notifyReadyEvent()", new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                t tVar2 = t.this;
                c cVar2 = (c) tVar2.c;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                d dVar2 = new d("template_bridge_notify_ready_completed");
                dVar2.a("attached", String.valueOf(((f) tVar2.b).isAttachedToWindow()));
                cVar2.a(dVar2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", dmi.q("notifyReadyEvent call completed, result: ", (String) obj), null, false, 12, null);
            }
        });
        i0.b(this);
        ddi orientation$moloco_sdk_release = fVar.getOrientation$moloco_sdk_release();
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Starting to listen to orientation events", null, false, 12, null);
        p((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b) orientation$moloco_sdk_release.getValue());
        fcp.m0(new v98(orientation$moloco_sdk_release, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d(2, this, FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4, 1), 3), c);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "onDestroy called for FullscreenWebviewActivity", null, false, 12, null);
        f1d f1dVar = n;
        if (f1dVar != null) {
            ((fdi) f1dVar).m(null, Boolean.TRUE);
        }
        n = null;
        px0 px0Var = this.i;
        if (px0Var != null && px0Var.b) {
            px0Var.e();
        }
        j.e();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        t tVar;
        super.onPause();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Lifecycle onPause called", null, false, 12, null);
        if (isFinishing() || isDestroyed()) {
            MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Activity is finishing or destroyed, skipping viewVisible call", null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Activity is not finishing or destroyed, setting viewVisible to false", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b) j.get();
        if (bVar == null || (tVar = bVar.e) == null) {
            return;
        }
        tVar.a(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        t tVar;
        super.onResume();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "Lifecycle onResume called", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b) j.get();
        if (bVar == null || (tVar = bVar.e) == null) {
            return;
        }
        tVar.a(true);
    }

    public final void p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar) {
        Integer num;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar = bVar.a;
        if (aVar == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.c) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            num = 1;
        } else if (i == 2) {
            num = 0;
        } else {
            if (i != 3) {
                zzl.b();
                return;
            }
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", ljg.j(intValue, "Setting orientation to "), null, false, 12, null);
            setRequestedOrientation(intValue);
        }
    }
}
