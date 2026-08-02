package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleVO;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2TitleBinding;
import ru.ozon.app.android.cart.ui.thermometer.presentation.view.ThermometerMoleculeView;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001)B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2TitleBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "<init>", "(Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2TitleBinding;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2TitleBinding;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2TitleWidgetViewHolder extends k<CartSplitV2TitleVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final WidgetCartSplitV2TitleBinding binding;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String[] miniApps = {"category", "highlight", "seller"};
    private static final int paddingBottom = ResourceExtKt.toPx(12);
    private static final int paddingBottomWithBadges = ResourceExtKt.toPx(8);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleWidgetViewHolder$Companion;", "", "<init>", "()V", "", "", "miniApps", "[Ljava/lang/String;", "getMiniApps", "()[Ljava/lang/String;", "FRESH_MINIAPP", "Ljava/lang/String;", "FRESH_MINIAPP_HIGHLIGHT", "SELLER_MINIAPP", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getMiniApps() {
            return CartSplitV2TitleWidgetViewHolder.miniApps;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CartSplitV2TitleWidgetViewHolder(@NotNull WidgetCartSplitV2TitleBinding binding, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences ref, @NotNull d customActionHandlersStoreFactory, @NotNull CartEventsController cartEventsController) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new CartSplitV2TitleWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new CartSplitV2TitleWidgetViewHolder$actionHandler$2(cartEventsController)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.badgesAdapter = atomsAdapter;
        binding.badgesHfal.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r0 == null) goto L19;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull CartSplitV2TitleVO item, @NotNull l20.d info) {
        CartSplitV2TitleVO.Header.AdditionalAction additionalAction;
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCartSplitV2TitleBinding widgetCartSplitV2TitleBinding = this.binding;
        TextAtomView titleSA = widgetCartSplitV2TitleBinding.titleSA;
        Intrinsics.checkNotNullExpressionValue(titleSA, "titleSA");
        CartSplitV2TitleVO.Header header = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(titleSA, header != null ? header.getTitle() : null, null, 2, null);
        TextAtomView subtitleSA = widgetCartSplitV2TitleBinding.subtitleSA;
        Intrinsics.checkNotNullExpressionValue(subtitleSA, "subtitleSA");
        CartSplitV2TitleVO.Header header2 = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(subtitleSA, header2 != null ? header2.getSubtitle() : null, null, 2, null);
        CartSplitV2TitleVO.Header header3 = item.getHeader();
        if (header3 != null && (additionalAction = header3.getAdditionalAction()) != null) {
            SmallBorderlessButtonView additionalActionBtn = widgetCartSplitV2TitleBinding.additionalActionBtn;
            Intrinsics.checkNotNullExpressionValue(additionalActionBtn, "additionalActionBtn");
            ViewExtKt.show(additionalActionBtn);
            SmallBorderlessButtonView additionalActionBtn2 = widgetCartSplitV2TitleBinding.additionalActionBtn;
            Intrinsics.checkNotNullExpressionValue(additionalActionBtn2, "additionalActionBtn");
            WrappedBorderlessButtonHolderKt.bind(additionalActionBtn2, additionalAction.getButton(), this.actionHandler);
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), additionalAction.getTintColor());
            if (parseColor != null) {
                widgetCartSplitV2TitleBinding.additionalActionBtn.setTextColor(parseColor.intValue());
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
        }
        SmallBorderlessButtonView additionalActionBtn3 = widgetCartSplitV2TitleBinding.additionalActionBtn;
        Intrinsics.checkNotNullExpressionValue(additionalActionBtn3, "additionalActionBtn");
        ViewExtKt.gone(additionalActionBtn3);
        CartSplitV2TitleVO.Header header4 = item.getHeader();
        if (header4 != null) {
            ConstraintLayout splitV2TitleRootCl = widgetCartSplitV2TitleBinding.splitV2TitleRootCl;
            Intrinsics.checkNotNullExpressionValue(splitV2TitleRootCl, "splitV2TitleRootCl");
            ViewExtKt.show(splitV2TitleRootCl);
            if (header4.getBadges() != null) {
                HorizontalFlexAtomsLayout badgesHfal = widgetCartSplitV2TitleBinding.badgesHfal;
                Intrinsics.checkNotNullExpressionValue(badgesHfal, "badgesHfal");
                ViewExtKt.show(badgesHfal);
                this.badgesAdapter.bind(getContext(), header4.getBadges());
                ConstraintLayout splitV2TitleRootCl2 = widgetCartSplitV2TitleBinding.splitV2TitleRootCl;
                Intrinsics.checkNotNullExpressionValue(splitV2TitleRootCl2, "splitV2TitleRootCl");
                ViewExtKt.updatePadding$default(splitV2TitleRootCl2, 0, 0, 0, paddingBottomWithBadges, 7, null);
            } else {
                HorizontalFlexAtomsLayout badgesHfal2 = widgetCartSplitV2TitleBinding.badgesHfal;
                Intrinsics.checkNotNullExpressionValue(badgesHfal2, "badgesHfal");
                ViewExtKt.gone(badgesHfal2);
                ConstraintLayout splitV2TitleRootCl3 = widgetCartSplitV2TitleBinding.splitV2TitleRootCl;
                Intrinsics.checkNotNullExpressionValue(splitV2TitleRootCl3, "splitV2TitleRootCl");
                ViewExtKt.updatePadding$default(splitV2TitleRootCl3, 0, 0, 0, paddingBottom, 7, null);
            }
        } else {
            ConstraintLayout splitV2TitleRootCl4 = widgetCartSplitV2TitleBinding.splitV2TitleRootCl;
            Intrinsics.checkNotNullExpressionValue(splitV2TitleRootCl4, "splitV2TitleRootCl");
            ViewExtKt.gone(splitV2TitleRootCl4);
        }
        ThermometerMoleculeView thermometerMoleculeView = widgetCartSplitV2TitleBinding.thermometerMoleculeView;
        CartSplitV2TitleVO.Header header5 = item.getHeader();
        thermometerMoleculeView.bindOrGone(header5 != null ? header5.getThermometerMolecule() : null, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CartSplitV2TitleVO item, @NotNull c trackingData, f viewedPond) {
        CartSplitV2TitleVO.Header header;
        ThermometerMoleculeVO thermometerMolecule;
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CartSplitV2TitleWidgetViewHolder) item, trackingData, viewedPond);
        CartSplitV2TitleVO boundData = getBoundData();
        if (boundData == null || (header = boundData.getHeader()) == null || (thermometerMolecule = header.getThermometerMolecule()) == null || (tokenizedEvent = thermometerMolecule.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, tokenizedEvent, null);
    }
}
