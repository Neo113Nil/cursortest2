package ru.ozon.app.android.pdp.utils;

import Ae.C2399j;
import Ae.InterfaceC2385c;
import Ae.InterfaceC2395h;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "period", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "LAe/h;", "interval", "(JLjava/util/concurrent/TimeUnit;)LAe/h;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CoroutinesKt {
    @NotNull
    public static final InterfaceC2395h<Long> interval(long j11, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return C2399j.d((InterfaceC2385c) C2399j.A(new CoroutinesKt$interval$1(timeUnit, j11, null)), 0, 3);
    }
}
