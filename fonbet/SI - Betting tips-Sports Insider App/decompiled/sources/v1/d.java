package v1;

import androidx.lifecycle.c1;
import androidx.lifecycle.k1;
import s.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d extends k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f24385d = new c1(2);

    /* renamed from: b, reason: collision with root package name */
    public final o f24386b = new o(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24387c = false;

    @Override // androidx.lifecycle.k1
    public final void d() {
        o oVar = this.f24386b;
        int g10 = oVar.g();
        for (int i5 = 0; i5 < g10; i5++) {
            b bVar = (b) oVar.h(i5);
            x5.c cVar = bVar.f24380l;
            cVar.a();
            cVar.f25397c = true;
            c cVar2 = bVar.f24382n;
            if (cVar2 != null) {
                bVar.i(cVar2);
            }
            b bVar2 = cVar.f25395a;
            if (bVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            cVar.f25395a = null;
            if (cVar2 != null) {
                boolean z5 = cVar2.f24384b;
            }
            cVar.f25398d = true;
            cVar.f25396b = false;
            cVar.f25397c = false;
            cVar.f25399e = false;
        }
        int i10 = oVar.f22579d;
        Object[] objArr = oVar.f22578c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        oVar.f22579d = 0;
        oVar.f22576a = false;
    }
}
