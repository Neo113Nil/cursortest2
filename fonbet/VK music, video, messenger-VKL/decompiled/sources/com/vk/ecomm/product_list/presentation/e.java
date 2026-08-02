package com.vk.ecomm.product_list.presentation;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.lj50;
import xsna.vpd0;

/* compiled from: ProductListMviAction.kt */
/* loaded from: classes18.dex */
public interface e extends lj50 {

    /* compiled from: ProductListMviAction.kt */
    public static final class a implements e {
        public final vpd0 b;

        public a(vpd0 vpd0Var) {
            this.b = vpd0Var;
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
            return "ClickChangeFave(item=" + this.b + ')';
        }
    }

    /* compiled from: ProductListMviAction.kt */
    public static final class b implements e {
        public final vpd0 b;

        public b(vpd0 vpd0Var) {
            this.b = vpd0Var;
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
            return "ClickProduct(item=" + this.b + ')';
        }
    }

    /* compiled from: ProductListMviAction.kt */
    public static final class c implements e {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1004038736;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ProductListMviAction.kt */
    public static final class d implements e {
        public final long b;
        public final UserId c;
        public final boolean d;

        public d(long j, UserId userId, boolean z) {
            this.b = j;
            this.c = userId;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnFaveChange(productId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", isFave=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ProductListMviAction.kt */
    /* renamed from: com.vk.ecomm.product_list.presentation.e$e, reason: collision with other inner class name */
    public static final class C1002e implements e {
        public static final C1002e b = new C1002e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1002e);
        }

        public final int hashCode() {
            return -233837038;
        }

        public final String toString() {
            return "RecalculateRestrictions";
        }
    }

    /* compiled from: ProductListMviAction.kt */
    public static final class f implements e {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -990389664;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: ProductListMviAction.kt */
    public static final class g implements e {
        public final String b;

        public g(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TrackOpenProduct(fullId="), this.b, ')');
        }
    }

    /* compiled from: ProductListMviAction.kt */
    public static final class h implements e {
        public final String b;

        public h(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TrackProductView(fullId="), this.b, ')');
        }
    }
}
