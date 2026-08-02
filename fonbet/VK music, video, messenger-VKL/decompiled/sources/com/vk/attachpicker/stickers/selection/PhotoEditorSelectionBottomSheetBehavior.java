package com.vk.attachpicker.stickers.selection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;

/* compiled from: PhotoEditorSelectionBottomSheetBehavior.kt */
/* loaded from: classes15.dex */
public final class PhotoEditorSelectionBottomSheetBehavior<V extends View> extends VkBottomSheetBehavior<V> {
    public PhotoEditorSelectionBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        super.C(coordinatorLayout, v, motionEvent);
        return !this.k;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown() && this.w) {
            return super.m(coordinatorLayout, v, motionEvent);
        }
        this.k = true;
        return false;
    }
}
