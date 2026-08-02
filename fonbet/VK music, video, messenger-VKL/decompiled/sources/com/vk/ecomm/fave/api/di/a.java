package com.vk.ecomm.fave.api.di;

import android.content.Context;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: MarketFaveInteractor.kt */
/* loaded from: classes18.dex */
public interface a {
    void a(Good good, NewsEntry newsEntry, Context context);

    void b(CallProducerButton callProducerButton, Good good, Context context);

    void c(Context context, Good good);

    void d(Good good, String str, Context context);

    void e(Context context, Good good);

    /* compiled from: MarketFaveInteractor.kt */
    /* renamed from: com.vk.ecomm.fave.api.di.a$a, reason: collision with other inner class name */
    public static final class C0939a {
        public static final /* synthetic */ C0939a a = new C0939a();
        private static final a STUB = new C0940a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: MarketFaveInteractor.kt */
        /* renamed from: com.vk.ecomm.fave.api.di.a$a$a, reason: collision with other inner class name */
        public static final class C0940a implements a {
            @Override // com.vk.ecomm.fave.api.di.a
            public final void c(Context context, Good good) {
            }

            @Override // com.vk.ecomm.fave.api.di.a
            public final void e(Context context, Good good) {
            }

            @Override // com.vk.ecomm.fave.api.di.a
            public final void a(Good good, NewsEntry newsEntry, Context context) {
            }

            @Override // com.vk.ecomm.fave.api.di.a
            public final void b(CallProducerButton callProducerButton, Good good, Context context) {
            }

            @Override // com.vk.ecomm.fave.api.di.a
            public final void d(Good good, String str, Context context) {
            }
        }
    }
}
