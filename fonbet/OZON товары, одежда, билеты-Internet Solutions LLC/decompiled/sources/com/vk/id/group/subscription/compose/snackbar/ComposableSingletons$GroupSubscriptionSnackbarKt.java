package com.vk.id.group.subscription.compose.snackbar;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import u0.E;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$GroupSubscriptionSnackbarKt {

    @NotNull
    public static final ComposableSingletons$GroupSubscriptionSnackbarKt INSTANCE = new ComposableSingletons$GroupSubscriptionSnackbarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<InterfaceC3967k, Integer, Unit> f15lambda1 = new C4912a(false, -1035473237, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.snackbar.ComposableSingletons$GroupSubscriptionSnackbarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
            if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                interfaceC3967k.j();
            } else {
                E.a(interfaceC3967k, a0.f(e.f40358c0, 56));
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$group_subscription_compose_release, reason: not valid java name */
    public final Function2<InterfaceC3967k, Integer, Unit> m50getLambda1$group_subscription_compose_release() {
        return f15lambda1;
    }
}
