package com.vk.ecomm.cart.impl.cart.feature.state;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.ho8;
import xsna.m6d0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class a {
    public final C0919a a;
    public final String b;
    public final m6d0 c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final List<b> h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final long l;

    /* compiled from: CartState.kt */
    /* renamed from: com.vk.ecomm.cart.impl.cart.feature.state.a$a, reason: collision with other inner class name */
    public static final class C0919a {
        public final long a;
        public final UserId b;
        public final UserId c;

        public C0919a(long j, UserId userId, UserId userId2) {
            this.a = j;
            this.b = userId;
            this.c = userId2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0919a)) {
                return false;
            }
            C0919a c0919a = (C0919a) obj;
            return this.a == c0919a.a && epx.f(this.b, c0919a.b) && epx.f(this.c, c0919a.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Id(productId=");
            sb.append(this.a);
            sb.append(", cartCommunityId=");
            sb.append(this.b);
            sb.append(", productCommunityId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: CartState.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Property(name=");
            sb.append(this.a);
            sb.append(", value=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public a(C0919a c0919a, String str, m6d0 m6d0Var, int i, int i2, boolean z, String str2, List<b> list, boolean z2, boolean z3, int i3, long j) {
        this.a = c0919a;
        this.b = str;
        this.c = m6d0Var;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = str2;
        this.h = list;
        this.i = z2;
        this.j = z3;
        this.k = i3;
        this.l = j;
    }

    public static a a(a aVar, boolean z, boolean z2, int i, int i2) {
        return new a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, (i2 & 256) != 0 ? aVar.i : z, (i2 & 512) != 0 ? aVar.j : z2, (i2 & 1024) != 0 ? aVar.k : i, aVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + shy.a(this.k, qoy.b(qoy.b(fw3.a(urd0.a(qoy.b(shy.a(this.e, shy.a(this.d, (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartProduct(id=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", price=");
        sb.append(this.c);
        sb.append(", stockAmount=");
        sb.append(this.d);
        sb.append(", originCartAmount=");
        sb.append(this.e);
        sb.append(", isAvailable=");
        sb.append(this.f);
        sb.append(", imageUrl=");
        sb.append(this.g);
        sb.append(", properties=");
        sb.append(this.h);
        sb.append(", isFavorite=");
        sb.append(this.i);
        sb.append(", isRemoving=");
        sb.append(this.j);
        sb.append(", userChangedAmount=");
        sb.append(this.k);
        sb.append(", alterVariantProductId=");
        return vu5.a(')', this.l, sb);
    }
}
