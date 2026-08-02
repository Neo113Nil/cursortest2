package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import Bl0.C2652m;
import S0.C3969l;
import S0.D;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import android.view.View;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.C6285b;
import e3.r;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.M;

/* loaded from: classes10.dex */
public final class b {

    static final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.f87062b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f87062b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.b$b, reason: collision with other inner class name */
    static final class C1557b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ButtonV3DTO f87063b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f87064c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87065d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f87066e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1557b(ButtonV3DTO buttonV3DTO, boolean z11, Function0<Unit> function0, int i11) {
            super(2);
            this.f87063b = buttonV3DTO;
            this.f87064c = z11;
            this.f87065d = function0;
            this.f87066e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f87066e | 1);
            boolean z11 = this.f87064c;
            Function0<Unit> function0 = this.f87065d;
            b.a(this.f87063b, z11, function0, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull ButtonV3DTO button, boolean z11, @NotNull Function0<Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ButtonV3DTO buttonV3DTO;
        boolean z12;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(-256961606);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(button) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onAction) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            buttonV3DTO = button;
            z12 = z11;
        } else {
            androidx.compose.ui.e g10 = T.g(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), 16, 10);
            u11.o(1523965361);
            boolean z13 = (i12 & 896) == 256;
            Object C11 = u11.C();
            if (z13 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(onAction);
                u11.x(C11);
            }
            u11.k();
            buttonV3DTO = button;
            z12 = z11;
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO, g10, z12, (Function1) C11, u11, (i12 & 14) | 48 | ((i12 << 3) & 896), 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C1557b(buttonV3DTO, z12, onAction, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@NotNull ButtonV3DTO buttonV3DTO, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a navigator, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, p pVar, InterfaceC3967k interfaceC3967k, int i11) {
        p pVar2;
        int i12;
        Object fVar;
        p pVar3;
        InterfaceC3978p0 interfaceC3978p0;
        p pVar4;
        ButtonV3DTO button = buttonV3DTO;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        C3969l u11 = interfaceC3967k.u(-96049102);
        int i13 = i11 | (u11.n(button) ? 4 : 2) | (u11.n(navigator) ? 32 : 16) | (u11.n(actionRepository) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(messengerController) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | 8192;
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
            pVar4 = pVar;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                u11.B(1729797275);
                B0 a11 = C6616a.a(u11);
                if (a11 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                w0 a12 = C6617b.a(N.b(p.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
                u11.K();
                pVar2 = (p) a12;
                i12 = i13 & (-57345);
            } else {
                u11.j();
                i12 = i13 & (-57345);
                pVar2 = pVar;
            }
            u11.j0();
            InterfaceC3978p0 c11 = C6285b.c(pVar2.getState(), u11, 0);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            M a13 = ((D) C11).a();
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) u11.m(b00.f.c());
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            J j11 = (J) u11.m(r.a());
            b.a aVar = new b.a(interfaceC7851b, navigator);
            aVar.a((WZ.l) u11.m(b00.f.e()));
            u11.o(-1101217150);
            int i14 = i12 & 14;
            boolean n11 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32) | (i14 == 4) | u11.n(pVar2) | u11.F(a13) | ((i12 & 896) == 256) | u11.F(interfaceC7851b) | u11.F(view) | u11.F(j11);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                pVar3 = pVar2;
                button = buttonV3DTO;
                interfaceC3978p0 = c11;
                fVar = new f(button, pVar3, a13, actionRepository, navigator, interfaceC7851b, messengerController, view, j11);
                u11.x(fVar);
            } else {
                fVar = C12;
                pVar3 = pVar2;
                interfaceC3978p0 = c11;
                button = buttonV3DTO;
            }
            u11.k();
            aVar.d((Function1) fVar);
            kotlin.reflect.h<Unit> b11 = aVar.b();
            boolean k11 = ((n) interfaceC3978p0.getValue()).k();
            u11.o(-1101137538);
            boolean n12 = u11.n(interfaceC3978p0) | u11.n(pVar3) | (i14 == 4) | u11.n(b11);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new c(pVar3, button, interfaceC3978p0, b11);
                u11.x(C13);
            }
            u11.k();
            a(button, k11, (Function0) C13, u11, i14);
            pVar4 = pVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(button, navigator, actionRepository, messengerController, pVar4, i11));
        }
    }
}
