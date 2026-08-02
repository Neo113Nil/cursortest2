package id;

import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.i f11218a;

    public v(androidx.coordinatorlayout.widget.i iVar) {
        this.f11218a = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f11218a.compare(obj, obj2);
        return compare != 0 ? compare : jf.a.a(Integer.valueOf(((ja.c) obj2).f18391d), Integer.valueOf(((ja.c) obj).f18391d));
    }
}
