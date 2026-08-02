package ru.ozon.app.android.user.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storage.user.test.TestUserStorage;
import ru.ozon.app.android.user.TestUserStorageImpl;
import ru.ozon.app.android.user.di.TestUserComponent;

/* loaded from: classes7.dex */
public final class DaggerTestUserComponent {

    private static final class Factory implements TestUserComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.user.di.TestUserComponent.Factory
        public TestUserComponent create(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            storageComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            return new TestUserComponentImpl(storageComponentApi, androidPlatformComponentApi, 0);
        }
    }

    private static final class TestUserComponentImpl implements TestUserComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private a<TestUserStorage> bindTestUserStorageProvider;
        private final StorageComponentApi storageComponentApi;
        private final TestUserComponentImpl testUserComponentImpl;
        private a<TestUserStorageImpl> testUserStorageImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94579id;
            private final TestUserComponentImpl testUserComponentImpl;

            SwitchingProvider(TestUserComponentImpl testUserComponentImpl, int i11) {
                this.testUserComponentImpl = testUserComponentImpl;
                this.f94579id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94579id != 0) {
                    throw new AssertionError(this.f94579id);
                }
                UserStatusStorage userStatusStorage = this.testUserComponentImpl.storageComponentApi.getUserStatusStorage();
                j.c(userStatusStorage);
                AndroidPlatformComponentConfig androidPlatformComponentConfig = this.testUserComponentImpl.androidPlatformComponentApi.getAndroidPlatformComponentConfig();
                j.c(androidPlatformComponentConfig);
                return (T) new TestUserStorageImpl(userStatusStorage, androidPlatformComponentConfig);
            }
        }

        /* synthetic */ TestUserComponentImpl(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, int i11) {
            this(storageComponentApi, androidPlatformComponentApi);
        }

        private void initialize(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.testUserComponentImpl, 0);
            this.testUserStorageImplProvider = switchingProvider;
            this.bindTestUserStorageProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.storage.user.test.TestUserComponentApi
        public TestUserStorage getTestUserStorage() {
            return this.bindTestUserStorageProvider.get();
        }

        private TestUserComponentImpl(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.testUserComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            initialize(storageComponentApi, androidPlatformComponentApi);
        }
    }

    public static TestUserComponent.Factory factory() {
        return new Factory(0);
    }
}
