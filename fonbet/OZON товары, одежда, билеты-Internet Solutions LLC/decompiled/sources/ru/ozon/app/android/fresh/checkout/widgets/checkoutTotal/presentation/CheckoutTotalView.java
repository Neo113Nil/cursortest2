package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalVO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.hints.HintsViewRender;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.price.PricesAdapter;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 `2\u00020\u0001:\u0001`B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001f\u001a\u00020\u00132\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020$2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020'2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b(\u0010)J?\u0010.\u001a\u00020\u0013*\u00020*2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u001c2\u0006\u0010-\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u00020\u0013*\u00020*2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u0010BR\u001b\u0010J\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\b\u000b\u0010IR\u001b\u0010\u001e\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010BR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u00107\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\bX\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getButtonView", "()Landroid/view/View;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", "item", "", "backgroundColor", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "infoActionHandler", "bindSummary", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "hints", "bindInteractionsHints", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/price/PricesAdapter;", "getPricesAdapter", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/price/PricesAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/InfosAdapter;", "getInfosAdapter", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/InfosAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender;", "getHintsRender", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "infos", "betweenInfos", "bindInfos", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "priceSection", "betweenPrices", "bindPrices", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;ILkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "title$delegate", "LSc/j;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "price$delegate", "getPrice", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "price", "infoBlocks$delegate", "getInfoBlocks", "()Landroidx/recyclerview/widget/RecyclerView;", "infoBlocks", "priceBlocks$delegate", "getPriceBlocks", "priceBlocks", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView$delegate", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "hints$delegate", "getHints", "Landroid/graphics/drawable/GradientDrawable;", "priceSectionBackground$delegate", "getPriceSectionBackground", "()Landroid/graphics/drawable/GradientDrawable;", "priceSectionBackground", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/ItemSpaceDecoration;", "pricesDecorator$delegate", "getPricesDecorator", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/ItemSpaceDecoration;", "pricesDecorator", "infosDecorator$delegate", "getInfosDecorator", "infosDecorator", "pricesAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/price/PricesAdapter;", "infosAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/InfosAdapter;", "hintsRender", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutTotalView extends ConstraintLayout {

    /* renamed from: buttonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonView;

    /* renamed from: hints$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hints;
    private HintsViewRender hintsRender;

    /* renamed from: infoBlocks$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j infoBlocks;
    private InfosAdapter infosAdapter;

    /* renamed from: infosDecorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j infosDecorator;

    /* renamed from: price$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j price;

    /* renamed from: priceBlocks$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceBlocks;

    /* renamed from: priceSectionBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceSectionBackground;
    private PricesAdapter pricesAdapter;

    /* renamed from: pricesDecorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pricesDecorator;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultPricesSpace = UiExtKt.toPx(12);
    private static final int defaultInfosSpace = UiExtKt.toPx(8);
    private static final int pricesVerticalMargin = UiExtKt.toPx(16);
    private static final int hintsTopMargin = UiExtKt.toPx(12);
    private static final int infosTopMargin = UiExtKt.toPx(8);
    private static final int defaultPricesBackground = UniColors.WHITE_TRANSPARENT_0.getResId();
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalView$Companion;", "", "<init>", "()V", "", "defaultPricesSpace", "I", "getDefaultPricesSpace", "()I", "defaultInfosSpace", "getDefaultInfosSpace", "pricesVerticalMargin", "getPricesVerticalMargin", "hintsTopMargin", "getHintsTopMargin", "infosTopMargin", "getInfosTopMargin", "defaultPricesBackground", "getDefaultPricesBackground", "", "ZERO_RADIUS", "F", "HORIZONTAL_BIAS", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultInfosSpace() {
            return CheckoutTotalView.defaultInfosSpace;
        }

        public final int getDefaultPricesBackground() {
            return CheckoutTotalView.defaultPricesBackground;
        }

        public final int getDefaultPricesSpace() {
            return CheckoutTotalView.defaultPricesSpace;
        }

        public final int getHintsTopMargin() {
            return CheckoutTotalView.hintsTopMargin;
        }

        public final int getInfosTopMargin() {
            return CheckoutTotalView.infosTopMargin;
        }

        public final int getPricesVerticalMargin() {
            return CheckoutTotalView.pricesVerticalMargin;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutTotalView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindInfos(RecyclerView recyclerView, List<CellDTO> list, int i11, Function1<? super AtomAction, Unit> function1) {
        if (list == null) {
            ViewExtKt.gone(getInfoBlocks());
            return;
        }
        ViewExtKt.show(getInfoBlocks());
        getInfosAdapter(function1).submitList(list);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(getInfosDecorator());
        }
        getInfosDecorator().setSpacing(i11);
        recyclerView.invalidateItemDecorations();
    }

    private final void bindPrices(RecyclerView recyclerView, CheckoutTotalVO.Summary.PriceSection priceSection, int i11, Function1<? super AtomAction, Unit> function1) {
        getPricesAdapter(function1).submitList(priceSection.getPrices());
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(getPricesDecorator());
        }
        getPricesDecorator().setSpacing(i11);
        recyclerView.invalidateItemDecorations();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, priceSection.getBackgroundColor(), UniColors.WHITE_TRANSPARENT_0.getResId());
        GradientDrawable priceSectionBackground = getPriceSectionBackground();
        priceSectionBackground.setColors(new int[]{parseColor, parseColor});
        priceSectionBackground.setCornerRadius(priceSection.getCornerRadius() != null ? r4.intValue() : 0.0f);
        recyclerView.setBackground(priceSectionBackground);
    }

    private final ButtonV3View getButtonView() {
        return (ButtonV3View) this.buttonView.getValue();
    }

    private final RecyclerView getHints() {
        return (RecyclerView) this.hints.getValue();
    }

    private final HintsViewRender getHintsRender(Function1<? super AtomAction, Unit> actionHandler) {
        HintsViewRender hintsViewRender = this.hintsRender;
        if (hintsViewRender != null) {
            return hintsViewRender;
        }
        HintsViewRender hintsViewRender2 = new HintsViewRender(getHints(), actionHandler);
        this.hintsRender = hintsViewRender2;
        return hintsViewRender2;
    }

    private final RecyclerView getInfoBlocks() {
        return (RecyclerView) this.infoBlocks.getValue();
    }

    private final InfosAdapter getInfosAdapter(Function1<? super AtomAction, Unit> actionHandler) {
        InfosAdapter infosAdapter = this.infosAdapter;
        if (infosAdapter != null) {
            return infosAdapter;
        }
        InfosAdapter infosAdapter2 = new InfosAdapter(actionHandler);
        this.infosAdapter = infosAdapter2;
        getInfoBlocks().setAdapter(this.infosAdapter);
        return infosAdapter2;
    }

    private final ItemSpaceDecoration getInfosDecorator() {
        return (ItemSpaceDecoration) this.infosDecorator.getValue();
    }

    private final PriceAtomView getPrice() {
        return (PriceAtomView) this.price.getValue();
    }

    private final RecyclerView getPriceBlocks() {
        return (RecyclerView) this.priceBlocks.getValue();
    }

    private final GradientDrawable getPriceSectionBackground() {
        return (GradientDrawable) this.priceSectionBackground.getValue();
    }

    private final PricesAdapter getPricesAdapter(Function1<? super AtomAction, Unit> actionHandler) {
        PricesAdapter pricesAdapter = this.pricesAdapter;
        if (pricesAdapter != null) {
            return pricesAdapter;
        }
        PricesAdapter pricesAdapter2 = new PricesAdapter(actionHandler);
        this.pricesAdapter = pricesAdapter2;
        getPriceBlocks().setAdapter(this.pricesAdapter);
        return pricesAdapter2;
    }

    private final ItemSpaceDecoration getPricesDecorator() {
        return (ItemSpaceDecoration) this.pricesDecorator.getValue();
    }

    private final TextAtomV2View getTitle() {
        return (TextAtomV2View) this.title.getValue();
    }

    public final void bindButton(@NotNull ButtonV3DTO button, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bindOrGone(getButtonView(), button, actionHandler);
    }

    public final void bindInteractionsHints(List<? extends AtomDTO> hints, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getHintsRender(actionHandler).bindInteractionsHints(hints);
    }

    public final void bindSummary(@NotNull CheckoutTotalVO.Summary item, @NotNull String backgroundColor, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> infoActionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(infoActionHandler, "infoActionHandler");
        TextHolderKt.bindOrGone(getTitle(), item.getHeader().getTitle(), actionHandler);
        PriceAtomHolderKt.bindOrGone(getPrice(), item.getHeader().getPrice(), actionHandler);
        bindInfos(getInfoBlocks(), item.getInfos(), item.getSpacers().getBetweenInfos(), actionHandler);
        bindPrices(getPriceBlocks(), item.getPriceSection(), item.getSpacers().getBetweenPrices(), infoActionHandler);
        setPadding(item.getSpacers().getLeft(), item.getSpacers().getTop(), item.getSpacers().getRight(), item.getSpacers().getBottom());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, backgroundColor, defaultBackgroundColor));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutTotalView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.title = LazyUtilsKt.unsafeLazy(new CheckoutTotalView$title$2(context, this));
        this.price = LazyUtilsKt.unsafeLazy(new CheckoutTotalView$price$2(context, this));
        this.infoBlocks = LazyUtilsKt.unsafeLazy(new CheckoutTotalView$infoBlocks$2(context, this));
        this.priceBlocks = LazyUtilsKt.unsafeLazy(new CheckoutTotalView$priceBlocks$2(context, this));
        this.buttonView = LazyUtilsKt.unsafeLazy(new CheckoutTotalView$buttonView$2(context, this));
        this.hints = LazyUtilsKt.unsafeLazy(new CheckoutTotalView$hints$2(context, this));
        this.priceSectionBackground = LazyUtilsKt.unsafeLazy(CheckoutTotalView$priceSectionBackground$2.INSTANCE);
        this.pricesDecorator = LazyUtilsKt.unsafeLazy(CheckoutTotalView$pricesDecorator$2.INSTANCE);
        this.infosDecorator = LazyUtilsKt.unsafeLazy(CheckoutTotalView$infosDecorator$2.INSTANCE);
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.checkoutTotalBarrier);
        barrier.setLayoutParams(new ConstraintLayout.b(-1, -2));
        barrier.f(3);
        barrier.setReferencedIds(new int[]{R$id.checkoutTotalTitle, R$id.checkoutTotalFullPrice, R$id.checkoutTotalInfos});
        addView(barrier);
    }

    @NotNull
    /* renamed from: getButtonView, reason: collision with other method in class */
    public final View m738getButtonView() {
        return getButtonView();
    }
}
