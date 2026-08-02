package com.vk.profile.community.details.impl.name_history;

import xsna.epx;
import xsna.oq;
import xsna.pah;
import xsna.xl50;

/* compiled from: CommunityNameHistoryPatch.kt */
/* loaded from: classes5.dex */
public abstract class c implements xl50 {

    /* compiled from: CommunityNameHistoryPatch.kt */
    public static abstract class a extends c {

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$a$a, reason: collision with other inner class name */
        public static final class C1556a extends a {
            public final Throwable b;

            public C1556a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1556a) && epx.f(this.b, ((C1556a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.b, ')');
            }
        }

        /* compiled from: CommunityNameHistoryPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$a$c, reason: collision with other inner class name */
        public static final class C1557c extends a {
            public final pah b;

            public C1557c(pah pahVar) {
                this.b = pahVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1557c) && epx.f(this.b, ((C1557c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.b + ')';
            }
        }
    }

    /* compiled from: CommunityNameHistoryPatch.kt */
    public static abstract class b extends c {

        /* compiled from: CommunityNameHistoryPatch.kt */
        public static final class a extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), null, ')');
            }
        }

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$b$b, reason: collision with other inner class name */
        public static final class C1558b extends b {
            public static final C1558b b = new C1558b();
        }

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$b$c, reason: collision with other inner class name */
        public static final class C1559c extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1559c)) {
                    return false;
                }
                ((C1559c) obj).getClass();
                return epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Success(data=" + ((Object) null) + ')';
            }
        }
    }

    /* compiled from: CommunityNameHistoryPatch.kt */
    /* renamed from: com.vk.profile.community.details.impl.name_history.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC1560c extends c {

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$c$a */
        public static final class a extends AbstractC1560c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.b, ')');
            }
        }

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$c$b */
        public static final class b extends AbstractC1560c {
            public static final b b = new b();
        }

        /* compiled from: CommunityNameHistoryPatch.kt */
        /* renamed from: com.vk.profile.community.details.impl.name_history.c$c$c, reason: collision with other inner class name */
        public static final class C1561c extends AbstractC1560c {
            public final pah b;

            public C1561c(pah pahVar) {
                this.b = pahVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1561c) && epx.f(this.b, ((C1561c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.b + ')';
            }
        }
    }
}
