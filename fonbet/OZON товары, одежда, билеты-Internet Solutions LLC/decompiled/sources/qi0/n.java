package qi0;

import Ae.C2399j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import xe.N;

/* loaded from: classes7.dex */
public final class n implements pi0.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ij0.d f82183a;

    public n(@NotNull ij0.d loadConfigurationValue) {
        Intrinsics.checkNotNullParameter(loadConfigurationValue, "loadConfigurationValue");
        this.f82183a = loadConfigurationValue;
    }

    public static final Object b(n nVar, fj0.d dVar, kotlin.coroutines.d dVar2) {
        return C2399j.w(nVar.f82183a.a(dVar), dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // pi0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9065e c9065e;
        int i11;
        M m11;
        M m12;
        M m13;
        M m14;
        M m15;
        M m16;
        M m17;
        M m18;
        M m19;
        M m21;
        if (cVar instanceof C9065e) {
            c9065e = (C9065e) cVar;
            int i12 = c9065e.f82150p;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9065e.f82150p = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9065e.f82148n;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9065e.f82150p;
                if (i11 != 0) {
                    s.b(obj);
                    M m22 = new M();
                    m11 = new M();
                    m12 = new M();
                    m13 = new M();
                    m14 = new M();
                    m15 = new M();
                    m16 = new M();
                    m17 = new M();
                    M m23 = new M();
                    M m24 = new M();
                    C9061a c9061a = new C9061a(new Function1[]{new C9066f(m22, this, null), new g(m11, this, null), new h(m12, this, null), new i(m13, this, null), new j(m14, this, null), new k(m13, this, null), new l(m15, this, null), new m(m16, this, null), new C9062b(m17, this, null), new C9063c(m23, this, null), new C9064d(m24, this, null)}, null);
                    c9065e.f82138d = m22;
                    c9065e.f82139e = m11;
                    c9065e.f82140f = m12;
                    c9065e.f82141g = m13;
                    c9065e.f82142h = m14;
                    c9065e.f82143i = m15;
                    c9065e.f82144j = m16;
                    c9065e.f82145k = m17;
                    c9065e.f82146l = m23;
                    c9065e.f82147m = m24;
                    c9065e.f82150p = 1;
                    if (N.d(c9061a, c9065e) == aVar) {
                        return aVar;
                    }
                    m18 = m22;
                    m19 = m23;
                    m21 = m24;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m21 = c9065e.f82147m;
                    m19 = c9065e.f82146l;
                    m17 = c9065e.f82145k;
                    m16 = c9065e.f82144j;
                    m15 = c9065e.f82143i;
                    m14 = c9065e.f82142h;
                    m13 = c9065e.f82141g;
                    m12 = c9065e.f82140f;
                    m11 = c9065e.f82139e;
                    m18 = c9065e.f82138d;
                    s.b(obj);
                }
                return new pi0.f((Integer) m18.f71787a, (kotlin.time.b) m11.f71787a, (Boolean) m12.f71787a, (Boolean) m13.f71787a, (Boolean) m14.f71787a, (Boolean) m15.f71787a, (Boolean) m16.f71787a, (Boolean) m17.f71787a, (Boolean) m19.f71787a, (Long) m21.f71787a);
            }
        }
        c9065e = new C9065e(this, cVar);
        Object obj2 = c9065e.f82148n;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9065e.f82150p;
        if (i11 != 0) {
        }
        return new pi0.f((Integer) m18.f71787a, (kotlin.time.b) m11.f71787a, (Boolean) m12.f71787a, (Boolean) m13.f71787a, (Boolean) m14.f71787a, (Boolean) m15.f71787a, (Boolean) m16.f71787a, (Boolean) m17.f71787a, (Boolean) m19.f71787a, (Long) m21.f71787a);
    }
}
