package com.vk.catalog2.common.ui.mvp.clip;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverRootVh;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import xsna.c6f;
import xsna.d9e;
import xsna.o5a;
import xsna.z1h0;

/* compiled from: ClipDiscoverFragment.kt */
/* loaded from: classes16.dex */
public final class ClipDiscoverFragment extends BaseCatalogFragment implements d9e {

    /* compiled from: ClipDiscoverFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public ClipDiscoverFragment() {
        super(ClipDiscoverRootVh.class, false);
    }

    @Override // xsna.d9e
    public final ClipFeedTab Ka() {
        return ClipFeedTab.Discover.b;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        z1h0 parentFragment = getParentFragment();
        return new ClipDiscoverRootVh(parentFragment instanceof c6f ? (c6f) parentFragment : null, kn(), new o5a(this), getArguments());
    }

    @Override // xsna.d9e
    public final boolean onBack() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        requireArguments().getString("ref");
        super.onCreate(bundle);
    }
}
