package com.vk.catalog2.common.ui.holders;

import android.graphics.Rect;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import xsna.b5a;
import xsna.cfp0;
import xsna.izs;
import xsna.mba;
import xsna.s3q0;

/* compiled from: CatalogClickableViewHolder.kt */
/* loaded from: classes16.dex */
public abstract class CatalogClickableViewHolder implements CatalogViewHolder, View.OnClickListener, mba {
    public final mba b;
    public final b5a c;
    public UIBlock d;

    public CatalogClickableViewHolder(mba mbaVar, b5a b5aVar) {
        this.b = mbaVar;
        this.c = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.d = uIBlock;
        b(uIBlock);
    }

    public cfp0 a(int i, UIBlock uIBlock) {
        return new cfp0(uIBlock, null);
    }

    public abstract void b(UIBlock uIBlock);

    @Override // xsna.mba
    public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
        mba mbaVar = this.b;
        if (mbaVar != null) {
            mbaVar.m(i, this.d, izsVar);
        }
        if (uIBlock != null) {
            this.c.a(a(i, uIBlock));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z(view.getId(), this.d);
    }

    @Override // xsna.mba
    public final void q(int i, UIBlock uIBlock, Object obj) {
        mba mbaVar = this.b;
        if (mbaVar != null) {
            mbaVar.q(i, this.d, obj);
        }
        if (uIBlock != null) {
            this.c.a(a(i, uIBlock));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
        mba mbaVar = this.b;
        if (mbaVar != null) {
            mbaVar.z(i, this.d);
        }
        if (uIBlock != null) {
            this.c.a(a(i, uIBlock));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
