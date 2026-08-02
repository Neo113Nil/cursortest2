package androidx.recyclerview.widget;

import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2543a;

    public /* synthetic */ s(int i5) {
        this.f2543a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r0 != false) goto L18;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.f2543a) {
            case 0:
                return ((t) obj).f2554a - ((t) obj2).f2554a;
            default:
                e0 e0Var = (e0) obj;
                e0 e0Var2 = (e0) obj2;
                RecyclerView recyclerView = e0Var.f2373d;
                if ((recyclerView == null) == (e0Var2.f2373d == null)) {
                    boolean z5 = e0Var.f2370a;
                    if (z5 == e0Var2.f2370a) {
                        int i5 = e0Var2.f2371b - e0Var.f2371b;
                        if (i5 != 0) {
                            return i5;
                        }
                        int i10 = e0Var.f2372c - e0Var2.f2372c;
                        if (i10 != 0) {
                            return i10;
                        }
                        return 0;
                    }
                }
                break;
        }
    }
}
