package com.vk.ecomm.market.good.ui.restriction;

import xsna.epx;
import xsna.ho8;

/* compiled from: ProductCardRestriction.kt */
/* loaded from: classes18.dex */
public interface b {

    /* compiled from: ProductCardRestriction.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1582239847;
        }

        public final String toString() {
            return "AdultOnly";
        }
    }

    /* compiled from: ProductCardRestriction.kt */
    /* renamed from: com.vk.ecomm.market.good.ui.restriction.b$b, reason: collision with other inner class name */
    public interface InterfaceC0949b extends b {

        /* compiled from: ProductCardRestriction.kt */
        /* renamed from: com.vk.ecomm.market.good.ui.restriction.b$b$a */
        public static final class a implements InterfaceC0949b {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OwnerSide(rulesUrl="), this.a, ')');
            }
        }

        /* compiled from: ProductCardRestriction.kt */
        /* renamed from: com.vk.ecomm.market.good.ui.restriction.b$b$b, reason: collision with other inner class name */
        public static final class C0950b implements InterfaceC0949b {
            public static final C0950b a = new C0950b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0950b);
            }

            public final int hashCode() {
                return 1458047793;
            }

            public final String toString() {
                return "UserSide";
            }
        }
    }

    /* compiled from: ProductCardRestriction.kt */
    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 998711015;
        }

        public final String toString() {
            return "ConfirmAdult";
        }
    }

    /* compiled from: ProductCardRestriction.kt */
    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1703023098;
        }

        public final String toString() {
            return "FunctionalityDisabled";
        }
    }

    /* compiled from: ProductCardRestriction.kt */
    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1259051236;
        }

        public final String toString() {
            return "SubscribeRequired";
        }
    }
}
