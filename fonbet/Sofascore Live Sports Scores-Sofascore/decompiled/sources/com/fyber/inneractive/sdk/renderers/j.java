package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j implements View.OnLayoutChangeListener {
    public final /* synthetic */ n a;

    public j(n nVar) {
        this.a = nVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams;
        if (this.a.B == null) {
            return;
        }
        int i9 = i8 - i6;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if ((i7 - i5 == i10 && i9 == i11) || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.a.B.setLayoutParams(layoutParams);
    }
}
