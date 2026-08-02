package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.configurator;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"ru/ozon/uikit/recycler/ext/RecyclerViewExtKt$doAfterInsert$1", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "onChanged", "()V", "", "positionStart", "itemCount", "onItemRangeRemoved", "(II)V", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "onItemRangeInserted", "onItemRangeChanged", "uikit-recycler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$lambda$1$$inlined$doAfterInsert$1 extends RecyclerView.i {
    final /* synthetic */ String $scrollWidgetKey$inlined;
    final /* synthetic */ RecyclerView.g $this_doAfterInsert;
    final /* synthetic */ ScrollToShipmentConfigurator this$0;

    public ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$lambda$1$$inlined$doAfterInsert$1(RecyclerView.g gVar, ScrollToShipmentConfigurator scrollToShipmentConfigurator, String str) {
        this.$this_doAfterInsert = gVar;
        this.this$0 = scrollToShipmentConfigurator;
        this.$scrollWidgetKey$inlined = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onChanged() {
        this.$this_doAfterInsert.unregisterAdapterDataObserver(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeChanged(int positionStart, int itemCount) {
        this.$this_doAfterInsert.unregisterAdapterDataObserver(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeInserted(int positionStart, int itemCount) {
        InterfaceC7851b controller;
        int scrollOffset;
        this.$this_doAfterInsert.unregisterAdapterDataObserver(this);
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        int hashCode = this.$scrollWidgetKey$inlined.hashCode();
        scrollOffset = this.this$0.getScrollOffset();
        InterfaceC7851b.a.b(controller, hashCode, scrollOffset, true, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        this.$this_doAfterInsert.unregisterAdapterDataObserver(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeRemoved(int positionStart, int itemCount) {
        this.$this_doAfterInsert.unregisterAdapterDataObserver(this);
    }
}
