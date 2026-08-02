package com.vk.feed.settings.impl.presentation.filtered.tab;

import com.vk.dto.common.id.UserId;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import xsna.epx;
import xsna.gp;
import xsna.oq;
import xsna.t230;
import xsna.vu5;

/* compiled from: NewsfeedFilterListSideEffect.kt */
/* loaded from: classes18.dex */
public abstract class f {

    /* compiled from: NewsfeedFilterListSideEffect.kt */
    public static abstract class a extends f {

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        /* renamed from: com.vk.feed.settings.impl.presentation.filtered.tab.f$a$a, reason: collision with other inner class name */
        public static final class C1064a extends a {
            public final UserId a;

            public C1064a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1064a) && epx.f(this.a, ((C1064a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("CancelUnban(sourceId="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class b extends a {
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
                return gp.b(new StringBuilder("OpenProfile(sourceId="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class c extends a {
            public final UserId a;

            public c(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Unban(sourceId="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedFilterListSideEffect.kt */
    public static abstract class b extends f {

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class a extends b {
            public final FilteredSourceType a;
            public final int b;

            public a(FilteredSourceType filteredSourceType, int i) {
                this.a = filteredSourceType;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Update(type=");
                sb.append(this.a);
                sb.append(", value=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: NewsfeedFilterListSideEffect.kt */
    public static abstract class c extends f {

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class a extends c {
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
                return gp.b(new StringBuilder("OpenProfile(sourceId="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedFilterListSideEffect.kt */
    public static abstract class d extends f {

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class a extends d {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("ErrorMessage(throwable="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class b extends d {
            public final UserId a;
            public final t230 b;
            public final int c;

            public b(UserId userId, t230 t230Var, int i) {
                this.a = userId;
                this.b = t230Var;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UnbanSuccessMessage(sourceId=");
                sb.append(this.a);
                sb.append(", item=");
                sb.append(this.b);
                sb.append(", position=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: NewsfeedFilterListSideEffect.kt */
    public static abstract class e extends f {

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class a extends e {
            public static final a a = new a();
        }

        /* compiled from: NewsfeedFilterListSideEffect.kt */
        public static final class b extends e {
            public static final b a = new b();
        }
    }
}
