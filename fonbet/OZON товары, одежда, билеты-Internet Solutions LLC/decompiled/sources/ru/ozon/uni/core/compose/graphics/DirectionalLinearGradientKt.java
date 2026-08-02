package ru.ozon.uni.core.compose.graphics;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniGradientDirection;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\n*\u00020\u00002*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ll1/Q$a;", "", "Lkotlin/Pair;", "", "Ll1/Z;", "colorStops", "Ll1/L0;", "tileMode", "Lru/ozon/uni/core/models/UniGradientDirection;", "direction", "Ll1/Q;", "directionalLinearGradient-esKoAe4", "(Ll1/Q$a;[Lkotlin/Pair;ILru/ozon/uni/core/models/UniGradientDirection;)Ll1/Q;", "directionalLinearGradient", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DirectionalLinearGradientKt {
    @NotNull
    /* renamed from: directionalLinearGradient-esKoAe4, reason: not valid java name */
    public static final AbstractC7799Q m1957directionalLinearGradientesKoAe4(@NotNull AbstractC7799Q.a directionalLinearGradient, @NotNull Pair<Float, C7807Z>[] colorStops, int i11, @NotNull UniGradientDirection direction) {
        Intrinsics.checkNotNullParameter(directionalLinearGradient, "$this$directionalLinearGradient");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        Intrinsics.checkNotNullParameter(direction, "direction");
        ArrayList arrayList = new ArrayList(colorStops.length);
        for (Pair<Float, C7807Z> pair : colorStops) {
            arrayList.add(C7807Z.m(pair.f().w()));
        }
        ArrayList arrayList2 = new ArrayList(colorStops.length);
        for (Pair<Float, C7807Z> pair2 : colorStops) {
            arrayList2.add(Float.valueOf(pair2.e().floatValue()));
        }
        return new DirectionalLinearGradient(arrayList, arrayList2, i11, direction, null);
    }

    /* renamed from: directionalLinearGradient-esKoAe4$default, reason: not valid java name */
    public static /* synthetic */ AbstractC7799Q m1958directionalLinearGradientesKoAe4$default(AbstractC7799Q.a aVar, Pair[] pairArr, int i11, UniGradientDirection uniGradientDirection, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m1957directionalLinearGradientesKoAe4(aVar, pairArr, i11, uniGradientDirection);
    }
}
