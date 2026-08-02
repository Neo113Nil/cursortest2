package ru.ozon.uni.utils;

import S0.InterfaceC3967k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

@InterfaceC6346b
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0001¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/utils/DeferredBrush;", "", "Ll1/Q;", "brush", "constructor-impl", "(Ll1/Q;)Ljava/lang/Object;", "Ll1/Z;", "color", "(J)Ljava/lang/Object;", "Lru/ozon/uni/core/models/UniColorToken;", "keyToken", "(Lru/ozon/uni/core/models/UniColorToken;)Ljava/lang/Object;", "", "alphaMultiplier", "(Lru/ozon/uni/core/models/UniColorToken;F)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "getValue", "(Ljava/lang/Object;LS0/k;I)Ll1/Q;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredBrush {
    /* renamed from: constructor-impl, reason: not valid java name */
    private static Object m3254constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3258equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    @NotNull
    public static final AbstractC7799Q getValue(Object obj, InterfaceC3967k interfaceC3967k, int i11) {
        if (obj instanceof AbstractC7799Q) {
            interfaceC3967k.o(1973027646);
            interfaceC3967k.k();
            return (AbstractC7799Q) obj;
        }
        if (obj instanceof C7807Z) {
            interfaceC3967k.o(1973028618);
            interfaceC3967k.k();
            return new K0(((C7807Z) obj).w());
        }
        if (obj instanceof UniColorToken) {
            interfaceC3967k.o(1973030230);
            K0 k02 = new K0(UniCompositionLocalKt.getThemedColor((UniColorToken) obj, interfaceC3967k, UniColorToken.$stable));
            interfaceC3967k.k();
            return k02;
        }
        if (!(obj instanceof BrushWithAlpha)) {
            interfaceC3967k.o(1973035443);
            interfaceC3967k.k();
            throw new IllegalStateException("Несовместимый тип");
        }
        interfaceC3967k.o(1973032296);
        BrushWithAlpha brushWithAlpha = (BrushWithAlpha) obj;
        K0 k03 = new K0(C7807Z.o(brushWithAlpha.getAlphaMultiplier(), UniCompositionLocalKt.getThemedColor(brushWithAlpha.getToken(), interfaceC3967k, UniColorToken.$stable)));
        interfaceC3967k.k();
        return k03;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3259hashCodeimpl(Object obj) {
        return obj.hashCode();
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3255constructorimpl(@NotNull AbstractC7799Q brush) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        return m3254constructorimpl((Object) brush);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3253constructorimpl(long j11) {
        return m3254constructorimpl(C7807Z.m(j11));
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3256constructorimpl(@NotNull UniColorToken keyToken) {
        Intrinsics.checkNotNullParameter(keyToken, "keyToken");
        return m3254constructorimpl((Object) keyToken);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3257constructorimpl(@NotNull UniColorToken keyToken, float f7) {
        Intrinsics.checkNotNullParameter(keyToken, "keyToken");
        return m3254constructorimpl(new BrushWithAlpha(keyToken, f7));
    }
}
