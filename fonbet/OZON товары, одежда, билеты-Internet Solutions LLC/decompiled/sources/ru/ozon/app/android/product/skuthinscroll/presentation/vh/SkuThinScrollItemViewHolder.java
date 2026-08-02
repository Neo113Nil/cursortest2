package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import Al.ViewOnClickListenerC2437a;
import Sc.InterfaceC4008j;
import U7.d;
import WZ.l;
import WZ.m;
import WZ.t;
import X4.a;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollItemDTO;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 ]*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001]Bu\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u001eJ\u001b\u0010'\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010\u0019R\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001c\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R(\u00101\u001a\u0004\u0018\u00010\u00102\b\u00100\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder;", "LX4/a;", "VB", "Ljk0/j;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate;", "cartButtonDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "adultDelegate", "onTryToPreloadPdpVideo", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LX4/a;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "onRecycle", "()V", "onAttach", "onViewInVisibleBounds", "item", "bind", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;)V", "", "isInCart", "disabled", "bindButton", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;ZZ)V", "bindIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "isDisabled", "setDisabledIfNeeded", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Z)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "stopJob", "LX4/a;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "LWZ/l;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "boundItem", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "getBoundItem", "()Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "Lxe/B0;", "job", "Lxe/B0;", "", "borderStrokeWidth$delegate", "LSc/j;", "getBorderStrokeWidth", "()I", "borderStrokeWidth", "", "borderRadius$delegate", "getBorderRadius", "()F", "borderRadius", "Landroid/graphics/drawable/GradientDrawable;", "border$delegate", "getBorder", "()Landroid/graphics/drawable/GradientDrawable;", "border", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "adapter$delegate", "getAdapter", "()Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", "getStateElementsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "stateElementsRv", "Landroid/view/View;", "getStateElementsView", "()Landroid/view/View;", "stateElementsView", "Lru/ozon/uni/android/atom/icon/IconView;", "getIconIv", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconIv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getButtonIconIbv", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonIconIbv", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SkuThinScrollItemViewHolder<VB extends X4.a> extends j {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;
    private final AdultDelegate<SkuThinScrollVO.ItemVO> adultDelegate;

    @NotNull
    private final VB binding;

    /* renamed from: border$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j border;

    /* renamed from: borderRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j borderRadius;

    /* renamed from: borderStrokeWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j borderStrokeWidth;
    private SkuThinScrollVO.ItemVO boundItem;
    private final CartButtonDelegate cartButtonDelegate;
    private B0 job;
    private final Function1<AtomAction, Unit> onTryToPreloadPdpVideo;

    @NotNull
    private final ComposerReferences refs;
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel$Result;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel$Result;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AddToCartViewModel.Result, Unit> {
        final /* synthetic */ SkuThinScrollItemViewHolder<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder) {
            super(1);
            this.this$0 = skuThinScrollItemViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddToCartViewModel.Result result) {
            invoke2(result);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AddToCartViewModel.Result result) {
            IconButtonV3DTO button;
            CommonControlSettings common;
            AtomActionDTO action;
            SkuThinScrollVO.ItemVO boundItem = this.this$0.getBoundItem();
            if (Intrinsics.d((boundItem == null || (button = boundItem.getButton()) == null || (common = button.getCommon()) == null || (action = common.getAction()) == null) ? null : action.getParams(), result.getActionParams())) {
                this.this$0.getButtonIconIbv().setVisibility(!result.getInProgress() ? 0 : 8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder$Companion;", "", "<init>", "()V", "LOCATOR_BUTTON_IN_CART", "", "LOCATOR_BUTTON_NO_CART", "LOCATOR_ICON_REGULAR", "LOCATOR_ICON_BLUR", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SkuThinScrollItemViewHolder(@NotNull VB binding, @NotNull ComposerReferences refs, AddToCartViewModel addToCartViewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, CartButtonDelegate cartButtonDelegate, AdultDelegate<SkuThinScrollVO.ItemVO> adultDelegate, Function1<? super AtomAction, Unit> function1, l lVar) {
        super(r0);
        P<AddToCartViewModel.Result> state;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        View constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.actionHandler = actionHandler;
        this.cartButtonDelegate = cartButtonDelegate;
        this.adultDelegate = adultDelegate;
        this.onTryToPreloadPdpVideo = function1;
        this.tokenizedAnalytics = lVar;
        this.borderStrokeWidth = LazyUtilsKt.unsafeLazy(SkuThinScrollItemViewHolder$borderStrokeWidth$2.INSTANCE);
        this.borderRadius = LazyUtilsKt.unsafeLazy(SkuThinScrollItemViewHolder$borderRadius$2.INSTANCE);
        this.border = LazyUtilsKt.unsafeLazy(new SkuThinScrollItemViewHolder$border$2(this));
        this.adapter = LazyUtilsKt.unsafeLazy(new SkuThinScrollItemViewHolder$adapter$2(this));
        binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC2437a(this, 1));
        if (addToCartViewModel == null || (state = addToCartViewModel.getState()) == null) {
            return;
        }
        state.observe(refs.getContainer().g(), new SkuThinScrollItemViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SkuThinScrollItemViewHolder skuThinScrollItemViewHolder, View view) {
        AtomAction action;
        SkuThinScrollVO.ItemVO itemVO = skuThinScrollItemViewHolder.boundItem;
        if (itemVO == null || (action = itemVO.getAction()) == null) {
            return;
        }
        Function1<AtomAction, Unit> function1 = skuThinScrollItemViewHolder.onTryToPreloadPdpVideo;
        if (function1 != null) {
            function1.invoke(action);
        }
        skuThinScrollItemViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(SkuThinScrollVO.ItemVO item, boolean isInCart, boolean disabled) {
        SkuThinScrollItemDTO.AddToCartButton addToCartButton = item.getAddToCartButton();
        if (addToCartButton == null) {
            IconButtonV3HolderKt.bindOrGone(getButtonIconIbv(), item.getButton(), this.actionHandler);
            return;
        }
        getButtonIconIbv().setContentDescription(isInCart ? "button_in_cart" : "button_no_cart");
        if (isInCart) {
            IconButtonV3HolderKt.bindOrGone(getButtonIconIbv(), addToCartButton.getRemoveFromCart(), this.actionHandler);
        } else {
            IconButtonV3HolderKt.bindOrGone(getButtonIconIbv(), setDisabledIfNeeded(addToCartButton.getAddToCart(), disabled), this.actionHandler);
        }
    }

    static /* synthetic */ void bindButton$default(SkuThinScrollItemViewHolder skuThinScrollItemViewHolder, SkuThinScrollVO.ItemVO itemVO, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindButton");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        skuThinScrollItemViewHolder.bindButton(itemVO, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindIcon(SkuThinScrollVO.ItemVO item) {
        getIconIv().setContentDescription(item.getShouldBlur() ? "icon_blur" : "icon");
        if (item.getShouldBlur()) {
            ViewExtKt.show(getIconIv());
            IconHolderKt.bindOrGone$default(getIconIv(), item.getBlurPlaceholderImage(), null, 2, null);
        } else {
            getIconIv().setVisibility(item.getIcon() == null ? 8 : 0);
            IconHolderKt.bindOrGone$default(getIconIv(), item.getIcon(), null, 2, null);
        }
    }

    private final TileContentItemsAdapter getAdapter() {
        return (TileContentItemsAdapter) this.adapter.getValue();
    }

    private final GradientDrawable getBorder() {
        return (GradientDrawable) this.border.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getBorderRadius() {
        return ((Number) this.borderRadius.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBorderStrokeWidth() {
        return ((Number) this.borderStrokeWidth.getValue()).intValue();
    }

    private final IconButtonV3DTO setDisabledIfNeeded(IconButtonV3DTO iconButtonV3DTO, boolean z11) {
        return Intrinsics.d(iconButtonV3DTO.isDisabled(), Boolean.valueOf(z11)) ? iconButtonV3DTO : IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.valueOf(z11), null, null, null, null, null, null, null, null, null, 16367, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopJob() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    public void bind(@NotNull SkuThinScrollVO.ItemVO item) {
        SkuThinScrollVO.ItemVO itemVO;
        IconButtonV3DTO addToCart;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        View view = this.itemView;
        GradientDrawable border = getBorder();
        if (!item.getShowBorder()) {
            border = null;
        }
        view.setBackground(border);
        getAdapter().submitList(item.getStateElements());
        CartButtonDelegate cartButtonDelegate = this.cartButtonDelegate;
        if (cartButtonDelegate != null) {
            Long productId = item.getProductId();
            SkuThinScrollItemDTO.AddToCartButton addToCartButton = item.getAddToCartButton();
            cartButtonDelegate.bindProductInfo(productId, (addToCartButton == null || (addToCart = addToCartButton.getAddToCart()) == null || (common = addToCart.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("selectedDeliverySchema")) == null) ? null : h.y0(str));
        }
        SkuThinScrollVO.ItemVO itemVO2 = this.boundItem;
        if (!Intrinsics.d(itemVO2 != null ? itemVO2.getIcon() : null, item.getIcon()) || (itemVO = this.boundItem) == null || itemVO.getShouldBlur() != item.getShouldBlur()) {
            bindIcon(item);
        }
        this.boundItem = item;
        CartButtonDelegate cartButtonDelegate2 = this.cartButtonDelegate;
        bindButton$default(this, item, cartButtonDelegate2 != null ? cartButtonDelegate2.isProductInCart(item.getProductId()) : false, false, 4, null);
        AdultDelegate<SkuThinScrollVO.ItemVO> adultDelegate = this.adultDelegate;
        if (adultDelegate != null) {
            adultDelegate.bindItem(item);
        }
    }

    public final SkuThinScrollVO.ItemVO getBoundItem() {
        return this.boundItem;
    }

    @NotNull
    public abstract IconButtonV3View getButtonIconIbv();

    @NotNull
    public abstract IconView getIconIv();

    @NotNull
    public abstract RecyclerView getStateElementsRv();

    @NotNull
    public abstract View getStateElementsView();

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        d.c(this.refs).a(new SkuThinScrollItemViewHolder$onAttach$1(this));
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        CartButtonDelegate cartButtonDelegate = this.cartButtonDelegate;
        if (cartButtonDelegate != null) {
            cartButtonDelegate.clear();
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        l lVar;
        super.onViewInVisibleBounds();
        SkuThinScrollVO.ItemVO itemVO = this.boundItem;
        if (itemVO == null || (tokenizedEvent = itemVO.getTokenizedEvent()) == null || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        m.c(lVar, tokenizedEvent, null);
    }
}
