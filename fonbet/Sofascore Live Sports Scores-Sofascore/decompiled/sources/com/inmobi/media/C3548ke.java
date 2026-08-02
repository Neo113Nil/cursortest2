package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3548ke extends hoi implements Function2 {
    public final /* synthetic */ C3652oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3548ke(C3652oe c3652oe, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c3652oe;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3548ke(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3548ke(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        C3652oe c3652oe = this.a;
        c3652oe.getClass();
        c3652oe.a.addView(c3652oe.g, new RelativeLayout.LayoutParams(-1, -1));
        C3652oe c3652oe2 = this.a;
        boolean z = c3652oe2.d.d.a;
        c3652oe2.i = z;
        if (z) {
            c3652oe2.a(c3652oe2.j, c3652oe2.k);
        } else {
            c3652oe2.a(c3652oe2.k, c3652oe2.j);
        }
        An an = this.a.l;
        if (an.c.a) {
            float b = R5.b();
            ProgressBar progressBar = new ProgressBar(an.b.getContext(), null, R.attr.progressBarStyleHorizontal);
            an.e = progressBar;
            L6.a(progressBar, an.c, b);
            an.b.addView(an.e);
            b1d b1dVar = an.d;
            ku3 ku3Var = an.a;
            hs4 hs4Var = z45.a;
            xw3.L(ku3Var, rob.a, null, new C3920yn(b1dVar, null, an), 2);
        }
        return Unit.a;
    }
}
