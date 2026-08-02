package ru.ozon.app.android.utils;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lru/ozon/app/android/utils/Result;", "getOrThrow", "(Lru/ozon/app/android/utils/Result;)Ljava/lang/Object;", "R", "defaultValue", "getOrDefault", "(Lru/ozon/app/android/utils/Result;Ljava/lang/Object;)Ljava/lang/Object;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultKt {
    public static final <R, T extends R> R getOrDefault(@NotNull Result<T> result, R r11) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Result.Success) {
            return (R) ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Failure) {
            return r11;
        }
        throw new o();
    }

    public static final <T> T getOrThrow(@NotNull Result<T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Result.Failure) {
            throw ((Result.Failure) result).getThrowable();
        }
        if (result instanceof Result.Success) {
            return (T) ((Result.Success) result).getValue();
        }
        throw new o();
    }
}
