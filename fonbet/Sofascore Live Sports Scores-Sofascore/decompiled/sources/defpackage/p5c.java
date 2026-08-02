package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class p5c implements g6h {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public p5c(int i) {
        switch (i) {
            case 3:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                this.f = new HashMap();
                break;
            default:
                this.d = awf.g;
                this.a = true;
                av9 av9Var = hv9.b;
                this.e = vvf.e;
                break;
        }
    }

    public static void j(p5c p5cVar, KClass kClass, pq3 pq3Var) {
        HashMap hashMap = (HashMap) p5cVar.b;
        kClass.getClass();
        pq3 pq3Var2 = (pq3) hashMap.get(kClass);
        if (pq3Var2 != null && !pq3Var2.equals(pq3Var)) {
            throw new gk4("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
        }
        hashMap.put(kClass, pq3Var);
        if (sha.x(kClass).isInterface()) {
            p5cVar.a = true;
        }
    }

    @Override // defpackage.g6h
    public void a(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        Object obj;
        KClass kClass3;
        String h = kSerializer.getDescriptor().h();
        HashMap hashMap = (HashMap) this.c;
        Object obj2 = hashMap.get(kClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(kClass, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = (HashMap) this.e;
        Object obj3 = hashMap2.get(kClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(kClass, obj3);
        }
        Map map2 = (Map) obj3;
        KSerializer kSerializer2 = (KSerializer) map.get(kClass2);
        if (kSerializer2 != null && !kSerializer2.equals(kSerializer)) {
            throw new gk4("Serializer for " + kClass2 + " already registered in the scope of " + kClass);
        }
        KSerializer kSerializer3 = (KSerializer) map2.get(h);
        if (kSerializer3 == null || kSerializer3.equals(kSerializer)) {
            map.put(kClass2, kSerializer);
            map2.put(h, kSerializer);
            return;
        }
        Iterator it = ((Iterable) CollectionsKt.N(map.entrySet()).b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == kSerializer3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (kClass3 = (KClass) entry.getKey()) == null) {
            pvd.p(h, " is registered in the module but no Kotlin class is associated with it.", "Name ");
            return;
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + kClass + "' have the same serial name '" + h + "': " + kSerializer + " for '" + kClass2 + "' and " + kSerializer3 + " for '" + kClass3 + '\'');
    }

    @Override // defpackage.g6h
    public void b(KClass kClass, Function1 function1) {
        HashMap hashMap = (HashMap) this.f;
        Function1 function12 = (Function1) hashMap.get(kClass);
        if (function12 == null || function12.equals(function1)) {
            hashMap.put(kClass, function1);
        } else {
            yhk.m("Default deserializers provider for ", kClass, " is already registered: ", function12);
        }
    }

    @Override // defpackage.g6h
    public void c(KClass kClass, KSerializer kSerializer) {
        kClass.getClass();
        j(this, kClass, new nq3(kSerializer));
    }

    @Override // defpackage.g6h
    public void d(KClass kClass, Function1 function1) {
        HashMap hashMap = (HashMap) this.d;
        Function1 function12 = (Function1) hashMap.get(kClass);
        if (function12 == null || function12.equals(function1)) {
            hashMap.put(kClass, function1);
        } else {
            yhk.m("Default serializers provider for ", kClass, " is already registered: ", function12);
        }
    }

    public p5c e() {
        return new p5c((HashMap) this.b, (HashMap) this.c, (HashMap) this.d, (HashMap) this.e, (HashMap) this.f, this.a);
    }

    public void f(g6h g6hVar) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            pq3 pq3Var = (pq3) entry.getValue();
            if (pq3Var instanceof nq3) {
                kClass.getClass();
                g6hVar.c(kClass, ((nq3) pq3Var).a);
            } else {
                if (!(pq3Var instanceof oq3)) {
                    zzl.b();
                    return;
                }
                g6hVar.h(kClass, ((oq3) pq3Var).a);
            }
        }
        for (Map.Entry entry2 : ((Map) this.c).entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                kClass2.getClass();
                kClass3.getClass();
                kSerializer.getClass();
                g6hVar.a(kClass2, kClass3, kSerializer);
            }
        }
        for (Map.Entry entry4 : ((Map) this.d).entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            kClass4.getClass();
            function1.getClass();
            i5k.e(1, function1);
            g6hVar.d(kClass4, function1);
        }
        for (Map.Entry entry5 : ((Map) this.f).entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            kClass5.getClass();
            function12.getClass();
            i5k.e(1, function12);
            g6hVar.b(kClass5, function12);
        }
    }

    public KSerializer g(KClass kClass, List list) {
        kClass.getClass();
        list.getClass();
        pq3 pq3Var = (pq3) ((Map) this.b).get(kClass);
        KSerializer a = pq3Var != null ? pq3Var.a(list) : null;
        if (a instanceof KSerializer) {
            return a;
        }
        return null;
    }

    @Override // defpackage.g6h
    public void h(KClass kClass, Function1 function1) {
        kClass.getClass();
        j(this, kClass, new oq3(function1));
    }

    public KSerializer i(KClass kClass, Object obj) {
        kClass.getClass();
        obj.getClass();
        if (kClass.isInstance(obj)) {
            Map map = (Map) ((Map) this.c).get(kClass);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(duf.a.getOrCreateKotlinClass(obj.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = ((Map) this.d).get(kClass);
            Function1 function1 = i5k.f(1, obj2) ? (Function1) obj2 : null;
            if (function1 != null) {
                return (KSerializer) function1.invoke(obj);
            }
        }
        return null;
    }

    public p5c(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.a = z;
    }
}
