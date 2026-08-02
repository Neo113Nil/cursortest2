package p60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r60.C9212c;
import s60.C9605c;

/* renamed from: p60.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8867d implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f80297a;

    public C8867d(@NotNull C9605c openGalleryBridgeInterface, @NotNull C9212c openFileBridgeInterface) {
        Intrinsics.checkNotNullParameter(openGalleryBridgeInterface, "openGalleryBridgeInterface");
        Intrinsics.checkNotNullParameter(openFileBridgeInterface, "openFileBridgeInterface");
        this.f80297a = C7714v.b0(openGalleryBridgeInterface, openFileBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f80297a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "open";
    }
}
