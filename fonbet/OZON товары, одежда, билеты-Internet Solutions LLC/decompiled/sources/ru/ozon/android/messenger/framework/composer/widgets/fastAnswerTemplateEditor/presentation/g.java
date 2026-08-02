package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.D;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import T7.E;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l1.y0;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import xe.M;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final A0.g f86898a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f86899b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f86900c;

    static {
        CornerRadius cornerRadius = CornerRadius.RADIUS_600;
        float f7 = 0;
        f86898a = A0.h.c(cornerRadius.getPx(), cornerRadius.getPx(), f7, f7);
        f86899b = 16;
        f86900c = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ModifierParameter"})
    public static final void a(ButtonV3DTO buttonV3DTO, boolean z11, e.a aVar, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        e.a aVar2;
        C3969l u11 = interfaceC3967k.u(1418756588);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(buttonV3DTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if ((i11 & 3072) == 0) {
            i13 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            aVar2 = aVar;
        } else {
            e.a aVar3 = androidx.compose.ui.e.f40358c0;
            b11 = androidx.compose.foundation.e.b(C6988h.a(aVar3, f86898a), UniCompositionLocalKt.getThemedColor(new UniColorToken(StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR), u11, UniColorToken.$stable), y0.a());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            androidx.compose.ui.e g10 = T.g(GZ.e.c(u11, f11, aVar3, 1.0f), f86899b, f86900c);
            u11.o(669734771);
            boolean z12 = (i13 & 7168) == 2048;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(function0);
                u11.x(C11);
            }
            u11.k();
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO, g10, z11, (Function1) C11, u11, (i13 & 14) | 48 | ((i13 << 3) & 896), 0);
            u11.f();
            aVar2 = aVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(buttonV3DTO, z11, aVar2, function0, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ButtonV3DTO buttonV3DTO, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a navigator, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository, u uVar, @NotNull Function0 onInputSaveClicked, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        u uVar2;
        int i12;
        InterfaceC3978p0 interfaceC3978p0;
        u uVar3;
        Function1 function1;
        u uVar4;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(onInputSaveClicked, "onInputSaveClicked");
        C3969l u11 = interfaceC3967k.u(-393801409);
        int i13 = i11 | (u11.n(buttonV3DTO) ? 4 : 2) | (u11.n(navigator) ? 32 : 16) | (u11.n(actionRepository) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | UserVerificationMethods.USER_VERIFY_ALL;
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
            uVar4 = uVar;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                u11.B(1729797275);
                B0 a11 = C6616a.a(u11);
                if (a11 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                w0 a12 = C6617b.a(N.b(u.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
                c3969l = u11;
                c3969l.K();
                uVar2 = (u) a12;
                i12 = i13 & (-7169);
            } else {
                u11.j();
                i12 = i13 & (-7169);
                uVar2 = uVar;
                c3969l = u11;
            }
            c3969l.j0();
            InterfaceC3978p0 c11 = C6285b.c(uVar2.getState(), c3969l, 0);
            Object C11 = c3969l.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(Q.j(kotlin.coroutines.g.f71771a, c3969l), c3969l);
            }
            M a13 = ((D) C11).a();
            c3969l.o(-963486594);
            c3969l.o(-1558377931);
            Object C12 = c3969l.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new w(uVar2);
                c3969l.x(C12);
            }
            Function1 function12 = (Function1) C12;
            c3969l.k();
            c3969l.k();
            View view = (View) c3969l.m(AndroidCompositionLocals_androidKt.h());
            J j11 = (J) c3969l.m(e3.r.a());
            Context context = (Context) c3969l.m(AndroidCompositionLocals_androidKt.d());
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) c3969l.m(b00.f.c());
            b.a aVar = new b.a(interfaceC7851b, navigator);
            aVar.a((WZ.l) c3969l.m(b00.f.e()));
            c3969l.o(361784399);
            int i14 = i12 & 14;
            boolean n11 = (i14 == 4) | c3969l.n(uVar2) | c3969l.F(a13) | ((i12 & 896) == 256) | c3969l.F(view) | c3969l.F(context) | c3969l.n(function12) | ((i12 & 112) == 32) | c3969l.F(interfaceC7851b) | c3969l.F(j11);
            Object C13 = c3969l.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                u uVar5 = uVar2;
                interfaceC3978p0 = c11;
                f fVar = new f(buttonV3DTO, uVar5, a13, actionRepository, view, function12, navigator, interfaceC7851b, context, j11);
                uVar3 = uVar5;
                function1 = function12;
                c3969l.x(fVar);
                C13 = fVar;
            } else {
                interfaceC3978p0 = c11;
                function1 = function12;
                uVar3 = uVar2;
            }
            c3969l.k();
            aVar.d((Function1) C13);
            ButtonV3DTO a14 = buttonV3DTO == null ? s.a() : buttonV3DTO;
            boolean c12 = ((i) interfaceC3978p0.getValue()).c();
            c3969l.o(361872845);
            boolean n12 = c3969l.n(interfaceC3978p0) | (i14 == 4) | c3969l.n(function1) | c3969l.F(aVar);
            Object C14 = c3969l.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                c cVar = new c(onInputSaveClicked, buttonV3DTO, function1, aVar, interfaceC3978p0);
                c3969l.x(cVar);
                C14 = cVar;
            }
            c3969l.k();
            C3969l c3969l2 = c3969l;
            a(a14, c12, null, (Function0) C14, c3969l2, 0);
            u11 = c3969l2;
            uVar4 = uVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(buttonV3DTO, navigator, actionRepository, uVar4, onInputSaveClicked, i11));
        }
    }
}
