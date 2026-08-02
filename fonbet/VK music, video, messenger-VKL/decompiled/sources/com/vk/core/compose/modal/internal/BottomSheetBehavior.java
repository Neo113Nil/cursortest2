package com.vk.core.compose.modal.internal;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import xsna.epx;

/* compiled from: BottomSheetBehavior.kt */
/* loaded from: classes17.dex */
public final class BottomSheetBehavior<V extends View> extends ModalBottomSheetBehavior<V> {
    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior
    public final View G(View view) {
        return (view != null && epx.f(view.getTag(), "AndroidComposeView") && view.isNestedScrollingEnabled()) ? view : super.G(view);
    }
}
