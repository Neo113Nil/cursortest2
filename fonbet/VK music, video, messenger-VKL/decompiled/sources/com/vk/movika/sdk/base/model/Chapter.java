package com.vk.movika.sdk.base.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.epx;
import xsna.msy;
import xsna.xe9;
import xsna.zrp;

/* loaded from: classes3.dex */
public final class Chapter implements k {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final List<j> f;
    public final Order g;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new b(this, 0));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Order {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order END;
        public static final Order SIMPLE;
        public static final Order START;

        static {
            Order order = new Order("START", 0);
            START = order;
            Order order2 = new Order("SIMPLE", 1);
            SIMPLE = order2;
            Order order3 = new Order("END", 2);
            END = order3;
            Order[] orderArr = {order, order2, order3};
            $VALUES = orderArr;
            $ENTRIES = new asp(orderArr);
        }

        public Order() {
            throw null;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }
    }

    public Chapter(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, Order order) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = list;
        this.g = order;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.movika.sdk.base.model.k
    public final List<j> b() {
        return (List) this.h.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Chapter.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.a, ((Chapter) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = xe9.a("Chapter(id=", this.a, ", videoId=", this.b, ", episodes=");
        a.append(this.c);
        a.append(", containers=");
        a.append(this.d);
        a.append(", branches=");
        a.append(this.e);
        a.append(", selfEvents=");
        a.append(this.f);
        a.append(", order=");
        a.append(this.g);
        a.append(")");
        return a.toString();
    }
}
