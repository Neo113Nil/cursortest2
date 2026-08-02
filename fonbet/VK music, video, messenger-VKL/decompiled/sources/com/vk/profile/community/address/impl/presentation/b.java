package com.vk.profile.community.address.impl.presentation;

import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import xsna.fer0;
import xsna.ofx;
import xsna.vj00;

/* compiled from: CommunityAddressesFragment.kt */
/* loaded from: classes5.dex */
public final class b implements fer0 {
    public final /* synthetic */ CommunityAddressesFragment b;

    public b(CommunityAddressesFragment communityAddressesFragment) {
        this.b = communityAddressesFragment;
    }

    @Override // xsna.fer0
    public final void i(int i) {
        CommunityAddressesFragment communityAddressesFragment = this.b;
        if (!communityAddressesFragment.z0) {
            communityAddressesFragment.y0 = 0;
        }
        vj00 vj00Var = ofx.a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        vj00Var.getClass();
        if (i == 1) {
            CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
            (gVar != null ? gVar : null).d();
        }
    }
}
