package com.vk.im.channelcreation.impl;

import android.content.Context;
import com.vk.im.channelcreation.impl.ChannelCreationFragment;
import xsna.jbs;

/* compiled from: ChannelCreationRouterImpl.kt */
/* loaded from: classes2.dex */
public final class f implements com.vk.im.channelcreation.api.a {
    @Override // com.vk.im.channelcreation.api.a
    public final void a(long j, jbs jbsVar) {
        new ChannelCreationFragment.a(new ChannelCreationFragment.b.a(j)).i(jbsVar, 6);
    }

    @Override // com.vk.im.channelcreation.api.a
    public final void b(long j, Context context) {
        new ChannelCreationFragment.a(new ChannelCreationFragment.b.C1091b(j)).k(context);
    }
}
