package j60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7291a f69461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f69462b;

    public c(@NotNull C7291a localAuthAvailableBridgeInterface, @NotNull b localAuthAvailableBridgeInterfaceV2) {
        Intrinsics.checkNotNullParameter(localAuthAvailableBridgeInterface, "localAuthAvailableBridgeInterface");
        Intrinsics.checkNotNullParameter(localAuthAvailableBridgeInterfaceV2, "localAuthAvailableBridgeInterfaceV2");
        this.f69461a = localAuthAvailableBridgeInterface;
        this.f69462b = localAuthAvailableBridgeInterfaceV2;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return C7714v.b0(this.f69461a, this.f69462b);
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "localauth";
    }
}
