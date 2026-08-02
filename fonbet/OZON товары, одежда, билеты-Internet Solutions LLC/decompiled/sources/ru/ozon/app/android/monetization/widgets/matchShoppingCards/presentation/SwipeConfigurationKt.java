package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.InterfaceC3967k;
import Z1.d;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeConfiguration;", "rememberSwipeConfiguration", "(LS0/k;I)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeConfiguration;", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwipeConfigurationKt {
    @NotNull
    public static final SwipeConfiguration rememberSwipeConfiguration(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(714660810);
        Configuration configuration = (Configuration) interfaceC3967k.m(AndroidCompositionLocals_androidKt.c());
        d dVar = (d) interfaceC3967k.m(K0.e());
        interfaceC3967k.o(805034874);
        boolean n11 = interfaceC3967k.n(configuration) | interfaceC3967k.n(dVar);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            final float v12 = dVar.v1(configuration.screenWidthDp);
            C11 = new SwipeConfiguration(v12) { // from class: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.SwipeConfigurationKt$rememberSwipeConfiguration$1$1
                private final float maxOffset;
                private final float offsetThreshold;
                private final float velocityThreshold = 1000.0f;

                {
                    this.maxOffset = 1.1f * v12;
                    this.offsetThreshold = v12 / 2;
                }

                @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.SwipeConfiguration
                public float getMaxOffset() {
                    return this.maxOffset;
                }

                @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.SwipeConfiguration
                public float getOffsetThreshold() {
                    return this.offsetThreshold;
                }

                @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.SwipeConfiguration
                public float getVelocityThreshold() {
                    return this.velocityThreshold;
                }
            };
            interfaceC3967k.x(C11);
        }
        SwipeConfigurationKt$rememberSwipeConfiguration$1$1 swipeConfigurationKt$rememberSwipeConfiguration$1$1 = (SwipeConfigurationKt$rememberSwipeConfiguration$1$1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return swipeConfigurationKt$rememberSwipeConfiguration$1$1;
    }
}
