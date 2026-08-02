package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.newNetwork.Highlight;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c5c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ List u;
    public final /* synthetic */ e5c v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5c(List list, e5c e5cVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = list;
        this.v = e5cVar;
        this.w = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                c5c c5cVar = new c5c(this.u, this.v, this.w, rq3Var, 0);
                c5cVar.t = obj;
                return c5cVar;
            default:
                c5c c5cVar2 = new c5c(this.u, this.v, this.w, rq3Var, 1);
                c5cVar2.t = obj;
                return c5cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((c5c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u;
        Object u2;
        int i = this.r;
        List list = this.u;
        e5c e5cVar = this.v;
        int i2 = this.w;
        Throwable th = null;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xw3.t(ku3Var, null, new b5c(e5cVar, ((Number) it.next()).intValue(), null, 0), 3));
                    }
                    this.t = null;
                    this.s = 1;
                    u = m6k.u(arrayList, this);
                    if (u == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) u) {
                    if (obj2 instanceof il6) {
                        arrayList2.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (hashSet.add(((il6) next).k)) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    il6 il6Var = (il6) it3.next();
                    int i4 = il6Var.g;
                    String str = il6Var.i;
                    String str2 = str == null ? "" : str;
                    String str3 = il6Var.l;
                    Throwable th2 = th;
                    Highlight highlight = new Highlight(i4, str2, "", il6Var.m, str3 == null ? "" : str3, il6Var.o ? 6 : 1, false, null, il6Var.j, "", Boolean.FALSE, null, a.o, null);
                    int i5 = il6Var.g;
                    arrayList4.add(new r5c(highlight, true, i5 == i2, 0, new Integer(i5), 40));
                    th = th2;
                }
                Throwable th3 = th;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (((r5c) next2).a.getId() == i2) {
                        arrayList5.add(next2);
                    } else {
                        arrayList6.add(next2);
                    }
                }
                ArrayList w0 = CollectionsKt.w0(arrayList6, arrayList5);
                ArrayList arrayList7 = new ArrayList(k13.r(w0, 10));
                Iterator it5 = w0.iterator();
                int i6 = 0;
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw th3;
                    }
                    arrayList7.add(r5c.a((r5c) next3, false, i6, 55));
                    i6 = i7;
                }
                e5cVar.d.k(arrayList7);
                return Unit.a;
            default:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    ArrayList arrayList8 = new ArrayList(k13.r(list, 10));
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(xw3.t(ku3Var2, null, new b5c(e5cVar, ((Number) it6.next()).intValue(), null, 1), 3));
                    }
                    this.t = null;
                    this.s = 1;
                    u2 = m6k.u(arrayList8, this);
                    if (u2 == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u2 = obj;
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : (Iterable) u2) {
                    if (obj3 instanceof cqk) {
                        arrayList9.add(obj3);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                Iterator it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    Object next4 = it7.next();
                    if (((cqk) next4).g == i2) {
                        arrayList10.add(next4);
                    } else {
                        arrayList11.add(next4);
                    }
                }
                ArrayList w02 = CollectionsKt.w0(arrayList11, arrayList10);
                ArrayList arrayList12 = new ArrayList(k13.r(w02, 10));
                Iterator it8 = w02.iterator();
                int i9 = 0;
                while (it8.hasNext()) {
                    Object next5 = it8.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        b.q();
                        throw null;
                    }
                    cqk cqkVar = (cqk) next5;
                    Highlight highlight2 = cqkVar.n;
                    int i11 = cqkVar.g;
                    arrayList12.add(new r5c(highlight2, false, i11 == i2, i9, new Integer(i11), 32));
                    i9 = i10;
                }
                e5cVar.d.k(arrayList12);
                return Unit.a;
        }
    }
}
