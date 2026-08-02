package f60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6440a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6441b f62942a;

    public C6440a(@NotNull C6441b feNativeNavigateInterface) {
        Intrinsics.checkNotNullParameter(feNativeNavigateInterface, "feNativeNavigateInterface");
        this.f62942a = feNativeNavigateInterface;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return C7714v.a0(this.f62942a);
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "fe_nativeui";
    }
}
