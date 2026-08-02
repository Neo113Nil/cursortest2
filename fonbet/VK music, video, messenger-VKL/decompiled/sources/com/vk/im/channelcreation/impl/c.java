package com.vk.im.channelcreation.impl;

import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.eq;
import xsna.vl50;

/* compiled from: ChannelCreationNavigationEvent.kt */
/* loaded from: classes2.dex */
public abstract class c implements vl50 {

    /* compiled from: ChannelCreationNavigationEvent.kt */
    public static final class a extends c {
        public final Peer a;

        public a(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("FinishCreationWithSuccess(channelPeer="), this.a, ')');
        }
    }

    /* compiled from: ChannelCreationNavigationEvent.kt */
    public static final class b extends c {
        public static final b a = new b();
    }

    /* compiled from: ChannelCreationNavigationEvent.kt */
    /* renamed from: com.vk.im.channelcreation.impl.c$c, reason: collision with other inner class name */
    public static final class C1094c extends c {
        public static final C1094c a = new C1094c();
    }

    /* compiled from: ChannelCreationNavigationEvent.kt */
    public static final class d extends c {
        public static final d a = new d();
    }

    /* compiled from: ChannelCreationNavigationEvent.kt */
    public static final class e extends c {
        public static final e a = new e();
    }

    /* compiled from: ChannelCreationNavigationEvent.kt */
    public static final class f extends c {
        public static final f a = new f();
    }
}
