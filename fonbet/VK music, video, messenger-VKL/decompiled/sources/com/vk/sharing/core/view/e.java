package com.vk.sharing.core.view;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sharing.core.view.l;

/* compiled from: SharingV2View.kt */
/* loaded from: classes5.dex */
public final class e extends RecyclerView.t {
    public final /* synthetic */ f b;

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View headerShadow;
        l.a aVar;
        int w = ((LinearLayoutManager) recyclerView.getLayoutManager()).w();
        f fVar = this.b;
        if (w == fVar.P0.size() - 1 && (aVar = fVar.D) != null) {
            aVar.s2();
        }
        float f = fVar.V0 / 4.0f;
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset > f) {
            computeVerticalScrollOffset = f;
        }
        float f2 = computeVerticalScrollOffset / f;
        headerShadow = fVar.getHeaderShadow();
        headerShadow.setAlpha(f2);
    }
}
