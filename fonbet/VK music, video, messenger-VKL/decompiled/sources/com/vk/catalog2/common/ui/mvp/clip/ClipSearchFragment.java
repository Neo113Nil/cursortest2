package com.vk.catalog2.common.ui.mvp.clip;

import android.content.res.ColorStateList;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.libvideo.autoplay.e;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.anj;
import xsna.fnj;
import xsna.iah0;
import xsna.jes;
import xsna.lyd;
import xsna.nds;
import xsna.o5a;
import xsna.qds;
import xsna.qhh0;
import xsna.tds;
import xsna.uds;
import xsna.vds;
import xsna.xm1;
import xsna.z720;

/* compiled from: ClipSearchFragment.kt */
/* loaded from: classes16.dex */
public final class ClipSearchFragment extends BaseCatalogFragment implements tds, vds, qds, uds, jes, nds, qhh0 {
    public static final /* synthetic */ int Q = 0;

    /* compiled from: ClipSearchFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(ClipSearchFragment.class, null, null);
        }
    }

    public ClipSearchFragment() {
        super(ClipSearchRootVh.class, false);
    }

    @Override // xsna.tds
    public final ColorStateList Oc() {
        return anj.b(R.color.color_list_bottom_menu_icons, requireContext());
    }

    @Override // xsna.vds
    public final int Q0() {
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        return fnj.d(kn) ? -1 : 1;
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (((ClipSearchRootVh) this.P).j0()) {
            return true;
        }
        return super.a0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        FragmentActivity kn = kn();
        o5a o5aVar = new o5a(this);
        Bundle arguments = getArguments();
        Bundle arguments2 = getArguments();
        return new ClipSearchRootVh(kn, o5aVar, arguments, arguments2 != null ? arguments2.getBoolean("ClipSearchFragment.FORCE_DISCOVER_IN_SEARCH_KEY") : false, new xm1(this, 20));
    }

    @Override // xsna.tds
    public final z720.a gf() {
        return new z720.a(R.color.vk_black, R.color.color_list_left_menu_text, R.color.color_list_left_menu_icons, R.color.vk_black, R.color.vk_black, R.color.vk_white, R.color.vk_white);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.woo0
    public final int o7() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        ClipSearchRootVh clipSearchRootVh = catalogRootViewHolder instanceof ClipSearchRootVh ? (ClipSearchRootVh) catalogRootViewHolder : null;
        if (clipSearchRootVh != null) {
            ClipDiscoverVh clipDiscoverVh = clipSearchRootVh.B;
            clipDiscoverVh.l.onPause();
            clipDiscoverVh.f = false;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (lyd.g().h()) {
            e eVar = e.a;
            e.e(true);
        }
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        ClipSearchRootVh clipSearchRootVh = catalogRootViewHolder instanceof ClipSearchRootVh ? (ClipSearchRootVh) catalogRootViewHolder : null;
        if (clipSearchRootVh != null) {
            ClipDiscoverVh clipDiscoverVh = clipSearchRootVh.B;
            clipDiscoverVh.l.onResume();
            clipDiscoverVh.f = true;
        }
    }

    @Override // xsna.tds
    public final int qc() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        ((ClipSearchRootVh) this.P).s();
        return true;
    }
}
