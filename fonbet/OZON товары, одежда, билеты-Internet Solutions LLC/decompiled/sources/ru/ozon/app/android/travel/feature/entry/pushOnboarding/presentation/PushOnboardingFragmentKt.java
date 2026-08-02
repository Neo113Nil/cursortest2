package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingPageData;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.S;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aG\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "closeAction", "confirmAction", "ShowOnboarding", "(Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Landroidx/compose/ui/e;", "modifier", "Header", "(Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Content", "(Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;LS0/k;I)V", "Footer", "entry_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushOnboardingFragmentKt {
    public static final void Content(@NotNull PushOnboardingPageData data, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(data, "data");
        C3969l u11 = interfaceC3967k.u(281043922);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(data) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e j11 = T.j(z.c(a0.d(aVar), z.b(u11), 14), 0.0f, 56, 0.0f, 114, 5);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j11);
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
            float f11 = 32;
            DsImageAtomKt.DsImageAtom(data.getImageDTO(), T.g(a0.d(aVar), f11, f11), u11, 48, 0);
            DsTextAtomKt.DsTextAtom(data.getTitleDTO(), null, u11, 0, 2);
            u11.o(-1215180179);
            Iterator<T> it = data.getCells().iterator();
            while (it.hasNext()) {
                DsCellAtomKt.DsCellAtom((CellDTO) it.next(), null, null, u11, CellDTO.$stable, 6);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PushOnboardingFragmentKt$Content$2(data, i11));
        }
    }

    public static final void Footer(@NotNull PushOnboardingPageData data, @NotNull e modifier, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super AtomAction, Unit> function12;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(501555162);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(data) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(modifier) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            if (i14 != 0) {
                function1 = null;
            }
            Function1<? super AtomAction, Unit> function13 = function1;
            e a11 = j.a(c.b(modifier, C5236c1.a(), new S(3)), 1.0f);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsButtonAtomKt.DsButtonAtom(data.getConfirmButtonDTO(), T.g(a0.e(e.f40358c0, 1.0f), 16, 12), false, function13, u11, ((i13 << 3) & 7168) | 48, 4);
            u11.f();
            function12 = function13;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PushOnboardingFragmentKt$Footer$2(data, modifier, function12, i11, i12));
        }
    }

    public static final void Header(@NotNull PushOnboardingPageData data, @NotNull e modifier, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super AtomAction, Unit> function12;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(333161128);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(data) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(modifier) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            if (i14 != 0) {
                function1 = null;
            }
            Function1<? super AtomAction, Unit> function13 = function1;
            e a11 = j.a(u0.T.a(a0.e(a0.u(T.g(modifier, 16, 8), 3), 1.0f)), 1.0f);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            DsImageAtomKt.DsImageAtom(data.getLogoImageDTO(), a0.f(a0.r(e.f40358c0, 125), 36), u11, 48, 0);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            u0.E.a(u11, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            DsIconButtonAtomKt.DsIconButtonAtom(data.getCloseButtonDTO(), null, false, function13, u11, IconButtonV3DTO.$stable | ((i13 << 3) & 7168), 6);
            u11.f();
            function12 = function13;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PushOnboardingFragmentKt$Header$2(data, modifier, function12, i11, i12));
        }
    }

    public static final void ShowOnboarding(@NotNull PushOnboardingPageData data, Function1<? super AtomAction, Unit> function1, Function1<? super AtomAction, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super AtomAction, Unit> function13;
        Function1<? super AtomAction, Unit> function14;
        Intrinsics.checkNotNullParameter(data, "data");
        C3969l u11 = interfaceC3967k.u(-119697197);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(data) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function13 = function1;
            function14 = function12;
        } else {
            Function1<? super AtomAction, Unit> function15 = i14 != 0 ? null : function1;
            if (i15 != 0) {
                function12 = null;
            }
            e.a aVar = e.f40358c0;
            e a11 = Q1.a(androidx.compose.foundation.e.a(a0.d(aVar), TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrSocialPrimary(), u11, UniGradientToken.$stable), null, 6), "PushNotificationOnboarding.container");
            u11.o(-7567915);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = PushOnboardingFragmentKt$ShowOnboarding$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            e c11 = o.c(a11, false, (Function1) C11);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, c11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            int i16 = i13 & 14;
            Header(data, c5187j.a(aVar, InterfaceC6250b.a.o()), function15, u11, i16 | ((i13 << 3) & 896), 0);
            Function1<? super AtomAction, Unit> function16 = function15;
            Content(data, u11, i16);
            Function1<? super AtomAction, Unit> function17 = function12;
            Footer(data, c5187j.a(aVar, InterfaceC6250b.a.b()), function17, u11, i13 & 910, 0);
            u11.f();
            function13 = function16;
            function14 = function17;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PushOnboardingFragmentKt$ShowOnboarding$3(data, function13, function14, i11, i12));
        }
    }
}
