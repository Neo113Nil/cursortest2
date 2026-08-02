package com.vk.friends.impl.followers.presentation.fragments;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.e3s;
import xsna.eth0;
import xsna.h3s;
import xsna.im0;
import xsna.j7;
import xsna.km50;
import xsna.msy;
import xsna.o3s;
import xsna.ots;
import xsna.oz50;
import xsna.p3s;
import xsna.sa0;
import xsna.vk50;
import xsna.zi50;

/* compiled from: AllFollowersListFragment.kt */
/* loaded from: classes15.dex */
public final class AllFollowersListFragment extends AbsFollowersListFragment {
    public static final /* synthetic */ int c0 = 0;
    public final Object Z = msy.a(LazyThreadSafetyMode.NONE, new sa0(this, 5));
    public final bpn0 a0 = new bpn0(new im0(this, 3));
    public final j7 b0 = new j7(this, 2);

    /* compiled from: AllFollowersListFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, String str) {
            super(AllFollowersListFragment.class, null, null);
            this.j.putParcelable("uid", userId);
            this.j.putString("title", str);
        }
    }

    @Override // com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment
    public final UserId fo() {
        return (UserId) this.a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment
    public final eth0 go() {
        return (eth0) this.Z.getValue();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId = (UserId) requireArguments().getParcelable("uid");
        if (userId == null) {
            userId = UserId.d;
        }
        return new h3s(new p3s(userId, new ots(), new zi50()), new o3s(), e3s.b.a.b);
    }
}
