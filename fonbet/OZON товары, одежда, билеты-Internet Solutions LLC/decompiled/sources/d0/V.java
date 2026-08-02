package d0;

import android.util.Range;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class V implements Y {

    /* renamed from: a, reason: collision with root package name */
    private final Y f60868a;

    public V(@NonNull Y y11) {
        x2.i.b(y11.g());
        this.f60868a = y11;
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> a(int i11) {
        return this.f60868a.d(i11);
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> c() {
        return this.f60868a.c();
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> d(int i11) {
        return this.f60868a.a(i11);
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> e() {
        return this.f60868a.f();
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> f() {
        return this.f60868a.e();
    }

    @Override // d0.Y
    public final boolean g() {
        return this.f60868a.g();
    }

    @Override // d0.Y
    public final int h() {
        return this.f60868a.j();
    }

    @Override // d0.Y
    public final boolean i(int i11, int i12) {
        return this.f60868a.i(i12, i11);
    }

    @Override // d0.Y
    public final int j() {
        return this.f60868a.h();
    }
}
