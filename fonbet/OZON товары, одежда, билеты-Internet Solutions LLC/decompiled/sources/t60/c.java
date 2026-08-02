package t60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f99220a;

    public c(@NotNull d permissionsStatus, @NotNull h requestPermissionBridgeInterface, @NotNull e requestChannelBridgeInterface, @NotNull C9773a channelStatusBridgeInterface) {
        Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsStatus");
        Intrinsics.checkNotNullParameter(requestPermissionBridgeInterface, "requestPermissionBridgeInterface");
        Intrinsics.checkNotNullParameter(requestChannelBridgeInterface, "requestChannelBridgeInterface");
        Intrinsics.checkNotNullParameter(channelStatusBridgeInterface, "channelStatusBridgeInterface");
        this.f99220a = C7714v.b0(permissionsStatus, requestPermissionBridgeInterface, channelStatusBridgeInterface, requestChannelBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f99220a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "permissions";
    }
}
