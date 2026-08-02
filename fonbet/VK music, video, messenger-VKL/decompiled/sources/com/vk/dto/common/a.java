package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: PeerExt.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final Peer.User a;

    static {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a = new Peer.User(100L);
    }

    public static final Peer a(UserId userId) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.b(userId.b);
    }

    public static final UserId b(Peer peer) {
        return new UserId(peer.b);
    }
}
