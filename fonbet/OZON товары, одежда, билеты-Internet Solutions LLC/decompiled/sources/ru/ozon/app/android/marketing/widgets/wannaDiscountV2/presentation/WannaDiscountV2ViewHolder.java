package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import Bl.b;
import WZ.l;
import WZ.t;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle40IconHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.marketing.R$drawable;
import ru.ozon.app.android.marketing.databinding.WidgetWannaDiscountV2Binding;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\\_\b\u0001\u0018\u0000 e2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001eB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J+\u0010@\u001a\u00020\u000f*\u00020;2\u0006\u0010<\u001a\u0002072\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000207H\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u00020\u000f*\u00020;2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010G\u001a\u00020\u000f2\u0006\u0010D\u001a\u0002072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010D\u001a\u000207H\u0002¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u0014\u0010N\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010OR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u000f0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u000f0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModel;LWZ/l;)V", "", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO;Ll20/d;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "priceBlock", "bindPriceBlock", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "priceInput", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "bindPriceInput", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;Ljava/util/List;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "quantityInput", "bindQuantityInput", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "sendButton", "", "isEnabled", "bindSendButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Z)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "bindInfoButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "bindDiscounts", "(Ljava/util/List;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "sellerCell", "bindSellerCell", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;)V", "", "newPrice", "updatePrice", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;Ljava/lang/String;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "errorText", "", "bottom", "contentDescription", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;ILjava/lang/String;)V", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;I)V", "message", "Lru/ozon/uni/android/flashbar/model/Action;", "action", "showMessage", "(Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Action;)V", "showErrorMessage", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModel;", "LWZ/l;", "cellIconCornerRadius", "I", "", "dp16", "F", "dp8", "Landroid/graphics/drawable/ShapeDrawable;", "priceDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "sendActionHandler", "ru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewHolder$priceTextWatcher$1", "priceTextWatcher", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewHolder$priceTextWatcher$1;", "ru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewHolder$quantityTextWatcher$1", "quantityTextWatcher", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewHolder$quantityTextWatcher$1;", "Lru/ozon/app/android/marketing/databinding/WidgetWannaDiscountV2Binding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetWannaDiscountV2Binding;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2ViewHolder extends k<WannaDiscountV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetWannaDiscountV2Binding binding;
    private final int cellIconCornerRadius;
    private final float dp16;
    private final int dp8;

    @NotNull
    private final ShapeDrawable priceDrawable;

    @NotNull
    private final WannaDiscountV2ViewHolder$priceTextWatcher$1 priceTextWatcher;

    @NotNull
    private final WannaDiscountV2ViewHolder$quantityTextWatcher$1 quantityTextWatcher;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Function1<AtomAction, Unit> sendActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final WannaDiscountV2ViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewHolder$priceTextWatcher$1, ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewHolder$quantityTextWatcher$1, ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher] */
    public WannaDiscountV2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull WannaDiscountV2ViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.cellIconCornerRadius = UiExtKt.toPx(6);
        float pxF = ResourceExtKt.toPxF(16);
        this.dp16 = pxF;
        this.dp8 = UiExtKt.toPx(8);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF}, null, null));
        this.priceDrawable = shapeDrawable;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.sendActionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new WannaDiscountV2ViewHolder$sendActionHandler$1(this)).buildHandler();
        ?? r62 = new OzonTextWatcher() { // from class: ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewHolder$priceTextWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                WannaDiscountV2ViewModel wannaDiscountV2ViewModel;
                WannaDiscountV2VO boundedData = WannaDiscountV2ViewHolder.this.getBoundedData();
                if (boundedData != null) {
                    wannaDiscountV2ViewModel = WannaDiscountV2ViewHolder.this.viewModel;
                    wannaDiscountV2ViewModel.checkPrice(String.valueOf(s11), boundedData.getPriceInput(), boundedData.getPriceBlock(), boundedData.getDiscounts());
                }
            }
        };
        this.priceTextWatcher = r62;
        ?? r72 = new OzonTextWatcher() { // from class: ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewHolder$quantityTextWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                WannaDiscountV2DTO.QuantityInputBlock quantityInput;
                WannaDiscountV2ViewModel wannaDiscountV2ViewModel;
                WannaDiscountV2VO boundedData = WannaDiscountV2ViewHolder.this.getBoundedData();
                if (boundedData == null || (quantityInput = boundedData.getQuantityInput()) == null) {
                    return;
                }
                wannaDiscountV2ViewModel = WannaDiscountV2ViewHolder.this.viewModel;
                wannaDiscountV2ViewModel.checkQuantity(h.y0(String.valueOf(s11)), quantityInput);
            }
        };
        this.quantityTextWatcher = r72;
        WidgetWannaDiscountV2Binding bind = WidgetWannaDiscountV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.wannaDiscountTagsLayout.setTagClickListener(new WannaDiscountV2ViewHolder$1$1(this));
        bind.wannaDiscountUserPriceInput.getMainView().setTextWatcher(r62);
        bind.wannaDiscountUserQuantityInput.getMainView().setTextWatcher(r72);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDiscounts(List<WannaDiscountV2VO.Discount> discounts) {
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding = this.binding;
        if (discounts.isEmpty()) {
            DiscountViewContainerLayout wannaDiscountTagsLayout = widgetWannaDiscountV2Binding.wannaDiscountTagsLayout;
            Intrinsics.checkNotNullExpressionValue(wannaDiscountTagsLayout, "wannaDiscountTagsLayout");
            ViewExtKt.gone(wannaDiscountTagsLayout);
        } else {
            widgetWannaDiscountV2Binding.wannaDiscountTagsLayout.submitItems(discounts);
            DiscountViewContainerLayout wannaDiscountTagsLayout2 = widgetWannaDiscountV2Binding.wannaDiscountTagsLayout;
            Intrinsics.checkNotNullExpressionValue(wannaDiscountTagsLayout2, "wannaDiscountTagsLayout");
            ViewExtKt.show(wannaDiscountTagsLayout2);
        }
    }

    private final void bindInfoButton(ButtonV3Atom.SmallIconButton infoButton) {
        SmallIconButtonView smallIconButtonView = this.binding.infoButton;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bind(smallIconButtonView, infoButton, this.actionHandler);
        smallIconButtonView.setPadding(0, 0, 0, 0);
    }

    private final void bindPriceBlock(WannaDiscountV2DTO.PriceBlock priceBlock) {
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding = this.binding;
        this.priceDrawable.getPaint().setColor(StyleParser.INSTANCE.parseColor(getContext(), priceBlock.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        widgetWannaDiscountV2Binding.wannaDiscountPriceBg.setBackground(this.priceDrawable);
        PriceView wannaDiscountPriceView = widgetWannaDiscountV2Binding.wannaDiscountPriceView;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountPriceView, "wannaDiscountPriceView");
        PriceHolderKt.bind$default(wannaDiscountPriceView, priceBlock.getPrice(), null, 2, null);
        TextAtomView wannaDiscountPriceTv = widgetWannaDiscountV2Binding.wannaDiscountPriceTv;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountPriceTv, "wannaDiscountPriceTv");
        TextAtomHolderKt.bind$default(wannaDiscountPriceTv, priceBlock.getDescription(), null, 2, null);
    }

    private final void bindPriceInput(WannaDiscountV2DTO.PriceInputBlock priceInput, WannaDiscountV2DTO.PriceBlock priceBlock, List<WannaDiscountV2VO.Discount> discounts) {
        TextFieldCellView textFieldCellView = this.binding.wannaDiscountUserPriceInput;
        textFieldCellView.setInputLabelText(priceInput.getInput().getPlaceholder());
        String value = priceInput.getInput().getValue();
        if (value == null) {
            value = "";
        }
        textFieldCellView.setInputText(value);
        String value2 = priceInput.getInput().getValue();
        if (value2 == null || value2.length() == 0) {
            this.viewModel.checkPrice("", priceInput, priceBlock, discounts);
        }
        textFieldCellView.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setLabelText(null);
    }

    private final void bindQuantityInput(WannaDiscountV2DTO.QuantityInputBlock quantityInput) {
        TextFieldCellView textFieldCellView = this.binding.wannaDiscountUserQuantityInput;
        if (quantityInput.getQuantityFieldDisabled()) {
            textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.READONLY);
            textFieldCellView.getMainView().setTextWatcher(null);
        } else {
            textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        }
        textFieldCellView.setInputLabelText(quantityInput.getInput().getPlaceholder());
        String value = quantityInput.getInput().getValue();
        if (value == null) {
            value = "";
        }
        textFieldCellView.setInputText(value);
        String value2 = quantityInput.getInput().getValue();
        if (value2 == null || value2.length() == 0) {
            this.viewModel.checkQuantity(null, quantityInput);
        }
        textFieldCellView.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setLabelText(null);
    }

    private final void bindSellerCell(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon sellerCell) {
        CellWithSubtitle40IconView cellWithSubtitle40IconView = this.binding.wannaDiscountSellerCell;
        Intrinsics.f(cellWithSubtitle40IconView);
        cellWithSubtitle40IconView.setVisibility(sellerCell != null ? 0 : 8);
        if (sellerCell == null) {
            return;
        }
        CellWithSubtitle40IconHolderKt.bind(cellWithSubtitle40IconView, sellerCell, this.actionHandler);
        Unit unit = Unit.f71690a;
        cellWithSubtitle40IconView.hideSeparator(true);
        cellWithSubtitle40IconView.getTitleTav().setStyleOrDefault(Integer.valueOf(R$style.TextStyle_Body_M));
        cellWithSubtitle40IconView.getSubtitleTav().setStyleOrDefault(Integer.valueOf(R$style.TextStyle_Body_L));
        Context context = cellWithSubtitle40IconView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseCellView.setTitleTextColor$default(cellWithSubtitle40IconView, ThemeExtKt.themeColor(context, R$attr.textSecondary), false, 2, null);
        Context context2 = cellWithSubtitle40IconView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        BaseCellWithSubtitleView.setSubtitleTextColor$default(cellWithSubtitle40IconView, ThemeExtKt.themeColor(context2, R$attr.textPrimary), false, 2, null);
        cellWithSubtitle40IconView.setBackgroundResource(R$drawable.bg_rounded_cell);
        cellWithSubtitle40IconView.alignActionViewCenterVertical();
        ImageViewExtKt.load$default(cellWithSubtitle40IconView.getIcon(), sellerCell.getIcon(), C7714v.a0(new ImageTransformation.RoundedCorners(this.cellIconCornerRadius, null, 2, null)), null, null, null, false, null, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSendButton(ButtonV3Atom.LargeButton sendButton, boolean isEnabled) {
        LargeButtonView largeButtonView = this.binding.wannaDiscountSendButton;
        Intrinsics.f(largeButtonView);
        LargeButtonHolderKt.bindOrGone(largeButtonView, sendButton, this.sendActionHandler);
        if (isEnabled) {
            ViewExtKt.enable(largeButtonView);
        } else {
            ViewExtKt.disable(largeButtonView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView, int i11) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.getAddonView().setContentDescription("");
        textFieldCellView.setLabelText(null);
        ViewGroup.LayoutParams layoutParams = textFieldCellView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        textFieldCellView.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView, String str, int i11, String str2) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.getAddonView().setContentDescription(str2);
        textFieldCellView.setLabelText(str);
        ViewGroup.LayoutParams layoutParams = textFieldCellView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        textFieldCellView.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().j());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message);
            int i11 = ru.ozon.app.android.uikit.R$drawable.ic_warning;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 56794, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(String message, Action action) {
        ViewGroup b11 = b.b(this.refs);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message);
            int i11 = ru.ozon.app.android.uikit.R$drawable.ic_check_green;
            FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, action, null, null, null, 6000L, null, null, this.refs.getContainer().g(), 56794, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePrice(WannaDiscountV2DTO.PriceInputBlock priceInput, String newPrice) {
        priceInput.getInput().setValue(newPrice);
        TextFieldCellView textFieldCellView = this.binding.wannaDiscountUserPriceInput;
        String value = priceInput.getInput().getValue();
        if (value == null) {
            value = "";
        }
        textFieldCellView.setInputText(value);
        hideError(textFieldCellView, 0);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        Dialog dialog;
        Window window;
        super.onAttach();
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        this.viewModel.getResultLiveData().observe(this, new WannaDiscountV2ViewHolder$sam$androidx_lifecycle_Observer$0(new WannaDiscountV2ViewHolder$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull WannaDiscountV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding = this.binding;
        TextAtomView wannaDiscountTitle = widgetWannaDiscountV2Binding.wannaDiscountTitle;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountTitle, "wannaDiscountTitle");
        TextAtomHolderKt.bind$default(wannaDiscountTitle, item.getTitle(), null, 2, null);
        TextAtomView wannaDiscountSubtitle = widgetWannaDiscountV2Binding.wannaDiscountSubtitle;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountSubtitle, "wannaDiscountSubtitle");
        TextAtomHolderKt.bind$default(wannaDiscountSubtitle, item.getSubtitle(), null, 2, null);
        bindInfoButton(item.getInfoButton());
        bindPriceBlock(item.getPriceBlock());
        bindDiscounts(item.getDiscounts());
        bindPriceInput(item.getPriceInput(), item.getPriceBlock(), item.getDiscounts());
        bindQuantityInput(item.getQuantityInput());
        bindSellerCell(item.getSeller());
        bindSendButton(item.getSendButton(), true);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
