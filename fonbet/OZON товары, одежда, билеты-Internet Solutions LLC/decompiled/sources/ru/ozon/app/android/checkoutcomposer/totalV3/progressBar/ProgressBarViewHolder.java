package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.r;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarViewHolder$onBackPressedCallback$2;
import ru.ozon.app.android.checkoutcomposer.utils.ExtensionsKt;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.HandledState;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001#\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarViewHolder;", "Ld20/b;", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarView;", "view", "Ll10/i;", "container", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarView;Ll10/i;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;)V", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "handledState", "", "onViewStateChanged", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", "Landroid/view/WindowManager$LayoutParams;", "getOverlayLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;)V", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarView;", "Ll10/i;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "metricView", "getMetricView", "()Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarView;", "Landroid/view/ViewGroup;", "decorView", "Landroid/view/ViewGroup;", "ru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarViewHolder$onBackPressedCallback$2$1", "onBackPressedCallback$delegate", "LSc/j;", "getOnBackPressedCallback", "()Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarViewHolder$onBackPressedCallback$2$1;", "onBackPressedCallback", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressBarViewHolder extends AbstractC6065b<ProgressBarVO> {

    @NotNull
    private final i container;
    private ViewGroup decorView;

    @NotNull
    private final ProgressBarView metricView;

    /* renamed from: onBackPressedCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBackPressedCallback;

    @NotNull
    private final ProgressBarView view;

    @NotNull
    private final CreateAndPayViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "handledState", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<HandledState<CreateAndPayViewState>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HandledState<CreateAndPayViewState> handledState) {
            invoke2(handledState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HandledState<CreateAndPayViewState> handledState) {
            ProgressBarViewHolder progressBarViewHolder = ProgressBarViewHolder.this;
            Intrinsics.f(handledState);
            progressBarViewHolder.onViewStateChanged(handledState);
        }
    }

    public ProgressBarViewHolder(@NotNull ProgressBarView view, @NotNull i container, @NotNull CreateAndPayViewModel viewModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.container = container;
        this.viewModel = viewModel;
        this.metricView = view;
        Window actualWindow = ExtensionsKt.getActualWindow(container);
        View decorView = actualWindow != null ? actualWindow.getDecorView() : null;
        this.decorView = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.onBackPressedCallback = LazyUtilsKt.unsafeLazy(ProgressBarViewHolder$onBackPressedCallback$2.INSTANCE);
        viewModel.getViewState().observe(this, new ProgressBarViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 getOnBackPressedCallback() {
        return (ProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1) this.onBackPressedCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowManager.LayoutParams getOverlayLayoutParams() {
        return new WindowManager.LayoutParams(-1, -1, 2038, 256, -3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewStateChanged(HandledState<CreateAndPayViewState> handledState) {
        handledState.state(new ProgressBarViewHolder$onViewStateChanged$1(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        r a11 = this.container.Q().a();
        if (a11 == null) {
            return;
        }
        a11.getOnBackPressedDispatcher().h(this, getOnBackPressedCallback());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.view.cancelAnimations();
        getOnBackPressedCallback().setEnabled(false);
        getOnBackPressedCallback().remove();
        ViewGroup viewGroup = this.decorView;
        if (viewGroup != null) {
            viewGroup.removeView(this.view);
        }
        this.decorView = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ProgressBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.cancelAnimations();
        this.view.bindOrGone(item.getTitle());
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public ProgressBarView getMetricView() {
        return this.metricView;
    }
}
