package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation;

import Vg.d;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import ik0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetInsurancePanelBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.InsurancePanelAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.decoration.InsurancePanelDecoration;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u0018\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelViewModel;LVg/d;)V", "", "observeAction", "()V", "item", "bindWithPayloads", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;Ll20/d;Ljava/lang/Object;)V", "onAttach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelViewModel;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetInsurancePanelBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetInsurancePanelBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/adapter/InsurancePanelAdapter;", "insurancesAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/adapter/InsurancePanelAdapter;", "Landroidx/recyclerview/widget/D;", "snapHelper", "Landroidx/recyclerview/widget/D;", "", "currentSnapPosition", "I", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelWidgetViewHolder extends k<InsurancePanelVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetInsurancePanelBinding binding;

    @NotNull
    private final View containerView;
    private int currentSnapPosition;

    @NotNull
    private final InsurancePanelAdapter insurancesAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final D snapHelper;

    @NotNull
    private final InsurancePanelViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsurancePanelWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull InsurancePanelViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        WidgetInsurancePanelBinding bind = WidgetInsurancePanelBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new InsurancePanelWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new InsurancePanelWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        InsurancePanelAdapter insurancePanelAdapter = new InsurancePanelAdapter(buildHandler);
        this.insurancesAdapter = insurancePanelAdapter;
        s sVar = new s();
        this.snapHelper = sVar;
        RecyclerView recyclerView = bind.insurancesRV;
        sVar.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(insurancePanelAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$default(recyclerView, UiExtKt.toPx(300, context), K.a(this), 0, new InsurancePanelWidgetViewHolder$1$1(this), 4, (Object) null);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new InsurancePanelDecoration(context2));
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelWidgetViewHolder$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                D d11;
                int i11;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                d11 = InsurancePanelWidgetViewHolder.this.snapHelper;
                Integer a11 = b.a(d11, recyclerView2);
                if (a11 != null) {
                    i11 = InsurancePanelWidgetViewHolder.this.currentSnapPosition;
                    if (i11 != a11.intValue()) {
                        InsurancePanelWidgetViewHolder.this.currentSnapPosition = a11.intValue();
                        composerReferences = InsurancePanelWidgetViewHolder.this.refs;
                        composerReferences.getController().update(new InsurancePanelUpdate(a11.intValue()));
                    }
                }
            }
        });
    }

    private final void bindWithPayloads(InsurancePanelVO item) {
        this.insurancesAdapter.setItems(item.getInsurances());
        LargeButtonView selectButtonLBV = this.binding.selectButtonLBV;
        Intrinsics.checkNotNullExpressionValue(selectButtonLBV, "selectButtonLBV");
        LargeButtonHolderKt.bindOrGone(selectButtonLBV, item.getCurrentSelectButton(), this.actionHandler);
    }

    private final void observeAction() {
        this.viewModel.actionLiveData().observe(this, new InsurancePanelWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new InsurancePanelWidgetViewHolder$observeAction$1(this)));
        this.viewModel.progressLiveData().observe(this, new InsurancePanelWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new InsurancePanelWidgetViewHolder$observeAction$2(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InsurancePanelVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView titleTAV = this.binding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
        TextAtomHolderKt.bind$default(titleTAV, item.getTitle(), null, 2, null);
        this.binding.moreInfoButtonLBV.bindOrGone(item.getMoreInfoButton(), this.actionHandler);
        LargeBorderlessButtonView cancelButtonLBBV = this.binding.cancelButtonLBBV;
        Intrinsics.checkNotNullExpressionValue(cancelButtonLBBV, "cancelButtonLBBV");
        LargeBorderlessButtonHolderKt.bind(cancelButtonLBBV, item.getCancelButton(), this.actionHandler);
        LargeButtonView selectButtonLBV = this.binding.selectButtonLBV;
        Intrinsics.checkNotNullExpressionValue(selectButtonLBV, "selectButtonLBV");
        LargeButtonHolderKt.bindOrGone(selectButtonLBV, item.getCurrentSelectButton(), this.actionHandler);
        this.insurancesAdapter.setItems(item.getInsurances());
        this.currentSnapPosition = item.getSelectedInsuranceInd();
        this.binding.insurancesRV.scrollToPosition(item.getSelectedInsuranceInd());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InsurancePanelVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        InsurancePanelVO insurancePanelVO = payload instanceof InsurancePanelVO ? (InsurancePanelVO) payload : null;
        if (insurancePanelVO != null) {
            bindWithPayloads(insurancePanelVO);
        } else {
            super.bind((InsurancePanelWidgetViewHolder) item, info, payload);
        }
    }
}
