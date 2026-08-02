package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation;

import AU.a;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.o;
import Sc.s;
import Ve.C4598rp;
import Vg.d;
import WZ.t;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import cA.ViewOnTouchListenerC5778a;
import j.C7232a;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.ui.shoppinglists.Action;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.marketing.R$drawable;
import ru.ozon.app.android.marketing.databinding.WidgetSellerTransparencyV3Binding;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SubscribeEvent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3VO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.badgeList.BadgeListView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.badgeList.BadgeListHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 W2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001WB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u0014*\u00020)2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u0004\u0018\u00010\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u0014*\u00020/2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010\u001aJ#\u00107\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\n\u00106\u001a\u000604j\u0002`5H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010(J)\u0010>\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00140I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00140I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "sellerHeaderViewModel", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "sharedSellerViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;LVg/d;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;)V", "item", "", "bindButtons", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;)V", "", "isExtraMargins", "setMargins", "(Z)V", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;", "state", "updateButtons", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;)V", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "paddingsVO", "updatePaddings", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "observeComposerRefresh", "()V", "Landroidx/appcompat/widget/AppCompatImageView;", "isNavbarEmbedded", "setAvatarLeftMargin", "(Landroidx/appcompat/widget/AppCompatImageView;Z)V", "takeIfTrue", "(Z)Ljava/lang/Boolean;", "Lru/ozon/uni/android/atom/icon/IconView;", "showOrGone", "(Lru/ozon/uni/android/atom/icon/IconView;Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;)V", "isInfoVisible", "applySellerAreaConstraints", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;Ll20/d;)V", "onAttach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "Lru/ozon/app/android/marketing/databinding/WidgetSellerTransparencyV3Binding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetSellerTransparencyV3Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "subscribeActionHandler", "Landroid/view/View$OnClickListener;", "clickListener", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnTouchListener;", "badgeOnTouchListener", "Landroid/view/View$OnTouchListener;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "sisBrandFavoriteButtonDelegate", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerTransparencyV3ViewHolder extends k<SellerTransparencyV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View.OnTouchListener badgeOnTouchListener;

    @NotNull
    private final WidgetSellerTransparencyV3Binding binding;

    @NotNull
    private final View.OnClickListener clickListener;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SellerHeaderViewModel sellerHeaderViewModel;

    @NotNull
    private final SharedSellerViewModel sharedSellerViewModel;

    @NotNull
    private final SisBrandFavoriteButtonDelegate sisBrandFavoriteButtonDelegate;

    @NotNull
    private final Function1<AtomAction, Unit> subscribeActionHandler;
    public static final int $stable = 8;
    private static final int dp56 = ResourceExtKt.toPx(56);
    private static final int dp44 = ResourceExtKt.toPx(44);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int dp10 = ResourceExtKt.toPx(10);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp3 = ResourceExtKt.toPx(3);
    private static final int dp2 = ResourceExtKt.toPx(2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerTransparencyV3ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull SellerHeaderViewModel sellerHeaderViewModel, @NotNull SharedSellerViewModel sharedSellerViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull SisBrandFavoriteButtonDelegateFactory sisBrandFavoriteButtonDelegateFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(sellerHeaderViewModel, "sellerHeaderViewModel");
        Intrinsics.checkNotNullParameter(sharedSellerViewModel, "sharedSellerViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegateFactory, "sisBrandFavoriteButtonDelegateFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.sellerHeaderViewModel = sellerHeaderViewModel;
        this.sharedSellerViewModel = sharedSellerViewModel;
        WidgetSellerTransparencyV3Binding bind = WidgetSellerTransparencyV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SellerTransparencyV3ViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.subscribeActionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new SellerTransparencyV3ViewHolder$subscribeActionHandler$1(this)).buildHandler();
        this.clickListener = new a(this, 6);
        this.badgeOnTouchListener = new ViewOnTouchListenerC5778a(this, 0);
        SisBrandFavoriteButtonView sisBrandFavoriteBtn = bind.sisBrandFavoriteBtn;
        Intrinsics.checkNotNullExpressionValue(sisBrandFavoriteBtn, "sisBrandFavoriteBtn");
        this.sisBrandFavoriteButtonDelegate = sisBrandFavoriteButtonDelegateFactory.create(sisBrandFavoriteBtn, this, refs);
        bind.sellerSubtitle.setMovementMethod(null);
        final AbstractC5434v lifecycle = refs.getContainer().g().getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            this.sharedSellerViewModel.clear();
            this.refs.getController().getEvents().removeObservers(this.refs.getContainer().g());
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$special$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.sharedSellerViewModel.clear();
                    this.refs.getController().getEvents().removeObservers(this.refs.getContainer().g());
                    AbstractC5434v.this.e(this);
                }
            });
        }
        observeComposerRefresh();
    }

    private final void applySellerAreaConstraints(boolean isInfoVisible) {
        IconView actionArrowIv = this.binding.actionArrowIv;
        Intrinsics.checkNotNullExpressionValue(actionArrowIv, "actionArrowIv");
        ViewGroup.LayoutParams layoutParams = actionArrowIv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41657u = isInfoVisible ? this.binding.infoIcon.getId() : this.binding.buttonsBarrier.getId();
        actionArrowIv.setLayoutParams(bVar);
        View clickableSellerAreaView = this.binding.clickableSellerAreaView;
        Intrinsics.checkNotNullExpressionValue(clickableSellerAreaView, "clickableSellerAreaView");
        ViewGroup.LayoutParams layoutParams2 = clickableSellerAreaView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        if (isInfoVisible) {
            bVar2.f41658v = 0;
            bVar2.f41657u = -1;
        } else {
            bVar2.f41657u = this.binding.buttonsBarrier.getId();
            bVar2.f41658v = -1;
        }
        clickableSellerAreaView.setLayoutParams(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean badgeOnTouchListener$lambda$1(SellerTransparencyV3ViewHolder sellerTransparencyV3ViewHolder, View view, MotionEvent motionEvent) {
        SellerTransparencyV3VO boundedData;
        AtomAction headerAction;
        view.performClick();
        if (motionEvent.getAction() != 1 || (boundedData = sellerTransparencyV3ViewHolder.getBoundedData()) == null || (headerAction = boundedData.getHeaderAction()) == null) {
            return false;
        }
        sellerTransparencyV3ViewHolder.actionHandler.invoke(headerAction);
        return false;
    }

    private final void bindButtons(SellerTransparencyV3VO item) {
        WidgetSellerTransparencyV3Binding widgetSellerTransparencyV3Binding = this.binding;
        SmallIconButtonView subscribeBtn = widgetSellerTransparencyV3Binding.subscribeBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeBtn, "subscribeBtn");
        subscribeBtn.setVisibility(item.getIsLikeFunctionEnabled() && Intrinsics.d(item.getIsFavourite(), Boolean.FALSE) ? 0 : 8);
        SmallIconButtonView unsubscribeBtn = widgetSellerTransparencyV3Binding.unsubscribeBtn;
        Intrinsics.checkNotNullExpressionValue(unsubscribeBtn, "unsubscribeBtn");
        unsubscribeBtn.setVisibility(item.getIsLikeFunctionEnabled() && Intrinsics.d(item.getIsFavourite(), Boolean.TRUE) ? 0 : 8);
        ButtonV3View subscribeShopBtn = widgetSellerTransparencyV3Binding.subscribeShopBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeShopBtn, "subscribeShopBtn");
        subscribeShopBtn.setVisibility(item.getHasSubscribeButton() && Intrinsics.d(item.getIsSubscribed(), Boolean.FALSE) ? 0 : 8);
        ButtonV3View unsubscribeShopBtn = widgetSellerTransparencyV3Binding.unsubscribeShopBtn;
        Intrinsics.checkNotNullExpressionValue(unsubscribeShopBtn, "unsubscribeShopBtn");
        unsubscribeShopBtn.setVisibility(item.getHasSubscribeButton() && Intrinsics.d(item.getIsSubscribed(), Boolean.TRUE) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$0(SellerTransparencyV3ViewHolder sellerTransparencyV3ViewHolder, View view) {
        AtomAction headerAction;
        SellerTransparencyV3VO boundData = sellerTransparencyV3ViewHolder.getBoundData();
        if (boundData == null || (headerAction = boundData.getHeaderAction()) == null) {
            return;
        }
        sellerTransparencyV3ViewHolder.actionHandler.invoke(headerAction);
    }

    private final void observeComposerRefresh() {
        this.refs.getController().getEvents().observe(this.refs.getContainer().g(), new SellerTransparencyV3ViewHolder$sam$androidx_lifecycle_Observer$0(new SellerTransparencyV3ViewHolder$observeComposerRefresh$1(this)));
    }

    private final void setAvatarLeftMargin(AppCompatImageView appCompatImageView, boolean z11) {
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(z11 ? 0 : dp16);
        appCompatImageView.setLayoutParams(marginLayoutParams);
    }

    private final void setMargins(boolean isExtraMargins) {
        WidgetSellerTransparencyV3Binding widgetSellerTransparencyV3Binding = this.binding;
        LinearLayout badgesGroupLL = widgetSellerTransparencyV3Binding.badgesGroupLL;
        Intrinsics.checkNotNullExpressionValue(badgesGroupLL, "badgesGroupLL");
        ViewGroup.LayoutParams layoutParams = badgesGroupLL.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = isExtraMargins ? 0 : dp2;
        badgesGroupLL.setLayoutParams(bVar);
        IconView actionArrowIv = widgetSellerTransparencyV3Binding.actionArrowIv;
        Intrinsics.checkNotNullExpressionValue(actionArrowIv, "actionArrowIv");
        ViewGroup.LayoutParams layoutParams2 = actionArrowIv.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.setMarginStart(isExtraMargins ? dp2 : 0);
        actionArrowIv.setLayoutParams(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationModelWrapper notification) {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            SellerTransparencyV3VO boundedData = getBoundedData();
            if ((boundedData != null ? boundedData.getNotificationAction() : null) != null) {
                View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
                NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
                if (asNotificationLayoutManager == null) {
                    return;
                }
                NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, this.refs.getContainer().f(), this.actionHandler).show();
            }
        }
    }

    private final void showOrGone(IconView iconView, SellerTransparencyV3VO sellerTransparencyV3VO) {
        if (sellerTransparencyV3VO.getHasSubscribeButton() || sellerTransparencyV3VO.getIsLikeFunctionEnabled() || sellerTransparencyV3VO.getInfoIcon() == null) {
            ViewExtKt.gone(iconView);
            applySellerAreaConstraints(false);
        } else {
            IconHolderKt.bind$default(iconView, sellerTransparencyV3VO.getInfoIcon(), null, 2, null);
            ViewExtKt.show(iconView);
            applySellerAreaConstraints(true);
        }
    }

    private final Boolean takeIfTrue(boolean z11) {
        Boolean valueOf = Boolean.valueOf(z11);
        if (z11) {
            return valueOf;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtons(SubscribeEvent state) {
        WidgetSellerTransparencyV3Binding widgetSellerTransparencyV3Binding = this.binding;
        SellerTransparencyV3VO boundData = getBoundData();
        if (Intrinsics.d(boundData != null ? boundData.getSellerId() : null, state.getSellerId())) {
            if (!(state instanceof SubscribeEvent.SuccessfulEvent)) {
                if (!(state instanceof SubscribeEvent.ErrorEvent)) {
                    throw new o();
                }
                return;
            }
            boolean d11 = Intrinsics.d(((SubscribeEvent.SuccessfulEvent) state).getAction(), "sisLike");
            SmallIconButtonView unsubscribeBtn = widgetSellerTransparencyV3Binding.unsubscribeBtn;
            Intrinsics.checkNotNullExpressionValue(unsubscribeBtn, "unsubscribeBtn");
            SellerTransparencyV3VO boundData2 = getBoundData();
            unsubscribeBtn.setVisibility((boundData2 == null || takeIfTrue(boundData2.getIsLikeFunctionEnabled()) == null) ? false : d11 ? 0 : 8);
            SmallIconButtonView subscribeBtn = widgetSellerTransparencyV3Binding.subscribeBtn;
            Intrinsics.checkNotNullExpressionValue(subscribeBtn, "subscribeBtn");
            SellerTransparencyV3VO boundData3 = getBoundData();
            subscribeBtn.setVisibility((boundData3 == null || takeIfTrue(boundData3.getIsLikeFunctionEnabled()) == null) ? false : d11 ^ true ? 0 : 8);
            ButtonV3View unsubscribeShopBtn = widgetSellerTransparencyV3Binding.unsubscribeShopBtn;
            Intrinsics.checkNotNullExpressionValue(unsubscribeShopBtn, "unsubscribeShopBtn");
            SellerTransparencyV3VO boundData4 = getBoundData();
            unsubscribeShopBtn.setVisibility((boundData4 == null || takeIfTrue(boundData4.getHasSubscribeButton()) == null) ? false : d11 ? 0 : 8);
            ButtonV3View subscribeShopBtn = widgetSellerTransparencyV3Binding.subscribeShopBtn;
            Intrinsics.checkNotNullExpressionValue(subscribeShopBtn, "subscribeShopBtn");
            SellerTransparencyV3VO boundData5 = getBoundData();
            subscribeShopBtn.setVisibility((boundData5 == null || takeIfTrue(boundData5.getHasSubscribeButton()) == null) ? false : d11 ^ true ? 0 : 8);
            SellerTransparencyV3VO boundData6 = getBoundData();
            if (boundData6 != null) {
                boundData6.setSubscribed(Boolean.valueOf(d11));
            }
            SellerTransparencyV3VO boundData7 = getBoundData();
            if (boundData7 != null) {
                boundData7.setFavourite(Boolean.valueOf(d11));
            }
        }
    }

    private final void updatePaddings(SellerTransparencyV3VO.PaddingsVO paddingsVO) {
        this.binding.getConstraintLayout().setPadding(paddingsVO.getLeftPadding(), paddingsVO.getTopPadding(), paddingsVO.getRightPadding(), paddingsVO.getBottomPadding());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        x0<SubscribeEvent> subscribeStateFlow = this.sellerHeaderViewModel.getSubscribeStateFlow();
        AbstractC5434v c11 = U7.d.c(this.refs);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C4598rp.f(this.refs, new C2408n0(C5427n.a(subscribeStateFlow, c11, bVar), new SellerTransparencyV3ViewHolder$onAttach$1(this, null)));
        C4598rp.f(this.refs, new C2408n0(C5427n.a(this.sellerHeaderViewModel.getShowMessageEventFlow(), this.refs.getContainer().g().getLifecycle(), bVar), new SellerTransparencyV3ViewHolder$onAttach$2(this, null)));
        final InterfaceC2395h a11 = C5427n.a(this.sharedSellerViewModel.getShouldForceUnFavStateFlow(), this.refs.getContainer().g().getLifecycle(), bVar);
        C4598rp.f(this.refs, new C2408n0(new InterfaceC2395h<Action>() { // from class: ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$onAttach$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$onAttach$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ SellerTransparencyV3ViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$onAttach$$inlined$map$1$2", f = "SellerTransparencyV3ViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$onAttach$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, SellerTransparencyV3ViewHolder sellerTransparencyV3ViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = sellerTransparencyV3ViewHolder;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    String str;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        break;
                                    }
                                    Object previous = listIterator.previous();
                                    String sellerId = ((Action) previous).getSellerId();
                                    SellerTransparencyV3VO boundData = this.this$0.getBoundData();
                                    if (Intrinsics.d(sellerId, boundData != null ? boundData.getSellerId() : null)) {
                                        str = previous;
                                        break;
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(str, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Action> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new SellerTransparencyV3ViewHolder$onAttach$4(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02c1, code lost:
    
        if (r0.getVisibility() == 0) goto L93;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull SellerTransparencyV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSellerTransparencyV3Binding widgetSellerTransparencyV3Binding = this.binding;
        ConstraintLayout constraintLayout = widgetSellerTransparencyV3Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = item.getPaddings().getBottomPadding() + item.getPaddings().getTopPadding() + (item.getIsNavBarEmbedded() ? dp44 : dp56);
        constraintLayout.setLayoutParams(layoutParams);
        boolean z11 = false;
        if (item.getAvatarV2() != null) {
            Image sellerImageView = widgetSellerTransparencyV3Binding.sellerImageView;
            Intrinsics.checkNotNullExpressionValue(sellerImageView, "sellerImageView");
            ViewExtKt.gone(sellerImageView);
            IconView sellerIv = widgetSellerTransparencyV3Binding.sellerIv;
            Intrinsics.checkNotNullExpressionValue(sellerIv, "sellerIv");
            ViewExtKt.gone(sellerIv);
            IconView iconView = widgetSellerTransparencyV3Binding.sellerV2Iv;
            iconView.setContentDescription("sellerImageView");
            Intrinsics.f(iconView);
            IconHolderKt.bindOrGone$default(iconView, item.getAvatarV2(), null, 2, null);
            setAvatarLeftMargin(iconView, item.getIsNavBarEmbedded());
        } else if (item.getAvatarImage() != null) {
            IconView sellerIv2 = widgetSellerTransparencyV3Binding.sellerIv;
            Intrinsics.checkNotNullExpressionValue(sellerIv2, "sellerIv");
            ViewExtKt.gone(sellerIv2);
            IconView sellerV2Iv = widgetSellerTransparencyV3Binding.sellerV2Iv;
            Intrinsics.checkNotNullExpressionValue(sellerV2Iv, "sellerV2Iv");
            ViewExtKt.gone(sellerV2Iv);
            Image image = widgetSellerTransparencyV3Binding.sellerImageView;
            Intrinsics.f(image);
            ImageHolderKt.bindOrGone$default(image, item.getAvatarImage(), null, 2, null);
            Integer imageWidth = item.getAvatarImage().getImageWidth();
            int px = imageWidth != null ? ResourceExtKt.toPx(imageWidth.intValue()) : 0;
            ViewGroup.LayoutParams layoutParams2 = image.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = px;
            layoutParams2.height = px;
            image.setLayoutParams(layoutParams2);
            setAvatarLeftMargin(image, item.getIsNavBarEmbedded());
        } else if (item.getAvatar() != null) {
            Image sellerImageView2 = widgetSellerTransparencyV3Binding.sellerImageView;
            Intrinsics.checkNotNullExpressionValue(sellerImageView2, "sellerImageView");
            ViewExtKt.gone(sellerImageView2);
            IconView sellerV2Iv2 = widgetSellerTransparencyV3Binding.sellerV2Iv;
            Intrinsics.checkNotNullExpressionValue(sellerV2Iv2, "sellerV2Iv");
            ViewExtKt.gone(sellerV2Iv2);
            IconView iconView2 = widgetSellerTransparencyV3Binding.sellerIv;
            iconView2.setContentDescription(item.getAvatar().getText() != null ? "initials_iv" : "avatar_iv");
            Intrinsics.f(iconView2);
            IconHolderKt.bindOrGone$default(iconView2, item.getAvatar(), null, 2, null);
            setAvatarLeftMargin(iconView2, item.getIsNavBarEmbedded());
        }
        if (item.getNewTitle() != null) {
            TextAtomView sellerNameTv = widgetSellerTransparencyV3Binding.sellerNameTv;
            Intrinsics.checkNotNullExpressionValue(sellerNameTv, "sellerNameTv");
            ViewExtKt.gone(sellerNameTv);
            TextAtomV2View sellerNameNewTv = widgetSellerTransparencyV3Binding.sellerNameNewTv;
            Intrinsics.checkNotNullExpressionValue(sellerNameNewTv, "sellerNameNewTv");
            TextHolderKt.bindOrGone$default(sellerNameNewTv, item.getNewTitle(), null, 2, null);
        } else if (item.getTitle() != null) {
            TextAtomV2View sellerNameNewTv2 = widgetSellerTransparencyV3Binding.sellerNameNewTv;
            Intrinsics.checkNotNullExpressionValue(sellerNameNewTv2, "sellerNameNewTv");
            ViewExtKt.gone(sellerNameNewTv2);
            TextAtomView sellerNameTv2 = widgetSellerTransparencyV3Binding.sellerNameTv;
            Intrinsics.checkNotNullExpressionValue(sellerNameTv2, "sellerNameTv");
            TextAtomHolderKt.bindOrGone$default(sellerNameTv2, item.getTitle(), null, 2, null);
        }
        FrameLayout sellerGroup = widgetSellerTransparencyV3Binding.sellerGroup;
        Intrinsics.checkNotNullExpressionValue(sellerGroup, "sellerGroup");
        ViewGroup.LayoutParams layoutParams3 = sellerGroup.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams3;
        bVar.setMarginStart(item.getAddExtraMargins() ? dp12 : dp8);
        sellerGroup.setLayoutParams(bVar);
        TextAtomV2View sellerSubtitle = widgetSellerTransparencyV3Binding.sellerSubtitle;
        Intrinsics.checkNotNullExpressionValue(sellerSubtitle, "sellerSubtitle");
        TextHolderKt.bindOrGone$default(sellerSubtitle, item.getSubtitle(), null, 2, null);
        BadgeListView badgeListView = widgetSellerTransparencyV3Binding.sellerBadgeList;
        badgeListView.setFadeEnabled(!item.getIsNavBarEmbedded());
        ViewGroup.LayoutParams layoutParams4 = badgeListView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.setMarginStart(item.getSubtitle() != null ? dp4 : 0);
        badgeListView.setLayoutParams(layoutParams5);
        BadgeListHolderKt.bindOrGone$default(badgeListView, item.getBadges(), null, 2, null);
        badgeListView.setOnTouchListener(this.badgeOnTouchListener);
        View view = widgetSellerTransparencyV3Binding.clickableSellerAreaView;
        Intrinsics.f(view);
        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams.setMarginEnd(item.getIsNavBarEmbedded() ? 0 : dp8);
        view.setLayoutParams(marginLayoutParams);
        view.setOnClickListener(this.clickListener);
        SmallIconButtonView subscribeBtn = widgetSellerTransparencyV3Binding.subscribeBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeBtn, "subscribeBtn");
        WrappedIconButtonHolderKt.bindOrGone(subscribeBtn, item.getDefaultFavoriteButton(), this.subscribeActionHandler);
        SmallIconButtonView unsubscribeBtn = widgetSellerTransparencyV3Binding.unsubscribeBtn;
        Intrinsics.checkNotNullExpressionValue(unsubscribeBtn, "unsubscribeBtn");
        WrappedIconButtonHolderKt.bindOrGone(unsubscribeBtn, item.getActiveFavoriteButton(), this.subscribeActionHandler);
        ButtonV3View subscribeShopBtn = widgetSellerTransparencyV3Binding.subscribeShopBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeShopBtn, "subscribeShopBtn");
        ButtonV3HolderKt.bindOrGone(subscribeShopBtn, item.getDefaultSubscribeButton(), this.subscribeActionHandler);
        ButtonV3View unsubscribeShopBtn = widgetSellerTransparencyV3Binding.unsubscribeShopBtn;
        Intrinsics.checkNotNullExpressionValue(unsubscribeShopBtn, "unsubscribeShopBtn");
        ButtonV3HolderKt.bindOrGone(unsubscribeShopBtn, item.getActiveSubscribeButton(), this.subscribeActionHandler);
        SisBrandFavoriteButtonDelegate.DefaultImpls.bind$default(this.sisBrandFavoriteButtonDelegate, item.getFavoriteButton(), null, 2, null);
        IconView infoIcon = widgetSellerTransparencyV3Binding.infoIcon;
        Intrinsics.checkNotNullExpressionValue(infoIcon, "infoIcon");
        showOrGone(infoIcon, item);
        if (item.getIsNavBarEmbedded() || item.getShare() == null || item.getHasSubscribeButton()) {
            SmallIconButtonView shareBtn = widgetSellerTransparencyV3Binding.shareBtn;
            Intrinsics.checkNotNullExpressionValue(shareBtn, "shareBtn");
            ViewExtKt.gone(shareBtn);
        } else {
            ButtonV3Atom.SmallIconButton share = item.getShare();
            SmallIconButtonView shareBtn2 = widgetSellerTransparencyV3Binding.shareBtn;
            Intrinsics.checkNotNullExpressionValue(shareBtn2, "shareBtn");
            WrappedIconButtonHolderKt.bind(shareBtn2, share, this.actionHandler);
            SmallIconButtonView shareBtn3 = widgetSellerTransparencyV3Binding.shareBtn;
            Intrinsics.checkNotNullExpressionValue(shareBtn3, "shareBtn");
            ViewGroup.LayoutParams layoutParams7 = shareBtn3.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7;
            marginLayoutParams2.rightMargin = item.getFavoriteButton() != null ? 0 : item.getIsLikeFunctionEnabled() ? dp3 : item.getAddExtraMargins() ? dp16 : dp10;
            shareBtn3.setLayoutParams(marginLayoutParams2);
            SmallIconButtonView shareBtn4 = widgetSellerTransparencyV3Binding.shareBtn;
            Intrinsics.checkNotNullExpressionValue(shareBtn4, "shareBtn");
            ViewExtKt.show(shareBtn4);
        }
        bindButtons(item);
        SmallIconButtonView subscribeBtn2 = widgetSellerTransparencyV3Binding.subscribeBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeBtn2, "subscribeBtn");
        if (subscribeBtn2.getVisibility() != 0) {
            SmallIconButtonView unsubscribeBtn2 = widgetSellerTransparencyV3Binding.unsubscribeBtn;
            Intrinsics.checkNotNullExpressionValue(unsubscribeBtn2, "unsubscribeBtn");
            if (unsubscribeBtn2.getVisibility() != 0) {
                SmallIconButtonView shareBtn5 = widgetSellerTransparencyV3Binding.shareBtn;
                Intrinsics.checkNotNullExpressionValue(shareBtn5, "shareBtn");
                if (shareBtn5.getVisibility() != 0) {
                    ButtonV3View subscribeShopBtn2 = widgetSellerTransparencyV3Binding.subscribeShopBtn;
                    Intrinsics.checkNotNullExpressionValue(subscribeShopBtn2, "subscribeShopBtn");
                    if (subscribeShopBtn2.getVisibility() != 0) {
                        ButtonV3View unsubscribeShopBtn2 = widgetSellerTransparencyV3Binding.unsubscribeShopBtn;
                        Intrinsics.checkNotNullExpressionValue(unsubscribeShopBtn2, "unsubscribeShopBtn");
                        if (unsubscribeShopBtn2.getVisibility() != 0) {
                            SisBrandFavoriteButtonView sisBrandFavoriteBtn = widgetSellerTransparencyV3Binding.sisBrandFavoriteBtn;
                            Intrinsics.checkNotNullExpressionValue(sisBrandFavoriteBtn, "sisBrandFavoriteBtn");
                        }
                    }
                }
            }
        }
        z11 = true;
        Integer rightMargin = item.getRightMargin();
        int px2 = rightMargin != null ? ResourceExtKt.toPx(rightMargin.intValue()) : z11 ? dp12 : dp16;
        IconView iconView3 = widgetSellerTransparencyV3Binding.actionArrowIv;
        Intrinsics.f(iconView3);
        ViewGroup.LayoutParams layoutParams8 = iconView3.getLayoutParams();
        if (layoutParams8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams8;
        marginLayoutParams3.setMarginEnd(px2);
        iconView3.setLayoutParams(marginLayoutParams3);
        IconHolderKt.bindOrGone$default(iconView3, item.getRightIcon(), null, 2, null);
        LinearLayout badgesGroupLL = widgetSellerTransparencyV3Binding.badgesGroupLL;
        Intrinsics.checkNotNullExpressionValue(badgesGroupLL, "badgesGroupLL");
        ViewGroup.LayoutParams layoutParams9 = badgesGroupLL.getLayoutParams();
        if (layoutParams9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams9;
        marginLayoutParams4.setMarginEnd(px2);
        badgesGroupLL.setLayoutParams(marginLayoutParams4);
        if (item.getIsNavBarEmbedded()) {
            widgetSellerTransparencyV3Binding.getConstraintLayout().setBackground(null);
            return;
        }
        if (item.getIsLikeFunctionEnabled() && item.getHasSubscribeButton()) {
            widgetSellerTransparencyV3Binding.getConstraintLayout().setBackground(C7232a.a(getContext(), R$drawable.bg_seller_profile));
        } else {
            widgetSellerTransparencyV3Binding.getConstraintLayout().setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        }
        setMargins(item.getAddExtraMargins());
        updatePaddings(item.getPaddings());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerTransparencyV3VO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
