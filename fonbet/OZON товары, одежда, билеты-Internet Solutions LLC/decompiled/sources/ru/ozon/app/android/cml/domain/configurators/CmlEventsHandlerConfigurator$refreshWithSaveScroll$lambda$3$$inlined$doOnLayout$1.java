package ru.ozon.app.android.cml.domain.configurators;

import A00.e;
import M10.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlEventsHandlerConfigurator$refreshWithSaveScroll$lambda$3$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ CmlEventsHandlerConfigurator this$0;

    public CmlEventsHandlerConfigurator$refreshWithSaveScroll$lambda$3$$inlined$doOnLayout$1(CmlEventsHandlerConfigurator cmlEventsHandlerConfigurator) {
        this.this$0 = cmlEventsHandlerConfigurator;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        InterfaceC7851b controller;
        view.removeOnLayoutChangeListener(this);
        RecyclerView recyclerView = this.this$0.getRecyclerView();
        e b11 = recyclerView != null ? d.b(recyclerView) : null;
        if (b11 == null) {
            e.a aVar = new e.a();
            aVar.g(0);
            b11 = aVar.b();
        }
        h.b bVar = new h.b(b11);
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, bVar, 7);
    }
}
