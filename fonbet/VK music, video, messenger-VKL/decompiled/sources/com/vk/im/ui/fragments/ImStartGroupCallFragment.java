package com.vk.im.ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.a;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.a1w;
import xsna.amt;
import xsna.awt0;
import xsna.bj6;
import xsna.cau0;
import xsna.d02;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.eph;
import xsna.fnj;
import xsna.g2v;
import xsna.gv5;
import xsna.iah0;
import xsna.ies;
import xsna.izi0;
import xsna.jbs;
import xsna.jjc;
import xsna.l6u;
import xsna.mxv;
import xsna.o3p0;
import xsna.oz50;
import xsna.q1w;
import xsna.q2a0;
import xsna.qhh0;
import xsna.qtd0;
import xsna.rl3;
import xsna.vej;
import xsna.vrb;
import xsna.w8i;
import xsna.wej;
import xsna.yb;

/* compiled from: ImStartGroupCallFragment.kt */
/* loaded from: classes2.dex */
public final class ImStartGroupCallFragment extends ImFragment implements qhh0, ies, gv5, w8i {
    public static final /* synthetic */ int f0 = 0;
    public Toolbar P;
    public o3p0 Q;
    public View R;
    public View S;
    public ViewGroup T;
    public TextView U;
    public ViewGroup V;
    public com.vk.im.ui.components.contacts.a W;
    public Set<Long> X;
    public Peer Y;
    public long Z = -1;
    public boolean a0 = true;
    public VoipCallSource b0;
    public final b c0;
    public final vrb d0;
    public io.reactivex.rxjava3.disposables.c e0;

    /* compiled from: ImStartGroupCallFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ImStartGroupCallFragment.kt */
    public final class c implements vej {
        public c() {
        }

        @Override // xsna.vej
        public final String a(int i, String... strArr) {
            return ImStartGroupCallFragment.this.getString(R.string.vkim_group_call_users_list_title);
        }
    }

    public ImStartGroupCallFragment() {
        Serializer.c<VoipCallSource> cVar = VoipCallSource.CREATOR;
        this.b0 = VoipCallSource.a.a();
        this.c0 = new b();
        a1w a1wVar = q1w.a;
        this.d0 = new vrb(a1wVar == null ? null : a1wVar);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    public static final void eo(ImStartGroupCallFragment imStartGroupCallFragment) {
        TextView textView = imStartGroupCallFragment.U;
        if (textView == null) {
            textView = null;
        }
        com.vk.im.ui.components.contacts.a aVar = imStartGroupCallFragment.W;
        if (aVar == null) {
            aVar = null;
        }
        int size = aVar.b1().r.size();
        Context context = e43.a;
        textView.setText(Html.fromHtml((context != null ? context : null).getResources().getQuantityString(R.plurals.vkim_selected_call_users_counter, size, Integer.valueOf(size)), 0));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        ViewGroup viewGroup = this.V;
        if (viewGroup == null) {
            viewGroup = null;
        }
        int measuredHeight = viewGroup.getMeasuredHeight();
        ViewGroup viewGroup2 = this.T;
        awt0.x(viewGroup2 == null ? null : viewGroup2, 0, 0, 0, measuredHeight, 7);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        o3p0 o3p0Var = this.Q;
        if (o3p0Var == null) {
            o3p0Var = null;
        }
        if (o3p0Var.a()) {
            return true;
        }
        com.vk.im.ui.components.contacts.a aVar = this.W;
        if (aVar == null) {
            aVar = null;
        }
        if (((Collection) aVar.b1().r).isEmpty()) {
            return false;
        }
        com.vk.im.ui.components.contacts.a aVar2 = this.W;
        (aVar2 != null ? aVar2 : null).Z0();
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.recyclerview.widget.RecyclerView$n, xsna.vaj] */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        Set<Long> set;
        long[] longArray;
        super.onAttach(activity);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        this.Y = a1wVar.q();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (longArray = arguments2.getLongArray("ids")) == null || (set = rl3.x0(longArray)) == null) {
            set = EmptySet.b;
        }
        this.X = set;
        Peer peer = (Peer) arguments.getParcelable("dialog_id");
        this.Z = peer != null ? peer.b : 0L;
        this.a0 = arguments.getBoolean("allow_empty");
        VoipCallSource voipCallSource = (VoipCallSource) arguments.getParcelable("source");
        if (voipCallSource == null) {
            voipCallSource = this.b0;
        }
        this.b0 = voipCallSource;
        a1w a1wVar2 = q1w.a;
        a1w a1wVar3 = a1wVar2 != null ? a1wVar2 : null;
        mxv c2 = g2v.c();
        a1w a1wVar4 = q1w.a;
        if (a1wVar4 == null) {
            a1wVar4 = null;
        }
        cau0 cau0Var = a1wVar4.r().h;
        jbs jbsVar = new jbs(this);
        b bVar = this.c0;
        Set y0 = rl3.y0(new ContactsViews[]{ContactsViews.USERS, ContactsViews.HINTS, ContactsViews.EMPTY, ContactsViews.SELECTION_PREVIEW});
        l6u l6uVar = new l6u(this, 5);
        long j = this.Z;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b2 = Peer.a.b(j);
        String string = getString(R.string.vkim_select_users_to_group_call_hint);
        SortOrder sortOrder = SortOrder.BY_NAME;
        Set<Long> set2 = this.X;
        if (set2 == null) {
            set2 = null;
        }
        Peer peer2 = this.Y;
        if (peer2 == null) {
            peer2 = null;
        }
        com.vk.im.ui.components.contacts.a aVar = new com.vk.im.ui.components.contacts.a(a1wVar3, c2, cau0Var, jbsVar, bVar, y0, false, false, l6uVar, sortOrder, 3, true, 128, string, null, null, false, false, false, izi0.k(set2, Long.valueOf(peer2.b)), b2, null, null, false, false, false, 2141134848);
        this.W = aVar;
        c cVar2 = new c();
        aVar.a0 = cVar2;
        if (aVar.Z.c()) {
            wej c1 = aVar.c1();
            c1.j.e(cVar2);
            RecyclerView recyclerView = c1.k;
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }
        com.vk.im.ui.components.contacts.a aVar2 = this.W;
        this.O.add(aVar2 != null ? aVar2 : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_invite_to_group_call_fragment, viewGroup, false);
        this.R = viewGroup2.findViewById(R.id.vkim_btn_audio_call);
        this.S = viewGroup2.findViewById(R.id.vkim_btn_video_call);
        this.P = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        this.U = (TextView) viewGroup2.findViewById(R.id.vkim_selected_users_counter);
        this.V = (ViewGroup) viewGroup2.findViewById(R.id.vkim_bottom_container);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.vkim_list_container);
        this.T = viewGroup3;
        com.vk.im.ui.components.contacts.a aVar = this.W;
        if (aVar == null) {
            aVar = null;
        }
        viewGroup3.addView(aVar.F0(viewGroup2, bundle));
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.e0;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = this.P;
        if (toolbar == null) {
            toolbar = null;
        }
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        toolbar.setNavigationIcon(fnj.d(kn) ? null : e3m.e(R.attr.im_ic_back_toolbar, requireContext()));
        Toolbar toolbar2 = this.P;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setTitle(getString(R.string.vkim_call_to_group_chat));
        Toolbar toolbar3 = this.P;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.setNavigationOnClickListener(new yb(this, 6));
        o3p0 o3p0Var = new o3p0(view);
        this.Q = o3p0Var;
        this.N.b(d02.y(o3p0Var.b, 200L, 2).subscribe(new amt(new eph(this, 27), 2)));
        bj6 bj6Var = new bj6(this, 3);
        View view2 = this.R;
        if (view2 == null) {
            view2 = null;
        }
        jjc.f(bj6Var, view2);
        View view3 = this.S;
        jjc.f(bj6Var, view3 != null ? view3 : null);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        com.vk.im.ui.components.contacts.a aVar = this.W;
        if (aVar == null) {
            aVar = null;
        }
        aVar.j1();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("visitSource") : null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = serializable instanceof MobileOfficialAppsCoreNavStat$EventScreen ? (MobileOfficialAppsCoreNavStat$EventScreen) serializable : null;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    /* compiled from: ImStartGroupCallFragment.kt */
    public final class b implements a.InterfaceC1144a {

        /* compiled from: ImStartGroupCallFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UserSex.values().length];
                try {
                    iArr[UserSex.FEMALE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void c() {
            ImStartGroupCallFragment.eo(ImStartGroupCallFragment.this);
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void d(boolean z) {
            throw new IllegalStateException("Unexpected call to create chat! ImCreateConversationFragment should be used");
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final boolean h(qtd0 qtd0Var) {
            return qtd0Var.ib();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void i(qtd0 qtd0Var) {
            int i = a.$EnumSwitchMapping$0[qtd0Var.B2().ordinal()] == 1 ? R.string.vkim_call_forbidden_female : R.string.vkim_call_forbidden_male;
            ImStartGroupCallFragment imStartGroupCallFragment = ImStartGroupCallFragment.this;
            enj.r(imStartGroupCallFragment.requireContext(), imStartGroupCallFragment.getString(i, qtd0Var.name()), 0);
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void k(int i, List list) {
            ImStartGroupCallFragment imStartGroupCallFragment = ImStartGroupCallFragment.this;
            ImStartGroupCallFragment.eo(imStartGroupCallFragment);
            int size = list.size();
            View view = imStartGroupCallFragment.R;
            if (view == null) {
                view = null;
            }
            boolean z = true;
            view.setEnabled(imStartGroupCallFragment.a0 || size > 0);
            View view2 = imStartGroupCallFragment.S;
            View view3 = view2 != null ? view2 : null;
            if (!imStartGroupCallFragment.a0 && size <= 0) {
                z = false;
            }
            view3.setEnabled(z);
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void f() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void g() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void l() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void m() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void a(boolean z) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void b(q2a0 q2a0Var) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void e(Peer peer) {
        }
    }
}
