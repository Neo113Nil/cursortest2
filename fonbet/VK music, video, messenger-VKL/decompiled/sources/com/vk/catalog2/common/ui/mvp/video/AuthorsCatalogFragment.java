package com.vk.catalog2.common.ui.mvp.video;

import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.catalog2.video.VideoCatalogId;
import xsna.lp0;
import xsna.o5a;

/* compiled from: AuthorsCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class AuthorsCatalogFragment extends BaseCatalogFragment {
    public static final /* synthetic */ int Q = 0;

    /* compiled from: AuthorsCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(AuthorsCatalogFragment.class, null, null);
        }

        public final void B(String str) {
            this.j.putString("hint", str);
        }

        public final void C(String str) {
            this.j.putString("title", str);
        }

        public final void D(VideoCatalogId videoCatalogId) {
            this.j.putSerializable("video_catalog_id", videoCatalogId);
        }
    }

    public AuthorsCatalogFragment() {
        super(AuthorsCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        o5a o5aVar = new o5a(this);
        return new AuthorsCatalogRootVh(getArguments(), kn(), o5aVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        bundle.putByteArray("catalog_view_holder_state", catalogRootViewHolder != null ? catalogRootViewHolder.b0() : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getParentFragmentManager().l0("SHOW_SUBSCRIPTION_SELECTOR", this, new lp0(this, 3));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        CatalogRootViewHolder catalogRootViewHolder;
        super.onViewStateRestored(bundle);
        byte[] byteArray = bundle != null ? bundle.getByteArray("catalog_view_holder_state") : null;
        if (byteArray == null || (catalogRootViewHolder = this.P) == null) {
            return;
        }
        catalogRootViewHolder.Z(byteArray);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        CatalogRootViewHolder catalogRootViewHolder;
        Bundle bundle2;
        super.setArguments(bundle);
        if (bundle == null || (catalogRootViewHolder = this.P) == null || (bundle2 = catalogRootViewHolder.h) == null) {
            return;
        }
        bundle2.putAll(bundle);
    }
}
