package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.b8f;
import defpackage.beh;
import defpackage.ce;
import defpackage.de;
import defpackage.fcp;
import defpackage.hs4;
import defpackage.i3l;
import defpackage.jof;
import defpackage.mqi;
import defpackage.nl4;
import defpackage.ph0;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.tc3;
import defpackage.v98;
import defpackage.wca;
import defpackage.x7k;
import defpackage.y7k;
import defpackage.ypa;
import defpackage.z45;
import defpackage.zb3;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class MraidActivity extends ComponentActivity {
    public static final aeh h = beh.b(0, 0, null, 7);
    public final ad2 b;
    public final mqi c;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m d;
    public o e;
    public boolean f;
    public nl4 g;

    public MraidActivity() {
        hs4 hs4Var = z45.a;
        this.b = s9a.c(rob.a);
        this.c = ypa.b(new com.moloco.sdk.service_locator.h(9));
    }

    public final void k(w wVar) {
        Integer num;
        if (wVar != null) {
            int i = b.a[wVar.c.ordinal()];
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
                setRequestedOrientation(num.intValue());
            }
        }
    }

    public final void l(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "Compose dependency not available, cannot show fullscreen MRAID ad", th, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = f.n;
        if (cVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            cVar.a(new com.moloco.sdk.acm.d("fullscreen_ad_compose_not_available"));
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b bVar = f.k;
        if (bVar != null) {
            bVar.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.b);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        rq3 rq3Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar;
        char c;
        com.moloco.sdk.internal.publisher.nativead.n nVar;
        MraidActivity mraidActivity = this;
        super.onCreate(bundle);
        f1.e(mraidActivity.getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.a;
        int i = 1;
        if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.c) {
            b8f.i.f.a(aVar);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.c = true;
        }
        int i2 = 3;
        de registerForActivityResult = mraidActivity.registerForActivityResult(new ce(i2), new com.facebook.p(mraidActivity, i));
        registerForActivityResult.getClass();
        mraidActivity.g = new nl4(mraidActivity, registerForActivityResult, wca.x(mraidActivity.getLifecycle()), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.b);
        t0 a = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c cVar = f.l;
        boolean z2 = cVar != null ? cVar.a : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = f.m;
        boolean z3 = bVar != null ? bVar.a : false;
        boolean z4 = bVar != null ? bVar.b : false;
        boolean z5 = bVar != null ? bVar.e : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u uVar = null;
        String str = bVar != null ? bVar.d : null;
        String str2 = bVar != null ? bVar.c : null;
        com.moloco.sdk.acm.recorder.c cVar2 = f.n;
        nl4 nl4Var = mraidActivity.g;
        if (nl4Var == null) {
            Intrinsics.i("storeInstallerImpl");
            throw null;
        }
        Intent intent = mraidActivity.getIntent();
        intent.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k dVar = (z2 || z4 || z3) ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(nl4Var, intent.getStringExtra("BUNDLE_ID"), new com.facebook.c0(11), f.l, f.m, f.n), a, z2, z3, z4, z5, str, str2, cVar2) : new com.facebook.c0(a);
        f.b = new WeakReference(mraidActivity);
        Function2 function2 = f.d;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e eVar = f.c;
        if (eVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: MraidRenderer is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        o oVar = (o) f.a.get();
        if (oVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid controller is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        g gVar = f.f;
        if (gVar != null) {
            Intent intent2 = mraidActivity.getIntent();
            intent2.getClass();
            int intExtra = intent2.getIntExtra("DEC_DELAY_SECONDS", 0);
            com.moloco.sdk.internal.services.events.c cVar3 = (com.moloco.sdk.internal.services.events.c) mraidActivity.c.getValue();
            cVar3.getClass();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w wVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w(oVar);
            m0 m0Var = gVar.a;
            if (m0Var != null) {
                if (intExtra < 0) {
                    intExtra = 0;
                }
                x7k x7kVar = y7k.b;
                c = 0;
                z = true;
                nVar = 0;
                mraidActivity = this;
                uVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b(m0Var, null, intExtra, this, cVar3, a, dVar));
            } else {
                c = 0;
                z = true;
                nVar = 0;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x[] xVarArr = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x[2];
            xVarArr[c] = wVar;
            xVarArr[z ? 1 : 0] = uVar;
            mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m(ph0.x(xVarArr), nVar);
            rq3Var = nVar;
        } else {
            z = true;
            rq3Var = null;
            mVar = null;
        }
        if (mVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid ad data is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        oVar.d = dVar;
        jof jofVar = oVar.h;
        mraidActivity.k((w) jofVar.a.getValue());
        v98 v98Var = new v98(jofVar, new d(2, this, MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4, 0), i2);
        ad2 ad2Var = this.b;
        fcp.m0(v98Var, ad2Var);
        fcp.m0(new v98(mVar.i, new i3l(this, rq3Var, 28), i2), ad2Var);
        try {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar2 = mVar;
            zb3.a(this, new tc3(2083734656, new c(this, mVar2, oVar, eVar, function2), z));
            mVar2.d();
            this.d = mVar2;
            this.e = oVar;
        } catch (ClassNotFoundException e) {
            l(e);
        } catch (NoClassDefFoundError e2) {
            l(e2);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        com.moloco.sdk.internal.publisher.nativead.b bVar;
        super.onDestroy();
        if (!this.f && (bVar = f.h) != null) {
            bVar.invoke();
        }
        com.moloco.sdk.internal.publisher.nativead.b bVar2 = f.e;
        if (bVar2 != null) {
            bVar2.invoke();
        }
        a.b(this.e);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = this.d;
        if (mVar != null) {
            mVar.destroy();
        }
        this.d = null;
        nl4 nl4Var = this.g;
        if (nl4Var == null) {
            Intrinsics.i("storeInstallerImpl");
            throw null;
        }
        nl4Var.i();
        s9a.o(this.b, null);
    }
}
