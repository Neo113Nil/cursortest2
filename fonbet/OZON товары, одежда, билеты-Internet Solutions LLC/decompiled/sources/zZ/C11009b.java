package zZ;

import Ld0.c;
import Od0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11009b extends d<FZ.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends FZ.a> f107410a = FZ.a.class;

    @Override // Od0.d
    public final FZ.a create(c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new C11008a();
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends FZ.a> getKey() {
        return this.f107410a;
    }
}
