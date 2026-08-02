package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation;

import HY.c;
import Vg.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.databinding.WidgetTravelOrderListMobileBinding;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.adapter.TravelOrderAtomsDecorator;
import ru.ozon.app.android.uikit.view.badge.SimpleBadgeView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J#\u0010 \u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00130/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "debtAlert", "", "bindOrRemoveDisclaimer", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "observeLiveData", "()V", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "createDisclaimerContainerView", "()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel;", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetTravelOrderListMobileBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetTravelOrderListMobileBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "disclaimerContainerView", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListMobileWidgetViewHolder extends k<TravelOrderListMobileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetTravelOrderListMobileBinding binding;

    @NotNull
    private final View containerView;
    private DisclaimerContainer disclaimerContainerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TravelOrderListMobileViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelOrderListMobileWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TravelOrderListMobileViewModel viewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        WidgetTravelOrderListMobileBinding bind = WidgetTravelOrderListMobileBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelOrderListMobileWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new TravelOrderListMobileWidgetViewHolder$actionHandler$2(this)).enableClickThrottling(handlersInhibitor).buildHandler();
        this.actionHandler = buildHandler;
        atomsAdapter.setOnAction(buildHandler);
        VerticalAtomsLayout verticalAtomsLayout = bind.orderAtomsVal;
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new TravelOrderAtomsDecorator(context));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        containerView.setOnClickListener(new c(this, 6));
        bind.orderBadgesTBLV.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(TravelOrderListMobileWidgetViewHolder travelOrderListMobileWidgetViewHolder, View view) {
        TravelOrderListMobileVO boundData = travelOrderListMobileWidgetViewHolder.getBoundData();
        if (boundData != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(travelOrderListMobileWidgetViewHolder.references.getNavigator(), boundData.getDeeplink(), null, 2, null);
        }
    }

    private final void bindOrRemoveDisclaimer(DisclaimerAtom debtAlert) {
        DisclaimerContainer disclaimerContainer = this.disclaimerContainerView;
        Unit unit = null;
        boolean z11 = (disclaimerContainer != null ? disclaimerContainer.getParent() : null) != null;
        if (debtAlert != null) {
            if (!z11) {
                DisclaimerContainer disclaimerContainer2 = this.disclaimerContainerView;
                if (disclaimerContainer2 == null) {
                    disclaimerContainer2 = createDisclaimerContainerView();
                }
                this.disclaimerContainerView = disclaimerContainer2;
                this.binding.getConstraintLayout().addView(this.disclaimerContainerView);
            }
            DisclaimerContainer disclaimerContainer3 = this.disclaimerContainerView;
            if (disclaimerContainer3 != null) {
                DisclaimerHolderKt.bind(disclaimerContainer3, debtAlert, this.actionHandler);
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        }
        if (z11) {
            this.binding.getConstraintLayout().removeView(this.disclaimerContainerView);
        }
    }

    private final DisclaimerContainer createDisclaimerContainerView() {
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(getContext(), null, 0, 6, null);
        disclaimerContainer.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewGroup.LayoutParams layoutParams = disclaimerContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41655s = this.binding.startGuideline.getId();
        bVar.f41657u = this.binding.endGuideline.getId();
        bVar.f41638j = this.binding.orderBadgesTBLV.getId();
        Context context = disclaimerContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(16, context);
        disclaimerContainer.setLayoutParams(bVar);
        return disclaimerContainer;
    }

    private final void observeLiveData() {
        this.viewModel.getProgressLiveData().observe(this, new TravelOrderListMobileWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelOrderListMobileWidgetViewHolder$observeLiveData$1(this)));
        this.viewModel.getActionLiveData().observe(this, new TravelOrderListMobileWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelOrderListMobileWidgetViewHolder$observeLiveData$2(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelOrderListMobileVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ImageView imageView = this.binding.iconIv;
        Intrinsics.f(imageView);
        imageView.setVisibility(item.getIcon() != null ? 0 : 8);
        Icon icon = item.getIcon();
        ImageViewExtKt.load$default(imageView, icon != null ? icon.getImage() : null, null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon icon2 = item.getIcon();
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
        this.binding.titleTv.setText(item.getTitle());
        this.binding.orderNumberTv.setText(item.getOrderNumber());
        AppCompatTextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        subtitleTv.setVisibility(item.getSubtitle() != null ? 0 : 8);
        this.binding.subtitleTv.setText(item.getSubtitle());
        this.binding.orderTypeTv.setText(item.getOrderTypeName());
        VectorRatingBar orderRatingVrb = this.binding.orderRatingVrb;
        Intrinsics.checkNotNullExpressionValue(orderRatingVrb, "orderRatingVrb");
        orderRatingVrb.setVisibility(item.getIsRatingVisible() ? 0 : 8);
        if (item.getIsRatingVisible()) {
            this.binding.orderRatingVrb.setNumberOfStars(item.getRating());
            this.binding.orderRatingVrb.setRating(item.getRating());
        }
        SimpleBadgeView simpleBadgeView = this.binding.orderStatusBv;
        simpleBadgeView.setTextAppearance(SimpleBadgeView.BadgeTextAppearance.BOLD);
        simpleBadgeView.setTextColorOptional(null);
        Context context2 = simpleBadgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        simpleBadgeView.setBackgroundColorOptional(styleParser.parseColor(context2, item.getOrderStatusColor()));
        simpleBadgeView.setText(item.getOrderStatusName());
        VerticalAtomsLayout orderAtomsVal = this.binding.orderAtomsVal;
        Intrinsics.checkNotNullExpressionValue(orderAtomsVal, "orderAtomsVal");
        orderAtomsVal.setVisibility(item.getAtomsList() != null ? 0 : 8);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context3 = getContext();
        List<AtomDTO> atomsList = item.getAtomsList();
        if (atomsList == null) {
            atomsList = K.f71697a;
        }
        atomsAdapter.bind(context3, atomsList);
        this.binding.orderBadgesTBLV.bindOrGone(item.getBadges());
        bindOrRemoveDisclaimer(item.getDebtAlert());
    }
}
