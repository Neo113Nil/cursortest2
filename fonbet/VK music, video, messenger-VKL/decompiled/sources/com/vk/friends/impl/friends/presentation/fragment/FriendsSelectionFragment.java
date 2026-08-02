package com.vk.friends.impl.friends.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.vk.api.users.UsersSearch;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vk.friends.impl.friends.di.FriendsListComponent;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.acw0;
import xsna.az;
import xsna.b8;
import xsna.d02;
import xsna.dh8;
import xsna.dof;
import xsna.ets;
import xsna.fpf0;
import xsna.fqs;
import xsna.gzs;
import xsna.hg1;
import xsna.hg6;
import xsna.hts;
import xsna.iah0;
import xsna.its;
import xsna.izs;
import xsna.jd6;
import xsna.jts;
import xsna.kts;
import xsna.lts;
import xsna.m7m;
import xsna.md6;
import xsna.n5i;
import xsna.nqs;
import xsna.nrl;
import xsna.o44;
import xsna.oc0;
import xsna.p4g;
import xsna.py;
import xsna.s3q0;
import xsna.t1e;
import xsna.tlo0;
import xsna.xf1;
import xsna.xim0;
import xsna.xqs;
import xsna.y87;

/* compiled from: FriendsSelectionFragment.kt */
/* loaded from: classes15.dex */
public final class FriendsSelectionFragment extends AbsFriendsFragment<md6, ets> {
    public static final /* synthetic */ int w0 = 0;
    public VkTopBar m0;
    public ActionMode n0;
    public jts o0;
    public gzs<s3q0> p0 = new n5i(this, 16);
    public int q0;
    public izs<? super UserProfile, s3q0> r0;
    public y87 s0;
    public gzs<s3q0> t0;
    public UsersSearch.Entrypoint u0;
    public boolean v0;

    /* compiled from: FriendsSelectionFragment.kt */
    public static final class a extends AbsFriendsFragment.a {
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment, xsna.yqs
    public final void d8(hg6<nqs> hg6Var) {
        super.d8(hg6Var);
        to();
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment
    public final ets no(hg6 hg6Var) {
        FriendsSelectionType friendsSelectionType;
        String string;
        Object obj = this.h0;
        dh8 dh8Var = new dh8(1, obj != null ? obj : null, md6.class, "isSelected", "isSelected(Lcom/vk/dto/common/id/UserId;)Z", 0, 3);
        Object obj2 = this.h0;
        hts htsVar = new hts(2, obj2 != null ? obj2 : null, md6.class, "onProfileSelected", "onProfileSelected(Lcom/vk/dto/user/UserProfile;Z)V", 0);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("selection_type")) == null || (friendsSelectionType = FriendsSelectionType.valueOf(string)) == null) {
            friendsSelectionType = FriendsSelectionType.SINGLE;
        }
        return new ets(hg6Var, dh8Var, htsVar, friendsSelectionType);
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.q0 = arguments != null ? arguments.getInt("initially_selected_users_count") : 0;
        if (bundle != null) {
            Object obj = this.h0;
            if (obj == null) {
                obj = null;
            }
            LinkedHashMap linkedHashMap = ((md6) obj).m;
            Iterable parcelableArrayList = bundle.getParcelableArrayList("key_saved_selected_ids");
            if (parcelableArrayList == null) {
                parcelableArrayList = EmptyList.b;
            }
            linkedHashMap.clear();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((UserId) it.next(), null);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Object obj = this.h0;
        if (obj == null) {
            obj = null;
        }
        bundle.putParcelableArrayList("key_saved_selected_ids", p4g.q(((md6) obj).m.keySet()));
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        VkSearchView vkSearchView = new VkSearchView(requireContext, null, 6, 0);
        vkSearchView.setVoiceActionDelegate(new nrl(requireContext, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
        int i = 23;
        hg1.a(d02.y(vkSearchView, 300L, 2).U(new b8(new py(26), i)).subscribe(new xf1(new t1e(this, 26), i), new az(new oc0(22), 25)), kn());
        vkSearchView.X4(false);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.search_query_view_container);
        if (viewGroup != null) {
            viewGroup.addView(vkSearchView);
        }
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment
    public final xqs oo(AbsFriendsFragment absFriendsFragment, Bundle bundle) {
        FriendsListType friendsListType;
        List list;
        FriendsSelectionType friendsSelectionType;
        String string;
        String string2;
        Bundle arguments = getArguments();
        UserId userId = arguments != null ? (UserId) arguments.getParcelable("user_id") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("list_type")) == null || (friendsListType = FriendsListType.valueOf(string2)) == null) {
            friendsListType = FriendsListType.ALL;
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("referrer") : null;
        Bundle arguments4 = getArguments();
        boolean z = false;
        jd6 jd6Var = new jd6(friendsListType, userId, string3, arguments4 != null ? arguments4.getBoolean("global_search_enabled") : false);
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (list = arguments5.getParcelableArrayList("preselected_user_ids")) == null) {
            list = EmptyList.b;
        }
        List list2 = list;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (string = arguments6.getString("selection_type")) == null || (friendsSelectionType = FriendsSelectionType.valueOf(string)) == null) {
            friendsSelectionType = FriendsSelectionType.SINGLE;
        }
        FriendsSelectionType friendsSelectionType2 = friendsSelectionType;
        if (bundle != null && !this.v0) {
            z = true;
        }
        fqs b9 = ((FriendsListComponent) m7m.d(this).a(fpf0.a(FriendsListComponent.class))).b9();
        return !z ? new kts(jd6Var, absFriendsFragment, list2, friendsSelectionType2, this.r0, this.s0, this.t0, this.j0, new its(0, this, FriendsSelectionFragment.class, "updateActionMode", "updateActionMode()V", 0, 0), this.u0, b9) : new lts(friendsSelectionType2, jd6Var, absFriendsFragment, list2, this.u0, b9);
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment
    public final int qo() {
        int i;
        int width = (po().getWidth() - po().getPaddingLeft()) - po().getPaddingRight();
        if (this.V >= 600) {
            i = iah0.a(this.U ? 160.0f : 270.0f);
        } else {
            i = width;
        }
        if (width * i == 0) {
            return 1;
        }
        return width / i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void to() {
        Object obj = this.h0;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        if (((md6) obj2).m.size() <= 0 && this.q0 == 0) {
            this.p0 = null;
            ActionMode actionMode = this.n0;
            if (actionMode != null) {
                actionMode.finish();
                return;
            }
            return;
        }
        this.p0 = new dof(this, 26);
        if (this.n0 != null) {
            VkTopBar vkTopBar = this.m0;
            if (vkTopBar != null) {
                tlo0.a aVar = tlo0.Companion;
                Object obj3 = this.h0;
                Object[] objArr = {Integer.valueOf(((md6) (obj3 != null ? obj3 : null)).m.size())};
                aVar.getClass();
                vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0.a.c(R.string.friends_selection_title, objArr), null, null, null, null, 30), null, false ? 1 : 0, false ? 1 : 0, 14));
            }
        } else {
            if (this.o0 == null) {
                this.o0 = new jts(this);
            }
            kn().startActionMode(this.o0);
        }
        View findViewById = kn().findViewById(R$id.action_mode_close_button);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
