package k7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f18886c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f18887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f18888e;

    public l(m mVar, int i5, int i10) {
        this.f18888e = mVar;
        this.f18886c = i5;
        this.f18887d = i10;
    }

    @Override // k7.h
    public final int b() {
        return this.f18888e.c() + this.f18886c + this.f18887d;
    }

    @Override // k7.h
    public final int c() {
        return this.f18888e.c() + this.f18886c;
    }

    @Override // k7.h
    public final Object[] e() {
        return this.f18888e.e();
    }

    @Override // k7.m, java.util.List
    /* renamed from: g */
    public final m subList(int i5, int i10) {
        a.n(i5, i10, this.f18887d);
        int i11 = this.f18886c;
        return this.f18888e.subList(i5 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        a.f(i5, this.f18887d);
        return this.f18888e.get(i5 + this.f18886c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18887d;
    }
}
