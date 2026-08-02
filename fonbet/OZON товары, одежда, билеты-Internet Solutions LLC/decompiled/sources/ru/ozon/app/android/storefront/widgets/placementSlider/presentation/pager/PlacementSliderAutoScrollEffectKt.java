package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import android.os.SystemClock;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.C9716e;
import x1.L;
import y0.b0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\r*\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0011\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Ly0/b0;", "pagerState", "", "scrollInterval", "", "isEnabled", "isPaused", "Lkotlin/Function1;", "", "nextPage", "", "PlacementSliderAutoScrollEffect", "(Ly0/b0;JZZLkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "onTouchInProgressChanged", "pausePlacementSliderAutoScrollOnTouch", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;", "isDragged", "isManualScrollInProgress", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlacementSliderAutoScrollEffectKt {
    public static final void PlacementSliderAutoScrollEffect(@NotNull b0 pagerState, long j11, boolean z11, boolean z12, @NotNull Function1<? super Integer, Integer> nextPage, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z13;
        Boolean bool;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(nextPage, "nextPage");
        C3969l u11 = interfaceC3967k.u(-231197378);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(pagerState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            z13 = z11;
            i12 |= u11.p(z13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            z13 = z11;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(nextPage) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 a11 = C9716e.a(pagerState.w(), u11);
            u11.o(-1622288782);
            int i13 = i12 & 14;
            boolean z14 = i13 == 4;
            Object C11 = u11.C();
            if (z14 || C11 == InterfaceC3967k.a.a()) {
                C11 = Long.valueOf(SystemClock.elapsedRealtime());
                u11.x(C11);
            }
            long longValue = ((Number) C11).longValue();
            u11.k();
            u11.o(-1622285878);
            boolean z15 = i13 == 4;
            Object C12 = u11.C();
            if (z15 || C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
            u11.k();
            Boolean valueOf = Boolean.valueOf(PlacementSliderAutoScrollEffect$lambda$0(a11));
            u11.o(-1622282695);
            boolean n11 = u11.n(a11) | u11.n(interfaceC3978p0) | (i13 == 4);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1(a11, interfaceC3978p0, pagerState, null);
                u11.x(C13);
            }
            u11.k();
            Q.g(pagerState, valueOf, (Function2) C13, u11);
            boolean z16 = PlacementSliderAutoScrollEffect$lambda$3(interfaceC3978p0) || z12;
            Long valueOf2 = Long.valueOf(j11);
            Boolean valueOf3 = Boolean.valueOf(z13);
            Boolean valueOf4 = Boolean.valueOf(z16);
            u11.o(-1622266710);
            boolean p11 = ((i12 & 896) == 256) | ((i12 & 112) == 32) | u11.p(z16) | u11.s(longValue) | (i13 == 4) | ((i12 & 57344) == 16384);
            Object C14 = u11.C();
            if (p11 || C14 == InterfaceC3967k.a.a()) {
                bool = valueOf4;
                PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1 placementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1 = new PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1(j11, z13, z16, longValue, pagerState, nextPage, null);
                u11.x(placementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1);
                C14 = placementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$2$1;
            } else {
                bool = valueOf4;
            }
            u11.k();
            Q.f(valueOf2, valueOf3, bool, (Function2) C14, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$3(pagerState, j11, z11, z12, nextPage, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlacementSliderAutoScrollEffect$lambda$0(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean PlacementSliderAutoScrollEffect$lambda$3(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlacementSliderAutoScrollEffect$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    @NotNull
    public static final e pausePlacementSliderAutoScrollOnTouch(@NotNull e eVar, @NotNull Function1<? super Boolean, Unit> onTouchInProgressChanged) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(onTouchInProgressChanged, "onTouchInProgressChanged");
        return L.b(eVar, Unit.f71690a, new PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1(onTouchInProgressChanged, null));
    }
}
