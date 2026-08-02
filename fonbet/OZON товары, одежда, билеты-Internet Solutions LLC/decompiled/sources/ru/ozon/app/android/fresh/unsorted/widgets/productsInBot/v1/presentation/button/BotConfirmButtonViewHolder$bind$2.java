package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button;

import Sc.o;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BotConfirmButtonViewHolder$bind$2 extends AbstractC7737t implements Function1<ProductsInBotViewModel.Action, Unit> {
    final /* synthetic */ BotConfirmButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotConfirmButtonViewHolder$bind$2(BotConfirmButtonViewHolder botConfirmButtonViewHolder) {
        super(1);
        this.this$0 = botConfirmButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductsInBotViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductsInBotViewModel.Action action) {
        Restriction restriction;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Function1 function1;
        if (action instanceof ProductsInBotViewModel.Action.Success) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((ProductsInBotViewModel.Action.Success) action).getAction());
            return;
        }
        if (!(action instanceof ProductsInBotViewModel.Action.Error)) {
            throw new o();
        }
        restriction = this.this$0.defaultRestriction;
        composerReferences = this.this$0.refs;
        ViewGroup rootView = ContextExtKt.getRootView(composerReferences.getContainer().c());
        if (rootView != null) {
            BotConfirmButtonViewHolder botConfirmButtonViewHolder = this.this$0;
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(restriction.getMessage());
            Integer valueOf = Integer.valueOf(R$drawable.ic_m_exclamation);
            composerReferences2 = botConfirmButtonViewHolder.refs;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, valueOf, null, null, null, null, null, null, null, 3000L, null, null, composerReferences2.getContainer().g(), 57306, null).show();
        }
    }
}
