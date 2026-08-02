package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.configurator;

import a00.C4911f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$withResumed$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ String $scrollWidgetKey$inlined;
    final /* synthetic */ ScrollToShipmentConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$withResumed$1(ScrollToShipmentConfigurator scrollToShipmentConfigurator, String str) {
        super(0);
        this.this$0 = scrollToShipmentConfigurator;
        this.$scrollWidgetKey$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        View view;
        RecyclerView composerRecyclerView;
        RecyclerView.g adapter;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null && (ownerContainer = references.getOwnerContainer()) != null && (c11 = ownerContainer.c()) != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null && (adapter = composerRecyclerView.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(new ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$lambda$1$$inlined$doAfterInsert$1(adapter, this.this$0, this.$scrollWidgetKey$inlined));
        }
        return Unit.f71690a;
    }
}
