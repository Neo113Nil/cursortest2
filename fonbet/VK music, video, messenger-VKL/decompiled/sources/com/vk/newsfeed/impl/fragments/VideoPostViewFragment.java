package com.vk.newsfeed.impl.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b25;
import xsna.b2c0;
import xsna.c9c0;
import xsna.dhr0;
import xsna.e3m;
import xsna.fae;
import xsna.g3f0;
import xsna.gcs0;
import xsna.ics0;
import xsna.ies;
import xsna.lfg;
import xsna.m0t0;
import xsna.mdg;
import xsna.msy;
import xsna.o25;
import xsna.og8;
import xsna.pvh0;
import xsna.u3g0;
import xsna.v5t0;
import xsna.vdg;
import xsna.wrl0;
import xsna.z2f0;

/* compiled from: VideoPostViewFragment.kt */
/* loaded from: classes4.dex */
public final class VideoPostViewFragment extends PostViewFragment implements ies {
    public static final /* synthetic */ int W0 = 0;
    public final v5t0 V0;

    public VideoPostViewFragment() {
        v5t0 v5t0Var = new v5t0(this, this.J);
        b2c0 b2c0Var = new b2c0(v5t0Var.G, this.y0);
        b2c0Var.n = new PostViewFragment.b();
        b2c0Var.m = this.z0;
        this.s0 = b2c0Var;
        m0t0 m0t0Var = new m0t0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, m0t0Var);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new wrl0(this, 19));
        gcs0 gcs0Var = new gcs0(new ics0(a2), new fae(a2), a, this, v5t0Var, null);
        v5t0Var.H = gcs0Var;
        this.t0 = new vdg(gcs0Var, gcs0Var.K, new g3f0((z2f0) null, 3), this.A0);
        this.C0 = gcs0Var;
        this.S = gcs0Var;
        this.V0 = v5t0Var;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void Ae() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.suppressLayout(true);
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final c9c0 Co() {
        return this.V0;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Jo() {
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        lfgVar.o8();
        lfg lfgVar2 = this.C0;
        if (lfgVar2 == null) {
            lfgVar2 = null;
        }
        lfgVar2.p8(R.attr.vk_ui_text_accent);
        lfg lfgVar3 = this.C0;
        if (lfgVar3 == null) {
            lfgVar3 = null;
        }
        dhr0.a.getClass();
        lfgVar3.m8(e3m.f(R.attr.vk_ui_text_secondary, dhr0.s()));
        lfg lfgVar4 = this.C0;
        (lfgVar4 != null ? lfgVar4 : null).l8(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void le() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.suppressLayout(false);
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        v5t0 v5t0Var = this.V0;
        if (v5t0Var != null) {
            v5t0Var.onDestroy();
        }
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        lfgVar.onDestroy();
        mdg mdgVar = this.S;
        if (mdgVar != null) {
            mdgVar.onDestroy();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.d = new pvh0(this, 18);
        }
        if (u3g0Var != null) {
            u3g0Var.E(new og8(this, 10));
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final boolean t2() {
        b25 a = o25.a();
        requireContext();
        a.getClass();
        return true;
    }
}
