package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeCartQuantOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;Lru/ozon/app/android/composer/ComposerNavigator;Ld20/e;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lkotlin/Function1;", "", "", "onSubscribeClick", "onUnsubscribeClick", "handleClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;)V", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/uni/atoms/af/AtomAction;", "mActionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscribeCartQuantOverlayViewHolder extends AbstractC6064a<SubscribeQuantVO> {

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final i container;

    @NotNull
    private final Function1<AtomAction, Unit> mActionHandler;

    @NotNull
    private final SubscribeQuantViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeCartQuantOverlayViewHolder$Companion;", "", "<init>", "()V", "SUBSCRIBE_TO_STOCK_ACTION", "", "UNSUBSCRIBE_FROM_ACTION", "SKU_PARAMS_KEY", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeCartQuantOverlayViewHolder(@NotNull i container, @NotNull SubscribeQuantViewModel viewModel, @NotNull ComposerNavigator composerNavigator, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.composerNavigator = composerNavigator;
        this.mActionHandler = new ActionHandler.Builder(container, this).onClick(new SubscribeCartQuantOverlayViewHolder$mActionHandler$1(this)).buildHandler();
        viewModel.getQuantAction().observe(container.K().f(), new SubscribeCartQuantOverlayViewHolder$sam$androidx_lifecycle_Observer$0(new SubscribeCartQuantOverlayViewHolder$1$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClick(AtomAction.Click action, Function1<? super Long, Unit> onSubscribeClick, Function1<? super Long, Unit> onUnsubscribeClick) {
        Map<String, String> params;
        String str;
        Long y02;
        String str2;
        Long y03;
        String id2 = action.getId();
        if (Intrinsics.d(id2, "subscribeToStock")) {
            Map<String, String> params2 = action.getParams();
            if (params2 == null || (str2 = params2.get("sku")) == null || (y03 = h.y0(str2)) == null) {
                return;
            }
            onSubscribeClick.invoke(y03);
            return;
        }
        if (!Intrinsics.d(id2, "unsubscribeFromStock") || (params = action.getParams()) == null || (str = params.get("sku")) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        onUnsubscribeClick.invoke(y02);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SubscribeQuantVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantView");
        SubscribeQuantView subscribeQuantView = (SubscribeQuantView) view;
        subscribeQuantView.setActionHandler(this.mActionHandler);
        subscribeQuantView.bind(item, this.viewModel.shouldInvokeSubscribeAction());
    }
}
