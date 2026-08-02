package com.vk.reactions.fragments;

import com.vk.reactions.fragments.BaseReactionsTabFragment;
import xsna.qu1;
import xsna.t2f0;
import xsna.u6f0;

/* compiled from: AllReactionsTabFragment.kt */
/* loaded from: classes5.dex */
public final class AllReactionsTabFragment extends BaseReactionsTabFragment {
    public final qu1 Z;
    public final t2f0 a0;

    /* compiled from: AllReactionsTabFragment.kt */
    public static final class a extends BaseReactionsTabFragment.a {
        public a() {
            super(AllReactionsTabFragment.class, null, null);
        }
    }

    public AllReactionsTabFragment() {
        qu1 qu1Var = new qu1(this);
        this.Z = qu1Var;
        this.a0 = new t2f0(qu1Var.c);
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
