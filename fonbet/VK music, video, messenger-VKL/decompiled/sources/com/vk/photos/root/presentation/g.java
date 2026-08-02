package com.vk.photos.root.presentation;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.photos.root.presentation.e;
import xsna.lga0;
import xsna.mtn0;

/* compiled from: PhotosRootView.kt */
/* loaded from: classes4.dex */
public final class g extends mtn0 {
    public final /* synthetic */ h b;

    public g(h hVar) {
        this.b = hVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        h hVar = this.b;
        hVar.getClass();
        View view = gVar.f;
        lga0 lga0Var = view instanceof lga0 ? (lga0) view : null;
        if (lga0Var != null) {
            lga0Var.setTabSelected(true);
        }
        hVar.e.invoke(e.b.a);
    }

    @Override // xsna.mtn0, com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        if (gVar != null) {
            this.b.getClass();
            View view = gVar.f;
            lga0 lga0Var = view instanceof lga0 ? (lga0) view : null;
            if (lga0Var != null) {
                lga0Var.setTabSelected(false);
            }
        }
    }
}
