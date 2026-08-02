package com.vk.im.ui.fragments;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.radio.VkRadioButton;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;

/* compiled from: ImCreateChatControlParamsFragment.kt */
/* loaded from: classes2.dex */
public final class a implements VkCell.d {
    public final VkRadioButton a;
    public final VkRadioButton b;

    public a(Context context) {
        VkRadioButton vkRadioButton = new VkRadioButton(context, null, 6);
        vkRadioButton.setClickable(false);
        vkRadioButton.setFocusable(false);
        this.a = vkRadioButton;
        this.b = vkRadioButton;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        ImCreateChatControlParamsFragment.c cVar = fVar instanceof ImCreateChatControlParamsFragment.c ? (ImCreateChatControlParamsFragment.c) fVar : null;
        boolean z = false;
        if (cVar != null && cVar.a) {
            z = true;
        }
        this.a.setChecked(z);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.b;
    }
}
