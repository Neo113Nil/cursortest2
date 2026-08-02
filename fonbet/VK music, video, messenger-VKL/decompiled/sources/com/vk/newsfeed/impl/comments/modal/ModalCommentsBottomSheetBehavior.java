package com.vk.newsfeed.impl.comments.modal;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;

/* compiled from: ModalCommentsBottomSheetBehavior.kt */
/* loaded from: classes4.dex */
public final class ModalCommentsBottomSheetBehavior extends ModalBottomSheetBehavior<View> {
    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior
    public final View G(View view) {
        if (view != null && view.isAttachedToWindow() && view.getVisibility() == 0) {
            return super.G(view);
        }
        return null;
    }
}
