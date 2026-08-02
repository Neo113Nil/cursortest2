package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ModerationBlockedItemMVI.kt */
/* loaded from: classes18.dex */
public interface a extends kj50 {

    /* compiled from: ModerationBlockedItemMVI.kt */
    /* renamed from: com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a$a, reason: collision with other inner class name */
    public static final class C0952a implements a {
        public static final C0952a b = new C0952a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0952a);
        }

        public final int hashCode() {
            return -622615193;
        }

        public final String toString() {
            return "Delete";
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1582611508;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class c implements a {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LinkClicked(link="), this.b, ')');
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1172763102;
        }

        public final String toString() {
            return "RequestDelete";
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1231464557;
        }

        public final String toString() {
            return "Support";
        }
    }
}
