package ru.ozon.app.android.marketing.widgets.cartButton.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import T00.m;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonViewHolder;", "Ld20/b;", "Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonVO;", "Ll10/i;", "container", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "view", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager", "<init>", "(Ll10/i;Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;)V", "", "widgetAsyncData", "Lxe/B0;", "observeMiniWidgetState", "(Ljava/lang/String;)Lxe/B0;", "item", "", "bind", "(Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonVO;)V", "addView", "()V", "removeView", "Ll10/i;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "observeAsyncStateJob", "Lxe/B0;", "Landroid/widget/LinearLayout;", "getBottomContainer", "()Landroid/widget/LinearLayout;", "bottomContainer", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartButtonViewHolder extends AbstractC6065b<CartButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final View metricView;
    private B0 observeAsyncStateJob;

    @NotNull
    private final HighlightsWrapperStateManager stateManager;

    @NotNull
    private final LargeButtonView view;

    public CartButtonViewHolder(@NotNull i container, @NotNull LargeButtonView view, @NotNull HighlightsWrapperStateManager stateManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.container = container;
        this.view = view;
        this.stateManager = stateManager;
        this.metricView = view;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    private final LinearLayout getBottomContainer() {
        return ComposerViewExtensionKt.composerBottomContainer(this.container.Y());
    }

    private final B0 observeMiniWidgetState(String widgetAsyncData) {
        return C2399j.C(new C2408n0(C2399j.o(this.stateManager.listenState(widgetAsyncData)), new CartButtonViewHolder$observeMiniWidgetState$1(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        getBottomContainer().addView(this.view);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        getBottomContainer().removeView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CartButtonVO item) {
        d c11;
        m c12;
        B0 b02;
        Intrinsics.checkNotNullParameter(item, "item");
        B0 b03 = this.observeAsyncStateJob;
        if (b03 == null || ((b03 != null && b03.isCancelled()) || ((b02 = this.observeAsyncStateJob) != null && b02.l0()))) {
            l viewItem = getViewItem();
            this.observeAsyncStateJob = observeMiniWidgetState((viewItem == null || (c11 = viewItem.c()) == null || (c12 = c11.c()) == null) ? null : c12.a());
        }
        LargeButtonHolderKt.bindOrGone(this.view, item.getButton(), this.actionHandler);
    }
}
