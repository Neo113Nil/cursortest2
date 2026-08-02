package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation;

import MP.a;
import Vg.d;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetTravelPaymentV3Binding;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.shared.TravelPaymentV3PaymentsDecorator;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.adapter.TravelPaymentV3PaymentsAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelPaymentV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelPaymentV3Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/adapter/TravelPaymentV3PaymentsAdapter;", "paymentsAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/adapter/TravelPaymentV3PaymentsAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "accountPaymentOptionsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV3WidgetViewHolder extends k<TravelPaymentV3VO> {

    @NotNull
    private final AtomsAdapter accountPaymentOptionsAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelPaymentV3Binding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TravelPaymentV3PaymentsAdapter paymentsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPaymentV3WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        WidgetTravelPaymentV3Binding bind = WidgetTravelPaymentV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelPaymentV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        TravelPaymentV3PaymentsAdapter travelPaymentV3PaymentsAdapter = new TravelPaymentV3PaymentsAdapter(buildHandler);
        this.paymentsAdapter = travelPaymentV3PaymentsAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.accountPaymentOptionsAdapter = atomsAdapter;
        RecyclerView recyclerView = bind.travelPaymentV3PaymentsRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(travelPaymentV3PaymentsAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(8, context);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new TravelPaymentV3PaymentsDecorator(px, UiExtKt.toPx(16, context2)));
        atomsAdapter.setOnAction(buildHandler);
        bind.travelPaymentV3PaymentOptionsVAL.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(TravelPaymentV3VO travelPaymentV3VO, TravelPaymentV3WidgetViewHolder travelPaymentV3WidgetViewHolder) {
        Integer selectedCardPosition = travelPaymentV3VO.getSelectedCardPosition();
        if (selectedCardPosition != null) {
            travelPaymentV3WidgetViewHolder.binding.travelPaymentV3PaymentsRV.scrollToPosition(selectedCardPosition.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPaymentV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView travelPaymentV3TitleTV = this.binding.travelPaymentV3TitleTV;
        Intrinsics.checkNotNullExpressionValue(travelPaymentV3TitleTV, "travelPaymentV3TitleTV");
        TextAtomHolderKt.bind$default(travelPaymentV3TitleTV, item.getTitle(), null, 2, null);
        this.paymentsAdapter.setItems(item.getPaymentMethods(), new a(0, item, this));
        this.binding.travelPaymentV3AnnotationDC.bindOrGone(item.getAnnotation());
        TextAtomView travelPaymentV3OptionsTitleTV = this.binding.travelPaymentV3OptionsTitleTV;
        Intrinsics.checkNotNullExpressionValue(travelPaymentV3OptionsTitleTV, "travelPaymentV3OptionsTitleTV");
        TextAtomHolderKt.bindOrGone$default(travelPaymentV3OptionsTitleTV, item.getOptionsTitle(), null, 2, null);
        VerticalAtomsLayout travelPaymentV3PaymentOptionsVAL = this.binding.travelPaymentV3PaymentOptionsVAL;
        Intrinsics.checkNotNullExpressionValue(travelPaymentV3PaymentOptionsVAL, "travelPaymentV3PaymentOptionsVAL");
        travelPaymentV3PaymentOptionsVAL.setVisibility(item.getPaymentOptions().isEmpty() ? 8 : 0);
        SmallBorderlessButtonView travelPaymentV3MilesButtonSBV = this.binding.travelPaymentV3MilesButtonSBV;
        Intrinsics.checkNotNullExpressionValue(travelPaymentV3MilesButtonSBV, "travelPaymentV3MilesButtonSBV");
        WrappedBorderlessButtonHolderKt.bindOrGone(travelPaymentV3MilesButtonSBV, item.getMilesButton(), this.actionHandler);
        this.accountPaymentOptionsAdapter.bind(getContext(), item.getPaymentOptions());
        LargeButtonView travelPaymentV3ButtonLBV = this.binding.travelPaymentV3ButtonLBV;
        Intrinsics.checkNotNullExpressionValue(travelPaymentV3ButtonLBV, "travelPaymentV3ButtonLBV");
        LargeButtonHolderKt.bindOrGone(travelPaymentV3ButtonLBV, item.getConfirmButton(), this.actionHandler);
    }
}
