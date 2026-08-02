package com.vk.superapp.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.f540;
import xsna.g8n0;
import xsna.j9n0;

/* compiled from: SuperAppLayoutManager.kt */
/* loaded from: classes6.dex */
public final class SuperAppLayoutManager extends GridLayoutManager {
    public final boolean A;
    public final f540 B;
    public final g8n0 C;
    public final boolean D;
    public boolean E;
    public boolean F;

    public SuperAppLayoutManager(Context context, f540 f540Var, g8n0 g8n0Var) {
        super(12);
        this.A = true;
        this.B = f540Var;
        this.C = g8n0Var;
        this.D = true;
        this.F = true;
        this.x = new j9n0(this, context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return this.F && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.F && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View getFocusedChild() {
        if (this.D) {
            return null;
        }
        return super.getFocusedChild();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        if (this.A) {
            return this.E || super.supportsPredictiveItemAnimations();
        }
        return false;
    }
}
