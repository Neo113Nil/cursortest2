package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepositoryImpl;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerUgcReviewFormComponent {

    private static final class Factory implements UgcReviewFormComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponent.Factory
        public UgcReviewFormComponent create(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            return new UgcReviewFormComponentImpl(0, networkComponentApi, storageComponentApi);
        }

        private Factory() {
        }
    }

    private static final class UgcReviewFormComponentImpl implements UgcReviewFormComponent {
        private a<ReviewFormRepository> bindReviewFormRepositoryProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<ReviewFormRepositoryImpl> reviewFormRepositoryImplProvider;
        private final StorageComponentApi storageComponentApi;
        private final UgcReviewFormComponentImpl ugcReviewFormComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93042id;
            private final UgcReviewFormComponentImpl ugcReviewFormComponentImpl;

            SwitchingProvider(UgcReviewFormComponentImpl ugcReviewFormComponentImpl, int i11) {
                this.ugcReviewFormComponentImpl = ugcReviewFormComponentImpl;
                this.f93042id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93042id != 0) {
                    throw new AssertionError(this.f93042id);
                }
                SharedPreferences sharedPreferences = this.ugcReviewFormComponentImpl.storageComponentApi.getSharedPreferences();
                j.c(sharedPreferences);
                JsonSerializer jsonSerializer = this.ugcReviewFormComponentImpl.networkComponentApi.getJsonSerializer();
                j.c(jsonSerializer);
                JsonParser jsonDeserializer = this.ugcReviewFormComponentImpl.networkComponentApi.getJsonDeserializer();
                j.c(jsonDeserializer);
                return (T) new ReviewFormRepositoryImpl(sharedPreferences, jsonSerializer, jsonDeserializer);
            }
        }

        /* synthetic */ UgcReviewFormComponentImpl(int i11, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            this(networkComponentApi, storageComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.ugcReviewFormComponentImpl, 0);
            this.reviewFormRepositoryImplProvider = switchingProvider;
            this.bindReviewFormRepositoryProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentApi
        public ReviewFormRepository getReviewFormRepository() {
            return this.bindReviewFormRepositoryProvider.get();
        }

        private UgcReviewFormComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            this.ugcReviewFormComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(networkComponentApi, storageComponentApi);
        }
    }

    public static UgcReviewFormComponent.Factory factory() {
        return new Factory(0);
    }
}
