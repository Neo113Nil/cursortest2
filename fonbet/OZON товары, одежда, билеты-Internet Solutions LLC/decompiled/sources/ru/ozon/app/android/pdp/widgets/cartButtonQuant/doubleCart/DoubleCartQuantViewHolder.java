package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import Sc.InterfaceC4008j;
import Sc.k;
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
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.loader.CartButtonQuantLoaderFactory;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001DB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/loader/CartButtonQuantLoaderFactory;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewBinder;", "binder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "mode", "", "hasShadow", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewBinder;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "vo", "", "bindBinder", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)V", "createAndBind", "isShowing", "Landroid/view/ViewGroup;", "composerRootView", "onShowLoader", "(ZLandroid/view/ViewGroup;)V", "view", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "addView", "()V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)V", "removeView", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewBinder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroid/widget/LinearLayout;", "bottomContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewImpl;", "doubleCartView$delegate", "LSc/j;", "getDoubleCartView", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewImpl;", "doubleCartView", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleInCartQuantViewImpl;", "doubleInCartView$delegate", "getDoubleInCartView", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleInCartQuantViewImpl;", "doubleInCartView", "currentView", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "", "buttonsAlpha", "F", "initialCartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "Landroid/view/View;", "separatorView", "Landroid/view/View;", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartQuantViewHolder extends AbstractC6065b<DoubleCartQuantVO> implements CartButtonQuantLoaderFactory {

    @NotNull
    private final DoubleCartQuantViewBinder binder;

    @NotNull
    private final LinearLayout bottomContainer;
    private float buttonsAlpha;

    @NotNull
    private final i container;
    private DoubleCartQuantView currentView;

    /* renamed from: doubleCartView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j doubleCartView;

    /* renamed from: doubleInCartView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j doubleInCartView;

    @NotNull
    private final FeatureChecker featureChecker;
    private DoubleCartQuantVO.CartMode initialCartMode;
    private LoaderView loaderView;
    private View separatorView;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<DoubleCartQuantVO> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DoubleCartQuantVO invoke() {
            return DoubleCartQuantViewHolder.this.getBoundData();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            DoubleCartQuantViewHolder doubleCartQuantViewHolder = DoubleCartQuantViewHolder.this;
            doubleCartQuantViewHolder.onShowLoader(z11, doubleCartQuantViewHolder.bottomContainer);
        }
    }

    public DoubleCartQuantViewHolder(@NotNull i container, @NotNull DoubleCartQuantViewBinder binder, @NotNull FeatureChecker featureChecker, @NotNull DoubleCartQuantVO.CartMode mode, boolean z11) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.container = container;
        this.binder = binder;
        this.featureChecker = featureChecker;
        this.bottomContainer = C10183a.c(container.Y());
        this.doubleCartView = k.b(new DoubleCartQuantViewHolder$doubleCartView$2(this));
        this.doubleInCartView = k.b(new DoubleCartQuantViewHolder$doubleInCartView$2(this));
        this.buttonsAlpha = 1.0f;
        if (z11) {
            View view = new View(container.L());
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, Dimens.INSTANCE.getDP_1()));
            this.separatorView = view;
        }
        this.initialCartMode = mode;
        this.currentView = view(mode);
        binder.onContainerInitialized(view(mode), new AnonymousClass2(), container, this, new AnonymousClass3());
    }

    private final void bindBinder(DoubleCartQuantView doubleCartQuantView, DoubleCartQuantVO doubleCartQuantVO) {
        this.binder.bind(doubleCartQuantView, doubleCartQuantVO, this.container);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createAndBind(DoubleCartQuantView doubleCartQuantView, DoubleCartQuantVO doubleCartQuantVO) {
        DoubleCartQuantViewHolder doubleCartQuantViewHolder;
        DoubleCartQuantView view = view(doubleCartQuantVO.getMode());
        if (doubleCartQuantVO.getFirstCartData().getIsUpdateData()) {
            this.initialCartMode = doubleCartQuantVO.getMode();
            doubleCartQuantViewHolder = this;
            this.binder.onContainerInitialized(view, new DoubleCartQuantViewHolder$createAndBind$1$1(this), this.container, doubleCartQuantViewHolder, new DoubleCartQuantViewHolder$createAndBind$1$2(this));
            LinearLayout linearLayout = doubleCartQuantViewHolder.bottomContainer;
            Intrinsics.g(doubleCartQuantView, "null cannot be cast to non-null type android.view.View");
            linearLayout.removeView((View) doubleCartQuantView);
            doubleCartQuantViewHolder.currentView = view;
            LinearLayout linearLayout2 = doubleCartQuantViewHolder.bottomContainer;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.View");
            linearLayout2.addView((View) view);
        } else {
            doubleCartQuantViewHolder = this;
        }
        doubleCartQuantViewHolder.binder.bind(view, doubleCartQuantVO, doubleCartQuantViewHolder.container);
    }

    private final DoubleCartQuantViewImpl getDoubleCartView() {
        return (DoubleCartQuantViewImpl) this.doubleCartView.getValue();
    }

    private final DoubleInCartQuantViewImpl getDoubleInCartView() {
        return (DoubleInCartQuantViewImpl) this.doubleInCartView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowLoader(boolean isShowing, ViewGroup composerRootView) {
        if (this.loaderView == null) {
            LoaderView createLoader = createLoader(composerRootView);
            this.loaderView = createLoader;
            composerRootView.addView(createLoader, 0);
        }
        LoaderView loaderView = this.loaderView;
        if (loaderView != null) {
            loaderView.setVisibility(isShowing ? 0 : 8);
        }
        this.buttonsAlpha = isShowing ? 0.4f : 1.0f;
        Object obj = this.currentView;
        Intrinsics.g(obj, "null cannot be cast to non-null type android.view.View");
        ((View) obj).setAlpha(this.buttonsAlpha);
    }

    private final DoubleCartQuantView view(DoubleCartQuantVO.CartMode mode) {
        return mode == DoubleCartQuantVO.CartMode.DEFAULT ? getDoubleCartView() : getDoubleInCartView();
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        super.addView();
        LinearLayout linearLayout = this.bottomContainer;
        Object obj = this.currentView;
        Intrinsics.g(obj, "null cannot be cast to non-null type android.view.View");
        linearLayout.addView((View) obj);
    }

    @NotNull
    public LoaderView createLoader(@NotNull ViewGroup viewGroup) {
        return CartButtonQuantLoaderFactory.DefaultImpls.createLoader(this, viewGroup);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        Object obj = this.currentView;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        super.removeView();
        LinearLayout linearLayout = this.bottomContainer;
        Object obj = this.currentView;
        Intrinsics.g(obj, "null cannot be cast to non-null type android.view.View");
        linearLayout.removeView((View) obj);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull DoubleCartQuantVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getMode() == this.initialCartMode) {
            DoubleCartQuantView doubleCartQuantView = this.currentView;
            if (doubleCartQuantView != null) {
                bindBinder(doubleCartQuantView, item);
                return;
            }
            return;
        }
        DoubleCartQuantView doubleCartQuantView2 = this.currentView;
        if (doubleCartQuantView2 != null) {
            createAndBind(doubleCartQuantView2, item);
        }
    }
}
