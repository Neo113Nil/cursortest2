package com.fyber.inneractive.sdk.player.ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class g extends TextureView {
    public final WeakReference a;

    public g(s sVar) {
        super(sVar.getContext());
        this.a = new WeakReference(sVar);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        s sVar = (s) v.a(this.a);
        if (sVar instanceof i) {
            sVar = ((i) sVar).z;
        }
        if (sVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(sVar.u.a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(sVar.u.b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
