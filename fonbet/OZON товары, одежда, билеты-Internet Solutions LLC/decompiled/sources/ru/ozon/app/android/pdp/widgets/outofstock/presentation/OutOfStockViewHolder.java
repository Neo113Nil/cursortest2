package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import W10.c;
import WZ.t;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.PdpWidgetOutOfStockBinding;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010&\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\"\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0010018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetOutOfStockBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewModel;", "viewModel", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewModel;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "imageUrl", "", "bindImage", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "delivery", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;", "seller", "bindAtoms", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;)V", "", "isInCart", "bindCartButton", "(Z)V", "onAttach", "()V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class OutOfStockViewHolder extends BindingWidgetViewHolder<OutOfStockVO, PdpWidgetOutOfStockBinding> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final View containerView;
    private OutOfStockVO item;

    @NotNull
    private final ComposerReferences references;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetOutOfStockBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetOutOfStockBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetOutOfStockBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetOutOfStockBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetOutOfStockBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutOfStockViewHolder(@NotNull View containerView, @NotNull OutOfStockViewModel viewModel, @NotNull CartService cartService, @NotNull ComposerReferences references) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.cartService = cartService;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        binding(new OutOfStockViewHolder$2$1(this, references, viewModel));
    }

    private final void bindAtoms(Price price, TextDTO delivery, OutOfStockVO.SellerInfo seller) {
        binding(new OutOfStockViewHolder$bindAtoms$1(price, delivery, seller));
    }

    private final void bindCartButton(boolean isInCart) {
        binding(new OutOfStockViewHolder$bindCartButton$1(isInCart));
    }

    private final void bindImage(String imageUrl) {
        ImageView imageView = getBinding().imageIv;
        if (imageUrl != null) {
            Intrinsics.f(imageView);
            ImageViewExtKt.load$default(imageView, imageUrl, null, null, null, null, false, null, 126, null);
        } else {
            Intrinsics.f(imageView);
            ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt.setVectorDrawable(imageView, R$drawable.ic_m_no_photo);
        }
        ThemeExtKt.setParandjaForDarkTheme(imageView);
        ThemeExtKt.setBackgroundParanjaForDarkTheme(imageView);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        p<CartState> observeOn = this.cartService.observeCartState(true).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, this, new OutOfStockViewHolder$onAttach$1(this), new OutOfStockViewHolder$onAttach$2(Lm0.a.f17149a), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OutOfStockVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        bindImage(item.getImage());
        bindAtoms(item.getPrice(), item.getDeliveryInfo(), item.getSellerInfo());
        bindCartButton(item.getIsInCart());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OutOfStockVO item, @NotNull c trackingData, f viewedPond) {
        t widget;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        ComposerReferences composerReferences = this.references;
        OutOfStockVO.TrackingInfo trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null || (widget = trackingInfo.getWidget()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(composerReferences.getTokenizedAnalytics(), widget, null, 2, null);
    }
}
