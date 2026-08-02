package di;

import bi.n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: di.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4090g0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final bi.f f45364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45365b;

    public /* synthetic */ AbstractC4090g0(bi.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // bi.f
    public boolean b() {
        return super.b();
    }

    @Override // bi.f
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // bi.f
    public int d() {
        return this.f45365b;
    }

    @Override // bi.f
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4090g0)) {
            return false;
        }
        AbstractC4090g0 abstractC4090g0 = (AbstractC4090g0) obj;
        return Intrinsics.areEqual(this.f45364a, abstractC4090g0.f45364a) && Intrinsics.areEqual(h(), abstractC4090g0.h());
    }

    @Override // bi.f
    public List f(int i10) {
        if (i10 >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bi.f
    public bi.f g(int i10) {
        if (i10 >= 0) {
            return this.f45364a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bi.f
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // bi.f
    public bi.m getKind() {
        return n.b.f25231a;
    }

    public int hashCode() {
        return (this.f45364a.hashCode() * 31) + h().hashCode();
    }

    @Override // bi.f
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bi.f
    public boolean isInline() {
        return super.isInline();
    }

    public String toString() {
        return h() + '(' + this.f45364a + ')';
    }

    public AbstractC4090g0(bi.f fVar) {
        this.f45364a = fVar;
        this.f45365b = 1;
    }
}
