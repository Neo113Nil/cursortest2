package com.vk.catalog2.common.ui.mvp.clip;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.security.SecureRandom;
import xsna.a8;
import xsna.asu0;
import xsna.bpn0;
import xsna.c6f;
import xsna.d9f;
import xsna.epx;
import xsna.eu1;
import xsna.gzs;
import xsna.hg1;
import xsna.kbk;
import xsna.lbk;
import xsna.nds;
import xsna.o5a;
import xsna.pds;
import xsna.q;
import xsna.s3q0;
import xsna.uds;
import xsna.vds;
import xsna.wrp;
import xsna.z1h0;

/* compiled from: ClipMusicTemplatesCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class ClipMusicTemplatesCatalogFragment extends BaseCatalogFragment implements uds, vds, nds, pds {
    public static final /* synthetic */ int U = 0;
    public final bpn0 Q;
    public final bpn0 R;
    public c S;
    public gzs<s3q0> T;

    /* compiled from: ClipMusicTemplatesCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a(Context context, boolean z) {
            super(ClipMusicTemplatesCatalogFragment.class, null, null);
            this.j.putInt("background_color", context.getColor(R.color.vk_black));
            this.j.putBoolean("participate_in_templates_navigation_flow", z);
        }
    }

    public ClipMusicTemplatesCatalogFragment() {
        super(ClipDiscoverRootVh.class, false);
        this.Q = new bpn0(new eu1(this, 19));
        this.R = new bpn0(new q(this, 18));
    }

    @Override // xsna.pds
    public final void J0() {
        go(false);
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
            arguments.putSerializable("clips_catalog_view_type", ClipDiscoverRootVh.CatalogViewType.MUSIC_TEMPLATES);
        }
        if (arguments != null) {
            arguments.putString("clips_catalog_toolbar_title", kn().getString(R.string.clips_music_templates));
        }
        s3q0 s3q0Var = s3q0.a;
        return new ClipDiscoverRootVh(c6fVar, kn, o5aVar, arguments);
    }

    public final void go(boolean z) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        ClipDiscoverRootVh clipDiscoverRootVh = catalogRootViewHolder instanceof ClipDiscoverRootVh ? (ClipDiscoverRootVh) catalogRootViewHolder : null;
        if (clipDiscoverRootVh != null) {
            ClipDiscoverVh clipDiscoverVh = clipDiscoverRootVh.p;
            ViewPagerVh viewPagerVh = clipDiscoverVh.l;
            if (z) {
                viewPagerVh.onResume();
            } else {
                viewPagerVh.onPause();
            }
            clipDiscoverVh.f = z;
        }
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.T = gzsVar;
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.pds
    public final void o1() {
        go(true);
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
            bpn0 bpn0Var = this.R;
            if (((lbk) bpn0Var.getValue()).getContext() == null) {
                ((lbk) bpn0Var.getValue()).a(wrp.a(arguments.getString("ref")), new SecureRandom().nextInt(Integer.MAX_VALUE), (r3 & 4) == 0);
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || !arguments2.getBoolean("participate_in_templates_navigation_flow")) {
            return;
        }
        this.S = hg1.h(((d9f) this.Q.getValue()).d(TemplatesFlowScreen.CATALOG).a0(asu0.a.d()), new a8(this, 25));
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        bpn0 bpn0Var = this.R;
        kbk context = ((lbk) bpn0Var.getValue()).getContext();
        if (context != null && context.c) {
            ((lbk) bpn0Var.getValue()).i();
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("participate_in_templates_navigation_flow")) {
            ((d9f) this.Q.getValue()).a(TemplatesFlowScreen.CATALOG);
        }
        hg1.f(this.S);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("participate_in_templates_navigation_flow")) {
            return;
        }
        go(false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        gzs<s3q0> gzsVar = this.T;
        if (gzsVar != null) {
            this.T = null;
            gzsVar.invoke();
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("participate_in_templates_navigation_flow")) {
            return;
        }
        go(true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        if (epx.f(arguments != null ? arguments.getString("ref") : null, MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_MEDIAPICKER.toString())) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIAPICKER_TEMPLATES;
        } else {
            super.y(uiTrackingScreen);
        }
    }
}
