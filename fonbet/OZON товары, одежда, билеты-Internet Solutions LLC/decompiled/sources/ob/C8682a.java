package ob;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb.C8890a;
import rb.InterfaceC9240a;

/* renamed from: ob.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8682a implements InterfaceC9240a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8890a f77864a;

    public C8682a(@NotNull C8890a callingAppDataSource) {
        Intrinsics.checkNotNullParameter(callingAppDataSource, "callingAppDataSource");
        this.f77864a = callingAppDataSource;
    }

    @Override // rb.InterfaceC9240a
    public final String a(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return this.f77864a.c(packageName);
    }

    @Override // rb.InterfaceC9240a
    public final String b(int i11) {
        return this.f77864a.a(i11);
    }

    @Override // rb.InterfaceC9240a
    public final String c(int i11) {
        return this.f77864a.b(i11);
    }
}
