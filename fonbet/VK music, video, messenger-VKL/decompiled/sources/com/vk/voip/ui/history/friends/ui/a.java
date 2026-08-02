package com.vk.voip.ui.history.friends.ui;

import xsna.bqw0;
import xsna.epx;

/* compiled from: VoipHistoryFriendsViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: VoipHistoryFriendsViewEvent.kt */
    /* renamed from: com.vk.voip.ui.history.friends.ui.a$a, reason: collision with other inner class name */
    public static final class C2057a extends a {
        public static final C2057a a = new C2057a();
    }

    /* compiled from: VoipHistoryFriendsViewEvent.kt */
    public static abstract class b extends a {

        /* compiled from: VoipHistoryFriendsViewEvent.kt */
        /* renamed from: com.vk.voip.ui.history.friends.ui.a$b$a, reason: collision with other inner class name */
        public static final class C2058a extends b {
            public final bqw0.b a;

            public C2058a(bqw0.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2058a) && epx.f(this.a, ((C2058a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CallAudio(friend=" + this.a + ')';
            }
        }

        /* compiled from: VoipHistoryFriendsViewEvent.kt */
        /* renamed from: com.vk.voip.ui.history.friends.ui.a$b$b, reason: collision with other inner class name */
        public static final class C2059b extends b {
            public final bqw0.b a;

            public C2059b(bqw0.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2059b) && epx.f(this.a, ((C2059b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CallVideo(friend=" + this.a + ')';
            }
        }

        /* compiled from: VoipHistoryFriendsViewEvent.kt */
        public static final class c extends b {
            public final bqw0.b a;

            public c(bqw0.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Item(friend=" + this.a + ')';
            }
        }
    }

    /* compiled from: VoipHistoryFriendsViewEvent.kt */
    public static final class c extends a {
        public static final c a = new c();
    }

    /* compiled from: VoipHistoryFriendsViewEvent.kt */
    public static final class d extends a {
        public static final d a = new d();
    }

    /* compiled from: VoipHistoryFriendsViewEvent.kt */
    public static final class e extends a {
        public static final e a = new e();
    }

    /* compiled from: VoipHistoryFriendsViewEvent.kt */
    public static final class f extends a {
        public static final f a = new f();
    }
}
