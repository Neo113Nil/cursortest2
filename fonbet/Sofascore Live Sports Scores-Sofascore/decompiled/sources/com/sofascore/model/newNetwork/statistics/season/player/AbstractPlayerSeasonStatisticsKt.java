package com.sofascore.model.newNetwork.statistics.season.player;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a9\u0010\u0007\u001a\u0004\u0018\u00010\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"nullableIntSumOf", "", "T", "", "selector", "Lkotlin/Function1;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Integer;", "nullableFloatSumOf", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Float;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AbstractPlayerSeasonStatisticsKt {
    @Nullable
    public static final <T> Float nullableFloatSumOf(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Float> function1) {
        iterable.getClass();
        function1.getClass();
        Iterator<? extends T> it = iterable.iterator();
        Float f = null;
        while (it.hasNext()) {
            Float f2 = (Float) function1.invoke(it.next());
            if (f2 != null) {
                f = Float.valueOf((f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + f2.floatValue());
            }
        }
        return f;
    }

    @Nullable
    public static final <T> Integer nullableIntSumOf(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Integer> function1) {
        iterable.getClass();
        function1.getClass();
        Iterator<? extends T> it = iterable.iterator();
        Integer num = null;
        while (it.hasNext()) {
            Integer num2 = (Integer) function1.invoke(it.next());
            if (num2 != null) {
                num = Integer.valueOf((num != null ? num.intValue() : 0) + num2.intValue());
            }
        }
        return num;
    }
}
