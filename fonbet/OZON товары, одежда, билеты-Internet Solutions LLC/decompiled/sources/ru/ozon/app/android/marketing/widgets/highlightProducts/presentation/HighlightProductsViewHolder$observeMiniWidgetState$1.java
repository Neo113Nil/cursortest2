package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.cartButton.core.CartButtonUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "asyncState", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.HighlightProductsViewHolder$observeMiniWidgetState$1", f = "HighlightProductsViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HighlightProductsViewHolder$observeMiniWidgetState$1 extends j implements Function2<HighlightsWrapperAsyncState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HighlightProductsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightProductsViewHolder$observeMiniWidgetState$1(HighlightProductsViewHolder highlightProductsViewHolder, d<? super HighlightProductsViewHolder$observeMiniWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = highlightProductsViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(HighlightProductsViewHolder highlightProductsViewHolder, HighlightsWrapperAsyncState highlightsWrapperAsyncState) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        composerReferences = highlightProductsViewHolder.refs;
        HighlightsWrapperAsyncState.Success success = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
        composerReferences.getController().update(new HighlightProductsUpdateState(success.getState().getHighlightProducts()));
        composerReferences2 = highlightProductsViewHolder.refs;
        composerReferences2.getController().update(new CartButtonUpdateState(new CartButtonDTO(success.getState().getCartButton())));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HighlightProductsViewHolder$observeMiniWidgetState$1 highlightProductsViewHolder$observeMiniWidgetState$1 = new HighlightProductsViewHolder$observeMiniWidgetState$1(this.this$0, dVar);
        highlightProductsViewHolder$observeMiniWidgetState$1.L$0 = obj;
        return highlightProductsViewHolder$observeMiniWidgetState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        final HighlightsWrapperAsyncState highlightsWrapperAsyncState = (HighlightsWrapperAsyncState) this.L$0;
        if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.NetworkException) {
            composerReferences = this.this$0.refs;
            InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
        } else if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.Success) {
            final HighlightProductsViewHolder highlightProductsViewHolder = this.this$0;
            highlightProductsViewHolder.itemView.post(new Runnable() { // from class: ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.b
                @Override // java.lang.Runnable
                public final void run() {
                    HighlightProductsViewHolder$observeMiniWidgetState$1.invokeSuspend$lambda$0(HighlightProductsViewHolder.this, highlightsWrapperAsyncState);
                }
            });
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HighlightsWrapperAsyncState highlightsWrapperAsyncState, d<? super Unit> dVar) {
        return ((HighlightProductsViewHolder$observeMiniWidgetState$1) create(highlightsWrapperAsyncState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
