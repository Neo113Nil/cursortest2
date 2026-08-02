package ru.ozon.app.android.utils;

import Ae.C2399j;
import Ae.InterfaceC2385c;
import Ae.InterfaceC2395h;
import He.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.J;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "period", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "LAe/h;", "interval", "(JLjava/util/concurrent/TimeUnit;)LAe/h;", "Lxe/M;", "getSafeScope", "()Lxe/M;", "safeScope", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutineUtilsKt {
    @NotNull
    public static final M getSafeScope() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return N.g(N.a(b.f10879b), new CoroutineUtilsKt$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0));
    }

    @NotNull
    public static final InterfaceC2395h<Long> interval(long j11, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return C2399j.d((InterfaceC2385c) C2399j.A(new CoroutineUtilsKt$interval$1(timeUnit, j11, null)), 0, 3);
    }
}
