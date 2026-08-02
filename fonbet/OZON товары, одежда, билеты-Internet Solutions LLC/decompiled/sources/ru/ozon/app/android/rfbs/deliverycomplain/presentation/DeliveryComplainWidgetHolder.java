package ru.ozon.app.android.rfbs.deliverycomplain.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Sc.s;
import Wc.a;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.cs_orders.databinding.WidgetDeliveryComplainBinding;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.rfbs.deliverycomplain.data.ComplainCompletedState;
import ru.ozon.app.android.rfbs.deliverycomplain.data.EnterComplainState;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.ComplainViewModel;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.DeliveryComplainVO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001(\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00110$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/DeliveryComplainWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/DeliveryComplainVO;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "button", "Lru/ozon/app/android/cs_orders/databinding/WidgetDeliveryComplainBinding;", "binding", "Ll10/i;", "container", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel;", "viewModel", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;Lru/ozon/app/android/cs_orders/databinding/WidgetDeliveryComplainBinding;Ll10/i;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel;)V", "Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "enterComplainState", "", "bindEnterComplainStateOrGone", "(Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;)V", "Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;", "completedState", "bindCompletedStateOrGone", "(Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;)V", "showErrorFlashbar", "()V", "setUpListeners", "removeListeners", "item", "bind", "(Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/DeliveryComplainVO;)V", "onWidgetCreated", "onWidgetDestroyed", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lru/ozon/app/android/cs_orders/databinding/WidgetDeliveryComplainBinding;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/rfbs/deliverycomplain/presentation/DeliveryComplainWidgetHolder$complainInputTextWatcher$1", "complainInputTextWatcher", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/DeliveryComplainWidgetHolder$complainInputTextWatcher$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryComplainWidgetHolder extends AbstractC6065b<DeliveryComplainVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeliveryComplainBinding binding;

    @NotNull
    private final LargeButtonView button;

    @NotNull
    private final DeliveryComplainWidgetHolder$complainInputTextWatcher$1 complainInputTextWatcher;

    @NotNull
    private final i container;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainWidgetHolder$1", f = "DeliveryComplainWidgetHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainWidgetHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<ComplainViewModel.Action, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = DeliveryComplainWidgetHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ComplainViewModel.Action action = (ComplainViewModel.Action) this.L$0;
            if (action instanceof ComplainViewModel.Action.Success) {
                InterfaceC7851b.a.a(DeliveryComplainWidgetHolder.this.container.M(), ((ComplainViewModel.Action.Success) action).getRefreshUrl(), null, null, null, 14);
            } else if (action instanceof ComplainViewModel.Action.Error) {
                DeliveryComplainWidgetHolder.this.showErrorFlashbar();
            } else {
                if (!(action instanceof ComplainViewModel.Action.Loader)) {
                    throw new o();
                }
                if (((ComplainViewModel.Action.Loader) action).getShow()) {
                    DeliveryComplainWidgetHolder.this.container.M().e(new l.a.C1079a(0L, null, 3));
                } else {
                    DeliveryComplainWidgetHolder.this.container.M().hideLoader();
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ComplainViewModel.Action action, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(action, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainWidgetHolder$complainInputTextWatcher$1] */
    public DeliveryComplainWidgetHolder(@NotNull LargeButtonView button, @NotNull WidgetDeliveryComplainBinding binding, @NotNull i container, @NotNull HandlersInhibitor inhibitor, @NotNull ComplainViewModel viewModel) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.button = button;
        this.binding = binding;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).enableClickThrottling(inhibitor).onComposerAction(new DeliveryComplainWidgetHolder$actionHandler$1(this, viewModel)).buildHandler();
        this.complainInputTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainWidgetHolder$complainInputTextWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                LargeButtonView largeButtonView;
                Intrinsics.checkNotNullParameter(editable, "editable");
                largeButtonView = DeliveryComplainWidgetHolder.this.button;
                largeButtonView.setEnabled(!h.K(editable.toString()));
            }
        };
        this.touchListener = new FH.a();
        C2399j.C(new C2408n0(viewModel.getActions(), new AnonymousClass1(null)), K.a(container.K().f()));
    }

    private final void bindCompletedStateOrGone(ComplainCompletedState completedState) {
        WidgetDeliveryComplainBinding widgetDeliveryComplainBinding = this.binding;
        if (completedState == null) {
            LinearLayout completedStateContainer = widgetDeliveryComplainBinding.completedStateInclude.completedStateContainer;
            Intrinsics.checkNotNullExpressionValue(completedStateContainer, "completedStateContainer");
            ViewExtKt.gone(completedStateContainer);
        } else {
            widgetDeliveryComplainBinding.enterStateInclude.complainInput.removeTextChangedListener(this.complainInputTextWatcher);
            LinearLayout completedStateContainer2 = widgetDeliveryComplainBinding.completedStateInclude.completedStateContainer;
            Intrinsics.checkNotNullExpressionValue(completedStateContainer2, "completedStateContainer");
            ViewExtKt.show(completedStateContainer2);
            widgetDeliveryComplainBinding.completedStateInclude.completedStateTitle.setText(completedState.getTitle());
            widgetDeliveryComplainBinding.completedStateInclude.completedStateSubtitle.setText(completedState.getSubtitle());
        }
    }

    private final void bindEnterComplainStateOrGone(EnterComplainState enterComplainState) {
        WidgetDeliveryComplainBinding widgetDeliveryComplainBinding = this.binding;
        if (enterComplainState == null) {
            LinearLayout enterComplainStateContainer = widgetDeliveryComplainBinding.enterStateInclude.enterComplainStateContainer;
            Intrinsics.checkNotNullExpressionValue(enterComplainStateContainer, "enterComplainStateContainer");
            ViewExtKt.gone(enterComplainStateContainer);
            return;
        }
        widgetDeliveryComplainBinding.enterStateInclude.complainInput.addTextChangedListener(this.complainInputTextWatcher);
        this.button.setEnabled(false);
        LinearLayout enterComplainStateContainer2 = widgetDeliveryComplainBinding.enterStateInclude.enterComplainStateContainer;
        Intrinsics.checkNotNullExpressionValue(enterComplainStateContainer2, "enterComplainStateContainer");
        ViewExtKt.show(enterComplainStateContainer2);
        TextView complainInputDescription = widgetDeliveryComplainBinding.enterStateInclude.complainInputDescription;
        Intrinsics.checkNotNullExpressionValue(complainInputDescription, "complainInputDescription");
        TextViewExtKt.setTextOrGone(complainInputDescription, enterComplainState.getDescription());
        String placeholder = enterComplainState.getPlaceholder();
        if (placeholder != null) {
            widgetDeliveryComplainBinding.enterStateInclude.enterComplainLayout.d0(placeholder);
        } else {
            widgetDeliveryComplainBinding.enterStateInclude.enterComplainLayout.d0("");
        }
    }

    private final void removeListeners() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 == null || (view = b11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.setOnTouchListener(null);
    }

    private final void setUpListeners() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 == null || (view = b11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.setOnTouchListener(this.touchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorFlashbar() {
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        ViewGroup rootView = ContextExtKt.getRootView(this.container.K().a());
        if (rootView == null) {
            return;
        }
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_message_request_problem));
        int i11 = R$drawable.ic_warning;
        FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 6000L, null, null, this.container.K().f(), 57306, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(View view, MotionEvent motionEvent) {
        Intrinsics.f(view);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hideKeyboard(view);
        return false;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        LinearLayout o11 = C10183a.o(this.container.Y());
        o11.addView(this.binding.getConstraintLayout());
        ViewGroup.LayoutParams layoutParams = o11.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        o11.setLayoutParams(layoutParams);
        C10183a.c(this.container.Y()).addView(this.button);
        setUpListeners();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        removeListeners();
        C10183a.o(this.container.Y()).removeView(this.binding.getConstraintLayout());
        C10183a.c(this.container.Y()).removeView(this.button);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull DeliveryComplainVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        LargeButtonHolderKt.bindOrGone(this.button, item.getActionButton(), this.actionHandler);
        bindEnterComplainStateOrGone(item.getEnterComplainState());
        bindCompletedStateOrGone(item.getCompletedComplainState());
    }
}
