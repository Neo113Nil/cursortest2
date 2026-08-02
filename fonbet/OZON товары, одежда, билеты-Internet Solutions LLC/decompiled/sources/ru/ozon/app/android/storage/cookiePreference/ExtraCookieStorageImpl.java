package ru.ozon.app.android.storage.cookiePreference;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorageImpl;", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "<init>", "()V", "extraCookies", "", "", "addExtraCookies", "", "cookies", "getExtraCookies", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtraCookieStorageImpl implements ExtraCookieStorage {

    @NotNull
    private Map<String, String> extraCookies = U.c();

    @Override // ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage
    public void addExtraCookies(@NotNull Map<String, String> cookies) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        this.extraCookies = cookies;
    }

    @Override // ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage
    @NotNull
    public Map<String, String> getExtraCookies() {
        return this.extraCookies;
    }
}
