package ru.ozon.app.android.composer.view.performance.vhlisteners;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHolderLifecycleListener;", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "holder", "", "timeNanosStart", "", "onCreateViewHolder", "(Lru/ozon/composer/ui/widget/k;J)V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "onBindStart", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;)V", "onBindEnd", "onLayoutStart", "(Lru/ozon/composer/ui/widget/k;)V", "onLayoutEnd", "clearUnfinishedWidgetLayoutEvents", "()V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewHolderLifecycleListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void clearUnfinishedWidgetLayoutEvents(@NotNull ViewHolderLifecycleListener viewHolderLifecycleListener) {
        }

        public static void onBindStart(@NotNull ViewHolderLifecycleListener viewHolderLifecycleListener, @NotNull k<c> holder, @NotNull l viewItem) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        }

        public static void onCreateViewHolder(@NotNull ViewHolderLifecycleListener viewHolderLifecycleListener, @NotNull k<c> holder, long j11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        public static void onLayoutStart(@NotNull ViewHolderLifecycleListener viewHolderLifecycleListener, @NotNull k<c> holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }
    }

    void clearUnfinishedWidgetLayoutEvents();

    void onBindEnd(@NotNull k<c> holder, @NotNull l viewItem);

    void onBindStart(@NotNull k<c> holder, @NotNull l viewItem);

    void onCreateViewHolder(@NotNull k<c> holder, long timeNanosStart);

    void onLayoutEnd(@NotNull k<c> holder, @NotNull l viewItem);

    void onLayoutStart(@NotNull k<c> holder);
}
