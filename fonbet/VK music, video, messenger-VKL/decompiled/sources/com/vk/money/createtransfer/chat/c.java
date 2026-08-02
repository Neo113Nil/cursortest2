package com.vk.money.createtransfer.chat;

import xsna.a370;
import xsna.vtb;
import xsna.vu5;

/* compiled from: RecommendedAmountController.kt */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: RecommendedAmountController.kt */
    public static abstract class a {

        /* compiled from: RecommendedAmountController.kt */
        /* renamed from: com.vk.money.createtransfer.chat.c$a$a, reason: collision with other inner class name */
        public static final class C1282a extends a {
            public static final C1282a a = new C1282a();
        }

        /* compiled from: RecommendedAmountController.kt */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("MaximumRestriction(amount="), this.a, ')');
            }
        }

        /* compiled from: RecommendedAmountController.kt */
        /* renamed from: com.vk.money.createtransfer.chat.c$a$c, reason: collision with other inner class name */
        public static final class C1283c extends a {
            public final int a;

            public C1283c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1283c) && this.a == ((C1283c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("MinimumRestriction(amount="), this.a, ')');
            }
        }

        /* compiled from: RecommendedAmountController.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    public static int a(vtb vtbVar, int i) {
        int ceil = (int) Math.ceil(i / Math.max(r0.d - (!vtbVar.b.c ? 1 : 0), 1));
        a370 a370Var = vtbVar.c;
        return Math.min(vtbVar.a.a(), Math.min(Math.max(ceil, a370Var.a.b), a370Var.a.c));
    }
}
