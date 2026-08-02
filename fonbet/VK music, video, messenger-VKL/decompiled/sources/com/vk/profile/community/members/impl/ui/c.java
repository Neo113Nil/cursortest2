package com.vk.profile.community.members.impl.ui;

import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.domain.User;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.yl50;

/* compiled from: MembersPatch.kt */
/* loaded from: classes5.dex */
public interface c extends yl50 {

    /* compiled from: MembersPatch.kt */
    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1581942981;
        }

        public final String toString() {
            return "BeforePaginationLoading";
        }
    }

    /* compiled from: MembersPatch.kt */
    public static final class b implements c {
        public final List<User> a;
        public final boolean b;
        public final boolean c;
        public final String d;

        public b(String str, List list, boolean z, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = z2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MembersLoaded(data=");
            sb.append(this.a);
            sb.append(", isForce=");
            sb.append(this.b);
            sb.append(", hasNext=");
            sb.append(this.c);
            sb.append(", offset=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: MembersPatch.kt */
    /* renamed from: com.vk.profile.community.members.impl.ui.c$c, reason: collision with other inner class name */
    public static final class C1634c implements c {
        public final MembersListBanner a;
        public final boolean b;

        public C1634c(MembersListBanner membersListBanner, boolean z) {
            this.a = membersListBanner;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1634c)) {
                return false;
            }
            C1634c c1634c = (C1634c) obj;
            return epx.f(this.a, c1634c.a) && this.b == c1634c.b;
        }

        public final int hashCode() {
            MembersListBanner membersListBanner = this.a;
            return Boolean.hashCode(this.b) + ((membersListBanner == null ? 0 : membersListBanner.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateBanner(banner=");
            sb.append(this.a);
            sb.append(", isPullToRefresh=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MembersPatch.kt */
    public static final class d implements c {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1584975880;
        }

        public final String toString() {
            return "UpdateErrorMembersNotAvailable";
        }
    }

    /* compiled from: MembersPatch.kt */
    public static final class e implements c {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateIsRefreshing(isRefresh="), this.a, ')');
        }
    }

    /* compiled from: MembersPatch.kt */
    public static final class f implements c {
        public final Exception a;

        public f(Exception exc) {
            this.a = exc;
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
            return "UpdateLocalizedError(localizedError=" + this.a + ')';
        }
    }
}
