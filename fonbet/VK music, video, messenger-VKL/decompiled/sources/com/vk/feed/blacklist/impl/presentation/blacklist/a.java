package com.vk.feed.blacklist.impl.presentation.blacklist;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.gp;
import xsna.kj50;
import xsna.u06;
import xsna.vu5;

/* compiled from: BlacklistAction.kt */
/* loaded from: classes18.dex */
public abstract class a implements kj50 {

    /* compiled from: BlacklistAction.kt */
    /* renamed from: com.vk.feed.blacklist.impl.presentation.blacklist.a$a, reason: collision with other inner class name */
    public static final class C1032a extends a {
        public final u06 b;
        public final boolean c;

        public C1032a(u06 u06Var, boolean z) {
            this.b = u06Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1032a)) {
                return false;
            }
            C1032a c1032a = (C1032a) obj;
            return epx.f(this.b, c1032a.b) && this.c == c1032a.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppendBannedPage(page=");
            sb.append(this.b);
            sb.append(", isReload=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: BlacklistAction.kt */
    public static final class b extends a {
        public final UserId b;
        public final int c;

        public b(UserId userId, int i) {
            this.b = userId;
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
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ban(sourceId=");
            sb.append(this.b);
            sb.append(", position=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: BlacklistAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: BlacklistAction.kt */
    public static final class d extends a {
        public final UserId b;

        public d(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Unban(sourceId="), this.b, ')');
        }
    }
}
