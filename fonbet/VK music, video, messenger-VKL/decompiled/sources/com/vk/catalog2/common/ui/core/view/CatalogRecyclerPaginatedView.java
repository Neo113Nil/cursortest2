package com.vk.catalog2.common.ui.core.view;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import xsna.b8;
import xsna.f4m;
import xsna.gu0;
import xsna.gxp;
import xsna.gzs;
import xsna.m0q0;
import xsna.q;
import xsna.s3q0;
import xsna.wzs;
import xsna.zy;

/* compiled from: CatalogRecyclerPaginatedView.kt */
/* loaded from: classes16.dex */
public class CatalogRecyclerPaginatedView extends RecyclerPaginatedView implements m0q0, UiTracking$TrackableView {
    public static final /* synthetic */ int Q = 0;
    public AbstractPaginatedView.h N;
    public m0q0 O;
    public wzs<? super Boolean, ? super gzs<s3q0>, s3q0> P;

    public CatalogRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static s3q0 A(CatalogRecyclerPaginatedView catalogRecyclerPaginatedView) {
        super.lb();
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRefreshDelegate$lambda$0(CatalogRecyclerPaginatedView catalogRecyclerPaginatedView) {
        gzs<s3q0> gzsVar = catalogRecyclerPaginatedView.F;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public static s3q0 x(CatalogRecyclerPaginatedView catalogRecyclerPaginatedView) {
        super.lb();
        return s3q0.a;
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void f0() {
        wzs<? super Boolean, ? super gzs<s3q0>, s3q0> wzsVar = this.P;
        if (wzsVar != null) {
            wzsVar.invoke(Boolean.FALSE, new zy(this, 16));
        }
        super.f0();
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public void fj(Throwable th, gxp gxpVar) {
        wzs<? super Boolean, ? super gzs<s3q0>, s3q0> wzsVar = this.P;
        if (wzsVar != null) {
            wzsVar.invoke(Boolean.FALSE, new gu0(3));
        }
        super.fj(th, gxpVar);
    }

    public final wzs<Boolean, gzs<s3q0>, s3q0> getCustomFooterLoadingAction() {
        return this.P;
    }

    public final m0q0 getUiTrackingScreenProvider() {
        return this.O;
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void lb() {
        wzs<? super Boolean, ? super gzs<s3q0>, s3q0> wzsVar = this.P;
        if (wzsVar != null) {
            wzsVar.invoke(Boolean.TRUE, new q(this, 10));
        } else {
            super.lb();
        }
    }

    public final void setBottomInsetForScrollableContent(int i) {
        this.x.setClipToPadding(false);
        f4m.v(i, this.x);
    }

    public final void setCustomFooterLoadingAction(wzs<? super Boolean, ? super gzs<s3q0>, s3q0> wzsVar) {
        this.P = wzsVar;
    }

    public final void setRefreshDelegate(AbstractPaginatedView.h hVar) {
        AbstractPaginatedView.h hVar2;
        if (hVar == null && (hVar2 = this.N) != null) {
            this.w = hVar2;
            setSwipeRefreshEnabled(true);
        } else if (hVar != null) {
            this.N = this.w;
            setSwipeRefreshEnabled(false);
            this.w = hVar;
            hVar.c(new b8(this, 9));
        }
    }

    public final void setUiTrackingScreenProvider(m0q0 m0q0Var) {
        this.O = m0q0Var;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        m0q0 m0q0Var = this.O;
        if (m0q0Var != null) {
            m0q0Var.y(uiTrackingScreen);
        }
    }
}
