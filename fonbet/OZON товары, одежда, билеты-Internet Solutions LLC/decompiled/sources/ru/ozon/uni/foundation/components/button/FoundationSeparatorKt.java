package ru.ozon.uni.foundation.components.button;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "LZ1/h;", "thickness", "", "isVertical", "", "FoundationSeparator-aM-cp0Q", "(Landroidx/compose/ui/e;JFZLS0/k;I)V", "FoundationSeparator", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FoundationSeparatorKt {
    /* renamed from: FoundationSeparator-aM-cp0Q, reason: not valid java name */
    public static final void m2985FoundationSeparatoraMcp0Q(@NotNull e modifier, long j11, float f7, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        e b12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(573482898);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else if (z11) {
            u11.o(-1758970349);
            b12 = androidx.compose.foundation.e.b(a0.r(a0.c(modifier), f7), j11, y0.a());
            C5185h.a(b12, u11, 0);
            u11.k();
        } else {
            u11.o(-1758800717);
            b11 = androidx.compose.foundation.e.b(a0.f(a0.e(modifier, 1.0f), f7), j11, y0.a());
            C5185h.a(b11, u11, 0);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FoundationSeparatorKt$FoundationSeparator$1(modifier, j11, f7, z11, i11));
        }
    }
}
