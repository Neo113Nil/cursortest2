package com.vk.channels.impl.donut;

import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ChannelDonutSupportAction.kt */
/* loaded from: classes16.dex */
public interface a extends kj50 {

    /* compiled from: ChannelDonutSupportAction.kt */
    /* renamed from: com.vk.channels.impl.donut.a$a, reason: collision with other inner class name */
    public static final class C0536a implements a {
        public static final C0536a b = new C0536a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0536a);
        }

        public final int hashCode() {
            return -1036636489;
        }

        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ChannelDonutSupportAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -559621715;
        }

        public final String toString() {
            return "ConnectClicked";
        }
    }

    /* compiled from: ChannelDonutSupportAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1340344790;
        }

        public final String toString() {
            return "HelpClicked";
        }
    }

    /* compiled from: ChannelDonutSupportAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1036415264;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChannelDonutSupportAction.kt */
    public static final class e implements a {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NameChanged(name="), this.b, ')');
        }
    }

    /* compiled from: ChannelDonutSupportAction.kt */
    public static final class f implements a {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PriceChanged(price="), this.b, ')');
        }
    }
}
