package com.vk.attachpicker.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;

/* compiled from: DeprecatedAttachActivity.java */
/* loaded from: classes15.dex */
public final class b extends BottomSheetBehavior.d {
    public final /* synthetic */ DeprecatedAttachActivity a;

    public b(DeprecatedAttachActivity deprecatedAttachActivity) {
        this.a = deprecatedAttachActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(@NonNull View view, float f) {
        int i = DeprecatedAttachActivity.K0;
        DeprecatedAttachActivity deprecatedAttachActivity = this.a;
        deprecatedAttachActivity.d2(f);
        deprecatedAttachActivity.t0 = f;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, @NonNull View view) {
        DeprecatedAttachActivity deprecatedAttachActivity = this.a;
        if (i == 5) {
            int i2 = DeprecatedAttachActivity.K0;
            deprecatedAttachActivity.V1();
            return;
        }
        deprecatedAttachActivity.H.setSwipeEnabled(i == 4 || i == 2);
        if (i != 2) {
            DeprecatedAttachActivity.g gVar = deprecatedAttachActivity.N;
            if (!gVar.k) {
                gVar.k = true;
                gVar.notifyDataSetChanged();
            }
        }
        deprecatedAttachActivity.e2();
    }
}
