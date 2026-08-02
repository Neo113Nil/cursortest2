package ru.ozon.app.android.composer.view.performance;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/composer/view/performance/ViewHoldersPerformanceTracker;", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHolderLifecycleListener;", "", "lifecycleListeners", "<init>", "(Ljava/util/Set;)V", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "holder", "", "timeNanosStart", "", "onCreateViewHolder", "(Lru/ozon/composer/ui/widget/k;J)V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "onBindStart", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;)V", "onBindEnd", "onLayoutStart", "(Lru/ozon/composer/ui/widget/k;)V", "onLayoutEnd", "clearUnfinishedWidgetLayoutEvents", "()V", "Ljava/util/Set;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewHoldersPerformanceTracker implements ViewHolderLifecycleListener {

    @NotNull
    private final Set<ViewHolderLifecycleListener> lifecycleListeners;

    public ViewHoldersPerformanceTracker(@NotNull Set<ViewHolderLifecycleListener> lifecycleListeners) {
        Intrinsics.checkNotNullParameter(lifecycleListeners, "lifecycleListeners");
        this.lifecycleListeners = lifecycleListeners;
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void clearUnfinishedWidgetLayoutEvents() {
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((ViewHolderLifecycleListener) it.next()).clearUnfinishedWidgetLayoutEvents();
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onBindEnd(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((ViewHolderLifecycleListener) it.next()).onBindEnd(holder, viewItem);
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onBindStart(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((ViewHolderLifecycleListener) it.next()).onBindStart(holder, viewItem);
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onCreateViewHolder(@NotNull k<c> holder, long timeNanosStart) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((ViewHolderLifecycleListener) it.next()).onCreateViewHolder(holder, timeNanosStart);
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onLayoutEnd(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((ViewHolderLifecycleListener) it.next()).onLayoutEnd(holder, viewItem);
        }
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onLayoutStart(@NotNull k<c> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((ViewHolderLifecycleListener) it.next()).onLayoutStart(holder);
        }
    }
}
