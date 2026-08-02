package ru.ozon.app.android.pdp.widgets.tabs.compose;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.C3996z;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import WZ.t;
import a1.c;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.V;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsViewModel;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import v0.I;
import v0.M;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "item", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsViewModel;", "viewModel", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "onTabClick", "PdpTabsComposable", "(Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lv0/I;", "scrollState", "PdpTabsContent", "(Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv0/I;LS0/k;I)V", "Tab", "(Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTabsComposableKt {
    public static final void PdpTabsComposable(@NotNull PdpTabsVO item, @NotNull PdpTabsViewModel viewModel, Function1<? super t, Unit> function1, Function1<? super PdpTabsVO.Tab, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function13;
        Function1<? super PdpTabsVO.Tab, Unit> function14;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(770659865);
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
            i13 |= u11.F(viewModel) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            function13 = function1;
            function14 = function12;
        } else {
            if (i14 != 0) {
                u11.o(-29004237);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = PdpTabsComposableKt$PdpTabsComposable$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            if (i15 != 0) {
                u11.o(-29003085);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = PdpTabsComposableKt$PdpTabsComposable$2$1.INSTANCE;
                    u11.x(C12);
                }
                function12 = (Function1) C12;
                u11.k();
            }
            I c11 = M.c(viewModel.getScrollIndex(), viewModel.getScrollOffset(), u11, 0);
            u11.o(-28995429);
            boolean F11 = u11.F(item) | ((i13 & 896) == 256) | u11.F(viewModel) | u11.n(c11);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new PdpTabsComposableKt$PdpTabsComposable$3$1(item, function1, viewModel, c11);
                u11.x(C13);
            }
            u11.k();
            int i16 = i13 & 14;
            i.b(item, null, (Function1) C13, u11, i16, 2);
            int i17 = i13 >> 3;
            Function1<? super t, Unit> function15 = function1;
            Function1<? super PdpTabsVO.Tab, Unit> function16 = function12;
            PdpTabsContent(item, function15, function16, c11, u11, (i17 & 112) | i16 | (i17 & 896));
            u11 = u11;
            function13 = function15;
            function14 = function16;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PdpTabsComposableKt$PdpTabsComposable$4(item, viewModel, function13, function14, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PdpTabsContent(PdpTabsVO pdpTabsVO, Function1<? super t, Unit> function1, Function1<? super PdpTabsVO.Tab, Unit> function12, I i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1016569838);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(pdpTabsVO) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.n(i11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            Iterator<PdpTabsVO.Tab> it = pdpTabsVO.getTabs().iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                } else if (it.next().getIsSelected()) {
                    break;
                } else {
                    i14++;
                }
            }
            Integer valueOf = Integer.valueOf(i14);
            if (i14 == -1) {
                valueOf = null;
            }
            Integer valueOf2 = Integer.valueOf(valueOf != null ? valueOf.intValue() : 0);
            u11.o(1017407965);
            boolean F11 = u11.F(pdpTabsVO);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new PdpTabsComposableKt$PdpTabsContent$1$1(pdpTabsVO, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, valueOf2, (Function2) C11);
            C3996z.a(V.a().c(null), c.c(509862738, new PdpTabsComposableKt$PdpTabsContent$2(pdpTabsVO, i11, function12, function1), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PdpTabsComposableKt$PdpTabsContent$3(pdpTabsVO, function1, function12, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Tab(PdpTabsVO.Tab tab, Function1<? super PdpTabsVO.Tab, Unit> function1, Function1<? super t, Unit> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-133449253);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(tab) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            t tokenizedEvent = tab.getTokenizedEvent();
            u11.o(1921510007);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1921513008);
                boolean F11 = ((i12 & 896) == 256) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new PdpTabsComposableKt$Tab$1$1(function12, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
            }
            u11.k();
            PdpTabsVO.TabsStyle tabStyle = tab.getTabStyle();
            boolean isSelected = tab.getIsSelected();
            String selectedTextColor = isSelected ? tabStyle.getSelectedTextColor() : tabStyle.getTextColor();
            String selectedBackgroundColor = isSelected ? tabStyle.getSelectedBackgroundColor() : tabStyle.getBackgroundColor();
            e c11 = a0.c(e.f40358c0);
            C7807Z parseColorToken = TokenParserKt.parseColorToken(selectedBackgroundColor, u11, 0);
            e b11 = androidx.compose.foundation.e.b(c11, parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m, h.b(tab.getTabStyle().getCornerRadius()));
            u11.o(1921535123);
            boolean F12 = u11.F(tab) | ((i12 & 112) == 32);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new PdpTabsComposableKt$Tab$2$1(function1, tab);
                u11.x(C12);
            }
            u11.k();
            e a11 = Q1.a(T.h(androidx.compose.foundation.i.b(b11, null, null, false, null, null, (Function0) C12, 28), tab.getHorizontalPadding(), 0.0f, 2), "pdp.tabs." + ((Object) tab.getText().getText()));
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(TextDTO.copy$default(tab.getText(), null, null, null, null, null, null, null, null, selectedTextColor, null, null, null, null, false, null, null, null, null, null, 524031, null), null, u11, 0, 2);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PdpTabsComposableKt$Tab$4(tab, function1, function12, i11));
        }
    }
}
