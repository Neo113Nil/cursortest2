package com.vk.ecomm.cart.impl.checkout.feature.state;

import xsna.asp;
import xsna.b7r;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class ActionField extends b7r {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e = "";
    public final Type f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutFields.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type DO_ORDER;
        public static final Type OPEN_COURIER_MAP;
        public static final Type OPEN_SELF_MAP;
        public static final Type PAY;
        public static final Type WRITE_TO_MERCHANT;
        private final String actionName;
        private final boolean isPaymentAction;

        /* compiled from: CheckoutFields.kt */
        public static final class a {
        }

        static {
            Type type = new Type("OPEN_SELF_MAP", 0, "open_self_map", false);
            OPEN_SELF_MAP = type;
            Type type2 = new Type("OPEN_COURIER_MAP", 1, "open_courier_map", false);
            OPEN_COURIER_MAP = type2;
            Type type3 = new Type("DO_ORDER", 2, "do_order", true);
            DO_ORDER = type3;
            Type type4 = new Type("WRITE_TO_MERCHANT", 3, "write_to_merchant", true);
            WRITE_TO_MERCHANT = type4;
            Type type5 = new Type("PAY", 4, "pay", true);
            PAY = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2, boolean z) {
            this.actionName = str2;
            this.isPaymentAction = z;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.actionName;
        }

        public final boolean i() {
            return this.isPaymentAction;
        }
    }

    public ActionField(String str, boolean z, boolean z2, String str2, Type type) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.f = type;
    }

    @Override // xsna.b7r
    public final boolean b() {
        return false;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionField)) {
            return false;
        }
        ActionField actionField = (ActionField) obj;
        return epx.f(this.a, actionField.a) && this.b == actionField.b && this.c == actionField.c && epx.f(this.d, actionField.d) && epx.f(this.e, actionField.e) && this.f == actionField.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, false), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ActionField(id=" + this.a + ", affectsPrice=false, isAccent=" + this.b + ", isDisabled=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", type=" + this.f + ')';
    }
}
