package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.composable;

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
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
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
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.presentation.vo.MercuryCertificatesInfoVO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.common.Spacings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import v0.C10164d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "aspectListVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "AspectList", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO$AspectItemVO;", "item", "", "index", "selectedItemIndex", "AspectItem", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO$AspectItemVO;IILkotlin/jvm/functions/Function1;LS0/k;I)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AspectListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AspectItem(MercuryCertificatesInfoVO.AspectListVO.AspectItemVO aspectItemVO, int i11, int i12, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i13) {
        int i14;
        long graphicNeutral;
        C3969l u11 = interfaceC3967k.u(667398855);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? u11.n(aspectItemVO) : u11.F(aspectItemVO) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= u11.r(i11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= u11.r(i12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            float px = (i11 == i12 ? Spacings.SPACING_2 : Spacings.SPACING_1).getPx();
            if (i11 == i12) {
                u11.o(-568170218);
                graphicNeutral = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary();
                u11.k();
            } else {
                u11.o(-568112868);
                graphicNeutral = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral();
                u11.k();
            }
            e.a aVar = e.f40358c0;
            e c11 = C8385f.c(px, graphicNeutral, aVar, h.b(CornerRadius.RADIUS_300.m1866getDpD9Ej5fM()));
            u11.o(-433955977);
            boolean z11 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && u11.F(aspectItemVO))) | ((i14 & 7168) == 2048);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AspectListKt$AspectItem$1$1(aspectItemVO, function1);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(c11, null, null, false, null, null, (Function0) C11, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
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
            TextDTO text = aspectItemVO.getText();
            Paddings paddings = Paddings.PADDING_400;
            float m1867getDpD9Ej5fM = paddings.m1867getDpD9Ej5fM();
            Paddings paddings2 = Paddings.PADDING_300;
            DsTextAtomKt.DsTextAtom(text, T.i(aVar, m1867getDpD9Ej5fM, paddings2.m1867getDpD9Ej5fM(), paddings.m1867getDpD9Ej5fM(), paddings2.m1867getDpD9Ej5fM()), u11, 0, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AspectListKt$AspectItem$3(aspectItemVO, i11, i12, function1, i13));
        }
    }

    public static final void AspectList(@NotNull MercuryCertificatesInfoVO.AspectListVO aspectListVO, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(aspectListVO, "aspectListVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-827824991);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(aspectListVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e e11 = a0.e(e.f40358c0, 1.0f);
            int i13 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(Paddings.PADDING_300.m1867getDpD9Ej5fM());
            u11.o(-357833855);
            boolean F11 = ((i12 & 112) == 32) | u11.F(aspectListVO);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AspectListKt$AspectList$1$1(aspectListVO, actionHandler);
                u11.x(C11);
            }
            u11.k();
            C10164d.b(e11, null, null, n11, null, null, false, (Function1) C11, u11, 6, 238);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AspectListKt$AspectList$2(aspectListVO, actionHandler, i11));
        }
    }
}
