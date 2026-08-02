package n60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f76558a;

    public b(@NotNull C8447a getTypeNetworkBridgeInterface) {
        Intrinsics.checkNotNullParameter(getTypeNetworkBridgeInterface, "getTypeNetworkBridgeInterface");
        this.f76558a = C7714v.a0(getTypeNetworkBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f76558a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "network";
    }
}
