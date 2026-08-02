package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;", "item", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onClick", "Lkotlin/Function1;", "onView", "LZ1/h;", "separatorTopPadding", "BenefitLabel-FJfuzF0", "(Landroidx/compose/ui/e;Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;FLS0/k;II)V", "BenefitLabel", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BenefitLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bf  */
    /* renamed from: BenefitLabel-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m760BenefitLabelFJfuzF0(e eVar, @NotNull BenefitListVO.Badge item, @NotNull Function2<? super AtomAction, ? super t, Unit> onClick, @NotNull Function1<? super t, Unit> onView, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f11;
        boolean F11;
        Object C11;
        int I11;
        Object C12;
        boolean F12;
        Object C13;
        int I12;
        IconDTO icon;
        TextDTO separator;
        e eVar3;
        float f12;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onView, "onView");
        C3969l u11 = interfaceC3967k.u(-241292056);
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
            i13 |= u11.F(item) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(onView) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            f11 = f7;
            i13 |= u11.q(f11) ? 16384 : 8192;
            if ((i13 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                float f13 = i15 == 0 ? 2 : f11;
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(594446740);
                F11 = u11.F(item) | ((i13 & 7168) != 2048);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BenefitLabelKt$BenefitLabel$1$1(item, onView);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f14 = c.f(u11, eVar4);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                e.a aVar2 = e.f40358c0;
                e v11 = a0.v(aVar2, null, 3);
                boolean z11 = item.getAction() == null;
                u11.o(-104739284);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = p.a();
                    u11.x(C12);
                }
                q qVar = (q) C12;
                u11.k();
                u11.o(-104736038);
                F12 = u11.F(item) | ((i13 & 896) != 256);
                C13 = u11.C();
                if (!F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new BenefitLabelKt$BenefitLabel$2$2$1(item, onClick);
                    u11.x(C13);
                }
                u11.k();
                e b12 = androidx.compose.foundation.i.b(v11, qVar, null, z11, null, null, (Function0) C13, 24);
                Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f15 = c.f(u11, b12);
                Function0 a12 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 h12 = Cm.e.h(u11, b13, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h12);
                }
                F1.b(u11, f15, InterfaceC2801g.a.f());
                icon = item.getIcon();
                u11.o(-927691840);
                if (icon != null) {
                    DsIconAtomKt.DsIconAtom(icon, a0.v(aVar2, null, 3), u11, IconDTO.$stable | 48, 0);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                DsTextAtomKt.DsTextAtom(item.getText(), null, u11, 0, 2);
                u11.f();
                separator = item.getSeparator();
                u11.o(-104723951);
                if (separator != null) {
                    DsTextAtomKt.DsTextAtom(item.getSeparator(), T.j(a0.v(aVar2, null, 3), 0.0f, f13, 0.0f, 0.0f, 13), u11, 0, 0);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
                u11.f();
                eVar3 = eVar4;
                f12 = f13;
            } else {
                u11.j();
                f12 = f11;
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new BenefitLabelKt$BenefitLabel$3(eVar3, item, onClick, onView, f12, i11, i12));
                return;
            }
            return;
        }
        f11 = f7;
        if ((i13 & 9363) == 9362) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        AbstractC5434v.a aVar3 = AbstractC5434v.a.ON_RESUME;
        u11.o(594446740);
        F11 = u11.F(item) | ((i13 & 7168) != 2048);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new BenefitLabelKt$BenefitLabel$1$1(item, onView);
        u11.x(C11);
        u11.k();
        i.a(aVar3, null, (Function0) C11, u11, 6);
        Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f142 = c.f(u11, eVar4);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f142, InterfaceC2801g.a.f());
        e.a aVar22 = e.f40358c0;
        e v112 = a0.v(aVar22, null, 3);
        if (item.getAction() == null) {
        }
        u11.o(-104739284);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        q qVar2 = (q) C12;
        u11.k();
        u11.o(-104736038);
        F12 = u11.F(item) | ((i13 & 896) != 256);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new BenefitLabelKt$BenefitLabel$2$2$1(item, onClick);
        u11.x(C13);
        u11.k();
        e b122 = androidx.compose.foundation.i.b(v112, qVar2, null, z11, null, null, (Function0) C13, 24);
        Y b132 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f152 = c.f(u11, b122);
        Function0 a122 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h122 = Cm.e.h(u11, b132, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h122);
        F1.b(u11, f152, InterfaceC2801g.a.f());
        icon = item.getIcon();
        u11.o(-927691840);
        if (icon != null) {
        }
        u11.k();
        DsTextAtomKt.DsTextAtom(item.getText(), null, u11, 0, 2);
        u11.f();
        separator = item.getSeparator();
        u11.o(-104723951);
        if (separator != null) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar4;
        f12 = f13;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
