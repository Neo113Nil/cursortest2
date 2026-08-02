package di;

import bi.n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: di.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4102m0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f45390a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f45391b;

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f45392c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45393d;

    public /* synthetic */ AbstractC4102m0(String str, bi.f fVar, bi.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // bi.f
    public int d() {
        return this.f45393d;
    }

    @Override // bi.f
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4102m0)) {
            return false;
        }
        AbstractC4102m0 abstractC4102m0 = (AbstractC4102m0) obj;
        return Intrinsics.areEqual(h(), abstractC4102m0.h()) && Intrinsics.areEqual(this.f45391b, abstractC4102m0.f45391b) && Intrinsics.areEqual(this.f45392c, abstractC4102m0.f45392c);
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
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f45391b;
            }
            if (i11 == 1) {
                return this.f45392c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bi.f
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // bi.f
    public bi.m getKind() {
        return n.c.f25232a;
    }

    @Override // bi.f
    public String h() {
        return this.f45390a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f45391b.hashCode()) * 31) + this.f45392c.hashCode();
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
        return h() + '(' + this.f45391b + ", " + this.f45392c + ')';
    }

    public AbstractC4102m0(String str, bi.f fVar, bi.f fVar2) {
        this.f45390a = str;
        this.f45391b = fVar;
        this.f45392c = fVar2;
        this.f45393d = 2;
    }
}
