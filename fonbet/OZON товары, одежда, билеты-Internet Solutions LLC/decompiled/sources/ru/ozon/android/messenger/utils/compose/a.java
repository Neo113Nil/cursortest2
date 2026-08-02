package ru.ozon.android.messenger.utils.compose;

import S0.InterfaceC3967k;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static final AbstractC7799Q a(@NotNull String tokenToGradientOrColorBrush, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(tokenToGradientOrColorBrush, "$this$tokenToGradientOrColorBrush");
        interfaceC3967k.o(-602733895);
        long clearLightKey0 = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getClearLightKey0();
        int i12 = i11 & 14;
        AbstractC7799Q abstractC7799Q = TokenParserKt.tokenToGradient(tokenToGradientOrColorBrush, interfaceC3967k, i12);
        if (abstractC7799Q == null) {
            C7807Z c7807z = TokenParserKt.tokenToColor(tokenToGradientOrColorBrush, interfaceC3967k, i12);
            abstractC7799Q = c7807z != null ? new K0(c7807z.w()) : null;
        }
        if (abstractC7799Q == null) {
            abstractC7799Q = new K0(clearLightKey0);
        }
        interfaceC3967k.k();
        return abstractC7799Q;
    }
}
