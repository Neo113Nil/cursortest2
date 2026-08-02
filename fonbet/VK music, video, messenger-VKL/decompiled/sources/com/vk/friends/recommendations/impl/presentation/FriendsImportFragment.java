package com.vk.friends.recommendations.impl.presentation;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.contacts.ContactsManager;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.SocialButtonType;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import io.reactivex.rxjava3.internal.operators.observable.t0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import xsna.aq;
import xsna.asu0;
import xsna.bj50;
import xsna.bpn0;
import xsna.d02;
import xsna.d37;
import xsna.dhr0;
import xsna.dof;
import xsna.dz;
import xsna.e43;
import xsna.epx;
import xsna.fq1;
import xsna.fw3;
import xsna.gbj;
import xsna.gjf0;
import xsna.gko;
import xsna.gmp;
import xsna.gv;
import xsna.h3p0;
import xsna.hg1;
import xsna.hv;
import xsna.iz3;
import xsna.j0r;
import xsna.jv;
import xsna.kdn;
import xsna.kps;
import xsna.lh3;
import xsna.lpj;
import xsna.n82;
import xsna.oce;
import xsna.ov2;
import xsna.oz50;
import xsna.pv2;
import xsna.rvq;
import xsna.t7j;
import xsna.tlo0;
import xsna.tq;
import xsna.u3k;
import xsna.urd0;
import xsna.v20;
import xsna.vp;
import xsna.wh1;
import xsna.xc50;
import xsna.y1z;
import xsna.y4;
import xsna.y7;
import xsna.zi50;

/* compiled from: FriendsImportFragment.kt */
/* loaded from: classes16.dex */
public final class FriendsImportFragment extends BaseFragment implements c.m<VKFromList<Item>> {
    public static final /* synthetic */ int a0 = 0;
    public final d S;
    public BaseVkSearchView T;
    public RecyclerPaginatedView U;
    public final io.reactivex.rxjava3.disposables.b V;
    public final a W;
    public final bpn0 X;
    public final bpn0 Y;
    public com.vk.lists.c Z;

    /* compiled from: FriendsImportFragment.kt */
    public static final class a implements aq.a {
        @Override // xsna.aq.a
        public final String a(int i) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getResources().getQuantityString(R.plurals.num_mutual_contacts, i, Integer.valueOf(i));
        }
    }

    /* compiled from: FriendsImportFragment.kt */
    public static final class b extends oz50 {
        public b(int i) {
            super(FriendsImportFragment.class, null, null);
            this.j.putInt("title", i);
        }
    }

    /* compiled from: FriendsImportFragment.kt */
    public static final class c {
        public final String a;
        public final List<t7j> b;

        public c(String str, List list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.a.equals(cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + fw3.a(urd0.a(-989040558, 31, this.a), 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Contacts(service=phone, userId=");
            sb.append(this.a);
            sb.append(", contacts=");
            return vp.b(", enableOther=true)", sb, this.b);
        }
    }

    /* compiled from: FriendsImportFragment.kt */
    public static final class d extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = FriendsImportFragment.a0;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public FriendsImportFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.S = new d();
        this.V = new io.reactivex.rxjava3.disposables.b();
        this.W = new a();
        this.X = new bpn0(new iz3(9));
        this.Y = new bpn0(new u3k(this, 14));
    }

    public static Item io(RequestUserProfile requestUserProfile) {
        return new Item(requestUserProfile.p0 ? Item.Type.REQUEST_NOT_REAL : requestUserProfile.e0 == SocialButtonType.FOLLOW ? Item.Type.FOLLOW_SUGGEST : Item.Type.REQUEST, 0, requestUserProfile, null, 10);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.S;
    }

    @Override // com.vk.lists.c.m
    public final q<VKFromList<Item>> O9(String str, com.vk.lists.c cVar) {
        Future<ContactsManager.b> U0 = com.vk.contacts.d.a.U0();
        Objects.requireNonNull(U0, "future is null");
        int i = 17;
        j1 U = new t0(U0).U(new fq1(new rvq(2), i)).U(new lh3(new dz(29), i));
        asu0 asu0Var = asu0.a;
        return new o0(U.r0(asu0Var.c()).a0(asu0Var.d()).L(new y7(new oce(this, 26), 20), false), new bj50(new xc50((zi50) this.X.getValue(), 1), 0)).a0(asu0Var.d()).U(new v20(new j0r(this, 3), 24));
    }

    @Override // com.vk.lists.c.k
    public final q<VKFromList<Item>> hj(com.vk.lists.c cVar, boolean z) {
        jo().clear();
        return O9(null, cVar);
    }

    public final com.vk.friends.recommendations.impl.presentation.a jo() {
        return (com.vk.friends.recommendations.impl.presentation.a) this.Y.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerPaginatedView recyclerPaginatedView = this.U;
        if (recyclerPaginatedView != null) {
            gjf0.b(recyclerPaginatedView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        View inflate = layoutInflater.inflate(R.layout.import_contacts_fragment, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        if (vkTopBar != null) {
            vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.vk_accessibility_back), new gbj(this, 13), null, null, 56));
        }
        if (vkTopBar != null) {
            tlo0.a aVar = tlo0.Companion;
            int i = requireArguments().getInt("title");
            aVar.getClass();
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(i), null, null, null, null, 30), null, null, null, 14));
        }
        h3p0.d(this, vkTopBar);
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context requireContext = requireContext();
        permissionHelper.getClass();
        if (!PermissionHelper.b(requireContext, PermissionHelper.u)) {
            go(new dof(this, 25));
        }
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter(jo());
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        if (vkTopBar != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            vkTopBar.setOnClickListener(new gmp(new WeakReference(recyclerView), 9));
        }
        this.Z = f.a(new c.h(this), recyclerPaginatedView);
        this.U = recyclerPaginatedView;
        BaseVkSearchView baseVkSearchView = (BaseVkSearchView) inflate.findViewById(R.id.search_view);
        baseVkSearchView.setHint(R.string.search);
        baseVkSearchView.setOnBackClickListener(new y4(12, vkTopBar, this));
        baseVkSearchView.X4(false);
        baseVkSearchView.setVoiceInputEnabled(true);
        hg1.a(d02.y(baseVkSearchView, 300L, 2).U(new gv(new n82(20), 21)).subscribe(new hv(new kdn(this, 5), 23), new jv(new wh1(19), 21)), kn());
        this.T = baseVkSearchView;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.V.e();
        this.U = null;
        com.vk.lists.c cVar = this.Z;
        if (cVar != null) {
            cVar.v();
        }
        this.Z = null;
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<VKFromList<Item>> qVar, boolean z, com.vk.lists.c cVar) {
        eo(qVar.subscribe(new ov2(new kps(cVar, z, this), 20), new pv2(new d37(17), 17)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IMPORT_ADDRESS_BOOK;
    }
}
