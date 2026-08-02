package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements k {
    public final f a;
    public final t0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final com.moloco.sdk.acm.recorder.b i;

    public d(f fVar, t0 t0Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, com.moloco.sdk.acm.recorder.b bVar) {
        this.a = fVar;
        this.b = t0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
        this.i = bVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public final void a(String str) {
        str.getClass();
        boolean z = this.c;
        t0 t0Var = this.b;
        if (!z) {
            t0Var.a(str);
            return;
        }
        f fVar = this.a;
        c cVar = fVar.d;
        if (cVar == null || !cVar.a) {
            t0Var.a(str);
            return;
        }
        com.moloco.sdk.acm.recorder.b bVar = fVar.f;
        if (bVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("store_launch_started");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("step", "android_inline");
            ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar);
        }
        fVar.a(t0Var, str, new e(fVar, 1));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public final void b(String str) {
        boolean z = this.d;
        t0 t0Var = this.b;
        boolean z2 = this.f;
        if (z && !z2) {
            this.a.b(str, t0Var);
            return;
        }
        if (z2) {
            String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                t0Var.a(str);
                com.moloco.sdk.acm.recorder.b bVar = this.i;
                if (bVar != null) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("store_launch_complete");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar.a("result", "auto_fullsheet_shown_complete");
                    ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar);
                }
                String str3 = this.h;
                if (str3 != null) {
                    com.moloco.sdk.service_locator.j.b().a(str3);
                }
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public final void c(String str) {
        boolean z = this.e;
        t0 t0Var = this.b;
        boolean z2 = this.f;
        if (z && !z2) {
            this.a.b(str, t0Var);
            return;
        }
        if (z2) {
            String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                t0Var.a(str);
                com.moloco.sdk.acm.recorder.b bVar = this.i;
                if (bVar != null) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("store_launch_complete");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar.a("result", "auto_fullsheet_shown_skip");
                    ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar);
                }
                String str3 = this.h;
                if (str3 != null) {
                    com.moloco.sdk.service_locator.j.b().a(str3);
                }
            }
        }
    }
}
