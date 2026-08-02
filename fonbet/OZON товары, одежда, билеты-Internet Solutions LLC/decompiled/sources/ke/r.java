package ke;

import je.C7382h;
import je.K0;
import je.N;
import je.r0;
import ke.f;
import ke.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h.a f71509c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f f71510d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Vd.n f71511e;

    public r(h.a kotlinTypeRefiner) {
        f.a kotlinTypePreparator = f.a.f71487a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f71509c = kotlinTypeRefiner;
        this.f71510d = kotlinTypePreparator;
        Vd.n h11 = Vd.n.h(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(h11, "createWithTypeRefiner(...)");
        this.f71511e = h11;
    }

    @Override // ke.q
    @NotNull
    public final Vd.n a() {
        return this.f71511e;
    }

    @Override // ke.q
    @NotNull
    public final h b() {
        return this.f71509c;
    }

    public final boolean c(@NotNull N a11, @NotNull N b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        r0 a12 = C7669a.a(false, this.f71510d, this.f71509c, 6);
        K0 a13 = a11.K0();
        K0 b12 = b11.K0();
        Intrinsics.checkNotNullParameter(a12, "<this>");
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b12, "b");
        return C7382h.e(a12, a13, b12);
    }

    public final boolean d(@NotNull N subtype, @NotNull N supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        r0 a11 = C7669a.a(true, this.f71510d, this.f71509c, 6);
        K0 subType = subtype.K0();
        K0 superType = supertype.K0();
        Intrinsics.checkNotNullParameter(a11, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return C7382h.i(C7382h.f69890a, a11, subType, superType);
    }
}
