package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import Go.C3125a;
import Go.b;
import Go.c;
import Go.e;
import Vg.d;
import WZ.t;
import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargeIconButtonHolderKt;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.SplitDynamicElementsAdapter;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.products.MarginItemDecoration;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.products.ProductAdapter;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.tooltip.TooltipWrapper;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.R$string;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001iBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010#J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010#J\u000f\u0010.\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u001bH\u0002¢\u0006\u0004\b0\u0010#J\u001f\u00105\u001a\u00020\u001b2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u001b2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010B\u001a\u00020\u001b*\u00020?2\b\b\u0001\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010HR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010KR\u0014\u0010L\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u001b0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u001b0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/WidgetRfbsSplitView;", "widgetRfbsSplitView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/WidgetRfbsSplitView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/utils/AppType;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;Ll20/d;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "bindHeader", "bindProducts", "bindDynamicSplits", "bindLeftIcon", "", "itemId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "button", "setupRightIconButton", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "handleIconButtonAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "deleteUrl", "showConfirmDeleteDialog", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "", "id", "setAutoTestId", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;I)V", "updateSplitMargins", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;)V", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/WidgetRfbsSplitView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;", "headerLeftPadding", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "rfbsActionHandler", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "atomActionSheetHandler", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "kebabDisposableActionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "widgetAction", "Lru/ozon/uni/atoms/af/AtomAction;", "productsAction", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/products/ProductAdapter;", "productAdapter", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/products/ProductAdapter;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter;", "dynamicAdapter", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/tooltip/TooltipWrapper;", "tooltipWrapper", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/tooltip/TooltipWrapper;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RealFbsSplitVH extends k<RealFbsSplitVO> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final AtomActionSheetHandler atomActionSheetHandler;

    @NotNull
    private final SplitDynamicElementsAdapter dynamicAdapter;
    private final FrameBinder frameBinder;
    private final int headerLeftPadding;
    private RealFbsSplitVO item;
    private DisposableActionHandler kebabDisposableActionHandler;

    @NotNull
    private final ProductAdapter productAdapter;
    private AtomAction productsAction;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private Function1<? super AtomAction, Unit> rfbsActionHandler;

    @NotNull
    private final List<BindStep> steps;
    private TooltipWrapper tooltipWrapper;
    private AtomAction widgetAction;

    @NotNull
    private final WidgetRfbsSplitView widgetRfbsSplitView;

    @NotNull
    private final YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DYNAMIC_ELEMENTS_TOP_MARGIN = ResourceExtKt.toPx(8);
    private static final int DYNAMIC_ELEMENTS_BOTTOM_MARGIN = ResourceExtKt.toPx(16);
    private static final int DYNAMIC_ELEMENTS_NO_SUB_HEADER_BOTTOM_MARGIN = ResourceExtKt.toPx(24);
    private static final int DYNAMIC_ELEMENTS_TOP_MARGIN_REDESIGN = ResourceExtKt.toPx(0);
    private static final int DYNAMIC_ELEMENTS_BOTTOM_MARGIN_REDESIGN = ResourceExtKt.toPx(12);
    private static final int DYNAMIC_ELEMENTS_BOTTOM_MARGIN_FOR_LAST_ITEM_REDESIGN = ResourceExtKt.toPx(20);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVH$Companion;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTION_DIVIDE", "ACTION_MERGE", "ACTION_DELETE", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFbsSplitVH(@NotNull WidgetRfbsSplitView widgetRfbsSplitView, @NotNull ComposerReferences ref, @NotNull ActionSheetEventHandler actionSheetEventHandler, FrameBinder frameBinder, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull AppType appType) {
        super(widgetRfbsSplitView);
        View view;
        Intrinsics.checkNotNullParameter(widgetRfbsSplitView, "widgetRfbsSplitView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.widgetRfbsSplitView = widgetRfbsSplitView;
        this.ref = ref;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.frameBinder = frameBinder;
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        this.headerLeftPadding = ResourceExtKt.toPx(8);
        this.actionHandler = new ActionHandler.Builder(ref, this).onClick(new RealFbsSplitVH$actionHandler$1(this)).buildHandler();
        this.rfbsActionHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new RealFbsSplitVH$rfbsActionHandler$1(customActionHandlersStoreFactory)).onClick(new RealFbsSplitVH$rfbsActionHandler$2(this)).buildHandler();
        this.atomActionSheetHandler = new SplitActionSheetHandler(ref);
        ProductAdapter productAdapter = new ProductAdapter();
        this.productAdapter = productAdapter;
        SplitDynamicElementsAdapter splitDynamicElementsAdapter = new SplitDynamicElementsAdapter(this, ref, handlersInhibitor, appType, this.rfbsActionHandler, new RealFbsSplitVH$dynamicAdapter$1(this), new RealFbsSplitVH$dynamicAdapter$2(this));
        this.dynamicAdapter = splitDynamicElementsAdapter;
        int i11 = 0;
        this.steps = C7714v.b0(new C3125a(i11, this), new b(this, i11), new c(this, i11));
        RecyclerView productsRv = widgetRfbsSplitView.getProductsRv();
        productsRv.setAdapter(productAdapter);
        productsRv.setLayoutManager(new LinearLayoutManager(productsRv.getContext(), 0, false));
        productsRv.addItemDecoration(new MarginItemDecoration());
        productsRv.setOnTouchListener(new Go.d(new GestureDetectorCompat(productsRv.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH$1$detector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                AtomAction atomAction;
                Function1 function1;
                Intrinsics.checkNotNullParameter(e11, "e");
                atomAction = RealFbsSplitVH.this.productsAction;
                if (atomAction == null) {
                    return false;
                }
                function1 = RealFbsSplitVH.this.actionHandler;
                function1.invoke(atomAction);
                return false;
            }
        }), i11));
        RecyclerView dynamicElementsRV = widgetRfbsSplitView.getDynamicElementsRV();
        RecyclerView recyclerView = null;
        dynamicElementsRV.setItemAnimator(null);
        dynamicElementsRV.setAdapter(splitDynamicElementsAdapter);
        dynamicElementsRV.setRecycledViewPool(ref.getComposerViewPoolProvider().getViewPool());
        if (frameBinder != null) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            frameBinder.init(itemView);
        }
        if (frameBinder != null) {
            ComponentCallbacksC5392m c11 = ref.getContainer().c();
            if (c11 != null && (view = c11.getView()) != null) {
                recyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
            }
            frameBinder.applyRecycler(recyclerView);
        }
    }

    private final void bindDynamicSplits() {
        RealFbsSplitVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        this.dynamicAdapter.submitList(boundedData.getDynamicElements());
        updateSplitMargins(boundedData);
    }

    private final void bindHeader() {
        WidgetRfbsSplitView widgetRfbsSplitView = this.widgetRfbsSplitView;
        RealFbsSplitVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        bindLeftIcon();
        SingleAtom headerSAL = widgetRfbsSplitView.getHeaderSAL();
        RealFbsSplitVO.Header header = boundedData.getHeader();
        ContainerExtKt.bindOrGone$default(headerSAL, header != null ? header.getText() : null, false, 2, null);
        RealFbsSplitVO.Header header2 = boundedData.getHeader();
        if (header2 != null && header2.getText() != null) {
            headerSAL.setOnClickListener(new e(this, 0));
            setAutoTestId(headerSAL, R$id.titleTv);
        }
        SingleAtom subHeaderSAL = widgetRfbsSplitView.getSubHeaderSAL();
        ContainerExtKt.bindOrGone$default(subHeaderSAL, boundedData.getSubHeader(), false, 2, null);
        setAutoTestId(subHeaderSAL, R$id.subtitleTv);
        RealFbsSplitVO.Header header3 = boundedData.getHeader();
        if ((header3 != null ? header3.getRightIconButton() : null) == null) {
            ViewExtKt.gone(widgetRfbsSplitView.getControlsLIBV());
            ViewGroup.LayoutParams layoutParams = widgetRfbsSplitView.getHeaderSAL().getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(ResourceExtKt.toPx(16));
            return;
        }
        ViewExtKt.show(widgetRfbsSplitView.getControlsLIBV());
        ViewGroup.LayoutParams layoutParams2 = widgetRfbsSplitView.getHeaderSAL().getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
        setupRightIconButton(boundedData.getId(), boundedData.getHeader().getRightIconButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindHeader$lambda$12$lambda$10$lambda$9(RealFbsSplitVH realFbsSplitVH, View view) {
        AtomAction atomAction = realFbsSplitVH.widgetAction;
        if (atomAction != null) {
            realFbsSplitVH.actionHandler.invoke(atomAction);
        }
    }

    private final void bindLeftIcon() {
        WidgetRfbsSplitView widgetRfbsSplitView = this.widgetRfbsSplitView;
        RealFbsSplitVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        RealFbsSplitVO.Header header = boundedData.getHeader();
        Icon leftIcon = header != null ? header.getLeftIcon() : null;
        ImageViewExtKt.loadImageOrGone(widgetRfbsSplitView.getLeftIconIv(), leftIcon != null ? leftIcon.getImage() : null);
        if ((leftIcon != null ? leftIcon.getTintColor() : null) != null) {
            ImageView leftIconIv = widgetRfbsSplitView.getLeftIconIv();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = widgetRfbsSplitView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(leftIconIv, styleParser.parseColor(context, leftIcon.getTintColor()));
        } else {
            ThemeExtKt.semanticTint$default(widgetRfbsSplitView.getLeftIconIv(), 0, 1, null);
        }
        if (widgetRfbsSplitView.getLeftIconIv().getVisibility() == 0) {
            widgetRfbsSplitView.getHeaderSAL().setPadding(0, 0, 0, 0);
        } else {
            widgetRfbsSplitView.getHeaderSAL().setPadding(this.headerLeftPadding, 0, 0, 0);
        }
    }

    private final void bindProducts() {
        List<RealFbsSplitVO.Product> elements;
        RealFbsSplitVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        RecyclerView productsRv = this.widgetRfbsSplitView.getProductsRv();
        RealFbsSplitVO.Products products = boundedData.getProducts();
        ViewExtKt.showOrGone(productsRv, (products == null || (elements = products.getElements()) == null) ? null : Boolean.valueOf(!elements.isEmpty()));
        ProductAdapter productAdapter = this.productAdapter;
        RealFbsSplitVO.Products products2 = boundedData.getProducts();
        List<RealFbsSplitVO.Product> elements2 = products2 != null ? products2.getElements() : null;
        if (elements2 == null) {
            elements2 = K.f71697a;
        }
        productAdapter.submitList(elements2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleIconButtonAction(AtomAction.Click action) {
        String link;
        String id2 = action.getId();
        if (id2 != null) {
            int hashCode = id2.hashCode();
            if (hashCode == -1335458389) {
                if (!id2.equals("delete") || (link = action.getLink()) == null) {
                    return;
                }
                showConfirmDeleteDialog(link);
                return;
            }
            if (hashCode != -1331463047) {
                if (hashCode != 103785528 || !id2.equals("merge")) {
                    return;
                }
            } else if (!id2.equals("divide")) {
                return;
            }
            String link2 = action.getLink();
            if (link2 != null) {
                ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(this.ref.getNavigator(), "RealFbsSplit", link2, Integer.valueOf(link2.hashCode()), null, new BottomSheetComposerFragment.OverrideDisplayMode(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP), 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$4$lambda$3(GestureDetectorCompat gestureDetectorCompat, View view, MotionEvent motionEvent) {
        gestureDetectorCompat.a(motionEvent);
        view.performClick();
        return false;
    }

    private final void setAutoTestId(SingleAtom singleAtom, int i11) {
        View childAt = singleAtom.getChildAt(0);
        if (childAt == null || !(childAt instanceof TextAtomView)) {
            return;
        }
        ((TextAtomView) childAt).setId(i11);
    }

    private final void setupRightIconButton(long itemId, ButtonV3Atom.LargeIconButton button) {
        Function1 function1;
        WidgetRfbsSplitView widgetRfbsSplitView = this.widgetRfbsSplitView;
        DisposableActionHandler disposableActionHandler = this.kebabDisposableActionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        AtomActionDTO action = button.getAction();
        if ((action != null ? action.getBehavior() : null) == AtomActionDTO.Behavior.BEHAVIOR_TYPE_ACTION_SHEET) {
            DisposableActionHandler buildDisposableHandler = new ActionHandler.Builder(this.ref, this).onPreProcess(new RealFbsSplitVH$setupRightIconButton$1$onAction$1(this.atomActionSheetHandler)).buildDisposableHandler(widgetRfbsSplitView.hashCode() + itemId, U7.d.c(this.ref), this.actionSheetEventHandler);
            this.kebabDisposableActionHandler = buildDisposableHandler;
            function1 = buildDisposableHandler.getHandler();
        } else {
            function1 = this.actionHandler;
        }
        Function1 function12 = function1;
        if (button.getAction() != null) {
            LargeIconButtonHolderKt.bind$default(widgetRfbsSplitView.getControlsLIBV(), button, function12, false, 4, null);
            return;
        }
        LargeIconButtonHolderKt.bind$default(widgetRfbsSplitView.getControlsLIBV(), ButtonV3Atom.LargeIconButton.copy$default(button, null, new AtomActionDTO(AtomActionDTO.Behavior.INVALID_ACTION, null, null, null, 14, null), null, null, null, null, null, 125, null), null, false, 6, null);
        widgetRfbsSplitView.getControlsLIBV().setClickable(false);
        LargeIconButtonView controlsLIBV = widgetRfbsSplitView.getControlsLIBV();
        Context context = widgetRfbsSplitView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        controlsLIBV.setTint(ThemeExtKt.themeColor(context, R$attr.layerSurface));
    }

    private final void showConfirmDeleteDialog(String deleteUrl) {
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        int i11 = R$string.common_remove_split_alert_title_android;
        int i12 = R$string.common_remove_split_alert_message_android;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i13 = 0;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(Integer.valueOf(i12), str, Integer.valueOf(i11), str2, R$string.common_remove_split_alert_action_android, str3, Integer.valueOf(R$string.common_remove_split_alert_cancel_action_android), i13, 170, null);
        Intent intent = new Intent();
        intent.putExtra("EXTRA_DELETE_DEEPLINK", deleteUrl);
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(this.ref.getContainer().c(), 9010);
        newInstanceForFragmentResult.show(this.ref.getContainer().k(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(RealFbsSplitVH realFbsSplitVH) {
        realFbsSplitVH.bindHeader();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(RealFbsSplitVH realFbsSplitVH) {
        realFbsSplitVH.bindProducts();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$2(RealFbsSplitVH realFbsSplitVH) {
        realFbsSplitVH.bindDynamicSplits();
        return Unit.f71690a;
    }

    private final void updateSplitMargins(RealFbsSplitVO item) {
        ViewGroup.LayoutParams layoutParams = this.widgetRfbsSplitView.getDynamicElementsRV().getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null) {
            return;
        }
        List<SplitDynamicElementVO> dynamicElements = item.getDynamicElements();
        if (dynamicElements != null && !dynamicElements.isEmpty()) {
            RealFbsSplitVO.Header header = item.getHeader();
            if ((header != null ? header.getText() : null) != null) {
                RealFbsSplitVO.Products products = item.getProducts();
                List<RealFbsSplitVO.Product> elements = products != null ? products.getElements() : null;
                if (elements != null && !elements.isEmpty()) {
                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = DYNAMIC_ELEMENTS_TOP_MARGIN;
                    ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = DYNAMIC_ELEMENTS_BOTTOM_MARGIN;
                } else if (item.getSubHeader() == null) {
                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = DYNAMIC_ELEMENTS_TOP_MARGIN_REDESIGN;
                    ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = DYNAMIC_ELEMENTS_NO_SUB_HEADER_BOTTOM_MARGIN;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = DYNAMIC_ELEMENTS_TOP_MARGIN;
                    ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = DYNAMIC_ELEMENTS_BOTTOM_MARGIN;
                }
                this.widgetRfbsSplitView.getDynamicElementsRV().setLayoutParams(bVar);
            }
        }
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = DYNAMIC_ELEMENTS_TOP_MARGIN_REDESIGN;
        RealFbsSplitVO.Footer footer = item.getFooter();
        if (footer == null || footer.getIsRounded()) {
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = DYNAMIC_ELEMENTS_BOTTOM_MARGIN_FOR_LAST_ITEM_REDESIGN;
        } else {
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = DYNAMIC_ELEMENTS_BOTTOM_MARGIN_REDESIGN;
        }
        this.widgetRfbsSplitView.getDynamicElementsRV().setLayoutParams(bVar);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            FrameBinder.DefaultImpls.onAttach$default(frameBinder, null, 1, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onDetach();
        }
        TooltipWrapper tooltipWrapper = this.tooltipWrapper;
        if (tooltipWrapper != null) {
            tooltipWrapper.dismiss();
        }
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onRecycle();
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        TooltipWrapper tooltipWrapper = this.tooltipWrapper;
        if (tooltipWrapper != null) {
            tooltipWrapper.update(this.widgetRfbsSplitView.getDynamicElementsRV(), info);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RealFbsSplitVO item, @NotNull l20.d info) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        AtomActionDTO action2 = item.getAction();
        AtomAction atomAction = null;
        this.widgetAction = action2 != null ? AtomActionMapperKt.toAtomAction(action2, null) : null;
        RealFbsSplitVO.Products products = item.getProducts();
        if (products != null && (action = products.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, null);
        }
        this.productsAction = atomAction;
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.bind(this.steps, item.getViewItemKey());
        } else {
            bindHeader();
            bindProducts();
            bindDynamicSplits();
        }
        this.widgetRfbsSplitView.setContentDescription(String.valueOf(getAdapterPosition()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RealFbsSplitVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((RealFbsSplitVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
