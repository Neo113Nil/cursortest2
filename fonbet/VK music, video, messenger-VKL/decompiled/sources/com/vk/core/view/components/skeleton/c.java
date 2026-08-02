package com.vk.core.view.components.skeleton;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: VkSkeleton.kt */
/* loaded from: classes17.dex */
public final class c extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Integer valueOf = Integer.valueOf(view.getWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : view.getMeasuredWidth();
        Integer valueOf2 = Integer.valueOf(view.getHeight());
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        outline.setRoundRect(0, 0, intValue, num != null ? num.intValue() : view.getMeasuredHeight(), Math.max(intValue, r7) / 2.0f);
    }
}
