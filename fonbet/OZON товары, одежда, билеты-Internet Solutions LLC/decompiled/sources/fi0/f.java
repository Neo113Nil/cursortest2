package fi0;

import Qj0.u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0 f63490a;

    public f(@NotNull u0 userDataController) {
        Intrinsics.checkNotNullParameter(userDataController, "userDataController");
        this.f63490a = userDataController;
    }

    @Override // fi0.e
    public final void a(long j11) {
        this.f63490a.f(j11);
    }

    @Override // fi0.e
    public final void setUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f63490a.g(userId);
    }
}
