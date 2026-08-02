package com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import kotlin.LazyThreadSafetyMode;
import xsna.bqz0;
import xsna.eth0;
import xsna.f4z;
import xsna.fks;
import xsna.gls;
import xsna.km50;
import xsna.l4s;
import xsna.mls;
import xsna.msy;
import xsna.nef;
import xsna.ots;
import xsna.oz50;
import xsna.p2q0;
import xsna.pfl;
import xsna.u1r0;
import xsna.vk50;
import xsna.wj50;

/* compiled from: FollowersTabFragment.kt */
/* loaded from: classes15.dex */
public final class FollowersTabFragment extends AbsFriendsAndFollowersTabFragment {
    public static final /* synthetic */ int c0 = 0;
    public final MobileOfficialAppsCoreNavStat$EventScreen Y = MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_ALL_FOLLOWERS;
    public final Object Z = msy.a(LazyThreadSafetyMode.NONE, new nef(this, 11));
    public final bqz0 a0;
    public final bqz0 b0;

    /* compiled from: FollowersTabFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(FollowersTabFragment.class, null, null);
            this.j.putParcelable("uid", userId);
        }
    }

    public FollowersTabFragment() {
        bqz0 bqz0Var = new bqz0(this.U);
        this.a0 = bqz0Var;
        this.b0 = bqz0Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return lo().a0();
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
    public final eth0 lo() {
        return (eth0) this.Z.getValue();
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lo().onConfigurationChanged(configuration);
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        lo().onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        lo().onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        lo().onResume();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        lo().b(new pfl(view));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        l4s l4sVar = new l4s(this.R, t0.a(this.Y), new ots(), new u1r0());
        wj50<fks> io2 = io();
        mls mlsVar = new mls();
        return new gls(l4sVar, this.a0, (f4z) io2, null, mlsVar);
    }
}
