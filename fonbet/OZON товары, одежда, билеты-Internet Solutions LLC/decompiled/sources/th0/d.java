package th0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f99533a;

    public d(@NotNull c firstInstallSdkVersionStorage, @NotNull C9875a firstInstallChecker) {
        Intrinsics.checkNotNullParameter(firstInstallSdkVersionStorage, "firstInstallSdkVersionStorage");
        Intrinsics.checkNotNullParameter(firstInstallChecker, "firstInstallChecker");
        this.f99533a = firstInstallSdkVersionStorage;
        if (firstInstallChecker.a()) {
            firstInstallSdkVersionStorage.b();
        }
    }

    public final boolean a() {
        return this.f99533a.c();
    }
}
