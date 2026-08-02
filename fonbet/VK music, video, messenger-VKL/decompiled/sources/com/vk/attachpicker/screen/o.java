package com.vk.attachpicker.screen;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.vkontakte.android.R;
import xsna.e43;

/* compiled from: ViewerScreen.java */
/* loaded from: classes15.dex */
public final class o extends ColorDrawable {
    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f = i4;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        super.setBounds(i, i2, i3, (int) (f - context.getResources().getDimension(R.dimen.picker_viewer_bottom_padding)));
    }
}
