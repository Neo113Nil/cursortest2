package yd;

import fe.InterfaceC6543w;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class i implements InterfaceC6543w {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final i f106571b = new i();

    @Override // fe.InterfaceC6543w
    public final void a(@NotNull InterfaceC9839e descriptor, @NotNull ArrayList unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    @Override // fe.InterfaceC6543w
    public final void b(@NotNull InterfaceC9836b descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}
