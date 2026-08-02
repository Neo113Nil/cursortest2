package com.vk.profile.community.impl.ui.events;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.lj50;

/* compiled from: CommunityEventsAction.kt */
/* loaded from: classes5.dex */
public interface a extends lj50 {

    /* compiled from: CommunityEventsAction.kt */
    /* renamed from: com.vk.profile.community.impl.ui.events.a$a, reason: collision with other inner class name */
    public static final class C1564a implements a {
        public static final C1564a b = new C1564a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1564a);
        }

        public final int hashCode() {
            return -1644042234;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: CommunityEventsAction.kt */
    public static final class b implements a {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ClickCommunity(groupId="), this.b, ')');
        }
    }

    /* compiled from: CommunityEventsAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 589210473;
        }

        public final String toString() {
            return "ClickRetry";
        }
    }

    /* compiled from: CommunityEventsAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -105484414;
        }

        public final String toString() {
            return "ClickRetryLoadNext";
        }
    }

    /* compiled from: CommunityEventsAction.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1855793314;
        }

        public final String toString() {
            return "LoadNext";
        }
    }
}
