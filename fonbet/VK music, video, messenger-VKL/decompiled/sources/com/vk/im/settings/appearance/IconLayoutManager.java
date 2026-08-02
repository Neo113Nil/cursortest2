package com.vk.im.settings.appearance;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: IconLayoutManager.kt */
/* loaded from: classes2.dex */
public final class IconLayoutManager extends LinearLayoutManager {
    public final int r;

    public IconLayoutManager(int i, Context context) {
        super(0, false);
        this.r = i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o(RecyclerView.a0 a0Var, int[] iArr) {
        int i = this.r;
        iArr[0] = i;
        iArr[1] = i;
    }
}
