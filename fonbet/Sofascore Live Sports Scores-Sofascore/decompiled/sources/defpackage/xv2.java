package defpackage;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xv2 implements d6h, y8e {
    public final yv2 a = new yv2();
    public final dt8 b;

    public xv2(Function1 function1) {
        this.b = function1;
    }

    @Override // defpackage.y8e
    public Object d(KClass kClass, ArrayList arrayList) {
        Object u2gVar;
        Object obj = this.a.get(sha.x(kClass));
        obj.getClass();
        d1d d1dVar = (d1d) obj;
        Object obj2 = d1dVar.a.get();
        if (obj2 == null) {
            synchronized (d1dVar) {
                obj2 = d1dVar.a.get();
                if (obj2 == null) {
                    obj2 = new x8e();
                    d1dVar.a = new SoftReference(obj2);
                }
            }
        }
        x8e x8eVar = (x8e) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new lia((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = x8eVar.a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = (KSerializer) ((Function2) this.b).invoke(kClass, arrayList);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            w2g w2gVar = new w2g(u2gVar);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, w2gVar);
            obj3 = putIfAbsent == null ? w2gVar : putIfAbsent;
        }
        return ((w2g) obj3).a;
    }

    @Override // defpackage.d6h
    public KSerializer j(KClass kClass) {
        Object obj = this.a.get(sha.x(kClass));
        obj.getClass();
        d1d d1dVar = (d1d) obj;
        Object obj2 = d1dVar.a.get();
        if (obj2 == null) {
            synchronized (d1dVar) {
                obj2 = d1dVar.a.get();
                if (obj2 == null) {
                    obj2 = new ue2((KSerializer) ((Function1) this.b).invoke(kClass));
                    d1dVar.a = new SoftReference(obj2);
                }
            }
        }
        return ((ue2) obj2).a;
    }

    public xv2(Function2 function2) {
        this.b = function2;
    }
}
