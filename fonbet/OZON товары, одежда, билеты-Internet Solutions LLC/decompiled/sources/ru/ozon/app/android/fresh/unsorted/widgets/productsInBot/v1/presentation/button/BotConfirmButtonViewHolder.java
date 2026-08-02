package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.databinding.LayoutBotConfirmButtonBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;", "Lru/ozon/app/android/fresh/unsorted/databinding/LayoutBotConfirmButtonBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/LayoutBotConfirmButtonBinding;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "defaultRestriction", "Lru/ozon/uni/android/flashbar/model/Restriction;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BotConfirmButtonViewHolder extends k<BotConfirmButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LayoutBotConfirmButtonBinding binding;

    @NotNull
    private final Restriction defaultRestriction;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ProductsInBotViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotConfirmButtonViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull ProductsInBotViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.viewModel = viewModel;
        LayoutBotConfirmButtonBinding bind = LayoutBotConfirmButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultRestriction = new Restriction(null, StringProvider.getString(R$string.products_in_bot_common_error), null, null, Restriction.Type.WARNING.getValue(), null, null, null, null, null, null, null, 4077, null);
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new BotConfirmButtonViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BotConfirmButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        LargeButtonView confirmBv = this.binding.confirmBv;
        Intrinsics.checkNotNullExpressionValue(confirmBv, "confirmBv");
        LargeButtonHolderKt.bind(confirmBv, item.getButton(), this.actionHandler);
        LargeButtonView confirmBv2 = this.binding.confirmBv;
        Intrinsics.checkNotNullExpressionValue(confirmBv2, "confirmBv");
        ViewExtKt.disable(confirmBv2);
        this.viewModel.getCountOfProducts().observe(this.refs.getContainer().g(), new BotConfirmButtonViewHolder$sam$androidx_lifecycle_Observer$0(new BotConfirmButtonViewHolder$bind$1(this)));
        this.viewModel.getRequestState().observe(this.refs.getContainer().g(), new BotConfirmButtonViewHolder$sam$androidx_lifecycle_Observer$0(new BotConfirmButtonViewHolder$bind$2(this)));
    }
}
