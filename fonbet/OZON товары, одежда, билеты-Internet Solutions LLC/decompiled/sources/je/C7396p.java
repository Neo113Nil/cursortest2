package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.C10032j;
import ud.InterfaceC10030h;

/* renamed from: je.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7396p extends AbstractC7393m0<C7396p> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10030h f69909a;

    public C7396p(@NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f69909a = annotations;
    }

    @Override // je.AbstractC7393m0
    public final C7396p a(AbstractC7393m0 abstractC7393m0) {
        C7396p c7396p = (C7396p) abstractC7393m0;
        return c7396p == null ? this : new C7396p(C10032j.a(this.f69909a, c7396p.f69909a));
    }

    @Override // je.AbstractC7393m0
    @NotNull
    public final kotlin.reflect.d<? extends C7396p> b() {
        return kotlin.jvm.internal.N.b(C7396p.class);
    }

    @Override // je.AbstractC7393m0
    public final C7396p c(AbstractC7393m0 abstractC7393m0) {
        if (Intrinsics.d((C7396p) abstractC7393m0, this)) {
            return this;
        }
        return null;
    }

    @NotNull
    public final InterfaceC10030h d() {
        return this.f69909a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7396p) {
            return Intrinsics.d(((C7396p) obj).f69909a, this.f69909a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69909a.hashCode();
    }
}
