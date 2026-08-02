package com.vk.ecomm.storefront.api.di;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import xsna.pwj0;
import xsna.rml0;

/* compiled from: StorefrontComponent.kt */
/* loaded from: classes.dex */
public interface StorefrontComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StorefrontComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StorefrontComponent STUB = new StorefrontComponent() { // from class: com.vk.ecomm.storefront.api.di.StorefrontComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.ecomm.storefront.api.di.StorefrontComponent
            public final rml0 a() {
                return this.a;
            }

            /* compiled from: StorefrontComponent.kt */
            public static final class a implements rml0 {
                @Override // xsna.rml0
                public final void b(Context context, UserId userId) {
                }

                @Override // xsna.rml0
                public final void c(Context context, UserId userId, MarketAnalyticsParams marketAnalyticsParams, Class<? extends FragmentImpl> cls, boolean z) {
                }
            }
        };

        public final StorefrontComponent getSTUB() {
            return STUB;
        }
    }

    rml0 a();
}
