package ru.ozon.app.android.account.orders.barcode.presentation;

import A0.h;
import B0.C2454a;
import B1.V;
import BZ.d;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.A1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import e1.InterfaceC6250b;
import e3.C6285b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ComposableKt;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel;
import ru.ozon.app.android.cs_orders.databinding.FragmentBarcodeBinding;
import ru.ozon.app.android.uikit.view.refresh.ColoredSwipeRefreshLayout;
import ru.ozon.app.android.util.theme.ThemeWrapperKt;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BarcodeFragment$setUpObservers$1 extends AbstractC7737t implements Function1<BarcodeViewModel.BarcodeViewState, Unit> {
    final /* synthetic */ BarcodeFragment this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment$setUpObservers$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ BarcodeViewModel.BarcodeViewState $it;
        final /* synthetic */ BarcodeFragment this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment$setUpObservers$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17301 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ A1<d> $config$delegate;
            final /* synthetic */ BarcodeViewModel.BarcodeViewState $it;
            final /* synthetic */ BarcodeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17301(BarcodeViewModel.BarcodeViewState barcodeViewState, BarcodeFragment barcodeFragment, A1<d> a12) {
                super(2);
                this.$it = barcodeViewState;
                this.this$0 = barcodeFragment;
                this.$config$delegate = a12;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
                CommonBarcodeV2ViewModel commonBarcodeV2ViewModel;
                if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                float f7 = 24;
                e a11 = C6988h.a(e.f40358c0, h.d(0.0f, 0.0f, f7, f7, 3));
                BarcodeViewModel.BarcodeViewState barcodeViewState = this.$it;
                BarcodeFragment barcodeFragment = this.this$0;
                A1<d> a12 = this.$config$delegate;
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I11 = interfaceC3967k.I();
                A0 d11 = interfaceC3967k.d();
                e f12 = c.f(interfaceC3967k, a11);
                InterfaceC2801g.f5440U.getClass();
                Function0 a13 = InterfaceC2801g.a.a();
                if (interfaceC3967k.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k.i();
                if (interfaceC3967k.t()) {
                    interfaceC3967k.H(a13);
                } else {
                    interfaceC3967k.e();
                }
                Function2 d12 = C2454a.d(interfaceC3967k, f11, interfaceC3967k, d11);
                if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                    a.d(d12, I11, interfaceC3967k, I11);
                }
                F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
                CommonBarcodeV2VO barcode = ((BarcodeViewModel.BarcodeViewState.ShowCache) barcodeViewState).getBarcode();
                commonBarcodeV2ViewModel = barcodeFragment.getCommonBarcodeV2ViewModel();
                AppType appType = barcodeFragment.getAppType();
                String b11 = AnonymousClass1.invoke$lambda$0(a12).b();
                interfaceC3967k.o(-1579732151);
                boolean F11 = interfaceC3967k.F(barcodeFragment);
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BarcodeFragment$setUpObservers$1$1$1$1$1$1(barcodeFragment);
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                CommonBarcodeV2ComposableKt.CommonBarcodeV2Composable(barcode, commonBarcodeV2ViewModel, appType, b11, (Function1) C11, interfaceC3967k, 0);
                interfaceC3967k.f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BarcodeFragment barcodeFragment, BarcodeViewModel.BarcodeViewState barcodeViewState) {
            super(2);
            this.this$0 = barcodeFragment;
            this.$it = barcodeViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d invoke$lambda$0(A1<d> a12) {
            return a12.getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
            if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                interfaceC3967k.j();
            } else {
                InterfaceC3978p0 c11 = C6285b.c(this.this$0.getMiniAppConfigHolder().h(), interfaceC3967k, 0);
                ThemeWrapperKt.ThemeWrapper(false, this.this$0.getAppType(), invoke$lambda$0(c11).b(), a1.c.c(-1059031266, new C17301(this.$it, this.this$0, c11), interfaceC3967k), interfaceC3967k, 3072, 1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeFragment$setUpObservers$1(BarcodeFragment barcodeFragment) {
        super(1);
        this.this$0 = barcodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BarcodeViewModel.BarcodeViewState barcodeViewState) {
        invoke2(barcodeViewState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BarcodeViewModel.BarcodeViewState barcodeViewState) {
        FragmentBarcodeBinding fragmentBarcodeBinding;
        ColoredSwipeRefreshLayout coloredSwipeRefreshLayout;
        FragmentBarcodeBinding fragmentBarcodeBinding2;
        ComposeView composeView;
        if (barcodeViewState instanceof BarcodeViewModel.BarcodeViewState.ShowCache) {
            fragmentBarcodeBinding2 = this.this$0.binding;
            if (fragmentBarcodeBinding2 != null && (composeView = fragmentBarcodeBinding2.barcodeComposeView) != null) {
                composeView.a(new C4912a(true, 1393554244, new AnonymousClass1(this.this$0, barcodeViewState)));
            }
            this.this$0.switchLayouts(false);
        } else if (barcodeViewState instanceof BarcodeViewModel.BarcodeViewState.ShowComposer) {
            this.this$0.switchLayouts(true);
        }
        fragmentBarcodeBinding = this.this$0.binding;
        if (fragmentBarcodeBinding == null || (coloredSwipeRefreshLayout = fragmentBarcodeBinding.swipeRefreshLayout) == null) {
            return;
        }
        coloredSwipeRefreshLayout.setRefreshing(false);
    }
}
