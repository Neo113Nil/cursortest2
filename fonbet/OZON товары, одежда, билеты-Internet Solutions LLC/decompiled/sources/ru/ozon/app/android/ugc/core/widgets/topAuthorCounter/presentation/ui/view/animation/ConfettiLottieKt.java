package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.animation;

import B1.InterfaceC2547p;
import B5.g;
import F5.C3042b;
import F5.F;
import F5.InterfaceC3043c;
import F5.l;
import F5.m;
import F5.p;
import F5.q;
import F5.v;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.R$raw;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "playConfetti", "Lkotlin/Function0;", "", "onFinished", "LottieConfetti", "(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function0;LS0/k;II)V", "LB5/g;", "composition", "", "progress", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfettiLottieKt {
    public static final void LottieConfetti(e eVar, boolean z11, @NotNull Function0<Unit> onFinished, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        C3969l u11 = interfaceC3967k.u(-707145134);
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
            i13 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onFinished) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            q c11 = F.c(v.a(R$raw.confetti_top_author), u11);
            int i15 = i13 & 112;
            InterfaceC3043c a11 = C3042b.a(LottieConfetti$lambda$0(c11), z11, u11);
            Float valueOf = Float.valueOf(LottieConfetti$lambda$1(a11));
            Boolean valueOf2 = Boolean.valueOf(z11);
            u11.o(-1433563354);
            boolean n11 = (i15 == 32) | u11.n(a11) | ((i13 & 896) == 256);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ConfettiLottieKt$LottieConfetti$1$1(z11, onFinished, a11, null);
                u11.x(C11);
            }
            u11.k();
            Q.g(valueOf, valueOf2, (Function2) C11, u11);
            g LottieConfetti$lambda$0 = LottieConfetti$lambda$0(c11);
            InterfaceC2547p.a.C0051a a12 = InterfaceC2547p.a.a();
            u11.o(-1433558150);
            boolean n12 = u11.n(a11);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ConfettiLottieKt$LottieConfetti$2$1(a11);
                u11.x(C12);
            }
            u11.k();
            e eVar2 = eVar;
            l.a(LottieConfetti$lambda$0, (Function0) C12, eVar2, a12, u11, (i13 << 6) & 896);
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ConfettiLottieKt$LottieConfetti$3(eVar, z11, onFinished, i11, i12));
        }
    }

    private static final g LottieConfetti$lambda$0(p pVar) {
        return pVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieConfetti$lambda$1(m mVar) {
        return mVar.getValue().floatValue();
    }
}
