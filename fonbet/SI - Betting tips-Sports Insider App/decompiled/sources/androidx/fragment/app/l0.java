package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements q2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1996b;

    public /* synthetic */ l0(int i5, Object obj) {
        this.f1995a = i5;
        this.f1996b = obj;
    }

    @Override // q2.c
    public final Bundle a() {
        k1 r5;
        int i5 = this.f1995a;
        Object obj = this.f1996b;
        switch (i5) {
            case 0:
                p0 p0Var = (p0) obj;
                do {
                    r5 = p0Var.r();
                    androidx.lifecycle.x xVar = androidx.lifecycle.x.f2253a;
                } while (p0.s(r5));
                p0Var.f2035v.e(androidx.lifecycle.w.ON_STOP);
                return new Bundle();
            default:
                return ((j1) obj).Y();
        }
    }
}
