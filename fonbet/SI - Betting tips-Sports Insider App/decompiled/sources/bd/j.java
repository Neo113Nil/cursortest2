package bd;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a0;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import la.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f3167a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3168b;

    public static final jd.a a(j jVar) {
        if (jVar.f3168b == null) {
            jVar.f3168b = new WeakReference(new jd.a());
        }
        WeakReference weakReference = jVar.f3168b;
        if ((weakReference != null ? (jd.a) weakReference.get() : null) == null) {
            jVar.f3168b = new WeakReference(new jd.a());
        }
        WeakReference weakReference2 = jVar.f3168b;
        if (weakReference2 != null) {
            return (jd.a) weakReference2.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, hc.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, List list, mf.c cVar) {
        c cVar2;
        int i5;
        Ref.ObjectRef objectRef;
        ArrayList arrayList;
        ga.a aVar;
        hc.c cVar3;
        Iterator it;
        ListIterator listIterator;
        jVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f3144f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f3144f = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f3142d;
                lf.a aVar2 = lf.a.f20034a;
                i5 = cVar2.f3144f;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (list == null || list.isEmpty()) {
                        return e0.f19204a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    objectRef = new Ref.ObjectRef();
                    cVar2.f3139a = list;
                    cVar2.f3140b = arrayList2;
                    cVar2.f3141c = objectRef;
                    cVar2.f3144f = 1;
                    lg.e eVar = m0.f9201a;
                    Object A = c0.A(lg.d.f20063c, new b(2, continuation, 0), cVar2);
                    if (A == aVar2) {
                        return aVar2;
                    }
                    arrayList = arrayList2;
                    obj = A;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.ObjectRef objectRef2 = cVar2.f3141c;
                    arrayList = cVar2.f3140b;
                    List list2 = cVar2.f3139a;
                    h8.b.B(obj);
                    objectRef = objectRef2;
                    list = list2;
                }
                aVar = (ga.a) obj;
                if (aVar == null) {
                    int i11 = aVar.f9909a;
                    String link = aVar.f9910b;
                    Intrinsics.checkNotNullParameter(link, "link");
                    cVar3 = new hc.c();
                    cVar3.f10489a = i11;
                    cVar3.f10490b = link;
                } else {
                    cVar3 = null;
                }
                it = a0.v(CollectionsKt.D(list)).iterator();
                while (true) {
                    listIterator = ((s0) it).f19217a;
                    if (listIterator.hasPrevious()) {
                        Intrinsics.checkNotNullParameter(arrayList, "<this>");
                        return CollectionsKt.W(new r0(arrayList));
                    }
                    nc.b bVar = (nc.b) listIterator.previous();
                    String dateString = bVar.toDdMmmYy();
                    Intrinsics.checkNotNullParameter(dateString, "dateString");
                    ?? bVar2 = new hc.b();
                    bVar2.f10488a = dateString;
                    hc.b bVar3 = (hc.b) objectRef.element;
                    if (!Intrinsics.areEqual(dateString, bVar3 != null ? bVar3.f10488a : null)) {
                        objectRef.element = bVar2;
                        arrayList.add(bVar2);
                    }
                    arrayList.add(bVar);
                    if (cVar3 != null) {
                        arrayList.add(cVar3);
                    }
                }
            }
        }
        cVar2 = new c(jVar, cVar);
        Object obj2 = cVar2.f3142d;
        lf.a aVar22 = lf.a.f20034a;
        i5 = cVar2.f3144f;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        aVar = (ga.a) obj2;
        if (aVar == null) {
        }
        it = a0.v(CollectionsKt.D(list)).iterator();
        while (true) {
            listIterator = ((s0) it).f19217a;
            if (listIterator.hasPrevious()) {
            }
        }
    }

    public static p c() {
        return (p) y3.m(p.class, a.a.v("LiveDB"), 4);
    }

    public final dd.a d() {
        if (this.f3167a == null) {
            this.f3167a = new WeakReference(new dd.a());
        }
        WeakReference weakReference = this.f3167a;
        if ((weakReference != null ? (dd.a) weakReference.get() : null) == null) {
            this.f3167a = new WeakReference(new dd.a());
        }
        WeakReference weakReference2 = this.f3167a;
        if (weakReference2 != null) {
            return (dd.a) weakReference2.get();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mf.c cVar) {
        h hVar;
        int i5;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f3161c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f3161c = i10 - Integer.MIN_VALUE;
                Object obj = hVar.f3159a;
                lf.a aVar = lf.a.f20034a;
                i5 = hVar.f3161c;
                int i11 = 1;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    ad.a aVar2 = new ad.a(this, continuation, i11);
                    hVar.f3161c = 1;
                    obj = c0.A(dVar, aVar2, hVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar2 = m0.f9201a;
                androidx.lifecycle.c cVar2 = new androidx.lifecycle.c(this, (List) obj, continuation, 4);
                hVar.f3161c = 2;
                Object A = c0.A(eVar2, cVar2, hVar);
                return A != aVar ? aVar : A;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f3159a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = hVar.f3161c;
        int i112 = 1;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        lg.e eVar22 = m0.f9201a;
        androidx.lifecycle.c cVar22 = new androidx.lifecycle.c(this, (List) obj2, continuation2, 4);
        hVar.f3161c = 2;
        Object A2 = c0.A(eVar22, cVar22, hVar);
        if (A2 != aVar3) {
        }
    }
}
