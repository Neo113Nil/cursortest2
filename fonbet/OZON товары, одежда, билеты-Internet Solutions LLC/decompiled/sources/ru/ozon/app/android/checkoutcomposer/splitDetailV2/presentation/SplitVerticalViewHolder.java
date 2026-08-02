package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import Eb0.a;
import Sc.o;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.app.android.checkout.databinding.ItemSplitDetailVerticalBinding;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitVerticalViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0003¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020(2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0018\u00109\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitVerticalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/ItemSplitDetailVerticalBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/checkout/databinding/ItemSplitDetailVerticalBinding;Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "", "image", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "bindImage", "(Ljava/lang/String;LWZ/t;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "singleAtomView", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "bindSingleAtom", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "promoIconPosition", "bindPromoIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)V", "updateConstraints", "()V", "Landroid/view/View;", "anchorView", "updatePricePerItemConstraints", "(Landroid/view/View;)V", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "quantityControl", "bindQuantityControl", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;)V", "quantity", "", "newQuantity", "onChangeItemQuantity", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;I)V", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical;)V", "Lru/ozon/app/android/checkout/databinding/ItemSplitDetailVerticalBinding;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Landroidx/lifecycle/J;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical;", "Lxe/B0;", "changeQuantityJob", "Lxe/B0;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitVerticalViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSplitDetailVerticalBinding binding;
    private B0 changeQuantityJob;
    private SplitDetailV2VO.Split.Vertical currentItem;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitVerticalViewHolder$Companion;", "", "<init>", "()V", "NO_BREAK_SPACE", "", "NARROW_NO_BREAK_SPACE", "DECIMAL_FORMAT", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromoIconPosition.values().length];
            try {
                iArr[PromoIconPosition.BOTTOM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoIconPosition.BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoIconPosition.TOP_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoIconPosition.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplitVerticalViewHolder(@NotNull ItemSplitDetailVerticalBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.lifecycleOwner = lifecycleOwner;
    }

    private final void bindImage(String image, t event) {
        ShapeableImageView shapeableImageView = this.binding.productImageIV;
        Intrinsics.f(shapeableImageView);
        ImageViewExtKt.load$default(shapeableImageView, image, null, null, null, null, false, null, 126, null);
        Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(R$color.bg_light_key));
            ThemeExtKt.setParandjaForDarkTheme(shapeableImageView);
            Context context2 = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            shapeableImageView.setBackgroundTintList(ColorStateList.valueOf(ThemeExtKt.themeColor(context2, R$attr.layerOverlayParanja)));
        } else {
            shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(R$color.layer_overlay_paranja));
            shapeableImageView.setBackgroundTintList(null);
        }
        shapeableImageView.setOnClickListener(new a(2, event, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindImage$lambda$4$lambda$3(t tVar, SplitVerticalViewHolder splitVerticalViewHolder, View view) {
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(splitVerticalViewHolder.tokenizedAnalytics, tVar, null, 2, null);
        }
    }

    private final void bindPromoIcon(IconDTO promoIcon, PromoIconPosition promoIconPosition) {
        Pair pair;
        IconView iconView = this.binding.promoIconView;
        Intrinsics.f(iconView);
        IconHolderKt.bindOrGone$default(iconView, promoIcon, null, 2, null);
        if (promoIcon != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[promoIconPosition.ordinal()];
            if (i11 == 1) {
                pair = new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f));
            } else if (i11 == 2) {
                pair = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
            } else if (i11 == 3) {
                pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                pair = new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f));
            }
            float floatValue = ((Number) pair.a()).floatValue();
            float floatValue2 = ((Number) pair.b()).floatValue();
            ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41598E = floatValue;
            bVar.f41599F = floatValue2;
            iconView.setLayoutParams(bVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindQuantityControl(final SplitDetailV2VO.Split.Vertical.QuantityControl quantityControl) {
        QuantityInput quantityInput = this.binding.quantityEt;
        Intrinsics.f(quantityInput);
        ViewExtKt.show(quantityInput);
        String format = String.format(Locale.getDefault(), "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(quantityControl.getCurrent())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String X9 = h.X(format, " ", " ", false);
        quantityInput.setText(X9);
        quantityInput.setSelection(X9.length());
        AppCompatImageView appCompatImageView = this.binding.increaseQuantityBtn;
        Intrinsics.f(appCompatImageView);
        ViewExtKt.show(appCompatImageView);
        t incrementTokenizedEvent = quantityControl.getIncrementTokenizedEvent();
        if (incrementTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, incrementTokenizedEvent, null, 2, null);
        }
        appCompatImageView.setActivated(quantityControl.getMaximum() > quantityControl.getCurrent());
        appCompatImageView.setOnClickListener(new Qo.a(quantityControl, this, appCompatImageView, 0));
        final AppCompatImageView appCompatImageView2 = this.binding.decreaseQuantityBtn;
        Intrinsics.f(appCompatImageView2);
        ViewExtKt.show(appCompatImageView2);
        t decrementTokenizedEvent = quantityControl.getDecrementTokenizedEvent();
        if (decrementTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, decrementTokenizedEvent, null, 2, null);
        }
        appCompatImageView2.setActivated(quantityControl.getMinimum() < quantityControl.getCurrent());
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: Qo.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplitVerticalViewHolder.bindQuantityControl$lambda$19$lambda$18(SplitDetailV2VO.Split.Vertical.QuantityControl.this, this, appCompatImageView2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindQuantityControl$lambda$15$lambda$14(SplitDetailV2VO.Split.Vertical.QuantityControl quantityControl, SplitVerticalViewHolder splitVerticalViewHolder, AppCompatImageView appCompatImageView, View view) {
        t incrementTokenizedEvent = quantityControl.getIncrementTokenizedEvent();
        if (incrementTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(splitVerticalViewHolder.tokenizedAnalytics, incrementTokenizedEvent, null, 2, null);
        }
        int parseInt = Integer.parseInt(String.valueOf(splitVerticalViewHolder.binding.quantityEt.getText())) + 1;
        if (parseInt > quantityControl.getMaximum()) {
            appCompatImageView.setActivated(false);
            return;
        }
        if (parseInt == quantityControl.getMaximum()) {
            appCompatImageView.setActivated(false);
        }
        splitVerticalViewHolder.onChangeItemQuantity(quantityControl, parseInt);
        if (parseInt > quantityControl.getMinimum()) {
            splitVerticalViewHolder.binding.decreaseQuantityBtn.setActivated(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindQuantityControl$lambda$19$lambda$18(SplitDetailV2VO.Split.Vertical.QuantityControl quantityControl, SplitVerticalViewHolder splitVerticalViewHolder, AppCompatImageView appCompatImageView, View view) {
        t decrementTokenizedEvent = quantityControl.getDecrementTokenizedEvent();
        if (decrementTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(splitVerticalViewHolder.tokenizedAnalytics, decrementTokenizedEvent, null, 2, null);
        }
        int parseInt = Integer.parseInt(String.valueOf(splitVerticalViewHolder.binding.quantityEt.getText())) - 1;
        if (parseInt < quantityControl.getMinimum()) {
            appCompatImageView.setActivated(false);
            return;
        }
        if (parseInt == quantityControl.getMinimum()) {
            appCompatImageView.setActivated(false);
        }
        splitVerticalViewHolder.onChangeItemQuantity(quantityControl, parseInt);
        if (parseInt < quantityControl.getMaximum()) {
            splitVerticalViewHolder.binding.increaseQuantityBtn.setActivated(true);
        }
    }

    private final void bindSingleAtom(SingleAtom singleAtomView, AtomDTO atom) {
        if (atom != null) {
            if (singleAtomView.getVisibility() == 8) {
                ViewExtKt.show(singleAtomView);
            }
            SingleAtom.bind$default(singleAtomView, atom, false, 2, null);
            if (singleAtomView != null) {
                return;
            }
        }
        ViewExtKt.gone(singleAtomView);
        Unit unit = Unit.f71690a;
    }

    private final void onChangeItemQuantity(SplitDetailV2VO.Split.Vertical.QuantityControl quantity, int newQuantity) {
        this.binding.quantityEt.setText(String.valueOf(newQuantity));
        if (quantity.getAction() instanceof AtomAction.Click) {
            Map<String, String> params = ((AtomAction.Click) quantity.getAction()).getParams();
            LinkedHashMap u11 = params != null ? U.u(params) : null;
            if (u11 != null) {
            }
            Integer debounceDelay = quantity.getDebounceDelay();
            if (debounceDelay == null) {
                this.actionHandler.invoke(AtomAction.Click.copy$default((AtomAction.Click) quantity.getAction(), null, null, null, u11, null, null, 55, null));
                return;
            }
            int intValue = debounceDelay.intValue();
            B0 b02 = this.changeQuantityJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.changeQuantityJob = C10727i.c(K.a(this.lifecycleOwner), null, null, new SplitVerticalViewHolder$onChangeItemQuantity$1$1(intValue, this, quantity, u11, null), 3);
        }
    }

    private final void updateConstraints() {
        SingleAtom quantitySA = this.binding.quantitySA;
        Intrinsics.checkNotNullExpressionValue(quantitySA, "quantitySA");
        if (quantitySA.getVisibility() == 8) {
            SingleAtom pricePerItemSA = this.binding.pricePerItemSA;
            Intrinsics.checkNotNullExpressionValue(pricePerItemSA, "pricePerItemSA");
            if (pricePerItemSA.getVisibility() == 0) {
                ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
                d d11 = Tl.a.d(constraintLayout, "getRoot(...)", constraintLayout);
                ConstraintSetExtKt.startToStart$default(d11, this.binding.pricePerItemSA.getId(), this.binding.priceSA.getId(), 0, 4, null);
                ConstraintSetExtKt.topToBottom$default(d11, this.binding.annotationSA.getId(), this.binding.pricePerItemSA.getId(), 0, 4, null);
                d11.f(constraintLayout);
                return;
            }
        }
        SingleAtom quantitySA2 = this.binding.quantitySA;
        Intrinsics.checkNotNullExpressionValue(quantitySA2, "quantitySA");
        updatePricePerItemConstraints(quantitySA2);
    }

    private final void updatePricePerItemConstraints(View anchorView) {
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        d d11 = Tl.a.d(constraintLayout, "getRoot(...)", constraintLayout);
        ConstraintSetExtKt.topToTop$default(d11, this.binding.pricePerItemSA.getId(), anchorView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(d11, this.binding.pricePerItemSA.getId(), anchorView.getId(), 0, 4, null);
        d11.f(constraintLayout);
    }

    public final void bind(@NotNull SplitDetailV2VO.Split.Vertical item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindImage(item.getImage(), item.getTokenizedEvent());
        bindPromoIcon(item.getPromoIcon(), item.getPromoIconPosition());
        SingleAtom priceSA = this.binding.priceSA;
        Intrinsics.checkNotNullExpressionValue(priceSA, "priceSA");
        ContainerExtKt.bindOrGone$default(priceSA, item.getPrice(), false, 2, null);
        SingleAtom.bind$default(this.binding.descriptionSA, item.getDescription(), false, 2, null);
        SingleAtom premiumPriceSA = this.binding.premiumPriceSA;
        Intrinsics.checkNotNullExpressionValue(premiumPriceSA, "premiumPriceSA");
        bindSingleAtom(premiumPriceSA, item.getPremiumPrice());
        SingleAtom pricePerItemSA = this.binding.pricePerItemSA;
        Intrinsics.checkNotNullExpressionValue(pricePerItemSA, "pricePerItemSA");
        bindSingleAtom(pricePerItemSA, item.getPricePerItem());
        SingleAtom annotationSA = this.binding.annotationSA;
        Intrinsics.checkNotNullExpressionValue(annotationSA, "annotationSA");
        bindSingleAtom(annotationSA, item.getAnnotation());
        if (item.getQuantityControl() != null) {
            if (item.equals(this.currentItem)) {
                return;
            }
            this.currentItem = item;
            bindQuantityControl(item.getQuantityControl());
            AppCompatImageView increaseQuantityBtn = this.binding.increaseQuantityBtn;
            Intrinsics.checkNotNullExpressionValue(increaseQuantityBtn, "increaseQuantityBtn");
            updatePricePerItemConstraints(increaseQuantityBtn);
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
                return;
            }
            return;
        }
        QuantityInput quantityEt = this.binding.quantityEt;
        Intrinsics.checkNotNullExpressionValue(quantityEt, "quantityEt");
        ViewExtKt.gone(quantityEt);
        AppCompatImageView increaseQuantityBtn2 = this.binding.increaseQuantityBtn;
        Intrinsics.checkNotNullExpressionValue(increaseQuantityBtn2, "increaseQuantityBtn");
        ViewExtKt.gone(increaseQuantityBtn2);
        AppCompatImageView decreaseQuantityBtn = this.binding.decreaseQuantityBtn;
        Intrinsics.checkNotNullExpressionValue(decreaseQuantityBtn, "decreaseQuantityBtn");
        ViewExtKt.gone(decreaseQuantityBtn);
        SingleAtom quantitySA = this.binding.quantitySA;
        Intrinsics.checkNotNullExpressionValue(quantitySA, "quantitySA");
        bindSingleAtom(quantitySA, item.getQuantity());
        updateConstraints();
    }
}
