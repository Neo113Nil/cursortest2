package ru.ozon.app.android.composer.view.performance.vhlisteners;

import Hh.C3140a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersFpsTracker;", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHolderLifecycleListener;", "LHh/a;", "fpsTracker", "<init>", "(LHh/a;)V", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "holder", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "onBindEnd", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;)V", "onLayoutEnd", "LHh/a;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewHoldersFpsTracker implements ViewHolderLifecycleListener {

    @NotNull
    private final C3140a fpsTracker;
    public static final int $stable = 8;

    public ViewHoldersFpsTracker(@NotNull C3140a fpsTracker) {
        Intrinsics.checkNotNullParameter(fpsTracker, "fpsTracker");
        this.fpsTracker = fpsTracker;
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void clearUnfinishedWidgetLayoutEvents() {
        ViewHolderLifecycleListener.DefaultImpls.clearUnfinishedWidgetLayoutEvents(this);
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onBindEnd(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        String name = holder.getClass().getName();
        this.fpsTracker.n(viewItem.i().e(), name, viewItem.c().a());
        holder.itemView.setTag(R.id.tag_key_holder_name, name);
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onBindStart(@NotNull k<c> kVar, @NotNull l lVar) {
        ViewHolderLifecycleListener.DefaultImpls.onBindStart(this, kVar, lVar);
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onCreateViewHolder(@NotNull k<c> kVar, long j11) {
        ViewHolderLifecycleListener.DefaultImpls.onCreateViewHolder(this, kVar, j11);
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onLayoutEnd(@NotNull k<c> holder, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        this.fpsTracker.o(viewItem.i().e(), "layout");
    }

    @Override // ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener
    public void onLayoutStart(@NotNull k<c> kVar) {
        ViewHolderLifecycleListener.DefaultImpls.onLayoutStart(this, kVar);
    }
}
