package o60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: o60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8652a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.c> f77777a;

    public C8652a(@NotNull C8654c startOfflineModeBridgeInterface, @NotNull C8653b refreshOfflineCacheBridgeInterface) {
        Intrinsics.checkNotNullParameter(startOfflineModeBridgeInterface, "startOfflineModeBridgeInterface");
        Intrinsics.checkNotNullParameter(refreshOfflineCacheBridgeInterface, "refreshOfflineCacheBridgeInterface");
        this.f77777a = C7714v.b0(startOfflineModeBridgeInterface, refreshOfflineCacheBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.c> a() {
        return this.f77777a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "offline";
    }
}
