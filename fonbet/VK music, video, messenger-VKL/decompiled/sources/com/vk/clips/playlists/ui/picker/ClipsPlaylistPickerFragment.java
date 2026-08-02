package com.vk.clips.playlists.ui.picker;

import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.movika.sdk.base.ui.t;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bp7;
import xsna.bwt0;
import xsna.d05;
import xsna.dhr0;
import xsna.due;
import xsna.e3m;
import xsna.f4m;
import xsna.gzs;
import xsna.he3;
import xsna.igu;
import xsna.izs;
import xsna.jd;
import xsna.jp5;
import xsna.km50;
import xsna.kue;
import xsna.l00;
import xsna.l7s;
import xsna.mk50;
import xsna.msy;
import xsna.nds;
import xsna.px0;
import xsna.s1;
import xsna.s3q0;
import xsna.sx0;
import xsna.tlo0;
import xsna.tqe;
import xsna.uds;
import xsna.upe;
import xsna.v6;
import xsna.vds;
import xsna.vk50;
import xsna.vpe;
import xsna.we0;
import xsna.we90;
import xsna.xn50;
import xsna.yce;

/* compiled from: ClipsPlaylistPickerFragment.kt */
/* loaded from: classes.dex */
public final class ClipsPlaylistPickerFragment extends MviImplFragment<com.vk.clips.playlists.ui.picker.b, f, com.vk.clips.playlists.ui.picker.a> implements nds, uds, vds {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    /* compiled from: ClipsPlaylistPickerFragment.kt */
    /* loaded from: classes16.dex */
    public static final class a {
        public final ConstraintLayout a;
        public final VkTopBar b;
        public final RecyclerView c;
        public final VkButton d;
        public final VkSpinner e;
        public final VkPlaceholder f;

        public a(View view) {
            this.a = (ConstraintLayout) view.findViewById(R.id.playlists_picker_root_layout);
            this.b = (VkTopBar) view.findViewById(R.id.playlists_picker_top_bar);
            this.c = (RecyclerView) view.findViewById(R.id.playlists_picker_recycler);
            this.d = (VkButton) view.findViewById(R.id.playlists_picker_action_button);
            this.e = (VkSpinner) view.findViewById(R.id.playlists_picker_spinner);
            this.f = (VkPlaceholder) view.findViewById(R.id.playlists_picker_error_view);
        }

        public final VkButton a() {
            return this.d;
        }

        public final VkPlaceholder b() {
            return this.f;
        }

        public final RecyclerView c() {
            return this.c;
        }

        public final ConstraintLayout d() {
            return this.a;
        }

        public final VkTopBar e() {
            return this.b;
        }
    }

    /* compiled from: ClipsPlaylistPickerFragment.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<com.vk.clips.playlists.ui.picker.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.clips.playlists.ui.picker.a aVar) {
            ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) this.receiver;
            clipsPlaylistPickerFragment.getClass();
            xn50.a.c(clipsPlaylistPickerFragment, aVar);
            return s3q0.a;
        }
    }

    public ClipsPlaylistPickerFragment() {
        px0 px0Var = new px0(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, px0Var);
        this.R = msy.a(lazyThreadSafetyMode, new t(this, 25));
        this.S = msy.a(lazyThreadSafetyMode, new sx0(this, 18));
        this.T = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 20));
        this.U = msy.a(lazyThreadSafetyMode, new v6(this, 18));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_playlists_picker_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        f fVar = (f) ao50Var;
        a aVar = new a(view);
        RecyclerView c = aVar.c();
        requireContext();
        c.setLayoutManager(new GridLayoutManager(3));
        c.setAdapter((upe) this.U.getValue());
        c.addOnScrollListener(new we90(new yce(this, 2)));
        igu.a aVar2 = new igu.a();
        aVar2.c();
        aVar2.b(e3m.a(R.dimen.clips_playlists_picker_grid_spacing, requireContext()));
        c.addItemDecoration(aVar2.a());
        VkPlaceholder b2 = aVar.b();
        tlo0.Companion.getClass();
        b2.setMiddle(VkPlaceholder.b.a.a(tlo0.a.b(R.string.vk_common_network_error)));
        b2.setBottom(VkPlaceholder.a.c.a(new VkPlaceholder.a.C0857a((tlo0) tlo0.a.b(R.string.vk_common_retry), (gzs) new jd(this, 29), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE)));
        VkTopBar e = aVar.e();
        ClipsPlaylistPickerParams clipsPlaylistPickerParams = (ClipsPlaylistPickerParams) this.S.getValue();
        tlo0 d = clipsPlaylistPickerParams instanceof ClipsPlaylistPickerParams.RemoveClips ? tlo0.a.d(((ClipsPlaylistPickerParams.RemoveClips) clipsPlaylistPickerParams).Z0().d()) : tlo0.a.b(R.string.clips_playlist_picker_title_all_clips);
        Object[] objArr = 0 == true ? 1 : 0;
        e.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(d, null, null, null, null, 30), 0 == true ? 1 : 0, objArr, null, 14));
        xn50.a.b(this, fVar.c(), new d05(9, aVar, this));
        xn50.a.b(this, fVar.a(), new bp7(6, aVar, this));
        xn50.a.b(this, fVar.b(), new jp5(6, aVar, this));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.clips.playlists.ui.picker.b bVar = (com.vk.clips.playlists.ui.picker.b) vk50Var;
        bVar.U().a(new com.vk.movika.sdk.base.logic.interactor.d(this, 29), this);
        bVar.V().a(new l00(this, 22), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return !dhr0.a.c(requireContext());
    }

    public final void fo(f.d dVar, a aVar) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(300L);
        autoTransition.setOrdering(0);
        TransitionManager.endTransitions(aVar.d());
        TransitionManager.beginDelayedTransition(aVar.d(), autoTransition);
        if (!(dVar instanceof f.d.b)) {
            if (!(dVar instanceof f.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            VkTopBar e = aVar.e();
            tlo0.Companion.getClass();
            e.setBack(new VkTopBar.b(new s1(this, 27), tlo0.a.b(R.string.vk_ui_accessibility_close), null, null, null, 28));
            f4m.j(aVar.a());
            return;
        }
        VkTopBar e2 = aVar.e();
        tlo0.Companion.getClass();
        e2.setBefore(new VkTopBar.c.d(tlo0.a.b(R.string.vk_ui_accessibility_close), new we0(this, 23), null, null, 12));
        f.d.b.a a2 = ((f.d.b) dVar).a();
        aVar.a().setVisibility(0);
        bwt0.i0(aVar.a(), new he3(12, this, a2));
        aVar.a().setEnabled(a2.c());
        aVar.a().setText(((tlo0.f) a2.b()).a(requireContext()));
        aVar.a().setCount(a2.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        if (!((Boolean) this.T.getValue()).booleanValue()) {
            return super.mo2getContext();
        }
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return null;
        }
        dhr0.a.getClass();
        return new l7s(mo2getContext, dhr0.u().c);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background_content, requireContext());
    }

    @Override // xsna.woo0
    public final int o7() {
        if (dhr0.a.c(requireContext())) {
            Context requireContext = requireContext();
            e3m.a aVar = e3m.a;
            return requireContext.getColor(R.color.vk_black);
        }
        Context requireContext2 = requireContext();
        e3m.a aVar2 = e3m.a;
        return requireContext2.getColor(R.color.vk_white);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Context requireContext = requireContext();
        ?? r9 = this.S;
        ClipsPlaylistPickerParams clipsPlaylistPickerParams = (ClipsPlaylistPickerParams) r9.getValue();
        ?? r10 = this.Q;
        kue Ef = ((ClipsPlaylistsComponentImpl) r10.getValue()).Ef();
        due b2 = ((ClipsPlaylistsComponentImpl) r10.getValue()).b();
        ((ClipsPlaylistsComponentImpl) r10.getValue()).Ff();
        return new com.vk.clips.playlists.ui.picker.b(requireContext, clipsPlaylistPickerParams, Ef, b2, ((ClipsPlaylistsComponentImpl) r10.getValue()).Df(), new d((ClipsPlaylistPickerParams) r9.getValue(), new vpe(), new tqe()));
    }
}
