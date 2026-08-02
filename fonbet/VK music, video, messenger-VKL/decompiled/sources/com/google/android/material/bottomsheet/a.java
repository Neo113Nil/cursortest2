package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.b;
import xsna.bqx0;
import xsna.u080;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes13.dex */
public final class a implements u080 {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        b bVar = this.b;
        b.C0117b c0117b = bVar.p;
        if (c0117b != null) {
            bVar.h.Q(c0117b);
        }
        b.C0117b c0117b2 = new b.C0117b(bVar.k, bqx0Var);
        bVar.p = c0117b2;
        c0117b2.e(bVar.getWindow());
        bVar.h.D(bVar.p);
        return bqx0Var;
    }
}
