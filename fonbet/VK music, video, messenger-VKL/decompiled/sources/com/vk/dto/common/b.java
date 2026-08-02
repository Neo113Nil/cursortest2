package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: Peer.kt */
/* loaded from: classes18.dex */
public final class b {
    public static final boolean a(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.f(j) == Peer.Type.CHAT;
    }

    public static final boolean b(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.f(j) == Peer.Type.CONTACT;
    }

    public static final boolean c(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.f(j) == Peer.Type.GROUP;
    }

    public static final boolean d(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.f(j) == Peer.Type.USER;
    }

    public static final Peer e(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.b(j);
    }
}
