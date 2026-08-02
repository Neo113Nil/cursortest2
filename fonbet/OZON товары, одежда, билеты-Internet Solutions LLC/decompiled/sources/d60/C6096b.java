package d60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6096b implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f61209a;

    public C6096b(@NotNull C6095a esiaAuthBridgeInterface, @NotNull c esiaIsAvailableBridgeInterface) {
        Intrinsics.checkNotNullParameter(esiaAuthBridgeInterface, "esiaAuthBridgeInterface");
        Intrinsics.checkNotNullParameter(esiaIsAvailableBridgeInterface, "esiaIsAvailableBridgeInterface");
        this.f61209a = C7714v.b0(esiaAuthBridgeInterface, esiaIsAvailableBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f61209a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "esia";
    }
}
