package com.vk.documents.impl.ui.fragments;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import xsna.fux;
import xsna.u3d0;
import xsna.zoj0;
import xsna.zom0;

/* compiled from: AttachDocumentsFragment.kt */
/* loaded from: classes18.dex */
public final class a extends zoj0<Document, AttachDocumentsFragment.b> {
    public final fux<Document> e;
    public final u3d0<Document> f;
    public final zom0<Document> g;
    public final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public a(fux<? super Document> fuxVar, u3d0<? super Document> u3d0Var, zom0<Document> zom0Var, boolean z) {
        this.e = fuxVar;
        this.f = u3d0Var;
        this.g = zom0Var;
        this.h = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((AttachDocumentsFragment.b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AttachDocumentsFragment.b(viewGroup, this.g, this.e, this.f, this.h);
    }
}
