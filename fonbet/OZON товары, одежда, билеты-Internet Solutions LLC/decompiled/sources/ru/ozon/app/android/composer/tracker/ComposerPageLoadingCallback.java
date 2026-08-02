package ru.ozon.app.android.composer.tracker;

import A00.b;
import L00.g;
import P00.k;
import RZ.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListener;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/tracker/ComposerPageLoadingCallback;", "LA00/b;", "Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListener;", "composerPageLoadingListener", "LRZ/a;", "composerAnalytics", "<init>", "(Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListener;LRZ/a;)V", "LA00/a;", "event", "", "uuid", "LP00/k;", "Ll20/a;", "response", "", "onLoadCompleted", "(LA00/a;Ljava/lang/String;LP00/k;)V", "onLoadCanceled", "(LA00/a;Ljava/lang/String;)V", "onLoadFailed", "(LA00/a;)V", "LL00/g;", "request", "onLoadStarted", "(LA00/a;LL00/g;)V", "Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListener;", "LRZ/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerPageLoadingCallback implements b {

    @NotNull
    private final a composerAnalytics;

    @NotNull
    private final ComposerPageLoadingListener composerPageLoadingListener;

    public ComposerPageLoadingCallback(@NotNull ComposerPageLoadingListener composerPageLoadingListener, @NotNull a composerAnalytics) {
        Intrinsics.checkNotNullParameter(composerPageLoadingListener, "composerPageLoadingListener");
        Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
        this.composerPageLoadingListener = composerPageLoadingListener;
        this.composerAnalytics = composerAnalytics;
    }

    @Override // A00.b
    public void onLoadCanceled(@NotNull A00.a event, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }

    @Override // A00.b
    public void onLoadCompleted(@NotNull A00.a event, @NotNull String uuid, @NotNull k<? extends C7854a> response) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.composerAnalytics.e().f()) {
            this.composerPageLoadingListener.onPageLoaded(response.f().n());
        }
    }

    @Override // A00.b
    public void onLoadFailed(@NotNull A00.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // A00.b
    public void onLoadStarted(@NotNull A00.a event, @NotNull g request) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // A00.b
    public void onLoadFailed(@NotNull A00.a aVar, @NotNull Throwable th2) {
        b.a.b(this, aVar, th2);
    }
}
