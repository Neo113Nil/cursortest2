package com.vk.newsfeed.impl.posting.settings.mvi;

import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4504q2;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.a;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import xsna.ao50;
import xsna.b990;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bzw;
import xsna.c950;
import xsna.ckc0;
import xsna.ekc0;
import xsna.epx;
import xsna.es00;
import xsna.fhc0;
import xsna.fkc0;
import xsna.fnj;
import xsna.gm50;
import xsna.gz80;
import xsna.iah0;
import xsna.ies;
import xsna.ikv0;
import xsna.jaa0;
import xsna.jsj0;
import xsna.kk1;
import xsna.km50;
import xsna.krv0;
import xsna.lyk;
import xsna.mk50;
import xsna.nds;
import xsna.p90;
import xsna.ptj;
import xsna.qz40;
import xsna.sdc0;
import xsna.tlc0;
import xsna.vk50;
import xsna.w8i;
import xsna.wlc0;
import xsna.xn50;
import xsna.ya;
import xsna.zlc0;

/* compiled from: PostingSettingsFragmentMvi.kt */
/* loaded from: classes4.dex */
public final class PostingSettingsFragmentMvi extends MviImplFragment<com.vk.newsfeed.impl.posting.settings.mvi.b, h, com.vk.newsfeed.impl.posting.settings.mvi.a> implements w8i, nds, ies {
    public static final /* synthetic */ int Y = 0;
    public RecyclerView Q;
    public ckc0 R;
    public ptj S;
    public final bpn0 T = new bpn0(new kk1(23));
    public final bpn0 U = new bpn0(new c950(this, 19));
    public final bpn0 V = new bpn0(new jaa0(this, 6));
    public final bpn0 W = new bpn0(new b990(this, 7));
    public final tlc0 X = new tlc0(new a(), new b());

    /* compiled from: PostingSettingsFragmentMvi.kt */
    public static final class a implements fkc0 {
        public a() {
        }

        @Override // xsna.fkc0
        public final void d() {
            a.i.c cVar = a.i.c.b;
            PostingSettingsFragmentMvi postingSettingsFragmentMvi = PostingSettingsFragmentMvi.this;
            postingSettingsFragmentMvi.getClass();
            xn50.a.c(postingSettingsFragmentMvi, cVar);
        }

        @Override // xsna.fkc0
        public final void e() {
            a.i.d dVar = a.i.d.b;
            PostingSettingsFragmentMvi postingSettingsFragmentMvi = PostingSettingsFragmentMvi.this;
            postingSettingsFragmentMvi.getClass();
            xn50.a.c(postingSettingsFragmentMvi, dVar);
        }
    }

    /* compiled from: PostingSettingsFragmentMvi.kt */
    public static final class b implements sdc0 {
        public b() {
        }

        @Override // xsna.sdc0
        public final void q0() {
            a.k.d dVar = a.k.d.b;
            PostingSettingsFragmentMvi postingSettingsFragmentMvi = PostingSettingsFragmentMvi.this;
            postingSettingsFragmentMvi.getClass();
            xn50.a.c(postingSettingsFragmentMvi, dVar);
        }

        @Override // xsna.sdc0
        public final void y0() {
            a.k.c cVar = a.k.c.b;
            PostingSettingsFragmentMvi postingSettingsFragmentMvi = PostingSettingsFragmentMvi.this;
            postingSettingsFragmentMvi.getClass();
            xn50.a.c(postingSettingsFragmentMvi, cVar);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_posting_settings_new);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        h hVar = (h) ao50Var;
        bwt0.i0(view.findViewById(R.id.posting_settings_close_button), new bzw(this, 24));
        this.Q = (RecyclerView) view.findViewById(R.id.recycler);
        jsj0 jsj0Var = new jsj0(new c(this));
        RecyclerView recyclerView = this.Q;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(jsj0Var);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.addItemDecoration(new wlc0());
        gm50.a.b(this, hVar.a, new ya(27, this, jsj0Var));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        this.S = new ptj(new d(this));
        ekc0 a2 = ((lyk) this.U.getValue()).a(R.string.timer, requireContext());
        this.R = a2;
        a2.c = new es00(this, 27);
        ((com.vk.newsfeed.impl.posting.settings.mvi.b) vk50Var).h.a(new qz40(this, 12), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.c.b);
        return true;
    }

    public final void fo(int i, int i2, int i3) {
        Context requireContext = requireContext();
        ikv0.a aVar = new ikv0.a(requireContext);
        aVar.t = new ikv0.c.C3058c(i2, Integer.valueOf(i3), (Size) null, 12);
        aVar.u = new ikv0.d(requireContext.getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.e = 2000L;
        aVar.n();
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xn50.a.c(this, a.h.C1387a.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        xn50.a.c(this, a.h.b.b);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || !gz80.a(23)) {
            return;
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(activity)) {
            return;
        }
        p90.b(activity, krv0.l(R.attr.vk_ui_background_modal), false);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint;
        Object obj;
        Bundle arguments = getArguments();
        Bundle bundle2 = arguments == null ? new Bundle() : arguments;
        boolean z = bundle2.getBoolean("openFromGroup");
        boolean z2 = bundle2.getBoolean("groupIsPublic");
        long j = bundle2.getLong("groupId");
        boolean z3 = bundle2.getBoolean("postIsEditing");
        boolean z4 = bundle2.getBoolean("postponedPostIsEditing");
        boolean z5 = bundle2.getBoolean("authorIsUser");
        boolean z6 = bundle2.getBoolean("isSuggestedPost");
        boolean z7 = bundle2.getBoolean("isAdmin");
        boolean z8 = bundle2.getBoolean("copyrightAllowed");
        PostingOrd postingOrd = (PostingOrd) bundle2.getParcelable("token_advertising_ord");
        PostingSettingsState.b bVar = new PostingSettingsState.b(bundle2.getBoolean("keyCommentsClosingAvailable", true) ? PostingSettingsState.CommentsGlobalState.OPEN : PostingSettingsState.CommentsGlobalState.CLOSED_BY_WALL_SETTINGS, !bundle2.getBoolean("commentsClosing"), !bundle2.getBoolean("keyCommentsClosingEnabled"));
        if (arguments == null || !arguments.containsKey("creationEntryPoint")) {
            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.Other;
        } else {
            String string = arguments.getString("creationEntryPoint");
            if (string != null) {
                PostingMetricsCreationEntryPoint.Companion.getClass();
                Iterator<E> it = PostingMetricsCreationEntryPoint.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((PostingMetricsCreationEntryPoint) obj).name(), string)) {
                        break;
                    }
                }
                postingMetricsCreationEntryPoint = (PostingMetricsCreationEntryPoint) obj;
                if (postingMetricsCreationEntryPoint == null) {
                    postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.Other;
                }
            } else {
                postingMetricsCreationEntryPoint = null;
            }
            if (postingMetricsCreationEntryPoint == null) {
                postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.Other;
            }
        }
        return new com.vk.newsfeed.impl.posting.settings.mvi.b(new f(new PostingSettingsState(z5, z6, z7, z, z8, z2, j, bVar, new PostingSettingsState.d(!bundle2.getBoolean(C4504q2.x)), new PostingSettingsState.f(bundle2.getLong("postponeDate"), bundle2.getBoolean("postponeSelectorVisible", true), z4), new PostingSettingsState.e(bundle2.getString("copyrightLink")), z3, new PostingSettingsState.c(bundle2.getBoolean("needHideName")), new PostingSettingsState.a(postingOrd != null ? postingOrd.c : null, postingOrd != null ? Boolean.valueOf(postingOrd.b) : null, postingOrd != null ? postingOrd.d : null), postingMetricsCreationEntryPoint)), (zlc0) this.V.getValue(), (fhc0.e) this.W.getValue());
    }
}
