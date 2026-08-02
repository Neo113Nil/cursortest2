package ob;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb.C8891b;

/* loaded from: classes.dex */
public final class d implements rb.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pb.d f77866a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8891b f77867b;

    public d(@NotNull pb.d packageManagerDataSource, @NotNull C8891b contextDataSource) {
        Intrinsics.checkNotNullParameter(packageManagerDataSource, "packageManagerDataSource");
        Intrinsics.checkNotNullParameter(contextDataSource, "contextDataSource");
        this.f77866a = packageManagerDataSource;
        this.f77867b = contextDataSource;
    }

    @Override // rb.b
    @NotNull
    public final List<String> a() {
        return this.f77866a.a();
    }

    @Override // rb.b
    @NotNull
    public final String getPackageName() {
        return this.f77867b.a();
    }
}
