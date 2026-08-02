package ru.ozon.android.messenger.blocks.showTextButton;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.e;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.w;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(k kVar, ru.ozon.android.messenger.framework.core.d dVar, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(540543528);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(kVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(dVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e d11 = ru.ozon.android.messenger.blocks.dangerousText.c.d();
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, d11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            if (kVar.c()) {
                u11.o(-1261812563);
                DsLoaderKt.m1753DsLoader3IgeMak(null, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary(), DsLoaderSize.Size300, u11, 384, 1);
                u11.k();
            } else {
                u11.o(-1261645876);
                ButtonV3DTO b11 = kVar.b();
                if (b11 != null) {
                    e.a aVar = androidx.compose.ui.e.f40358c0;
                    u11.o(798677424);
                    boolean F11 = ((i12 & 896) == 256) | ((i12 & 14) == 4) | u11.F(dVar);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new d(function1, kVar, dVar);
                        u11.x(C11);
                    }
                    u11.k();
                    DsButtonAtomKt.DsButtonAtom(b11, aVar, false, (Function1) C11, u11, 48, 4);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(kVar, dVar, function1, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@NotNull ButtonV3DTO button, @NotNull String viewModelKey, ru.ozon.android.messenger.framework.core.d dVar, InterfaceC3967k interfaceC3967k, int i11) {
        String str;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(viewModelKey, "viewModelKey");
        C3969l u11 = interfaceC3967k.u(-2130397093);
        int i12 = (u11.n(button) ? 4 : 2) | i11 | (u11.n(viewModelKey) ? 32 : 16) | (u11.F(dVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            str = viewModelKey;
        } else {
            h hVar = new h(dVar);
            u11.B(1729797275);
            B0 a11 = C6616a.a(u11);
            if (a11 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            str = viewModelKey;
            w0 a12 = C6617b.a(N.b(c.class), a11, str, hVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
            u11.K();
            c cVar = (c) a12;
            InterfaceC3978p0 c11 = C6285b.c(cVar.getState(), u11, 0);
            u11.o(-963486594);
            u11.o(-1558377931);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new w(cVar);
                u11.x(C11);
            }
            Function1 function1 = (Function1) C11;
            u11.k();
            u11.k();
            u11.o(-1617085141);
            boolean n11 = u11.n(function1) | ((i12 & 14) == 4);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new f(function1, button, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, button, (Function2) C12);
            a((k) c11.getValue(), dVar, function1, u11, (i12 >> 3) & 112);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(button, str, dVar, i11));
        }
    }
}
