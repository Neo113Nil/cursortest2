package wb0;

import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.j;

/* renamed from: wb0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10471c implements InterfaceC10470b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f103742a;

    public C10471c(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f103742a = response;
    }

    @Override // wb0.InterfaceC10470b
    @NotNull
    public final String id() {
        return j.a(this.f103742a);
    }
}
