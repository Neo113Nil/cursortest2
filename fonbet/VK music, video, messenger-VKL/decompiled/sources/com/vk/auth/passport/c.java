package com.vk.auth.passport;

import xsna.epx;
import xsna.ho8;

/* compiled from: VkPassportContract.kt */
/* loaded from: classes15.dex */
public abstract class c {
    public final String a;

    /* compiled from: VkPassportContract.kt */
    public static final class a extends c {
        public final String b;

        public a(String str) {
            super(str);
            this.b = str;
        }

        @Override // com.vk.auth.passport.c
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("HasSubscription(text="), this.b, ')');
        }
    }

    /* compiled from: VkPassportContract.kt */
    public static final class b extends c {
        public static final b b = new b(new String());
    }

    /* compiled from: VkPassportContract.kt */
    /* renamed from: com.vk.auth.passport.c$c, reason: collision with other inner class name */
    public static final class C0412c extends c {
        public final String b;

        public C0412c(String str) {
            super(str);
            this.b = str;
        }

        @Override // com.vk.auth.passport.c
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0412c) && epx.f(this.b, ((C0412c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NoSubscription(text="), this.b, ')');
        }
    }

    public c(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
