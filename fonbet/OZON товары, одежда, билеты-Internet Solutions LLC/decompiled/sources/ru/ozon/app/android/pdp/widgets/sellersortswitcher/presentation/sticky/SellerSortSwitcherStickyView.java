package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.databinding.WidgetSellerSortSwitcherStickyBinding;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.SellerSortSwitcherVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u0013J\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010 \u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyView;", "", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "", "", "onVisibilityChanged", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;", "item", "bindImage", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;)V", "bindText", "bindVisibility", "show", "()V", "hide", "attachView", "detachView", "addScrollListener", "removeScrollListener", "registerUiWidgetPositionWatcher", "unregisterUiWidgetPositionWatcher", "", "findSellerSortSwitcherUiPosition", "()Ljava/lang/Integer;", "setup", ProductAction.ACTION_REMOVE, "bind", "Landroid/view/ViewGroup;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "getOnVisibilityChanged", "()Lkotlin/jvm/functions/Function1;", "setOnVisibilityChanged", "(Lkotlin/jvm/functions/Function1;)V", "dp4", "I", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyListener;", "scrollListener", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyListener;", "isShown", "Z", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyPostitionWatcher;", "uiWidgetPositionWatcher", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyPostitionWatcher;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyAnimator;", "animator", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyAnimator;", "Lru/ozon/app/android/pdp/databinding/WidgetSellerSortSwitcherStickyBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetSellerSortSwitcherStickyBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherStickyView {

    @NotNull
    private final SellerSortSwitcherStickyAnimator animator;

    @NotNull
    private final WidgetSellerSortSwitcherStickyBinding binding;

    @NotNull
    private final View containerView;
    private final int dp4;
    private boolean isShown;

    @NotNull
    private Function1<? super Boolean, Unit> onVisibilityChanged;

    @NotNull
    private final ViewGroup parent;
    private SellerSortSwitcherStickyListener scrollListener;
    private SellerSortSwitcherStickyPostitionWatcher uiWidgetPositionWatcher;

    public SellerSortSwitcherStickyView(@NotNull ViewGroup parent, @NotNull View containerView, @NotNull Function1<? super Boolean, Unit> onVisibilityChanged) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onVisibilityChanged, "onVisibilityChanged");
        this.parent = parent;
        this.containerView = containerView;
        this.onVisibilityChanged = onVisibilityChanged;
        this.dp4 = ResourceExtKt.toPx(4);
        this.animator = new SellerSortSwitcherStickyAnimator(getContainerView(), ComposerViewExtensionKt.composerAppbar(parent));
        WidgetSellerSortSwitcherStickyBinding bind = WidgetSellerSortSwitcherStickyBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void addScrollListener() {
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(this.parent);
        RecyclerView.o layoutManager = composerRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        SellerSortSwitcherStickyListener sellerSortSwitcherStickyListener = new SellerSortSwitcherStickyListener(linearLayoutManager, new SellerSortSwitcherStickyView$addScrollListener$scrollListener$1(new SellerSortSwitcherStickyHelper(composerRecyclerView)), new SellerSortSwitcherStickyView$addScrollListener$scrollListener$2(this.onVisibilityChanged));
        composerRecyclerView.addOnScrollListener(sellerSortSwitcherStickyListener);
        this.scrollListener = sellerSortSwitcherStickyListener;
    }

    private final void attachView() {
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(this.parent);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.addView(getContainerView());
        }
    }

    private final void bindImage(SellerSortSwitcherStickyVO item) {
        ImageView imageView = this.binding.sellerSortSwitcherStickyIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, item.getImageUrl(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(this.dp4, null, 2, null)), null, null, null, false, null, 124, null);
        ThemeExtKt.setParandjaForDarkTheme(imageView);
    }

    private final void bindText(SellerSortSwitcherStickyVO item) {
        this.binding.sellerSortSwitcherStickyTv.setText(item.getText());
    }

    private final void bindVisibility(SellerSortSwitcherStickyVO item) {
        if (item.getIsStickyVisible()) {
            show();
        } else {
            hide();
        }
    }

    private final void detachView() {
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(this.parent);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.removeView(getContainerView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer findSellerSortSwitcherUiPosition() {
        Object adapter = ComposerViewExtensionKt.composerRecyclerView(this.parent).getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar != null) {
            return lVar.c(SellerSortSwitcherVO.class);
        }
        return null;
    }

    private final void hide() {
        if (this.isShown) {
            this.animator.hide();
            this.isShown = false;
        }
    }

    private final void registerUiWidgetPositionWatcher() {
        RecyclerView.g adapter = ComposerViewExtensionKt.composerRecyclerView(this.parent).getAdapter();
        if (adapter == null) {
            return;
        }
        SellerSortSwitcherStickyPostitionWatcher sellerSortSwitcherStickyPostitionWatcher = new SellerSortSwitcherStickyPostitionWatcher(new SellerSortSwitcherStickyView$registerUiWidgetPositionWatcher$watcher$1(this), new SellerSortSwitcherStickyView$registerUiWidgetPositionWatcher$watcher$2(this));
        adapter.registerAdapterDataObserver(sellerSortSwitcherStickyPostitionWatcher);
        this.uiWidgetPositionWatcher = sellerSortSwitcherStickyPostitionWatcher;
        sellerSortSwitcherStickyPostitionWatcher.performCheck();
    }

    private final void removeScrollListener() {
        SellerSortSwitcherStickyListener sellerSortSwitcherStickyListener = this.scrollListener;
        if (sellerSortSwitcherStickyListener == null) {
            return;
        }
        ComposerViewExtensionKt.composerRecyclerView(this.parent).removeOnScrollListener(sellerSortSwitcherStickyListener);
        this.scrollListener = null;
    }

    private final void show() {
        if (this.isShown) {
            return;
        }
        this.animator.show();
        this.isShown = true;
    }

    private final void unregisterUiWidgetPositionWatcher() {
        SellerSortSwitcherStickyPostitionWatcher sellerSortSwitcherStickyPostitionWatcher = this.uiWidgetPositionWatcher;
        if (sellerSortSwitcherStickyPostitionWatcher == null) {
            return;
        }
        RecyclerView.g adapter = ComposerViewExtensionKt.composerRecyclerView(this.parent).getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(sellerSortSwitcherStickyPostitionWatcher);
        }
        this.uiWidgetPositionWatcher = null;
    }

    public final void bind(@NotNull SellerSortSwitcherStickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindImage(item);
        bindText(item);
        bindVisibility(item);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public final void remove() {
        removeScrollListener();
        detachView();
        unregisterUiWidgetPositionWatcher();
    }

    public final void setup() {
        attachView();
        addScrollListener();
        registerUiWidgetPositionWatcher();
    }
}
