package eb0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f62105a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private e f62106b;

    public g(@NotNull f dialog) {
        Intrinsics.checkNotNullParameter("Reset Configs", "buttonText");
        Intrinsics.checkNotNullParameter("HostConfig.ResetConfigs.Button", "buttonLocator");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f62105a = dialog;
        this.f62106b = new b();
    }

    @NotNull
    public final f a() {
        return this.f62105a;
    }

    @NotNull
    public final e b() {
        return this.f62106b;
    }

    public final void c(@NotNull Za0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f62106b = dVar;
    }
}
