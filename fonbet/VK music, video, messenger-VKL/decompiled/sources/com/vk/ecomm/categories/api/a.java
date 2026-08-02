package com.vk.ecomm.categories.api;

import android.content.Context;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;

/* compiled from: MarketCategoriesRouter.kt */
/* loaded from: classes18.dex */
public interface a {
    public static final C0932a a = C0932a.a;

    /* compiled from: MarketCategoriesRouter.kt */
    /* renamed from: com.vk.ecomm.categories.api.a$a, reason: collision with other inner class name */
    public static final class C0932a {
        public static final /* synthetic */ C0932a a = new C0932a();
        private static final a STUB = new C0933a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: MarketCategoriesRouter.kt */
        /* renamed from: com.vk.ecomm.categories.api.a$a$a, reason: collision with other inner class name */
        public static final class C0933a implements a {
            @Override // com.vk.ecomm.categories.api.a
            public final void a(Context context, String str, MarketBridgeCategory marketBridgeCategory, MarketAnalyticsParams marketAnalyticsParams) {
            }
        }
    }

    default void a(Context context, String str, MarketBridgeCategory marketBridgeCategory, MarketAnalyticsParams marketAnalyticsParams) {
    }
}
