package ru.ozon.app.android.pikazon.glide.targets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lm6/h;", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "loadPriority", "", "source", "Lru/ozon/app/android/pikazon/glide/targets/OzonMetricTarget;", "toOzonMetricTarget", "(Lm6/h;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Ljava/lang/Object;)Lru/ozon/app/android/pikazon/glide/targets/OzonMetricTarget;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonMetricTargetExtKt {
    @NotNull
    public static final <T> OzonMetricTarget<T> toOzonMetricTarget(@NotNull h<T> hVar, @NotNull LoadPriority loadPriority, Object obj) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        return new OzonMetricTarget<>(hVar, loadPriority, obj);
    }
}
