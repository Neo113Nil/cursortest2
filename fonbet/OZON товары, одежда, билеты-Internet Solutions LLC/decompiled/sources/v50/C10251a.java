package v50;

import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10251a extends F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C10251a f102326a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<F> f102327b;

    static {
        C10251a c10251a = new C10251a(0);
        f102326a = c10251a;
        F[] elements = {C10256f.f102333a, C10252b.f102328a, c10251a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f102327b = C7705l.j0(elements);
    }

    @Override // v50.F
    @NotNull
    public final Set<F> a() {
        return f102327b;
    }
}
