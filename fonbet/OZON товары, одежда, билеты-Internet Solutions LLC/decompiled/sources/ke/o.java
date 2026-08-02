package ke;

import java.util.ArrayList;
import java.util.List;
import je.K0;
import je.N;
import je.y0;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.i0;

/* loaded from: classes10.dex */
public final class o implements Wd.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f71501a;

    /* renamed from: b, reason: collision with root package name */
    private Function0<? extends List<? extends K0>> f71502b;

    /* renamed from: c, reason: collision with root package name */
    private final o f71503c;

    /* renamed from: d, reason: collision with root package name */
    private final i0 f71504d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f71505e;

    public o() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(y0 projection, ArrayList supertypes) {
        this(projection, new l(supertypes), (i0) null, 8);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }

    static List b(o oVar) {
        Function0<? extends List<? extends K0>> function0 = oVar.f71502b;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // je.s0
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final List<K0> o() {
        List<K0> list = (List) this.f71505e.getValue();
        return list == null ? K.f71697a : list;
    }

    public final void d(@NotNull ArrayList supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        this.f71502b = new m(supertypes);
    }

    @NotNull
    public final o e(@NotNull h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        y0 c11 = this.f71501a.c(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(c11, "refine(...)");
        n nVar = this.f71502b != null ? new n(this, kotlinTypeRefiner) : null;
        o oVar = this.f71503c;
        if (oVar == null) {
            oVar = this;
        }
        return new o(c11, nVar, oVar, this.f71504d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        o oVar = (o) obj;
        o oVar2 = this.f71503c;
        if (oVar2 == null) {
            oVar2 = this;
        }
        o oVar3 = oVar.f71503c;
        if (oVar3 != null) {
            obj = oVar3;
        }
        return oVar2 == obj;
    }

    @Override // je.s0
    @NotNull
    public final List<i0> getParameters() {
        return K.f71697a;
    }

    @Override // Wd.b
    @NotNull
    public final y0 getProjection() {
        return this.f71501a;
    }

    public final int hashCode() {
        o oVar = this.f71503c;
        return oVar != null ? oVar.hashCode() : super.hashCode();
    }

    @Override // je.s0
    @NotNull
    public final qd.m n() {
        N type = this.f71501a.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return C8701c.h(type);
    }

    @Override // je.s0
    public final InterfaceC9842h p() {
        return null;
    }

    @Override // je.s0
    public final boolean q() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "CapturedType(" + this.f71501a + ')';
    }

    public o(@NotNull y0 projection, Function0<? extends List<? extends K0>> function0, o oVar, i0 i0Var) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f71501a = projection;
        this.f71502b = function0;
        this.f71503c = oVar;
        this.f71504d = i0Var;
        this.f71505e = Sc.k.a(Sc.n.PUBLICATION, new k(this));
    }

    public /* synthetic */ o(y0 y0Var, Function0 function0, i0 i0Var, int i11) {
        this(y0Var, (Function0<? extends List<? extends K0>>) ((i11 & 2) != 0 ? null : function0), (o) null, (i11 & 8) != 0 ? null : i0Var);
    }
}
