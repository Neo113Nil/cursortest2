package com.vk.channels.impl.comments;

import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.channels.ChannelType;
import xsna.epx;
import xsna.gp;
import xsna.vl50;
import xsna.vu5;

/* compiled from: ChannelCommentsNavEvent.kt */
/* loaded from: classes16.dex */
public abstract class c implements vl50 {

    /* compiled from: ChannelCommentsNavEvent.kt */
    public static final class a extends c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 309292613;
        }

        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ChannelCommentsNavEvent.kt */
    public static final class b extends c {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(id="), this.a, ')');
        }
    }

    /* compiled from: ChannelCommentsNavEvent.kt */
    /* renamed from: com.vk.channels.impl.comments.c$c, reason: collision with other inner class name */
    public static final class C0532c extends c {
        public final long a;
        public final ChannelType b;
        public final int c;

        public C0532c(long j, ChannelType channelType, int i) {
            this.a = j;
            this.b = channelType;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0532c)) {
                return false;
            }
            C0532c c0532c = (C0532c) obj;
            return this.a == c0532c.a && this.b == c0532c.b && this.c == c0532c.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReportComment(channelId=");
            sb.append(this.a);
            sb.append(", channelType=");
            sb.append(this.b);
            sb.append(", commentId=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
