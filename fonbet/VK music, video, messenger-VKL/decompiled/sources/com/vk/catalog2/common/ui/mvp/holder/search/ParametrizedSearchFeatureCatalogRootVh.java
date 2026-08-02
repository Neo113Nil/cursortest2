package com.vk.catalog2.common.ui.mvp.holder.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import xsna.bpn0;
import xsna.gzs;
import xsna.hyh0;
import xsna.o5a;
import xsna.qrh0;
import xsna.yzh0;
import xsna.zqh0;

/* compiled from: ParametrizedSearchFeatureCatalogRootVh.kt */
/* loaded from: classes16.dex */
public abstract class ParametrizedSearchFeatureCatalogRootVh extends SearchFeatureCatalogRootVh {
    public final bpn0 u;

    public ParametrizedSearchFeatureCatalogRootVh() {
        throw null;
    }

    public ParametrizedSearchFeatureCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, final zqh0 zqh0Var, final hyh0.b bVar, final yzh0 yzh0Var, final boolean z) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, bVar);
        this.u = new bpn0(new gzs() { // from class: xsna.xh90
            @Override // xsna.gzs
            public final Object invoke() {
                yzh0 yzh0Var2;
                if (!z) {
                    return null;
                }
                zqh0 zqh0Var2 = zqh0Var;
                if (!(zqh0Var2 instanceof yh90) || (yzh0Var2 = yzh0Var) == null) {
                    return null;
                }
                return new qrh0(bVar, (yh90) zqh0Var2, yzh0Var2);
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        View X = super.X(layoutInflater, viewGroup, null);
        qrh0 qrh0Var = (qrh0) this.u.getValue();
        return (qrh0Var == null || (a = qrh0Var.a(X)) == null) ? X : a;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void Y() {
        super.Y();
        qrh0 qrh0Var = (qrh0) this.u.getValue();
        if (qrh0Var != null) {
            qrh0Var.f = null;
            qrh0Var.e = null;
        }
    }
}
