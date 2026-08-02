package com.inmobi.media;

import android.widget.ProgressBar;
import defpackage.b98;
import defpackage.ku3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3894xn implements b98 {
    public final /* synthetic */ An a;

    public C3894xn(ku3 ku3Var, An an) {
        this.a = an;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        ProgressBar progressBar;
        AbstractC3712qm abstractC3712qm = (AbstractC3712qm) obj;
        An an = this.a;
        an.getClass();
        if (abstractC3712qm instanceof Jn) {
            ProgressBar progressBar2 = an.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (abstractC3712qm instanceof C3868wn) {
            int i = ((C3868wn) abstractC3712qm).b;
            ProgressBar progressBar3 = an.e;
            if (progressBar3 != null) {
                P6.a(an.f);
                an.f = X4.a(an.a, new C3946zn(progressBar3, an, i, null));
            }
        } else if ((abstractC3712qm instanceof C3660om) && an.c.b && (progressBar = an.e) != null) {
            progressBar.setVisibility(8);
        }
        return Unit.a;
    }
}
