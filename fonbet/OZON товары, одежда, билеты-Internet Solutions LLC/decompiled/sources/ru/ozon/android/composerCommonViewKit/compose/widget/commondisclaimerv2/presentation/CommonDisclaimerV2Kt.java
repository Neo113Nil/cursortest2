package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import a1.c;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.util.ResourcesExtKt;
import ru.ozon.uni.core.compose.theme.SelectThemeKt;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "vo", "Lkotlin/Function1;", "LTg/b;", "", "onAction", "DisclaimerV2", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "isRoundedCornersTheme", "Lkotlin/Function0;", "content", "WithTheme", "(ZLkotlin/jvm/functions/Function2;LS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonDisclaimerV2Kt {
    public static final void DisclaimerV2(@NotNull CommonDisclaimerV2V0 vo, @NotNull Function1<? super b, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(-1544092692);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(vo) : u11.F(vo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAction) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            WithTheme(ResourcesExtKt.isSelect((Context) u11.m(AndroidCompositionLocals_androidKt.d())), c.c(-1680519307, new CommonDisclaimerV2Kt$DisclaimerV2$1(vo, onAction), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonDisclaimerV2Kt$DisclaimerV2$2(vo, onAction, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WithTheme(boolean z11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1262496252);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (z11) {
            u11.o(399325127);
            SelectThemeKt.SelectTheme(false, function2, u11, i12 & 112, 1);
            u11.k();
        } else {
            u11.o(399376618);
            UniThemeKt.UniTheme(false, function2, u11, i12 & 112, 1);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonDisclaimerV2Kt$WithTheme$1(z11, function2, i11));
        }
    }
}
