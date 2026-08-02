package com.vk.friends.requests.impl.requests.presentation;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.anj;
import xsna.aps;
import xsna.asu0;
import xsna.bpn0;
import xsna.c4e0;
import xsna.cis;
import xsna.cj50;
import xsna.cps;
import xsna.dhr0;
import xsna.dnh;
import xsna.enh;
import xsna.epx;
import xsna.fnj;
import xsna.fpf0;
import xsna.g1j;
import xsna.gko;
import xsna.gzs;
import xsna.h3p0;
import xsna.hf8;
import xsna.hxl;
import xsna.i5f;
import xsna.iah0;
import xsna.ijs;
import xsna.izs;
import xsna.kjs;
import xsna.l2k;
import xsna.lpj;
import xsna.m7m;
import xsna.mj1;
import xsna.mjs;
import xsna.njw;
import xsna.nss;
import xsna.o25;
import xsna.o40;
import xsna.odm;
import xsna.oj;
import xsna.ots;
import xsna.oz50;
import xsna.p41;
import xsna.p5h;
import xsna.pff;
import xsna.qhh0;
import xsna.ris;
import xsna.rsg0;
import xsna.s0d0;
import xsna.s3q0;
import xsna.sk4;
import xsna.tfx;
import xsna.tlo0;
import xsna.tq;
import xsna.u1e0;
import xsna.u3u;
import xsna.u5;
import xsna.u730;
import xsna.ur0;
import xsna.v53;
import xsna.vl0;
import xsna.vos;
import xsna.y00;
import xsna.y1z;
import xsna.yfb;
import xsna.z13;
import xsna.zi50;
import xsna.zq;

/* compiled from: FriendRequestsFragment.kt */
/* loaded from: classes16.dex */
public final class FriendRequestsFragment extends BaseFragment implements c.m<b>, qhh0 {
    public static final /* synthetic */ int d0 = 0;
    public final c S;
    public final ots T;
    public final bpn0 U;
    public final bpn0 V;
    public final String W;
    public VkTopBar X;
    public com.vk.lists.c Y;
    public FriendsRequestsPaginatedView Z;
    public ijs a0;
    public final io.reactivex.rxjava3.disposables.b b0;
    public final FriendRequestsFragment$receiver$1 c0;

    /* compiled from: FriendRequestsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(FriendRequestsFragment.class, null, null);
        }
    }

    /* compiled from: FriendRequestsFragment.kt */
    public static final class b {
        public final cps a;
        public final VKFromList<RequestUserProfile> b;
        public final String c;

        public b() {
            this(null, null, null, 15);
        }

        public b(cps cpsVar, VKFromList vKFromList, String str, int i) {
            cpsVar = (i & 1) != 0 ? null : cpsVar;
            vKFromList = (i & 4) != 0 ? null : vKFromList;
            str = (i & 8) != 0 ? null : str;
            this.a = cpsVar;
            this.b = vKFromList;
            this.c = str;
        }
    }

    /* compiled from: FriendRequestsFragment.kt */
    public static final class c extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = FriendRequestsFragment.d0;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: FriendRequestsFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            List<RequestUserProfile> y0;
            Object obj;
            UserId userId2 = userId;
            FriendRequestsFragment friendRequestsFragment = (FriendRequestsFragment) this.receiver;
            ijs ijsVar = friendRequestsFragment.a0;
            if (ijsVar != null && (y0 = ijsVar.y0()) != null) {
                Iterator it = ((ArrayList) y0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    RequestUserProfile requestUserProfile = (RequestUserProfile) next;
                    if (epx.f(requestUserProfile != null ? requestUserProfile.c : null, userId2)) {
                        obj = next;
                        break;
                    }
                }
                RequestUserProfile requestUserProfile2 = (RequestUserProfile) obj;
                if (requestUserProfile2 != null) {
                    requestUserProfile2.T = false;
                    ijs ijsVar2 = friendRequestsFragment.a0;
                    if (ijsVar2 != null) {
                        ijsVar2.F0(requestUserProfile2, requestUserProfile2);
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: FriendRequestsFragment.kt */
    public static final class e extends GridLayoutManager.c {
        public e() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            FriendRequestsFragment friendRequestsFragment = FriendRequestsFragment.this;
            ijs ijsVar = friendRequestsFragment.a0;
            if ((ijsVar != null ? (RequestUserProfile) ijsVar.c.c(i) : null) == null) {
                return friendRequestsFragment.io();
            }
            return 1;
        }
    }

    /* compiled from: FriendRequestsFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            FriendRequestsFragment friendRequestsFragment = (FriendRequestsFragment) this.receiver;
            FriendsRequestsPaginatedView friendsRequestsPaginatedView = friendRequestsFragment.Z;
            if (friendsRequestsPaginatedView != null) {
                u1e0 u1e0Var = friendsRequestsPaginatedView.N;
                if (u1e0Var == null) {
                    u1e0Var = null;
                }
                u1e0Var.setVisibility(0);
            }
            friendRequestsFragment.T.getClass();
            friendRequestsFragment.eo(rsg0.y0(yfb.x(new tfx("friends.requestsToSubscribers", new n(13), new zq(15))), null, null, 3).subscribe(new p41(new g1j(friendRequestsFragment, 9), 24), new kjs(new l2k(friendRequestsFragment, 14), 0)));
            return s3q0.a;
        }
    }

    public FriendRequestsFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.S = new c();
        this.T = new ots();
        this.U = new bpn0(new sk4(13));
        this.V = new bpn0(new odm(this, 8));
        this.W = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_REQUESTS);
        this.b0 = new io.reactivex.rxjava3.disposables.b();
        this.c0 = new FriendRequestsFragment$receiver$1(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.S;
    }

    @Override // com.vk.lists.c.m
    public final q<b> O9(String str, com.vk.lists.c cVar) {
        vos vosVar = new vos(str, cVar.k());
        ijs ijsVar = this.a0;
        vosVar.H0(ijsVar != null ? ijsVar.q : null);
        vosVar.F0(this.W);
        return cj50.b(rsg0.T(vosVar), (zi50) this.U.getValue()).a0(asu0.a.d()).U(new o40(new ur0(26), 19));
    }

    @Override // com.vk.lists.c.k
    public final q<b> hj(com.vk.lists.c cVar, boolean z) {
        return new o0(rsg0.T(new aps(cVar.k(), this.W)), new u730(new u3u((zi50) this.U.getValue(), 16), 2)).a0(asu0.a.d()).U(new mj1(new oj(26), 18));
    }

    public final int io() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return 1;
        }
        HashSet hashSet = iah0.a;
        return (!fnj.d(activity) || getResources().getConfiguration().screenWidthDp < 800) ? 1 : 2;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            anj.d(activity, this.c0, new IntentFilter("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED"), hf8.a, 4);
        }
        eo(((StoriesComponent) m7m.d(this).a(fpf0.a(StoriesComponent.class))).Pa().a(new d(1, this, FriendRequestsFragment.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.requests_list_layout, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        this.X = vkTopBar;
        if (vkTopBar != null) {
            vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.vk_accessibility_back), new i5f(this, 25), null, null, 56));
            String string = getString(R.string.requests_list_requests);
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.h(string), new pff(this, 24), null, null, null, 28), null, null, com.vk.core.compose.component.semantics.b.a(null, new v53(13, vkTopBar, string), 3), 6));
        }
        h3p0.d(this, this.X);
        FriendsRequestsPaginatedView friendsRequestsPaginatedView = (FriendsRequestsPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.Z = friendsRequestsPaginatedView;
        if (friendsRequestsPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, friendsRequestsPaginatedView);
            dVar.e = new e();
            dVar.d(new u5(this, 14));
            dVar.a();
        }
        ris K5 = FriendsRequestsComponent.K5((FriendsRequestsComponent) m7m.d(this).mo408a(fpf0.a(FriendsRequestsComponent.class)), new nss(this.W, MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_REQUESTS, cis.k, true), new njw(new p5h(this, 18), new z13(21), new dnh(this, 22)), null, kn(), this.b0, null, null, 100);
        enh enhVar = new enh(this, 16);
        f fVar = new f(0, this, FriendRequestsFragment.class, "moveRequestsToFollowers", "moveRequestsToFollowers()V", 0);
        Boolean bool = o25.a().o().k;
        ijs ijsVar = new ijs(K5, enhVar, fVar, bool != null ? bool.booleanValue() : false);
        this.a0 = ijsVar;
        FriendsRequestsPaginatedView friendsRequestsPaginatedView2 = this.Z;
        if (friendsRequestsPaginatedView2 != null) {
            friendsRequestsPaginatedView2.setAdapter(ijsVar);
        }
        c.h hVar = new c.h(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c4e0.a(5, 1.5f));
        arrayList.add(new c4e0.a(5, 2.0f));
        arrayList.add(new c4e0.a(5, 3.0f));
        arrayList.add(0, new c4e0.a(5, 1.0f));
        hVar.h = new c4e0(arrayList, 30, 50);
        hVar.t = new s0d0() { // from class: xsna.jjs
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                RequestUserProfile requestUserProfile;
                FriendRequestsFragment friendRequestsFragment = FriendRequestsFragment.this;
                ijs ijsVar2 = friendRequestsFragment.a0;
                if (ijsVar2 == null || (requestUserProfile = (RequestUserProfile) ijsVar2.c.c(i)) == null) {
                    return u0d0.a;
                }
                io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
                io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(requestUserProfile.h).subscribe();
                bVar.b(subscribe);
                friendRequestsFragment.O.b(subscribe);
                UserProfile[] userProfileArr = requestUserProfile.j0;
                if (userProfileArr != null) {
                    for (UserProfile userProfile : userProfileArr) {
                        io.reactivex.rxjava3.disposables.c subscribe2 = mcr0.s(userProfile.h).subscribe();
                        bVar.b(subscribe2);
                        friendRequestsFragment.O.b(subscribe2);
                    }
                }
                return new v0d0(bVar);
            }
        };
        this.Y = com.vk.lists.f.a(hVar, this.Z);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.c0);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.b0.e();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView;
        FriendsRequestsPaginatedView friendsRequestsPaginatedView = this.Z;
        if (friendsRequestsPaginatedView == null || (recyclerView = friendsRequestsPaginatedView.getRecyclerView()) == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<b> qVar, boolean z, com.vk.lists.c cVar) {
        eo(qVar.subscribe(new y00(new mjs(this, z, cVar, 0), 21), new vl0(new hxl(this, 5), 21)));
    }
}
