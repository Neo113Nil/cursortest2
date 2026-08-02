package com.vk.core.view.components.spinner;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import xsna.b33;
import xsna.f4m;

/* compiled from: VkScreenSpinnerDialog.kt */
/* loaded from: classes17.dex */
public final class c extends b33 {
    public final VkScreenSpinner h;

    public c(Context context) {
        super(context, 0);
        VkScreenSpinner vkScreenSpinner = new VkScreenSpinner(context, null, 6);
        vkScreenSpinner.setSpinnerMode(VkScreenSpinner.SpinnerMode.Shadow);
        vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Loading);
        this.h = vkScreenSpinner;
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(vkScreenSpinner);
    }

    public final void n(CharSequence charSequence) {
        int i = VkScreenSpinner.i;
        this.h.b(charSequence, false);
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        f4m.m(17, this.h);
    }
}
