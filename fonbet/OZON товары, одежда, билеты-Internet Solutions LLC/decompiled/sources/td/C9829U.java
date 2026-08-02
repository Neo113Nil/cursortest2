package td;

import java.util.List;
import je.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.U, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9829U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9843i f99379a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<y0> f99380b;

    /* renamed from: c, reason: collision with root package name */
    private final C9829U f99381c;

    /* JADX WARN: Multi-variable type inference failed */
    public C9829U(@NotNull InterfaceC9843i classifierDescriptor, @NotNull List<? extends y0> arguments, C9829U c9829u) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f99379a = classifierDescriptor;
        this.f99380b = arguments;
        this.f99381c = c9829u;
    }

    @NotNull
    public final List<y0> a() {
        return this.f99380b;
    }

    @NotNull
    public final InterfaceC9843i b() {
        return this.f99379a;
    }

    public final C9829U c() {
        return this.f99381c;
    }
}
