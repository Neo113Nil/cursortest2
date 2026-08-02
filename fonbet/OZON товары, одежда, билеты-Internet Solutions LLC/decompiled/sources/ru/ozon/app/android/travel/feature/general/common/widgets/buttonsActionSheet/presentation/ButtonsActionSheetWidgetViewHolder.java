package ru.ozon.app.android.travel.feature.general.common.widgets.buttonsActionSheet.presentation;

import Vg.d;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetButtonsActionSheetBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonsActionSheet.presentation.adapter.ButtonsActionSheetItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonsActionSheet/presentation/ButtonsActionSheetWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonsActionSheet/presentation/ButtonsActionSheetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "", "setUpActionsLayout", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonsActionSheet/presentation/ButtonsActionSheetVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetButtonsActionSheetBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetButtonsActionSheetBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "actionsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonsActionSheetWidgetViewHolder extends k<ButtonsActionSheetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter actionsAdapter;

    @NotNull
    private final WidgetButtonsActionSheetBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsActionSheetWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        WidgetButtonsActionSheetBinding bind = WidgetButtonsActionSheetBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new ButtonsActionSheetWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        setUpActionsLayout();
    }

    private final void setUpActionsLayout() {
        this.actionsAdapter.setOnAction(this.actionHandler);
        VerticalAtomsLayout verticalAtomsLayout = this.binding.buttonsActionSheetListLayout;
        verticalAtomsLayout.setAdapter(this.actionsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new ButtonsActionSheetItemDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ButtonsActionSheetVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView buttonsActionSheetTitleTextView = this.binding.buttonsActionSheetTitleTextView;
        Intrinsics.checkNotNullExpressionValue(buttonsActionSheetTitleTextView, "buttonsActionSheetTitleTextView");
        TextAtomHolderKt.bindOrGone$default(buttonsActionSheetTitleTextView, item.getTitle(), null, 2, null);
        TextAtomView buttonsActionSheetSubtitleTextView = this.binding.buttonsActionSheetSubtitleTextView;
        Intrinsics.checkNotNullExpressionValue(buttonsActionSheetSubtitleTextView, "buttonsActionSheetSubtitleTextView");
        TextAtomHolderKt.bindOrGone$default(buttonsActionSheetSubtitleTextView, item.getSubtitle(), null, 2, null);
        this.actionsAdapter.bind(getContext(), item.getActions());
    }
}
