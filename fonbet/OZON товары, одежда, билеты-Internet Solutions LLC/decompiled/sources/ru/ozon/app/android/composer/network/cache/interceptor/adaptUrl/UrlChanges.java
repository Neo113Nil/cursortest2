package ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/UrlChanges;", "", "originalUrl", "Lru/ozon/app/android/composer/network/cache/util/Url;", "adaptedUrl", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOriginalUrl-hqWykRw", "()Ljava/lang/String;", "Ljava/lang/String;", "getAdaptedUrl-WAfokHg", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UrlChanges {

    @NotNull
    private final String adaptedUrl;

    @NotNull
    private final String originalUrl;

    public /* synthetic */ UrlChanges(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    /* renamed from: getAdaptedUrl-WAfokHg, reason: not valid java name and from getter */
    public final String getAdaptedUrl() {
        return this.adaptedUrl;
    }

    @NotNull
    /* renamed from: getOriginalUrl-hqWykRw, reason: not valid java name and from getter */
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    private UrlChanges(String originalUrl, String adaptedUrl) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(adaptedUrl, "adaptedUrl");
        this.originalUrl = originalUrl;
        this.adaptedUrl = adaptedUrl;
    }
}
