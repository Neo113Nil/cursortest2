package com.vk.sharing.core.view;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.sharing.core.view.l;

/* compiled from: SharingV2View.kt */
/* loaded from: classes5.dex */
public final class g extends BottomSheetBehavior.d {
    public final /* synthetic */ f a;

    public g(f fVar) {
        this.a = fVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
        f.c1(this.a, f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        l.a aVar;
        f fVar = this.a;
        l.a aVar2 = fVar.D;
        if (aVar2 != null) {
            if (i == 1) {
                fVar.e1 = true;
                return;
            }
            if (i == 3) {
                aVar2.m2(true);
                fVar.c1 = true;
                l.a aVar3 = fVar.D;
                if (aVar3 != null) {
                    aVar3.F2();
                }
                fVar.e1 = false;
                return;
            }
            if (i == 4) {
                aVar2.m2(false);
                fVar.c1 = false;
                l.a aVar4 = fVar.D;
                if (aVar4 != null) {
                    aVar4.F2();
                }
                fVar.e1 = false;
                return;
            }
            if (i != 5) {
                if (i != 6) {
                    return;
                }
                fVar.e1 = false;
                return;
            }
            aVar2.m2(false);
            l.a aVar5 = fVar.D;
            if (aVar5 != null) {
                aVar5.M2();
            }
            if (fVar.e1 && (aVar = fVar.D) != null) {
                aVar.B2();
            }
            l.a aVar6 = fVar.D;
            if (aVar6 != null) {
                aVar6.c();
            }
            fVar.e1 = false;
        }
    }
}
