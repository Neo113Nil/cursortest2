package md;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import gf.t;
import id.r;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import la.j1;
import rc.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final t f20536a = gf.k.b(new id.a(13));

    /* renamed from: b, reason: collision with root package name */
    public final t f20537b = gf.k.b(new id.a(14));

    public static j1 a() {
        return (j1) y3.m(j1.class, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (eg.c0.A(lg.d.f20063c, new qb.b(r10, r11, r8, 0), r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        if (la.j1.f(r11, -1, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ka.c cVar, int i5, String str, mf.c cVar2) {
        c cVar3;
        int i10;
        int i11;
        String str2;
        if (cVar2 instanceof c) {
            cVar3 = (c) cVar2;
            int i12 = cVar3.f20535e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar3.f20535e = i12 - Integer.MIN_VALUE;
                Object obj = cVar3.f20533c;
                Object obj2 = lf.a.f20034a;
                i10 = cVar3.f20535e;
                Continuation continuation = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    int i13 = cVar.f18962a;
                    ka.a aVar = cVar.f18963b;
                    if (i13 == 200 && aVar != null) {
                        j1 a7 = a();
                        cVar3.f20531a = str;
                        cVar3.f20532b = i5;
                        cVar3.f20535e = 1;
                        a7.getClass();
                        fb.b bVar = new fb.b();
                        lg.e eVar = m0.f9201a;
                        Object A = c0.A(lg.d.f20063c, new oe.j(bVar, i5, aVar, (Continuation) null), cVar3);
                        if (A != obj2) {
                            A = Unit.f19194a;
                        }
                        if (A != obj2) {
                            A = Unit.f19194a;
                        }
                    } else if (i13 == 413) {
                        j1 a10 = a();
                        cVar3.f20531a = null;
                        cVar3.f20532b = i5;
                        cVar3.f20535e = 4;
                        a10.getClass();
                        fb.b bVar2 = new fb.b();
                        lg.e eVar2 = m0.f9201a;
                    } else {
                        j1 a11 = a();
                        cVar3.f20531a = null;
                        cVar3.f20532b = i5;
                        cVar3.f20535e = 5;
                        a11.getClass();
                    }
                }
                if (i10 == 1) {
                    i5 = cVar3.f20532b;
                    str = cVar3.f20531a;
                    h8.b.B(obj);
                    j1 a12 = a();
                    cVar3.f20531a = str;
                    cVar3.f20532b = i5;
                    cVar3.f20535e = 2;
                    a12.getClass();
                    if (j1.f(i5, 2, cVar3) != obj2) {
                        i11 = i5;
                        str2 = str;
                        List c2 = kotlin.collections.t.c(str2);
                        cVar3.f20531a = null;
                        cVar3.f20532b = i11;
                        cVar3.f20535e = 3;
                        lg.e eVar3 = m0.f9201a;
                        Object A2 = c0.A(lg.d.f20063c, new r(c2, continuation, 7), cVar3);
                        if (A2 != obj2) {
                        }
                    }
                }
                if (i10 != 2) {
                    if (i10 == 3) {
                        h8.b.B(obj);
                        return obj;
                    }
                    if (i10 == 4) {
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                i11 = cVar3.f20532b;
                str2 = cVar3.f20531a;
                h8.b.B(obj);
                List c22 = kotlin.collections.t.c(str2);
                cVar3.f20531a = null;
                cVar3.f20532b = i11;
                cVar3.f20535e = 3;
                lg.e eVar32 = m0.f9201a;
                Object A22 = c0.A(lg.d.f20063c, new r(c22, continuation, 7), cVar3);
                return A22 != obj2 ? obj2 : A22;
            }
        }
        cVar3 = new c(this, cVar2);
        Object obj3 = cVar3.f20533c;
        Object obj22 = lf.a.f20034a;
        i10 = cVar3.f20535e;
        Continuation continuation2 = null;
        if (i10 != 0) {
        }
    }

    public final void c(String str) {
        z.a((z) this.f20537b.getValue(), str);
    }
}
