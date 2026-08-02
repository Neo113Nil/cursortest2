package com.vk.stories.design.view.stickers.selection;

import android.view.ViewGroup;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView.e;

/* compiled from: SelectionStickerView.java */
/* loaded from: classes6.dex */
public final class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ SelectionStickerView c;

    public b(SelectionStickerView selectionStickerView, int i) {
        this.c = selectionStickerView;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SelectionStickerView selectionStickerView = this.c;
        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = selectionStickerView.N;
        vkBottomSheetBehavior.J(this.b);
        vkBottomSheetBehavior.q = selectionStickerView.new e();
    }
}
