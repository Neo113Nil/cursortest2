package androidx.media3.exoplayer.trackselection;

import java.util.List;

/* loaded from: classes.dex */
public abstract class A implements y {

    /* renamed from: a, reason: collision with root package name */
    public final y f21904a;

    public A(y yVar) {
        this.f21904a = yVar;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public long a() {
        return this.f21904a.a();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public boolean b(int i10, long j10) {
        return this.f21904a.b(i10, j10);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int d() {
        return this.f21904a.d();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void disable() {
        this.f21904a.disable();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void enable() {
        this.f21904a.enable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f21904a.equals(((A) obj).f21904a);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public int f(int i10) {
        return this.f21904a.f(i10);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public boolean g(long j10, B1.e eVar, List list) {
        return this.f21904a.g(j10, eVar, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public boolean h(int i10, long j10) {
        return this.f21904a.h(i10, j10);
    }

    public int hashCode() {
        return this.f21904a.hashCode();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void i(float f10) {
        this.f21904a.i(f10);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public Object j() {
        return this.f21904a.j();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void k() {
        this.f21904a.k();
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public int l(int i10) {
        return this.f21904a.l(i10);
    }

    @Override // androidx.media3.exoplayer.trackselection.C
    public int length() {
        return this.f21904a.length();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void n(long j10, long j11, long j12, List list, B1.n[] nVarArr) {
        this.f21904a.n(j10, j11, j12, list, nVarArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void o(boolean z10) {
        this.f21904a.o(z10);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int p(long j10, List list) {
        return this.f21904a.p(j10, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int q() {
        return this.f21904a.q();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int s() {
        return this.f21904a.s();
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void t() {
        this.f21904a.t();
    }

    public y u() {
        return this.f21904a;
    }
}
