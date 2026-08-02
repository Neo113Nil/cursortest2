package ru.ozon.app.android.travel.utils.extensions;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/core/UniColors;", "Ll1/Z;", "composeColor", "(Lru/ozon/uni/core/UniColors;LS0/k;I)J", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeColorKt {
    public static final long composeColor(@NotNull UniColors uniColors, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(uniColors, "<this>");
        interfaceC3967k.o(1181107487);
        C7807Z parseColorToken = TokenParserKt.parseColorToken(uniColors.getToken(), interfaceC3967k, 0);
        long w11 = parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m;
        interfaceC3967k.k();
        return w11;
    }
}
