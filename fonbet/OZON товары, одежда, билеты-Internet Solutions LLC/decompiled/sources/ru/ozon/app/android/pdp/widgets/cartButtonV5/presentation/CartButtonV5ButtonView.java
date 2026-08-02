package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Lc.a;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.InterfaceC4008j;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$plurals;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButtonSubtitleLayoutTransition;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJc\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072(\u0010\u001c\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\rJ'\u0010%\u001a\u00020\u000b2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019H\u0002¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u00020'*\u00020'2\u0006\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010;R+\u0010?\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR/\u0010I\u001a\u0004\u0018\u00010C2\b\u0010<\u001a\u0004\u0018\u00010C8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR8\u0010\u001c\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010JR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010QR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010Q\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010Q\u001a\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "configuration", "", "isFirst", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;Z)V", "", "showLoader", "()V", "showSubtitleUpdateAnimation", "hideSubtitleUpdateAnimation", "hideLoader", "showTooltip", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "item", "withAnimationSubtitle", "withAnimationTitle", "isAsyncSubtitle", "keepSubtitleIfShown", "Lkotlin/Function2;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onTrackTooltip", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;ZLjava/lang/Boolean;ZZLkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "onClick", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "releaseClickListener", "event", "onCloseTooltip", "(Ljava/util/Map;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "iconRes", "setupSubtitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;)V", "removeSubtitle", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "isSubTitle", "hasIcon", "applyConstraints", "(ZZ)V", "vo", "appendQuant", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;)Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "button", "cleanupTitleGradient", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "Z", "<set-?>", "isTooltipVisible$delegate", "LS0/p0;", "isTooltipVisible", "()Z", "setTooltipVisible", "(Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "tooltipDto$delegate", "getTooltipDto", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "setTooltipDto", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;)V", "tooltipDto", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/widget/ImageView;", "icon$delegate", "LSc/j;", "getIcon", "()Landroid/widget/ImageView;", "icon", "subtitle$delegate", "getSubtitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "LSc/j;", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loader", "Landroidx/compose/ui/platform/ComposeView;", "tooltipComposeView$delegate", "getTooltipComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "tooltipComposeView", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonBackgroundBinder;", "backgroundBinder$delegate", "getBackgroundBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonBackgroundBinder;", "backgroundBinder", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class CartButtonV5ButtonView extends ConstraintLayout implements CartButtonV5View {

    /* renamed from: backgroundBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundBinder;

    @NotNull
    private final CartButtonV5Configuration configuration;
    private final boolean hasIcon;

    /* renamed from: icon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j icon;

    /* renamed from: isTooltipVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isTooltipVisible;

    @NotNull
    private final InterfaceC4008j<LoaderView> loader;
    private Function0<Unit> onClick;
    private Function2<? super Map<String, TokenizedTrackingInfo>, ? super Boolean, Unit> onTrackTooltip;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j subtitle;

    @NotNull
    private final TextAtomV2View title;

    /* renamed from: tooltipComposeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tooltipComposeView;

    /* renamed from: tooltipDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 tooltipDto;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ButtonView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Function0 function0 = CartButtonV5ButtonView.this.onClick;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonV5ButtonView(@NotNull Context context, @NotNull CartButtonV5Configuration configuration, boolean z11) {
        super(context);
        C3991w0 f7;
        C3991w0 f11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
        boolean z12 = (z11 && configuration.getIsIcon()) || (!z11 && configuration.getIsSecondIcon());
        this.hasIcon = z12;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.isTooltipVisible = f7;
        f11 = n1.f(null, D1.f25195a);
        this.tooltipDto = f11;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        a.d(textAtomV2View, R$id.cartButtonTitle, -2, -2, false);
        this.title = textAtomV2View;
        this.icon = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonView$icon$2(context));
        this.subtitle = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonView$subtitle$2(context));
        this.loader = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonView$loader$1(context, this));
        this.tooltipComposeView = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonView$tooltipComposeView$2(context, this));
        this.backgroundBinder = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonView$backgroundBinder$2(this));
        setId(R$id.cartBtnV5);
        Dimens dimens = Dimens.INSTANCE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, dimens.getDP_56());
        layoutParams.topMargin = configuration.getIsTeenMode() ? dimens.getDP_4() : dimens.getDP_8();
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        addView(textAtomV2View);
        if (z12) {
            addView(getIcon());
        }
        if (configuration.getIsSubTitle()) {
            addView(getSubtitle());
        }
        setPadding(dimens.getDP_8(), getPaddingTop(), dimens.getDP_8(), getPaddingBottom());
        applyConstraints(configuration.getIsSubTitle(), z12);
        ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new AnonymousClass2(), 1, null);
    }

    private final TextDTO appendQuant(TextDTO textDTO, CartButtonV5VO.CartButton cartButton) {
        Integer quantMultiplicityValue = cartButton.getQuantMultiplicityValue();
        if (quantMultiplicityValue != null || (quantMultiplicityValue = cartButton.getOtherQuantMultiplicityValue()) != null) {
            int intValue = quantMultiplicityValue.intValue();
            if (cartButton.getInCartQuantity() >= intValue) {
                int inCartQuantity = cartButton.getInCartQuantity() / intValue;
                OzonSpannableString text = textDTO.getText();
                return TextDTO.copy$default(textDTO, OzonSpannableStringKt.toOzonSpannableString(((Object) text) + " " + StringProvider.getQuantityString(R$plurals.pdp_cart_button_quant_count_plural_android, inCartQuantity, Integer.valueOf(inCartQuantity))), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            }
        }
        return textDTO;
    }

    private final void applyConstraints(boolean isSubTitle, boolean hasIcon) {
        d dVar = new d();
        dVar.p(this);
        if (isSubTitle) {
            dVar.F(0, 0, new int[]{this.title.getId(), getSubtitle().getId()}, null);
            if (hasIcon) {
                dVar.A(getSubtitle().getId(), 0);
                dVar.c0(0.0f, getSubtitle().getId());
                ConstraintSetExtKt.startToEnd$default(dVar, getSubtitle().getId(), getIcon().getId(), 0, 4, null);
            } else {
                ConstraintSetExtKt.startToStart$default(dVar, getSubtitle().getId(), 0, 0, 4, null);
            }
            ConstraintSetExtKt.endToEnd$default(dVar, getSubtitle().getId(), 0, 0, 4, null);
        } else {
            int id2 = this.title.getId();
            Dimens dimens = Dimens.INSTANCE;
            ConstraintSetExtKt.topToTop(dVar, id2, 0, dimens.getDP_8());
            ConstraintSetExtKt.bottomToBottom(dVar, this.title.getId(), 0, dimens.getDP_8());
        }
        if (hasIcon) {
            dVar.A(this.title.getId(), -2);
            dVar.C(this.title.getId(), true);
            ConstraintSetExtKt.startToStart$default(dVar, getIcon().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToStart$default(dVar, getIcon().getId(), this.title.getId(), 0, 4, null);
            ConstraintSetExtKt.topToTop$default(dVar, getIcon().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(dVar, getIcon().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.startToEnd(dVar, this.title.getId(), getIcon().getId(), Dimens.INSTANCE.getDP_8());
            ConstraintSetExtKt.endToEnd$default(dVar, this.title.getId(), 0, 0, 4, null);
            dVar.d0(getIcon().getId(), 2);
        } else {
            dVar.A(this.title.getId(), -2);
            ConstraintSetExtKt.startToStart$default(dVar, this.title.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(dVar, this.title.getId(), 0, 0, 4, null);
        }
        dVar.f(this);
    }

    private final void cleanupTitleGradient(CartButtonV5DTO.CartButton.Button button) {
        String textColor = button.getTitle().getTextColor();
        if ((textColor != null ? TokensExtKt.getGradientByToken(textColor) : null) != null || this.title.getTextGradient() == null) {
            return;
        }
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ButtonView$cleanupTitleGradient$2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                TextAtomV2View textAtomV2View;
                CartButtonV5ButtonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                textAtomV2View = CartButtonV5ButtonView.this.title;
                textAtomV2View.setTextGradient(null);
                return true;
            }
        });
    }

    private final CartButtonV5ButtonBackgroundBinder getBackgroundBinder() {
        return (CartButtonV5ButtonBackgroundBinder) this.backgroundBinder.getValue();
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.getValue();
    }

    private final TextAtomV2View getSubtitle() {
        return (TextAtomV2View) this.subtitle.getValue();
    }

    private final ComposeView getTooltipComposeView() {
        return (ComposeView) this.tooltipComposeView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final CartButtonV5DTO.CartButton.Button.Tooltip getTooltipDto() {
        return (CartButtonV5DTO.CartButton.Button.Tooltip) this.tooltipDto.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTooltipVisible() {
        return ((Boolean) this.isTooltipVisible.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCloseTooltip(Map<String, TokenizedTrackingInfo> event) {
        Function2<? super Map<String, TokenizedTrackingInfo>, ? super Boolean, Unit> function2;
        setTooltipVisible(false);
        if (event == null || (function2 = this.onTrackTooltip) == null) {
            return;
        }
        function2.invoke(event, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onCloseTooltip$default(CartButtonV5ButtonView cartButtonV5ButtonView, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = null;
        }
        cartButtonV5ButtonView.onCloseTooltip(map);
    }

    private final void removeSubtitle(Icon iconRes) {
        removeView(getSubtitle());
        applyConstraints(false, iconRes != null);
    }

    private final void setTooltipDto(CartButtonV5DTO.CartButton.Button.Tooltip tooltip) {
        this.tooltipDto.setValue(tooltip);
    }

    private final void setTooltipVisible(boolean z11) {
        this.isTooltipVisible.setValue(Boolean.valueOf(z11));
    }

    private final void setupSubtitle(TextDTO text, Icon iconRes) {
        if (indexOfChild(getSubtitle()) == -1) {
            addView(getSubtitle());
        }
        applyConstraints(true, iconRes != null);
        TextHolderKt.bind$default(getSubtitle(), text, null, 2, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void bind(@NotNull CartButtonV5VO.CartButton item, boolean withAnimationSubtitle, Boolean withAnimationTitle, boolean isAsyncSubtitle, boolean keepSubtitleIfShown, Function2<? super Map<String, TokenizedTrackingInfo>, ? super Boolean, Unit> onTrackTooltip) {
        Icon icon;
        CartButtonV5DTO.CartButton.Button inCart;
        CornerRadius cornerRadius;
        Intrinsics.checkNotNullParameter(item, "item");
        CartButtonV5DTO.CartButton.Button inCart2 = item.getIsInCart() ? item.getInCart() : item.getToCart();
        getBackgroundBinder().bind(inCart2 != null ? inCart2.getBackgroundColor() : null, (inCart2 == null || (cornerRadius = inCart2.getCornerRadius()) == null) ? 0.0f : UiExtKt.toPxF(cornerRadius.getPx()), inCart2 != null ? inCart2.getShowBorder() : false, inCart2 != null ? inCart2.getBorderColor() : null);
        if (withAnimationTitle != null) {
            if (withAnimationTitle.booleanValue()) {
                showLoader();
            } else {
                hideLoader();
            }
        } else if (this.loader.isInitialized()) {
            hideLoader();
        }
        if (withAnimationSubtitle) {
            showSubtitleUpdateAnimation();
        } else {
            hideSubtitleUpdateAnimation();
        }
        if (!item.getIsInCart() ? (icon = item.getToCart().getIcon()) == null || item.getToCart().isNonIcon() : (inCart = item.getInCart()) == null || (icon = inCart.getIcon()) == null || item.getInCart().isNonIcon()) {
            icon = null;
        }
        if (icon != null) {
            if (indexOfChild(getIcon()) == -1) {
                addView(getIcon());
            }
            ru.ozon.app.android.pdp.utils.ViewExtKt.bind$default(getIcon(), icon, null, 2, null);
        } else if (indexOfChild(getIcon()) != -1) {
            removeView(getIcon());
        }
        if (item.getIsInCart()) {
            CartButtonV5DTO.CartButton.Button inCart3 = item.getInCart();
            if (inCart3 != null) {
                cleanupTitleGradient(inCart3);
                TextHolderKt.bind$default(this.title, appendQuant(inCart3.getTitle(), item), null, 2, null);
                TextDTO animationSubtitle = inCart3.getAnimationSubtitle();
                if (animationSubtitle != null) {
                    setupSubtitle(animationSubtitle, icon);
                } else {
                    TextDTO subtitle = inCart3.getSubtitle();
                    if (subtitle == null) {
                        removeSubtitle(icon);
                    } else if (!withAnimationSubtitle && !isAsyncSubtitle) {
                        setupSubtitle(subtitle, icon);
                    } else if (isAsyncSubtitle && keepSubtitleIfShown && indexOfChild(getSubtitle()) != -1) {
                        applyConstraints(true, icon != null);
                    } else {
                        removeSubtitle(icon);
                    }
                }
                setTooltipDto(inCart3.getTooltip());
            }
        } else {
            TextHolderKt.bind$default(this.title, item.getToCart().getTitle(), null, 2, null);
            TextDTO animationSubtitle2 = item.getToCart().getAnimationSubtitle();
            if (animationSubtitle2 != null) {
                setupSubtitle(animationSubtitle2, icon);
            } else {
                TextDTO subtitle2 = item.getToCart().getSubtitle();
                if (subtitle2 == null) {
                    removeSubtitle(icon);
                } else if (!withAnimationSubtitle && !isAsyncSubtitle) {
                    setupSubtitle(subtitle2, icon);
                } else if (isAsyncSubtitle && keepSubtitleIfShown && indexOfChild(getSubtitle()) != -1) {
                    applyConstraints(true, icon != null);
                } else {
                    removeSubtitle(icon);
                }
            }
            setTooltipDto(item.getToCart().getTooltip());
        }
        this.onTrackTooltip = onTrackTooltip;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void hideLoader() {
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.loader.getValue());
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.title);
        if (this.hasIcon) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(getIcon());
        }
        if (this.configuration.getIsSubTitle()) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(getSubtitle());
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void hideSubtitleUpdateAnimation() {
        LayoutTransition layoutTransition = getLayoutTransition();
        if (layoutTransition == null || !layoutTransition.isRunning()) {
            setLayoutTransition(null);
        }
    }

    public final void releaseClickListener() {
        this.onClick = null;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void setOnClick(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
    }

    public void showLoader() {
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.title);
        if (this.hasIcon) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(getIcon());
        }
        if (this.configuration.getIsSubTitle()) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(getSubtitle());
        }
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.loader.getValue());
    }

    public void showSubtitleUpdateAnimation() {
        setLayoutTransition(new CartButtonSubtitleLayoutTransition(600L, CartButtonV5ButtonView$showSubtitleUpdateAnimation$1.INSTANCE));
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void showTooltip() {
        TooltipDTO tooltip;
        if (indexOfChild(getTooltipComposeView()) == -1) {
            addView(getTooltipComposeView());
        }
        setTooltipVisible(true);
        CartButtonV5DTO.CartButton.Button.Tooltip tooltipDto = getTooltipDto();
        Map<String, TokenizedTrackingInfo> trackingInfo = (tooltipDto == null || (tooltip = tooltipDto.getTooltip()) == null) ? null : tooltip.getTrackingInfo();
        Function2<? super Map<String, TokenizedTrackingInfo>, ? super Boolean, Unit> function2 = this.onTrackTooltip;
        if (function2 != null) {
            function2.invoke(trackingInfo, Boolean.TRUE);
        }
    }
}
