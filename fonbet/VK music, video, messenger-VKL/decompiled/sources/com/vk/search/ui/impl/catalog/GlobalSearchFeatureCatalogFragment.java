package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bpn0;
import xsna.irh0;
import xsna.jrh0;
import xsna.rda;
import xsna.unh0;
import xsna.w8i;
import xsna.yce;
import xsna.zqh0;

/* compiled from: GlobalSearchFeatureCatalogFragment.kt */
/* loaded from: classes5.dex */
public abstract class GlobalSearchFeatureCatalogFragment extends BaseCatalogFragment implements jrh0, unh0, w8i {
    public static final /* synthetic */ int R = 0;
    public final bpn0 Q;

    public GlobalSearchFeatureCatalogFragment(Class<? extends CatalogRootViewHolder> cls) {
        super(cls, true);
        this.Q = new bpn0(new yce(this, 23));
    }

    @Override // xsna.jrh0
    public zqh0 af() {
        return (zqh0) this.Q.getValue();
    }

    public irh0 go() {
        return new irh0(false, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // xsna.unh0
    public final void s() {
        CatalogVh catalogVh = this.P;
        rda rdaVar = catalogVh instanceof rda ? (rda) catalogVh : null;
        if (rdaVar != null) {
            rdaVar.s();
        }
    }
}
