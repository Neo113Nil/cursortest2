package ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose;

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
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleVO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;", "item", "", "ShellNavTitleComposable", "(Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;LS0/k;I)V", "ShellNavTitleContent", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShellNavTitleComposableKt {
    public static final void ShellNavTitleComposable(@NotNull ShellNavTitleVO item, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(554713848);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-655605907);
            boolean F11 = u11.F(item) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ShellNavTitleComposableKt$ShellNavTitleComposable$1$1(item, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            ShellNavTitleContent(item, u11, i12 & 14);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ShellNavTitleComposableKt$ShellNavTitleComposable$2(item, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShellNavTitleContent(ShellNavTitleVO shellNavTitleVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(253592022);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(shellNavTitleVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = shellNavTitleVO.getTitle();
            u11.o(1199869490);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = ShellNavTitleComposableKt$ShellNavTitleContent$1$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(title, o.c(aVar, false, (Function1) C11), u11, 0, 0);
            TextDTO subtitle = shellNavTitleVO.getSubtitle();
            u11.o(1199872971);
            if (subtitle != null) {
                u11.o(-1104723783);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = ShellNavTitleComposableKt$ShellNavTitleContent$1$2$1$1.INSTANCE;
                    u11.x(C12);
                }
                u11.k();
                DsTextAtomKt.DsTextAtom(subtitle, o.c(aVar, false, (Function1) C12), u11, 0, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ShellNavTitleComposableKt$ShellNavTitleContent$2(shellNavTitleVO, i11));
        }
    }
}
