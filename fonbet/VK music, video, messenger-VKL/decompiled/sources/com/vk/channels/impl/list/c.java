package com.vk.channels.impl.list;

import android.view.View;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.dto.common.Peer;
import java.lang.ref.WeakReference;
import xsna.epx;
import xsna.eq;
import xsna.ho8;
import xsna.qoy;
import xsna.qtd0;
import xsna.vl50;

/* compiled from: ChannelsListNavigationEvent.kt */
/* loaded from: classes16.dex */
public abstract class c implements vl50 {

    /* compiled from: ChannelsListNavigationEvent.kt */
    public static final class a extends c {
        public final long a;
        public final ChannelEntryPoint b;

        public a(long j, ChannelEntryPoint channelEntryPoint) {
            this.a = j;
            this.b = channelEntryPoint;
        }
    }

    /* compiled from: ChannelsListNavigationEvent.kt */
    public static final class b extends c {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenChannelShowcaseApp(url="), this.a, ')');
        }
    }

    /* compiled from: ChannelsListNavigationEvent.kt */
    /* renamed from: com.vk.channels.impl.list.c$c, reason: collision with other inner class name */
    public static final class C0537c extends c {
        public final qtd0 a;
        public final boolean b;
        public final WeakReference<View> c;

        public C0537c(qtd0 qtd0Var, boolean z, WeakReference<View> weakReference) {
            this.a = qtd0Var;
            this.b = z;
            this.c = weakReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0537c)) {
                return false;
            }
            C0537c c0537c = (C0537c) obj;
            return epx.f(this.a, c0537c.a) && this.b == c0537c.b && epx.f(this.c, c0537c.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "OpenStoryViewer(profile=" + this.a + ", hasUnseenStatus=" + this.b + ", anchorViewRef=" + this.c + ')';
        }
    }

    /* compiled from: ChannelsListNavigationEvent.kt */
    public static final class d extends c {
        public final Peer a;

        public d(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("ShowUnarchiveSnackbar(channelId="), this.a, ')');
        }
    }
}
