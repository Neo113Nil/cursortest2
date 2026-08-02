package ru.ozon.app.android.ugc.core.widgets.singlereview.buttons;

import Bl.b;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.Action;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ButtonsVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewActions;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.core.databinding.ItemSingleReviewButtonsBinding;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010$\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00170*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/ButtonsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewButtonsBinding;", "binding", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "leftButtonConfigs", "rightButtonConfigs", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "buttonsDecorator", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewButtonsBinding;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;)V", "refs", "", "isNetworkError", "", "showErrorNotification", "(Lru/ozon/app/android/composer/ComposerReferences;Z)V", "item", "bindButtons", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "clickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "completeAction", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewButtonsBinding;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "leftButtonAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "rightButtonAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonsViewHolder extends k<ButtonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSingleReviewButtonsBinding binding;

    @NotNull
    private final AtomsAdapter leftButtonAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final AtomsAdapter rightButtonAdapter;

    @NotNull
    private final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel;

    @NotNull
    private final SingleReviewViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.ButtonsViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Action action) {
            if (action instanceof Action.BindButtons) {
                ButtonsViewHolder.this.bindButtons(((Action.BindButtons) action).getItem());
                return;
            }
            if (action instanceof Action.LikeError) {
                ButtonsViewHolder buttonsViewHolder = ButtonsViewHolder.this;
                buttonsViewHolder.showErrorNotification(buttonsViewHolder.ref, ((Action.LikeError) action).getIsNetworkError());
            } else if (action instanceof Action.SaveLikeState) {
                Action.SaveLikeState saveLikeState = (Action.SaveLikeState) action;
                ButtonsViewHolder.this.ugcCachedActionsSharedViewModel.saveActionState(saveLikeState.getReviewUuid(), saveLikeState.getIsSelected(), "like");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.ButtonsViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
            invoke2(click);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.Click click) {
            ButtonsViewHolder buttonsViewHolder = ButtonsViewHolder.this;
            Intrinsics.f(click);
            buttonsViewHolder.completeAction(click);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ButtonsViewHolder(@NotNull ItemSingleReviewButtonsBinding binding, @NotNull SingleReviewViewModel viewModel, @NotNull ComposerReferences ref, @NotNull UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel, @NotNull Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration> leftButtonConfigs, @NotNull Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration> rightButtonConfigs, @NotNull HorizontalAtomsDecorator buttonsDecorator) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(ugcCachedActionsSharedViewModel, "ugcCachedActionsSharedViewModel");
        Intrinsics.checkNotNullParameter(leftButtonConfigs, "leftButtonConfigs");
        Intrinsics.checkNotNullParameter(rightButtonConfigs, "rightButtonConfigs");
        Intrinsics.checkNotNullParameter(buttonsDecorator, "buttonsDecorator");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.ref = ref;
        this.ugcCachedActionsSharedViewModel = ugcCachedActionsSharedViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).onClick(new ButtonsViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(leftButtonConfigs, null, null, null, 14, null);
        atomsAdapter.setOnAction(buildHandler);
        this.leftButtonAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(rightButtonConfigs, null, null, null, 14, null);
        atomsAdapter2.setOnAction(buildHandler);
        this.rightButtonAdapter = atomsAdapter2;
        HorizontalAtomsLayout horizontalAtomsLayout = binding.leftButtonsHAL;
        atomsAdapter.setOnAction(buildHandler);
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        binding.leftButtonsHAL.setDecorator(buttonsDecorator);
        HorizontalAtomsLayout horizontalAtomsLayout2 = binding.rightButtonsHAL;
        atomsAdapter2.setOnAction(buildHandler);
        horizontalAtomsLayout2.setAdapter(atomsAdapter2);
        binding.rightButtonsHAL.setDecorator(buttonsDecorator);
        viewModel.getActionLiveData().observe(ref.getContainer().g(), new ButtonsViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        viewModel.getCompleteActionAfterAuthEvent().observe(ref.getContainer().g(), new ButtonsViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindButtons(ButtonsVO item) {
        List<AtomDTO> rightAtoms;
        ItemSingleReviewButtonsBinding itemSingleReviewButtonsBinding = this.binding;
        ButtonsVO boundData = getBoundData();
        if (boundData == null || boundData.getId() == item.getId()) {
            List<AtomDTO> leftAtoms = item.getLeftAtoms();
            if (leftAtoms != null) {
                if (leftAtoms.isEmpty()) {
                    leftAtoms = null;
                }
                if (leftAtoms != null) {
                    HorizontalAtomsLayout leftButtonsHAL = itemSingleReviewButtonsBinding.leftButtonsHAL;
                    Intrinsics.checkNotNullExpressionValue(leftButtonsHAL, "leftButtonsHAL");
                    ViewExtKt.show(leftButtonsHAL);
                    this.leftButtonAdapter.bind(getContext(), leftAtoms);
                    rightAtoms = item.getRightAtoms();
                    if (rightAtoms != null) {
                        List<AtomDTO> list = rightAtoms.isEmpty() ? null : rightAtoms;
                        if (list != null) {
                            HorizontalAtomsLayout rightButtonsHAL = itemSingleReviewButtonsBinding.rightButtonsHAL;
                            Intrinsics.checkNotNullExpressionValue(rightButtonsHAL, "rightButtonsHAL");
                            ViewExtKt.show(rightButtonsHAL);
                            this.rightButtonAdapter.bind(getContext(), list);
                            return;
                        }
                    }
                    HorizontalAtomsLayout rightButtonsHAL2 = itemSingleReviewButtonsBinding.rightButtonsHAL;
                    Intrinsics.checkNotNullExpressionValue(rightButtonsHAL2, "rightButtonsHAL");
                    ViewExtKt.gone(rightButtonsHAL2);
                    Unit unit = Unit.f71690a;
                }
            }
            HorizontalAtomsLayout leftButtonsHAL2 = itemSingleReviewButtonsBinding.leftButtonsHAL;
            Intrinsics.checkNotNullExpressionValue(leftButtonsHAL2, "leftButtonsHAL");
            ViewExtKt.gone(leftButtonsHAL2);
            Unit unit2 = Unit.f71690a;
            rightAtoms = item.getRightAtoms();
            if (rightAtoms != null) {
            }
            HorizontalAtomsLayout rightButtonsHAL22 = itemSingleReviewButtonsBinding.rightButtonsHAL;
            Intrinsics.checkNotNullExpressionValue(rightButtonsHAL22, "rightButtonsHAL");
            ViewExtKt.gone(rightButtonsHAL22);
            Unit unit3 = Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickAction(AtomAction.Click action) {
        t mapToTokenizedEvent$default;
        ButtonsVO boundData = getBoundData();
        if (boundData != null) {
            String id2 = action.getId();
            if (Intrinsics.d(id2, ReviewActions.LIKE.getAction())) {
                this.viewModel.clickLike(boundData);
                return;
            }
            if (Intrinsics.d(id2, ReviewActions.DISLIKE.getAction())) {
                this.viewModel.clickDislike(boundData);
                return;
            }
            if (Intrinsics.d(id2, ReviewActions.COMMENT.getAction())) {
                this.viewModel.checkAuthorise(action);
                return;
            }
            if (Intrinsics.d(id2, ReviewActions.COMMENT_MODAL.getAction())) {
                this.viewModel.checkAuthorise(action);
                return;
            }
            if (Intrinsics.d(id2, ReviewActions.EDIT.getAction())) {
                Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
                if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundData.getId()), null, 2, null)) != null) {
                    TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.ref.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
                }
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.ref.getNavigator(), String.valueOf(action.getLink()), null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeAction(AtomAction.Click action) {
        if (getBoundData() != null) {
            String id2 = action.getId();
            if (Intrinsics.d(id2, ReviewActions.COMMENT.getAction())) {
                this.ref.getNavigator().openDeeplink(String.valueOf(action.getLink()), U.i(new Pair("activateCommentField", Boolean.TRUE)));
            } else if (Intrinsics.d(id2, ReviewActions.COMMENT_MODAL.getAction())) {
                ComposerNavigator navigator = this.ref.getNavigator();
                String valueOf = String.valueOf(action.getLink());
                Boolean bool = Boolean.TRUE;
                navigator.openDeeplink(valueOf, U.j(new Pair("activateCommentField", bool), new Pair("openInModal", bool)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(ComposerReferences refs, boolean isNetworkError) {
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup b11 = b.b(refs);
        if (b11 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, isNetworkError ? NotificationBarHelperKt.createNetworkErrorNotificationDTO(AppTypeResolver.INSTANCE.isSelect(getContext())) : NotificationsKt.createFailedToSendNotification(), refs.getContainer().i(), null, 8, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0206, code lost:
    
        if (r10 != (r6 != null ? r6.bottomMargin : 0)) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r10 != (r7 != null ? r7.bottomMargin : 0)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (r11 != (r8 != null ? r8.bottomMargin : 0)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018b, code lost:
    
        if (r10 != (r7 != null ? r7.bottomMargin : 0)) goto L109;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull ButtonsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemSingleReviewButtonsBinding itemSingleReviewButtonsBinding = this.binding;
        ConstraintLayout buttonsContainer = itemSingleReviewButtonsBinding.buttonsContainer;
        Intrinsics.checkNotNullExpressionValue(buttonsContainer, "buttonsContainer");
        ViewGroup.LayoutParams layoutParams = buttonsContainer.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(item.getLeftMargin());
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = buttonsContainer.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = buttonsContainer.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = buttonsContainer.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            buttonsContainer.setLayoutParams(marginLayoutParams);
        }
        HorizontalAtomsLayout leftButtonsHAL = itemSingleReviewButtonsBinding.leftButtonsHAL;
        Intrinsics.checkNotNullExpressionValue(leftButtonsHAL, "leftButtonsHAL");
        ViewExtKt.updatePadding$default(leftButtonsHAL, 0, 0, 0, item.getBottomPadding(), 7, null);
        HorizontalAtomsLayout rightButtonsHAL = itemSingleReviewButtonsBinding.rightButtonsHAL;
        Intrinsics.checkNotNullExpressionValue(rightButtonsHAL, "rightButtonsHAL");
        ViewExtKt.updatePadding$default(rightButtonsHAL, 0, 0, 0, item.getBottomPadding(), 7, null);
        HorizontalAtomsLayout leftButtonsHAL2 = itemSingleReviewButtonsBinding.leftButtonsHAL;
        Intrinsics.checkNotNullExpressionValue(leftButtonsHAL2, "leftButtonsHAL");
        ViewGroup.LayoutParams layoutParams5 = leftButtonsHAL2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 != null) {
            int i15 = marginLayoutParams5.leftMargin;
            int i16 = marginLayoutParams5.topMargin;
            int i17 = marginLayoutParams5.rightMargin;
            int i18 = marginLayoutParams5.bottomMargin;
            marginLayoutParams5.topMargin = item.getHasEmptyReviewPadding() ? Dimens.INSTANCE.getDP_16() : Dimens.INSTANCE.getDP_12();
            if (i15 == marginLayoutParams5.leftMargin) {
                ViewGroup.LayoutParams layoutParams6 = leftButtonsHAL2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (i16 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams7 = leftButtonsHAL2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    if (i17 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams8 = leftButtonsHAL2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    }
                }
            }
            leftButtonsHAL2.setLayoutParams(marginLayoutParams5);
        }
        HorizontalAtomsLayout rightButtonsHAL2 = itemSingleReviewButtonsBinding.rightButtonsHAL;
        Intrinsics.checkNotNullExpressionValue(rightButtonsHAL2, "rightButtonsHAL");
        ViewGroup.LayoutParams layoutParams9 = rightButtonsHAL2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams9 != null) {
            int i19 = marginLayoutParams9.leftMargin;
            int i21 = marginLayoutParams9.topMargin;
            int i22 = marginLayoutParams9.rightMargin;
            int i23 = marginLayoutParams9.bottomMargin;
            marginLayoutParams9.topMargin = item.getHasEmptyReviewPadding() ? Dimens.INSTANCE.getDP_16() : 0;
            if (i19 == marginLayoutParams9.leftMargin) {
                ViewGroup.LayoutParams layoutParams10 = rightButtonsHAL2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
                if (i21 == (marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams11 = rightButtonsHAL2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                    if (i22 == (marginLayoutParams11 != null ? marginLayoutParams11.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams12 = rightButtonsHAL2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                    }
                }
            }
            rightButtonsHAL2.setLayoutParams(marginLayoutParams9);
        }
        TextAtomV2View titleTAV = itemSingleReviewButtonsBinding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
        TextHolderKt.bindOrGone$default(titleTAV, item.getTitle(), null, 2, null);
        TextAtomV2View titleTAV2 = itemSingleReviewButtonsBinding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV2, "titleTAV");
        ViewGroup.LayoutParams layoutParams13 = titleTAV2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams13 : null;
        if (marginLayoutParams13 != null) {
            int i24 = marginLayoutParams13.leftMargin;
            int i25 = marginLayoutParams13.topMargin;
            int i26 = marginLayoutParams13.rightMargin;
            int i27 = marginLayoutParams13.bottomMargin;
            marginLayoutParams13.topMargin = item.getHasGalleryPadding() ? 0 : Dimens.INSTANCE.getDP_16();
            if (i24 == marginLayoutParams13.leftMargin) {
                ViewGroup.LayoutParams layoutParams14 = titleTAV2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams14 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams14 : null;
                if (i25 == (marginLayoutParams14 != null ? marginLayoutParams14.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams15 = titleTAV2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams15 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams15 : null;
                    if (i26 == (marginLayoutParams15 != null ? marginLayoutParams15.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams16 = titleTAV2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams16 = layoutParams16 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams16 : null;
                    }
                }
            }
            titleTAV2.setLayoutParams(marginLayoutParams13);
        }
        bindButtons(item);
        View separatorBottom = itemSingleReviewButtonsBinding.separatorBottom;
        Intrinsics.checkNotNullExpressionValue(separatorBottom, "separatorBottom");
        ViewExtKt.showOrGone(separatorBottom, Boolean.valueOf(item.getSeparator()));
    }
}
