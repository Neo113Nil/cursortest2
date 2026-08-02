package com.vk.ecomm.cart.impl.checkout.feature.state;

import java.util.List;
import java.util.NoSuchElementException;
import xsna.asp;
import xsna.b7r;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class PaymentOptionsField extends b7r {
    public final String a;
    public final boolean b;
    public final List<Option> c;
    public final Option.Type d;

    /* compiled from: CheckoutFields.kt */
    public static final class Option {
        public final Type a;
        public final String b;
        public final String c;
        public final boolean d;
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
                public static Type a(String str) {
                    for (Type type : Type.h()) {
                        if (epx.f(type.i(), str)) {
                            return type;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
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

        public Option(Type type, String str, String str2, boolean z, a aVar) {
            this.a = type;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return this.a == option.a && epx.f(this.b, option.b) && epx.f(this.c, option.c) && this.d == option.d && epx.f(this.e, option.e);
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            a aVar = this.e;
            return b + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "Option(type=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", isEnabled=" + this.d + ", tooltip=" + this.e + ')';
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
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tooltip(title=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", dismissText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public PaymentOptionsField(String str, boolean z, List<Option> list, Option.Type type) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = type;
    }

    public static PaymentOptionsField d(PaymentOptionsField paymentOptionsField, Option.Type type) {
        String str = paymentOptionsField.a;
        boolean z = paymentOptionsField.b;
        List<Option> list = paymentOptionsField.c;
        paymentOptionsField.getClass();
        return new PaymentOptionsField(str, z, list, type);
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
        if (!(obj instanceof PaymentOptionsField)) {
            return false;
        }
        PaymentOptionsField paymentOptionsField = (PaymentOptionsField) obj;
        return epx.f(this.a, paymentOptionsField.a) && this.b == paymentOptionsField.b && epx.f(this.c, paymentOptionsField.c) && this.d == paymentOptionsField.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PaymentOptionsField(id=" + this.a + ", affectsPrice=" + this.b + ", options=" + this.c + ", selected=" + this.d + ')';
    }
}
