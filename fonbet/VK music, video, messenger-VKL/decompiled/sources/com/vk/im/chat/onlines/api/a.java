package com.vk.im.chat.onlines.api;

import com.vk.dto.common.Peer;
import xsna.ksr;
import xsna.ufp;

/* compiled from: ChatOnlineMembersLoader.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: ChatOnlineMembersLoader.kt */
    /* renamed from: com.vk.im.chat.onlines.api.a$a, reason: collision with other inner class name */
    public static final class C1098a {
        public static final /* synthetic */ C1098a a = new C1098a();
        private static final a STUB = new C1099a();

        /* compiled from: ChatOnlineMembersLoader.kt */
        /* renamed from: com.vk.im.chat.onlines.api.a$a$a, reason: collision with other inner class name */
        public static final class C1099a implements a {
            @Override // com.vk.im.chat.onlines.api.a
            public final ksr<Integer> a(Peer peer, Peer peer2) {
                return ufp.b;
            }
        }

        public final a getSTUB() {
            return STUB;
        }
    }

    ksr<Integer> a(Peer peer, Peer peer2);
}
