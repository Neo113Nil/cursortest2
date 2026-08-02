package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import D1.InterfaceC2801g;
import K1.C3422b;
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
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.textarea.DsTextAreaKt;
import ru.ozon.uni.android.ds.compose.component.textarea.DsTextAreaStatus;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

/* loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull o item, ru.ozon.android.messenger.framework.analytics.i iVar, p pVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        p pVar2;
        androidx.compose.ui.e b11;
        C3969l c3969l;
        String h11;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(430808934);
        int i13 = (u11.n(item) ? 4 : 2) | i11 | (u11.n(iVar) ? 32 : 16) | UserVerificationMethods.USER_VERIFY_PATTERN;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            pVar2 = pVar;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                u11.B(1729797275);
                B0 a11 = C6616a.a(u11);
                if (a11 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                w0 a12 = C6617b.a(N.b(p.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
                u11 = u11;
                u11.K();
                p pVar3 = (p) a12;
                i12 = i13 & (-897);
                pVar2 = pVar3;
            } else {
                u11.j();
                i12 = i13 & (-897);
                pVar2 = pVar;
            }
            u11.j0();
            j1.i iVar2 = (j1.i) u11.m(K0.f());
            Long valueOf = Long.valueOf(item.getId());
            u11.o(-1382840427);
            boolean n11 = u11.n(pVar2) | u11.F(item);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(pVar2, item, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C11);
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-1382836402);
            boolean F11 = ((i12 & 112) == 32) | u11.F(item);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new h(item, iVar);
                u11.x(C12);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C12, u11, 6);
            AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_STOP;
            u11.o(-1382831682);
            boolean F12 = u11.F(iVar2);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new i(iVar2);
                u11.x(C13);
            }
            u11.k();
            e3.i.a(aVar2, null, (Function0) C13, u11, 6);
            InterfaceC3978p0 c11 = C6285b.c(pVar2.getState(), u11, 0);
            e.a aVar3 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar3, 1.0f);
            UniColorToken uniColorToken = new UniColorToken(item.e());
            int i14 = UniColorToken.$stable;
            b11 = androidx.compose.foundation.e.b(e11, UniCompositionLocalKt.getThemedColor(uniColorToken, u11, i14), y0.a());
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            androidx.compose.ui.e f7 = T.f(b11, dsSpacings.m1845getDp16D9Ej5fM());
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, f7);
            Function0 a14 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            androidx.compose.ui.e g11 = T.g(androidx.compose.foundation.e.b(GZ.e.c(u11, f11, aVar3, 1.0f), UniCompositionLocalKt.getThemedColor(new UniColorToken("bgSecondary"), u11, i14), A0.h.b(CornerRadius.RADIUS_600.getPx())), dsSpacings.m1846getDp18D9Ej5fM(), dsSpacings.m1854getDp4D9Ej5fM());
            C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, g11);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 g12 = K00.b.g(u11, a15, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, g12);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            u11.o(833409705);
            List<CellDTO> b12 = ((n) c11.getValue()).b();
            int size = b12.size();
            for (int i15 = 0; i15 < size; i15++) {
                CellDTO cellDTO = b12.get(i15);
                u11.o(-2002722782);
                boolean n12 = u11.n(pVar2) | u11.r(i15);
                Object C14 = u11.C();
                if (n12 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new j(pVar2, i15);
                    u11.x(C14);
                }
                u11.k();
                DsCellAtomKt.DsCellAtom(cellDTO, null, (Function1) C14, u11, CellDTO.$stable, 2);
            }
            u11.k();
            u11.f();
            u11.o(-1798308178);
            if (((n) c11.getValue()).i() != null) {
                ru.ozon.android.messenger.framework.presentation.common.utils.a.a(16, u11);
                String c12 = ((n) c11.getValue()).c();
                String i16 = ((n) c11.getValue()).i();
                if (i16 == null) {
                    i16 = "";
                }
                String str = i16;
                DsTextAreaStatus dsTextAreaStatus = ((n) c11.getValue()).k() ? DsTextAreaStatus.DISABLED : ((n) c11.getValue()).f() ? DsTextAreaStatus.ERROR : DsTextAreaStatus.DEFAULT;
                C3422b c3422b = (!((n) c11.getValue()).f() || (h11 = ((n) c11.getValue()).h()) == null) ? null : new C3422b(6, h11, null);
                androidx.compose.ui.e b13 = a0.b(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), 0.0f, DsSpacings.INSTANCE.m1858getDp56D9Ej5fM(), 1);
                Integer g13 = ((n) c11.getValue()).g();
                int intValue = g13 != null ? g13.intValue() : 1000;
                u11.o(-1798305037);
                boolean n13 = u11.n(pVar2);
                Object C15 = u11.C();
                if (n13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new k(pVar2);
                    u11.x(C15);
                }
                u11.k();
                c3969l = u11;
                DsTextAreaKt.m1820DsTextAreas9ZHXeI((Function1) C15, c12, str, dsTextAreaStatus, b13, c3422b, 0, 5, intValue, null, false, true, true, true, null, null, null, null, null, null, null, null, null, c3969l, 12582912, 3504, 0, 8373824);
            } else {
                c3969l = u11;
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new l(item, iVar, pVar2, i11));
        }
    }
}
