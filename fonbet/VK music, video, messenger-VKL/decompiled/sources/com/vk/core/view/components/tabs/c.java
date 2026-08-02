package com.vk.core.view.components.tabs;

import xsna.uqi;
import xsna.vby;

/* compiled from: Tab.kt */
/* loaded from: classes17.dex */
public interface c {

    /* compiled from: Tab.kt */
    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1430924205;
        }

        public final String toString() {
            return "Badge";
        }
    }

    /* compiled from: Tab.kt */
    @vby
    public static final class b implements c {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("Counter(value=", this.a, ')');
        }
    }

    /* compiled from: Tab.kt */
    /* renamed from: com.vk.core.view.components.tabs.c$c, reason: collision with other inner class name */
    public static final class C0866c implements c {
        public static final C0866c a = new C0866c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0866c);
        }

        public final int hashCode() {
            return 2124740078;
        }

        public final String toString() {
            return "None";
        }
    }
}
