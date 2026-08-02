package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Ae.InterfaceC2397i;
import Ae.M0;
import An.C2439a;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.OrderDoneButtonBarDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDoneButtonBarBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.generator.GeneratorIdFactory;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u0015*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0015098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarStickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneButtonBarBinding;", "binding", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;", "viewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneButtonBarBinding;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;Lru/ozon/app/android/composer/ComposerNavigator;Ll10/i;Ld20/e;)V", "item", "", "bindButtons", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "pay", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;", "padding", "updatePaddings", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;)V", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "showMessage", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "data", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lru/ozon/uni/android/flashbar/model/Restriction;", "showRestriction", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "onClickAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "bind", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneButtonBarBinding;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Ll10/i;", "", "lastClickTime", "J", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsHorizontalAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsVerticalAdapter", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneButtonBarStickyWidgetViewHolder extends AbstractC6064a<OrderDoneButtonBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;

    @NotNull
    private final WidgetOrderDoneButtonBarBinding binding;

    @NotNull
    private final AtomsAdapter buttonsHorizontalAdapter;

    @NotNull
    private final AtomsAdapter buttonsVerticalAdapter;

    @NotNull
    private final i container;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;
    private long lastClickTime;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final OrderDoneButtonBarViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<OrderDoneButtonBarViewModelImpl.Action, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderDoneButtonBarViewModelImpl.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderDoneButtonBarViewModelImpl.Action action) {
            if (action instanceof OrderDoneButtonBarViewModelImpl.Action.InvokeAction) {
                OrderDoneButtonBarStickyWidgetViewHolder.this.actionHandler.invoke(((OrderDoneButtonBarViewModelImpl.Action.InvokeAction) action).getAction());
                return;
            }
            if (action instanceof OrderDoneButtonBarViewModelImpl.Action.OpenCart) {
                ComposerNavigator composerNavigator = OrderDoneButtonBarStickyWidgetViewHolder.this.navigator;
                String uri = LinkGenerator.INSTANCE.cart().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, uri, null, 2, null);
                return;
            }
            if (action instanceof OrderDoneButtonBarViewModelImpl.Action.ShowMessage) {
                OrderDoneButtonBarStickyWidgetViewHolder.this.showMessage(((OrderDoneButtonBarViewModelImpl.Action.ShowMessage) action).getMessage());
                return;
            }
            if (action instanceof OrderDoneButtonBarViewModelImpl.Action.Redirect) {
                String redirectLink = ((OrderDoneButtonBarViewModelImpl.Action.Redirect) action).getRedirectLink();
                if (redirectLink != null) {
                    ComposerNavigator.DefaultImpls.openDeeplink$default(OrderDoneButtonBarStickyWidgetViewHolder.this.navigator, redirectLink, null, 2, null);
                    return;
                }
                return;
            }
            if (action instanceof OrderDoneButtonBarViewModelImpl.Action.ShowRestrictionMessage) {
                OrderDoneButtonBarStickyWidgetViewHolder.this.showRestriction(((OrderDoneButtonBarViewModelImpl.Action.ShowRestrictionMessage) action).getRestriction());
            } else if (action instanceof OrderDoneButtonBarViewModelImpl.Action.ShowNotification) {
                OrderDoneButtonBarStickyWidgetViewHolder.this.showNotification(((OrderDoneButtonBarViewModelImpl.Action.ShowNotification) action).getData());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder$4", f = "OrderDoneButtonBarStickyWidgetViewHolder.kt", l = {112}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder$4$1", f = "OrderDoneButtonBarStickyWidgetViewHolder.kt", l = {113}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            int label;
            final /* synthetic */ OrderDoneButtonBarStickyWidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderDoneButtonBarStickyWidgetViewHolder orderDoneButtonBarStickyWidgetViewHolder, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = orderDoneButtonBarStickyWidgetViewHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    M0<Boolean> loaderState = this.this$0.viewModel.getLoaderState();
                    final OrderDoneButtonBarStickyWidgetViewHolder orderDoneButtonBarStickyWidgetViewHolder = this.this$0;
                    InterfaceC2397i<? super Boolean> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder.4.1.1
                        @Override // Ae.InterfaceC2397i
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                            return emit(((Boolean) obj2).booleanValue(), (d<? super Unit>) dVar);
                        }

                        public final Object emit(boolean z11, d<? super Unit> dVar) {
                            if (z11) {
                                C2439a.b(0L, null, 3, OrderDoneButtonBarStickyWidgetViewHolder.this.container.M());
                            } else {
                                OrderDoneButtonBarStickyWidgetViewHolder.this.container.M().hideLoader();
                            }
                            return Unit.f71690a;
                        }
                    };
                    this.label = 1;
                    if (loaderState.collect(interfaceC2397i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                throw new C4005g();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return OrderDoneButtonBarStickyWidgetViewHolder.this.new AnonymousClass4(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                AbstractC5434v lifecycle = OrderDoneButtonBarStickyWidgetViewHolder.this.getLifecycle();
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderDoneButtonBarStickyWidgetViewHolder.this, null);
                this.label = 1;
                if (C5412d0.a(lifecycle, bVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarStickyWidgetViewHolder$Companion;", "", "<init>", "()V", "PAY_ACTION_ID", "", "REORDER_ACTION_ID", "PARAM_DEVICE_ID", "THROTTLING_THRESHOLD", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDoneButtonBarStickyWidgetViewHolder(@NotNull WidgetOrderDoneButtonBarBinding binding, @NotNull OrderDoneButtonBarViewModel viewModel, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull ApplicationInfoDataSource applicationInfoDataSource, @NotNull ComposerNavigator navigator, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.viewModel = viewModel;
        this.createAndPayViewModel = createAndPayViewModel;
        this.applicationInfoDataSource = applicationInfoDataSource;
        this.navigator = navigator;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new OrderDoneButtonBarStickyWidgetViewHolder$actionHandler$1(this)).onClick(new OrderDoneButtonBarStickyWidgetViewHolder$actionHandler$2(this)).buildHandler();
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(new OrderDoneButtonBarStickyWidgetViewHolder$buttonsHorizontalAdapter$1$1(this));
        BxAtomConfig bxAtomConfig = BxAtomConfig.INSTANCE;
        GeneratorIdFactory generatorIdFactory = bxAtomConfig.getGeneratorIdFactory();
        HorizontalAtomsLayout buttonsHal = binding.buttonsHal;
        Intrinsics.checkNotNullExpressionValue(buttonsHal, "buttonsHal");
        atomsAdapter.setGenerator(generatorIdFactory.create(buttonsHal));
        this.buttonsHorizontalAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter2.setOnAction(new OrderDoneButtonBarStickyWidgetViewHolder$buttonsVerticalAdapter$1$1(this));
        GeneratorIdFactory generatorIdFactory2 = bxAtomConfig.getGeneratorIdFactory();
        VerticalAtomsLayout buttonsVal = binding.buttonsVal;
        Intrinsics.checkNotNullExpressionValue(buttonsVal, "buttonsVal");
        atomsAdapter2.setGenerator(generatorIdFactory2.create(buttonsVal));
        this.buttonsVerticalAdapter = atomsAdapter2;
        HorizontalAtomsLayout horizontalAtomsLayout = binding.buttonsHal;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        Context context = horizontalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new OrderDoneButtonBarHorizontalDecorator(context));
        VerticalAtomsLayout verticalAtomsLayout = binding.buttonsVal;
        verticalAtomsLayout.setAdapter(atomsAdapter2);
        Context context2 = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        verticalAtomsLayout.setDecorator(new OrderDoneButtonBarVerticalDecorator(context2));
        viewModel.getActions().observe(this, new OrderDoneButtonBarStickyWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
        C10727i.c(K.a(this), null, null, new AnonymousClass4(null), 3);
    }

    private final void bindButtons(OrderDoneButtonBarVO item) {
        WidgetOrderDoneButtonBarBinding widgetOrderDoneButtonBarBinding = this.binding;
        if (item.getButtonsLayout() == OrderDoneButtonBarDTO.ButtonsLayout.HORIZONTAL) {
            VerticalAtomsLayout buttonsVal = widgetOrderDoneButtonBarBinding.buttonsVal;
            Intrinsics.checkNotNullExpressionValue(buttonsVal, "buttonsVal");
            buttonsVal.setVisibility(8);
            AtomsAdapter atomsAdapter = this.buttonsHorizontalAdapter;
            Context context = widgetOrderDoneButtonBarBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, item.getButtons());
            HorizontalAtomsLayout buttonsHal = widgetOrderDoneButtonBarBinding.buttonsHal;
            Intrinsics.checkNotNullExpressionValue(buttonsHal, "buttonsHal");
            buttonsHal.setVisibility(0);
            return;
        }
        HorizontalAtomsLayout buttonsHal2 = widgetOrderDoneButtonBarBinding.buttonsHal;
        Intrinsics.checkNotNullExpressionValue(buttonsHal2, "buttonsHal");
        buttonsHal2.setVisibility(8);
        AtomsAdapter atomsAdapter2 = this.buttonsVerticalAdapter;
        Context context2 = widgetOrderDoneButtonBarBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        atomsAdapter2.bind(context2, item.getButtons());
        VerticalAtomsLayout buttonsVal2 = widgetOrderDoneButtonBarBinding.buttonsVal;
        Intrinsics.checkNotNullExpressionValue(buttonsVal2, "buttonsVal");
        buttonsVal2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickAction(AtomAction action) {
        if (!(action instanceof AtomAction.Click) && !(action instanceof AtomAction.ComposerAction)) {
            this.actionHandler.invoke(action);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.lastClickTime < 1000) {
            return;
        }
        this.lastClickTime = elapsedRealtime;
        this.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pay(AtomAction.Click action) {
        CreateAndPayViewModel createAndPayViewModel = this.createAndPayViewModel;
        String link = action.getLink();
        if (link == null) {
            return;
        }
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        createAndPayViewModel.pay(link, U.n(params, new Pair("deviceId", this.applicationInfoDataSource.getUniqueApplicationId())), getTrackingData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(ComposerActionWithActionDTO.MessageDTO message) {
        Pair pair;
        ViewGroup rootView = ContextExtKt.getRootView(this.container.K().a());
        if (rootView == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            pair = new Pair(null, null);
        } else if (i11 == 2) {
            pair = new Pair(Integer.valueOf(R$drawable.ic_check_green), UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken());
        } else {
            if (i11 != 3) {
                throw new o();
            }
            pair = new Pair(Integer.valueOf(R$drawable.ic_warning), UniColors.GRAPHIC_WARNING_PRIMARY.getToken());
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message.getMessage()), null, null, (Integer) pair.a(), null, (String) pair.b(), null, null, null, null, null, 3000L, null, null, this.container.K().f(), 57178, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO data) {
        if (data == null) {
            return;
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.container.Q().c());
        if (rootView == null) {
            r a11 = this.container.Q().a();
            rootView = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (rootView == null) {
                return;
            }
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(rootView, NotificationBarKt.isAboveBottomWidgets(data));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(rootView, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, data, this.container.Q().i(), new OrderDoneButtonBarStickyWidgetViewHolder$showNotification$1(this.actionHandler)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRestriction(Restriction message) {
        ViewGroup rootView;
        if (message == null || (rootView = ContextExtKt.getRootView(this.container.K().a())) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(message), this.container.K().f(), null, null, null, null, null, 248, null);
    }

    private final void updatePaddings(ConstraintLayout constraintLayout, OrderDoneButtonBarVO.PaddingVO paddingVO) {
        androidx.constraintlayout.widget.d b11 = Cm.e.b(constraintLayout);
        b11.e0(R$id.badgeV, 6, paddingVO.getLeft());
        b11.e0(R$id.buttonsHal, 6, paddingVO.getLeft());
        b11.e0(R$id.buttonsHal, 7, paddingVO.getRight());
        b11.e0(R$id.buttonsVal, 6, paddingVO.getLeft());
        b11.e0(R$id.buttonsVal, 7, paddingVO.getRight());
        b11.e0(R$id.subtitleTav, 6, paddingVO.getLeft());
        b11.e0(R$id.subtitleTav, 7, paddingVO.getRight());
        b11.e0(R$id.buttonsHal, 3, paddingVO.getTop());
        b11.Z(R$id.buttonsHal, 4, paddingVO.getBottom());
        b11.e0(R$id.buttonsVal, 3, paddingVO.getTop());
        b11.Z(R$id.buttonsVal, 4, paddingVO.getBottom());
        b11.e0(R$id.subtitleTav, 4, paddingVO.getBottom());
        b11.f(constraintLayout);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderDoneButtonBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetOrderDoneButtonBarBinding widgetOrderDoneButtonBarBinding = this.binding;
        BadgeView badgeV = widgetOrderDoneButtonBarBinding.badgeV;
        Intrinsics.checkNotNullExpressionValue(badgeV, "badgeV");
        BadgeHolderKt.bindOrGone(badgeV, item.getBadge(), this.actionHandler);
        bindButtons(item);
        TextAtomV2View subtitleTav = widgetOrderDoneButtonBarBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone(subtitleTav, item.getSubtitle(), this.actionHandler);
        ConstraintLayout constraintLayout = widgetOrderDoneButtonBarBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        updatePaddings(constraintLayout, item.getPadding());
    }
}
