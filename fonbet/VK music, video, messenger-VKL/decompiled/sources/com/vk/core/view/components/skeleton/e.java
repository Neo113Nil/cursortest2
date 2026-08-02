package com.vk.core.view.components.skeleton;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: VkSkeleton.kt */
/* loaded from: classes17.dex */
public final class e extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setPath(null);
    }
}
