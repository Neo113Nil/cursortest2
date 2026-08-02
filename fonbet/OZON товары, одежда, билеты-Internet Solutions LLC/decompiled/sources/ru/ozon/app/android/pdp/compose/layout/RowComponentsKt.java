package ru.ozon.app.android.pdp.compose.layout;

import B1.v0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a=\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Landroidx/compose/foundation/layout/b$e;", "contentArrangement", "Lkotlin/Function0;", "", "startContent", "endContent", "AdaptiveScrollRow", "(Landroidx/compose/ui/e;Landroidx/compose/foundation/layout/b$e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RowComponentsKt {
    public static final void AdaptiveScrollRow(e eVar, @NotNull C5179b.e contentArrangement, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> startContent, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> endContent, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(contentArrangement, "contentArrangement");
        Intrinsics.checkNotNullParameter(startContent, "startContent");
        Intrinsics.checkNotNullParameter(endContent, "endContent");
        C3969l u11 = interfaceC3967k.u(29610849);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(contentArrangement) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(startContent) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(endContent) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(-742885306);
            boolean z11 = ((i13 & 896) == 256) | ((i13 & 7168) == 2048) | ((i13 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new RowComponentsKt$AdaptiveScrollRow$1$1(startContent, endContent, contentArrangement);
                u11.x(C11);
            }
            u11.k();
            v0.b(eVar, (Function2) C11, u11, i13 & 14, 0);
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new RowComponentsKt$AdaptiveScrollRow$2(eVar2, contentArrangement, startContent, endContent, i11, i12));
        }
    }
}
