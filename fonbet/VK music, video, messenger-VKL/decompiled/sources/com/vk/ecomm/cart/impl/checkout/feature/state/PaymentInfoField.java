package com.vk.ecomm.cart.impl.checkout.feature.state;

import xsna.asp;
import xsna.b7r;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class PaymentInfoField extends b7r {
    public final String a;
    public final boolean b;
    public final Type c;
    public final String d;
    public final a e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutFields.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type IN_CHAT;
        public static final Type NOW;
        private final String value;

        /* compiled from: CheckoutFields.kt */
        public static final class a {
        }

        static {
            Type type = new Type("NOW", 0, "now");
            NOW = type;
            Type type2 = new Type("IN_CHAT", 1, "in_chat");
            IN_CHAT = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    /* compiled from: CheckoutFields.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tooltip(title=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", buttonText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public PaymentInfoField(String str, boolean z, Type type, String str2, a aVar) {
        this.a = str;
        this.b = z;
        this.c = type;
        this.d = str2;
        this.e = aVar;
    }

    @Override // xsna.b7r
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfoField)) {
            return false;
        }
        PaymentInfoField paymentInfoField = (PaymentInfoField) obj;
        return epx.f(this.a, paymentInfoField.a) && this.b == paymentInfoField.b && this.c == paymentInfoField.c && epx.f(this.d, paymentInfoField.d) && epx.f(this.e, paymentInfoField.e);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        a aVar = this.e;
        return a2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "PaymentInfoField(id=" + this.a + ", affectsPrice=" + this.b + ", type=" + this.c + ", title=" + this.d + ", tooltip=" + this.e + ')';
    }
}
