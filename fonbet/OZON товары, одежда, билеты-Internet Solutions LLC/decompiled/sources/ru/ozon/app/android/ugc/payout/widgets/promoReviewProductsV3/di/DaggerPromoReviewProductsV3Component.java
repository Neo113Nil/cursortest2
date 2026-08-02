package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import WZ.l;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewItemMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewSectionHeaderMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModelImpl;

/* loaded from: classes2.dex */
public final class DaggerPromoReviewProductsV3Component {

    private static final class Factory implements PromoReviewProductsV3Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component.Factory
        public PromoReviewProductsV3Component create(RetainComposerComponentApi retainComposerComponentApi) {
            retainComposerComponentApi.getClass();
            return new PromoReviewProductsV3ComponentImpl(retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PromoReviewProductsV3ComponentImpl implements PromoReviewProductsV3Component {
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private a<PromoReviewItemMapper> promoReviewItemMapperProvider;
        private a<PromoReviewItemViewModelImpl> promoReviewItemViewModelImplProvider;
        private final PromoReviewProductsV3ComponentImpl promoReviewProductsV3ComponentImpl;
        private a<PromoReviewSectionHeaderMapper> promoReviewSectionHeaderMapperProvider;
        private final RetainComposerComponentApi retainComposerComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94432id;
            private final PromoReviewProductsV3ComponentImpl promoReviewProductsV3ComponentImpl;

            SwitchingProvider(PromoReviewProductsV3ComponentImpl promoReviewProductsV3ComponentImpl, int i11) {
                this.promoReviewProductsV3ComponentImpl = promoReviewProductsV3ComponentImpl;
                this.f94432id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f94432id;
                if (i11 == 0) {
                    return (T) new PromoReviewSectionHeaderMapper();
                }
                if (i11 == 1) {
                    return (T) new PromoReviewItemMapper();
                }
                if (i11 == 2) {
                    return (T) new HandlersInhibitor();
                }
                if (i11 == 3) {
                    return (T) new PromoReviewItemViewModelImpl();
                }
                throw new AssertionError(this.f94432id);
            }
        }

        /* synthetic */ PromoReviewProductsV3ComponentImpl(RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(retainComposerComponentApi);
        }

        private void initialize(RetainComposerComponentApi retainComposerComponentApi) {
            this.promoReviewSectionHeaderMapperProvider = d.b(new SwitchingProvider(this.promoReviewProductsV3ComponentImpl, 0));
            this.promoReviewItemMapperProvider = d.b(new SwitchingProvider(this.promoReviewProductsV3ComponentImpl, 1));
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.promoReviewProductsV3ComponentImpl, 2));
            this.promoReviewItemViewModelImplProvider = new SwitchingProvider(this.promoReviewProductsV3ComponentImpl, 3);
        }

        @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component
        public PromoReviewSectionHeaderMapper getHeaderMapper() {
            return this.promoReviewSectionHeaderMapperProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component
        public PromoReviewItemMapper getItemMapper() {
            return this.promoReviewItemMapperProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component
        public a<PromoReviewItemViewModelImpl> getItemViewModel() {
            return this.promoReviewItemViewModelImplProvider;
        }

        @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        private PromoReviewProductsV3ComponentImpl(RetainComposerComponentApi retainComposerComponentApi) {
            this.promoReviewProductsV3ComponentImpl = this;
            this.retainComposerComponentApi = retainComposerComponentApi;
            initialize(retainComposerComponentApi);
        }
    }

    public static PromoReviewProductsV3Component.Factory factory() {
        return new Factory(0);
    }
}
