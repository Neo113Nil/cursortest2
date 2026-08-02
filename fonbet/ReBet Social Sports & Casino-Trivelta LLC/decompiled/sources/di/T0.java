package di;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class T0 implements bi.f, InterfaceC4103n {

    /* renamed from: a, reason: collision with root package name */
    public final bi.f f45327a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45328b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f45329c;

    public T0(bi.f original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f45327a = original;
        this.f45328b = original.h() + '?';
        this.f45329c = E0.a(original);
    }

    @Override // di.InterfaceC4103n
    public Set a() {
        return this.f45329c;
    }

    @Override // bi.f
    public boolean b() {
        return true;
    }

    @Override // bi.f
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f45327a.c(name);
    }

    @Override // bi.f
    public int d() {
        return this.f45327a.d();
    }

    @Override // bi.f
    public String e(int i10) {
        return this.f45327a.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T0) && Intrinsics.areEqual(this.f45327a, ((T0) obj).f45327a);
    }

    @Override // bi.f
    public List f(int i10) {
        return this.f45327a.f(i10);
    }

    @Override // bi.f
    public bi.f g(int i10) {
        return this.f45327a.g(i10);
    }

    @Override // bi.f
    public List getAnnotations() {
        return this.f45327a.getAnnotations();
    }

    @Override // bi.f
    public bi.m getKind() {
        return this.f45327a.getKind();
    }

    @Override // bi.f
    public String h() {
        return this.f45328b;
    }

    public int hashCode() {
        return this.f45327a.hashCode() * 31;
    }

    @Override // bi.f
    public boolean i(int i10) {
        return this.f45327a.i(i10);
    }

    @Override // bi.f
    public boolean isInline() {
        return this.f45327a.isInline();
    }

    public final bi.f j() {
        return this.f45327a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45327a);
        sb2.append('?');
        return sb2.toString();
    }
}
