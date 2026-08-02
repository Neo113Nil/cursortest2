package com.vk.auth.passport;

import xsna.epx;
import xsna.ho8;

/* compiled from: VkPassportContract.kt */
/* loaded from: classes15.dex */
public abstract class e {

    /* compiled from: VkPassportContract.kt */
    public static final class a extends e {
        public final String a;

        public a(String str) {
            super(str);
            this.a = str;
        }

        @Override // com.vk.auth.passport.e
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("BindCard(text="), this.a, ')');
        }
    }

    /* compiled from: VkPassportContract.kt */
    public static final class b extends e {
        public final String a;

        public b(String str) {
            super(str);
            this.a = str;
        }

        @Override // com.vk.auth.passport.e
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("HasCard(text="), this.a, ')');
        }
    }

    /* compiled from: VkPassportContract.kt */
    public static final class c extends e {
        public final String a;

        public c(String str) {
            super(str);
            this.a = str;
        }

        @Override // com.vk.auth.passport.e
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NoVkPay(text="), this.a, ')');
        }
    }

    /* compiled from: VkPassportContract.kt */
    public static final class d extends e {
        public final String a;

        public d(String str) {
            super(str);
            this.a = str;
        }

        @Override // com.vk.auth.passport.e
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Open(text="), this.a, ')');
        }
    }

    public e(String str) {
    }

    public abstract String a();
}
