package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import Sc.s;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.marketing.widgets.cartButton.core.CartButtonUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "asyncState", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.HighlightProductsOverlayViewHolder$observeMiniWidgetState$1", f = "HighlightProductsOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HighlightProductsOverlayViewHolder$observeMiniWidgetState$1 extends j implements Function2<HighlightsWrapperAsyncState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HighlightProductsOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightProductsOverlayViewHolder$observeMiniWidgetState$1(HighlightProductsOverlayViewHolder highlightProductsOverlayViewHolder, d<? super HighlightProductsOverlayViewHolder$observeMiniWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = highlightProductsOverlayViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(HighlightProductsOverlayViewHolder highlightProductsOverlayViewHolder, HighlightsWrapperAsyncState highlightsWrapperAsyncState) {
        i iVar;
        i iVar2;
        iVar = highlightProductsOverlayViewHolder.container;
        HighlightsWrapperAsyncState.Success success = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
        iVar.M().update(new HighlightProductsUpdateState(success.getState().getHighlightProducts()));
        iVar2 = highlightProductsOverlayViewHolder.container;
        iVar2.M().update(new CartButtonUpdateState(new CartButtonDTO(success.getState().getCartButton())));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HighlightProductsOverlayViewHolder$observeMiniWidgetState$1 highlightProductsOverlayViewHolder$observeMiniWidgetState$1 = new HighlightProductsOverlayViewHolder$observeMiniWidgetState$1(this.this$0, dVar);
        highlightProductsOverlayViewHolder$observeMiniWidgetState$1.L$0 = obj;
        return highlightProductsOverlayViewHolder$observeMiniWidgetState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        View view;
        i iVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        final HighlightsWrapperAsyncState highlightsWrapperAsyncState = (HighlightsWrapperAsyncState) this.L$0;
        if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.NetworkException) {
            iVar = this.this$0.container;
            InterfaceC7851b.a.a(iVar.M(), null, null, null, null, 15);
        } else if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.Success) {
            view = this.this$0.view;
            final HighlightProductsOverlayViewHolder highlightProductsOverlayViewHolder = this.this$0;
            view.post(new Runnable() { // from class: ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.a
                @Override // java.lang.Runnable
                public final void run() {
                    HighlightProductsOverlayViewHolder$observeMiniWidgetState$1.invokeSuspend$lambda$0(HighlightProductsOverlayViewHolder.this, highlightsWrapperAsyncState);
                }
            });
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HighlightsWrapperAsyncState highlightsWrapperAsyncState, d<? super Unit> dVar) {
        return ((HighlightProductsOverlayViewHolder$observeMiniWidgetState$1) create(highlightsWrapperAsyncState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
