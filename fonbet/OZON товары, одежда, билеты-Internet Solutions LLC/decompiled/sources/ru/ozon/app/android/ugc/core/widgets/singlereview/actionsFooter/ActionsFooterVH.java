package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.c;
import android.view.View;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00100#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView;", "view", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "checkActionStates", "()V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;Ll20/d;Ljava/lang/Object;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionsFooterVH extends k<ActionsFooterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel;

    @NotNull
    private final ActionsFooterView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsFooterVH(@NotNull ActionsFooterView view, @NotNull UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel, @NotNull ComposerReferences refs, @NotNull c customActionHandlersStore, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ugcCachedActionsSharedViewModel, "ugcCachedActionsSharedViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.ugcCachedActionsSharedViewModel = ugcCachedActionsSharedViewModel;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ActionsFooterVH$actionHandler$1(customActionHandlersStore)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkActionStates() {
        AtomActionDTO action;
        Map<String, String> params;
        String id2;
        boolean booleanValue;
        ActionsFooterVO boundData = getBoundData();
        if (boundData == null || !this.ugcCachedActionsSharedViewModel.hasSavedStates(boundData.getReviewUuid())) {
            return;
        }
        List<SingleReviewDTO.FooterControlDTO> leftButtons = boundData.getLeftButtons();
        if (leftButtons == null) {
            leftButtons = K.f71697a;
        }
        List<SingleReviewDTO.FooterControlDTO> list = leftButtons;
        List<SingleReviewDTO.FooterControlDTO> rightButtons = boundData.getRightButtons();
        if (rightButtons == null) {
            rightButtons = K.f71697a;
        }
        Iterator it = C7714v.p0(rightButtons, list).iterator();
        while (it.hasNext()) {
            SingleReviewDTO.FooterControlDTO footerControlDTO = (SingleReviewDTO.FooterControlDTO) it.next();
            CommonControlSettings common = footerControlDTO.getNormal().getCommon();
            if (common != null && (action = common.getAction()) != null && (((params = action.getParams()) != null && (id2 = params.get("reaction")) != null) || (id2 = action.getId()) != null)) {
                Boolean isActionSelected = this.ugcCachedActionsSharedViewModel.isActionSelected(boundData.getReviewUuid(), id2);
                if (isActionSelected != null && footerControlDTO.isSelected() != (booleanValue = isActionSelected.booleanValue())) {
                    this.refs.getController().update(new ActionsFooterStateUpdateKey(boundData.getReviewUuid(), booleanValue, id2));
                }
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        checkActionStates();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.ugcCachedActionsSharedViewModel.getActionsChanged(), new ActionsFooterVH$onAttachViewModel$1(this, null)), androidx.lifecycle.K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActionsFooterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsInItems()) {
            View view = this.itemView;
            Dimens dimens = Dimens.INSTANCE;
            view.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        }
        this.view.bind(item, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActionsFooterVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            super.bind((ActionsFooterVH) item, info, payload);
            return;
        }
        this.view.bindTopSeparator(item.getHasSeparator());
        for (ActionsFooterViewMapper.ActionFooterButtonPayload actionFooterButtonPayload : (List) payload) {
            this.view.bindButton(actionFooterButtonPayload.getButton(), actionFooterButtonPayload.getIndex(), this.actionHandler, actionFooterButtonPayload.getIsRight());
        }
    }
}
