package com.vk.catalog2.common.ui.mvp.group;

import android.os.Bundle;
import android.util.TypedValue;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionCatalogRootVh;
import xsna.krv0;
import xsna.nds;
import xsna.o5a;

/* compiled from: GroupsCollectionCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class GroupsCollectionCatalogFragment extends BaseCatalogFragment implements nds {

    /* compiled from: GroupsCollectionCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a(String str) {
            super(GroupsCollectionCatalogFragment.class, null, null);
            this.j.putString("collection_id", str);
        }
    }

    public GroupsCollectionCatalogFragment() {
        super(GroupsCollectionCatalogRootVh.class, false);
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GroupsCollectionCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }
}
