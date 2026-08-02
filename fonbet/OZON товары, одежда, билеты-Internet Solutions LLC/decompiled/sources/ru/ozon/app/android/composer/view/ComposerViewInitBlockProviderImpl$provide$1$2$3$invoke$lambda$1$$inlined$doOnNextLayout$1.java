package ru.ozon.app.android.composer.view;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.performance.ViewHoldersPerformanceTracker;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/composer/view/ComposerViewInitBlockProviderImpl$provide$1$2$3$invoke$lambda$1$$inlined$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerViewInitBlockProviderImpl$provide$1$2$3$invoke$lambda$1$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ l $item$inlined;
    final /* synthetic */ k $this_onBindEnd$inlined;
    final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

    public ComposerViewInitBlockProviderImpl$provide$1$2$3$invoke$lambda$1$$inlined$doOnNextLayout$1(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl, k kVar, l lVar) {
        this.this$0 = composerViewInitBlockProviderImpl;
        this.$this_onBindEnd$inlined = kVar;
        this.$item$inlined = lVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        ViewHoldersPerformanceTracker viewHoldersPerformanceTracker;
        view.removeOnLayoutChangeListener(this);
        viewHoldersPerformanceTracker = this.this$0.viewHoldersPerformanceTracker;
        viewHoldersPerformanceTracker.onLayoutEnd(this.$this_onBindEnd$inlined, this.$item$inlined);
    }
}
