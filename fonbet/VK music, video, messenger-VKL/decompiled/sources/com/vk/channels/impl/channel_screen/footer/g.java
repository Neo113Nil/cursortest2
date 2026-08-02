package com.vk.channels.impl.channel_screen.footer;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.vl50;
import xsna.vu5;

/* compiled from: ChannelFooterNavigationEvent.kt */
/* loaded from: classes16.dex */
public abstract class g implements vl50 {

    /* compiled from: ChannelFooterNavigationEvent.kt */
    public static final class a extends g {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
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
            return gp.b(new StringBuilder("OpenCommunity(channelId="), this.a, ')');
        }
    }

    /* compiled from: ChannelFooterNavigationEvent.kt */
    public static final class b extends g {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("OpenCreateMessage(channelId="));
        }
    }

    /* compiled from: ChannelFooterNavigationEvent.kt */
    public static final class c extends g {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("OpenPostponedPosts(channelId="));
        }
    }
}
