package com.vk.voip.ui.menu.ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetHelper.kt */
/* loaded from: classes7.dex */
public final class b {
    public final View a;
    public final BottomSheetBehavior<View> b;

    public b(View view, c cVar) {
        this.a = view;
        BottomSheetBehavior<View> L = BottomSheetBehavior.L(view);
        this.b = L;
        L.D(new a(cVar));
    }
}
