package com.vk.profile.community.impl.ui.profile.util;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.iah0;

/* compiled from: CommunityProfileLayoutManager.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileLayoutManager extends LinearLayoutManager {
    public final Context r;
    public final boolean s;

    public CommunityProfileLayoutManager(Context context) {
        super(1, false);
        this.r = context;
        this.s = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.s && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o(RecyclerView.a0 a0Var, int[] iArr) {
        iArr[0] = 0;
        Context context = this.r;
        iArr[1] = iah0.s(context) ? iah0.p(context) : iah0.z(context);
    }
}
