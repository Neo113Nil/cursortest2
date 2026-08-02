package ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ar.c;
import El.C2971a;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.ugc.databinding.WidgetAdditionalReviewV2Binding;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.core.AdditionalReviewShowUpdate;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.core.AdditionalReviewV2ViewMapper;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J'\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b!\u0010%J/\u0010+\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u000e\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0010008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;", "Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewV2Binding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2ViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "", "itemsList", "", "handleItemRemovalAndUpdate", "(Ljava/util/List;)V", "showErrorMessage", "()V", "Landroid/view/View;", "setProductClickListener", "(Landroid/view/View;)V", "item", "sendViewEvents", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewV2VH extends k<AdditionalReviewV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAdditionalReviewV2Binding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AdditionalReviewV2ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VH$Companion;", "", "<init>", "()V", "SKIP_REVIEW_COMPOSER_ACTION_V2", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdditionalReviewV2VH(@NotNull WidgetAdditionalReviewV2Binding binding, @NotNull ComposerReferences refs, @NotNull AdditionalReviewV2ViewModel viewModel, @NotNull HandlersInhibitor handlersInhibitor) {
        super(r0);
        View view;
        RecyclerView composerRecyclerView;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).onComposerAction(new AdditionalReviewV2VH$actionHandler$1(this)).customAnalyticHandler(AdditionalReviewV2VH$actionHandler$2.INSTANCE).buildHandler();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null) {
            ScrollExtKt.scrollEnable(composerRecyclerView, false);
        }
        Image productIV = binding.productIV;
        Intrinsics.checkNotNullExpressionValue(productIV, "productIV");
        setProductClickListener(productIV);
        binding.title.setTextIsSelectable(false);
        TextAtomV2View title = binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        setProductClickListener(title);
        binding.hideTitle.setTextIsSelectable(false);
        binding.hideTitle.setOnClickListener(new c(this, 5));
        binding.reviewRatingView.setRatingClickCallback(new AdditionalReviewV2VH$1$2(this, binding));
    }

    private final void handleItemRemovalAndUpdate(List<Long> itemsList) {
        AdditionalReviewV2VO boundData = getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            if (itemsList.contains(Long.valueOf(id2))) {
                return;
            }
            this.refs.getController().m(id2);
            Long l11 = (Long) C7714v.M(itemsList);
            if (l11 == null) {
                InterfaceC7851b.a.e(this.refs.getController(), null, null, null, 7);
            } else {
                this.refs.getController().update(new AdditionalReviewShowUpdate(l11.longValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(AdditionalReviewV2VH additionalReviewV2VH, View view) {
        AdditionalReviewV2VO.HideButtonVO hideButton;
        AtomAction iconButtonAction;
        AdditionalReviewV2VO boundData = additionalReviewV2VH.getBoundData();
        if (boundData == null || (hideButton = boundData.getHideButton()) == null || (iconButtonAction = hideButton.getIconButtonAction()) == null) {
            return;
        }
        additionalReviewV2VH.actionHandler.invoke(iconButtonAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$handleItemRemovalAndUpdate(AdditionalReviewV2VH additionalReviewV2VH, List list, d dVar) {
        additionalReviewV2VH.handleItemRemovalAndUpdate(list);
        return Unit.f71690a;
    }

    private final void sendViewEvents(AdditionalReviewV2VO item) {
        t iconButtonTokenizedEvent;
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        t buttonTokenizedEvent = item.getButtonTokenizedEvent();
        if (buttonTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), buttonTokenizedEvent, null, 2, null);
        }
        AdditionalReviewV2VO.HideButtonVO hideButton = item.getHideButton();
        if (hideButton == null || (iconButtonTokenizedEvent = hideButton.getIconButtonTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), iconButtonTokenizedEvent, null, 2, null);
    }

    private final void setProductClickListener(View view) {
        view.setOnClickListener(new Ar.d(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProductClickListener$lambda$4(AdditionalReviewV2VH additionalReviewV2VH, View view) {
        AtomAction action;
        AdditionalReviewV2VO boundData = additionalReviewV2VH.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        additionalReviewV2VH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage() {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup b11 = C2971a.b(this.refs);
        if (b11 == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null), this.refs.getContainer().g(), null, 8, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getItems(), new AdditionalReviewV2VH$onAttachViewModel$1(this)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getError(), new AdditionalReviewV2VH$onAttachViewModel$2(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AdditionalReviewV2VO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        if (constraintLayout.getVisibility() == 0) {
            sendViewEvents(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalReviewV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAdditionalReviewV2Binding widgetAdditionalReviewV2Binding = this.binding;
        ConstraintLayout constraintLayout = widgetAdditionalReviewV2Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.showOrGone(constraintLayout, Boolean.valueOf(item.getNeedToShow()));
        IconButtonV3View rightCornerButton = widgetAdditionalReviewV2Binding.rightCornerButton;
        Intrinsics.checkNotNullExpressionValue(rightCornerButton, "rightCornerButton");
        IconButtonV3HolderKt.bindOrGone(rightCornerButton, item.getRightCornerButton(), this.actionHandler);
        Image productIV = widgetAdditionalReviewV2Binding.productIV;
        Intrinsics.checkNotNullExpressionValue(productIV, "productIV");
        ImageHolderKt.bindOrGone$default(productIV, item.getImageAtom(), null, 2, null);
        IconView bonusIV = widgetAdditionalReviewV2Binding.bonusIV;
        Intrinsics.checkNotNullExpressionValue(bonusIV, "bonusIV");
        IconHolderKt.bindOrGone$default(bonusIV, item.getCornerIcon(), null, 2, null);
        TextAtomV2View title = widgetAdditionalReviewV2Binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View subtitle = widgetAdditionalReviewV2Binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, item.getSubtitle(), null, 2, null);
        RatingView reviewRatingView = widgetAdditionalReviewV2Binding.reviewRatingView;
        Intrinsics.checkNotNullExpressionValue(reviewRatingView, "reviewRatingView");
        DsRatingHolderKt.bind$default(reviewRatingView, item.getRating(), null, 2, null);
        TextAtomV2View hideTitle = widgetAdditionalReviewV2Binding.hideTitle;
        Intrinsics.checkNotNullExpressionValue(hideTitle, "hideTitle");
        AdditionalReviewV2VO.HideButtonVO hideButton = item.getHideButton();
        TextHolderKt.bindOrGone(hideTitle, hideButton != null ? hideButton.getTitle() : null, this.actionHandler);
        IconButtonV3View hideIconButton = widgetAdditionalReviewV2Binding.hideIconButton;
        Intrinsics.checkNotNullExpressionValue(hideIconButton, "hideIconButton");
        AdditionalReviewV2VO.HideButtonVO hideButton2 = item.getHideButton();
        IconButtonV3HolderKt.bindOrGone(hideIconButton, hideButton2 != null ? hideButton2.getIconButton() : null, this.actionHandler);
        this.viewModel.addItem(item.getId());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalReviewV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Intrinsics.d(payload, AdditionalReviewV2ViewMapper.ShowAdditionalReviewV2Payload.INSTANCE)) {
            sendViewEvents(item);
            ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.show(constraintLayout);
            return;
        }
        bind(item, info);
    }
}
