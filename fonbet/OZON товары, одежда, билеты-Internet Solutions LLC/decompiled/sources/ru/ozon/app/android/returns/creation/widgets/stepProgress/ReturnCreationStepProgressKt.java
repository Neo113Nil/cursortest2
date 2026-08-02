package ru.ozon.app.android.returns.creation.widgets.stepProgress;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.C8392m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressVI;", "item", "Ll1/Z;", "backgroundColor", "", "ReturnCreationStepProgress-RPmYEkk", "(Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressVI;JLS0/k;I)V", "ReturnCreationStepProgress", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationStepProgressKt {
    /* renamed from: ReturnCreationStepProgress-RPmYEkk, reason: not valid java name */
    public static final void m949ReturnCreationStepProgressRPmYEkk(@NotNull ReturnCreationStepProgressVI item, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-181670979);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e i13 = T.i(androidx.compose.foundation.e.b(a0.v(a0.e(aVar, 1.0f), null, 3), j11, h.d(0.0f, 0.0f, item.getBottomCornersRadius(), item.getBottomCornersRadius(), 3)), item.getHorizontalPadding(), item.getTopPadding(), item.getHorizontalPadding(), item.getBottomPadding());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, i13);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C7807Z c7807z = TokenParserKt.tokenToColor(item.getSelectedColor(), u11, 0);
            u11.o(-911646744);
            long bgActiveActionPrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgActiveActionPrimary() : c7807z.w();
            u11.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(item.getUnselectedColor(), u11, 0);
            u11.o(-911643386);
            long bgActiveSecondary = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgActiveSecondary() : c7807z2.w();
            u11.k();
            e f13 = a0.f(a0.e(aVar, 1.0f), 4);
            u11.o(-911636541);
            boolean s11 = u11.s(bgActiveActionPrimary) | ((i12 & 14) == 4) | u11.s(bgActiveSecondary);
            Object C11 = u11.C();
            if (s11 || C11 == InterfaceC3967k.a.a()) {
                ReturnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1 returnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1 = new ReturnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1(item, bgActiveActionPrimary, bgActiveSecondary);
                u11.x(returnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1);
                C11 = returnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1;
            }
            u11.k();
            C8392m.a(f13, (Function1) C11, u11, 6);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ReturnCreationStepProgressKt$ReturnCreationStepProgress$2(item, j11, i11));
        }
    }
}
