package k7;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends v implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final u f18923b = new u(0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f18924c = new u(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18925a;

    public /* synthetic */ u(int i5) {
        this.f18925a = i5;
    }

    @Override // k7.v
    public final v a() {
        switch (this.f18925a) {
            case 0:
                return f18924c;
            default:
                return f18923b;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f18925a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f18925a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
