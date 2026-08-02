package com.vk.core.view.components.context.menu;

import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import xsna.av20;
import xsna.d8t0;
import xsna.wmg;

/* compiled from: VkUiContextMenu.kt */
/* loaded from: classes17.dex */
public final class d implements av20.b<VkContextMenu.a> {
    public final /* synthetic */ d8t0 a;

    public d(d8t0 d8t0Var) {
        this.a = d8t0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        ((VkContextMenu.a) obj).f.invoke();
        this.a.invoke();
    }
}
