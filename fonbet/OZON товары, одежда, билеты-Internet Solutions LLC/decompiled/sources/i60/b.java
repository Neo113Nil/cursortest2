package i60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f65914a;

    public b(@NotNull C7016a keyboardHideBridgeInterface, @NotNull c keyboardIsVisibleBridgeInterface, @NotNull d keyboardShowBridgeInterface) {
        Intrinsics.checkNotNullParameter(keyboardHideBridgeInterface, "keyboardHideBridgeInterface");
        Intrinsics.checkNotNullParameter(keyboardIsVisibleBridgeInterface, "keyboardIsVisibleBridgeInterface");
        Intrinsics.checkNotNullParameter(keyboardShowBridgeInterface, "keyboardShowBridgeInterface");
        this.f65914a = C7714v.b0(keyboardHideBridgeInterface, keyboardIsVisibleBridgeInterface, keyboardShowBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f65914a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "keyboard";
    }
}
