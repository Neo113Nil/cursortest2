package com.vk.ecomm.cart.impl.cart.feature.state;

import java.util.LinkedHashMap;
import xsna.adp0;
import xsna.asp;
import xsna.d990;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.uf3;
import xsna.zrp;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class Cart {
    public final c a;
    public final LinkedHashMap<Long, a> b;
    public final boolean c;
    public final adp0 d;
    public final boolean e;
    public final d990 f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final Type j;
    public final String k;
    public final String l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CartState.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type MARKET;
        public static final Type OZON;

        static {
            Type type = new Type("MARKET", 0);
            MARKET = type;
            Type type2 = new Type("OZON", 1);
            OZON = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Cart(c cVar, LinkedHashMap<Long, a> linkedHashMap, boolean z, adp0 adp0Var, boolean z2, d990 d990Var, boolean z3, boolean z4, int i, Type type, String str, String str2) {
        this.a = cVar;
        this.b = linkedHashMap;
        this.c = z;
        this.d = adp0Var;
        this.e = z2;
        this.f = d990Var;
        this.g = z3;
        this.h = z4;
        this.i = i;
        this.j = type;
        this.k = str;
        this.l = str2;
    }

    public static Cart a(Cart cart, c cVar, adp0 adp0Var, d990 d990Var, boolean z, int i, int i2) {
        c cVar2 = (i2 & 1) != 0 ? cart.a : cVar;
        LinkedHashMap<Long, a> linkedHashMap = cart.b;
        boolean z2 = cart.c;
        adp0 adp0Var2 = (i2 & 8) != 0 ? cart.d : adp0Var;
        boolean z3 = cart.e;
        d990 d990Var2 = (i2 & 32) != 0 ? cart.f : d990Var;
        boolean z4 = (i2 & 64) != 0 ? cart.g : true;
        boolean z5 = (i2 & 128) != 0 ? cart.h : z;
        int i3 = (i2 & 256) != 0 ? cart.i : i;
        Type type = cart.j;
        String str = cart.k;
        String str2 = cart.l;
        cart.getClass();
        return new Cart(cVar2, linkedHashMap, z2, adp0Var2, z3, d990Var2, z4, z5, i3, type, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) obj;
        return epx.f(this.a, cart.a) && epx.f(this.b, cart.b) && this.c == cart.c && epx.f(this.d, cart.d) && this.e == cart.e && epx.f(this.f, cart.f) && this.g == cart.g && this.h == cart.h && this.i == cart.i && this.j == cart.j && epx.f(this.k, cart.k) && epx.f(this.l, cart.l);
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + shy.a(this.i, qoy.b(qoy.b((this.f.hashCode() + qoy.b((this.d.hashCode() + qoy.b(uf3.b(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31)) * 31;
        String str = this.k;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cart(communityInfo=");
        sb.append(this.a);
        sb.append(", products=");
        sb.append(this.b);
        sb.append(", containsDeletedItems=");
        sb.append(this.c);
        sb.append(", summary=");
        sb.append(this.d);
        sb.append(", vkPayCanTransfer=");
        sb.append(this.e);
        sb.append(", page=");
        sb.append(this.f);
        sb.append(", isInfoHidden=");
        sb.append(this.g);
        sb.append(", isRemoving=");
        sb.append(this.h);
        sb.append(", totalUniqueItemsCount=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(", externalCreateOrderUrl=");
        sb.append(this.k);
        sb.append(", userAgreement=");
        return ho8.a(sb, this.l, ')');
    }
}
