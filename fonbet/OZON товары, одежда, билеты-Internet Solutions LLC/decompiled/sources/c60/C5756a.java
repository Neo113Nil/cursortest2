package c60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5756a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f56617a;

    public C5756a(@NotNull C5757b openDeeplinkBridgeInterface) {
        Intrinsics.checkNotNullParameter(openDeeplinkBridgeInterface, "openDeeplinkBridgeInterface");
        this.f56617a = C7714v.a0(openDeeplinkBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f56617a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "deeplink";
    }
}
