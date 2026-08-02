package ru.ozon.app.android.composer.domain.cache;

import L00.g;
import L00.j;
import androidx.recyclerview.widget.m;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.c;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/ComposerCacheImpl;", "Lru/ozon/app/android/composer/domain/cache/ComposerCache;", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "localStorage", "<init>", "(Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;)V", "", "cacheValue", "", "", "params", "Lorg/joda/time/DateTime;", "dateTime", "", "saveResponse", "(Ljava/lang/String;[Ljava/lang/Object;Lorg/joda/time/DateTime;)V", "Lru/ozon/app/android/composer/domain/cache/CacheBox;", "", "cacheTime", "", "isFileCacheValid", "(Lru/ozon/app/android/composer/domain/cache/CacheBox;I)Z", "LL00/j;", "getFileCache", "(I[Ljava/lang/Object;)LL00/j;", "put", "(ILjava/lang/String;[Ljava/lang/Object;)V", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerCacheImpl implements ComposerCache {

    @NotNull
    private final ComposerResponseStorage localStorage;

    public ComposerCacheImpl(@NotNull ComposerResponseStorage localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.localStorage = localStorage;
    }

    private final boolean isFileCacheValid(CacheBox cacheBox, int i11) {
        DateTime l11 = cacheBox.getTimestamp().l(i11);
        int i12 = c.f79052b;
        return l11.getMillis() > System.currentTimeMillis();
    }

    private final void saveResponse(String cacheValue, Object[] params, DateTime dateTime) {
        this.localStorage.saveResponse(cacheValue, params, dateTime);
    }

    static void saveResponse$default(ComposerCacheImpl composerCacheImpl, String str, Object[] objArr, DateTime dateTime, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dateTime = new DateTime();
        }
        composerCacheImpl.saveResponse(str, objArr, dateTime);
    }

    @Override // ru.ozon.app.android.composer.domain.cache.ComposerCache
    public j getFileCache(int cacheTime, @NotNull Object... params) {
        CacheBox responseMock;
        g gVar;
        Intrinsics.checkNotNullParameter(params, "params");
        int generateKey$composer_prodGoogleAllVendorsRelease = ComposerResponseStorage.INSTANCE.generateKey$composer_prodGoogleAllVendorsRelease(params);
        File findResponseMockDirectory = this.localStorage.findResponseMockDirectory(generateKey$composer_prodGoogleAllVendorsRelease);
        if (findResponseMockDirectory != null && (responseMock = this.localStorage.getResponseMock(generateKey$composer_prodGoogleAllVendorsRelease, findResponseMockDirectory)) != null) {
            if (!isFileCacheValid(responseMock, cacheTime)) {
                h.h(findResponseMockDirectory);
                return null;
            }
            if (responseMock.getData().length() != 0) {
                String data = responseMock.getData();
                j.a aVar = new j.a();
                aVar.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
                aVar.f(DiscountCodeResponse.RESULT_OK);
                gVar = g.f16089j;
                aVar.i(gVar);
                aVar.a(data);
                aVar.h(new Object());
                return aVar.b();
            }
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.domain.cache.ComposerCache
    public void put(int cacheTime, @NotNull String cacheValue, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(cacheValue, "cacheValue");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!kotlin.text.h.K(cacheValue) && cacheTime > 0) {
            saveResponse$default(this, cacheValue, params, null, 4, null);
        }
    }
}
