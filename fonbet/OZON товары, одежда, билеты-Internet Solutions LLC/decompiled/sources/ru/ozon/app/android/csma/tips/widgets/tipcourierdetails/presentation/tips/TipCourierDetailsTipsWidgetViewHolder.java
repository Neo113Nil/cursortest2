package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

import Vg.d;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.csma.tips.core.rv.AspectOffsetDecorator;
import ru.ozon.app.android.csma.tips.core.rv.v2.TipsAspectsAdapterV2;
import ru.ozon.app.android.csma.tips.databinding.WidgetTipCourierDetailsLayoutBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailsStubVI;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsVI;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00010B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b\u001b\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailsStubVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersFactory", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "mapper", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;LVg/d;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "getLink", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/String;", "", "observeState", "()V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "item", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailsStubVI;Ll20/d;)V", "onAttach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "LVg/d;", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierDetailsLayoutBinding;", "binding", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierDetailsLayoutBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/csma/tips/core/rv/v2/TipsAspectsAdapterV2;", "adapter", "Lru/ozon/app/android/csma/tips/core/rv/v2/TipsAspectsAdapterV2;", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierDetailsTipsWidgetViewHolder extends k<TipCourierDetailsStubVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TipsAspectsAdapterV2 adapter;

    @NotNull
    private final WidgetTipCourierDetailsLayoutBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final d customActionHandlersFactory;

    @NotNull
    private final TipCourierDetailsViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipCourierDetailsTipsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull TipCourierDetailsViewModel viewModel, @NotNull d customActionHandlersFactory, @NotNull TipCourierDetailsMapper mapper) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersFactory, "customActionHandlersFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.customActionHandlersFactory = customActionHandlersFactory;
        WidgetTipCourierDetailsLayoutBinding bind = WidgetTipCourierDetailsLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customAnalyticHandler(TipCourierDetailsTipsWidgetViewHolder$actionHandler$1.INSTANCE).customActionHandlers(new TipCourierDetailsTipsWidgetViewHolder$actionHandler$2(this)).onPreProcess(new TipCourierDetailsTipsWidgetViewHolder$actionHandler$3(this)).onClick(new TipCourierDetailsTipsWidgetViewHolder$actionHandler$4(this)).buildHandler();
        this.actionHandler = buildHandler;
        TipsAspectsAdapterV2 tipsAspectsAdapterV2 = new TipsAspectsAdapterV2(buildHandler, viewModel, mapper, this);
        this.adapter = tipsAspectsAdapterV2;
        RecyclerView recyclerView = bind.tipsPickerRecycler;
        recyclerView.setAdapter(tipsAspectsAdapterV2);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.setRecycleChildrenOnDetach(true);
        }
        recyclerView.addItemDecoration(new AspectOffsetDecorator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLink(AtomAction action) {
        if (Intrinsics.d(action.getId(), "change_payment") && (action instanceof AtomAction.Move)) {
            return ((AtomAction.Move) action).getLink();
        }
        return null;
    }

    private final void observeState() {
        this.viewModel.getTipsData().observe(this, new TipCourierDetailsTipsWidgetViewHolder$observeState$1(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TipCourierDetailsStubVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(TipCourierDetailsTipsVI item) {
        if (item == null) {
            return;
        }
        this.adapter.submitList(item.getTips());
        WidgetTipCourierDetailsLayoutBinding widgetTipCourierDetailsLayoutBinding = this.binding;
        TextView paymentSubtitle = widgetTipCourierDetailsLayoutBinding.paymentSubtitle;
        Intrinsics.checkNotNullExpressionValue(paymentSubtitle, "paymentSubtitle");
        ViewExtKt.showOrGone(paymentSubtitle, Boolean.valueOf(item.getChangePayment() != null));
        TipCourierDetailsTipsVI.ChangePaymentVI changePayment = item.getChangePayment();
        if (changePayment != null) {
            widgetTipCourierDetailsLayoutBinding.paymentSubtitle.setText(changePayment.getTitle());
        }
        SmallBorderlessButtonView changePaymentActionButton = widgetTipCourierDetailsLayoutBinding.changePaymentActionButton;
        Intrinsics.checkNotNullExpressionValue(changePaymentActionButton, "changePaymentActionButton");
        TipCourierDetailsTipsVI.ChangePaymentVI changePayment2 = item.getChangePayment();
        WrappedBorderlessButtonHolderKt.bindOrGone(changePaymentActionButton, changePayment2 != null ? changePayment2.getActionButton() : null, this.actionHandler);
    }
}
