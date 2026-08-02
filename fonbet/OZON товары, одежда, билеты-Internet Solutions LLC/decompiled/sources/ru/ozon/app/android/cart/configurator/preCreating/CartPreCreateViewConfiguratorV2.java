package ru.ozon.app.android.cart.configurator.preCreating;

import Tc.b;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import gk0.p;
import gk0.q;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.PreCreationClientViewPoolFlag;
import ru.ozon.uni.R$id;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/configurator/preCreating/CartPreCreateViewConfiguratorV2;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Landroidx/fragment/app/m;", "fragment", "", "preCreateViewsForFragment", "(Landroidx/fragment/app/m;)V", "", "cartSplitsCountOnFirstPage", "Landroid/content/Context;", "context", "", "Lgk0/p;", "buildPreCreateInfoList", "(ILandroid/content/Context;)Ljava/util/List;", "getBasePreCreateViews", "(Landroid/content/Context;)Ljava/util/List;", "getCartSpecificCountViews", "getCartCellViews", "getSwipeToDeleteViews", "onComposerInitialized", "()V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartPreCreateViewConfiguratorV2 extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/configurator/preCreating/CartPreCreateViewConfiguratorV2$Companion;", "", "<init>", "()V", "getCartClickTileCellInitIds", "", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Integer> getCartClickTileCellInitIds() {
            Integer[] elements = {Integer.valueOf(R$id.cell_center_title), Integer.valueOf(R$id.cell_center_subtitle), Integer.valueOf(R$id.cell_center_title)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }

    public CartPreCreateViewConfiguratorV2(@NotNull FeatureChecker featureChecker, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.featureChecker = featureChecker;
        this.cartService = cartService;
    }

    private final List<p> buildPreCreateInfoList(int cartSplitsCountOnFirstPage, Context context) {
        b builder = C7714v.B();
        builder.addAll(getBasePreCreateViews(context));
        if (cartSplitsCountOnFirstPage > 0) {
            builder.addAll(getCartSpecificCountViews(cartSplitsCountOnFirstPage, context));
            builder.addAll(getCartCellViews(context));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final List<p> getBasePreCreateViews(Context context) {
        return C7714v.b0(new p(2, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$1(context)), new p(6, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$2(context)), new p(1, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$3(context)), new p(1, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$4(context)), new p(1, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$5(context)), new p(1, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$6(context)), new p(1, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$7(context)), new p(1, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$8(context)), new p(4, new CartPreCreateViewConfiguratorV2$getBasePreCreateViews$9(context)));
    }

    private final List<p> getCartCellViews(Context context) {
        return C7714v.b0(new p(1, new CartPreCreateViewConfiguratorV2$getCartCellViews$1(context)), new p(1, new CartPreCreateViewConfiguratorV2$getCartCellViews$2(context)), new p(1, new CartPreCreateViewConfiguratorV2$getCartCellViews$3(context)));
    }

    private final List<p> getCartSpecificCountViews(int cartSplitsCountOnFirstPage, Context context) {
        return C7714v.p0(getSwipeToDeleteViews(cartSplitsCountOnFirstPage, context), C7714v.b0(new p(cartSplitsCountOnFirstPage * 2, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$1(context)), new p(2, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$2(context)), new p(2, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$3(context)), new p(1, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$4(context)), new p(cartSplitsCountOnFirstPage, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$5(context)), new p(cartSplitsCountOnFirstPage, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$6(context)), new p(cartSplitsCountOnFirstPage, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$7(context)), new p(cartSplitsCountOnFirstPage, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$8(context)), new p(cartSplitsCountOnFirstPage, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$9(context)), new p(cartSplitsCountOnFirstPage, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$10(context)), new p(cartSplitsCountOnFirstPage + 1, new CartPreCreateViewConfiguratorV2$getCartSpecificCountViews$11(context))));
    }

    private final List<p> getSwipeToDeleteViews(int cartSplitsCountOnFirstPage, Context context) {
        int i11 = cartSplitsCountOnFirstPage * 2;
        return C7714v.b0(new p(i11, new CartPreCreateViewConfiguratorV2$getSwipeToDeleteViews$1(context)), new p(i11, new CartPreCreateViewConfiguratorV2$getSwipeToDeleteViews$2(context)));
    }

    private final void preCreateViewsForFragment(ComponentCallbacksC5392m fragment) {
        int totalCount = this.cartService.getCartState().getTotalCount();
        if (totalCount > 3) {
            totalCount = 3;
        }
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        q qVar = q.f64554a;
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        String componentCallbacksC5392m = fragment.toString();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
        qVar.e(requireActivity, componentCallbacksC5392m, buildPreCreateInfoList(totalCount, requireContext));
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComponentCallbacksC5392m c11;
        if (!this.featureChecker.isEnabled(PreCreationClientViewPoolFlag.INSTANCE) || (c11 = getContainer().c()) == null) {
            return;
        }
        preCreateViewsForFragment(c11);
    }
}
