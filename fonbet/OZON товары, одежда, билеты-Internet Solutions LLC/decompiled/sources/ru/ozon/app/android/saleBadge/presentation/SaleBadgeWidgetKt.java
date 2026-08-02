package ru.ozon.app.android.saleBadge.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import Pk0.h;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import S1.p;
import T7.E;
import U7.i;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import e3.C6285b;
import f3.AbstractC6409a;
import g3.C6617b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l1.C7795M;
import l1.C7807Z;
import l1.C7809a0;
import l1.y0;
import l10.InterfaceC7851b;
import m0.C7980b;
import m0.C7984d;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.compose.TimerMoleculeWidgetKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006!²\u0006\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "state", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "SaleBadgeWidget", "(Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeViewModel;", "viewModel", "SaleBadgeContent", "(Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/saleBadge/presentation/SaleBadgeViewModel;LS0/k;II)V", "", "labelAlpha", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;", "labelAnimation", "BadgeContentWithAnimLabels", "(FLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;LS0/k;I)V", "", "withoutStart", "TextAndTimer", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;ZLS0/k;II)V", "LA00/a;", "composerEvent", "isRefreshing", "savedAnimProgress", "savedAnimAlpha", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaleBadgeWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgeContentWithAnimLabels(float f7, TextDTO textDTO, TimerVO timerVO, SaleBadgeVO.LabelAnimation labelAnimation, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        TimerVO timerVO2;
        SaleBadgeVO.LabelAnimation labelAnimation2;
        C3969l u11 = interfaceC3967k.u(-1459900989);
        if ((i11 & 6) == 0) {
            i12 = (u11.q(f7) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(textDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            timerVO2 = timerVO;
            i12 |= u11.n(timerVO2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            timerVO2 = timerVO;
        }
        if ((i11 & 3072) == 0) {
            labelAnimation2 = labelAnimation;
            i12 |= u11.n(labelAnimation2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            labelAnimation2 = labelAnimation;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.o(1269653507);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = Boolean.valueOf(f7 == 0.0f);
                u11.x(C11);
            }
            boolean booleanValue = ((Boolean) C11).booleanValue();
            u11.k();
            d h11 = InterfaceC6250b.a.h();
            e.a aVar = e.f40358c0;
            V f11 = C5185h.f(h11, false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, aVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            i.b(u11, f12, -1070107741);
            boolean z12 = i13 == 4;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new SaleBadgeWidgetKt$BadgeContentWithAnimLabels$1$1$1(f7);
                u11.x(C12);
            }
            u11.k();
            e a12 = androidx.compose.ui.graphics.a.a(aVar, (Function1) C12);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            TextAndTimer(textDTO, timerVO2, false, u11, (i12 >> 3) & 126, 4);
            u11.f();
            u11.o(-1070103010);
            boolean z13 = i13 == 4;
            Object C13 = u11.C();
            if (z13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new SaleBadgeWidgetKt$BadgeContentWithAnimLabels$1$3$1(f7);
                u11.x(C13);
            }
            u11.k();
            e a14 = androidx.compose.ui.graphics.a.a(aVar, (Function1) C13);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f15 = c.f(u11, a14);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 h13 = Cm.e.h(u11, b12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, h13);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            TextAndTimer(labelAnimation2.getText(), booleanValue ? labelAnimation2.getTimerForMeasure() : labelAnimation2.getTimer(), booleanValue, u11, 0, 0);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SaleBadgeWidgetKt$BadgeContentWithAnimLabels$2(f7, textDTO, timerVO, labelAnimation2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a4, code lost:
    
        if (r5 == S0.InterfaceC3967k.a.a()) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e4, code lost:
    
        if (r9 == S0.InterfaceC3967k.a.a()) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0246, code lost:
    
        if (r3 == S0.InterfaceC3967k.a.a()) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SaleBadgeContent(SaleBadgeVO saleBadgeVO, e eVar, Function1<? super AtomAction, Unit> function1, SaleBadgeViewModel saleBadgeViewModel, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        String color;
        C7807Z c7807z;
        Object b11;
        Object b12;
        boolean F11;
        Object saleBadgeWidgetKt$SaleBadgeContent$1$1;
        float f7;
        C7807Z c7807z2;
        int i15;
        d.a aVar;
        int i16;
        Object obj;
        e b13;
        int i17;
        Object obj2;
        String automatizationId;
        int i18;
        Object obj3;
        int I11;
        CommonAtomIconDTO leftIcon;
        int i19;
        e eVar3;
        C7795M c7795m;
        int i21;
        C7795M c7795m2;
        C3969l c3969l;
        C3969l c3969l2;
        C3969l c3969l3;
        CommonAtomIconDTO rightIcon;
        C3969l c3969l4;
        e eVar4;
        J0 m02;
        SaleBadgeVO saleBadgeVO2 = saleBadgeVO;
        C3969l u11 = interfaceC3967k.u(1221646985);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(saleBadgeVO2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(saleBadgeViewModel) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i14 = i13;
            if ((i14 & 1171) == 1170 || !u11.b()) {
                e eVar5 = i22 == 0 ? e.f40358c0 : eVar2;
                C7807Z c7807z3 = TokenParserKt.tokenToColor(saleBadgeVO2.getBackground(), u11, 0);
                long w11 = c7807z3 == null ? c7807z3.w() : C7807Z.f72258l;
                float pxF = UiExtKt.toPxF(2);
                if (p.a(u11)) {
                    SaleBadgeVO.BackgroundOverlay backgroundOverlay = saleBadgeVO2.getBackgroundOverlay();
                    if (backgroundOverlay != null) {
                        color = backgroundOverlay.getColor();
                        u11.o(1484789512);
                        if (color != null) {
                        }
                        b11 = h.b(u11, 1484791223);
                        Object obj4 = b11;
                        if (b11 == InterfaceC3967k.a.a()) {
                        }
                        C7980b c7980b = (C7980b) obj4;
                        b12 = h.b(u11, 1484795142);
                        Object obj5 = b12;
                        if (b12 == InterfaceC3967k.a.a()) {
                        }
                        C7980b c7980b2 = (C7980b) obj5;
                        u11.k();
                        u11.o(1484798536);
                        int i23 = i14 & 14;
                        F11 = u11.F(saleBadgeViewModel) | u11.F(c7980b) | (i23 != 4) | u11.F(c7980b2);
                        Object C11 = u11.C();
                        if (F11) {
                        }
                        f7 = pxF;
                        c7807z2 = c7807z;
                        i15 = 0;
                        aVar = 0;
                        saleBadgeWidgetKt$SaleBadgeContent$1$1 = new SaleBadgeWidgetKt$SaleBadgeContent$1$1(saleBadgeViewModel, c7980b, saleBadgeVO2, c7980b2, null);
                        saleBadgeVO2 = saleBadgeVO2;
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$1$1);
                        u11.k();
                        Q.e(u11, saleBadgeVO2, (Function2) saleBadgeWidgetKt$SaleBadgeContent$1$1);
                        InterfaceC3978p0 c11 = C6285b.c(saleBadgeViewModel.getSavedAnimProgress(), u11, i15);
                        InterfaceC3978p0 c12 = C6285b.c(saleBadgeViewModel.getSavedAnimAlpha(), u11, i15);
                        e x11 = a0.x(a0.f(eVar5, saleBadgeVO2.getBadgeParams().getHeight()), aVar, 3);
                        u11.o(1484843900);
                        if (i23 != 4) {
                        }
                        Object C12 = u11.C();
                        if (i16 == 0) {
                        }
                        SaleBadgeWidgetKt$SaleBadgeContent$2$1 saleBadgeWidgetKt$SaleBadgeContent$2$1 = new SaleBadgeWidgetKt$SaleBadgeContent$2$1(saleBadgeVO2);
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$2$1);
                        obj = saleBadgeWidgetKt$SaleBadgeContent$2$1;
                        u11.k();
                        b13 = androidx.compose.foundation.e.b(androidx.compose.ui.graphics.a.a(x11, (Function1) obj), w11, y0.a());
                        u11.o(1484852635);
                        C7807Z c7807z4 = c7807z2;
                        float f11 = f7;
                        i17 = (u11.n(c7807z4) ? 1 : 0) | (u11.n(c11) ? 1 : 0) | (i23 != 4 ? 1 : i15) | (u11.q(f11) ? 1 : 0);
                        Object C13 = u11.C();
                        if (i17 == 0) {
                        }
                        SaleBadgeWidgetKt$SaleBadgeContent$3$1 saleBadgeWidgetKt$SaleBadgeContent$3$1 = new SaleBadgeWidgetKt$SaleBadgeContent$3$1(c7807z4, saleBadgeVO2, f11, c11);
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$3$1);
                        obj2 = saleBadgeWidgetKt$SaleBadgeContent$3$1;
                        u11.k();
                        e j11 = T.j(androidx.compose.ui.draw.c.b(b13, (Function1) obj2), saleBadgeVO2.getBadgeParams().getLeftPadding(), 0.0f, saleBadgeVO2.getBadgeParams().getRightPadding(), 0.0f, 10);
                        TestInfo testInfo = saleBadgeVO2.getTestInfo();
                        if (testInfo == null) {
                        }
                        if (automatizationId == null) {
                        }
                        e a11 = Q1.a(j11, automatizationId);
                        u11.o(1484880514);
                        i18 = (i23 != 4 ? 1 : i15) | ((i14 & 896) != 256 ? 1 : i15);
                        Object C14 = u11.C();
                        if (i18 == 0) {
                        }
                        SaleBadgeWidgetKt$SaleBadgeContent$4$1 saleBadgeWidgetKt$SaleBadgeContent$4$1 = new SaleBadgeWidgetKt$SaleBadgeContent$4$1(saleBadgeVO2, function1);
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$4$1);
                        obj3 = saleBadgeWidgetKt$SaleBadgeContent$4$1;
                        u11.k();
                        e b14 = androidx.compose.foundation.i.b(a11, null, null, false, null, null, (Function0) obj3, 28);
                        Y b15 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f12 = c.f(u11, b14);
                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 h11 = Cm.e.h(u11, b15, u11, d11);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, h11);
                        F1.b(u11, f12, InterfaceC2801g.a.f());
                        leftIcon = saleBadgeVO2.getLeftIcon();
                        u11.o(-399250585);
                        if (leftIcon != null) {
                        }
                        c3969l2.k();
                        if (saleBadgeVO2.getLabelAnimation() != null) {
                        }
                        rightIcon = saleBadgeVO2.getRightIcon();
                        c3969l3.o(-399222808);
                        if (rightIcon != null) {
                        }
                        c3969l4.k();
                        c3969l4.f();
                        eVar4 = eVar3;
                    }
                    color = null;
                    u11.o(1484789512);
                    if (color != null) {
                    }
                    b11 = h.b(u11, 1484791223);
                    Object obj42 = b11;
                    if (b11 == InterfaceC3967k.a.a()) {
                    }
                    C7980b c7980b3 = (C7980b) obj42;
                    b12 = h.b(u11, 1484795142);
                    Object obj52 = b12;
                    if (b12 == InterfaceC3967k.a.a()) {
                    }
                    C7980b c7980b22 = (C7980b) obj52;
                    u11.k();
                    u11.o(1484798536);
                    int i232 = i14 & 14;
                    F11 = u11.F(saleBadgeViewModel) | u11.F(c7980b3) | (i232 != 4) | u11.F(c7980b22);
                    Object C112 = u11.C();
                    if (F11) {
                    }
                    f7 = pxF;
                    c7807z2 = c7807z;
                    i15 = 0;
                    aVar = 0;
                    saleBadgeWidgetKt$SaleBadgeContent$1$1 = new SaleBadgeWidgetKt$SaleBadgeContent$1$1(saleBadgeViewModel, c7980b3, saleBadgeVO2, c7980b22, null);
                    saleBadgeVO2 = saleBadgeVO2;
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$1$1);
                    u11.k();
                    Q.e(u11, saleBadgeVO2, (Function2) saleBadgeWidgetKt$SaleBadgeContent$1$1);
                    InterfaceC3978p0 c112 = C6285b.c(saleBadgeViewModel.getSavedAnimProgress(), u11, i15);
                    InterfaceC3978p0 c122 = C6285b.c(saleBadgeViewModel.getSavedAnimAlpha(), u11, i15);
                    e x112 = a0.x(a0.f(eVar5, saleBadgeVO2.getBadgeParams().getHeight()), aVar, 3);
                    u11.o(1484843900);
                    if (i232 != 4) {
                    }
                    Object C122 = u11.C();
                    if (i16 == 0) {
                    }
                    SaleBadgeWidgetKt$SaleBadgeContent$2$1 saleBadgeWidgetKt$SaleBadgeContent$2$12 = new SaleBadgeWidgetKt$SaleBadgeContent$2$1(saleBadgeVO2);
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$2$12);
                    obj = saleBadgeWidgetKt$SaleBadgeContent$2$12;
                    u11.k();
                    b13 = androidx.compose.foundation.e.b(androidx.compose.ui.graphics.a.a(x112, (Function1) obj), w11, y0.a());
                    u11.o(1484852635);
                    C7807Z c7807z42 = c7807z2;
                    float f112 = f7;
                    i17 = (u11.n(c7807z42) ? 1 : 0) | (u11.n(c112) ? 1 : 0) | (i232 != 4 ? 1 : i15) | (u11.q(f112) ? 1 : 0);
                    Object C132 = u11.C();
                    if (i17 == 0) {
                    }
                    SaleBadgeWidgetKt$SaleBadgeContent$3$1 saleBadgeWidgetKt$SaleBadgeContent$3$12 = new SaleBadgeWidgetKt$SaleBadgeContent$3$1(c7807z42, saleBadgeVO2, f112, c112);
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$3$12);
                    obj2 = saleBadgeWidgetKt$SaleBadgeContent$3$12;
                    u11.k();
                    e j112 = T.j(androidx.compose.ui.draw.c.b(b13, (Function1) obj2), saleBadgeVO2.getBadgeParams().getLeftPadding(), 0.0f, saleBadgeVO2.getBadgeParams().getRightPadding(), 0.0f, 10);
                    TestInfo testInfo2 = saleBadgeVO2.getTestInfo();
                    if (testInfo2 == null) {
                    }
                    if (automatizationId == null) {
                    }
                    e a112 = Q1.a(j112, automatizationId);
                    u11.o(1484880514);
                    i18 = (i232 != 4 ? 1 : i15) | ((i14 & 896) != 256 ? 1 : i15);
                    Object C142 = u11.C();
                    if (i18 == 0) {
                    }
                    SaleBadgeWidgetKt$SaleBadgeContent$4$1 saleBadgeWidgetKt$SaleBadgeContent$4$12 = new SaleBadgeWidgetKt$SaleBadgeContent$4$1(saleBadgeVO2, function1);
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$4$12);
                    obj3 = saleBadgeWidgetKt$SaleBadgeContent$4$12;
                    u11.k();
                    e b142 = androidx.compose.foundation.i.b(a112, null, null, false, null, null, (Function0) obj3, 28);
                    Y b152 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f122 = c.f(u11, b142);
                    Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h112 = Cm.e.h(u11, b152, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, h112);
                    F1.b(u11, f122, InterfaceC2801g.a.f());
                    leftIcon = saleBadgeVO2.getLeftIcon();
                    u11.o(-399250585);
                    if (leftIcon != null) {
                    }
                    c3969l2.k();
                    if (saleBadgeVO2.getLabelAnimation() != null) {
                    }
                    rightIcon = saleBadgeVO2.getRightIcon();
                    c3969l3.o(-399222808);
                    if (rightIcon != null) {
                    }
                    c3969l4.k();
                    c3969l4.f();
                    eVar4 = eVar3;
                } else {
                    SaleBadgeVO.BackgroundOverlay backgroundOverlay2 = saleBadgeVO2.getBackgroundOverlay();
                    if (backgroundOverlay2 != null) {
                        color = backgroundOverlay2.getDarkColor();
                        u11.o(1484789512);
                        c7807z = color != null ? null : TokenParserKt.tokenToColor(color, u11, 0);
                        b11 = h.b(u11, 1484791223);
                        Object obj422 = b11;
                        if (b11 == InterfaceC3967k.a.a()) {
                            SaleBadgeVO.BackgroundOverlay backgroundOverlay3 = saleBadgeVO2.getBackgroundOverlay();
                            C7980b a13 = C7984d.a(backgroundOverlay3 != null ? backgroundOverlay3.getOverlayProgress() : 1.0f);
                            u11.x(a13);
                            obj422 = a13;
                        }
                        C7980b c7980b32 = (C7980b) obj422;
                        b12 = h.b(u11, 1484795142);
                        Object obj522 = b12;
                        if (b12 == InterfaceC3967k.a.a()) {
                            C7980b a14 = C7984d.a(0.0f);
                            u11.x(a14);
                            obj522 = a14;
                        }
                        C7980b c7980b222 = (C7980b) obj522;
                        u11.k();
                        u11.o(1484798536);
                        int i2322 = i14 & 14;
                        F11 = u11.F(saleBadgeViewModel) | u11.F(c7980b32) | (i2322 != 4) | u11.F(c7980b222);
                        Object C1122 = u11.C();
                        if (!F11 || C1122 == InterfaceC3967k.a.a()) {
                            f7 = pxF;
                            c7807z2 = c7807z;
                            i15 = 0;
                            aVar = 0;
                            saleBadgeWidgetKt$SaleBadgeContent$1$1 = new SaleBadgeWidgetKt$SaleBadgeContent$1$1(saleBadgeViewModel, c7980b32, saleBadgeVO2, c7980b222, null);
                            saleBadgeVO2 = saleBadgeVO2;
                            u11.x(saleBadgeWidgetKt$SaleBadgeContent$1$1);
                        } else {
                            f7 = pxF;
                            c7807z2 = c7807z;
                            saleBadgeWidgetKt$SaleBadgeContent$1$1 = C1122;
                            i15 = 0;
                            aVar = 0;
                        }
                        u11.k();
                        Q.e(u11, saleBadgeVO2, (Function2) saleBadgeWidgetKt$SaleBadgeContent$1$1);
                        InterfaceC3978p0 c1122 = C6285b.c(saleBadgeViewModel.getSavedAnimProgress(), u11, i15);
                        InterfaceC3978p0 c1222 = C6285b.c(saleBadgeViewModel.getSavedAnimAlpha(), u11, i15);
                        e x1122 = a0.x(a0.f(eVar5, saleBadgeVO2.getBadgeParams().getHeight()), aVar, 3);
                        u11.o(1484843900);
                        i16 = i2322 != 4 ? 1 : i15;
                        Object C1222 = u11.C();
                        if (i16 == 0) {
                            obj = C1222;
                        }
                        SaleBadgeWidgetKt$SaleBadgeContent$2$1 saleBadgeWidgetKt$SaleBadgeContent$2$122 = new SaleBadgeWidgetKt$SaleBadgeContent$2$1(saleBadgeVO2);
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$2$122);
                        obj = saleBadgeWidgetKt$SaleBadgeContent$2$122;
                        u11.k();
                        b13 = androidx.compose.foundation.e.b(androidx.compose.ui.graphics.a.a(x1122, (Function1) obj), w11, y0.a());
                        u11.o(1484852635);
                        C7807Z c7807z422 = c7807z2;
                        float f1122 = f7;
                        i17 = (u11.n(c7807z422) ? 1 : 0) | (u11.n(c1122) ? 1 : 0) | (i2322 != 4 ? 1 : i15) | (u11.q(f1122) ? 1 : 0);
                        Object C1322 = u11.C();
                        if (i17 == 0) {
                            obj2 = C1322;
                        }
                        SaleBadgeWidgetKt$SaleBadgeContent$3$1 saleBadgeWidgetKt$SaleBadgeContent$3$122 = new SaleBadgeWidgetKt$SaleBadgeContent$3$1(c7807z422, saleBadgeVO2, f1122, c1122);
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$3$122);
                        obj2 = saleBadgeWidgetKt$SaleBadgeContent$3$122;
                        u11.k();
                        e j1122 = T.j(androidx.compose.ui.draw.c.b(b13, (Function1) obj2), saleBadgeVO2.getBadgeParams().getLeftPadding(), 0.0f, saleBadgeVO2.getBadgeParams().getRightPadding(), 0.0f, 10);
                        TestInfo testInfo22 = saleBadgeVO2.getTestInfo();
                        automatizationId = testInfo22 == null ? testInfo22.getAutomatizationId() : aVar;
                        if (automatizationId == null) {
                            automatizationId = "";
                        }
                        e a1122 = Q1.a(j1122, automatizationId);
                        u11.o(1484880514);
                        i18 = (i2322 != 4 ? 1 : i15) | ((i14 & 896) != 256 ? 1 : i15);
                        Object C1422 = u11.C();
                        if (i18 == 0) {
                            obj3 = C1422;
                        }
                        SaleBadgeWidgetKt$SaleBadgeContent$4$1 saleBadgeWidgetKt$SaleBadgeContent$4$122 = new SaleBadgeWidgetKt$SaleBadgeContent$4$1(saleBadgeVO2, function1);
                        u11.x(saleBadgeWidgetKt$SaleBadgeContent$4$122);
                        obj3 = saleBadgeWidgetKt$SaleBadgeContent$4$122;
                        u11.k();
                        e b1422 = androidx.compose.foundation.i.b(a1122, null, null, false, null, null, (Function0) obj3, 28);
                        Y b1522 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                        I11 = u11.I();
                        A0 d1122 = u11.d();
                        e f1222 = c.f(u11, b1422);
                        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a1222);
                        }
                        Function2 h1122 = Cm.e.h(u11, b1522, u11, d1122);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h1122);
                        }
                        F1.b(u11, f1222, InterfaceC2801g.a.f());
                        leftIcon = saleBadgeVO2.getLeftIcon();
                        u11.o(-399250585);
                        if (leftIcon != null) {
                            i21 = i15;
                            c7795m2 = aVar;
                            eVar3 = eVar5;
                            i19 = 16;
                            c3969l2 = u11;
                        } else {
                            C7807Z c7807z5 = TokenParserKt.tokenToColor(leftIcon.getTintColor(), u11, i15);
                            AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(leftIcon.getIcon(), u11, i15);
                            u11.o(-399247588);
                            if (abstractC8972b == null) {
                                i21 = i15;
                                c7795m2 = aVar;
                                eVar3 = eVar5;
                                i19 = 16;
                                c3969l = u11;
                            } else {
                                i19 = 16;
                                e n11 = a0.n(T.j(e.f40358c0, 0.0f, 0.0f, saleBadgeVO2.getBadgeParams().getLeftIconGap(), 0.0f, 11), 16);
                                if (c7807z5 != null) {
                                    e eVar6 = eVar5;
                                    c7795m = C7809a0.a.a(5, c7807z5.w());
                                    eVar3 = eVar6;
                                } else {
                                    eVar3 = eVar5;
                                    c7795m = aVar;
                                }
                                i21 = i15;
                                c7795m2 = aVar;
                                C8366G.a(abstractC8972b, null, n11, null, null, 0.0f, c7795m, u11, 48, 56);
                                c3969l = u11;
                                Unit unit = Unit.f71690a;
                            }
                            c3969l.k();
                            c3969l2 = c3969l;
                        }
                        c3969l2.k();
                        if (saleBadgeVO2.getLabelAnimation() != null) {
                            c3969l2.o(508653036);
                            TextAndTimer(saleBadgeVO2.getText(), saleBadgeVO2.getTimer(), false, c3969l2, 0, 4);
                            c3969l2.k();
                            c3969l3 = c3969l2;
                        } else {
                            c3969l2.o(508724956);
                            C3969l c3969l5 = c3969l2;
                            BadgeContentWithAnimLabels(SaleBadgeContent$lambda$12(c1222), saleBadgeVO2.getText(), saleBadgeVO2.getTimer(), saleBadgeVO2.getLabelAnimation(), c3969l5, 0);
                            C3969l c3969l6 = c3969l5;
                            c3969l6.k();
                            c3969l3 = c3969l6;
                        }
                        rightIcon = saleBadgeVO2.getRightIcon();
                        c3969l3.o(-399222808);
                        if (rightIcon != null) {
                            c3969l4 = c3969l3;
                        } else {
                            C7807Z c7807z6 = TokenParserKt.tokenToColor(rightIcon.getTintColor(), c3969l3, i21);
                            AbstractC8972b abstractC8972b2 = TokenParserKt.tokenToIcon(rightIcon.getIcon(), c3969l3, i21);
                            c3969l3.o(-399219811);
                            if (abstractC8972b2 == null) {
                                c3969l4 = c3969l3;
                            } else {
                                c3969l4 = c3969l3;
                                C8366G.a(abstractC8972b2, null, a0.n(T.j(e.f40358c0, 0.0f, 0.0f, saleBadgeVO2.getBadgeParams().getRightIconGap(), 0.0f, 11), i19), null, null, 0.0f, c7807z6 != null ? C7809a0.a.a(5, c7807z6.w()) : c7795m2, c3969l4, 48, 56);
                                Unit unit2 = Unit.f71690a;
                            }
                            c3969l4.k();
                            Unit unit3 = Unit.f71690a;
                        }
                        c3969l4.k();
                        c3969l4.f();
                        eVar4 = eVar3;
                    }
                    color = null;
                    u11.o(1484789512);
                    if (color != null) {
                    }
                    b11 = h.b(u11, 1484791223);
                    Object obj4222 = b11;
                    if (b11 == InterfaceC3967k.a.a()) {
                    }
                    C7980b c7980b322 = (C7980b) obj4222;
                    b12 = h.b(u11, 1484795142);
                    Object obj5222 = b12;
                    if (b12 == InterfaceC3967k.a.a()) {
                    }
                    C7980b c7980b2222 = (C7980b) obj5222;
                    u11.k();
                    u11.o(1484798536);
                    int i23222 = i14 & 14;
                    F11 = u11.F(saleBadgeViewModel) | u11.F(c7980b322) | (i23222 != 4) | u11.F(c7980b2222);
                    Object C11222 = u11.C();
                    if (F11) {
                    }
                    f7 = pxF;
                    c7807z2 = c7807z;
                    i15 = 0;
                    aVar = 0;
                    saleBadgeWidgetKt$SaleBadgeContent$1$1 = new SaleBadgeWidgetKt$SaleBadgeContent$1$1(saleBadgeViewModel, c7980b322, saleBadgeVO2, c7980b2222, null);
                    saleBadgeVO2 = saleBadgeVO2;
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$1$1);
                    u11.k();
                    Q.e(u11, saleBadgeVO2, (Function2) saleBadgeWidgetKt$SaleBadgeContent$1$1);
                    InterfaceC3978p0 c11222 = C6285b.c(saleBadgeViewModel.getSavedAnimProgress(), u11, i15);
                    InterfaceC3978p0 c12222 = C6285b.c(saleBadgeViewModel.getSavedAnimAlpha(), u11, i15);
                    e x11222 = a0.x(a0.f(eVar5, saleBadgeVO2.getBadgeParams().getHeight()), aVar, 3);
                    u11.o(1484843900);
                    if (i23222 != 4) {
                    }
                    Object C12222 = u11.C();
                    if (i16 == 0) {
                    }
                    SaleBadgeWidgetKt$SaleBadgeContent$2$1 saleBadgeWidgetKt$SaleBadgeContent$2$1222 = new SaleBadgeWidgetKt$SaleBadgeContent$2$1(saleBadgeVO2);
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$2$1222);
                    obj = saleBadgeWidgetKt$SaleBadgeContent$2$1222;
                    u11.k();
                    b13 = androidx.compose.foundation.e.b(androidx.compose.ui.graphics.a.a(x11222, (Function1) obj), w11, y0.a());
                    u11.o(1484852635);
                    C7807Z c7807z4222 = c7807z2;
                    float f11222 = f7;
                    i17 = (u11.n(c7807z4222) ? 1 : 0) | (u11.n(c11222) ? 1 : 0) | (i23222 != 4 ? 1 : i15) | (u11.q(f11222) ? 1 : 0);
                    Object C13222 = u11.C();
                    if (i17 == 0) {
                    }
                    SaleBadgeWidgetKt$SaleBadgeContent$3$1 saleBadgeWidgetKt$SaleBadgeContent$3$1222 = new SaleBadgeWidgetKt$SaleBadgeContent$3$1(c7807z4222, saleBadgeVO2, f11222, c11222);
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$3$1222);
                    obj2 = saleBadgeWidgetKt$SaleBadgeContent$3$1222;
                    u11.k();
                    e j11222 = T.j(androidx.compose.ui.draw.c.b(b13, (Function1) obj2), saleBadgeVO2.getBadgeParams().getLeftPadding(), 0.0f, saleBadgeVO2.getBadgeParams().getRightPadding(), 0.0f, 10);
                    TestInfo testInfo222 = saleBadgeVO2.getTestInfo();
                    if (testInfo222 == null) {
                    }
                    if (automatizationId == null) {
                    }
                    e a11222 = Q1.a(j11222, automatizationId);
                    u11.o(1484880514);
                    i18 = (i23222 != 4 ? 1 : i15) | ((i14 & 896) != 256 ? 1 : i15);
                    Object C14222 = u11.C();
                    if (i18 == 0) {
                    }
                    SaleBadgeWidgetKt$SaleBadgeContent$4$1 saleBadgeWidgetKt$SaleBadgeContent$4$1222 = new SaleBadgeWidgetKt$SaleBadgeContent$4$1(saleBadgeVO2, function1);
                    u11.x(saleBadgeWidgetKt$SaleBadgeContent$4$1222);
                    obj3 = saleBadgeWidgetKt$SaleBadgeContent$4$1222;
                    u11.k();
                    e b14222 = androidx.compose.foundation.i.b(a11222, null, null, false, null, null, (Function0) obj3, 28);
                    Y b15222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I11 = u11.I();
                    A0 d11222 = u11.d();
                    e f12222 = c.f(u11, b14222);
                    Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h11222 = Cm.e.h(u11, b15222, u11, d11222);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, h11222);
                    F1.b(u11, f12222, InterfaceC2801g.a.f());
                    leftIcon = saleBadgeVO2.getLeftIcon();
                    u11.o(-399250585);
                    if (leftIcon != null) {
                    }
                    c3969l2.k();
                    if (saleBadgeVO2.getLabelAnimation() != null) {
                    }
                    rightIcon = saleBadgeVO2.getRightIcon();
                    c3969l3.o(-399222808);
                    if (rightIcon != null) {
                    }
                    c3969l4.k();
                    c3969l4.f();
                    eVar4 = eVar3;
                }
            } else {
                u11.j();
                eVar4 = eVar2;
                c3969l4 = u11;
            }
            m02 = c3969l4.m0();
            if (m02 == null) {
                m02.G(new SaleBadgeWidgetKt$SaleBadgeContent$6(saleBadgeVO2, eVar4, function1, saleBadgeViewModel, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        i14 = i13;
        if ((i14 & 1171) == 1170) {
        }
        if (i22 == 0) {
        }
        C7807Z c7807z32 = TokenParserKt.tokenToColor(saleBadgeVO2.getBackground(), u11, 0);
        long w112 = c7807z32 == null ? c7807z32.w() : C7807Z.f72258l;
        float pxF2 = UiExtKt.toPxF(2);
        if (p.a(u11)) {
        }
        m02 = c3969l4.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float SaleBadgeContent$lambda$11(A1<Float> a12) {
        return a12.getValue();
    }

    private static final float SaleBadgeContent$lambda$12(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SaleBadgeWidget(@NotNull SaleBadgeVO state, e eVar, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Object C11;
        boolean F11;
        Object C12;
        boolean F12;
        Object C13;
        boolean F13;
        Object C14;
        boolean n11;
        Object C15;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1816471842);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                String id2 = state.getId();
                B0 a11 = ((a00.h) u11.m(f.f())).a();
                u11.B(1729797275);
                w0 a12 = C6617b.a(N.b(SaleBadgeViewModel.class), a11, id2, null, !(a11 instanceof InterfaceC5431s) ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
                u11.K();
                SaleBadgeViewModel saleBadgeViewModel = (SaleBadgeViewModel) a12;
                l lVar = (l) u11.m(f.e());
                InterfaceC3978p0 a13 = C6285b.a(((InterfaceC7851b) u11.m(f.c())).getEventsFlow(), null, u11, 48);
                u11.o(1017238085);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                u11.o(1017240225);
                int i15 = i13 & 14;
                F11 = u11.F(saleBadgeViewModel) | (i15 != 4);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new SaleBadgeWidgetKt$SaleBadgeWidget$1$1(saleBadgeViewModel, state, null);
                    u11.x(C12);
                }
                u11.k();
                Q.e(u11, state, (Function2) C12);
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1017248173);
                F12 = u11.F(saleBadgeViewModel) | (i15 == 4) | u11.F(lVar);
                C13 = u11.C();
                if (!F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new SaleBadgeWidgetKt$SaleBadgeWidget$2$1(saleBadgeViewModel, state, lVar);
                    u11.x(C13);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C13, u11, 6);
                Unit unit = Unit.f71690a;
                u11.o(1017259566);
                F13 = u11.F(saleBadgeViewModel);
                C14 = u11.C();
                if (!F13 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new SaleBadgeWidgetKt$SaleBadgeWidget$3$1(saleBadgeViewModel, interfaceC3978p0);
                    u11.x(C14);
                }
                u11.k();
                Q.c(unit, (Function1) C14, u11);
                A00.a SaleBadgeWidget$lambda$0 = SaleBadgeWidget$lambda$0(a13);
                u11.o(1017268359);
                n11 = u11.n(a13) | u11.F(saleBadgeViewModel);
                C15 = u11.C();
                if (!n11 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new SaleBadgeWidgetKt$SaleBadgeWidget$4$1(saleBadgeViewModel, a13, interfaceC3978p0, null);
                    u11.x(C15);
                }
                u11.k();
                Q.e(u11, SaleBadgeWidget$lambda$0, (Function2) C15);
                int i16 = i13 & 1022;
                e eVar5 = eVar4;
                SaleBadgeContent(state, eVar5, actionHandler, saleBadgeViewModel, u11, i16, 0);
                eVar3 = eVar5;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new SaleBadgeWidgetKt$SaleBadgeWidget$5(state, eVar3, actionHandler, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        String id22 = state.getId();
        B0 a112 = ((a00.h) u11.m(f.f())).a();
        u11.B(1729797275);
        w0 a122 = C6617b.a(N.b(SaleBadgeViewModel.class), a112, id22, null, !(a112 instanceof InterfaceC5431s) ? ((InterfaceC5431s) a112).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
        u11.K();
        SaleBadgeViewModel saleBadgeViewModel2 = (SaleBadgeViewModel) a122;
        l lVar2 = (l) u11.m(f.e());
        InterfaceC3978p0 a132 = C6285b.a(((InterfaceC7851b) u11.m(f.c())).getEventsFlow(), null, u11, 48);
        u11.o(1017238085);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
        u11.k();
        u11.o(1017240225);
        int i152 = i13 & 14;
        F11 = u11.F(saleBadgeViewModel2) | (i152 != 4);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new SaleBadgeWidgetKt$SaleBadgeWidget$1$1(saleBadgeViewModel2, state, null);
        u11.x(C12);
        u11.k();
        Q.e(u11, state, (Function2) C12);
        AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
        u11.o(1017248173);
        F12 = u11.F(saleBadgeViewModel2) | (i152 == 4) | u11.F(lVar2);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new SaleBadgeWidgetKt$SaleBadgeWidget$2$1(saleBadgeViewModel2, state, lVar2);
        u11.x(C13);
        u11.k();
        e3.i.a(aVar2, null, (Function0) C13, u11, 6);
        Unit unit2 = Unit.f71690a;
        u11.o(1017259566);
        F13 = u11.F(saleBadgeViewModel2);
        C14 = u11.C();
        if (!F13) {
        }
        C14 = new SaleBadgeWidgetKt$SaleBadgeWidget$3$1(saleBadgeViewModel2, interfaceC3978p02);
        u11.x(C14);
        u11.k();
        Q.c(unit2, (Function1) C14, u11);
        A00.a SaleBadgeWidget$lambda$02 = SaleBadgeWidget$lambda$0(a132);
        u11.o(1017268359);
        n11 = u11.n(a132) | u11.F(saleBadgeViewModel2);
        C15 = u11.C();
        if (!n11) {
        }
        C15 = new SaleBadgeWidgetKt$SaleBadgeWidget$4$1(saleBadgeViewModel2, a132, interfaceC3978p02, null);
        u11.x(C15);
        u11.k();
        Q.e(u11, SaleBadgeWidget$lambda$02, (Function2) C15);
        int i162 = i13 & 1022;
        e eVar52 = eVar4;
        SaleBadgeContent(state, eVar52, actionHandler, saleBadgeViewModel2, u11, i162, 0);
        eVar3 = eVar52;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A00.a SaleBadgeWidget$lambda$0(A1<? extends A00.a> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SaleBadgeWidget$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SaleBadgeWidget$lambda$3(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextAndTimer(TextDTO textDTO, TimerVO timerVO, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        TimerVO timerVO2;
        boolean z12;
        C3969l u11 = interfaceC3967k.u(-674627826);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(timerVO) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            z12 = z11;
            timerVO2 = timerVO;
        } else {
            if (i14 != 0) {
                z11 = false;
            }
            boolean z13 = z11;
            DsTextAtomKt.DsTextAtom(textDTO, null, u11, i13 & 14, 2);
            if (timerVO == null) {
                timerVO2 = timerVO;
            } else {
                TimerMoleculeWidgetKt.TimerMoleculeWidget(timerVO, null, null, true, null, z13, u11, ((i13 << 9) & 458752) | 3072, 22);
                timerVO2 = timerVO;
            }
            z12 = z13;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SaleBadgeWidgetKt$TextAndTimer$2(textDTO, timerVO2, z12, i11, i12));
        }
    }
}
