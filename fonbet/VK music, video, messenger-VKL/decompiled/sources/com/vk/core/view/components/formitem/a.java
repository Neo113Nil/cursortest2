package com.vk.core.view.components.formitem;

import com.vk.core.view.components.formitem.VkInputSelect;
import xsna.waf0;

/* compiled from: VkInputSelect.kt */
/* loaded from: classes17.dex */
public final class a extends VkInputSelect.b {
    public final /* synthetic */ waf0 b;

    public a(waf0 waf0Var) {
        this.b = waf0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.invoke(charSequence);
    }
}
