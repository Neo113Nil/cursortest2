package com.vk.catalog.sandbox;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import xsna.o5a;

/* compiled from: SandboxCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class SandboxCatalogFragment extends BaseCatalogFragment {

    /* compiled from: SandboxCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public SandboxCatalogFragment() {
        super(SandboxCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new SandboxCatalogRootVh(kn(), new o5a(this), getArguments());
    }
}
