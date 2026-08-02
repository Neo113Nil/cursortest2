package ru.ozon.uni.utils;

import S0.InterfaceC3967k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

@InterfaceC6346b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\fJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0001¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/utils/DeferredColor;", "", "Ll1/Z;", "color", "constructor-impl", "(J)Ljava/lang/Object;", "Lru/ozon/uni/core/models/UniColorToken;", "token", "(Lru/ozon/uni/core/models/UniColorToken;)Ljava/lang/Object;", "", "alphaMultiplier", "(Lru/ozon/uni/core/models/UniColorToken;F)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "getValue", "(Ljava/lang/Object;LS0/k;I)J", AppMeasurementSdk.ConditionalUserProperty.VALUE, "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredColor {
    /* renamed from: constructor-impl, reason: not valid java name */
    private static Object m3261constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3264equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    public static final long getValue(Object obj, InterfaceC3967k interfaceC3967k, int i11) {
        if (obj instanceof C7807Z) {
            interfaceC3967k.o(467701575);
            interfaceC3967k.k();
            return ((C7807Z) obj).w();
        }
        if (obj instanceof UniColorToken) {
            interfaceC3967k.o(467702989);
            long themedColor = UniCompositionLocalKt.getThemedColor((UniColorToken) obj, interfaceC3967k, UniColorToken.$stable);
            interfaceC3967k.k();
            return themedColor;
        }
        if (!(obj instanceof TokenWithAlpha)) {
            interfaceC3967k.o(467707516);
            interfaceC3967k.k();
            throw new IllegalStateException("Несовместимый тип");
        }
        interfaceC3967k.o(467705237);
        TokenWithAlpha tokenWithAlpha = (TokenWithAlpha) obj;
        long themedColor2 = UniCompositionLocalKt.getThemedColor(tokenWithAlpha.getToken(), interfaceC3967k, UniColorToken.$stable);
        long o11 = C7807Z.o(C7807Z.q(themedColor2) * tokenWithAlpha.getAlphaMultiplier(), themedColor2);
        interfaceC3967k.k();
        return o11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3265hashCodeimpl(Object obj) {
        return obj.hashCode();
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3260constructorimpl(long j11) {
        return m3261constructorimpl(C7807Z.m(j11));
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3262constructorimpl(@NotNull UniColorToken token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return m3261constructorimpl((Object) token);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3263constructorimpl(@NotNull UniColorToken token, float f7) {
        Intrinsics.checkNotNullParameter(token, "token");
        return m3261constructorimpl(new TokenWithAlpha(token, f7));
    }
}
