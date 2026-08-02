package ru.ozon.uni.ozi.utils.internal.presets;

import S0.InterfaceC3967k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;

@InterfaceC6346b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0001¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/ozi/utils/internal/presets/DeferredColor;", "", "Ll1/Z;", "color", "constructor-impl", "(J)Ljava/lang/Object;", "Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;", "token", "(Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;)Ljava/lang/Object;", "", "alphaMultiplier", "(Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;F)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "(Ljava/lang/Object;LS0/k;I)J", AppMeasurementSdk.ConditionalUserProperty.VALUE, "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredColor {
    /* renamed from: constructor-impl, reason: not valid java name */
    private static Object m3250constructorimpl(Object obj) {
        return obj;
    }

    public static final long getValue(Object obj, InterfaceC3967k interfaceC3967k, int i11) {
        if (obj instanceof C7807Z) {
            interfaceC3967k.o(-426152140);
            interfaceC3967k.k();
            return ((C7807Z) obj).w();
        }
        if (obj instanceof OziColorsKeyTokens) {
            interfaceC3967k.o(-426150572);
            long value = KeyTokenUtilsKt.getValue((OziColorsKeyTokens) obj, interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        if (!(obj instanceof TokenWithAlpha)) {
            interfaceC3967k.o(-426146423);
            interfaceC3967k.k();
            throw new IllegalStateException("Несовместимый тип");
        }
        interfaceC3967k.o(-426148702);
        TokenWithAlpha tokenWithAlpha = (TokenWithAlpha) obj;
        long value2 = KeyTokenUtilsKt.getValue(tokenWithAlpha.getToken(), interfaceC3967k, 0);
        long o11 = C7807Z.o(C7807Z.q(value2) * tokenWithAlpha.getAlphaMultiplier(), value2);
        interfaceC3967k.k();
        return o11;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3249constructorimpl(long j11) {
        return m3250constructorimpl(C7807Z.m(j11));
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3251constructorimpl(@NotNull OziColorsKeyTokens token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return m3250constructorimpl((Object) token);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3252constructorimpl(@NotNull OziColorsKeyTokens token, float f7) {
        Intrinsics.checkNotNullParameter(token, "token");
        return m3250constructorimpl(new TokenWithAlpha(token, f7));
    }
}
