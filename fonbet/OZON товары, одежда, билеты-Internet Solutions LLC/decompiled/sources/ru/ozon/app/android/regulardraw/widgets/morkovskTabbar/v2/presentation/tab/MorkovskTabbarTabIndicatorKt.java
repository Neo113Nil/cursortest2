package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.o;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.LocalPinTriggerModifierKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\n*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u00020\n*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0011²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lu0/b;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "state", "", "animateAppearance", "Lkotlin/Function0;", "", "onAppearanceAnimated", "MorkovskTabbarIndicator", "(Lu0/b;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;ZLkotlin/jvm/functions/Function0;LS0/k;I)V", "Landroidx/compose/ui/e;", "onAnimated", "pinAppearanceAnimation", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/e;", "badgeAppearanceAnimation", "localOnAppearanceAnimated", "currentOnAnimated", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarTabIndicatorKt {
    public static final void MorkovskTabbarIndicator(@NotNull InterfaceC9893b interfaceC9893b, @NotNull MorkovskTabbarVI.Tab.Indicator state, boolean z11, @NotNull Function0<Unit> onAppearanceAnimated, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(interfaceC9893b, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAppearanceAnimated, "onAppearanceAnimated");
        C3969l u11 = interfaceC3967k.u(1236533666);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onAppearanceAnimated) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 l11 = n1.l(onAppearanceAnimated, u11);
            if (state instanceof MorkovskTabbarVI.Tab.Indicator.Pin) {
                u11.o(-862039977);
                e.a aVar = e.f40358c0;
                e b11 = P.b(interfaceC9893b.a(aVar, InterfaceC6250b.a.n()), 2, -4);
                j12 = C7807Z.f72252f;
                float f7 = 18;
                e o11 = a0.o(PreviewKt.m942previewBackgroundRPmYEkk(b11, j12, u11, 48), f7, f7);
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, o11);
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
                F1.b(u11, f12, InterfaceC2801g.a.f());
                String image = ((MorkovskTabbarVI.Tab.Indicator.Pin) state).getImage();
                u11.o(-1066578666);
                e d12 = a0.d(aVar);
                if (z11) {
                    d12 = pinAppearanceAnimation(d12, MorkovskTabbarIndicator$lambda$0(l11));
                }
                if (!z11) {
                    d12 = (e) u11.m(LocalPinTriggerModifierKt.getLocalPinTriggerAnimation());
                }
                u11.k();
                Ag0.e.a(image, d12, null, null, null, 0.0f, null, u11, 3072, 244);
                u11.f();
                u11.k();
            } else {
                if (!(state instanceof MorkovskTabbarVI.Tab.Indicator.Badge)) {
                    u11.o(-862041383);
                    u11.k();
                    throw new o();
                }
                u11.o(-862018945);
                e.a aVar2 = e.f40358c0;
                e c11 = P.c(interfaceC9893b.a(aVar2, InterfaceC6250b.a.m()), 0.0f, -6, 1);
                j11 = C7807Z.f72253g;
                e o12 = a0.o(PreviewKt.m942previewBackgroundRPmYEkk(c11, j11, u11, 48), 80, 18);
                V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = u11.I();
                A0 d13 = u11.d();
                e f15 = c.f(u11, o12);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                Function2 f16 = E.f(u11, f14, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f16);
                }
                F1.b(u11, f15, InterfaceC2801g.a.f());
                String image2 = ((MorkovskTabbarVI.Tab.Indicator.Badge) state).getImage();
                e d14 = a0.d(aVar2);
                if (z11) {
                    d14 = badgeAppearanceAnimation(d14, MorkovskTabbarIndicator$lambda$0(l11));
                }
                Ag0.e.a(image2, d14, null, null, null, 0.0f, null, u11, 3072, 244);
                u11.f();
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MorkovskTabbarTabIndicatorKt$MorkovskTabbarIndicator$3(interfaceC9893b, state, z11, onAppearanceAnimated, i11));
        }
    }

    private static final Function0<Unit> MorkovskTabbarIndicator$lambda$0(A1<? extends Function0<Unit>> a12) {
        return a12.getValue();
    }

    private static final e badgeAppearanceAnimation(e eVar, Function0<Unit> function0) {
        e b11;
        b11 = c.b(eVar, C5236c1.a(), new MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1(function0));
        return b11;
    }

    private static final e pinAppearanceAnimation(e eVar, Function0<Unit> function0) {
        e b11;
        b11 = c.b(eVar, C5236c1.a(), new MorkovskTabbarTabIndicatorKt$pinAppearanceAnimation$1(function0));
        return b11;
    }
}
