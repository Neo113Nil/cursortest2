package com.adsbynimbus.google;

import defpackage.fsf;
import defpackage.kj2;
import defpackage.of;
import defpackage.p2g;
import defpackage.pcd;
import defpackage.pyf;
import defpackage.qcd;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/adsbynimbus/google/DynamicPriceRenderer$render$2$1", "Lpyf;", "Lpcd;", "Lof;", "controller", "", "onAdRendered", "(Lof;)V", "Lqcd;", "error", "onError", "(Lqcd;)V", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class DynamicPriceRenderer$render$2$1 implements pyf, pcd {
    public final /* synthetic */ kj2 a;
    public final /* synthetic */ fsf b;

    public DynamicPriceRenderer$render$2$1(kj2 kj2Var, fsf fsfVar) {
        this.a = kj2Var;
        this.b = fsfVar;
    }

    @Override // defpackage.pyf
    public void onAdRendered(of controller) {
        controller.getClass();
        kj2 kj2Var = this.a;
        if (!kj2Var.isActive()) {
            controller.a();
            return;
        }
        p2g p2gVar = w2g.b;
        kj2Var.resumeWith(controller);
        this.b.a = controller;
    }

    @Override // defpackage.pcd
    public void onError(qcd error) {
        error.getClass();
        kj2 kj2Var = this.a;
        if (kj2Var.isActive()) {
            p2g p2gVar = w2g.b;
            kj2Var.resumeWith(new u2g(error));
        }
    }
}
