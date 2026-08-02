package ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7835n0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.common.ExtKt;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsVO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import v0.C10164d;
import v0.I;
import v0.M;
import x1.L;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a3\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aE\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001e\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "SelectionReactions", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "SelectionReactionsContent", "", "voId", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "block", "RightControlsBlock", "(JLru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "scrollGradientColor", "LeftControlsBlock-uDo3WH8", "(Landroidx/compose/ui/e;JLru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;JLkotlin/jvm/functions/Function1;LS0/k;II)V", "LeftControlsBlock", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;", "controlVO", "ControlItem", "(JLru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "dto", "LWZ/l;", "tokenizedAnalytics", "withInputAndTracking", "(Landroidx/compose/ui/e;JLru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;LWZ/l;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ModifierParameter"})
/* loaded from: classes2.dex */
public final class SelectionReactionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ControlItem(long j11, SelectionReactionsVO.ReactionsControlVO reactionsControlVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(793416755);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(reactionsControlVO) : u11.F(reactionsControlVO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            ButtonsDTO dto = reactionsControlVO.getDto();
            e withInputAndTracking = withInputAndTracking(e.f40358c0, j11, reactionsControlVO, dto, (l) u11.m(f.e()), function1);
            if (dto instanceof ButtonV3DTO) {
                u11.o(-1937432394);
                DsButtonAtomKt.DsButtonAtom((ButtonV3DTO) dto, withInputAndTracking, false, null, u11, 0, 12);
                u11.k();
            } else if (dto instanceof IconButtonV3DTO) {
                u11.o(-1937357870);
                DsIconButtonAtomKt.DsIconButtonAtom((IconButtonV3DTO) dto, withInputAndTracking, false, null, u11, IconButtonV3DTO.$stable, 12);
                u11.k();
            } else {
                u11.o(-893777372);
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SelectionReactionsKt$ControlItem$1(j11, reactionsControlVO, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008a  */
    /* renamed from: LeftControlsBlock-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1513LeftControlsBlockuDo3WH8(e eVar, long j11, SelectionReactionsVO.ReactionsBlockVO reactionsBlockVO, long j12, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        long j13;
        boolean z11;
        Object C11;
        long j14;
        boolean z12;
        Object C12;
        long j15;
        int I11;
        boolean F11;
        Object C13;
        C3969l c3969l;
        boolean n11;
        Object C14;
        boolean n12;
        Object C15;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1319965237);
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
            i13 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(reactionsBlockVO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            j13 = j12;
            i13 |= u11.s(j13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.F(function1) ? 16384 : 8192;
            }
            if ((i13 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                I c11 = M.c(0, 0, u11, 3);
                u11.o(1793553750);
                int i15 = i13 & 7168;
                z11 = i15 != 2048;
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                    C7807Z m11 = C7807Z.m(j13);
                    j14 = C7807Z.f72258l;
                    C7835n0 a11 = AbstractC7799Q.a.a(aVar, C7714v.b0(m11, C7807Z.m(j14)), 0.0f, 0.0f, 14);
                    u11.x(a11);
                    C11 = a11;
                }
                AbstractC7799Q abstractC7799Q = (AbstractC7799Q) C11;
                u11.k();
                u11.o(1793559510);
                z12 = i15 != 2048;
                C12 = u11.C();
                if (!z12 || C12 == InterfaceC3967k.a.a()) {
                    AbstractC7799Q.a aVar2 = AbstractC7799Q.Companion;
                    j15 = C7807Z.f72258l;
                    C12 = AbstractC7799Q.a.a(aVar2, C7714v.b0(C7807Z.m(j15), C7807Z.m(j13)), 0.0f, 0.0f, 14);
                    u11.x(C12);
                }
                AbstractC7799Q abstractC7799Q2 = (AbstractC7799Q) C12;
                u11.k();
                e f7 = a0.f(eVar4, reactionsBlockVO.getButtonsHeight());
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, f7);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f13 = E.f(u11, f11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                e.a aVar3 = e.f40358c0;
                e c12 = a0.c(a0.x(aVar3, null, 3));
                int i16 = C5179b.f39454h;
                SelectionReactionsDefaults selectionReactionsDefaults = SelectionReactionsDefaults.INSTANCE;
                C5179b.i n13 = C5179b.n(selectionReactionsDefaults.m1509getCONTROLS_SPACINGD9Ej5fM());
                int i17 = i13;
                d.b i18 = InterfaceC6250b.a.i();
                u11.o(-51397097);
                e eVar5 = eVar4;
                F11 = ((i17 & 112) != 32) | u11.F(reactionsBlockVO) | ((i17 & 57344) != 16384);
                C13 = u11.C();
                if (!F11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new SelectionReactionsKt$LeftControlsBlock$1$1$1(reactionsBlockVO, j11, function1);
                    u11.x(C13);
                }
                u11.k();
                C10164d.b(c12, c11, null, n13, i18, null, false, (Function1) C13, u11, 221190, 204);
                c3969l = u11;
                e c13 = a0.c(a0.r(c5187j.a(aVar3, InterfaceC6250b.a.h()), selectionReactionsDefaults.m1512getGRADIENT_WIDTHD9Ej5fM()));
                c3969l.o(-51386018);
                n11 = c3969l.n(c11);
                C14 = c3969l.C();
                if (!n11 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new SelectionReactionsKt$LeftControlsBlock$1$2$1(c11);
                    c3969l.x(C14);
                }
                c3969l.k();
                C5185h.a(androidx.compose.foundation.e.a(androidx.compose.ui.graphics.a.a(c13, (Function1) C14), abstractC7799Q, null, 6), c3969l, 0);
                e c14 = a0.c(a0.r(c5187j.a(aVar3, InterfaceC6250b.a.f()), selectionReactionsDefaults.m1512getGRADIENT_WIDTHD9Ej5fM()));
                c3969l.o(-51374691);
                n12 = c3969l.n(c11);
                C15 = c3969l.C();
                if (!n12 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new SelectionReactionsKt$LeftControlsBlock$1$3$1(c11);
                    c3969l.x(C15);
                }
                c3969l.k();
                C5185h.a(androidx.compose.foundation.e.a(androidx.compose.ui.graphics.a.a(c14, (Function1) C15), abstractC7799Q2, null, 6), c3969l, 0);
                c3969l.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                c3969l = u11;
                eVar3 = eVar2;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new SelectionReactionsKt$LeftControlsBlock$2(eVar3, j11, reactionsBlockVO, j12, function1, i11, i12));
                return;
            }
            return;
        }
        j13 = j12;
        if ((i12 & 16) == 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        if (i14 == 0) {
        }
        I c112 = M.c(0, 0, u11, 3);
        u11.o(1793553750);
        int i152 = i13 & 7168;
        if (i152 != 2048) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        AbstractC7799Q.a aVar4 = AbstractC7799Q.Companion;
        C7807Z m112 = C7807Z.m(j13);
        j14 = C7807Z.f72258l;
        C7835n0 a112 = AbstractC7799Q.a.a(aVar4, C7714v.b0(m112, C7807Z.m(j14)), 0.0f, 0.0f, 14);
        u11.x(a112);
        C11 = a112;
        AbstractC7799Q abstractC7799Q3 = (AbstractC7799Q) C11;
        u11.k();
        u11.o(1793559510);
        if (i152 != 2048) {
        }
        C12 = u11.C();
        if (!z12) {
        }
        AbstractC7799Q.a aVar22 = AbstractC7799Q.Companion;
        j15 = C7807Z.f72258l;
        C12 = AbstractC7799Q.a.a(aVar22, C7714v.b0(C7807Z.m(j15), C7807Z.m(j13)), 0.0f, 0.0f, 14);
        u11.x(C12);
        AbstractC7799Q abstractC7799Q22 = (AbstractC7799Q) C12;
        u11.k();
        e f72 = a0.f(eVar4, reactionsBlockVO.getButtonsHeight());
        V f112 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, f72);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        e.a aVar32 = e.f40358c0;
        e c122 = a0.c(a0.x(aVar32, null, 3));
        int i162 = C5179b.f39454h;
        SelectionReactionsDefaults selectionReactionsDefaults2 = SelectionReactionsDefaults.INSTANCE;
        C5179b.i n132 = C5179b.n(selectionReactionsDefaults2.m1509getCONTROLS_SPACINGD9Ej5fM());
        int i172 = i13;
        d.b i182 = InterfaceC6250b.a.i();
        u11.o(-51397097);
        e eVar52 = eVar4;
        F11 = ((i172 & 112) != 32) | u11.F(reactionsBlockVO) | ((i172 & 57344) != 16384);
        C13 = u11.C();
        if (!F11) {
        }
        C13 = new SelectionReactionsKt$LeftControlsBlock$1$1$1(reactionsBlockVO, j11, function1);
        u11.x(C13);
        u11.k();
        C10164d.b(c122, c112, null, n132, i182, null, false, (Function1) C13, u11, 221190, 204);
        c3969l = u11;
        e c132 = a0.c(a0.r(c5187j2.a(aVar32, InterfaceC6250b.a.h()), selectionReactionsDefaults2.m1512getGRADIENT_WIDTHD9Ej5fM()));
        c3969l.o(-51386018);
        n11 = c3969l.n(c112);
        C14 = c3969l.C();
        if (!n11) {
        }
        C14 = new SelectionReactionsKt$LeftControlsBlock$1$2$1(c112);
        c3969l.x(C14);
        c3969l.k();
        C5185h.a(androidx.compose.foundation.e.a(androidx.compose.ui.graphics.a.a(c132, (Function1) C14), abstractC7799Q3, null, 6), c3969l, 0);
        e c142 = a0.c(a0.r(c5187j2.a(aVar32, InterfaceC6250b.a.f()), selectionReactionsDefaults2.m1512getGRADIENT_WIDTHD9Ej5fM()));
        c3969l.o(-51374691);
        n12 = c3969l.n(c112);
        C15 = c3969l.C();
        if (!n12) {
        }
        C15 = new SelectionReactionsKt$LeftControlsBlock$1$3$1(c112);
        c3969l.x(C15);
        c3969l.k();
        C5185h.a(androidx.compose.foundation.e.a(androidx.compose.ui.graphics.a.a(c142, (Function1) C15), abstractC7799Q22, null, 6), c3969l, 0);
        c3969l.f();
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RightControlsBlock(long j11, SelectionReactionsVO.ReactionsBlockVO reactionsBlockVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        SelectionReactionsVO.ReactionsBlockVO reactionsBlockVO2;
        Function1<? super AtomAction, Unit> function12;
        C3969l u11 = interfaceC3967k.u(-300996708);
        long j12 = j11;
        int i12 = (i11 & 6) == 0 ? (u11.s(j12) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            reactionsBlockVO2 = reactionsBlockVO;
            i12 |= u11.F(reactionsBlockVO2) ? 32 : 16;
        } else {
            reactionsBlockVO2 = reactionsBlockVO;
        }
        if ((i11 & 384) == 0) {
            function12 = function1;
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            function12 = function1;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e x11 = a0.x(a0.f(aVar, reactionsBlockVO2.getButtonsHeight()), null, 3);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, x11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e c11 = a0.c(a0.x(aVar, null, 3));
            int i13 = C5179b.f39454h;
            Y b11 = X.b(C5179b.n(SelectionReactionsDefaults.INSTANCE.m1509getCONTROLS_SPACINGD9Ej5fM()), InterfaceC6250b.a.i(), u11, 54);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, c11);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            u11.o(-853502556);
            for (SelectionReactionsVO.ReactionsControlVO reactionsControlVO : reactionsBlockVO2.getControls()) {
                u11.G(951432910, reactionsControlVO.getKey());
                ControlItem(j12, reactionsControlVO, function12, u11, (i12 & 14) | ((ButtonsDTO.$stable | AtomAction.$stable) << 3) | (i12 & 896));
                u11.J();
                j12 = j11;
                function12 = function1;
            }
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SelectionReactionsKt$RightControlsBlock$2(j11, reactionsBlockVO2, function1, i11));
        }
    }

    public static final void SelectionReactions(@NotNull SelectionReactionsVO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1348490870);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-196032846);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(728640301);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SelectionReactionsKt$SelectionReactions$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            SelectionReactionsContent(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SelectionReactionsKt$SelectionReactions$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionReactionsContent(SelectionReactionsVO selectionReactionsVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Function1<? super AtomAction, Unit> function12 = function1;
        C3969l u11 = interfaceC3967k.u(-1906617481);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(selectionReactionsVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function12) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(selectionReactionsVO.getBackgroundColor(), u11, 0);
            u11.o(1142214190);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(selectionReactionsVO.getStrokeColor(), u11, 0);
            u11.o(1142217074);
            long graphicStrokeSticky = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicStrokeSticky() : c7807z2.w();
            u11.k();
            C7807Z c7807z3 = TokenParserKt.tokenToColor(selectionReactionsVO.getScrollGradientColor(), u11, 0);
            u11.o(1142220338);
            long layerFloor12 = c7807z3 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z3.w();
            u11.k();
            CornerRadius cornerRadius = selectionReactionsVO.getCornerRadius();
            float m1866getDpD9Ej5fM = cornerRadius != null ? cornerRadius.m1866getDpD9Ej5fM() : SelectionReactionsDefaults.INSTANCE.m1510getDEFAULT_CORNER_RADIUSD9Ej5fM();
            e m1482addStrokey6ga9Xk$default = ExtKt.m1482addStrokey6ga9Xk$default(androidx.compose.foundation.e.b(a0.u(a0.e(e.f40358c0, 1.0f), 3), layerFloor1, h.d(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, 0.0f, 0.0f, 12)), graphicStrokeSticky, 0.0f, m1866getDpD9Ej5fM, 2, null);
            SelectionReactionsDefaults selectionReactionsDefaults = SelectionReactionsDefaults.INSTANCE;
            e f7 = T.f(m1482addStrokey6ga9Xk$default, selectionReactionsDefaults.m1511getDEFAULT_PADDINGD9Ej5fM());
            int i14 = C5179b.f39454h;
            Y b11 = X.b(C5179b.n(selectionReactionsDefaults.m1509getCONTROLS_SPACINGD9Ej5fM()), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, f7);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            SelectionReactionsVO.ReactionsBlockVO leftBlock = selectionReactionsVO.getReactions().getLeftBlock();
            u11.o(-629494112);
            if (leftBlock == null) {
                c3969l = u11;
            } else {
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                c3969l = u11;
                m1513LeftControlsBlockuDo3WH8(T.j(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, selectionReactionsDefaults.m1509getCONTROLS_SPACINGD9Ej5fM(), 0.0f, 11), selectionReactionsVO.getId(), leftBlock, layerFloor12, function1, c3969l, 57344 & (i13 << 9), 0);
            }
            c3969l.k();
            SelectionReactionsVO.ReactionsBlockVO rightBlock = selectionReactionsVO.getReactions().getRightBlock();
            c3969l.o(-629481121);
            if (rightBlock == null) {
                function12 = function1;
            } else {
                function12 = function1;
                RightControlsBlock(selectionReactionsVO.getId(), rightBlock, function12, c3969l, (i13 << 3) & 896);
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new SelectionReactionsKt$SelectionReactionsContent$2(selectionReactionsVO, function12, i11));
        }
    }

    private static final e withInputAndTracking(e eVar, long j11, SelectionReactionsVO.ReactionsControlVO reactionsControlVO, ButtonsDTO buttonsDTO, l lVar, Function1<? super AtomAction, Unit> function1) {
        Object[] objArr = {Long.valueOf(j11), reactionsControlVO, buttonsDTO, lVar, function1};
        SelectionReactionsKt$withInputAndTracking$1 selectionReactionsKt$withInputAndTracking$1 = new SelectionReactionsKt$withInputAndTracking$1(reactionsControlVO, function1, buttonsDTO, j11, lVar, null);
        int i11 = L.f104834b;
        return eVar.l0(new SuspendPointerInputElement(null, null, objArr, selectionReactionsKt$withInputAndTracking$1, 3));
    }
}
