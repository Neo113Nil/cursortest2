package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import u0.C9891D;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aA\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0002H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;", "state", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "onSkipClick", "Header", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(@NotNull AppOnboardingVI.Header state, Function2<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, Unit> function22;
        Function2<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, Unit> function23;
        int I11;
        boolean F11;
        Object C11;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-454337401);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function22 = function2;
            i13 |= u11.F(function22) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                if (i14 == 0) {
                    u11.o(1099914546);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = HeaderKt$Header$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    u11.k();
                    function23 = (Function2) C12;
                } else {
                    function23 = function22;
                }
                e.a aVar = e.f40358c0;
                e u12 = a0.u(a0.e(aVar, 1.0f), 3);
                DsSpacings dsSpacings = DsSpacings.INSTANCE;
                e h11 = T.h(u12, dsSpacings.m1853getDp32D9Ej5fM(), 0.0f, 2);
                Y b11 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, h11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h12 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h12);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                Ag0.e.a(state.getLogo(), a0.f(aVar, dsSpacings.m1845getDp16D9Ej5fM()), null, null, null, 0.0f, null, u11, 3072, 244);
                FillSpacerKt.HorizontalFillSpacer(c9891d, u11, 6);
                u11.o(1649067685);
                F11 = ((i13 & 112) != 32) | u11.F(state);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new HeaderKt$Header$2$1$1(function23, state);
                    u11.x(C11);
                }
                u11.k();
                DsTextAtomKt.DsTextAtom(state.getTitle().getText(), i.c(aVar, false, null, null, (Function0) C11, 7), u11, 0, 0);
                u11.f();
            } else {
                u11.j();
                function23 = function22;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new HeaderKt$Header$3(state, function23, i11, i12));
                return;
            }
            return;
        }
        function22 = function2;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        e.a aVar2 = e.f40358c0;
        e u122 = a0.u(a0.e(aVar2, 1.0f), 3);
        DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
        e h112 = T.h(u122, dsSpacings2.m1853getDp32D9Ej5fM(), 0.0f, 2);
        Y b112 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, h112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h122 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h122);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        C9891D c9891d2 = C9891D.f99599a;
        Ag0.e.a(state.getLogo(), a0.f(aVar2, dsSpacings2.m1845getDp16D9Ej5fM()), null, null, null, 0.0f, null, u11, 3072, 244);
        FillSpacerKt.HorizontalFillSpacer(c9891d2, u11, 6);
        u11.o(1649067685);
        F11 = ((i13 & 112) != 32) | u11.F(state);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new HeaderKt$Header$2$1$1(function23, state);
        u11.x(C11);
        u11.k();
        DsTextAtomKt.DsTextAtom(state.getTitle().getText(), i.c(aVar2, false, null, null, (Function0) C11, 7), u11, 0, 0);
        u11.f();
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
