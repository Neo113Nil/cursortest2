package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.configurator;

import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.E;
import androidx.lifecycle.I0;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.ordershipment.orderShipment.configurator.ScrollToShipmentConfigurator$onComposerInitialized$1", f = "ScrollToShipmentConfigurator.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ScrollToShipmentConfigurator$onComposerInitialized$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $scrollWidgetKey;
    int label;
    final /* synthetic */ ScrollToShipmentConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollToShipmentConfigurator$onComposerInitialized$1(ScrollToShipmentConfigurator scrollToShipmentConfigurator, String str, d<? super ScrollToShipmentConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = scrollToShipmentConfigurator;
        this.$scrollWidgetKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ScrollToShipmentConfigurator$onComposerInitialized$1(this.this$0, this.$scrollWidgetKey, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        View view;
        RecyclerView composerRecyclerView;
        RecyclerView.g adapter;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            J owner = this.this$0.getOwner();
            ScrollToShipmentConfigurator scrollToShipmentConfigurator = this.this$0;
            String str = this.$scrollWidgetKey;
            AbstractC5434v lifecycle = owner.getLifecycle();
            AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 x11 = De.s.f6650a.x();
            boolean t2 = x11.t(getContext());
            if (!t2) {
                if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
                    throw new E(null);
                }
                if (lifecycle.b().compareTo(bVar) >= 0) {
                    ConfiguratorReferences references = scrollToShipmentConfigurator.getReferences();
                    if (references != null && (ownerContainer = references.getOwnerContainer()) != null && (c11 = ownerContainer.c()) != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null && (adapter = composerRecyclerView.getAdapter()) != null) {
                        adapter.registerAdapterDataObserver(new ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$lambda$1$$inlined$doAfterInsert$1(adapter, scrollToShipmentConfigurator, str));
                    }
                    Unit unit = Unit.f71690a;
                }
            }
            ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$withResumed$1 scrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$withResumed$1 = new ScrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$withResumed$1(scrollToShipmentConfigurator, str);
            this.label = 1;
            if (I0.a(lifecycle, bVar, t2, x11, scrollToShipmentConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$withResumed$1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ScrollToShipmentConfigurator$onComposerInitialized$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
