package com.vk.ecomm.cart.impl.cart.feature.state;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class c {
    public final UserId a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<a> e;
    public final int f;
    public final boolean g;

    /* compiled from: CartState.kt */
    public static final class a {
        public final String a;
        public final DeliveryOptionType b;

        public a(String str, DeliveryOptionType deliveryOptionType) {
            this.a = str;
            this.b = deliveryOptionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DeliveryInfo(name=" + this.a + ", type=" + this.b + ')';
        }
    }

    public c(UserId userId, String str, String str2, boolean z, List<a> list, int i, boolean z2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = i;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && epx.f(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + shy.a(this.f, fw3.a(qoy.b(urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityInfo(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", verified=");
        sb.append(this.d);
        sb.append(", deliveries=");
        sb.append(this.e);
        sb.append(", contactId=");
        sb.append(this.f);
        sb.append(", subscribed=");
        return q0.a(sb, this.g, ')');
    }
}
