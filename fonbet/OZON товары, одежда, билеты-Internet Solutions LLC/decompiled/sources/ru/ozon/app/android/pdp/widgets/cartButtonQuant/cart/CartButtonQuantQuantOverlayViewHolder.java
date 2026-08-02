package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.HapticsActionEnabledFlag;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.loader.CartButtonQuantLoaderFactory;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartButtonQuantQuantOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/loader/CartButtonQuantLoaderFactory;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewBinder;", "binder", "", "hasShadow", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewBinder;ZLru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/content/Context;", "context", "Landroid/view/View;", "createSeparator", "(Landroid/content/Context;)Landroid/view/View;", "isShowing", "Landroid/view/ViewGroup;", "composerRootView", "", "onShowLoader", "(ZLandroid/view/ViewGroup;)V", "addView", "()V", "removeView", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;)V", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewBinder;", "Landroid/widget/LinearLayout;", "parent", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantQuantView;", "cartView", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantQuantView;", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "separatorView", "Landroid/view/View;", "metricView", "getMetricView", "()Landroid/view/View;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantQuantOverlayViewHolder extends AbstractC6065b<CartQuantVO> implements CartButtonQuantLoaderFactory {

    @NotNull
    private final CartQuantViewBinder binder;

    @NotNull
    private final CartQuantQuantView cartView;

    @NotNull
    private final i container;
    private LoaderView loaderView;

    @NotNull
    private final View metricView;

    @NotNull
    private final LinearLayout parent;
    private View separatorView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartButtonQuantQuantOverlayViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<CartQuantVO> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CartQuantVO invoke() {
            CartQuantVO boundData = CartButtonQuantQuantOverlayViewHolder.this.getBoundData();
            if (boundData != null) {
                return boundData;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartButtonQuantQuantOverlayViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            CartButtonQuantQuantOverlayViewHolder cartButtonQuantQuantOverlayViewHolder = CartButtonQuantQuantOverlayViewHolder.this;
            cartButtonQuantQuantOverlayViewHolder.onShowLoader(z11, cartButtonQuantQuantOverlayViewHolder.parent);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartButtonQuantQuantOverlayViewHolder$Companion;", "", "<init>", "()V", "LOADER_NOT_SHOWING_ALPHA", "", "LOADER_SHOWING_ALPHA", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartButtonQuantQuantOverlayViewHolder(@NotNull i container, @NotNull CartQuantViewBinder binder, boolean z11, @NotNull FeatureChecker featureChecker) {
        View view;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.container = container;
        this.binder = binder;
        this.parent = C10183a.c(container.Y());
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        CartQuantQuantView cartQuantQuantView = new CartQuantQuantView(L11, null, 0, featureChecker.isEnabled(HapticsActionEnabledFlag.INSTANCE), 6, null);
        this.cartView = cartQuantQuantView;
        if (z11) {
            Context L12 = container.L();
            Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
            view = createSeparator(L12);
        } else {
            view = null;
        }
        this.separatorView = view;
        this.metricView = cartQuantQuantView;
        binder.onContainerInitialized(cartQuantQuantView, new AnonymousClass1(), container, this, new AnonymousClass2());
    }

    private final View createSeparator(Context context) {
        View view = new View(context);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, Dimens.INSTANCE.getDP_1()));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowLoader(boolean isShowing, ViewGroup composerRootView) {
        if (this.loaderView == null) {
            LoaderView createLoader = createLoader(composerRootView);
            this.loaderView = createLoader;
            this.parent.addView(createLoader, 0);
        }
        LoaderView loaderView = this.loaderView;
        if (loaderView != null) {
            loaderView.setVisibility(isShowing ? 0 : 8);
        }
        this.cartView.setAlpha(isShowing ? 0.4f : 1.0f);
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        super.addView();
        this.parent.addView(this.cartView);
    }

    @NotNull
    public LoaderView createLoader(@NotNull ViewGroup viewGroup) {
        return CartButtonQuantLoaderFactory.DefaultImpls.createLoader(this, viewGroup);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        super.removeView();
        this.parent.removeView(this.cartView);
        this.parent.removeView(this.separatorView);
        this.parent.removeView(this.loaderView);
        this.separatorView = null;
        this.loaderView = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CartQuantVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binder.onBind(this.cartView, item, this.container);
    }
}
