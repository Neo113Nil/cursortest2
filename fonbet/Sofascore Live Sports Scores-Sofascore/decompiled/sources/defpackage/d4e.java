package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d4e extends e4e {
    public final List a;

    public d4e(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:10:0x0078). Please report as a decompilation issue!!! */
    @Override // defpackage.e4e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, rq3 rq3Var) {
        b4e b4eVar;
        int i;
        Iterator it;
        Function2 function22;
        Collection collection;
        if (rq3Var instanceof b4e) {
            b4eVar = (b4e) rq3Var;
            int i2 = b4eVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b4eVar.x = i2 - Integer.MIN_VALUE;
                Object obj = b4eVar.v;
                lu3 lu3Var = lu3.a;
                i = b4eVar.x;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList = new ArrayList();
                    it = this.a.iterator();
                    function22 = function2;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = b4eVar.u;
                    it = b4eVar.t;
                    collection = b4eVar.s;
                    Function2 function23 = b4eVar.r;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(obj2);
                    }
                    function22 = function23;
                    if (it.hasNext()) {
                        Object next = it.next();
                        b4eVar.r = function22;
                        b4eVar.s = collection;
                        b4eVar.t = it;
                        b4eVar.u = next;
                        b4eVar.x = 1;
                        Object invoke = function22.invoke(next, b4eVar);
                        if (invoke == lu3Var) {
                            return lu3Var;
                        }
                        function23 = function22;
                        obj2 = next;
                        obj = invoke;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        function22 = function23;
                        if (it.hasNext()) {
                            return new d4e((List) collection);
                        }
                    }
                }
            }
        }
        b4eVar = new b4e(this, (sq3) rq3Var);
        Object obj3 = b4eVar.v;
        lu3 lu3Var2 = lu3.a;
        i = b4eVar.x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007c -> B:10:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.e4e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function2 function2, rq3 rq3Var) {
        c4e c4eVar;
        int i;
        Iterator it;
        Collection collection;
        Function2 function22;
        if (rq3Var instanceof c4e) {
            c4eVar = (c4e) rq3Var;
            int i2 = c4eVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4eVar.x = i2 - Integer.MIN_VALUE;
                Object obj = c4eVar.v;
                lu3 lu3Var = lu3.a;
                i = c4eVar.x;
                if (i != 0) {
                    y6a.M(obj);
                    List list = this.a;
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    it = list.iterator();
                    collection = arrayList;
                    function22 = function2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = c4eVar.u;
                    it = c4eVar.t;
                    Collection collection2 = c4eVar.s;
                    Function2 function23 = c4eVar.r;
                    y6a.M(obj);
                    collection.add(obj);
                    collection = collection2;
                    function22 = function23;
                    if (it.hasNext()) {
                        Object next = it.next();
                        c4eVar.r = function22;
                        Collection collection3 = collection;
                        c4eVar.s = collection3;
                        c4eVar.t = it;
                        c4eVar.u = collection3;
                        c4eVar.x = 1;
                        Object invoke = function22.invoke(next, c4eVar);
                        if (invoke == lu3Var) {
                            return lu3Var;
                        }
                        function23 = function22;
                        obj = invoke;
                        collection2 = collection;
                        collection.add(obj);
                        collection = collection2;
                        function22 = function23;
                        if (it.hasNext()) {
                            return new d4e((List) collection);
                        }
                    }
                }
            }
        }
        c4eVar = new c4e(this, (sq3) rq3Var);
        Object obj2 = c4eVar.v;
        lu3 lu3Var2 = lu3.a;
        i = c4eVar.x;
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4e) && Intrinsics.c(this.a, ((d4e) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + wv8.a(0, this.a.hashCode() * 29791, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
        List list = this.a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.j0(list));
        sb.append("\n                    |   sourceLoadStates: null,\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    ");
        return dii.d(sb.toString().concat("|)"));
    }
}
