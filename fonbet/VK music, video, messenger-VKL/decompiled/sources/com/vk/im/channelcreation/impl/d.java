package com.vk.im.channelcreation.impl;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.im.channelcreation.impl.c;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import defpackage.u;
import kotlin.NoWhenBranchMatchedException;
import xsna.hm50;
import xsna.jbs;
import xsna.mxv;
import xsna.qcy;
import xsna.s3q0;

/* compiled from: ChannelCreationNavigationEventRouter.kt */
/* loaded from: classes2.dex */
public final class d implements hm50<c> {
    public final ChannelCreationFragment a;
    public final mxv b;

    public d(ChannelCreationFragment channelCreationFragment, mxv mxvVar) {
        this.a = channelCreationFragment;
        this.b = mxvVar;
    }

    @Override // xsna.hm50
    public final void a(c cVar) {
        c cVar2 = cVar;
        boolean equals = cVar2.equals(c.e.a);
        ChannelCreationFragment channelCreationFragment = this.a;
        if (equals) {
            jbs jbsVar = new jbs(channelCreationFragment);
            PermissionHelper permissionHelper = PermissionHelper.a;
            FragmentActivity kn = channelCreationFragment.kn();
            permissionHelper.getClass();
            PermissionHelper.f(permissionHelper, kn, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new com.vk.newsfeed.common.recycler.holders.attachments.a(8, this, jbsVar), null, 32);
            return;
        }
        if (cVar2.equals(c.f.a)) {
            jbs jbsVar2 = new jbs(channelCreationFragment);
            PermissionHelper permissionHelper2 = PermissionHelper.a;
            FragmentActivity kn2 = channelCreationFragment.kn();
            permissionHelper2.getClass();
            PermissionHelper.f(permissionHelper2, kn2, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new u(4, this, jbsVar2), null, 32);
            return;
        }
        if (cVar2 instanceof c.a) {
            Intent intent = new Intent();
            intent.putExtra("channel_id", ((c.a) cVar2).a);
            s3q0 s3q0Var = s3q0.a;
            channelCreationFragment.Mf(-1, intent);
            return;
        }
        if (cVar2 instanceof c.C1094c) {
            channelCreationFragment.finish();
            return;
        }
        if (cVar2 instanceof c.d) {
            qcy<Object>[] qcyVarArr = FragmentImpl.M;
            channelCreationFragment.Mf(0, null);
        } else {
            if (!(cVar2 instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.b.b().R(channelCreationFragment.requireContext());
        }
    }
}
