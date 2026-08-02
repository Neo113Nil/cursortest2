package h60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f65038a;

    public b(@NotNull C6820a getHeadersBridgeInterface) {
        Intrinsics.checkNotNullParameter(getHeadersBridgeInterface, "getHeadersBridgeInterface");
        this.f65038a = C7714v.a0(getHeadersBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f65038a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "headers";
    }
}
