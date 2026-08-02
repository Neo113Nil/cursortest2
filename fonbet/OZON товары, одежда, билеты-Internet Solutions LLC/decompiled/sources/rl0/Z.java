package rl0;

import kotlin.jvm.internal.Intrinsics;
import mm0.C8348a;
import mm0.C8351d;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;

/* loaded from: classes8.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8348a<InstallState> f83662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8351d f83663b;

    public Z() {
        C8348a<InstallState> c8348a = new C8348a<>(InstallState.INSTANCE.empty$sdk_public_appupdate_release());
        this.f83662a = c8348a;
        Intrinsics.checkNotNullParameter(c8348a, "<this>");
        this.f83663b = new C8351d(c8348a);
    }
}
