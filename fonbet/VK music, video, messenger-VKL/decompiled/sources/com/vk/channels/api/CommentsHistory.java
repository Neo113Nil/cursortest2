package com.vk.channels.api;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.hag;
import xsna.r060;
import xsna.shy;
import xsna.zrp;

/* compiled from: CommentsHistory.kt */
/* loaded from: classes16.dex */
public final class CommentsHistory {
    public static final CommentsHistory h = new CommentsHistory(EmptyList.b, 0, Order.ASC, null, null, 112);
    public final List<hag> a;
    public final int b;
    public final int c;
    public final Order d;
    public final String e;
    public final String f;
    public final r060 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommentsHistory.kt */
    public static final class Order {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order ASC;
        public static final Order DESC;

        static {
            Order order = new Order("ASC", 0);
            ASC = order;
            Order order2 = new Order("DESC", 1);
            DESC = order2;
            Order[] orderArr = {order, order2};
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

    public CommentsHistory(List<hag> list, int i, int i2, Order order, String str, String str2, r060 r060Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = order;
        this.e = str;
        this.f = str2;
        this.g = r060Var;
    }

    public static CommentsHistory a(CommentsHistory commentsHistory, ArrayList arrayList, int i, int i2, String str, String str2, r060 r060Var, int i3) {
        if ((i3 & 2) != 0) {
            i = commentsHistory.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = commentsHistory.c;
        }
        int i5 = i2;
        Order order = commentsHistory.d;
        if ((i3 & 16) != 0) {
            str = commentsHistory.e;
        }
        String str3 = str;
        if ((i3 & 32) != 0) {
            str2 = commentsHistory.f;
        }
        String str4 = str2;
        if ((i3 & 64) != 0) {
            r060Var = commentsHistory.g;
        }
        commentsHistory.getClass();
        return new CommentsHistory(arrayList, i4, i5, order, str3, str4, r060Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentsHistory)) {
            return false;
        }
        CommentsHistory commentsHistory = (CommentsHistory) obj;
        return epx.f(this.a, commentsHistory.a) && this.b == commentsHistory.b && this.c == commentsHistory.c && this.d == commentsHistory.d && epx.f(this.e, commentsHistory.e) && epx.f(this.f, commentsHistory.f) && epx.f(this.g, commentsHistory.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r060 r060Var = this.g;
        return hashCode3 + (r060Var != null ? r060Var.hashCode() : 0);
    }

    public final String toString() {
        return "CommentsHistory(comments=" + this.a + ", levelCommentsCount=" + this.b + ", totalCommentsCount=" + this.c + ", order=" + this.d + ", nextFrom=" + this.e + ", prevFrom=" + this.f + ", negativeRepliesPlaceHolder=" + this.g + ')';
    }

    public /* synthetic */ CommentsHistory(List list, int i, Order order, String str, r060 r060Var, int i2) {
        this(list, 0, i, order, (i2 & 16) != 0 ? null : str, null, (i2 & 64) != 0 ? null : r060Var);
    }
}
