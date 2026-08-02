package ru.ozon.app.android.pdp.widgets.helpfulHints.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R'\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;LVg/d;)V", "Landroidx/lifecycle/v;", "lifecycle", "", "addLifecycleObserver", "(Landroidx/lifecycle/v;Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;)V", "Ll10/t;", "ownerContainer", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "observeNotification", "(Ll10/t;Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO;)V", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;", "LVg/d;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpfulHintsViewHolder extends AbstractC6065b<HelpfulHintsVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final View metricView;

    @NotNull
    private final HelpfulHintsViewModel viewModel;

    public HelpfulHintsViewHolder(@NotNull i container, @NotNull HelpfulHintsViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = k.b(new HelpfulHintsViewHolder$actionHandler$2(this));
    }

    private final void addLifecycleObserver(final AbstractC5434v lifecycle, final HelpfulHintsViewModel viewModel) {
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdp.widgets.helpfulHints.presentation.HelpfulHintsViewHolder$addLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                lifecycle.e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                HelpfulHintsViewModel.this.stopTimer();
            }
        });
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final void observeNotification(t ownerContainer, HelpfulHintsViewModel viewModel, Function1<? super AtomAction, Unit> actionHandler) {
        viewModel.getNotificationShow().observe(ownerContainer.f(), new HelpfulHintsViewHolder$sam$androidx_lifecycle_Observer$0(new HelpfulHintsViewHolder$observeNotification$1$1(ownerContainer, actionHandler)));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HelpfulHintsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        addLifecycleObserver(this.container.K().f().getLifecycle(), this.viewModel);
        observeNotification(this.container.K(), this.viewModel, getActionHandler());
        this.viewModel.startTimer(item);
    }
}
