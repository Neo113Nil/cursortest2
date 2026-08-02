package com.vk.profilelist.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.h;
import com.vk.core.view.VKViewPager;
import com.vk.dto.common.id.UserId;
import com.vk.profilelist.api.ProfileListData;
import com.vk.profilelist.api.ProfileListTab;
import com.vk.profilelist.impl.fragments.FollowersClipsGridFragment;
import com.vk.profilelist.impl.fragments.GroupMembersListFragment;
import com.vk.profilelist.impl.fragments.SubscriptionsUserClipsGridFragment;
import com.vk.profilelist.impl.fragments.UserFriendsListFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.bwt0;
import xsna.eyd0;
import xsna.fyd0;
import xsna.oz50;
import xsna.rbe;
import xsna.vbs;

/* compiled from: ProfileListRootFragment.kt */
/* loaded from: classes5.dex */
public final class ProfileListRootFragment extends BaseFragment implements eyd0 {
    public static final /* synthetic */ int W = 0;
    public final bpn0 S = new bpn0(new fyd0(this, 0));
    public Toolbar T;
    public TabLayout U;
    public VKViewPager V;

    /* compiled from: ProfileListRootFragment.kt */
    public static final class a extends oz50 {
        public a(ProfileListData profileListData) {
            super(ProfileListRootFragment.class, null, null);
            this.j.putParcelable("profile_list_data", profileListData);
        }
    }

    /* compiled from: ProfileListRootFragment.kt */
    public static final class b extends h {
        public final UserId k;
        public final List<ProfileListTab> l;

        /* compiled from: ProfileListRootFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProfileListTab.values().length];
                try {
                    iArr[ProfileListTab.FOLLOWERS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProfileListTab.FRIENDS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProfileListTab.SUBSCRIPTIONS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProfileListTab.GROUP_MEMBERS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(vbs vbsVar, UserId userId, List<? extends ProfileListTab> list) {
            super(vbsVar, false);
            this.k = userId;
            this.l = list;
        }

        @Override // com.vk.core.fragments.h
        public final FragmentImpl c(int i) {
            int i2 = a.$EnumSwitchMapping$0[this.l.get(i).ordinal()];
            UserId userId = this.k;
            if (i2 == 1) {
                FollowersClipsGridFragment.a aVar = new FollowersClipsGridFragment.a(FollowersClipsGridFragment.class, null, null);
                Bundle bundle = aVar.j;
                bundle.putParcelable("uid", userId);
                bundle.putBoolean("__is_tab", true);
                bundle.putBoolean("with_actions", true);
                return aVar.f();
            }
            if (i2 == 2) {
                UserFriendsListFragment.a aVar2 = new UserFriendsListFragment.a(UserFriendsListFragment.class, null, null);
                Bundle bundle2 = aVar2.j;
                bundle2.putParcelable("uid", userId);
                bundle2.putBoolean("__is_tab", true);
                bundle2.putBoolean("with_actions", true);
                return aVar2.f();
            }
            if (i2 == 3) {
                SubscriptionsUserClipsGridFragment.a aVar3 = new SubscriptionsUserClipsGridFragment.a(SubscriptionsUserClipsGridFragment.class, null, null);
                Bundle bundle3 = aVar3.j;
                bundle3.putParcelable("uid", userId);
                bundle3.putBoolean("__is_tab", true);
                bundle3.putBoolean("with_actions", true);
                return aVar3.f();
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            GroupMembersListFragment.a aVar4 = new GroupMembersListFragment.a(GroupMembersListFragment.class, null, null);
            Bundle bundle4 = aVar4.j;
            bundle4.putParcelable("uid", userId);
            bundle4.putBoolean("__is_tab", true);
            bundle4.putBoolean("with_actions", true);
            return aVar4.f();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.l.size();
        }
    }

    @Override // xsna.eyd0
    public final void Gh(ProfileListTab profileListTab, String str) {
        List<ProfileListTab> list;
        ProfileListData profileListData = (ProfileListData) this.S.getValue();
        if (profileListData == null || (list = profileListData.d) == null) {
            return;
        }
        int indexOf = list.indexOf(profileListTab);
        TabLayout tabLayout = this.U;
        if (tabLayout == null) {
            tabLayout = null;
        }
        TabLayout.g b2 = tabLayout.b(indexOf);
        if (b2 != null) {
            b2.q(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UserId userId;
        List list;
        List<ProfileListTab> list2;
        View inflate = layoutInflater.inflate(R.layout.user_list_root_fragment, viewGroup, false);
        this.T = (Toolbar) inflate.findViewById(R.id.user_list_root_toolbar);
        this.U = (TabLayout) inflate.findViewById(R.id.user_list_root_tab_layout);
        this.V = (VKViewPager) inflate.findViewById(R.id.user_list_root_view_pager);
        Toolbar toolbar = this.T;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new rbe(this, 6));
        TabLayout tabLayout = this.U;
        if (tabLayout == null) {
            tabLayout = null;
        }
        bpn0 bpn0Var = this.S;
        ProfileListData profileListData = (ProfileListData) bpn0Var.getValue();
        bwt0.p0(tabLayout, ((profileListData == null || (list2 = profileListData.d) == null) ? 0 : list2.size()) > 1);
        VKViewPager vKViewPager = this.V;
        if (vKViewPager == null) {
            vKViewPager = null;
        }
        tabLayout.setupWithViewPager(vKViewPager);
        VKViewPager vKViewPager2 = this.V;
        if (vKViewPager2 == null) {
            vKViewPager2 = null;
        }
        vbs In = In();
        ProfileListData profileListData2 = (ProfileListData) bpn0Var.getValue();
        if (profileListData2 == null || (userId = profileListData2.b) == null) {
            userId = UserId.d;
        }
        ProfileListData profileListData3 = (ProfileListData) bpn0Var.getValue();
        if (profileListData3 == null || (list = profileListData3.d) == null) {
            list = EmptyList.b;
        }
        vKViewPager2.setAdapter(new b(In, userId, list));
        Toolbar toolbar2 = this.T;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        ProfileListData profileListData4 = (ProfileListData) bpn0Var.getValue();
        toolbar2.setTitle(profileListData4 != null ? profileListData4.c : null);
        return inflate;
    }
}
