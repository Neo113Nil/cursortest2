package com.vk.catalog2.common.ui.mvp.clip.trends;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.security.SecureRandom;
import xsna.bpn0;
import xsna.c6f;
import xsna.epx;
import xsna.gzs;
import xsna.kbk;
import xsna.lbk;
import xsna.nds;
import xsna.o5a;
import xsna.pds;
import xsna.s3q0;
import xsna.uds;
import xsna.vds;
import xsna.wrp;
import xsna.z1h0;

/* compiled from: ClipTrendsCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class ClipTrendsCatalogFragment extends BaseCatalogFragment implements uds, vds, nds, pds {
    public static final /* synthetic */ int S = 0;
    public final bpn0 Q;
    public gzs<s3q0> R;

    /* compiled from: ClipTrendsCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public ClipTrendsCatalogFragment() {
        super(ClipDiscoverRootVh.class, false);
        this.Q = new bpn0(new d(this, 18));
    }

    @Override // xsna.pds
    public final void J0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        ClipDiscoverRootVh clipDiscoverRootVh = catalogRootViewHolder instanceof ClipDiscoverRootVh ? (ClipDiscoverRootVh) catalogRootViewHolder : null;
        if (clipDiscoverRootVh != null) {
            ClipDiscoverVh clipDiscoverVh = clipDiscoverRootVh.p;
            clipDiscoverVh.l.onPause();
            clipDiscoverVh.f = false;
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        z1h0 parentFragment = getParentFragment();
        c6f c6fVar = parentFragment instanceof c6f ? (c6f) parentFragment : null;
        FragmentActivity kn = kn();
        o5a o5aVar = new o5a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putSerializable("clips_catalog_view_type", ClipDiscoverRootVh.CatalogViewType.TRENDS);
        }
        if (arguments != null) {
            arguments.putString("clips_catalog_toolbar_title", kn().getString(R.string.catalog_clips_trends_screen_title));
        }
        s3q0 s3q0Var = s3q0.a;
        return new ClipDiscoverRootVh(c6fVar, kn, o5aVar, arguments);
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.R = gzsVar;
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.pds
    public final void o1() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        ClipDiscoverRootVh clipDiscoverRootVh = catalogRootViewHolder instanceof ClipDiscoverRootVh ? (ClipDiscoverRootVh) catalogRootViewHolder : null;
        if (clipDiscoverRootVh != null) {
            ClipDiscoverVh clipDiscoverVh = clipDiscoverRootVh.p;
            clipDiscoverVh.l.onResume();
            clipDiscoverVh.f = true;
        }
    }

    @Override // xsna.woo0
    public final int o7() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            bpn0 bpn0Var = this.Q;
            if (((lbk) bpn0Var.getValue()).getContext() == null) {
                ((lbk) bpn0Var.getValue()).a(wrp.a(arguments.getString("ref")), new SecureRandom().nextInt(Integer.MAX_VALUE), (r3 & 4) == 0);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        bpn0 bpn0Var = this.Q;
        kbk context = ((lbk) bpn0Var.getValue()).getContext();
        if (context == null || !context.c) {
            return;
        }
        ((lbk) bpn0Var.getValue()).i();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        gzs<s3q0> gzsVar = this.R;
        if (gzsVar != null) {
            this.R = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        if (epx.f(arguments != null ? arguments.getString("ref") : null, MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_MEDIAPICKER.toString())) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_CATALOG;
        } else {
            super.y(uiTrackingScreen);
        }
    }
}
