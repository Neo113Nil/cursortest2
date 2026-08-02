package com.vk.im.engine.internal.storage.delegates.channel_messages;

import xsna.sgl0;
import xsna.tgl0;

/* compiled from: ChannelMessageHistoryMetaDb.kt */
/* loaded from: classes2.dex */
public final class a {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    public a(tgl0 tgl0Var, boolean z) {
        this.a = new sgl0(z ? "channel_postponed_messages_history_meta" : "channel_messages_history_meta", ChannelMessageHistoryMetaColumn.class);
        this.b = tgl0Var;
    }
}
