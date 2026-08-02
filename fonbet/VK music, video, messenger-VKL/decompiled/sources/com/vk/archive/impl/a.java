package com.vk.archive.impl;

import android.content.Context;
import android.os.Bundle;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.channels.api.ChannelHistoryOpenMode;
import xsna.fib;
import xsna.g2v;
import xsna.o25;
import xsna.yi3;
import xsna.zyv;

/* compiled from: ImArchiveRouter.kt */
/* loaded from: classes15.dex */
public final class a implements yi3 {
    public final fib a;

    public a(zyv zyvVar) {
        this.a = zyvVar;
    }

    @Override // xsna.yi3
    public final void a(long j, Context context) {
        this.a.c(context, j, ChannelHistoryOpenMode.OpenAtUnread.b, null);
    }

    public final void b(Context context) {
        boolean c = o25.c(o25.a());
        g2v.c().getClass();
        ArchiveWithChannelsFragment.b bVar = new ArchiveWithChannelsFragment.b(ArchiveWithChannelsFragment.class, null, null);
        Bundle bundle = bVar.j;
        bundle.putBoolean("channels_renamed", c);
        bundle.putBoolean("show_channel_item_as_default_dialog", true);
        bVar.k(context);
    }
}
