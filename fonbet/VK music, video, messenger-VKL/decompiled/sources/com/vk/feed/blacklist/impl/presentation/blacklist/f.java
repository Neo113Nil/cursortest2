package com.vk.feed.blacklist.impl.presentation.blacklist;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import xsna.epx;
import xsna.gp;
import xsna.oq;
import xsna.shy;

/* compiled from: BlacklistSideEffect.kt */
/* loaded from: classes18.dex */
public abstract class f {

    /* compiled from: BlacklistSideEffect.kt */
    public static abstract class a extends f {

        /* compiled from: BlacklistSideEffect.kt */
        /* renamed from: com.vk.feed.blacklist.impl.presentation.blacklist.f$a$a, reason: collision with other inner class name */
        public static final class C1034a extends a {
            public final UserId a;

            public C1034a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1034a) && epx.f(this.a, ((C1034a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenProfile(sourceId="), this.a, ')');
            }
        }
    }

    /* compiled from: BlacklistSideEffect.kt */
    public static abstract class b extends f {

        /* compiled from: BlacklistSideEffect.kt */
        public static final class a extends b {
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
                return oq.c(new StringBuilder("ErrorMessage(error="), this.a, ')');
            }
        }

        /* compiled from: BlacklistSideEffect.kt */
        /* renamed from: com.vk.feed.blacklist.impl.presentation.blacklist.f$b$b, reason: collision with other inner class name */
        public static final class C1035b extends f {
            public final UserId a;
            public final int b;
            public final UserProfile c;

            public C1035b(UserId userId, int i, UserProfile userProfile) {
                this.a = userId;
                this.b = i;
                this.c = userProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1035b)) {
                    return false;
                }
                C1035b c1035b = (C1035b) obj;
                return epx.f(this.a, c1035b.a) && this.b == c1035b.b && epx.f(this.c, c1035b.c);
            }

            public final int hashCode() {
                int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
                UserProfile userProfile = this.c;
                return a + (userProfile == null ? 0 : userProfile.hashCode());
            }

            public final String toString() {
                return "UnbanSuccessMessage(sourceId=" + this.a + ", position=" + this.b + ", profile=" + this.c + ')';
            }
        }
    }
}
