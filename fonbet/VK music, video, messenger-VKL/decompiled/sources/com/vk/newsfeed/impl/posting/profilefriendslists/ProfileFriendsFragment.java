package com.vk.newsfeed.impl.posting.profilefriendslists;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.af50;
import xsna.aj50;
import xsna.akd0;
import xsna.awt0;
import xsna.axd0;
import xsna.b8g;
import xsna.bl30;
import xsna.bpn0;
import xsna.br;
import xsna.bug0;
import xsna.bwt0;
import xsna.cr20;
import xsna.cvk;
import xsna.d02;
import xsna.d2y;
import xsna.d50;
import xsna.dhr0;
import xsna.e4;
import xsna.ehu;
import xsna.ekp;
import xsna.epx;
import xsna.exd0;
import xsna.f4m;
import xsna.fhc0;
import xsna.fnj;
import xsna.fxc0;
import xsna.gko;
import xsna.gpu0;
import xsna.h7u0;
import xsna.hfz;
import xsna.hp30;
import xsna.hrz;
import xsna.hxd0;
import xsna.hyu;
import xsna.i4a0;
import xsna.iah0;
import xsna.ie90;
import xsna.ies;
import xsna.ify;
import xsna.ikv0;
import xsna.irc0;
import xsna.ixd0;
import xsna.j5j;
import xsna.jjc;
import xsna.jqs;
import xsna.jw30;
import xsna.jxd0;
import xsna.l7s;
import xsna.mi10;
import xsna.nid0;
import xsna.o440;
import xsna.oek0;
import xsna.oqx0;
import xsna.orl;
import xsna.ox6;
import xsna.oz50;
import xsna.p4g;
import xsna.pf40;
import xsna.px6;
import xsna.q9;
import xsna.qj80;
import xsna.r8a0;
import xsna.rdi;
import xsna.rhz;
import xsna.rkt;
import xsna.s3q0;
import xsna.sxm;
import xsna.sy50;
import xsna.tb0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.vds;
import xsna.wsi;
import xsna.y8g0;
import xsna.zwd0;

/* compiled from: ProfileFriendsFragment.kt */
/* loaded from: classes4.dex */
public final class ProfileFriendsFragment extends BaseMvpFragment<zwd0> implements hxd0, ies, vds, ify.a, tb0, too0 {
    public static final /* synthetic */ int k0 = 0;
    public VkTopBar T;
    public com.vk.newsfeed.impl.posting.profilefriendslists.a U;
    public gpu0 V;
    public VkButton W;
    public View X;
    public int Y;
    public VkRecyclerPaginatedView Z;
    public VkSearchView a0;
    public com.vk.lists.c b0;
    public boolean c0;
    public d d0;
    public final EmptyDisposable e0 = EmptyDisposable.INSTANCE;
    public final bpn0 f0 = new bpn0(new hp30(this, 16));
    public final bpn0 g0 = new bpn0(new jw30(this, 21));
    public final b h0 = new b();
    public final br i0 = new br(27);
    public final bpn0 j0 = new bpn0(new cr20(this, 29));

    /* compiled from: ProfileFriendsFragment.kt */
    public static final class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, List list, List list2, boolean z, int i) {
            super(ProfileFriendsFragment.class, null, null);
            boolean z2 = (i & 4) == 0;
            list = (i & 8) != 0 ? EmptyList.b : list;
            list2 = (i & 16) != 0 ? EmptyList.b : list2;
            z = (i & 32) != 0 ? false : z;
            this.j.putBoolean("is_open_from_feed_key", z2);
            this.j.putParcelable("ProfileFriendsFragment.params", friendsListParams);
            this.j.putInt("privacy_type_key", friendsListPrivacyType.h());
            this.j.putParcelableArrayList("preset_friends_ids", p4g.q(list));
            this.j.putIntegerArrayList("preset_friends_lists_ids", p4g.q(list2));
            this.j.putBoolean("force_dark_theme", z);
        }
    }

    /* compiled from: ProfileFriendsFragment.kt */
    public static final class b implements a.InterfaceC1385a {
        public b() {
        }

        @Override // xsna.rx6.d
        public final void L1(ox6 ox6Var) {
            int i = ProfileFriendsFragment.k0;
            ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            profileFriendsFragment.ro();
            zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
            if (zwd0Var != null) {
                zwd0Var.L1(ox6Var);
            }
            ((fhc0.c) profileFriendsFragment.f0.getValue()).g();
        }

        @Override // xsna.rx6.d
        public final void M1(List<ProfileFriendItem> list) {
            ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
            if (zwd0Var != null) {
                zwd0Var.U8(list, true);
            }
            ((fhc0.c) profileFriendsFragment.f0.getValue()).b();
        }

        @Override // xsna.uhz.d
        public final void P(int i, int i2, String str) {
            zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
            if (zwd0Var != null) {
                zwd0Var.P(i, i2, str);
            }
        }

        @Override // xsna.rx6.d
        public final void S0(List<ProfileFriendItem> list) {
            zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
            if (zwd0Var != null) {
                zwd0Var.S0(list);
            }
        }

        @Override // com.vk.newsfeed.impl.posting.profilefriendslists.holders.ProfileFriendsListHeaderVh.a
        public final void U0() {
            zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
            if (zwd0Var != null) {
                zwd0Var.U0();
            }
        }

        @Override // xsna.kxd0.a
        public final void a(int i) {
            zwd0 zwd0Var;
            int i2 = ProfileFriendsFragment.k0;
            ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            FriendsListParams oo = profileFriendsFragment.oo();
            if (oo instanceof FriendsListParams.BestFriendsList) {
                zwd0 zwd0Var2 = (zwd0) profileFriendsFragment.S;
                if (zwd0Var2 != null) {
                    zwd0Var2.g5(i);
                    return;
                }
                return;
            }
            if (!(oo instanceof FriendsListParams.FriendsListsWithFriends) || (zwd0Var = (zwd0) profileFriendsFragment.S) == null) {
                return;
            }
            zwd0Var.Z6(i);
        }

        @Override // xsna.xwd0.d
        public final void b(ProfileFriendItem profileFriendItem, boolean z) {
            ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
            if (zwd0Var != null) {
                zwd0Var.U8(Collections.singletonList(profileFriendItem), z);
            }
            ((fhc0.c) profileFriendsFragment.f0.getValue()).f();
        }

        @Override // com.vk.newsfeed.impl.posting.profilefriendslists.holders.ProfileFriendsListHeaderVh.a
        public final void b1() {
            zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
            if (zwd0Var != null) {
                zwd0Var.b1();
            }
        }

        @Override // xsna.xwd0.d
        public final void c(ProfileFriendItem profileFriendItem) {
            zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
            if (zwd0Var != null) {
                zwd0Var.S0(Collections.singletonList(profileFriendItem));
            }
        }

        @Override // xsna.w7k.a
        public final void d() {
            int i = ProfileFriendsFragment.k0;
            ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            profileFriendsFragment.ro();
            zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
            if (zwd0Var != null) {
                zwd0Var.A3();
            }
        }

        @Override // xsna.uhz.d
        public final void e(int i, boolean z) {
            int i2 = ProfileFriendsFragment.k0;
            ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            boolean z2 = profileFriendsFragment.oo() instanceof FriendsListParams.BestFriendsList;
            Integer valueOf = z2 ? Integer.valueOf(profileFriendsFragment.Y) : null;
            VkButton vkButton = profileFriendsFragment.W;
            if (vkButton == null) {
                vkButton = null;
            }
            vkButton.setCount(valueOf);
            if (z) {
                zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
                if (zwd0Var != null) {
                    zwd0Var.l6(i);
                }
                if (z2) {
                    VkButton vkButton2 = profileFriendsFragment.W;
                    VkButton vkButton3 = vkButton2 != null ? vkButton2 : null;
                    int i3 = profileFriendsFragment.Y + 1;
                    profileFriendsFragment.Y = i3;
                    vkButton3.setCount(Integer.valueOf(i3));
                    return;
                }
                return;
            }
            zwd0 zwd0Var2 = (zwd0) profileFriendsFragment.S;
            if (zwd0Var2 != null) {
                zwd0Var2.O4(i);
            }
            if (z2) {
                VkButton vkButton4 = profileFriendsFragment.W;
                if (vkButton4 == null) {
                    vkButton4 = null;
                }
                int i4 = profileFriendsFragment.Y - 1;
                profileFriendsFragment.Y = i4;
                vkButton4.setCount(Integer.valueOf(i4));
                if (profileFriendsFragment.Y == 0) {
                    VkButton vkButton5 = profileFriendsFragment.W;
                    if (vkButton5 == null) {
                        vkButton5 = null;
                    }
                    vkButton5.setCount(null);
                }
            }
        }

        @Override // xsna.uhz.d
        public final void l0(final int i, final int i2) {
            int i3 = h7u0.p;
            final ProfileFriendsFragment profileFriendsFragment = ProfileFriendsFragment.this;
            h7u0.a c = h7u0.b.c(profileFriendsFragment.requireContext());
            c.g0(R.string.lists_friends_delete_title);
            c.U(R.string.lists_friends_delete_confirm);
            c.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.vwd0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
                    if (zwd0Var != null) {
                        zwd0Var.l0(i, i2);
                    }
                }
            });
            c.W(R.string.no, null);
            c.m();
        }
    }

    /* compiled from: View.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ ProfileFriendsFragment c;

        public c(View view, ProfileFriendsFragment profileFriendsFragment) {
            this.b = view;
            this.c = profileFriendsFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ProfileFriendsFragment profileFriendsFragment = this.c;
            View view = profileFriendsFragment.X;
            if (view == null) {
                view = null;
            }
            int i = view.getLayoutParams().height;
            View view2 = profileFriendsFragment.X;
            if (view2 == null) {
                view2 = null;
            }
            int paddingBottom = view2.getPaddingBottom() + i;
            VkRecyclerPaginatedView vkRecyclerPaginatedView = profileFriendsFragment.Z;
            f4m.v(paddingBottom, vkRecyclerPaginatedView != null ? vkRecyclerPaginatedView : null);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        if (this.c0) {
            int color = requireContext().getColor(R.color.vk_black);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            Window window = activity.getWindow();
            oek0 oek0Var = new oek0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
            fVar.f(false);
            fVar.e(false);
            window.setStatusBarColor(color);
            window.setNavigationBarColor(color);
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        return fxc0.B().J().x0() ? 2 : 1;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (!(oo() instanceof FriendsListParams.HiddenFriendsList)) {
            return super.a0();
        }
        to();
        return true;
    }

    public final void jo(String str) {
        VkTopBar vkTopBar = this.T;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setMiddle(po(str));
    }

    public final void ko(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("newFriendsListId", i);
        intent.putExtra("newFriendsListName", str);
        Mf(-1, intent);
    }

    public final void lo(int i) {
        FriendsListParams oo = oo();
        if (oo instanceof FriendsListParams.FriendsList) {
            if (i == -1) {
                finish();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("deletePosition", i);
            Mf(-1, intent);
            return;
        }
        if (!(oo instanceof FriendsListParams.FriendsListsWithFriends)) {
            finish();
            return;
        }
        zwd0 zwd0Var = (zwd0) this.S;
        if (zwd0Var != null) {
            zwd0Var.Yh();
        }
        com.vk.newsfeed.impl.posting.profilefriendslists.a aVar = this.U;
        if (aVar == null) {
            aVar = null;
        }
        aVar.setItems(rdi.A(i, aVar.h));
        cvk.w(y8g0.e(R.string.lists_friends_delete_success), false);
    }

    public final void mo(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("renamePosition", i);
        intent.putExtra("renameNewName", str);
        Mf(-1, intent);
    }

    public final void no(Set<String> set, Set<String> set2) {
        Intent intent = new Intent();
        intent.putExtra("chosen_friends_ids", p4g.q(set));
        intent.putExtra("chosen_friends_lists_ids", p4g.q(set2));
        Mf(-1, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        sxm sxmVar;
        if (i2 != -1) {
            return;
        }
        zwd0 zwd0Var = (zwd0) this.S;
        if (zwd0Var != null) {
            zwd0Var.Yh();
        }
        if (i != 4330) {
            if (i == 4331 && intent != null) {
                int intExtra = intent.getIntExtra("newFriendsListId", -1);
                String stringExtra = intent.getStringExtra("newFriendsListName");
                String str = stringExtra == null ? "" : stringExtra;
                if (intExtra == -1 || str.equals("")) {
                    return;
                }
                zwd0 zwd0Var2 = (zwd0) this.S;
                if (zwd0Var2 != null) {
                    zwd0Var2.q5(intExtra, str);
                }
                com.vk.newsfeed.impl.posting.profilefriendslists.a aVar = this.U;
                sxmVar = aVar != null ? aVar : null;
                ArrayList arrayList = new ArrayList(sxmVar.h);
                arrayList.add(2, new com.vk.newsfeed.common.posting.listfriends.a(intExtra, 2, str, false, false));
                sxmVar.setItems(arrayList);
                return;
            }
            return;
        }
        if (intent != null) {
            int intExtra2 = intent.getIntExtra("deletePosition", -1);
            if (intExtra2 != -1) {
                com.vk.newsfeed.impl.posting.profilefriendslists.a aVar2 = this.U;
                sxmVar = aVar2 != null ? aVar2 : null;
                sxmVar.setItems(rdi.A(intExtra2, sxmVar.h));
                return;
            }
            int intExtra3 = intent.getIntExtra("renamePosition", -1);
            String stringExtra2 = intent.getStringExtra("renameNewName");
            String str2 = stringExtra2 == null ? "" : stringExtra2;
            if (intExtra3 == -1 || str2.equals("")) {
                return;
            }
            com.vk.newsfeed.impl.posting.profilefriendslists.a aVar3 = this.U;
            sxmVar = aVar3 != null ? aVar3 : null;
            ArrayList arrayList2 = new ArrayList(sxmVar.h);
            com.vk.newsfeed.common.posting.listfriends.a aVar4 = (com.vk.newsfeed.common.posting.listfriends.a) arrayList2.get(intExtra3);
            arrayList2.set(intExtra3, new com.vk.newsfeed.common.posting.listfriends.a(aVar4.b, aVar4.d, str2, aVar4.e, aVar4.f));
            sxmVar.setItems(arrayList2);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        List list2;
        super.onCreate(bundle);
        FriendsListPrivacyType.a aVar = FriendsListPrivacyType.Companion;
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("privacy_type_key") : -1;
        aVar.getClass();
        FriendsListPrivacyType a2 = FriendsListPrivacyType.a.a(i);
        Bundle arguments2 = getArguments();
        boolean z = true;
        if (arguments2 == null || !arguments2.getBoolean("force_dark_theme", false)) {
            if (!(bundle != null ? bundle.getBoolean("force_dark_theme") : false)) {
                z = false;
            }
        }
        this.c0 = z;
        FriendsListParams oo = oo();
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (list = arguments3.getParcelableArrayList("preset_friends_ids")) == null) {
            list = EmptyList.b;
        }
        List list3 = list;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (list2 = arguments4.getIntegerArrayList("preset_friends_lists_ids")) == null) {
            list2 = EmptyList.b;
        }
        this.S = new exd0(this, oo, a2, list3, list2, ((ClipEditComponent) this.g0.getValue()).d6());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.c0) {
            Context context = layoutInflater.getContext();
            if (this.c0) {
                dhr0.a.getClass();
                context = new l7s(context, dhr0.u().c);
            }
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        return layoutInflater.inflate(R.layout.fragment_profile_friends_list, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((wsi) this.S).dispose();
        this.e0.getClass();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Ng();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("force_dark_theme", this.c0);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = ify.a;
        ify.a(this);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        int i = ify.a;
        ify.g(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        if (com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList.a.a(r11) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f1, code lost:
    
        if (com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList.a.a(r11) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        String e;
        boolean z;
        boolean z2;
        FriendsListParams.FriendListCreation friendListCreation;
        boolean z3;
        boolean z4;
        VkTopBar.a.d dVar;
        MoreItemsType moreItemsType;
        com.vk.newsfeed.impl.posting.profilefriendslists.a aVar;
        com.vk.newsfeed.impl.posting.profilefriendslists.a aVar2;
        zwd0 zwd0Var;
        VkButton vkButton;
        zwd0 zwd0Var2;
        VkTopBar.a.b.C0877b c0877b;
        Boolean valueOf;
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(requireContext);
        boolean x0 = fxc0.B().J().x0();
        int i = 16;
        if (d && x0) {
            int a2 = iah0.a(16);
            view2 = view;
            awt0.x(view2, a2, 0, a2, 0, 10);
        } else {
            view2 = view;
        }
        VkTopBar vkTopBar = (VkTopBar) view2.findViewById(R.id.profile_friends_list_toolbar);
        this.T = vkTopBar;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setBack(new VkTopBar.b(new irc0(this, 3), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28));
        FriendsListParams oo = oo();
        if (oo instanceof FriendsListParams.FriendsList) {
            e = ((FriendsListParams.FriendsList) oo).c;
        } else if (oo instanceof FriendsListParams.FriendListCreation) {
            e = ((FriendsListParams.FriendListCreation) oo).b;
        } else if (oo instanceof FriendsListParams.BestFriendsList) {
            e = y8g0.e(R.string.best_friends_title);
        } else if (oo instanceof FriendsListParams.HiddenFriendsList) {
            e = y8g0.e(R.string.hidden_friends_title);
        } else {
            if (!(oo instanceof FriendsListParams.FriendsListsWithFriends)) {
                throw new NoWhenBranchMatchedException();
            }
            e = y8g0.e(R.string.clips_privacy_choose_friends);
        }
        vkTopBar.setMiddle(po(e));
        FriendsListParams oo2 = oo();
        boolean z5 = oo2 instanceof FriendsListParams.FriendsList;
        int i2 = 1;
        if (z5) {
            ListsFriendsDefaultList.a aVar3 = ListsFriendsDefaultList.Companion;
            int i3 = ((FriendsListParams.FriendsList) oo2).b;
            aVar3.getClass();
        } else {
            if (!(oo2 instanceof FriendsListParams.FriendListCreation)) {
                if (!(oo2 instanceof FriendsListParams.BestFriendsList) && !(oo2 instanceof FriendsListParams.HiddenFriendsList) && !(oo2 instanceof FriendsListParams.FriendsListsWithFriends)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            z = true;
        }
        if (!(oo2 instanceof FriendsListParams.BestFriendsList) && !(oo2 instanceof FriendsListParams.HiddenFriendsList) && !(oo2 instanceof FriendsListParams.FriendsListsWithFriends)) {
            if (z5) {
                ListsFriendsDefaultList.a aVar4 = ListsFriendsDefaultList.Companion;
                int i4 = ((FriendsListParams.FriendsList) oo2).b;
                aVar4.getClass();
            } else if (!(oo2 instanceof FriendsListParams.FriendListCreation)) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = true;
            friendListCreation = !(oo2 instanceof FriendsListParams.FriendListCreation) ? (FriendsListParams.FriendListCreation) oo2 : null;
            if (friendListCreation != null || friendListCreation.d == -1) {
                z3 = true;
            } else {
                FriendsListParams oo3 = oo();
                FriendsListParams.FriendListCreation friendListCreation2 = oo3 instanceof FriendsListParams.FriendListCreation ? (FriendsListParams.FriendListCreation) oo3 : null;
                if (friendListCreation2 != null) {
                    valueOf = Boolean.valueOf(friendListCreation2.c);
                } else {
                    zwd0 zwd0Var3 = (zwd0) this.S;
                    valueOf = zwd0Var3 != null ? Boolean.valueOf(zwd0Var3.i2()) : null;
                }
                z3 = epx.f(valueOf, Boolean.TRUE);
            }
            z4 = !z && z3;
            ListsFriendsDefaultList.a aVar5 = ListsFriendsDefaultList.Companion;
            FriendsListParams oo4 = oo();
            FriendsListParams.FriendsList friendsList = !(oo4 instanceof FriendsListParams.FriendsList) ? (FriendsListParams.FriendsList) oo4 : null;
            int i5 = friendsList != null ? friendsList.b : -1;
            aVar5.getClass();
            boolean z6 = ListsFriendsDefaultList.a.a(i5) && z2;
            int i6 = 9;
            int i7 = 20;
            int i8 = 2;
            if (!z4) {
                if (z6) {
                    gko.b bVar = gko.Companion;
                    c0877b = new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_delete_outline_24), new tlo0.f(R.string.delete_friends_list_desc), new sy50(this, 21), null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new ie90(this, i6), 2), 24);
                } else {
                    c0877b = null;
                }
                gko.b bVar2 = gko.Companion;
                dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_pen_outline_24), new tlo0.f(R.string.edit_friends_list_desc), new rkt(this, 28), null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new o440(this, i7), 2), 24), c0877b, 4);
            } else if (z6) {
                gko.b bVar3 = gko.Companion;
                dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_delete_outline_24), new tlo0.f(R.string.delete_friends_list_desc), new nid0(this, i2), null, new b8g(R.attr.vk_ui_icon_accent), com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new d2y(this, 23), 2), 8), null, 6);
            } else {
                dVar = null;
            }
            vkTopBar.setAfter(dVar);
            FriendsListParams oo5 = oo();
            moreItemsType = !(oo5 instanceof FriendsListParams.BestFriendsList) ? MoreItemsType.MORE_CONVERSATIONS : oo5 instanceof FriendsListParams.FriendsListsWithFriends ? MoreItemsType.MORE_FRIENDS_LISTS : null;
            com.vk.newsfeed.impl.posting.profilefriendslists.a aVar6 = new com.vk.newsfeed.impl.posting.profilefriendslists.a();
            b bVar4 = this.h0;
            aVar6.x0(px6.class, new pf40(bVar4, i6));
            int i9 = 13;
            aVar6.x0(jqs.class, new bl30(bVar4, i9));
            aVar6.x0(com.vk.newsfeed.impl.posting.profilefriendslists.holders.a.class, new aj50(bVar4, i9));
            aVar6.x0(axd0.class, new hyu(i));
            aVar6.x0(rhz.class, new af50(bVar4, 19));
            aVar6.x0(com.vk.newsfeed.common.posting.listfriends.a.class, new r8a0(bVar4, 11));
            if (moreItemsType != null) {
                aVar6.x0(jxd0.class, new d50(i7, bVar4, moreItemsType));
            }
            this.U = aVar6;
            Context requireContext2 = requireContext();
            if (this.c0) {
                dhr0.a.getClass();
                requireContext2 = new l7s(requireContext2, dhr0.u().c);
            }
            gpu0 gpu0Var = new gpu0(requireContext2);
            aVar = this.U;
            if (aVar == null) {
                aVar = null;
            }
            gpu0Var.j = aVar;
            this.V = gpu0Var;
            this.W = (VkButton) view2.findViewById(R.id.profile_friends_list_save);
            this.X = view2.findViewById(R.id.profile_friends_list_button_container);
            VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) view2.findViewById(R.id.profile_friends_list);
            AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
            vkRecyclerPaginatedView.getClass();
            new AbstractPaginatedView.d(layoutType, vkRecyclerPaginatedView).a();
            aVar2 = this.U;
            if (aVar2 == null) {
                aVar2 = null;
            }
            vkRecyclerPaginatedView.setAdapter(aVar2);
            vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
            vkRecyclerPaginatedView.setOnReloadRetryClickListener(new akd0(this, i8));
            vkRecyclerPaginatedView.setItemDecoration(this.V);
            this.Z = vkRecyclerPaginatedView;
            VkSearchView vkSearchView = (VkSearchView) view2.findViewById(R.id.profile_friends_list_search);
            orl.a(vkSearchView);
            this.a0 = vkSearchView;
            vkSearchView.X4(false);
            zwd0Var = (zwd0) this.S;
            if (zwd0Var != null) {
                VkSearchView vkSearchView2 = this.a0;
                if (vkSearchView2 == null) {
                    vkSearchView2 = null;
                }
                zwd0Var.rm(d02.y(vkSearchView2, 0L, 3).U(new q9(new ehu(24), 29)));
            }
            vkButton = this.W;
            if (vkButton == null) {
                vkButton = null;
            }
            jjc.g(vkButton, new mi10(this, 18));
            zwd0Var2 = (zwd0) this.S;
            if (zwd0Var2 == null) {
                c.h hVar = new c.h(zwd0Var2);
                hVar.h = new j5j(20);
                VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.Z;
                this.b0 = f.a(hVar, vkRecyclerPaginatedView2 != null ? vkRecyclerPaginatedView2 : null);
                return;
            }
            return;
        }
        z2 = false;
        if (!(oo2 instanceof FriendsListParams.FriendListCreation)) {
        }
        if (friendListCreation != null) {
        }
        z3 = true;
        if (z) {
        }
        ListsFriendsDefaultList.a aVar52 = ListsFriendsDefaultList.Companion;
        FriendsListParams oo42 = oo();
        if (!(oo42 instanceof FriendsListParams.FriendsList)) {
        }
        if (friendsList != null) {
        }
        aVar52.getClass();
        if (ListsFriendsDefaultList.a.a(i5)) {
        }
        int i62 = 9;
        int i72 = 20;
        int i82 = 2;
        if (!z4) {
        }
        vkTopBar.setAfter(dVar);
        FriendsListParams oo52 = oo();
        if (!(oo52 instanceof FriendsListParams.BestFriendsList)) {
        }
        com.vk.newsfeed.impl.posting.profilefriendslists.a aVar62 = new com.vk.newsfeed.impl.posting.profilefriendslists.a();
        b bVar42 = this.h0;
        aVar62.x0(px6.class, new pf40(bVar42, i62));
        int i92 = 13;
        aVar62.x0(jqs.class, new bl30(bVar42, i92));
        aVar62.x0(com.vk.newsfeed.impl.posting.profilefriendslists.holders.a.class, new aj50(bVar42, i92));
        aVar62.x0(axd0.class, new hyu(i));
        aVar62.x0(rhz.class, new af50(bVar42, 19));
        aVar62.x0(com.vk.newsfeed.common.posting.listfriends.a.class, new r8a0(bVar42, 11));
        if (moreItemsType != null) {
        }
        this.U = aVar62;
        Context requireContext22 = requireContext();
        if (this.c0) {
        }
        gpu0 gpu0Var2 = new gpu0(requireContext22);
        aVar = this.U;
        if (aVar == null) {
        }
        gpu0Var2.j = aVar;
        this.V = gpu0Var2;
        this.W = (VkButton) view2.findViewById(R.id.profile_friends_list_save);
        this.X = view2.findViewById(R.id.profile_friends_list_button_container);
        VkRecyclerPaginatedView vkRecyclerPaginatedView3 = (VkRecyclerPaginatedView) view2.findViewById(R.id.profile_friends_list);
        AbstractPaginatedView.LayoutType layoutType2 = AbstractPaginatedView.LayoutType.LINEAR;
        vkRecyclerPaginatedView3.getClass();
        new AbstractPaginatedView.d(layoutType2, vkRecyclerPaginatedView3).a();
        aVar2 = this.U;
        if (aVar2 == null) {
        }
        vkRecyclerPaginatedView3.setAdapter(aVar2);
        vkRecyclerPaginatedView3.setSwipeRefreshEnabled(false);
        vkRecyclerPaginatedView3.setOnReloadRetryClickListener(new akd0(this, i82));
        vkRecyclerPaginatedView3.setItemDecoration(this.V);
        this.Z = vkRecyclerPaginatedView3;
        VkSearchView vkSearchView3 = (VkSearchView) view2.findViewById(R.id.profile_friends_list_search);
        orl.a(vkSearchView3);
        this.a0 = vkSearchView3;
        vkSearchView3.X4(false);
        zwd0Var = (zwd0) this.S;
        if (zwd0Var != null) {
        }
        vkButton = this.W;
        if (vkButton == null) {
        }
        jjc.g(vkButton, new mi10(this, 18));
        zwd0Var2 = (zwd0) this.S;
        if (zwd0Var2 == null) {
        }
    }

    public final FriendsListParams oo() {
        return (FriendsListParams) this.j0.getValue();
    }

    public final VkTopBar.Middle.Text po(String str) {
        return new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), ((oo() instanceof FriendsListParams.BestFriendsList) || (oo() instanceof FriendsListParams.FriendListCreation)) ? new VkTopBar.Middle.Text.c(tq.h(tlo0.Companion, oo() instanceof FriendsListParams.BestFriendsList ? R.string.best_friends_caption : R.string.lists_friends_caption), null, null, 30) : null, null, null, 12);
    }

    public final void qo() {
        int i = h7u0.p;
        h7u0.a c2 = h7u0.b.c(requireContext());
        c2.g0(R.string.lists_friends_delete_title);
        c2.U(R.string.lists_friends_delete_confirm);
        c2.c0(R.string.yes, new i4a0(this, 1));
        c2.W(R.string.no, null);
        c2.m();
    }

    public final void ro() {
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
        if (vkRecyclerPaginatedView == null) {
            vkRecyclerPaginatedView = null;
        }
        vkRecyclerPaginatedView.setNestedScrollingEnabled(true);
        VkSearchView vkSearchView = this.a0;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        vkSearchView.d0();
        VkSearchView vkSearchView2 = this.a0;
        (vkSearchView2 != null ? vkSearchView2 : null).setQuery("");
    }

    public final void so(int i) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(activity);
        aVar.u = new ikv0.d(y8g0.f(R.string.best_friends_limit_reached, Integer.valueOf(i)), (String) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(y8g0.a(R.dimen.clips_privacy_limit_reached_msg_margin));
        aVar.n();
    }

    public final void to() {
        h7u0.a c2;
        if (this.c0) {
            int i = h7u0.p;
            c2 = h7u0.b.c(bwt0.u(requireContext()));
        } else {
            int i2 = h7u0.p;
            c2 = h7u0.b.c(requireContext());
        }
        FriendsListParams oo = oo();
        if (oo instanceof FriendsListParams.BestFriendsList) {
            c2.g0(R.string.best_friends_confirm_save_title_new);
            c2.U(R.string.best_friends_confirm_save_message_new);
            c2.c0(R.string.save, new ekp(this, 1));
            c2.W(R.string.cancel, new DialogInterface.OnClickListener() { // from class: xsna.swd0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    int i4 = ProfileFriendsFragment.k0;
                    zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
                    if (zwd0Var != null) {
                        zwd0Var.fl();
                    }
                    dialogInterface.cancel();
                }
            });
            c2.m();
            return;
        }
        if (!(oo instanceof FriendsListParams.HiddenFriendsList)) {
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        c2.g0(R.string.hidden_friends_confirm_save_title);
        c2.U(R.string.hidden_friends_confirm_save_message);
        c2.c0(R.string.vkim_exit, new hrz(this, 2));
        c2.W(R.string.cancel, new DialogInterface.OnClickListener() { // from class: xsna.twd0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = ProfileFriendsFragment.k0;
                zwd0 zwd0Var = (zwd0) ProfileFriendsFragment.this.S;
                if (zwd0Var != null) {
                    zwd0Var.fl();
                }
                dialogInterface.cancel();
            }
        });
        c2.m();
    }

    public final <T> q<T> uo(q<T> qVar) {
        return bug0.d(qVar, getActivity(), null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hxd0
    public final void w6(ixd0 ixd0Var) {
        boolean z = false;
        if (ixd0Var.equals(ixd0.c.a)) {
            VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
            if (vkRecyclerPaginatedView == null) {
                vkRecyclerPaginatedView = null;
            }
            vkRecyclerPaginatedView.e0();
            VkSearchView vkSearchView = this.a0;
            if (vkSearchView == null) {
                vkSearchView = null;
            }
            bwt0.p0(vkSearchView, false);
            View view = this.X;
            bwt0.p0(view != null ? view : null, false);
            return;
        }
        if (ixd0Var.equals(ixd0.b.a)) {
            VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.Z;
            if (vkRecyclerPaginatedView2 == null) {
                vkRecyclerPaginatedView2 = null;
            }
            vkRecyclerPaginatedView2.g0();
            VkSearchView vkSearchView2 = this.a0;
            if (vkSearchView2 == null) {
                vkSearchView2 = null;
            }
            bwt0.p0(vkSearchView2, false);
            View view2 = this.X;
            bwt0.p0(view2 != null ? view2 : null, false);
            return;
        }
        if (!(ixd0Var instanceof ixd0.a)) {
            if (!(ixd0Var instanceof ixd0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.lists.c cVar = this.b0;
            if (cVar == null) {
                cVar = null;
            }
            cVar.v();
            List<hfz> list = ((ixd0.d) ixd0Var).a;
            if (list.isEmpty()) {
                VkRecyclerPaginatedView vkRecyclerPaginatedView3 = this.Z;
                if (vkRecyclerPaginatedView3 == null) {
                    vkRecyclerPaginatedView3 = null;
                }
                vkRecyclerPaginatedView3.qg(this.i0);
            } else {
                VkRecyclerPaginatedView vkRecyclerPaginatedView4 = this.Z;
                if (vkRecyclerPaginatedView4 == null) {
                    vkRecyclerPaginatedView4 = null;
                }
                vkRecyclerPaginatedView4.f0();
            }
            VkRecyclerPaginatedView vkRecyclerPaginatedView5 = this.Z;
            if (vkRecyclerPaginatedView5 == null) {
                vkRecyclerPaginatedView5 = null;
            }
            f4m.v(0, vkRecyclerPaginatedView5);
            VkSearchView vkSearchView3 = this.a0;
            if (vkSearchView3 == null) {
                vkSearchView3 = null;
            }
            bwt0.p0(vkSearchView3, true);
            View view3 = this.X;
            if (view3 == null) {
                view3 = null;
            }
            bwt0.p0(view3, false);
            com.vk.newsfeed.impl.posting.profilefriendslists.a aVar = this.U;
            (aVar != null ? aVar : null).setItems(list);
            return;
        }
        View view4 = this.X;
        if (view4 == null) {
            view4 = null;
        }
        qj80.a(view4, new c(view4, this));
        VkSearchView vkSearchView4 = this.a0;
        if (vkSearchView4 == null) {
            vkSearchView4 = null;
        }
        bwt0.p0(vkSearchView4, true);
        View view5 = this.X;
        if (view5 == null) {
            view5 = null;
        }
        bwt0.p0(view5, true);
        com.vk.newsfeed.impl.posting.profilefriendslists.a aVar2 = this.U;
        if (aVar2 == null) {
            aVar2 = null;
        }
        ixd0.a aVar3 = (ixd0.a) ixd0Var;
        int i = aVar3.b;
        aVar2.setItems(aVar3.a);
        VkRecyclerPaginatedView vkRecyclerPaginatedView6 = this.Z;
        if (vkRecyclerPaginatedView6 == null) {
            vkRecyclerPaginatedView6 = null;
        }
        vkRecyclerPaginatedView6.f0();
        Object[] objArr = i > 0;
        VkButton vkButton = this.W;
        if (vkButton == null) {
            vkButton = null;
        }
        if (aVar3.d && !aVar3.c) {
            z = true;
        }
        vkButton.setEnabled(z);
        Integer valueOf = (objArr == true && ((oo() instanceof FriendsListParams.BestFriendsList) || (oo() instanceof FriendsListParams.HiddenFriendsList))) ? Integer.valueOf(i) : null;
        VkButton vkButton2 = this.W;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.setCount(valueOf);
        com.vk.lists.c cVar2 = this.b0;
        com.vk.lists.c cVar3 = cVar2 == null ? null : cVar2;
        VkRecyclerPaginatedView vkRecyclerPaginatedView7 = this.Z;
        if (cVar3.q == (vkRecyclerPaginatedView7 == null ? null : vkRecyclerPaginatedView7)) {
            return;
        }
        (cVar2 == null ? null : cVar2).b(vkRecyclerPaginatedView7 == null ? null : vkRecyclerPaginatedView7, true, false, 0L, null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        FriendsListPrivacyType type;
        zwd0 zwd0Var = (zwd0) this.S;
        if (zwd0Var == null || (type = zwd0Var.getType()) == null) {
            return;
        }
        FriendsListPrivacyType friendsListPrivacyType = FriendsListPrivacyType.CLIP;
        uiTrackingScreen.a = (type == friendsListPrivacyType && (oo() instanceof FriendsListParams.FriendsListsWithFriends)) ? MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_FRIENDS_AND_FRIENDS_LISTS_PICKER : type == friendsListPrivacyType ? MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_FRIENDS_PICKER : MobileOfficialAppsCoreNavStat$EventScreen.PRIVACY_SELECT_FRIENDS_IN_LIST;
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}
