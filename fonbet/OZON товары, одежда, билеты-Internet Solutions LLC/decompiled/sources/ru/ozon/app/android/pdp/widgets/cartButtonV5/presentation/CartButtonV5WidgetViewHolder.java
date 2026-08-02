package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import B90.l0;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import WZ.x;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6065b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5SubscriptionUpdate;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5Update;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonsV5Update;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5State;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0083\u0001\b\u0001\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0089\u0001B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0002¢\u0006\u0004\b+\u0010,J5\u00104\u001a\u00020\u001b2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J?\u0010;\u001a\u00020\u001b2\u0006\u00107\u001a\u0002062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001b082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001b08H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001bH\u0002¢\u0006\u0004\b=\u0010\u001dJ\u0013\u0010?\u001a\u00020>*\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u0004\u0018\u00010>*\u00020\u0002H\u0002¢\u0006\u0004\bA\u0010@J\u001b\u0010E\u001a\u00020\u001b*\u00020B2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u0004\u0018\u00010\u0010*\u00020C2\u0006\u0010G\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010PR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0018\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010WR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010XR\u001a\u0010Z\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u001b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010n\u001a\u0004\u0018\u00010j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bl\u0010mR\u001d\u0010s\u001a\u0004\u0018\u00010o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010f\u001a\u0004\bq\u0010rR\u001b\u0010v\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010f\u001a\u0004\bu\u0010]R(\u0010y\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010x\u0012\u0006\u0012\u0004\u0018\u00010x\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010VR\u0016\u0010|\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010VR\u0016\u0010}\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010VR\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008a\u0001"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonsContainerViewGroup;", "view", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ViewModel;", "cartViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "subscribeViewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "", "isRelatedBottomSheet", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5BottomSheetViewModel;", "bottomSheetViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonsContainerViewGroup;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ViewModel;LWZ/l;Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;ZLVg/d;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5BottomSheetViewModel;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "addView", "()V", "removeView", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lkotlin/Function0;", "elseBlock", "updateLocalCartStateOrElse", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;Lkotlin/jvm/functions/Function0;)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "event", "", "widgetId", "isView", "onTrackCloseEvent", "(Ljava/util/Map;JZ)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lkotlin/Function1;", "onSubscribeClick", "onUnsubscribeClick", "handleClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "handleRelatedAction", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;", "firstButtonView", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;", "secondButtonView", "Landroid/widget/ImageView;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "vo", "bindIncrementIcon", "(Landroid/widget/ImageView;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;)V", "isInCart", "isTitleAnimation", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Z)Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "animationSubtitle", "shouldAnimateSubtitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Z", "hasAnimatedSubtitle", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;)Z", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonsContainerViewGroup;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ViewModel;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Z", "LVg/d;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5BottomSheetViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Landroid/widget/LinearLayout;", "bottomContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "bottomSheetView$delegate", "LSc/j;", "getBottomSheetView", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "bottomSheetView", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "composerSwipeRefresh$delegate", "getComposerSwipeRefresh", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "composerSwipeRefresh", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "relatedProductsParent$delegate", "getRelatedProductsParent", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "relatedProductsParent", "stickyRelatedPlaceholderView$delegate", "getStickyRelatedPlaceholderView", "stickyRelatedPlaceholderView", "Lkotlin/Pair;", "", "preCreateCartState", "Lkotlin/Pair;", "isRefresh", "isAfterData", "isReloadFromRefresh", "Landroid/os/Handler;", "handler$delegate", "getHandler", "()Landroid/os/Handler;", "handler", "ru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WidgetViewHolder$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WidgetViewHolder$fragmentLifecycleCallbacks$1;", "Ljava/lang/Runnable;", "postRunnableBind", "Ljava/lang/Runnable;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5WidgetViewHolder extends AbstractC6065b<CartButtonV5VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LinearLayout bottomContainer;

    /* renamed from: bottomSheetView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomSheetView;

    @NotNull
    private final CartButtonV5BottomSheetViewModel bottomSheetViewModel;

    @NotNull
    private final CartButtonV5ViewModel cartViewModel;

    /* renamed from: composerSwipeRefresh$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composerSwipeRefresh;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final CartButtonV5WidgetViewHolder$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler;
    private boolean isAfterData;
    private boolean isRefresh;
    private final boolean isRelatedBottomSheet;
    private boolean isReloadFromRefresh;

    @NotNull
    private final View metricView;

    @NotNull
    private final PDPOnBoardingViewModel pdpOnBoardingViewModel;

    @NotNull
    private final Runnable postRunnableBind;
    private Pair<Integer, Integer> preCreateCartState;

    /* renamed from: relatedProductsParent$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j relatedProductsParent;

    /* renamed from: stickyRelatedPlaceholderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j stickyRelatedPlaceholderView;

    @NotNull
    private final SubscribeViewModel subscribeViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CartButtonV5ButtonsContainerViewGroup view;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isCloseBottomSheet", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                CartButtonV5WidgetViewHolder.this.getHandler().post(CartButtonV5WidgetViewHolder.this.postRunnableBind);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<SubscribeViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SubscribeViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SubscribeViewModel.Action action) {
            NotificationDTO createUnknownErrorNotification;
            if (action instanceof SubscribeViewModel.Action.Subscription) {
                SubscribeViewModel.Action.Subscription subscription = (SubscribeViewModel.Action.Subscription) action;
                CartButtonV5WidgetViewHolder.this.container.M().update(new CartButtonV5SubscriptionUpdate(subscription.getIsSubscribed()));
                CartButtonNotificationsKt.showProductSubscriptionNotification(subscription.getIsSubscribed(), CartButtonV5WidgetViewHolder.this.container.Q(), CartButtonV5WidgetViewHolder.this.actionHandler);
            } else {
                if (!(action instanceof SubscribeViewModel.Action.Error)) {
                    throw new o();
                }
                if (((SubscribeViewModel.Action.Error) action).getIsNetworkError()) {
                    AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
                    Context context = CartButtonV5WidgetViewHolder.this.view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    createUnknownErrorNotification = NotificationBarHelperKt.createNetworkErrorNotificationDTO(appTypeResolver.isSelect(context));
                } else {
                    createUnknownErrorNotification = NotificationsKt.createUnknownErrorNotification();
                }
                CartButtonNotificationsKt.showCartButtonNotification(createUnknownErrorNotification, CartButtonV5WidgetViewHolder.this.container.Q(), CartButtonV5WidgetViewHolder.this.actionHandler);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$3", f = "CartButtonV5WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<a, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = CartButtonV5WidgetViewHolder.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (((a) this.L$0) instanceof a.u) {
                CartButtonV5WidgetViewHolder.this.isRefresh = true;
                CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder = CartButtonV5WidgetViewHolder.this;
                SwipeRefreshLayout composerSwipeRefresh = cartButtonV5WidgetViewHolder.getComposerSwipeRefresh();
                cartButtonV5WidgetViewHolder.isReloadFromRefresh = composerSwipeRefresh != null && composerSwipeRefresh.isRefreshing();
                CartButtonV5WidgetViewHolder.this.isAfterData = false;
                CartButtonV5WidgetViewHolder.this.cartViewModel.releaseDataState();
            }
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<CartButtonV5State, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CartButtonV5State cartButtonV5State) {
            invoke2(cartButtonV5State);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CartButtonV5State cartButtonV5State) {
            CartButtonV5VO boundData;
            CartButtonV5View cartButtonV5View = null;
            cartButtonV5View = null;
            cartButtonV5View = null;
            if (cartButtonV5State instanceof CartButtonV5State.UpdateButton) {
                CartButtonV5State.UpdateButton updateButton = (CartButtonV5State.UpdateButton) cartButtonV5State;
                CartButtonV5WidgetViewHolder.this.container.M().update(new CartButtonV5Update(updateButton.getButton()));
                CartButtonV5VO boundData2 = CartButtonV5WidgetViewHolder.this.getBoundData();
                if ((boundData2 != null ? boundData2.getRelatedProduct() : null) != null) {
                    CartButtonV5WidgetViewHolder.this.getBottomSheetView().showMiniState(updateButton.getIsRelatedProduct());
                    return;
                }
                return;
            }
            if (cartButtonV5State instanceof CartButtonV5State.Action) {
                CartButtonV5WidgetViewHolder.this.actionHandler.invoke(((CartButtonV5State.Action) cartButtonV5State).getAction());
                return;
            }
            if (cartButtonV5State instanceof CartButtonV5State.UpdateData) {
                if (CartButtonV5WidgetViewHolder.this.getBoundData() != null) {
                    CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder = CartButtonV5WidgetViewHolder.this;
                    cartButtonV5WidgetViewHolder.isAfterData = true;
                    CartButtonV5State.UpdateData updateData = (CartButtonV5State.UpdateData) cartButtonV5State;
                    cartButtonV5WidgetViewHolder.container.M().update(new CartButtonsV5Update(updateData.getItem().getCartButton(), updateData.getItem().getSecondCartButton()));
                    return;
                }
                return;
            }
            if (!(cartButtonV5State instanceof CartButtonV5State.HideLoader)) {
                if (!(cartButtonV5State instanceof CartButtonV5State.ShowTooltip)) {
                    throw new o();
                }
                CartButtonV5State.ShowTooltip showTooltip = (CartButtonV5State.ShowTooltip) cartButtonV5State;
                if (showTooltip.getIsFirst()) {
                    CartButtonV5VO boundData3 = CartButtonV5WidgetViewHolder.this.getBoundData();
                    if (boundData3 != null) {
                        cartButtonV5View = CartButtonV5WidgetViewHolder.this.firstButtonView(boundData3);
                    }
                } else if (showTooltip.getIsSecond() && (boundData = CartButtonV5WidgetViewHolder.this.getBoundData()) != null) {
                    cartButtonV5View = CartButtonV5WidgetViewHolder.this.secondButtonView(boundData);
                }
                if (cartButtonV5View != null) {
                    cartButtonV5View.showTooltip();
                    return;
                }
                return;
            }
            CartButtonV5VO boundData4 = CartButtonV5WidgetViewHolder.this.getBoundData();
            if (boundData4 != null) {
                CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder2 = CartButtonV5WidgetViewHolder.this;
                cartButtonV5WidgetViewHolder2.isAfterData = true;
                CartButtonV5State.HideLoader hideLoader = (CartButtonV5State.HideLoader) cartButtonV5State;
                if (hideLoader.getIsFirst() || hideLoader.getIsSecond()) {
                    cartButtonV5WidgetViewHolder2.firstButtonView(boundData4).hideSubtitleUpdateAnimation();
                    CartButtonV5View secondButtonView = cartButtonV5WidgetViewHolder2.secondButtonView(boundData4);
                    if (secondButtonView != null) {
                        secondButtonView.hideSubtitleUpdateAnimation();
                        return;
                    }
                    return;
                }
                cartButtonV5WidgetViewHolder2.firstButtonView(boundData4).hideLoader();
                CartButtonV5View secondButtonView2 = cartButtonV5WidgetViewHolder2.secondButtonView(boundData4);
                if (secondButtonView2 != null) {
                    secondButtonView2.hideLoader();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.fragment.app.G$m, ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$fragmentLifecycleCallbacks$1] */
    public CartButtonV5WidgetViewHolder(@NotNull i container, @NotNull CartButtonV5ButtonsContainerViewGroup view, @NotNull CartButtonV5ViewModel cartViewModel, @NotNull l tokenizedAnalytics, @NotNull SubscribeViewModel subscribeViewModel, @NotNull PDPOnBoardingViewModel pdpOnBoardingViewModel, boolean z11, @NotNull d customActionHandlersStoreFactory, @NotNull CartButtonV5BottomSheetViewModel bottomSheetViewModel, @NotNull FeatureChecker featureChecker) {
        CoordinatorLayout relatedProductsParent;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cartViewModel, "cartViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(subscribeViewModel, "subscribeViewModel");
        Intrinsics.checkNotNullParameter(pdpOnBoardingViewModel, "pdpOnBoardingViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(bottomSheetViewModel, "bottomSheetViewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.container = container;
        this.view = view;
        this.cartViewModel = cartViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.subscribeViewModel = subscribeViewModel;
        this.pdpOnBoardingViewModel = pdpOnBoardingViewModel;
        this.isRelatedBottomSheet = z11;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.bottomSheetViewModel = bottomSheetViewModel;
        this.metricView = view;
        this.bottomContainer = ComposerViewExtensionKt.composerBottomContainer(container.Z());
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new CartButtonV5WidgetViewHolder$actionHandler$1(this)).onClick(new CartButtonV5WidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.bottomSheetView = DelegatesKt.lazyUnsafe(new CartButtonV5WidgetViewHolder$bottomSheetView$2(this, featureChecker));
        this.composerSwipeRefresh = DelegatesKt.lazyUnsafe(new CartButtonV5WidgetViewHolder$composerSwipeRefresh$2(this));
        this.relatedProductsParent = DelegatesKt.lazyUnsafe(new CartButtonV5WidgetViewHolder$relatedProductsParent$2(this));
        this.stickyRelatedPlaceholderView = DelegatesKt.lazyUnsafe(new CartButtonV5WidgetViewHolder$stickyRelatedPlaceholderView$2(this));
        this.handler = DelegatesKt.lazyUnsafe(CartButtonV5WidgetViewHolder$handler$2.INSTANCE);
        ?? r32 = new G.m() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$fragmentLifecycleCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentDestroyed(G fm, ComponentCallbacksC5392m fr) {
                CartButtonV5BottomSheetViewModel cartButtonV5BottomSheetViewModel;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                cartButtonV5BottomSheetViewModel = CartButtonV5WidgetViewHolder.this.bottomSheetViewModel;
                cartButtonV5BottomSheetViewModel.onClose(fr);
            }
        };
        this.fragmentLifecycleCallbacks = r32;
        this.postRunnableBind = new l0(this, 8);
        if (z11 && (relatedProductsParent = getRelatedProductsParent()) != null) {
            relatedProductsParent.addView(getBottomSheetView());
        }
        bottomSheetViewModel.isCloseBottomSheet().observe(container.Q().g(), new CartButtonV5WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        G d11 = container.Q().d();
        if (d11 != 0) {
            d11.Y0(r32, false);
        }
        subscribeViewModel.getAction().observe(container.K().f(), new CartButtonV5WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        C2399j.C(new C2408n0(container.M().getEventsFlow(), new AnonymousClass3(null)), K.a(container.Q().g()));
        cartViewModel.getAction().observe(container.K().f(), new CartButtonV5WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass4()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindIncrementIcon(ImageView imageView, CartButtonV5VO.CartButton cartButton) {
        CartButtonV5DTO.CartButton.AdditionalButton.ChangeQuantityButton incrementButton;
        Icon icon;
        CartButtonV5DTO.CartButton.AdditionalButton.ChangeQuantityButton incrementButton2;
        Icon icon2;
        imageView.setEnabled(cartButton.getMultiplicityValue() + cartButton.getInCartQuantity() <= cartButton.getFreeRest());
        if (imageView.isEnabled()) {
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton = cartButton.getAdditionalButton();
            if (additionalButton != null && (incrementButton = additionalButton.getIncrementButton()) != null) {
                icon = incrementButton.getIcon();
            }
            icon = null;
        } else {
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton2 = cartButton.getAdditionalButton();
            if (additionalButton2 != null && (incrementButton2 = additionalButton2.getIncrementButton()) != null && (icon2 = incrementButton2.getIcon()) != null) {
                icon = Icon.copy$default(icon2, null, UniColors.GRAPHIC_NEUTRAL.getToken(), 1, null);
            }
            icon = null;
        }
        ViewExtKt.bindOrGone$default(this.view.getCounterView().getIncrementIcon(), icon, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartButtonV5View firstButtonView(CartButtonV5VO cartButtonV5VO) {
        return cartButtonV5VO.getCartButton().getToCart().getBadge() != null ? this.view.getFirstButtonWithBadge() : this.view.getFirstButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RelatedProductsBottomSheetView getBottomSheetView() {
        return (RelatedProductsBottomSheetView) this.bottomSheetView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwipeRefreshLayout getComposerSwipeRefresh() {
        return (SwipeRefreshLayout) this.composerSwipeRefresh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    private final CoordinatorLayout getRelatedProductsParent() {
        return (CoordinatorLayout) this.relatedProductsParent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getStickyRelatedPlaceholderView() {
        return (View) this.stickyRelatedPlaceholderView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClick(AtomAction.Click action, Function1<? super Long, Unit> onSubscribeClick, Function1<? super Long, Unit> onUnsubscribeClick) {
        Map<String, String> params;
        String str;
        Long y02;
        Map<String, String> params2;
        String str2;
        Long y03;
        String id2 = action.getId();
        if (id2 != null) {
            int hashCode = id2.hashCode();
            if (hashCode == -1311196741) {
                if (!id2.equals("unsubscribeFromStock") || (params = action.getParams()) == null || (str = params.get("sku")) == null || (y02 = h.y0(str)) == null) {
                    return;
                }
                onUnsubscribeClick.invoke(y02);
                return;
            }
            if (hashCode == 23457852) {
                if (id2.equals("addToCart")) {
                    handleRelatedAction();
                }
            } else {
                if (hashCode != 1459740849 || !id2.equals("subscribeToStock") || (params2 = action.getParams()) == null || (str2 = params2.get("sku")) == null || (y03 = h.y0(str2)) == null) {
                    return;
                }
                onSubscribeClick.invoke(y03);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRelatedAction() {
        CartButtonV5VO.RelatedProductsCurtainVO relatedProduct;
        CartButtonV5VO boundData = getBoundData();
        if (boundData == null || (relatedProduct = boundData.getRelatedProduct()) == null) {
            return;
        }
        getBottomSheetView().loadComposer(relatedProduct.getLink());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button, still in use, count: 2, list:
          (r3v6 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button) from 0x0040: IF  (r3v6 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button) != (null ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button)  -> B:16:0x0042 A[HIDDEN]
          (r3v6 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button) from 0x0042: PHI (r3v5 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button) = 
          (r3v3 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button)
          (r3v6 ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button)
         binds: [B:19:0x0047, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasAnimatedSubtitle(ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO r3) {
        /*
            r2 = this;
            ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO$CartButton r0 = r3.getCartButton()
            boolean r0 = r0.getIsInCart()
            r1 = 0
            if (r0 == 0) goto L1c
            ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO$CartButton r0 = r3.getCartButton()
            ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button r0 = r0.getInCart()
            if (r0 == 0) goto L1a
            ru.ozon.uni.atoms.data.text.TextDTO r0 = r0.getAnimationSubtitle()
            goto L28
        L1a:
            r0 = r1
            goto L28
        L1c:
            ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO$CartButton r0 = r3.getCartButton()
            ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button r0 = r0.getToCart()
            ru.ozon.uni.atoms.data.text.TextDTO r0 = r0.getAnimationSubtitle()
        L28:
            boolean r0 = r2.shouldAnimateSubtitle(r0)
            if (r0 == 0) goto L30
            r3 = 1
            return r3
        L30:
            ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO$CartButton r3 = r3.getSecondCartButton()
            if (r3 == 0) goto L51
            boolean r0 = r3.getIsInCart()
            if (r0 == 0) goto L47
            ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button r3 = r3.getInCart()
            if (r3 == 0) goto L4c
        L42:
            ru.ozon.uni.atoms.data.text.TextDTO r1 = r3.getAnimationSubtitle()
            goto L4c
        L47:
            ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO$CartButton$Button r3 = r3.getToCart()
            goto L42
        L4c:
            boolean r3 = r2.shouldAnimateSubtitle(r1)
            return r3
        L51:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder.hasAnimatedSubtitle(ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean isTitleAnimation(CartButtonV5VO.CartButton cartButton, boolean z11) {
        if (z11) {
            CartButtonV5DTO.CartButton.Button inCart = cartButton.getInCart();
            if ((inCart != null ? inCart.getAsyncFetchType() : null) == CartButtonV5DTO.CartButton.Button.AsyncFetchType.TITLE && this.isAfterData) {
                return Boolean.FALSE;
            }
        }
        if (z11) {
            CartButtonV5DTO.CartButton.Button inCart2 = cartButton.getInCart();
            if ((inCart2 != null ? inCart2.getAsyncFetchType() : null) == CartButtonV5DTO.CartButton.Button.AsyncFetchType.TITLE && !this.isAfterData) {
                return Boolean.TRUE;
            }
        }
        if (!z11 && cartButton.getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.TITLE && this.isAfterData) {
            return Boolean.FALSE;
        }
        if (!z11 && cartButton.getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.TITLE && !this.isAfterData) {
            return Boolean.TRUE;
        }
        if (z11) {
            CartButtonV5DTO.CartButton.Button inCart3 = cartButton.getInCart();
            if ((inCart3 != null ? inCart3.getAsyncFetchType() : null) == CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE) {
                return Boolean.FALSE;
            }
        }
        if (z11 || cartButton.getToCart().getAsyncFetchType() != CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTrackCloseEvent(Map<String, TokenizedTrackingInfo> event, long widgetId, boolean isView) {
        t b11;
        if (event == null || (b11 = x.b(event, Long.valueOf(widgetId), null)) == null) {
            return;
        }
        l lVar = this.tokenizedAnalytics;
        if (isView) {
            TokenizedAnalyticsExtKt.processViewEvents(lVar, b11);
        } else {
            TokenizedAnalyticsExtKt.processNonViewEvents(lVar, b11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postRunnableBind$lambda$2(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder) {
        CartButtonV5VO boundData = cartButtonV5WidgetViewHolder.getBoundData();
        if (boundData != null) {
            cartButtonV5WidgetViewHolder.view.postDelayed(new Dc0.i(3, cartButtonV5WidgetViewHolder, boundData), 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postRunnableBind$lambda$2$lambda$1$lambda$0(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5VO cartButtonV5VO) {
        if (cartButtonV5WidgetViewHolder.isRefresh) {
            return;
        }
        cartButtonV5WidgetViewHolder.bind(cartButtonV5VO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartButtonV5View secondButtonView(CartButtonV5VO cartButtonV5VO) {
        CartButtonV5VO.CartButton secondCartButton = cartButtonV5VO.getSecondCartButton();
        if (secondCartButton == null) {
            return null;
        }
        return secondCartButton.getToCart().getBadge() != null ? this.view.getSecondButtonWithBadge() : this.view.getSecondButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAnimateSubtitle(TextDTO animationSubtitle) {
        if (animationSubtitle == null) {
            return false;
        }
        return this.isReloadFromRefresh || !this.cartViewModel.getHasAsyncDataShown();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if ((r5 != null ? r5.intValue() : 0) <= 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateLocalCartStateOrElse(CartButtonV5VO item, Function0<Unit> elseBlock) {
        CartType cartType;
        CartButtonV5VO.CartButton secondCartButton;
        CartButtonV5VO.CartButton copy;
        CartButtonV5VO.CartButton copy2;
        CartButtonV5VO.CartButton copy3;
        CartButtonV5VO.CartButton secondCartButton2;
        CartButtonV5VO.CartButton copy4;
        CartButtonV5VO.CartButton copy5;
        CartButtonV5DTO.CartButton.Button toCart;
        CartButtonV5ViewModel cartButtonV5ViewModel = this.cartViewModel;
        String sku = item.getCartButton().getSku();
        String deliverySchema = item.getCartButton().getDeliverySchema();
        Boolean forStars = item.getCartButton().getToCart().getForStars();
        boolean booleanValue = forStars != null ? forStars.booleanValue() : false;
        CartType cartType2 = item.getCartButton().getToCart().getCartType();
        CartButtonV5VO.CartButton secondCartButton3 = item.getSecondCartButton();
        String sku2 = secondCartButton3 != null ? secondCartButton3.getSku() : null;
        CartButtonV5VO.CartButton secondCartButton4 = item.getSecondCartButton();
        String deliverySchema2 = secondCartButton4 != null ? secondCartButton4.getDeliverySchema() : null;
        CartButtonV5VO.CartButton secondCartButton5 = item.getSecondCartButton();
        if (secondCartButton5 == null || (toCart = secondCartButton5.getToCart()) == null || (cartType = toCart.getCartType()) == null) {
            cartType = CartType.MAIN_CART;
        }
        Pair<Integer, Integer> currentCartState = cartButtonV5ViewModel.getCurrentCartState(sku, deliverySchema, booleanValue, cartType2, sku2, deliverySchema2, cartType);
        if (currentCartState != null) {
            if (item.getCartButton().getAdditionalButton() == null || item.getCartButton().getToCart().isSubscribeButton()) {
                currentCartState = null;
            }
            if (currentCartState != null) {
                this.preCreateCartState = null;
                boolean z11 = item.getCartButton().getQuantMultiplicityValue() != null && item.getCartButton().getInCartQuantity() > 0;
                Integer e11 = currentCartState.e();
                if (e11 != null) {
                    int intValue = e11.intValue();
                    boolean z12 = intValue > 0;
                    if (intValue != item.getCartButton().getInCartQuantity() && (item.getCartButton().getQuantMultiplicityValue() == null || z11)) {
                        if (!CartTypeKt.isMainCart(item.getCartButton().getToCart().getCartType())) {
                            Integer f7 = currentCartState.f();
                        }
                        InterfaceC7851b M11 = this.container.M();
                        copy5 = r11.copy((r32 & 1) != 0 ? r11.cartType : null, (r32 & 2) != 0 ? r11.isInCart : z12, (r32 & 4) != 0 ? r11.toCart : null, (r32 & 8) != 0 ? r11.inCart : null, (r32 & 16) != 0 ? r11.additionalButton : null, (r32 & 32) != 0 ? r11.sku : null, (r32 & 64) != 0 ? r11.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r11.freeRest : 0, (r32 & 256) != 0 ? r11.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r11.inCartQuantity : intValue, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r11.multiplicityValue : 0, (r32 & 2048) != 0 ? r11.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r11.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r11.isHowLoader : false, (r32 & 16384) != 0 ? item.getCartButton().dismissAction : null);
                        M11.update(new CartButtonV5Update(copy5));
                        return;
                    }
                }
                Integer f11 = currentCartState.f();
                if (f11 != null) {
                    int intValue2 = f11.intValue();
                    boolean z13 = intValue2 > 0;
                    CartButtonV5VO.CartButton secondCartButton6 = item.getSecondCartButton();
                    if (!(secondCartButton6 != null && intValue2 == secondCartButton6.getInCartQuantity())) {
                        CartButtonV5VO.CartButton secondCartButton7 = item.getSecondCartButton();
                        if ((secondCartButton7 != null ? secondCartButton7.getQuantMultiplicityValue() : null) == null && !z11 && (secondCartButton2 = item.getSecondCartButton()) != null) {
                            InterfaceC7851b M12 = this.container.M();
                            copy4 = secondCartButton2.copy((r32 & 1) != 0 ? secondCartButton2.cartType : null, (r32 & 2) != 0 ? secondCartButton2.isInCart : z13, (r32 & 4) != 0 ? secondCartButton2.toCart : null, (r32 & 8) != 0 ? secondCartButton2.inCart : null, (r32 & 16) != 0 ? secondCartButton2.additionalButton : null, (r32 & 32) != 0 ? secondCartButton2.sku : null, (r32 & 64) != 0 ? secondCartButton2.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? secondCartButton2.freeRest : 0, (r32 & 256) != 0 ? secondCartButton2.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? secondCartButton2.inCartQuantity : intValue2, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? secondCartButton2.multiplicityValue : 0, (r32 & 2048) != 0 ? secondCartButton2.quantMultiplicityValue : null, (r32 & 4096) != 0 ? secondCartButton2.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? secondCartButton2.isHowLoader : false, (r32 & 16384) != 0 ? secondCartButton2.dismissAction : null);
                            M12.update(new CartButtonV5Update(copy4));
                            return;
                        }
                    }
                }
                if (currentCartState.e() == null && item.getCartButton().getInCartQuantity() != 0) {
                    InterfaceC7851b M13 = this.container.M();
                    copy3 = r3.copy((r32 & 1) != 0 ? r3.cartType : null, (r32 & 2) != 0 ? r3.isInCart : false, (r32 & 4) != 0 ? r3.toCart : null, (r32 & 8) != 0 ? r3.inCart : null, (r32 & 16) != 0 ? r3.additionalButton : null, (r32 & 32) != 0 ? r3.sku : null, (r32 & 64) != 0 ? r3.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r3.freeRest : 0, (r32 & 256) != 0 ? r3.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r3.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r3.multiplicityValue : 0, (r32 & 2048) != 0 ? r3.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r3.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r3.isHowLoader : false, (r32 & 16384) != 0 ? item.getCartButton().dismissAction : null);
                    M13.update(new CartButtonV5Update(copy3));
                    return;
                }
                CartButtonV5VO.CartButton secondCartButton8 = item.getSecondCartButton();
                if (secondCartButton8 != null && currentCartState.f() == null && secondCartButton8.getInCartQuantity() != 0) {
                    InterfaceC7851b M14 = this.container.M();
                    copy2 = secondCartButton8.copy((r32 & 1) != 0 ? secondCartButton8.cartType : null, (r32 & 2) != 0 ? secondCartButton8.isInCart : false, (r32 & 4) != 0 ? secondCartButton8.toCart : null, (r32 & 8) != 0 ? secondCartButton8.inCart : null, (r32 & 16) != 0 ? secondCartButton8.additionalButton : null, (r32 & 32) != 0 ? secondCartButton8.sku : null, (r32 & 64) != 0 ? secondCartButton8.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? secondCartButton8.freeRest : 0, (r32 & 256) != 0 ? secondCartButton8.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? secondCartButton8.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? secondCartButton8.multiplicityValue : 0, (r32 & 2048) != 0 ? secondCartButton8.quantMultiplicityValue : null, (r32 & 4096) != 0 ? secondCartButton8.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? secondCartButton8.isHowLoader : false, (r32 & 16384) != 0 ? secondCartButton8.dismissAction : null);
                    M14.update(new CartButtonV5Update(copy2));
                    return;
                }
                Integer e12 = currentCartState.e();
                if ((e12 != null ? e12.intValue() : 0) >= 1) {
                    Integer f12 = currentCartState.f();
                    if ((f12 != null ? f12.intValue() : 0) >= 1 && CartTypeKt.isFamilyCart(item.getCartButton().getToCart().getCartType())) {
                        Integer e13 = currentCartState.e();
                        int inCartQuantity = item.getCartButton().getInCartQuantity();
                        if (e13 != null && e13.intValue() == inCartQuantity && (secondCartButton = item.getSecondCartButton()) != null) {
                            InterfaceC7851b M15 = this.container.M();
                            Integer f13 = currentCartState.f();
                            copy = secondCartButton.copy((r32 & 1) != 0 ? secondCartButton.cartType : null, (r32 & 2) != 0 ? secondCartButton.isInCart : true, (r32 & 4) != 0 ? secondCartButton.toCart : null, (r32 & 8) != 0 ? secondCartButton.inCart : null, (r32 & 16) != 0 ? secondCartButton.additionalButton : null, (r32 & 32) != 0 ? secondCartButton.sku : null, (r32 & 64) != 0 ? secondCartButton.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? secondCartButton.freeRest : 0, (r32 & 256) != 0 ? secondCartButton.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? secondCartButton.inCartQuantity : f13 != null ? f13.intValue() : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? secondCartButton.multiplicityValue : 0, (r32 & 2048) != 0 ? secondCartButton.quantMultiplicityValue : null, (r32 & 4096) != 0 ? secondCartButton.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? secondCartButton.isHowLoader : false, (r32 & 16384) != 0 ? secondCartButton.dismissAction : null);
                            M15.update(new CartButtonV5Update(copy));
                            return;
                        }
                    }
                }
                elseBlock.invoke();
                return;
            }
        }
        elseBlock.invoke();
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        LinearLayout linearLayout;
        View stickyRelatedPlaceholderView;
        if (this.isRelatedBottomSheet) {
            linearLayout = this.bottomContainer;
            stickyRelatedPlaceholderView = getStickyRelatedPlaceholderView();
        } else {
            linearLayout = this.bottomContainer;
            stickyRelatedPlaceholderView = this.view;
        }
        linearLayout.addView(stickyRelatedPlaceholderView);
        super.addView();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if ((r0 != null ? r0.getRelatedProduct() : null) != null) goto L12;
     */
    @Override // d20.AbstractC6065b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWidgetDestroyed() {
        G d11 = this.container.Q().d();
        if (d11 != null) {
            d11.t1(this.fragmentLifecycleCallbacks);
        }
        getHandler().removeCallbacks(this.postRunnableBind);
        this.cartViewModel.releaseDataState();
        if (!this.isRelatedBottomSheet) {
            CartButtonV5VO boundData = getBoundData();
        }
        getBottomSheetView().onDetach();
        CoordinatorLayout relatedProductsParent = getRelatedProductsParent();
        if (relatedProductsParent != null) {
            relatedProductsParent.removeView(getBottomSheetView());
        }
        this.view.releaseClickListener();
        this.view.getCounterView().getIncrementIcon().setOnClickListener(null);
        this.view.getCounterView().getDecrementIcon().setOnClickListener(null);
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        LinearLayout linearLayout;
        View stickyRelatedPlaceholderView;
        if (this.isRelatedBottomSheet) {
            linearLayout = this.bottomContainer;
            stickyRelatedPlaceholderView = getStickyRelatedPlaceholderView();
        } else {
            linearLayout = this.bottomContainer;
            stickyRelatedPlaceholderView = this.view;
        }
        linearLayout.removeView(stickyRelatedPlaceholderView);
        super.removeView();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CartButtonV5VO item) {
        AtomAction dismissAction;
        Intrinsics.checkNotNullParameter(item, "item");
        AtomAction dismissAction2 = item.getCartButton().getDismissAction();
        if (dismissAction2 != null) {
            this.actionHandler.invoke(dismissAction2);
        }
        CartButtonV5VO.CartButton secondCartButton = item.getSecondCartButton();
        if (secondCartButton != null && (dismissAction = secondCartButton.getDismissAction()) != null) {
            this.actionHandler.invoke(dismissAction);
        }
        updateLocalCartStateOrElse(item, new CartButtonV5WidgetViewHolder$bind$1$1(this, item, item));
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull CartButtonV5VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((CartButtonV5WidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
        }
    }
}
