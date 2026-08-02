package com.vk.feed.settings.impl.presentation.filtered.tab;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import defpackage.q0;
import xsna.cfr;
import xsna.epx;
import xsna.gp;
import xsna.kj50;
import xsna.t230;
import xsna.vu5;

/* compiled from: NewsfeedFilterListAction.kt */
/* loaded from: classes18.dex */
public abstract class b implements kj50 {

    /* compiled from: NewsfeedFilterListAction.kt */
    public static final class a extends b {
        public final cfr<Group> b;
        public final boolean c;

        public a(cfr<Group> cfrVar, boolean z) {
            this.b = cfrVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppendGroupsPage(page=");
            sb.append(this.b);
            sb.append(", isReload=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: NewsfeedFilterListAction.kt */
    /* renamed from: com.vk.feed.settings.impl.presentation.filtered.tab.b$b, reason: collision with other inner class name */
    public static final class C1061b extends b {
        public final cfr<UserProfile> b;
        public final boolean c;

        public C1061b(cfr<UserProfile> cfrVar, boolean z) {
            this.b = cfrVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1061b)) {
                return false;
            }
            C1061b c1061b = (C1061b) obj;
            return epx.f(this.b, c1061b.b) && this.c == c1061b.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppendProfilesPage(page=");
            sb.append(this.b);
            sb.append(", isReload=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: NewsfeedFilterListAction.kt */
    public static final class c extends b {
        public final UserId b;
        public final t230 c;
        public final int d;

        public c(UserId userId, t230 t230Var, int i) {
            this.b = userId;
            this.c = t230Var;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ban(sourceId=");
            sb.append(this.b);
            sb.append(", source=");
            sb.append(this.c);
            sb.append(", position=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: NewsfeedFilterListAction.kt */
    public static final class d extends b {
        public static final d b = new d();
    }

    /* compiled from: NewsfeedFilterListAction.kt */
    public static abstract class e extends b {

        /* compiled from: NewsfeedFilterListAction.kt */
        public static final class a extends e {
            public static final a b = new a();
        }

        /* compiled from: NewsfeedFilterListAction.kt */
        /* renamed from: com.vk.feed.settings.impl.presentation.filtered.tab.b$e$b, reason: collision with other inner class name */
        public static final class C1062b extends e {
            public static final C1062b b = new C1062b();
        }
    }

    /* compiled from: NewsfeedFilterListAction.kt */
    public static final class f extends b {
        public final UserId b;

        public f(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Unban(sourceId="), this.b, ')');
        }
    }
}
