package y60;

import U50.b;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z60.e;

/* renamed from: y60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10849a implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f106091a;

    public C10849a(@NotNull A60.b shareQrBridgeInterface, @NotNull e shareFileBridgeInterface) {
        Intrinsics.checkNotNullParameter(shareQrBridgeInterface, "shareQrBridgeInterface");
        Intrinsics.checkNotNullParameter(shareFileBridgeInterface, "shareFileBridgeInterface");
        this.f106091a = C7714v.b0(shareQrBridgeInterface, shareFileBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f106091a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "share";
    }
}
