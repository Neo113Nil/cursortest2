package ru.ozon.app.android.pikazon.glide.targets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.f;
import m6.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lm6/h;", "Lm6/f;", "asImageViewTargetOrNull", "(Lm6/h;)Lm6/f;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetExtKt {
    public static final <T> f<T> asImageViewTargetOrNull(@NotNull h<T> hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (!(hVar instanceof OzonMetricTarget)) {
            if (hVar instanceof f) {
                return (f) hVar;
            }
            return null;
        }
        h<T> glideTarget = ((OzonMetricTarget) hVar).getGlideTarget();
        if (glideTarget instanceof f) {
            return (f) glideTarget;
        }
        return null;
    }
}
