package ru.ozon.uni.ozi.utils.internal.presets;

import S0.InterfaceC3967k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;

@InterfaceC6346b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0088\u0001\t\u0092\u0001\u00020\u0001¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/ozi/utils/internal/presets/DeferredBrush;", "", "Ll1/Z;", "color", "constructor-impl", "(J)Ljava/lang/Object;", "Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;", "keyToken", "(Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;)Ljava/lang/Object;", "brush", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll1/Q;", "getValue", "(Ljava/lang/Object;LS0/k;I)Ll1/Q;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredBrush {
    /* renamed from: constructor-impl, reason: not valid java name */
    private static Object m3247constructorimpl(Object obj) {
        return obj;
    }

    @NotNull
    public static final AbstractC7799Q getValue(Object obj, InterfaceC3967k interfaceC3967k, int i11) {
        if (obj instanceof AbstractC7799Q) {
            return (AbstractC7799Q) obj;
        }
        if (obj instanceof C7807Z) {
            return new K0(((C7807Z) obj).w());
        }
        if (obj instanceof OziColorsKeyTokens) {
            return new K0(KeyTokenUtilsKt.getValue((OziColorsKeyTokens) obj, interfaceC3967k, 0));
        }
        throw new IllegalStateException("Несовместимый тип");
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3246constructorimpl(long j11) {
        return m3247constructorimpl(C7807Z.m(j11));
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m3248constructorimpl(@NotNull OziColorsKeyTokens keyToken) {
        Intrinsics.checkNotNullParameter(keyToken, "keyToken");
        return m3247constructorimpl((Object) keyToken);
    }
}
