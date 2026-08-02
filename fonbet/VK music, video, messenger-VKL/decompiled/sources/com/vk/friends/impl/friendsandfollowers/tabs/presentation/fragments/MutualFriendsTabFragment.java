package com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments;

import android.os.Bundle;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import kotlin.LazyThreadSafetyMode;
import xsna.bhu;
import xsna.bts;
import xsna.f4z;
import xsna.fpf0;
import xsna.gls;
import xsna.gp;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mls;
import xsna.msy;
import xsna.ots;
import xsna.oz50;
import xsna.p2q0;
import xsna.u1r0;
import xsna.uth0;
import xsna.vk50;
import xsna.w4u;
import xsna.yi50;

/* compiled from: MutualFriendsTabFragment.kt */
/* loaded from: classes15.dex */
public final class MutualFriendsTabFragment extends AbsFriendsAndFollowersTabFragment {
    public static final /* synthetic */ int b0 = 0;
    public final MobileOfficialAppsCoreNavStat$EventScreen Y = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_MUTUAL;
    public final Object Z = msy.a(LazyThreadSafetyMode.NONE, new w4u(this, 21));
    public final bhu a0 = new bhu();

    /* compiled from: MutualFriendsTabFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, boolean z) {
            super(MutualFriendsTabFragment.class, null, null);
            this.j.putParcelable("uid", userId);
            this.j.putBoolean("can_access_profile", z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return false;
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment
    public final bhu go() {
        return this.a0;
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment
    public final MobileOfficialAppsCoreNavStat$EventScreen ho() {
        return this.Y;
    }

    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment
    public final /* bridge */ /* synthetic */ p2q0 jo() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        uth0 uth0Var = (uth0) this.Z.getValue();
        if (uth0Var != null) {
            uth0Var.onDestroyView();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        uth0 uth0Var = (uth0) this.Z.getValue();
        if (uth0Var != null) {
            uth0Var.onPause();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        uth0 uth0Var = (uth0) this.Z.getValue();
        if (uth0Var != null) {
            uth0Var.onResume();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        uth0 uth0Var = (uth0) this.Z.getValue();
        if (uth0Var != null) {
            uth0Var.a(new bts(requireView(), 0));
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new gls(new yi50(((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s().c(), this.R, t0.a(this.Y), new ots(), new u1r0()), new gp(25), (f4z) io(), null, new mls());
    }
}
