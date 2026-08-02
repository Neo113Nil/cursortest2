package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import AF.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import ay.ViewOnClickListenerC5491a;
import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import vc.l;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ1\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010#J/\u0010$\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/utils/AppType;)V", "", "observeCartState", "()V", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "applyCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/widget/ImageView;", "button", "updateCartButtonSelectMode", "(Landroid/graphics/drawable/GradientDrawable;Landroid/widget/ImageView;)V", "updateCartButtonBOMode", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "atom", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "action", "", "widgetId", "onAddToCart", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;Ljava/lang/Long;)V", "unbind", "Landroidx/appcompat/widget/AppCompatImageButton;", "view", "LWZ/l;", "analytics", "bindOrGone", "(Landroidx/appcompat/widget/AppCompatImageButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;LWZ/l;Ljava/lang/Long;)V", "bind", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/utils/AppType;", "Lnc/a;", "disposables", "Lnc/a;", "cartButtonView", "Landroidx/appcompat/widget/AppCompatImageButton;", "", "productId", "Ljava/lang/String;", "", "inCart", "Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryV2ProductButtonBinder {

    @NotNull
    private final AppType appType;
    private AppCompatImageButton cartButtonView;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final C8486a disposables;
    private boolean inCart;
    private String productId;

    public ReviewGalleryV2ProductButtonBinder(@NotNull CartService cartService, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.cartService = cartService;
        this.appType = appType;
        this.disposables = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCartState(CartState cartState) {
        Long y02;
        String str = this.productId;
        if (str == null || (y02 = h.y0(str)) == null) {
            return;
        }
        boolean hasProduct = cartState.hasProduct(y02.longValue());
        this.inCart = hasProduct;
        AppCompatImageButton appCompatImageButton = this.cartButtonView;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription("addToCartBtn_" + hasProduct);
            Drawable background = appCompatImageButton.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                if (this.appType == AppType.SELECT) {
                    updateCartButtonSelectMode(gradientDrawable, appCompatImageButton);
                } else {
                    updateCartButtonBOMode(gradientDrawable, appCompatImageButton);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButtonImage, ReviewGalleryV2ProductButtonBinder reviewGalleryV2ProductButtonBinder, Long l11, View view) {
        ButtonV3Atom.AddToCartAtom.Action action = addToCartButtonImage.getAction();
        if (action != null) {
            reviewGalleryV2ProductButtonBinder.onAddToCart(addToCartButtonImage, action, l11);
        }
    }

    private final void observeCartState() {
        C8486a c8486a = this.disposables;
        InterfaceC8487b subscribe = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).observeOn(C8125a.a()).subscribe(new AF.a(new ReviewGalleryV2ProductButtonBinder$observeCartState$1(this), 7), new b(new ReviewGalleryV2ProductButtonBinder$observeCartState$2(Lm0.a.f17149a), 6));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    private final void onAddToCart(ButtonV3Atom.AddToCartAtom.AddToCartButtonImage atom, ButtonV3Atom.AddToCartAtom.Action action, Long widgetId) {
        C8486a c8486a;
        InterfaceC8487b subscribeBy$default;
        Integer quantity = action.getQuantity();
        int intValue = quantity != null ? quantity.intValue() : 1;
        C8486a c8486a2 = this.disposables;
        if (this.inCart) {
            c8486a = c8486a2;
            CartService cartService = this.cartService;
            String id2 = action.getId();
            Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
            ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
            AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService, id2, intValue, action2 != null ? action2.getSelectedDeliverySchema() : null, trackingInfo, widgetId, null, null, 96, null);
            x a11 = C8125a.a();
            removeProductFromCart$default.getClass();
            l lVar = new l(removeProductFromCart$default, a11);
            Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
            subscribeBy$default = RxExtKt.subscribeBy$default(lVar, null, new ReviewGalleryV2ProductButtonBinder$onAddToCart$2(Lm0.a.f17149a), 1, null);
        } else {
            CartService cartService2 = this.cartService;
            String id3 = action.getId();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = atom.getTrackingInfo();
            ButtonV3Atom.AddToCartAtom.Action action3 = atom.getAction();
            c8486a = c8486a2;
            AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService2, id3, intValue, action3 != null ? action3.getSelectedDeliverySchema() : null, trackingInfo2, widgetId, null, null, null, null, null, 992, null);
            x a12 = C8125a.a();
            addProductToCart$default.getClass();
            l lVar2 = new l(addProductToCart$default, a12);
            Intrinsics.checkNotNullExpressionValue(lVar2, "observeOn(...)");
            subscribeBy$default = RxExtKt.subscribeBy$default(lVar2, null, new ReviewGalleryV2ProductButtonBinder$onAddToCart$1(Lm0.a.f17149a), 1, null);
        }
        RxExtKt.plusAssign(c8486a, subscribeBy$default);
    }

    private final void updateCartButtonBOMode(GradientDrawable gradientDrawable, ImageView imageView) {
        imageView.setImageResource(R$drawable.ic_s_grocery_cart_filled);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicLightKey)));
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context2, this.inCart ? R$attr.bgPositivePrimary : R$attr.bgActionPrimary));
    }

    private final void updateCartButtonSelectMode(GradientDrawable gradientDrawable, ImageView imageView) {
        if (this.inCart) {
            imageView.setImageResource(R$drawable.ic_s_check_filled);
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicActionOnDark)));
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gradientDrawable.setColor(ThemeExtKt.themeColor(context2, R$attr.clearLightKey200));
            return;
        }
        imageView.setImageResource(R$drawable.ic_s_grocery_cart_filled);
        Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context3, R$attr.graphicActionOnLight)));
        Context context4 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context4, R$attr.bgLightKey));
    }

    public final void bind(@NotNull AppCompatImageButton view, @NotNull ButtonV3Atom.AddToCartAtom.AddToCartButtonImage atom, @NotNull WZ.l analytics, Long widgetId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        ButtonV3Atom.AddToCartAtom.Action action = atom.getAction();
        this.productId = action != null ? action.getId() : null;
        this.cartButtonView = view;
        view.setOnClickListener(new ViewOnClickListenerC5491a(atom, this, widgetId, 1));
        observeCartState();
        this.cartService.attach(analytics);
    }

    public final void bindOrGone(@NotNull AppCompatImageButton view, ButtonV3Atom.AddToCartAtom.AddToCartButtonImage atom, @NotNull WZ.l analytics, Long widgetId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (atom == null) {
            ViewExtKt.gone(view);
        } else {
            ViewExtKt.show(view);
            bind(view, atom, analytics, widgetId);
        }
    }

    public final void unbind() {
        this.disposables.d();
        this.cartButtonView = null;
        this.productId = null;
    }
}
