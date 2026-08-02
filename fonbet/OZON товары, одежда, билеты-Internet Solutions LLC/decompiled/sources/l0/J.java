package l0;

import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e1.d f72022a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Z1.q, Z1.q> f72023b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8011q0 f72024c;

    public J(@NotNull e1.d dVar, @NotNull Function1 function1, @NotNull C8011q0 c8011q0) {
        this.f72022a = dVar;
        this.f72023b = function1;
        this.f72024c = c8011q0;
    }

    @NotNull
    public final InterfaceC6250b a() {
        return this.f72022a;
    }

    @NotNull
    public final m0.H<Z1.q> b() {
        return this.f72024c;
    }

    @NotNull
    public final Function1<Z1.q, Z1.q> c() {
        return this.f72023b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j11 = (J) obj;
        return this.f72022a.equals(j11.f72022a) && Intrinsics.d(this.f72023b, j11.f72023b) && this.f72024c.equals(j11.f72024c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f72024c.hashCode() + ((this.f72023b.hashCode() + (this.f72022a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ChangeSize(alignment=" + this.f72022a + ", size=" + this.f72023b + ", animationSpec=" + this.f72024c + ", clip=true)";
    }
}
