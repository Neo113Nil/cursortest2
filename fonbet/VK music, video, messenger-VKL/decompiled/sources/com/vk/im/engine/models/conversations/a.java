package com.vk.im.engine.models.conversations;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import kotlin.collections.EmptyList;

/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final BotKeyboard a;

    static {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a = new BotKeyboard(Peer.Unknown.e, false, false, 1, EmptyList.b);
    }
}
