package com.vk.core.view.components.skeleton;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vk.core.view.components.skeleton.VkSkeleton;
import xsna.hbh0;

/* compiled from: VkSkeleton.kt */
/* loaded from: classes17.dex */
public final class d extends ViewOutlineProvider {
    public final /* synthetic */ VkSkeleton.a.C0862a a;
    public final /* synthetic */ VkSkeleton b;

    public d(VkSkeleton.a.C0862a c0862a, VkSkeleton vkSkeleton) {
        this.a = c0862a;
        this.b = vkSkeleton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        Integer valueOf = Integer.valueOf(width);
        if (width <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : view.getMeasuredWidth();
        int height = view.getHeight();
        Integer valueOf2 = height > 0 ? Integer.valueOf(height) : null;
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : view.getMeasuredHeight();
        float f = this.a.a;
        VkSkeleton vkSkeleton = this.b;
        if (f == -1.0f) {
            f = Math.min(hbh0.c(vkSkeleton.getContext(), (float) intValue), hbh0.c(vkSkeleton.getContext(), (float) intValue2)) <= 10.0f ? 2.0f : 4.0f;
        }
        outline.setRoundRect(0, 0, intValue, intValue2, hbh0.a(vkSkeleton.getContext(), f));
    }
}
