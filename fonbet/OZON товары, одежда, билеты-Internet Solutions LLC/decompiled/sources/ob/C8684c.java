package ob;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb.C8892c;

/* renamed from: ob.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8684c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8892c f77865a;

    public C8684c(@NotNull C8892c manifestDataSource) {
        Intrinsics.checkNotNullParameter(manifestDataSource, "manifestDataSource");
        this.f77865a = manifestDataSource;
    }

    public final String a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f77865a.b(key);
    }
}
