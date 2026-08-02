package com.vk.story.archive.impl.presentation;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.iah0;

/* compiled from: StoryArchiveLayoutManager.kt */
/* loaded from: classes6.dex */
public final class StoryArchiveLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int F(RecyclerView.a0 a0Var) {
        return iah0.f().heightPixels / this.s;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
