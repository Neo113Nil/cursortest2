package ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation;

import Ae.C2399j;
import Ae.M0;
import Sc.s;
import Vg.d;
import Wc.a;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.checkout.databinding.WidgetTotalCommonStickyBinding;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutcomposer.total.presentation.ExtentionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00160!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalViewHolder;", "Ld20/a;", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO;", "Ll10/i;", "container", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonStickyBinding;", "binding", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonStickyBinding;LVg/d;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO;)V", "Ll10/i;", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonStickyBinding;", "LVg/d;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "", "isRebindNeeded", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyTotalViewHolder extends AbstractC6064a<StickyTotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTotalCommonStickyBinding binding;

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;

    @NotNull
    private final i container;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private boolean isRebindNeeded;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation.StickyTotalViewHolder$1", f = "StickyTotalViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation.StickyTotalViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<Boolean, View, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), view, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, View view, kotlin.coroutines.d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = z11;
            anonymousClass1.L$0 = view;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyTotalViewHolder(@NotNull i container, @NotNull WidgetTotalCommonStickyBinding binding, @NotNull d customActionHandlersStoreFactory, @NotNull CheckoutPrefetchController checkoutPrefetchController, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.binding = binding;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.checkoutPrefetchController = checkoutPrefetchController;
        this.createAndPayViewModel = createAndPayViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).configureBottomSheetWrapContent(true).customActionHandlers(new StickyTotalViewHolder$actionHandler$1(this)).onComposerAction(new StickyTotalViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        binding.buttonBA.setOnAction(buildHandler);
        M0<Boolean> isVisibleFlow = totalVisibilityViewModel.isVisibleFlow();
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(isVisibleFlow, constraintLayout, null, new AnonymousClass1(null), 2, null), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyTotalVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTotalCommonStickyBinding widgetTotalCommonStickyBinding = this.binding;
        FrameLayout notificationBadgeContainer = widgetTotalCommonStickyBinding.notificationBadgeContainer;
        Intrinsics.checkNotNullExpressionValue(notificationBadgeContainer, "notificationBadgeContainer");
        ViewExtKt.showOrGone(notificationBadgeContainer, Boolean.valueOf(item.getBadgeInfo() != null));
        TextAtomV2View taxAmountView = widgetTotalCommonStickyBinding.taxAmountView;
        Intrinsics.checkNotNullExpressionValue(taxAmountView, "taxAmountView");
        TextHolderKt.bindOrGone$default(taxAmountView, item.getTaxAmount(), null, 2, null);
        BadgeDTO badgeInfo = item.getBadgeInfo();
        if (badgeInfo != null) {
            Rounds rounds = Intrinsics.d(item.getShowIsland(), Boolean.TRUE) ? Rounds.ROUND_ROUNDED : Rounds.ROUND_DEFAULT;
            BadgeView notificationBadge = widgetTotalCommonStickyBinding.notificationBadge;
            Intrinsics.checkNotNullExpressionValue(notificationBadge, "notificationBadge");
            BadgeHolderKt.bind(notificationBadge, BadgeDTO.copy$default(badgeInfo, null, null, null, null, null, null, null, null, null, null, null, rounds, 2047, null), this.actionHandler);
        }
        PriceAtomView priceAV = widgetTotalCommonStickyBinding.priceAV;
        Intrinsics.checkNotNullExpressionValue(priceAV, "priceAV");
        PriceAtomHolderKt.bindOrGone$default(priceAV, item.getSummary().getNewPrice(), null, 2, null);
        TextAtomV2View infoTAV = widgetTotalCommonStickyBinding.infoTAV;
        Intrinsics.checkNotNullExpressionValue(infoTAV, "infoTAV");
        TextHolderKt.bindOrGone$default(infoTAV, item.getSummary().getNewAtomInfoText(), null, 2, null);
        if (this.isRebindNeeded) {
            ButtonAtom buttonBA = widgetTotalCommonStickyBinding.buttonBA;
            Intrinsics.checkNotNullExpressionValue(buttonBA, "buttonBA");
            ExtentionsKt.rebindButton(buttonBA, item.getButton(), Button.Style.PRIMARY);
            this.isRebindNeeded = false;
        }
        widgetTotalCommonStickyBinding.buttonBA.bind(item.getButton());
        ButtonAtom buttonBA2 = widgetTotalCommonStickyBinding.buttonBA;
        Intrinsics.checkNotNullExpressionValue(buttonBA2, "buttonBA");
        ExtentionsKt.customizeButton(buttonBA2, item.getButtonColor(), item.getButtonTextColor(), new StickyTotalViewHolder$bind$1$2(this));
        View separator = widgetTotalCommonStickyBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        Boolean disableSeparator = item.getDisableSeparator();
        Boolean bool = Boolean.TRUE;
        separator.setVisibility(Intrinsics.d(disableSeparator, bool) ? 8 : 0);
        IslandSeparatorView islandSeparator = widgetTotalCommonStickyBinding.islandSeparator;
        Intrinsics.checkNotNullExpressionValue(islandSeparator, "islandSeparator");
        islandSeparator.setVisibility(Intrinsics.d(item.getShowIsland(), bool) ? 0 : 8);
        if (!Intrinsics.d(item.getShowIsland(), bool)) {
            View spaceForSeparator = widgetTotalCommonStickyBinding.spaceForSeparator;
            Intrinsics.checkNotNullExpressionValue(spaceForSeparator, "spaceForSeparator");
            spaceForSeparator.setVisibility(8);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        int parseColor = styleParser.parseColor(L11, item.getBackgroundColor(), R$color.bg_dark_key);
        widgetTotalCommonStickyBinding.islandSeparator.setViewState(new IslandSeparatorView.ViewState(false, false, 0, parseColor, 1, null));
        widgetTotalCommonStickyBinding.totalContainer.setBackgroundColor(parseColor);
        boolean z11 = ComposerViewExtensionKt.composerBottomContainer(this.container.Y()).getChildCount() == 1;
        ComposerViewExtensionKt.composerBottomContainer(this.container.Y()).setClipChildren(z11);
        View spaceForSeparator2 = widgetTotalCommonStickyBinding.spaceForSeparator;
        Intrinsics.checkNotNullExpressionValue(spaceForSeparator2, "spaceForSeparator");
        spaceForSeparator2.setVisibility(z11 ? 0 : 8);
    }
}
