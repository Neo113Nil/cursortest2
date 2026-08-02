package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.core.rv.UtilsKt;
import ru.ozon.app.android.csma.tips.databinding.ItemTipsTextBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/TipReviewItemV2ViewHolder;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/BaseTipsReviewVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "tipItem", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/csma/tips/databinding/ItemTipsTextBinding;", "binding", "Lru/ozon/app/android/csma/tips/databinding/ItemTipsTextBinding;", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "setAtomAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipReviewItemV2ViewHolder extends BaseTipsReviewVH {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private AtomAction atomAction;

    @NotNull
    private final ItemTipsTextBinding binding;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv.TipReviewItemV2ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            AtomAction atomAction = TipReviewItemV2ViewHolder.this.getAtomAction();
            if (atomAction != null) {
                TipReviewItemV2ViewHolder.this.actionHandler.invoke(atomAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TipReviewItemV2ViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        ItemTipsTextBinding bind = ItemTipsTextBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        UtilsKt.setOnClickListener(this, new AnonymousClass1());
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv.BaseTipsReviewVH
    public void bind(@NotNull TipCourierReviewVO.BaseCourierTipVO tipItem) {
        Intrinsics.checkNotNullParameter(tipItem, "tipItem");
        TipCourierReviewVO.BaseCourierTipVO.CourierTipVariant courierTipVariant = (TipCourierReviewVO.BaseCourierTipVO.CourierTipVariant) tipItem;
        this.atomAction = courierTipVariant.getAction();
        ItemTipsTextBinding itemTipsTextBinding = this.binding;
        itemTipsTextBinding.aspectText.setText(courierTipVariant.getText());
        itemTipsTextBinding.aspectContainer.setSelected(courierTipVariant.getIsSelected());
        itemTipsTextBinding.aspectText.setSelected(courierTipVariant.getIsSelected());
        if (courierTipVariant.getIsSelected()) {
            getContainerView().requestFocus();
        }
    }

    public final AtomAction getAtomAction() {
        return this.atomAction;
    }
}
