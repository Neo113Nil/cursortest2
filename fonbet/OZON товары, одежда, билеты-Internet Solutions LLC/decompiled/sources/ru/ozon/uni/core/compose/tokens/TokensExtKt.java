package ru.ozon.uni.core.compose.tokens;

import G1.e;
import K1.T;
import S0.InterfaceC3967k;
import Z1.h;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.models.UniTypographyToken;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00058G¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0014\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/core/models/UniTypographyToken;", "LK1/T;", "getTextStyle", "(Lru/ozon/uni/core/models/UniTypographyToken;)LK1/T;", "textStyle", "Lru/ozon/uni/core/models/UniIconToken;", "Lq1/b;", "getIcon", "(Lru/ozon/uni/core/models/UniIconToken;LS0/k;I)Lq1/b;", "getIcon$annotations", "(Lru/ozon/uni/core/models/UniIconToken;)V", "icon", "", "getDrawable", "(Lru/ozon/uni/core/models/UniIconToken;)Ljava/lang/Integer;", "drawable", "Lru/ozon/uni/core/models/UniGradientToken;", "Ll1/Q;", "getGradient", "(Lru/ozon/uni/core/models/UniGradientToken;LS0/k;I)Ll1/Q;", "gradient", "Lru/ozon/uni/core/models/UniPaddingToken;", "LZ1/h;", "getDp", "(Lru/ozon/uni/core/models/UniPaddingToken;)F", "dp", "Lru/ozon/uni/core/models/UniRadiusToken;", "(Lru/ozon/uni/core/models/UniRadiusToken;)F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TokensExtKt {
    public static final float getDp(@NotNull UniPaddingToken uniPaddingToken) {
        Intrinsics.checkNotNullParameter(uniPaddingToken, "<this>");
        return ((h) U.e(UniComposePaddingTokensKt.getComposePaddingTokenMap(), uniPaddingToken)).d();
    }

    public static final Integer getDrawable(@NotNull UniIconToken uniIconToken) {
        Intrinsics.checkNotNullParameter(uniIconToken, "<this>");
        return UniIconTokensKt.getIconResIdMap().get(uniIconToken.getId());
    }

    @NotNull
    public static final AbstractC7799Q getGradient(@NotNull UniGradientToken uniGradientToken, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(uniGradientToken, "<this>");
        interfaceC3967k.B(-61944197);
        AbstractC7799Q abstractC7799Q = (AbstractC7799Q) ((Function2) U.e(UniComposeGradientTokensKt.getComposeGradientTokenMap(), uniGradientToken)).invoke(interfaceC3967k, 0);
        interfaceC3967k.K();
        return abstractC7799Q;
    }

    @NotNull
    public static final AbstractC8972b getIcon(@NotNull UniIconToken uniIconToken, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(uniIconToken, "<this>");
        interfaceC3967k.B(-1302112653);
        UniPainter uniPainter = new UniPainter(uniIconToken.getId(), e.a(((Number) U.e(UniComposeIconTokensKt.getComposeIconTokenMap(), uniIconToken)).intValue(), interfaceC3967k, 0));
        interfaceC3967k.K();
        return uniPainter;
    }

    @NotNull
    public static final T getTextStyle(@NotNull UniTypographyToken uniTypographyToken) {
        Intrinsics.checkNotNullParameter(uniTypographyToken, "<this>");
        return (T) U.e(UniComposeTypographyTokensKt.getComposeTypographyTokensMap(), uniTypographyToken);
    }

    public static final float getDp(@NotNull UniRadiusToken uniRadiusToken) {
        Intrinsics.checkNotNullParameter(uniRadiusToken, "<this>");
        return ((h) U.e(UniComposeRadiusTokensKt.getComposeRadiusTokenMap(), uniRadiusToken)).d();
    }
}
