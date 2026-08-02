package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core;

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
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleInCartViewV4;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.loader.CartButtonLoaderFactory;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/core/BaseDoubleCartV4ViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/loader/CartButtonLoaderFactory;", "Ll10/i;", "container", "LSc/j;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "doubleCartView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "binder", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "", "hasShadow", "<init>", "(Ll10/i;LSc/j;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Z)V", "vo", "", "bindBinder", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)V", "createAndBind", "isShowing", "Landroid/view/ViewGroup;", "composerRootView", "onShowLoader", "(ZLandroid/view/ViewGroup;)V", "view", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "addView", "()V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)V", "removeView", "Ll10/i;", "LSc/j;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "Landroid/widget/LinearLayout;", "bottomContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleInCartViewV4;", "doubleInCartView$delegate", "getDoubleInCartView", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleInCartViewV4;", "doubleInCartView", "currentView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "", "buttonsAlpha", "F", "initialCartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "Landroid/view/View;", "separatorView", "Landroid/view/View;", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseDoubleCartV4ViewHolder extends AbstractC6065b<DoubleCartVO> implements CartButtonLoaderFactory {

    @NotNull
    private final DoubleCartViewBinder binder;

    @NotNull
    private final LinearLayout bottomContainer;
    private float buttonsAlpha;

    @NotNull
    private final i container;

    @NotNull
    private DoubleCartView currentView;

    @NotNull
    private final InterfaceC4008j<DoubleCartView> doubleCartView;

    /* renamed from: doubleInCartView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j doubleInCartView;

    @NotNull
    private DoubleCartVO.CartMode initialCartMode;
    private LoaderView loaderView;
    private View separatorView;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4ViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<DoubleCartVO> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DoubleCartVO invoke() {
            return BaseDoubleCartV4ViewHolder.this.getBoundData();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4ViewHolder$3, reason: invalid class name */
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
            BaseDoubleCartV4ViewHolder baseDoubleCartV4ViewHolder = BaseDoubleCartV4ViewHolder.this;
            baseDoubleCartV4ViewHolder.onShowLoader(z11, baseDoubleCartV4ViewHolder.bottomContainer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDoubleCartV4ViewHolder(@NotNull i container, @NotNull InterfaceC4008j<? extends DoubleCartView> doubleCartView, @NotNull DoubleCartViewBinder binder, @NotNull DoubleCartVO.CartMode mode, boolean z11) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(doubleCartView, "doubleCartView");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.container = container;
        this.doubleCartView = doubleCartView;
        this.binder = binder;
        this.bottomContainer = C10183a.c(container.Y());
        this.doubleInCartView = k.b(new BaseDoubleCartV4ViewHolder$doubleInCartView$2(this));
        this.currentView = view(mode);
        this.buttonsAlpha = 1.0f;
        this.initialCartMode = mode;
        if (z11) {
            View view = new View(container.L());
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, Dimens.INSTANCE.getDP_1()));
            this.separatorView = view;
        }
        binder.onContainerInitialized(view(mode), new AnonymousClass2(), container, this, new AnonymousClass3());
    }

    private final void bindBinder(DoubleCartView doubleCartView, DoubleCartVO doubleCartVO) {
        DoubleCartViewBinder.bind$default(this.binder, doubleCartView, doubleCartVO, this.container, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createAndBind(DoubleCartView doubleCartView, DoubleCartVO doubleCartVO) {
        BaseDoubleCartV4ViewHolder baseDoubleCartV4ViewHolder;
        DoubleCartView view = view(doubleCartVO.getMode());
        if (doubleCartVO.getFirstCartData().getIsUpdateData()) {
            this.initialCartMode = doubleCartVO.getMode();
            this.binder.onContainerInitialized(view, new BaseDoubleCartV4ViewHolder$createAndBind$1$1(this), this.container, this, new BaseDoubleCartV4ViewHolder$createAndBind$1$2(this));
            baseDoubleCartV4ViewHolder = this;
            LinearLayout linearLayout = baseDoubleCartV4ViewHolder.bottomContainer;
            Intrinsics.g(doubleCartView, "null cannot be cast to non-null type android.view.View");
            linearLayout.removeView((View) doubleCartView);
            baseDoubleCartV4ViewHolder.currentView = view;
            LinearLayout linearLayout2 = baseDoubleCartV4ViewHolder.bottomContainer;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.View");
            linearLayout2.addView((View) view);
        } else {
            baseDoubleCartV4ViewHolder = this;
        }
        DoubleCartViewBinder.bind$default(baseDoubleCartV4ViewHolder.binder, view, doubleCartVO, baseDoubleCartV4ViewHolder.container, null, 8, null);
    }

    private final DoubleInCartViewV4 getDoubleInCartView() {
        return (DoubleInCartViewV4) this.doubleInCartView.getValue();
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

    private final DoubleCartView view(DoubleCartVO.CartMode mode) {
        return mode == DoubleCartVO.CartMode.DEFAULT ? this.doubleCartView.getValue() : getDoubleInCartView();
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
        return CartButtonLoaderFactory.DefaultImpls.createLoader(this, viewGroup);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        Object obj = this.currentView;
        Intrinsics.g(obj, "null cannot be cast to non-null type android.view.View");
        return (View) obj;
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
    public void bind(@NotNull DoubleCartVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getMode() == this.initialCartMode) {
            bindBinder(this.currentView, item);
        } else {
            createAndBind(this.currentView, item);
        }
    }
}
