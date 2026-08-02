package z30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements C30.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f107205a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f107206b = Executors.newFixedThreadPool(3);

    c() {
    }

    @Override // C30.a
    public final ExecutorService a() {
        ExecutorService cpu = this.f107206b;
        Intrinsics.checkNotNullExpressionValue(cpu, "cpu");
        return cpu;
    }
}
