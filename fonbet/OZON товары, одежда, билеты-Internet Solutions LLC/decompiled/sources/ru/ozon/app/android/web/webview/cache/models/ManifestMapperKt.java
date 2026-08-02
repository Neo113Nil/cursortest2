package ru.ozon.app.android.web.webview.cache.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/web/webview/cache/models/CacheState;", "Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse;", "web_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ManifestMapperKt {
    @NotNull
    public static final CacheState toVO(@NotNull LoadManifestResponse loadManifestResponse) {
        Intrinsics.checkNotNullParameter(loadManifestResponse, "<this>");
        return new CacheState(loadManifestResponse.getManifest().getAppVersion(), loadManifestResponse.getManifest().getCache().getResources());
    }
}
