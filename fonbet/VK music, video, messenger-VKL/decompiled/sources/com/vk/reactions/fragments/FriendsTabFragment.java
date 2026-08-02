package com.vk.reactions.fragments;

import com.vk.reactions.fragments.BaseReactionsTabFragment;
import xsna.t2f0;
import xsna.u6f0;
import xsna.vts;

/* compiled from: FriendsTabFragment.kt */
/* loaded from: classes5.dex */
public final class FriendsTabFragment extends BaseReactionsTabFragment {
    public final vts Z;
    public final t2f0 a0;

    /* compiled from: FriendsTabFragment.kt */
    public static final class a extends BaseReactionsTabFragment.a {
        public a() {
            super(FriendsTabFragment.class, null, null);
        }
    }

    public FriendsTabFragment() {
        vts vtsVar = new vts(this);
        this.Z = vtsVar;
        this.a0 = new t2f0(vtsVar.c);
    }

    @Override // xsna.v6f0
    public final t2f0 getAdapter() {
        return this.a0;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final u6f0 io() {
        return this.Z;
    }
}
