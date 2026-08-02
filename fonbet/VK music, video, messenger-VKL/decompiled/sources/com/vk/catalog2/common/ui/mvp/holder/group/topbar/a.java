package com.vk.catalog2.common.ui.mvp.holder.group.topbar;

import xsna.epx;
import xsna.ho8;

/* compiled from: CommunitiesTopBarAction.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: CommunitiesTopBarAction.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.holder.group.topbar.a$a, reason: collision with other inner class name */
    public static final class C0502a implements a {
        public static final C0502a a = new C0502a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0502a);
        }

        public final int hashCode() {
            return 1654896886;
        }

        public final String toString() {
            return "AvatarClick";
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 49236186;
        }

        public final String toString() {
            return "AvatarLongClick";
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1934285848;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class d implements a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 764028723;
        }

        public final String toString() {
            return "CreateClick";
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class e implements a {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -150771226;
        }

        public final String toString() {
            return "FiltersClick";
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class f implements a {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QueryUpdated(new="), this.a, ')');
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class g implements a {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SearchClick(query="), this.a, ')');
        }
    }

    /* compiled from: CommunitiesTopBarAction.kt */
    public static final class h implements a {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 2122165063;
        }

        public final String toString() {
            return "VoiceSearchClick";
        }
    }
}
