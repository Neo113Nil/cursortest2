package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.b8f;
import defpackage.beh;
import defpackage.ce;
import defpackage.de;
import defpackage.fcp;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.nl4;
import defpackage.rob;
import defpackage.s9a;
import defpackage.tc3;
import defpackage.u41;
import defpackage.v98;
import defpackage.wca;
import defpackage.xw3;
import defpackage.z45;
import defpackage.zb3;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/x", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class VastActivity extends ComponentActivity {
    public static final aeh e = beh.b(0, 0, null, 7);
    public static WeakReference f = new WeakReference(null);
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a g;
    public static Function2 h;
    public static com.moloco.sdk.internal.publisher.nativead.b i;
    public static g9i j;
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b k;
    public static com.moloco.sdk.acm.recorder.c l;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m b;
    public final ad2 c;
    public nl4 d;

    public VastActivity() {
        hs4 hs4Var = z45.a;
        this.c = s9a.c(rob.a);
    }

    public final void k(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastActivity", "Compose dependency not available, cannot show fullscreen VAST ad", th, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = l;
        if (cVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            cVar.a(new com.moloco.sdk.acm.d("fullscreen_ad_compose_not_available"));
        }
        xw3.L(this.c, null, null, new u41(2, null, 16), 3);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k dVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m b;
        super.onCreate(bundle);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1.e(getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.a;
        if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.c) {
            b8f.i.f.a(aVar);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.c = true;
        }
        int i2 = 3;
        de registerForActivityResult = registerForActivityResult(new ce(i2), new com.facebook.p(this, 2));
        registerForActivityResult.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 a = com.moloco.sdk.service_locator.i.a();
        this.d = new nl4(this, registerForActivityResult, wca.x(getLifecycle()), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.b);
        Intent intent = getIntent();
        intent.getClass();
        boolean booleanExtra = intent.getBooleanExtra("ANDROID_INLINE_ENABLED", false);
        Intent intent2 = getIntent();
        intent2.getClass();
        boolean booleanExtra2 = intent2.getBooleanExtra("ANDROID_AUTOINLINE_ENABLED", false);
        Intent intent3 = getIntent();
        intent3.getClass();
        boolean booleanExtra3 = intent3.getBooleanExtra("ANDROID_AUTOINLINE_SKIP", false);
        Intent intent4 = getIntent();
        intent4.getClass();
        boolean booleanExtra4 = intent4.getBooleanExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", false);
        Intent intent5 = getIntent();
        intent5.getClass();
        String stringExtra = intent5.getStringExtra("ANDROID_AUTOINLINE_CLICKTHROUGH");
        Intent intent6 = getIntent();
        intent6.getClass();
        String stringExtra2 = intent6.getStringExtra("ANDROID_AUTOINLINE_EVENTLINK");
        com.moloco.sdk.acm.recorder.c cVar = l;
        nl4 nl4Var = this.d;
        if (nl4Var == null) {
            Intrinsics.i("storeInstallerImpl");
            throw null;
        }
        Intent intent7 = getIntent();
        intent7.getClass();
        String stringExtra3 = intent7.getStringExtra("BUNDLE_ID");
        com.facebook.c0 c0Var = new com.facebook.c0(11);
        Intent intent8 = getIntent();
        intent8.getClass();
        boolean booleanExtra5 = intent8.getBooleanExtra("ANDROID_INLINE_ENABLED", false);
        Intent intent9 = getIntent();
        intent9.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c(booleanExtra5, intent9.getStringExtra("ANDROID_INLINE_URL"));
        Intent intent10 = getIntent();
        intent10.getClass();
        boolean booleanExtra6 = intent10.getBooleanExtra("ANDROID_AUTOINLINE_ENABLED", false);
        Intent intent11 = getIntent();
        intent11.getClass();
        boolean booleanExtra7 = intent11.getBooleanExtra("ANDROID_AUTOINLINE_SKIP", false);
        Intent intent12 = getIntent();
        intent12.getClass();
        String stringExtra4 = intent12.getStringExtra("ANDROID_AUTOINLINE_EVENTLINK");
        Intent intent13 = getIntent();
        intent13.getClass();
        String stringExtra5 = intent13.getStringExtra("ANDROID_AUTOINLINE_CLICKTHROUGH");
        Intent intent14 = getIntent();
        intent14.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(nl4Var, stringExtra3, c0Var, cVar2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(booleanExtra6, booleanExtra7, stringExtra4, stringExtra5, intent14.getBooleanExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", false)), l);
        if (booleanExtra || booleanExtra3 || booleanExtra2) {
            t0Var = a;
            dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(fVar, t0Var, booleanExtra, booleanExtra2, booleanExtra3, booleanExtra4, stringExtra, stringExtra2, cVar);
        } else {
            dVar = new com.facebook.c0(a);
            t0Var = a;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar2 = g;
        if (aVar2 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        Function2 function2 = h;
        if (function2 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.internal.services.events.c a2 = com.moloco.sdk.service_locator.l.a();
        Intent intent15 = getIntent();
        intent15.getClass();
        boolean booleanExtra8 = intent15.getBooleanExtra("START_MUTED", true);
        Intent intent16 = getIntent();
        intent16.getClass();
        Boolean valueOf = intent16.hasExtra("SKIP_ENABLED") ? Boolean.valueOf(intent16.getBooleanExtra("SKIP_ENABLED", false)) : null;
        Intent intent17 = getIntent();
        intent17.getClass();
        int intExtra = intent17.getIntExtra("SKIP_DELAY_SECONDS", 0);
        Intent intent18 = getIntent();
        intent18.getClass();
        int intExtra2 = intent18.getIntExtra("CLOSE_DELAY_SECONDS", 0);
        Intent intent19 = getIntent();
        intent19.getClass();
        int intExtra3 = intent19.getIntExtra("DEC_DELAY_SECONDS", 0);
        Intent intent20 = getIntent();
        intent20.getClass();
        boolean booleanExtra9 = intent20.getBooleanExtra("AUTO_STORE_ON_SKIP", false);
        Intent intent21 = getIntent();
        intent21.getClass();
        b = com.facebook.appevents.g.b(aVar2, t0Var, this, a2, booleanExtra8, valueOf, intExtra, intExtra2, intExtra3, booleanExtra9, intent21.getBooleanExtra("AUTO_STORE_ON_COMPLETE", false), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j(), dVar);
        this.b = b;
        f = new WeakReference(this);
        fcp.m0(new v98(b.i, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, null, 5), i2), this.c);
        try {
            zb3.a(this, new tc3(-369589045, new com.moloco.sdk.internal.m(2, this, b, function2), true));
            b.d();
        } catch (ClassNotFoundException e2) {
            k(e2);
        } catch (NoClassDefFoundError e3) {
            k(e3);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.moloco.sdk.internal.publisher.nativead.b bVar = i;
        if (bVar != null) {
            bVar.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = this.b;
        if (mVar != null) {
            mVar.destroy();
        }
        this.b = null;
        nl4 nl4Var = this.d;
        if (nl4Var == null) {
            Intrinsics.i("storeInstallerImpl");
            throw null;
        }
        nl4Var.i();
        s9a.o(this.c, null);
        f = new WeakReference(null);
        x.h();
    }
}
