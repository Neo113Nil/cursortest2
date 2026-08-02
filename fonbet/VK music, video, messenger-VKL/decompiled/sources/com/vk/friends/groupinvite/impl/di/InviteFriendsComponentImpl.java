package com.vk.friends.groupinvite.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.friends.groupinvite.api.di.InviteFriendsComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.rrx;
import xsna.vqx;

/* compiled from: InviteFriendsComponentImpl.kt */
/* loaded from: classes14.dex */
public final class InviteFriendsComponentImpl implements InviteFriendsComponent {

    /* compiled from: InviteFriendsComponentImpl.kt */
    public static final class a implements b7m<InviteFriendsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new InviteFriendsComponentImpl();
        }
    }

    @Override // com.vk.friends.groupinvite.api.di.InviteFriendsComponent
    public final rrx a() {
        return new rrx();
    }

    @Override // com.vk.friends.groupinvite.api.di.InviteFriendsComponent
    public final vqx d() {
        return new vqx();
    }
}
