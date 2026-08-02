package pm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm0.C9318c;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

/* renamed from: pm0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8943b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9318c f81269a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xm0.b f81270b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sm0.b f81271c;

    public C8943b(@NotNull C9318c eventsStorage, @NotNull xm0.b networkDelegate, @NotNull sm0.b eventsPackageBuilder) {
        Intrinsics.checkNotNullParameter(eventsStorage, "eventsStorage");
        Intrinsics.checkNotNullParameter(networkDelegate, "networkDelegate");
        Intrinsics.checkNotNullParameter(eventsPackageBuilder, "eventsPackageBuilder");
        this.f81269a = eventsStorage;
        this.f81270b = networkDelegate;
        this.f81271c = eventsPackageBuilder;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(N.a(He.b.f10879b), null, null, new C8942a(this, null), 3);
    }

    public final void d(@NotNull wm0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f81269a.d(event);
    }
}
