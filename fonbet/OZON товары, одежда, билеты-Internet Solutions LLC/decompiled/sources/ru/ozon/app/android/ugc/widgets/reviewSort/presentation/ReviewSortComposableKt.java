package ru.ozon.app.android.ugc.widgets.reviewSort.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u0014\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "item", "", "isSelect", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "buttonAction", "Landroidx/compose/ui/e;", "modifier", "ReviewSortComposable", "(Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "ReviewSortList", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewSortComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:25:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewSortComposable(@NotNull ReviewSortVO item, boolean z11, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super AtomAction, Unit> buttonAction, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        int I11;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        C3969l u11 = interfaceC3967k.u(-1542549973);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onAction) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(buttonAction) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 16384 : 8192;
            i14 = i13;
            if ((i14 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                e e11 = a0.e(eVar4, 1.0f);
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, e11);
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
                F1.b(u11, f7, InterfaceC2801g.a.f());
                TextDTO title = item.getTitle();
                e.a aVar = e.f40358c0;
                DsTextAtomKt.DsTextAtom(title, a0.e(aVar, 1.0f), u11, 48, 0);
                List<CellDTO> cells = item.getCells();
                String backgroundColor = item.getBackgroundColor();
                CornerRadius cornerRadius = item.getCornerRadius();
                e e12 = a0.e(aVar, 1.0f);
                Paddings paddings = Paddings.PADDING_500;
                ReviewSortList(cells, backgroundColor, cornerRadius, z11, onAction, T.h(e12, paddings.m1867getDpD9Ej5fM(), 0.0f, 2), u11, (i14 << 6) & 64512, 0);
                E.a(u11, a0.f(aVar, !z11 ? Paddings.PADDING_250.m1867getDpD9Ej5fM() : paddings.m1867getDpD9Ej5fM()));
                DsButtonAtomKt.DsButtonAtom(item.getApplyButton(), T.h(a0.e(aVar, 1.0f), paddings.m1867getDpD9Ej5fM(), 0.0f, 2), false, buttonAction, u11, i14 & 7168, 4);
                u11 = u11;
                E.a(u11, a0.f(aVar, Paddings.PADDING_700.m1867getDpD9Ej5fM()));
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new ReviewSortComposableKt$ReviewSortComposable$2(item, z11, onAction, buttonAction, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13;
        if ((i14 & 9363) == 9362) {
        }
        if (i15 == 0) {
        }
        e e112 = a0.e(eVar4, 1.0f);
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, e112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        TextDTO title2 = item.getTitle();
        e.a aVar2 = e.f40358c0;
        DsTextAtomKt.DsTextAtom(title2, a0.e(aVar2, 1.0f), u11, 48, 0);
        List<CellDTO> cells2 = item.getCells();
        String backgroundColor2 = item.getBackgroundColor();
        CornerRadius cornerRadius2 = item.getCornerRadius();
        e e122 = a0.e(aVar2, 1.0f);
        Paddings paddings2 = Paddings.PADDING_500;
        ReviewSortList(cells2, backgroundColor2, cornerRadius2, z11, onAction, T.h(e122, paddings2.m1867getDpD9Ej5fM(), 0.0f, 2), u11, (i14 << 6) & 64512, 0);
        E.a(u11, a0.f(aVar2, !z11 ? Paddings.PADDING_250.m1867getDpD9Ej5fM() : paddings2.m1867getDpD9Ej5fM()));
        DsButtonAtomKt.DsButtonAtom(item.getApplyButton(), T.h(a0.e(aVar2, 1.0f), paddings2.m1867getDpD9Ej5fM(), 0.0f, 2), false, buttonAction, u11, i14 & 7168, 4);
        u11 = u11;
        E.a(u11, a0.f(aVar2, Paddings.PADDING_700.m1867getDpD9Ej5fM()));
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d A[LOOP:0: B:47:0x0157->B:49:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewSortList(List<CellDTO> list, String str, CornerRadius cornerRadius, boolean z11, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        CornerRadius cornerRadius2;
        Function1<? super AtomAction, Unit> function12;
        e eVar2;
        int I11;
        Iterator<T> it;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-186763676);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(list) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
            cornerRadius2 = cornerRadius;
        } else {
            cornerRadius2 = cornerRadius;
            if ((i11 & 384) == 0) {
                i13 |= u11.n(cornerRadius2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i11 & 24576) == 0) {
                i13 |= u11.F(function12) ? 16384 : 8192;
            }
        }
        int i14 = i12 & 32;
        if (i14 != 0) {
            i13 |= 196608;
        } else if ((196608 & i11) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 131072 : 65536;
            if ((74899 & i13) == 74898 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                C7807Z c7807z = TokenParserKt.tokenToColor(str, u11, (i13 >> 3) & 14);
                u11.o(-443194674);
                long bgSecondary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z.w();
                u11.k();
                e g10 = T.g(androidx.compose.foundation.e.b(eVar4, bgSecondary, h.b(cornerRadius2.m1866getDpD9Ej5fM())), !z11 ? 0 : Paddings.PADDING_500.m1867getDpD9Ej5fM(), Paddings.PADDING_200.m1867getDpD9Ej5fM());
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, g10);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g11 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g11);
                }
                i.b(u11, f7, 1014275192);
                it = list.iterator();
                while (it.hasNext()) {
                    DsCellAtomKt.DsCellAtom((CellDTO) it.next(), null, function12, u11, CellDTO.$stable | ((i13 >> 6) & 896), 2);
                    function12 = function1;
                }
                u11.k();
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new ReviewSortComposableKt$ReviewSortList$2(list, str, cornerRadius2, z11, function1, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((74899 & i13) == 74898) {
        }
        if (i14 == 0) {
        }
        C7807Z c7807z2 = TokenParserKt.tokenToColor(str, u11, (i13 >> 3) & 14);
        u11.o(-443194674);
        if (c7807z2 != null) {
        }
        u11.k();
        e g102 = T.g(androidx.compose.foundation.e.b(eVar4, bgSecondary, h.b(cornerRadius2.m1866getDpD9Ej5fM())), !z11 ? 0 : Paddings.PADDING_500.m1867getDpD9Ej5fM(), Paddings.PADDING_200.m1867getDpD9Ej5fM());
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, g102);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g112 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g112);
        i.b(u11, f72, 1014275192);
        it = list.iterator();
        while (it.hasNext()) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
