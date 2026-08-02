package s;

import kotlin.collections.i0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f22580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f22581b;

    public p(o oVar) {
        this.f22581b = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22580a < this.f22581b.g();
    }

    @Override // kotlin.collections.i0
    public final int nextInt() {
        int i5 = this.f22580a;
        this.f22580a = i5 + 1;
        return this.f22581b.e(i5);
    }
}
