package ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation;

import IK.a;
import Vg.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.databinding.WidgetNpsRatingBinding;
import ru.ozon.app.android.storefront.widgets.feedback.common.CloseFlowAndActionDoActionHandler;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarBinder;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingVO;
import ru.ozon.app.android.uikit.utils.ViewExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 82\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00018B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"J3\u0010)\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;", "selectorVO", "", "bindSelector", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;)V", "", ImagesContract.URL, "", "imagesUrl", "loadImage", "(Ljava/lang/String;Ljava/util/List;)V", "item", "bindButton", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionWithParams", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;)Lru/ozon/uni/atoms/af/AtomAction;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/databinding/WidgetNpsRatingBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetNpsRatingBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "feedbackNavbarBinder", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NpsRatingViewHolder extends k<NpsRatingVO> {

    @NotNull
    private static final Set<Class<? extends CustomActionHandler>> customActionHandlers;

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetNpsRatingBinding binding;

    @NotNull
    private final FeedbackNavbarBinder feedbackNavbarBinder;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/C;", "", "invoke", "(Landroidx/activity/C;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<C, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C c11) {
            invoke2(c11);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C addCallback) {
            NpsRatingVO npsRatingVO;
            FeedbackNavbarVO navbar;
            AtomAction closeAction;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            l viewItem = NpsRatingViewHolder.this.getViewItem();
            if (viewItem == null || (npsRatingVO = (NpsRatingVO) viewItem.e()) == null || (navbar = npsRatingVO.getNavbar()) == null || (closeAction = navbar.getCloseAction()) == null) {
                return;
            }
            NpsRatingViewHolder.this.actionHandler.invoke(closeAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingViewHolder$Companion;", "", "<init>", "()V", "SELECTOR_PARAM_NAME", "", "customActionHandlers", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "getCustomActionHandlers", "()Ljava/util/Set;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends CustomActionHandler>> getCustomActionHandlers() {
            return NpsRatingViewHolder.customActionHandlers;
        }

        private Companion() {
        }
    }

    static {
        Class[] elements = {PopBackStackActionHandler.class, ComposerActionWithActionHandler.class, CloseFlowAndActionDoActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        customActionHandlers = C7705l.j0(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NpsRatingViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        J onBackPressedDispatcher;
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.ref = ref;
        WidgetNpsRatingBinding bind = WidgetNpsRatingBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new NpsRatingViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        ComponentCallbacksC5392m c11 = ref.getContainer().c();
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        ComponentCallbacksC5392m c12 = ref.getContainer().c();
        this.feedbackNavbarBinder = new FeedbackNavbarBinder(c11, context, function1, (c12 == null || (view = c12.getView()) == null) ? null : ComposerViewExtensionKt.composerToolbar(view));
        r a11 = ref.getContainer().a();
        if (a11 == null || (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) == null) {
            return;
        }
        L.a(onBackPressedDispatcher, ref.getContainer().f(), new AnonymousClass1(), 2);
    }

    private final void bindButton(NpsRatingVO item) {
        LargeButtonView largeButtonView = this.binding.buttonNext;
        Intrinsics.f(largeButtonView);
        LargeButtonHolderKt.bind$default(largeButtonView, item.getNextPageButton(), null, 2, null);
        largeButtonView.setEnabled(item.getBody().getSelector().getCurrentProgress() != null);
        largeButtonView.setOnClickListener(new a(0, this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindButton$lambda$9$lambda$8(NpsRatingViewHolder npsRatingViewHolder, NpsRatingVO npsRatingVO, View view) {
        AtomAction actionWithParams = npsRatingViewHolder.getActionWithParams(npsRatingVO);
        if (actionWithParams != null) {
            npsRatingViewHolder.actionHandler.invoke(actionWithParams);
        }
    }

    private final void bindSelector(NpsRatingVO.Selector selectorVO) {
        WidgetNpsRatingBinding widgetNpsRatingBinding = this.binding;
        TextAtomView textAtomView = widgetNpsRatingBinding.leftSelectorDescription;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, selectorVO.getLeftDescription(), null, 2, null);
        textAtomView.setLetterSpacing(0.0f);
        TextAtomView textAtomView2 = widgetNpsRatingBinding.rightSelectorDescription;
        Intrinsics.f(textAtomView2);
        TextAtomHolderKt.bind$default(textAtomView2, selectorVO.getRightDescription(), null, 2, null);
        textAtomView2.setLetterSpacing(0.0f);
        widgetNpsRatingBinding.selector.setSelectionColor(StyleParser.INSTANCE.parseColor(getContext(), selectorVO.getSelectionColor()));
        widgetNpsRatingBinding.selector.drawCells();
        Integer currentProgress = selectorVO.getCurrentProgress();
        if (currentProgress == null) {
            loadImage(selectorVO.getDefaultImage(), selectorVO.getImagesUrl());
        } else {
            widgetNpsRatingBinding.selector.setProgressWithoutCallback(currentProgress.intValue());
            loadImage(selectorVO.getImagesUrl().get(currentProgress.intValue()), selectorVO.getImagesUrl());
        }
        widgetNpsRatingBinding.selector.addSelectionListener(new NpsRatingViewHolder$bindSelector$1$3(selectorVO, this, widgetNpsRatingBinding));
    }

    private final AtomAction getActionWithParams(NpsRatingVO item) {
        AtomActionDTO copy$default;
        Map<String, String> params;
        AtomActionDTO action = item.getNextPageButton().getAction();
        LinkedHashMap linkedHashMap = (action == null || (params = action.getParams()) == null) ? new LinkedHashMap() : U.u(params);
        linkedHashMap.put("service_rating", String.valueOf(this.binding.selector.getProgress()));
        AtomActionDTO action2 = item.getNextPageButton().getAction();
        if (action2 == null || (copy$default = AtomActionDTO.copy$default(action2, null, null, null, linkedHashMap, null, 23, null)) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(copy$default, item.getNextPageButton().getTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadImage(String url, List<String> imagesUrl) {
        if (imagesUrl.size() == 11) {
            AppCompatImageView ratingImage = this.binding.ratingImage;
            Intrinsics.checkNotNullExpressionValue(ratingImage, "ratingImage");
            ImageViewExtKt.load$default(ratingImage, url, null, null, null, null, false, null, 126, null);
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.expandToNonOverlapArea(constraintLayout, info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NpsRatingVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetNpsRatingBinding widgetNpsRatingBinding = this.binding;
        TextAtomView textAtomView = widgetNpsRatingBinding.title;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, item.getBody().getTitle(), null, 2, null);
        textAtomView.setLetterSpacing(0.0f);
        TextAtomView textAtomView2 = widgetNpsRatingBinding.subtitle;
        Intrinsics.f(textAtomView2);
        TextAtomHolderKt.bind$default(textAtomView2, item.getBody().getSubtitle(), null, 2, null);
        textAtomView2.setLetterSpacing(0.0f);
        bindButton(item);
        this.feedbackNavbarBinder.bindNavbar(item.getNavbar());
        bindSelector(item.getBody().getSelector());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NpsRatingVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
