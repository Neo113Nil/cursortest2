package com.vk.clips.design.view.editor;

import com.vk.clips.design.view.editor.CorrectionView;
import com.vk.core.view.components.tabs.VkTabs;

/* compiled from: CorrectionView.kt */
/* loaded from: classes16.dex */
public final class a implements VkTabs.b {
    public final /* synthetic */ CorrectionView a;

    public a(CorrectionView correctionView) {
        this.a = correctionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void c(VkTabs.c cVar) {
        CorrectionView.Tab tab = (CorrectionView.Tab) CorrectionView.Tab.h().get(cVar.b);
        int i = CorrectionView.y;
        this.a.P4(tab);
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void b() {
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void a(VkTabs.c cVar) {
    }
}
