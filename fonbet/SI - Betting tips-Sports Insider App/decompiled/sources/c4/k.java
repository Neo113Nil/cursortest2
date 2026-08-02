package c4;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements g5.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3593a;

    public /* synthetic */ k(Object obj) {
        this.f3593a = obj;
    }

    public static k a(int i5, int i10, int i11, int i12, boolean z5, boolean z7) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, i10, i11, i12, z5, z7));
    }

    public static k b(int i5, int i10, int i11, boolean z5) {
        return new k(AccessibilityNodeInfo.CollectionInfo.obtain(i5, i10, z5, i11));
    }

    public Object c() {
        if (k7.a.f18843b == null) {
            k7.a.f18843b = new b6.o();
        }
        synchronized (k7.a.f18842a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // ff.a
    public Object get() {
        return this.f3593a;
    }
}
