package com.vk.auth.ui.consent;

/* compiled from: VkConsentScreenContract.kt */
/* loaded from: classes15.dex */
public abstract class h {
    public static final a b = new a(false);
    public final boolean a;

    /* compiled from: VkConsentScreenContract.kt */
    public static final class a extends h {
        public a() {
            super(false);
        }
    }

    /* compiled from: VkConsentScreenContract.kt */
    public static final class b extends h {
        public final String c;

        public b(String str) {
            super(true);
            this.c = str;
        }
    }

    public h(boolean z) {
        this.a = z;
    }
}
