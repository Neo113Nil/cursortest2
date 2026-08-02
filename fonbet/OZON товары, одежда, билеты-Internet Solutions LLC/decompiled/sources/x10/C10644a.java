package x10;

import f00.InterfaceC6396b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8827c;

/* renamed from: x10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10644a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6396b f104932a;

    public C10644a(@NotNull InterfaceC6396b composerDebugFlagsManagerLibsApi) {
        Intrinsics.checkNotNullParameter(composerDebugFlagsManagerLibsApi, "composerDebugFlagsManagerLibsApi");
        this.f104932a = composerDebugFlagsManagerLibsApi;
    }

    public final boolean a() {
        InterfaceC6396b interfaceC6396b = this.f104932a;
        return interfaceC6396b.k() && interfaceC6396b.C() && interfaceC6396b.E(C8827c.f80007b);
    }
}
