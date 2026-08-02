package ru.ozon.app.android.abtool.utils;

import De.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "coroutineScope", "Lxe/M;", "getCoroutineScope", "()Lxe/M;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineUtilsKt {

    @NotNull
    private static final M coroutineScope;

    @NotNull
    private static final J exceptionHandler;

    static {
        CoroutineUtilsKt$special$$inlined$CoroutineExceptionHandler$1 coroutineUtilsKt$special$$inlined$CoroutineExceptionHandler$1 = new CoroutineUtilsKt$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        exceptionHandler = coroutineUtilsKt$special$$inlined$CoroutineExceptionHandler$1;
        C10720e0 c10720e0 = C10720e0.f105451a;
        coroutineScope = N.a(s.f6650a.plus(X0.b()).plus(coroutineUtilsKt$special$$inlined$CoroutineExceptionHandler$1));
    }

    @NotNull
    public static final M getCoroutineScope() {
        return coroutineScope;
    }
}
