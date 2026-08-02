package ru.ozon.app.android.account.orders.emptyscreen.antibot;

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
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
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
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ComposableKt;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel;
import ru.ozon.app.android.util.theme.ThemeWrapperKt;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AntibotEmptyActivity$bind$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ AntibotEmptyActivity this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.emptyscreen.antibot.AntibotEmptyActivity$bind$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ A1<d> $config$delegate;
        final /* synthetic */ AntibotEmptyActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AntibotEmptyActivity antibotEmptyActivity, A1<d> a12) {
            super(2);
            this.this$0 = antibotEmptyActivity;
            this.$config$delegate = a12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
            CommonBarcodeV2VO createBarcodeVo;
            CommonBarcodeV2ViewModel viewModel;
            AppType appType;
            if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            float f7 = 24;
            e a11 = C6988h.a(e.f40358c0, h.d(0.0f, 0.0f, f7, f7, 3));
            AntibotEmptyActivity antibotEmptyActivity = this.this$0;
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
            createBarcodeVo = antibotEmptyActivity.createBarcodeVo();
            viewModel = antibotEmptyActivity.getViewModel();
            appType = antibotEmptyActivity.appType;
            if (appType == null) {
                Intrinsics.n("appType");
                throw null;
            }
            String b11 = AntibotEmptyActivity$bind$2.invoke$lambda$0(a12).b();
            interfaceC3967k.o(-301571040);
            boolean F11 = interfaceC3967k.F(antibotEmptyActivity);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AntibotEmptyActivity$bind$2$1$1$1$1(antibotEmptyActivity);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            CommonBarcodeV2ComposableKt.CommonBarcodeV2Composable(createBarcodeVo, viewModel, appType, b11, (Function1) ((kotlin.reflect.h) C11), interfaceC3967k, 0);
            interfaceC3967k.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AntibotEmptyActivity$bind$2(AntibotEmptyActivity antibotEmptyActivity) {
        super(2);
        this.this$0 = antibotEmptyActivity;
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
        BZ.e eVar;
        AppType appType;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        eVar = this.this$0.miniAppConfigHolder;
        if (eVar == null) {
            Intrinsics.n("miniAppConfigHolder");
            throw null;
        }
        InterfaceC3978p0 c11 = C6285b.c(eVar.h(), interfaceC3967k, 0);
        appType = this.this$0.appType;
        if (appType != null) {
            ThemeWrapperKt.ThemeWrapper(false, appType, invoke$lambda$0(c11).b(), a1.c.c(-1359643972, new AnonymousClass1(this.this$0, c11), interfaceC3967k), interfaceC3967k, 3072, 1);
        } else {
            Intrinsics.n("appType");
            throw null;
        }
    }
}
