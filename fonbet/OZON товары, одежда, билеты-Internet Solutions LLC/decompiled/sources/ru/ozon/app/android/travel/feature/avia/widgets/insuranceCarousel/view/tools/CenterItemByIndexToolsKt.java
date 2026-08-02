package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;
import v0.I;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv0/I;", "", "itemWidthPx", "centerOffset", "(Lv0/I;I)I", "index", "lastSelectedIndex", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModelAction;", "", "onAction", "CenterItemByIndexAfterListUpdate", "(Lv0/I;IIILkotlin/jvm/functions/Function1;LS0/k;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CenterItemByIndexToolsKt {
    public static final void CenterItemByIndexAfterListUpdate(@NotNull I i11, int i12, int i13, int i14, @NotNull Function1<? super InsuranceCarouselViewModelAction, Unit> onAction, InterfaceC3967k interfaceC3967k, int i15) {
        int i16;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(i11, "<this>");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(437102916);
        if ((i15 & 6) == 0) {
            i16 = (u11.n(i11) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 = i12;
            i16 |= u11.r(i17) ? 32 : 16;
        } else {
            i17 = i12;
        }
        if ((i15 & 384) == 0) {
            i16 |= u11.r(i13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 3072) == 0) {
            i18 = i14;
            i16 |= u11.r(i18) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            i18 = i14;
        }
        if ((i15 & 24576) == 0) {
            i16 |= u11.F(onAction) ? 16384 : 8192;
        }
        if ((i16 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            Integer valueOf = Integer.valueOf(i17);
            Integer valueOf2 = Integer.valueOf(i18);
            u11.o(-889367990);
            boolean z11 = ((i16 & 14) == 4) | ((i16 & 112) == 32) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048) | ((i16 & 57344) == 16384);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1 centerItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1 = new CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1(i11, i17, i13, i18, onAction, null);
                u11.x(centerItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1);
                C11 = centerItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$1$1;
            }
            u11.k();
            Q.g(valueOf, valueOf2, (Function2) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$2(i11, i12, i13, i14, onAction, i15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int centerOffset(I i11, int i12) {
        return -((((((int) (i11.t().a() >> 32)) - i11.t().c()) - i11.t().b()) - i12) / 2);
    }
}
