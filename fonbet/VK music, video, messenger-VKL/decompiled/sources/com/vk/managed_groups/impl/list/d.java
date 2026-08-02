package com.vk.managed_groups.impl.list;

import com.vk.managed_groups.impl.list.b;
import xsna.yp80;

/* compiled from: ManagedGroupsListFragment.kt */
/* loaded from: classes3.dex */
public final class d implements yp80 {
    public final /* synthetic */ b.a b;

    public d(ManagedGroupsListFragment managedGroupsListFragment, b.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.yp80
    public final void onSuccess() {
        ManagedGroupsListFragment.fo(this.b.a.d);
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public final void U() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
    }
}
