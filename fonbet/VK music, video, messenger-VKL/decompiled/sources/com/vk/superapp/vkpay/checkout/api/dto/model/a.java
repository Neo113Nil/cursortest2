package com.vk.superapp.vkpay.checkout.api.dto.model;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCardBind;

/* compiled from: VkInitPayMethod.kt */
/* loaded from: classes6.dex */
public abstract class a {

    /* compiled from: VkInitPayMethod.kt */
    public static abstract class b extends a {

        /* compiled from: VkInitPayMethod.kt */
        /* renamed from: com.vk.superapp.vkpay.checkout.api.dto.model.a$b$a, reason: collision with other inner class name */
        public static final class C1917a extends b {
            public static final C1917a a = new C1917a();
        }

        /* compiled from: VkInitPayMethod.kt */
        /* renamed from: com.vk.superapp.vkpay.checkout.api.dto.model.a$b$b, reason: collision with other inner class name */
        public static final class C1918b extends b {
            public final int a;
            public final int b;
            public final boolean c;
            public final int d;

            public C1918b(int i, int i2, boolean z, int i3) {
                this.a = i;
                this.b = i2;
                this.c = z;
                this.d = i3;
            }
        }
    }

    /* compiled from: VkInitPayMethod.kt */
    /* renamed from: com.vk.superapp.vkpay.checkout.api.dto.model.a$a, reason: collision with other inner class name */
    public static class C1916a extends a {
        public final String a;
        public final String b;
        public final String c;
        public final VkCardBind.CardType d;

        public C1916a(String str, String str2, String str3, VkCardBind.CardType cardType) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = cardType;
        }

        public C1916a() {
            this("", "", "", VkCardBind.CardType.UNKNOWN);
        }
    }
}
