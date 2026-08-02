package gh0;

import Zg0.g;
import android.app.Application;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6735a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6736b f64485a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6738d f64486b;

    public AbstractC6735a(InterfaceC6736b interfaceC6736b, @NotNull InterfaceC6738d pushTokenUpdater) {
        Intrinsics.checkNotNullParameter(pushTokenUpdater, "pushTokenUpdater");
        this.f64485a = interfaceC6736b;
        this.f64486b = pushTokenUpdater;
    }

    public final InterfaceC6736b a() {
        return this.f64485a;
    }

    @NotNull
    public final InterfaceC6738d b() {
        return this.f64486b;
    }

    @NotNull
    public abstract CompletableFuture<Boolean> c(@NotNull Application application);

    public abstract boolean d(@NotNull g gVar);
}
