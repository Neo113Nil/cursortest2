package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.utlis.ComposeUtilsKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "", "actionHandler", "TopAuthorHeader", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopAuthorHeader(e eVar, @NotNull TextDTO text, CellDTO cellDTO, AtomAction atomAction, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        int I11;
        Object C11;
        int I12;
        e eVar3;
        Function1<? super AtomAction, Unit> function14;
        C3969l c3969l;
        Function1<? super AtomAction, Unit> function15;
        J0 m02;
        AtomAction atomAction2 = atomAction;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(-1424988023);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(text) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(cellDTO) : u11.F(cellDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? u11.n(atomAction2) : u11.F(atomAction2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i12 & 16;
        if (i16 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 16384 : 8192;
            if ((i13 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                if (i15 != 0) {
                    atomAction2 = null;
                }
                if (i16 == 0) {
                    u11.o(872642034);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = TopAuthorHeaderKt$TopAuthorHeader$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    function13 = (Function1) C12;
                    u11.k();
                } else {
                    function13 = function12;
                }
                AbstractC8972b a11 = G1.e.a(R$drawable.ic_top_author_wreath, u11, 0);
                e clickableAtomAction = ComposeUtilsKt.clickableAtomAction(a0.e(a0.u(eVar4, 3), 1.0f), atomAction2, function13);
                Y b11 = X.b(C5179b.b(), InterfaceC6250b.a.l(), u11, 6);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, clickableAtomAction);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                e.a aVar = e.f40358c0;
                u11.o(1146550559);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = TopAuthorHeaderKt$TopAuthorHeader$2$1$1.INSTANCE;
                    u11.x(C11);
                }
                u11.k();
                int i17 = i13;
                C8366G.a(a11, null, androidx.compose.ui.graphics.a.a(aVar, (Function1) C11), null, null, 0.0f, null, u11, 432, 120);
                C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f11 = c.f(u11, aVar);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 g10 = b.g(u11, a13, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, g10);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(text, ComposeUtilsKt.clickableAtomAction(aVar, atomAction2, function13), u11, (i17 >> 3) & 14, 0);
                u11.o(1636327002);
                if (cellDTO != null) {
                    function14 = function13;
                    eVar3 = eVar4;
                    c3969l = u11;
                } else {
                    e c11 = M.c(aVar, EnumC9909s.Max);
                    u11.o(-621975722);
                    boolean z11 = ((i17 & 7168) == 2048 || ((i17 & 4096) != 0 && u11.F(atomAction2))) | ((57344 & i17) == 16384);
                    Object C13 = u11.C();
                    if (z11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new TopAuthorHeaderKt$TopAuthorHeader$2$2$1$1$1(atomAction2, function13);
                        u11.x(C13);
                    }
                    u11.k();
                    eVar3 = eVar4;
                    function14 = function13;
                    DsCellAtomKt.DsCellAtom(cellDTO, c11, (Function1) C13, u11, CellDTO.$stable | 48, 0);
                    c3969l = u11;
                    Unit unit = Unit.f71690a;
                }
                c3969l.k();
                c3969l.f();
                C8366G.a(a11, null, null, null, null, 0.0f, null, c3969l, 48, 124);
                c3969l.f();
                function15 = function14;
            } else {
                u11.j();
                c3969l = u11;
                eVar3 = eVar2;
                function15 = function12;
            }
            AtomAction atomAction3 = atomAction2;
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new TopAuthorHeaderKt$TopAuthorHeader$3(eVar3, text, cellDTO, atomAction3, function15, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i13 & 9363) == 9362) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        AbstractC8972b a112 = G1.e.a(R$drawable.ic_top_author_wreath, u11, 0);
        e clickableAtomAction2 = ComposeUtilsKt.clickableAtomAction(a0.e(a0.u(eVar4, 3), 1.0f), atomAction2, function13);
        Y b112 = X.b(C5179b.b(), InterfaceC6250b.a.l(), u11, 6);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, clickableAtomAction2);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        e.a aVar2 = e.f40358c0;
        u11.o(1146550559);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        int i172 = i13;
        C8366G.a(a112, null, androidx.compose.ui.graphics.a.a(aVar2, (Function1) C11), null, null, 0.0f, null, u11, 432, 120);
        C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f112 = c.f(u11, aVar2);
        Function0 a142 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a132, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, g102);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(text, ComposeUtilsKt.clickableAtomAction(aVar2, atomAction2, function13), u11, (i172 >> 3) & 14, 0);
        u11.o(1636327002);
        if (cellDTO != null) {
        }
        c3969l.k();
        c3969l.f();
        C8366G.a(a112, null, null, null, null, 0.0f, null, c3969l, 48, 124);
        c3969l.f();
        function15 = function14;
        AtomAction atomAction32 = atomAction2;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
