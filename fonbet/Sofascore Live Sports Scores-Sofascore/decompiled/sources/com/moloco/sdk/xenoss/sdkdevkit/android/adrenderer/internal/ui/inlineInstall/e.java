package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        h hVar = h.a;
        g gVar = g.a;
        i iVar = i.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                if (!jVar.equals(iVar)) {
                    if (jVar.equals(gVar)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fullsheet_shown", null, false, 12, null);
                        com.moloco.sdk.acm.recorder.b bVar = fVar.f;
                        if (bVar != null) {
                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("store_launch_complete");
                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                            dVar.a("result", "auto_fullsheet_shown");
                            ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar);
                        }
                    } else {
                        if (!jVar.equals(hVar)) {
                            zzl.b();
                            return null;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fallback_shown", null, false, 12, null);
                        com.moloco.sdk.acm.recorder.b bVar2 = fVar.f;
                        if (bVar2 != null) {
                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                            com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("store_launch_complete");
                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                            dVar2.a("result", "auto_fallback_shown");
                            ((com.moloco.sdk.acm.recorder.c) bVar2).a(dVar2);
                        }
                    }
                }
                return Unit.a;
            default:
                com.moloco.sdk.acm.recorder.b bVar3 = fVar.f;
                j jVar2 = (j) obj;
                jVar2.getClass();
                if (jVar2.equals(iVar)) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "click_inline_halfsheet_shown", null, false, 12, null);
                    if (bVar3 != null) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("store_launch_complete");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar3.a("result", "click_inline_halfsheet_shown");
                        ((com.moloco.sdk.acm.recorder.c) bVar3).a(dVar3);
                    }
                    if (fVar.g.compareAndSet(false, true)) {
                        String str = fVar.d.b;
                        if (str != null) {
                            com.moloco.sdk.service_locator.j.b().a(str);
                            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success fire this event once: ".concat(str), null, false, 12, null);
                        }
                    } else {
                        MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success already fired", null, false, 12, null);
                    }
                } else if (jVar2.equals(gVar)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fullsheet_shown", null, false, 12, null);
                    if (bVar3 != null) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d("store_launch_complete");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar4.a("result", "click_inline_fullsheet_shown");
                        ((com.moloco.sdk.acm.recorder.c) bVar3).a(dVar4);
                    }
                } else {
                    if (!jVar2.equals(hVar)) {
                        zzl.b();
                        return null;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fallback_shown", null, false, 12, null);
                    if (bVar3 != null) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr5 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar5 = new com.moloco.sdk.acm.d("store_launch_complete");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr5 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar5.a("result", "click_inline_fallback_shown");
                        ((com.moloco.sdk.acm.recorder.c) bVar3).a(dVar5);
                    }
                }
                return Unit.a;
        }
    }
}
