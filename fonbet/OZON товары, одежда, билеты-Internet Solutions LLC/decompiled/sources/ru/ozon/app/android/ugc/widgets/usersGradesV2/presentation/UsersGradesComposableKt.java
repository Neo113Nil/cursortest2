package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "item", "Lkotlin/Function1;", "", "onClick", "UsersGradesComposable", "(Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersGradesComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UsersGradesComposable(@NotNull ContextQuestionItemVO item, Function1<? super ContextQuestionItemVO, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super ContextQuestionItemVO, Unit> function12;
        Function1<? super ContextQuestionItemVO, Unit> function13;
        e b11;
        boolean F11;
        Object C11;
        Object C12;
        int I11;
        List<ContextQuestionItemVO.ContextAnswerItem> contextAnswers;
        List<ContextQuestionItemVO.ContextAnswerItem> list;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(184040381);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                if (i14 == 0) {
                    u11.o(-1241991570);
                    Object C13 = u11.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                        C13 = UsersGradesComposableKt$UsersGradesComposable$1$1.INSTANCE;
                        u11.x(C13);
                    }
                    u11.k();
                    function13 = (Function1) C13;
                } else {
                    function13 = function12;
                }
                e.a aVar = e.f40358c0;
                e u12 = a0.u(a0.e(aVar, 1.0f), 3);
                C7807Z parseColorToken = TokenParserKt.parseColorToken(item.getRootBackgroundColor(), u11, 0);
                b11 = androidx.compose.foundation.e.b(u12, parseColorToken == null ? parseColorToken.w() : C7807Z.f72259m, y0.a());
                float f7 = 16;
                float f11 = 8;
                e j11 = T.j(b11, f7, 0.0f, f7, f11, 2);
                C7807Z parseColorToken2 = TokenParserKt.parseColorToken(item.getItemBackgroundColor(), u11, 0);
                e j12 = T.j(androidx.compose.foundation.e.b(j11, parseColorToken2 == null ? parseColorToken2.w() : C7807Z.f72259m, h.a(item.getRootCornerRadius())), f11, 0.0f, f11, item.getBottomPadding(), 2);
                u11.o(-1241966371);
                F11 = ((i13 & 112) != 32) | u11.F(item);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new UsersGradesComposableKt$UsersGradesComposable$2$1(function13, item);
                    u11.x(C11);
                }
                u11.k();
                e b12 = i.b(j12, null, null, false, null, null, (Function0) C11, 28);
                u11.o(-1241964565);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = UsersGradesComposableKt$UsersGradesComposable$3$1.INSTANCE;
                    u11.x(C12);
                }
                u11.k();
                e c11 = o.c(b12, false, (Function1) C12);
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 6);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, c11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                DsCellAtomKt.DsCellAtom(item.getCell(), T.j(aVar, 0.0f, f11, 0.0f, 0.0f, 13), null, u11, CellDTO.$stable | 48, 4);
                contextAnswers = item.getContextAnswers();
                u11.o(-685085063);
                list = contextAnswers;
                if (list != null && !list.isEmpty()) {
                    G.b(item.getIsUnfolded(), null, androidx.compose.animation.b.g(null, 15), androidx.compose.animation.b.n(null, 15), null, a1.c.c(-1419695834, new UsersGradesComposableKt$UsersGradesComposable$4$1(contextAnswers), u11), u11, 1600518, 18);
                    u11 = u11;
                }
                u11.k();
                u11.f();
            } else {
                u11.j();
                function13 = function12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new UsersGradesComposableKt$UsersGradesComposable$5(item, function13, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        e.a aVar2 = e.f40358c0;
        e u122 = a0.u(a0.e(aVar2, 1.0f), 3);
        C7807Z parseColorToken3 = TokenParserKt.parseColorToken(item.getRootBackgroundColor(), u11, 0);
        b11 = androidx.compose.foundation.e.b(u122, parseColorToken3 == null ? parseColorToken3.w() : C7807Z.f72259m, y0.a());
        float f72 = 16;
        float f112 = 8;
        e j112 = T.j(b11, f72, 0.0f, f72, f112, 2);
        C7807Z parseColorToken22 = TokenParserKt.parseColorToken(item.getItemBackgroundColor(), u11, 0);
        e j122 = T.j(androidx.compose.foundation.e.b(j112, parseColorToken22 == null ? parseColorToken22.w() : C7807Z.f72259m, h.a(item.getRootCornerRadius())), f112, 0.0f, f112, item.getBottomPadding(), 2);
        u11.o(-1241966371);
        F11 = ((i13 & 112) != 32) | u11.F(item);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new UsersGradesComposableKt$UsersGradesComposable$2$1(function13, item);
        u11.x(C11);
        u11.k();
        e b122 = i.b(j122, null, null, false, null, null, (Function0) C11, 28);
        u11.o(-1241964565);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c112 = o.c(b122, false, (Function1) C12);
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, c112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        DsCellAtomKt.DsCellAtom(item.getCell(), T.j(aVar2, 0.0f, f112, 0.0f, 0.0f, 13), null, u11, CellDTO.$stable | 48, 4);
        contextAnswers = item.getContextAnswers();
        u11.o(-685085063);
        list = contextAnswers;
        if (list != null) {
            G.b(item.getIsUnfolded(), null, androidx.compose.animation.b.g(null, 15), androidx.compose.animation.b.n(null, 15), null, a1.c.c(-1419695834, new UsersGradesComposableKt$UsersGradesComposable$4$1(contextAnswers), u11), u11, 1600518, 18);
            u11 = u11;
        }
        u11.k();
        u11.f();
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
