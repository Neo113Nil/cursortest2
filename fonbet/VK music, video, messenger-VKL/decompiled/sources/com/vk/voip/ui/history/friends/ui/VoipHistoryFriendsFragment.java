package com.vk.voip.ui.history.friends.ui;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.ui.history.friends.ui.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.aer0;
import xsna.ao50;
import xsna.bwt0;
import xsna.cn70;
import xsna.df90;
import xsna.ef90;
import xsna.eo3;
import xsna.gf2;
import xsna.gm50;
import xsna.hpw0;
import xsna.ipw0;
import xsna.kfw0;
import xsna.km50;
import xsna.kpw0;
import xsna.lxh0;
import xsna.mk50;
import xsna.mvl0;
import xsna.nik0;
import xsna.ots;
import xsna.oz50;
import xsna.p01;
import xsna.p2e;
import xsna.q9f0;
import xsna.vk50;
import xsna.vpw0;
import xsna.wpw0;
import xsna.xn50;
import xsna.ylw;
import xsna.zpw0;

/* compiled from: VoipHistoryFriendsFragment.kt */
/* loaded from: classes7.dex */
public final class VoipHistoryFriendsFragment extends MviImplFragment<kpw0, com.vk.voip.ui.history.friends.ui.b, hpw0> {
    public static final /* synthetic */ int U = 0;
    public final c Q;
    public final ipw0 R;
    public final StickyHeadersLinearLayoutManager<ipw0> S;
    public final b T;

    /* compiled from: VoipHistoryFriendsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VoipHistoryFriendsFragment.kt */
    public static final class c implements zpw0<com.vk.voip.ui.history.friends.ui.a> {
        public c() {
        }

        @Override // xsna.zpw0
        public final void a(com.vk.voip.ui.history.friends.ui.a aVar) {
            boolean z = aVar instanceof a.C2057a;
            VoipHistoryFriendsFragment voipHistoryFriendsFragment = VoipHistoryFriendsFragment.this;
            if (z) {
                xn50.a.c(voipHistoryFriendsFragment, hpw0.a.b);
                return;
            }
            if (aVar instanceof a.f) {
                xn50.a.c(voipHistoryFriendsFragment, hpw0.d.b);
                return;
            }
            if (aVar instanceof a.c) {
                xn50.a.c(voipHistoryFriendsFragment, hpw0.c.b.b);
                return;
            }
            if (aVar instanceof a.d) {
                xn50.a.c(voipHistoryFriendsFragment, hpw0.b.C3015b.b);
                return;
            }
            if (aVar instanceof a.e) {
                xn50.a.c(voipHistoryFriendsFragment, hpw0.b.a.b);
                return;
            }
            if (aVar instanceof a.b.c) {
                xn50.a.c(voipHistoryFriendsFragment, new hpw0.c.C3016c(((a.b.c) aVar).a.b));
            } else if (aVar instanceof a.b.C2058a) {
                xn50.a.c(voipHistoryFriendsFragment, new hpw0.c.a(((a.b.C2058a) aVar).a.b, false));
            } else {
                if (!(aVar instanceof a.b.C2059b)) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(voipHistoryFriendsFragment, new hpw0.c.a(((a.b.C2059b) aVar).a.b, true));
            }
        }
    }

    public VoipHistoryFriendsFragment() {
        c cVar = new c();
        this.Q = cVar;
        this.R = new ipw0(cVar);
        mo2getContext();
        this.S = new StickyHeadersLinearLayoutManager<>(this);
        this.T = new b(cVar);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_calls_external_friends_container);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.voip.ui.history.friends.ui.b bVar = (com.vk.voip.ui.history.friends.ui.b) ao50Var;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) view.findViewById(R.id.voip_history_friends_recycler_swipe_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_history_friends_recycler);
        View findViewById = view.findViewById(R.id.voip_history_friends_loading_state_container);
        View findViewById2 = view.findViewById(R.id.voip_history_friends_error_state_container);
        TextView textView = (TextView) view.findViewById(R.id.voip_history_friends_error_state_title);
        View findViewById3 = view.findViewById(R.id.voip_history_friends_error_state_retry_button);
        TextView textView2 = (TextView) view.findViewById(R.id.voip_history_friends_new_call_by_link_button);
        ((Toolbar) view.findViewById(R.id.call_history_toolbar)).setNavigationOnClickListener(new p01(this, 17));
        customSwipeRefreshLayout.setOnRefreshListener(new q9f0(this, 9));
        recyclerView.setLayoutManager(this.S);
        recyclerView.setAdapter(this.R);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new ef90(this.T));
        int i = 21;
        bwt0.i0(findViewById3, new lxh0(this, i));
        bwt0.i0(textView2, new mvl0(this, i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ylw ylwVar = new ylw(R.drawable.vk_icon_phone_24);
        ylwVar.e = -1.0f;
        ylwVar.d = true;
        ylwVar.f = cn70.b(2);
        ylwVar.c = 3;
        spannableStringBuilder.append((CharSequence) ylwVar.b(requireContext()));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) getString(R.string.voip_history_new_call_by_link_title));
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        textView2.setText(new SpannableString(spannableStringBuilder));
        gm50.a.b(this, bVar.c, new gf2(customSwipeRefreshLayout, findViewById, findViewById2, this, 2));
        gm50.a.b(this, bVar.b, new p2e(findViewById2, customSwipeRefreshLayout, findViewById, this, textView));
        gm50.a.b(this, bVar.a, new eo3(findViewById, customSwipeRefreshLayout, findViewById2, 15));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        kpw0 kpw0Var = (kpw0) vk50Var;
        kpw0Var.g.a(new kfw0(this, 3), this);
        kpw0Var.h.a(new aer0(this, 13), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            xn50.a.c(this, hpw0.a.b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            xn50.a.c(this, hpw0.a.b);
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new kpw0(new vpw0(), new wpw0(new ots()));
    }

    /* compiled from: VoipHistoryFriendsFragment.kt */
    public static final class b implements df90 {
        public final c b;

        public b(c cVar) {
            this.b = cVar;
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            if (i - 5 > i3 || i3 > i) {
                return;
            }
            this.b.a(a.d.a);
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }
}
