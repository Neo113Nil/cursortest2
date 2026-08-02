package ru.ozon.app.android.analytics.startup.time;

import Sc.InterfaceC4008j;
import Sc.k;
import Xh0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.startup.CompilationProfileStatusDelegate;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListenerImpl;", "Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListener;", "LXh0/c;", "startupTimeTracker", "Lru/ozon/app/android/analytics/startup/CompilationProfileStatusDelegate;", "compilationProfileStatusDelegate", "<init>", "(LXh0/c;Lru/ozon/app/android/analytics/startup/CompilationProfileStatusDelegate;)V", "", "userToken", "", "onPageLoaded", "(Ljava/lang/String;)V", "LXh0/c;", "Lru/ozon/app/android/analytics/startup/CompilationProfileStatusDelegate;", "", "wasFirstPageLoaded", "Z", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerPageLoadingListenerImpl implements ComposerPageLoadingListener {

    @NotNull
    private final CompilationProfileStatusDelegate compilationProfileStatusDelegate;

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coroutineScope;

    @NotNull
    private final c startupTimeTracker;
    private boolean wasFirstPageLoaded;

    public ComposerPageLoadingListenerImpl(@NotNull c startupTimeTracker, @NotNull CompilationProfileStatusDelegate compilationProfileStatusDelegate) {
        Intrinsics.checkNotNullParameter(startupTimeTracker, "startupTimeTracker");
        Intrinsics.checkNotNullParameter(compilationProfileStatusDelegate, "compilationProfileStatusDelegate");
        this.startupTimeTracker = startupTimeTracker;
        this.compilationProfileStatusDelegate = compilationProfileStatusDelegate;
        this.coroutineScope = k.b(ComposerPageLoadingListenerImpl$coroutineScope$2.INSTANCE);
    }

    private final M getCoroutineScope() {
        return (M) this.coroutineScope.getValue();
    }

    @Override // ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListener
    public void onPageLoaded(String userToken) {
        if (this.wasFirstPageLoaded) {
            return;
        }
        this.wasFirstPageLoaded = true;
        C10727i.c(getCoroutineScope(), null, null, new ComposerPageLoadingListenerImpl$onPageLoaded$1(this, userToken, null), 3);
    }
}
