package l60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: l60.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7888f implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.c> f72925a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f72926b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<U50.c> f72927c;

    public C7888f(@NotNull C7884b callTapTicBridgeInterface, @NotNull C7883a autoLockBridgeInterface, @NotNull C7885c changeBrightnessBridgeInterface, @NotNull C7889g resetBrightnessBridgeInterface, @NotNull C7890h smsListenerBridgeInterface, @NotNull C7886d copyClipboardInterface, @NotNull C7887e getSmsOtpBridgeInterface) {
        Intrinsics.checkNotNullParameter(callTapTicBridgeInterface, "callTapTicBridgeInterface");
        Intrinsics.checkNotNullParameter(autoLockBridgeInterface, "autoLockBridgeInterface");
        Intrinsics.checkNotNullParameter(changeBrightnessBridgeInterface, "changeBrightnessBridgeInterface");
        Intrinsics.checkNotNullParameter(resetBrightnessBridgeInterface, "resetBrightnessBridgeInterface");
        Intrinsics.checkNotNullParameter(smsListenerBridgeInterface, "smsListenerBridgeInterface");
        Intrinsics.checkNotNullParameter(copyClipboardInterface, "copyClipboardInterface");
        Intrinsics.checkNotNullParameter(getSmsOtpBridgeInterface, "getSmsOtpBridgeInterface");
        List<U50.c> b02 = C7714v.b0(callTapTicBridgeInterface, autoLockBridgeInterface, changeBrightnessBridgeInterface, resetBrightnessBridgeInterface, smsListenerBridgeInterface, copyClipboardInterface, getSmsOtpBridgeInterface);
        this.f72925a = b02;
        this.f72926b = "native_control";
        this.f72927c = b02;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.c> a() {
        return this.f72927c;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return this.f72926b;
    }
}
