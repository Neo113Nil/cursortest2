package com.vk.profile.community.members.impl.ui;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.lj50;

/* compiled from: MembersAction.kt */
/* loaded from: classes5.dex */
public interface a extends lj50 {

    /* compiled from: MembersAction.kt */
    /* renamed from: com.vk.profile.community.members.impl.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC1632a extends a {
    }

    /* compiled from: MembersAction.kt */
    public static final class b implements InterfaceC1632a {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnBannerActionButtonClick(url="), this.b, ')');
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class c implements InterfaceC1632a {
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
            return ho8.a(new StringBuilder("OnBannerCloseClick(bannerId="), this.b, ')');
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class d implements InterfaceC1632a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1539484112;
        }

        public final String toString() {
            return "OnBannerShown";
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class e implements a {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("OnChangeVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class f implements a {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 424232304;
        }

        public final String toString() {
            return "OnDonutStateChanged";
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class g implements a {
        public final UserId b;

        public g(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnMemberClick(userId="), this.b, ')');
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class h implements a {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 932940006;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class i implements a {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -946068718;
        }

        public final String toString() {
            return "OnRefreshAfterError";
        }
    }

    /* compiled from: MembersAction.kt */
    public static final class j implements a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -232356513;
        }

        public final String toString() {
            return "OnScrolledToEnd";
        }
    }
}
