package je;

import ce.y;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;

/* loaded from: classes.dex */
public final class M implements s0, ne.f {

    /* renamed from: a, reason: collision with root package name */
    private N f69845a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<N> f69846b;

    /* renamed from: c, reason: collision with root package name */
    private final int f69847c;

    /* loaded from: classes10.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f69848a;

        public a(Function1 function1) {
            this.f69848a = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            N n11 = (N) t2;
            Intrinsics.f(n11);
            Function1 function1 = this.f69848a;
            String obj = function1.invoke(n11).toString();
            N n12 = (N) t11;
            Intrinsics.f(n12);
            return Vc.a.b(obj, function1.invoke(n12).toString());
        }
    }

    private M() {
        throw null;
    }

    public M(@NotNull AbstractCollection typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<N> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f69846b = linkedHashSet;
        this.f69847c = linkedHashSet.hashCode();
    }

    @NotNull
    public final ce.l b() {
        return y.a.a("member scope for intersection type", this.f69846b);
    }

    @NotNull
    public final Y c() {
        o0.f69907b.getClass();
        return Q.h(o0.f69908c, this, kotlin.collections.K.f71697a, false, b(), new C7367L(this));
    }

    public final N d() {
        return this.f69845a;
    }

    @NotNull
    public final String e(@NotNull Function1<? super N, ? extends Object> getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return C7714v.V(C7714v.I0(new a(getProperTypeRelatedToStringify), this.f69846b), " & ", "{", "}", new C7365J(getProperTypeRelatedToStringify), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return Intrinsics.d(this.f69846b, ((M) obj).f69846b);
        }
        return false;
    }

    @NotNull
    public final M f(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        LinkedHashSet<N> linkedHashSet = this.f69846b;
        ArrayList arrayList = new ArrayList(C7714v.z(linkedHashSet, 10));
        Iterator<T> it = linkedHashSet.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            arrayList.add(((N) it.next()).M0(kotlinTypeRefiner));
            z11 = true;
        }
        M m11 = null;
        if (z11) {
            N n11 = this.f69845a;
            m11 = new M(arrayList).g(n11 != null ? n11.M0(kotlinTypeRefiner) : null);
        }
        return m11 == null ? this : m11;
    }

    @NotNull
    public final M g(N n11) {
        M m11 = new M(this.f69846b);
        m11.f69845a = n11;
        return m11;
    }

    @Override // je.s0
    @NotNull
    public final List<td.i0> getParameters() {
        return kotlin.collections.K.f71697a;
    }

    public final int hashCode() {
        return this.f69847c;
    }

    @Override // je.s0
    @NotNull
    public final qd.m n() {
        qd.m n11 = this.f69846b.iterator().next().H0().n();
        Intrinsics.checkNotNullExpressionValue(n11, "getBuiltIns(...)");
        return n11;
    }

    @Override // je.s0
    @NotNull
    public final Collection<N> o() {
        return this.f69846b;
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
        return e(C7366K.f69843a);
    }
}
