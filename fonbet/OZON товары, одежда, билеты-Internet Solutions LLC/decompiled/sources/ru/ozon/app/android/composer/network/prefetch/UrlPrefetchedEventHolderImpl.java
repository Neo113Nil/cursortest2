package ru.ozon.app.android.composer.network.prefetch;

import L9.c;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolderImpl;", "Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "<init>", "()V", "Lio/reactivex/p;", "", "observePrefetchedUrls", "()Lio/reactivex/p;", "prefetchedUrl", "", "onUrlPrefetched", "(Ljava/lang/String;)V", "LL9/c;", "kotlin.jvm.PlatformType", "urlPrefetchedSubject", "LL9/c;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UrlPrefetchedEventHolderImpl implements UrlPrefetchedEventHolder {

    @NotNull
    private final c<String> urlPrefetchedSubject;

    public UrlPrefetchedEventHolderImpl() {
        c<String> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.urlPrefetchedSubject = c11;
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder
    @NotNull
    public p<String> observePrefetchedUrls() {
        p<String> hide = this.urlPrefetchedSubject.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        return hide;
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder
    public void onUrlPrefetched(@NotNull String prefetchedUrl) {
        Intrinsics.checkNotNullParameter(prefetchedUrl, "prefetchedUrl");
        this.urlPrefetchedSubject.accept(prefetchedUrl);
    }
}
