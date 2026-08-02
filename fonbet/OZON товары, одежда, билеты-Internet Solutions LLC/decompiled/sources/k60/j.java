package k60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f70969a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f70970b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f70971c;

    public j(@NotNull g mirPayAddCardBridgeInterface, @NotNull i mirPayAvailableBridgeInterface, @NotNull m mirPayCardStatusBridgeInterface, @NotNull w mirPayStartUpdateBridgeInterface, @NotNull p mirPayGetAllCardsBridgeInterface, @NotNull s mirPayGetDeviceInfoBridgeInterface, @NotNull v mirPayGetUpdateStoresBridgeInterface) {
        Intrinsics.checkNotNullParameter(mirPayAddCardBridgeInterface, "mirPayAddCardBridgeInterface");
        Intrinsics.checkNotNullParameter(mirPayAvailableBridgeInterface, "mirPayAvailableBridgeInterface");
        Intrinsics.checkNotNullParameter(mirPayCardStatusBridgeInterface, "mirPayCardStatusBridgeInterface");
        Intrinsics.checkNotNullParameter(mirPayStartUpdateBridgeInterface, "mirPayStartUpdateBridgeInterface");
        Intrinsics.checkNotNullParameter(mirPayGetAllCardsBridgeInterface, "mirPayGetAllCardsBridgeInterface");
        Intrinsics.checkNotNullParameter(mirPayGetDeviceInfoBridgeInterface, "mirPayGetDeviceInfoBridgeInterface");
        Intrinsics.checkNotNullParameter(mirPayGetUpdateStoresBridgeInterface, "mirPayGetUpdateStoresBridgeInterface");
        List<U50.a> b02 = C7714v.b0(mirPayCardStatusBridgeInterface, mirPayAvailableBridgeInterface, mirPayAddCardBridgeInterface, mirPayStartUpdateBridgeInterface, mirPayGetAllCardsBridgeInterface, mirPayGetDeviceInfoBridgeInterface, mirPayGetUpdateStoresBridgeInterface);
        this.f70969a = b02;
        this.f70970b = "mirpay";
        this.f70971c = b02;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f70971c;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return this.f70970b;
    }
}
