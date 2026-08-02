package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.csma.tips.core.rv.AspectOffsetDecorator;
import ru.ozon.app.android.csma.tips.databinding.WidgetTipCourierReviewLayoutBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewStubDO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv.TipReviewAspectsAdapterV2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u0018\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/TipCourierReviewWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewStubDO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "viewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "mapper", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;)V", "", "observeState", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "getLink", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/String;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;", "item", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewStubDO;Ll20/d;)V", "onAttach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierReviewLayoutBinding;", "binding", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierReviewLayoutBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/TipReviewAspectsAdapterV2;", "adapter", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/TipReviewAspectsAdapterV2;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierReviewWidgetViewHolder extends k<TipCourierReviewStubDO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TipReviewAspectsAdapterV2 adapter;

    @NotNull
    private final WidgetTipCourierReviewLayoutBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TipCourierReviewViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipCourierReviewWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull TipCourierReviewViewModel viewModel, @NotNull TipCourierReviewMapper mapper) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.containerView = containerView;
        this.viewModel = viewModel;
        WidgetTipCourierReviewLayoutBinding bind = WidgetTipCourierReviewLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customAnalyticHandler(TipCourierReviewWidgetViewHolder$actionHandler$1.INSTANCE).onPreProcess(new TipCourierReviewWidgetViewHolder$actionHandler$2(this)).onClick(new TipCourierReviewWidgetViewHolder$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        TipReviewAspectsAdapterV2 tipReviewAspectsAdapterV2 = new TipReviewAspectsAdapterV2(buildHandler, viewModel, mapper, this);
        this.adapter = tipReviewAspectsAdapterV2;
        RecyclerView recyclerView = bind.tipsPickerRecycler;
        recyclerView.setAdapter(tipReviewAspectsAdapterV2);
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
        this.viewModel.getTipsData().observe(this, new TipCourierReviewWidgetViewHolder$observeState$1(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TipCourierReviewStubDO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(TipCourierReviewVO item) {
        String title;
        TipCourierReviewVO.ChangePaymentVO changePayment;
        TipCourierReviewVO.ChangePaymentVO changePayment2;
        String title2;
        ViewExtKt.showOrGone(this.containerView, Boolean.valueOf(item != null));
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        this.adapter.submitList(item != null ? item.getTips() : null);
        TextView paymentSubtitle = this.binding.paymentSubtitle;
        Intrinsics.checkNotNullExpressionValue(paymentSubtitle, "paymentSubtitle");
        ViewExtKt.showOrGone(paymentSubtitle, Boolean.valueOf((item != null ? item.getChangePayment() : null) != null));
        if (item != null && (changePayment2 = item.getChangePayment()) != null && (title2 = changePayment2.getTitle()) != null) {
            this.binding.paymentSubtitle.setText(title2);
        }
        SmallBorderlessButtonView changePaymentActionButton = this.binding.changePaymentActionButton;
        Intrinsics.checkNotNullExpressionValue(changePaymentActionButton, "changePaymentActionButton");
        if (item != null && (changePayment = item.getChangePayment()) != null) {
            smallBorderlessButton = changePayment.getActionButton();
        }
        WrappedBorderlessButtonHolderKt.bindOrGone(changePaymentActionButton, smallBorderlessButton, this.actionHandler);
        if (item == null || (title = item.getTitle()) == null) {
            return;
        }
        this.binding.title.setText(title);
    }
}
