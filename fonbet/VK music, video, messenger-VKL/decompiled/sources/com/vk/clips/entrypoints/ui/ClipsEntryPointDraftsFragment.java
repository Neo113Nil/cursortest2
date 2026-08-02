package com.vk.clips.entrypoints.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.core.fragments.BaseFragment;
import com.vkontakte.android.R;
import java.security.SecureRandom;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.h9;
import xsna.ido;
import xsna.j5;
import xsna.jgu;
import xsna.kfu;
import xsna.l1e;
import xsna.lpj;
import xsna.lz0;
import xsna.m1e;
import xsna.msy;
import xsna.oz50;
import xsna.s55;
import xsna.sz;
import xsna.wco;

/* compiled from: ClipsEntryPointDraftsFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsEntryPointDraftsFragment extends BaseFragment {
    public static final /* synthetic */ int Y = 0;
    public RecyclerView S;
    public int T = -1;
    public List<ido> U = EmptyList.b;
    public final Object V;
    public final Object W;
    public final bpn0 X;

    /* compiled from: ClipsEntryPointDraftsFragment.kt */
    public static final class a extends oz50 {
    }

    public ClipsEntryPointDraftsFragment() {
        com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar = new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.V = msy.a(lazyThreadSafetyMode, aVar);
        this.W = msy.a(lazyThreadSafetyMode, new h9(this, 22));
        this.X = new bpn0(new com.vk.movika.sdk.base.presenter.b(this, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsEntryPointsComponentImpl io() {
        return (ClipsEntryPointsComponentImpl) this.V.getValue();
    }

    public final lpj jo() {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        return new lpj(mo2getContext, dhr0.u().c);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.T = arguments.getInt("entry_point_drafts_session_id", new SecureRandom().nextInt(Integer.MAX_VALUE));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.clips_entry_point_drafts_fragment, viewGroup, false);
        inflate.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, jo()));
        this.S = (RecyclerView) inflate.findViewById(R.id.clips_drafts_recycler_view);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1e Df = io().Df();
        lz0 lz0Var = new lz0(this, 19);
        Df.getClass();
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        l1e l1eVar = new l1e(lz0Var, 0);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(l1eVar);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m1e Df = io().Df();
        j5 j5Var = new j5(this, 23);
        Df.getClass();
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        l1e l1eVar = new l1e(j5Var, 0);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(l1eVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        wco wcoVar = new wco(jo(), new s55(1, this, ClipsEntryPointDraftsFragment.class, "onDraftClicked", "onDraftClicked(Lcom/vk/clips/entrypoints/data/DraftItem;)V", 0, 2));
        RecyclerView recyclerView = this.S;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(wcoVar);
        RecyclerView recyclerView2 = this.S;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new jgu(3, cn70.b(2), true, 0));
        RecyclerView recyclerView3 = this.S;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new kfu(10.0f, 3, 0, jo()));
        RecyclerView recyclerView4 = this.S;
        RecyclerView recyclerView5 = recyclerView4 != null ? recyclerView4 : null;
        jo();
        recyclerView5.setLayoutManager(new GridLayoutManager(3, 1));
        m1e Df = io().Df();
        sz szVar = new sz(this, 20);
        Df.getClass();
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        l1e l1eVar = new l1e(szVar, 0);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(l1eVar);
    }
}
