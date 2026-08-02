package com.vk.reactions.fragments;

import com.vk.reactions.fragments.BaseReactionsTabFragment;
import xsna.bm6;
import xsna.t2f0;
import xsna.u6f0;

/* compiled from: SharesTabFragment.kt */
/* loaded from: classes5.dex */
public final class SharesTabFragment extends BaseReactionsTabFragment {
    public final bm6 Z;
    public final t2f0 a0;

    /* compiled from: SharesTabFragment.kt */
    public static final class a extends BaseReactionsTabFragment.a {
        public a() {
            super(SharesTabFragment.class, null, null);
        }
    }

    public SharesTabFragment() {
        bm6 bm6Var = new bm6(this);
        this.Z = bm6Var;
        this.a0 = new t2f0(bm6Var.c);
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
