package ru.ozon.app.android.gallery;

import WZ.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/gallery/StorageAnalytic;", "", "<init>", "()V", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "setTokenizedAnalytics", "(LWZ/l;)V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StorageAnalytic {

    @NotNull
    public static final StorageAnalytic INSTANCE = new StorageAnalytic();
    private static l tokenizedAnalytics;

    private StorageAnalytic() {
    }

    public final l getTokenizedAnalytics() {
        return tokenizedAnalytics;
    }

    public final void setTokenizedAnalytics(l lVar) {
        tokenizedAnalytics = lVar;
    }
}
