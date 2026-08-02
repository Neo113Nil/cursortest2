package ru.ozon.app.android.storefrontcommonwidgets.services;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.w0;
import He.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "<init>", "(Lru/ozon/app/android/storage/teensMode/TeensModeStorage;Lru/ozon/app/android/composer/network/cache/ComposerCacheService;)V", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeInfo;", "state", "", "setTeensModeCookieChanged", "(Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeInfo;)V", "", "isTeensModeOn", "()Z", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "Lxe/M;", "scope", "Lxe/M;", "LAe/w0;", "_teensModeFlow", "LAe/w0;", "LAe/B0;", "teensModeFlow", "LAe/B0;", "getTeensModeFlow", "()LAe/B0;", "storefrontcommonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TeensModeService {

    @NotNull
    private final w0<TeensModeInfo> _teensModeFlow;

    @NotNull
    private final ComposerCacheService composerCacheService;

    @NotNull
    private final M scope;

    @NotNull
    private final B0<TeensModeInfo> teensModeFlow;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    public TeensModeService(@NotNull TeensModeStorage teensModeStorage, @NotNull ComposerCacheService composerCacheService) {
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        this.teensModeStorage = teensModeStorage;
        this.composerCacheService = composerCacheService;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b);
        C0 b11 = E0.b(1, 0, null, 6);
        this._teensModeFlow = b11;
        this.teensModeFlow = b11;
    }

    @NotNull
    public final B0<TeensModeInfo> getTeensModeFlow() {
        return this.teensModeFlow;
    }

    public final boolean isTeensModeOn() {
        return this.teensModeStorage.isTeensModeEnabled();
    }

    public final void setTeensModeCookieChanged(@NotNull TeensModeInfo state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C10727i.c(this.scope, null, null, new TeensModeService$setTeensModeCookieChanged$1(this, state, null), 3);
    }
}
