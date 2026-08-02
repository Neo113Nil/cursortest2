package com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import kotlin.LazyThreadSafetyMode;
import xsna.bts;
import xsna.gls;
import xsna.jp80;
import xsna.km50;
import xsna.l1i;
import xsna.mls;
import xsna.msy;
import xsna.om3;
import xsna.ots;
import xsna.oz50;
import xsna.p2q0;
import xsna.u1r0;
import xsna.uth0;
import xsna.vk50;

/* compiled from: OnlineFriendsTabFragment.kt */
/* loaded from: classes15.dex */
public final class OnlineFriendsTabFragment extends AbsFriendsAndFollowersTabFragment {
    public static final /* synthetic */ int c0 = 0;
    public final MobileOfficialAppsCoreNavStat$EventScreen Y = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ONLINE;
    public final Object Z = msy.a(LazyThreadSafetyMode.NONE, new l1i(this, 21));
    public final om3 a0;
    public final om3 b0;

    /* compiled from: OnlineFriendsTabFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(OnlineFriendsTabFragment.class, null, null);
            this.j.putParcelable("uid", userId);
        }
    }

    public OnlineFriendsTabFragment() {
        om3 om3Var = new om3(this.U);
        this.a0 = om3Var;
        this.b0 = om3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ((uth0) this.Z.getValue()).getClass();
        return false;
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment
    public final MobileOfficialAppsCoreNavStat$EventScreen ho() {
        return this.Y;
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment
    public final p2q0 jo() {
        return this.b0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((uth0) this.Z.getValue()).onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((uth0) this.Z.getValue()).onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((uth0) this.Z.getValue()).onResume();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((uth0) this.Z.getValue()).a(new bts(view, 0));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new gls(new jp80(this.R, t0.a(this.Y), new ots(), new u1r0()), this.a0, io(), FriendsAndFollowersTabType.ONLINE_FRIENDS, new mls());
    }
}
