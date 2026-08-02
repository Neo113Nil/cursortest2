package yl0;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yl0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10916a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10918c f106772a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f106773b;

    public C10916a(Executor executor, @NotNull InterfaceC10918c onCompletionListener) {
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        this.f106772a = onCompletionListener;
        this.f106773b = executor;
    }

    public final Executor a() {
        return this.f106773b;
    }

    @NotNull
    public final InterfaceC10918c b() {
        return this.f106772a;
    }
}
