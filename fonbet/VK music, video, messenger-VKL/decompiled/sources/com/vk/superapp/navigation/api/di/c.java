package com.vk.superapp.navigation.api.di;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import xsna.j19;
import xsna.k1w0;
import xsna.qfu0;

/* compiled from: VkAnalyticsFactory.kt */
/* loaded from: classes6.dex */
public interface c {
    k1w0 a(String str, String str2, WebApiApplication webApiApplication);

    VkBridgeAnalytics b(long j, String str, String str2, String str3, boolean z, j19 j19Var);

    qfu0 c(boolean z, String str, Long l, long j);

    /* compiled from: VkAnalyticsFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final c getSTUB() {
            return new C1899a();
        }

        /* compiled from: VkAnalyticsFactory.kt */
        /* renamed from: com.vk.superapp.navigation.api.di.c$a$a, reason: collision with other inner class name */
        public static final class C1899a implements c {
            @Override // com.vk.superapp.navigation.api.di.c
            public final k1w0 a(String str, String str2, WebApiApplication webApiApplication) {
                return new b();
            }

            @Override // com.vk.superapp.navigation.api.di.c
            public final VkBridgeAnalytics b(long j, String str, String str2, String str3, boolean z, j19 j19Var) {
                return new com.vk.superapp.navigation.api.di.b();
            }

            @Override // com.vk.superapp.navigation.api.di.c
            public final qfu0 c(boolean z, String str, Long l, long j) {
                return new C1900a();
            }

            /* compiled from: VkAnalyticsFactory.kt */
            /* renamed from: com.vk.superapp.navigation.api.di.c$a$a$a, reason: collision with other inner class name */
            public static final class C1900a implements qfu0 {
                @Override // xsna.qfu0
                public final void a() {
                }

                @Override // xsna.qfu0
                public final void b(boolean z) {
                }
            }

            /* compiled from: VkAnalyticsFactory.kt */
            /* renamed from: com.vk.superapp.navigation.api.di.c$a$a$b */
            public static final class b implements k1w0 {
                @Override // xsna.k1w0
                public final void a(long j) {
                }

                @Override // xsna.k1w0
                public final void d(long j) {
                }
            }
        }
    }
}
