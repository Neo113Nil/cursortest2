package x60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f105072a;

    public i(@NotNull f getBridgeInterface, @NotNull g saveBridgeInterface, @NotNull C10669a deviceStatusBridgeInterface, @NotNull h screenSecureBridgeInterface, @NotNull e getAppsBridgeInterface) {
        Intrinsics.checkNotNullParameter(getBridgeInterface, "getBridgeInterface");
        Intrinsics.checkNotNullParameter(saveBridgeInterface, "saveBridgeInterface");
        Intrinsics.checkNotNullParameter(deviceStatusBridgeInterface, "deviceStatusBridgeInterface");
        Intrinsics.checkNotNullParameter(screenSecureBridgeInterface, "screenSecureBridgeInterface");
        Intrinsics.checkNotNullParameter(getAppsBridgeInterface, "getAppsBridgeInterface");
        this.f105072a = C7714v.b0(getBridgeInterface, saveBridgeInterface, deviceStatusBridgeInterface, screenSecureBridgeInterface, getAppsBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f105072a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "security";
    }
}
