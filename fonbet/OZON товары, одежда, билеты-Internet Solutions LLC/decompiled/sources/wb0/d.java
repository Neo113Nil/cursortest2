package wb0;

import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements InterfaceC10470b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f103743a;

    public d(@NotNull L response, @NotNull String incidentId) {
        Intrinsics.checkNotNullParameter(incidentId, "incidentId");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f103743a = incidentId;
    }

    @Override // wb0.InterfaceC10470b
    @NotNull
    public final String id() {
        return this.f103743a;
    }
}
