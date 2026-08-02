package com.vk.im.engine.internal.longpoll.response_handler;

import com.vk.im.engine.models.LongPollType;
import xsna.bh10;
import xsna.epx;
import xsna.iq;

/* compiled from: LongPollUpdate.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: LongPollUpdate.kt */
    /* renamed from: com.vk.im.engine.internal.longpoll.response_handler.a$a, reason: collision with other inner class name */
    public static final class C1117a implements a {
        public static final C1117a a = new C1117a();
        public static final LongPollType b = LongPollType.CHANNELS;

        @Override // com.vk.im.engine.internal.longpoll.response_handler.a
        public final LongPollType getType() {
            return b;
        }
    }

    /* compiled from: LongPollUpdate.kt */
    public static final class b implements a {
        public final String a;
        public final long b;
        public final Long c;
        public final LongPollType d = LongPollType.CHANNELS;

        public b(String str, Long l, long j) {
            this.a = str;
            this.b = j;
            this.c = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        @Override // com.vk.im.engine.internal.longpoll.response_handler.a
        public final LongPollType getType() {
            return this.d;
        }

        public final int hashCode() {
            String str = this.a;
            int a = bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Long l = this.c;
            return a + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityChannel(queue=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", oldTs=");
            return iq.b(sb, this.c, ')');
        }
    }

    /* compiled from: LongPollUpdate.kt */
    public static final class c implements a {
        public static final c a = new c();
        public static final LongPollType b = LongPollType.MESSAGES;

        @Override // com.vk.im.engine.internal.longpoll.response_handler.a
        public final LongPollType getType() {
            return b;
        }
    }

    LongPollType getType();
}
