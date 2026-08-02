package com.vk.voip.ui.menu.ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.voip.ui.menu.ui.MainMenuView;

/* compiled from: BottomSheetHelper.kt */
/* loaded from: classes7.dex */
public final class a extends BottomSheetBehavior.d {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
        this.a.invoke(new MainMenuView.b.d(f));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        c cVar = this.a;
        if (i == 1) {
            cVar.invoke(MainMenuView.b.C2065b.a);
        } else if (i == 3) {
            cVar.invoke(MainMenuView.b.c.a);
        } else {
            if (i != 4) {
                return;
            }
            cVar.invoke(MainMenuView.b.a.a);
        }
    }
}
