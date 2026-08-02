package g60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6654a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f63926a;

    public C6654a(@NotNull d requestLocationPermissionBridgeInterface, @NotNull c isAvailableBridgeInterface, @NotNull b getCurrentLocationBridgeInterface) {
        Intrinsics.checkNotNullParameter(requestLocationPermissionBridgeInterface, "requestLocationPermissionBridgeInterface");
        Intrinsics.checkNotNullParameter(isAvailableBridgeInterface, "isAvailableBridgeInterface");
        Intrinsics.checkNotNullParameter(getCurrentLocationBridgeInterface, "getCurrentLocationBridgeInterface");
        this.f63926a = C7714v.b0(requestLocationPermissionBridgeInterface, isAvailableBridgeInterface, getCurrentLocationBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f63926a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "geolocation";
    }
}
