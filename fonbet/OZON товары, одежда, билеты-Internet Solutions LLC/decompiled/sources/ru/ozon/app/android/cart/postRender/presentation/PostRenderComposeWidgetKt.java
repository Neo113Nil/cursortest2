package ru.ozon.app.android.cart.postRender.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "PostRenderComposeWidget", "(Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostRenderComposeWidgetKt {
    public static final void PostRenderComposeWidget(@NotNull PostRenderVO state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(216746487);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            AtomAction action = state.getAction();
            if (action != null) {
                u11.o(-88904690);
                boolean F11 = ((i12 & 112) == 32) | u11.F(action);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new PostRenderComposeWidgetKt$PostRenderComposeWidget$1$1$1(actionHandler, action, null);
                    u11.x(C11);
                }
                u11.k();
                Q.e(u11, state, (Function2) C11);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PostRenderComposeWidgetKt$PostRenderComposeWidget$2(state, actionHandler, i11));
        }
    }
}
