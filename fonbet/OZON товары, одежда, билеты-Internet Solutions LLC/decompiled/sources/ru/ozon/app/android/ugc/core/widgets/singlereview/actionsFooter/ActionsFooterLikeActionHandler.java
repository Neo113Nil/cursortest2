package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Ae.C2399j;
import Ae.C2408n0;
import Bl.b;
import Pc.a;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListVO;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.RightPanelButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsVO;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u0013*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterLikeActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModelImpl;", "pActionsFooterViewModel", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "pUgcCachedActionsSharedViewModel", "<init>", "(LPc/a;LPc/a;)V", "actionsFooterViewModel", "viewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lxe/B0;", "observeActions", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModelImpl;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lxe/B0;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "isReaction", "isPressedReaction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/af/AtomAction$Click;Z)Z", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "isNetworkError", "", "showErrorNotification", "(Lru/ozon/app/android/composer/ComposerReferences;Z)V", "releaseStateListenerJob", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "eventListenerJob", "Lxe/B0;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionsFooterLikeActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;
    private B0 eventListenerJob;

    @NotNull
    private final a<ActionsFooterViewModelImpl> pActionsFooterViewModel;

    @NotNull
    private final a<UgcCachedActionsSharedViewModel> pUgcCachedActionsSharedViewModel;
    public static final int $stable = 8;

    public ActionsFooterLikeActionHandler(@NotNull a<ActionsFooterViewModelImpl> pActionsFooterViewModel, @NotNull a<UgcCachedActionsSharedViewModel> pUgcCachedActionsSharedViewModel) {
        Intrinsics.checkNotNullParameter(pActionsFooterViewModel, "pActionsFooterViewModel");
        Intrinsics.checkNotNullParameter(pUgcCachedActionsSharedViewModel, "pUgcCachedActionsSharedViewModel");
        this.pActionsFooterViewModel = pActionsFooterViewModel;
        this.pUgcCachedActionsSharedViewModel = pUgcCachedActionsSharedViewModel;
        this.actionId = "like";
    }

    private final boolean isPressedReaction(AtomActionDTO atomActionDTO, AtomAction.Click click, boolean z11) {
        if (!Intrinsics.d(atomActionDTO != null ? atomActionDTO.getId() : null, getActionId())) {
            return false;
        }
        if (!z11) {
            return true;
        }
        Map<String, String> params = atomActionDTO.getParams();
        String str = params != null ? params.get("reaction") : null;
        Map<String, String> params2 = click.getParams();
        return Intrinsics.d(str, params2 != null ? params2.get("reaction") : null);
    }

    private final B0 observeActions(ActionsFooterViewModelImpl actionsFooterViewModel, UgcCachedActionsSharedViewModel viewModel, CustomActionHandler.HandlerReferences handlerRefs) {
        return C2399j.C(new C2408n0(actionsFooterViewModel.getSingleEvent(), new ActionsFooterLikeActionHandler$observeActions$1(this, handlerRefs, viewModel, null)), K.a(handlerRefs.getRefs().getContainer().g()));
    }

    private final void releaseStateListenerJob() {
        B0 b02;
        B0 b03 = this.eventListenerJob;
        if (b03 != null && b03.isActive() && (b02 = this.eventListenerJob) != null) {
            b02.j(null);
        }
        this.eventListenerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(ComposerReferences refs, boolean isNetworkError) {
        ViewGroup composerContainer;
        NotificationDTO createFailedToSendNotification;
        ViewGroup b11 = b.b(refs);
        if (b11 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null) {
            return;
        }
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        if (isNetworkError) {
            r a11 = refs.getContainer().a();
            createFailedToSendNotification = NotificationBarHelperKt.createNetworkErrorNotificationDTO(a11 != null && AppTypeResolver.INSTANCE.isSelect(a11));
        } else {
            createFailedToSendNotification = NotificationsKt.createFailedToSendNotification();
        }
        NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, createFailedToSendNotification, refs.getContainer().i(), null, 8, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        ReviewGalleryVO reviewGalleryVO;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel;
        List<RightPanelButtonDTO> buttons;
        String str;
        Boolean t02;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ActionsFooterViewModelImpl actionsFooterViewModelImpl = (ActionsFooterViewModelImpl) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterLikeActionHandler$processAction$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ActionsFooterLikeActionHandler.this.pActionsFooterViewModel;
                ActionsFooterViewModelImpl actionsFooterViewModelImpl2 = (ActionsFooterViewModelImpl) aVar.get();
                Intrinsics.g(actionsFooterViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return actionsFooterViewModelImpl2;
            }
        }).a(ActionsFooterViewModelImpl.class);
        UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel = (UgcCachedActionsSharedViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterLikeActionHandler$processAction$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ActionsFooterLikeActionHandler.this.pUgcCachedActionsSharedViewModel;
                UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel2 = (UgcCachedActionsSharedViewModel) aVar.get();
                Intrinsics.g(ugcCachedActionsSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return ugcCachedActionsSharedViewModel2;
            }
        }).a(UgcCachedActionsSharedViewModel.class);
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            boolean z11 = false;
            if (params != null && params.containsKey("reaction")) {
                z11 = true;
            }
            releaseStateListenerJob();
            Intrinsics.f(actionsFooterViewModelImpl);
            Intrinsics.f(ugcCachedActionsSharedViewModel);
            this.eventListenerJob = observeActions(actionsFooterViewModelImpl, ugcCachedActionsSharedViewModel, handlerRefs);
            l viewItem = handlerRefs.getViewItem();
            Object obj = null;
            c d11 = viewItem != null ? viewItem.d() : null;
            if (d11 instanceof ActionsFooterVO) {
                ActionsFooterVO actionsFooterVO = (ActionsFooterVO) d11;
                List<SingleReviewDTO.FooterControlDTO> leftButtons = actionsFooterVO.getLeftButtons();
                if (leftButtons == null) {
                    leftButtons = kotlin.collections.K.f71697a;
                }
                List<SingleReviewDTO.FooterControlDTO> list = leftButtons;
                List<SingleReviewDTO.FooterControlDTO> rightButtons = actionsFooterVO.getRightButtons();
                if (rightButtons == null) {
                    rightButtons = kotlin.collections.K.f71697a;
                }
                Iterator it = C7714v.p0(rightButtons, list).iterator();
                while (it.hasNext()) {
                    CommonControlSettings common = ((SingleReviewDTO.FooterControlDTO) it.next()).getNormal().getCommon();
                    if (isPressedReaction(common != null ? common.getAction() : null, click, z11)) {
                        actionsFooterViewModelImpl.votePressed(click, actionsFooterVO.getReviewUuid(), !r6.isSelected());
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (d11 instanceof SelectionReactionsVO) {
                SelectionReactionsVO selectionReactionsVO = (SelectionReactionsVO) d11;
                SelectionReactionsVO.ReactionsBlockVO leftBlock = selectionReactionsVO.getReactions().getLeftBlock();
                List<SelectionReactionsVO.ReactionsControlVO> controls = leftBlock != null ? leftBlock.getControls() : null;
                if (controls == null) {
                    controls = kotlin.collections.K.f71697a;
                }
                List<SelectionReactionsVO.ReactionsControlVO> list2 = controls;
                SelectionReactionsVO.ReactionsBlockVO rightBlock = selectionReactionsVO.getReactions().getRightBlock();
                List<SelectionReactionsVO.ReactionsControlVO> controls2 = rightBlock != null ? rightBlock.getControls() : null;
                if (controls2 == null) {
                    controls2 = kotlin.collections.K.f71697a;
                }
                Iterator it2 = C7714v.p0(controls2, list2).iterator();
                while (it2.hasNext()) {
                    CommonControlSettings common2 = ((SelectionReactionsVO.ReactionsControlVO) it2.next()).getNormal().getCommon();
                    if (isPressedReaction(common2 != null ? common2.getAction() : null, click, z11)) {
                        actionsFooterViewModelImpl.votePressed(click, String.valueOf(selectionReactionsVO.getId()), !r6.getIsSelected());
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (d11 instanceof CommentsListVO) {
                Map<String, String> params2 = click.getParams();
                if (params2 == null || (str = params2.get("isReactionSelected")) == null || (t02 = h.t0(str)) == null) {
                    return;
                }
                boolean booleanValue = t02.booleanValue();
                Map<String, String> params3 = click.getParams();
                if (params3 == null || (str2 = params3.get("commentUuid")) == null) {
                    return;
                }
                actionsFooterViewModelImpl.votePressed(click, str2, !booleanValue);
                return;
            }
            if (!(d11 instanceof ReviewGalleryVO) || (rightPanel = (reviewGalleryVO = (ReviewGalleryVO) d11).getRightPanel()) == null || (buttons = rightPanel.getButtons()) == null) {
                return;
            }
            Iterator<T> it3 = buttons.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (Intrinsics.d(((RightPanelButtonDTO) next).getNormal().getAction().getId(), "like")) {
                    obj = next;
                    break;
                }
            }
            if (((RightPanelButtonDTO) obj) == null) {
                return;
            }
            actionsFooterViewModelImpl.votePressed(click, reviewGalleryVO.getReviewUuid(), !r1.getState().isSelected());
        }
    }
}
