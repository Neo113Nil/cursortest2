package gi;

import Zh.InterfaceC1901b;
import di.D0;
import gi.AbstractC4394a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Map f47469a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f47470b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f47471c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f47472d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Map f47473e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f47474f;

    public static /* synthetic */ void l(f fVar, KClass kClass, KClass kClass2, InterfaceC1901b interfaceC1901b, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.k(kClass, kClass2, interfaceC1901b, z10);
    }

    public static /* synthetic */ void n(f fVar, KClass kClass, AbstractC4394a abstractC4394a, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.m(kClass, abstractC4394a, z10);
    }

    @Override // gi.i
    public void c(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        i(baseClass, defaultDeserializerProvider, false);
    }

    @Override // gi.i
    public void d(KClass baseClass, KClass actualClass, InterfaceC1901b actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        l(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // gi.i
    public void e(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        j(baseClass, defaultSerializerProvider, false);
    }

    @Override // gi.i
    public void f(KClass kClass, InterfaceC1901b serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        n(this, kClass, new AbstractC4394a.C0708a(serializer), false, 4, null);
    }

    @Override // gi.i
    public void g(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        n(this, kClass, new AbstractC4394a.b(provider), false, 4, null);
    }

    public final e h() {
        return new c(this.f47469a, this.f47470b, this.f47471c, this.f47472d, this.f47473e, this.f47474f);
    }

    public final void i(KClass baseClass, Function1 defaultDeserializerProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1 function1 = (Function1) this.f47473e.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultDeserializerProvider) || z10) {
            this.f47473e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    public final void j(KClass baseClass, Function1 defaultSerializerProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1 function1 = (Function1) this.f47471c.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultSerializerProvider) || z10) {
            this.f47471c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    public final void k(KClass baseClass, KClass concreteClass, InterfaceC1901b concreteSerializer, boolean z10) {
        Object obj;
        KClass kClass;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String h10 = concreteSerializer.getDescriptor().h();
        Map map = this.f47470b;
        Object obj2 = map.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(baseClass, obj2);
        }
        Map map2 = (Map) obj2;
        Map map3 = this.f47472d;
        Object obj3 = map3.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(baseClass, obj3);
        }
        Map map4 = (Map) obj3;
        InterfaceC1901b interfaceC1901b = (InterfaceC1901b) map2.get(concreteClass);
        if (interfaceC1901b != null && !Intrinsics.areEqual(interfaceC1901b, concreteSerializer)) {
            if (!z10) {
                throw new d(baseClass, concreteClass);
            }
        }
        InterfaceC1901b interfaceC1901b2 = (InterfaceC1901b) map4.get(h10);
        if (interfaceC1901b2 != null && !Intrinsics.areEqual(interfaceC1901b2, concreteSerializer)) {
            Iterator it = MapsKt.asSequence(map2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == interfaceC1901b2) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (kClass = (KClass) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + h10 + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z10) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + h10 + "': " + concreteSerializer + " for '" + concreteClass + "' and " + interfaceC1901b2 + " for '" + kClass + '\'');
            }
        }
        map2.put(concreteClass, concreteSerializer);
        map4.put(h10, concreteSerializer);
    }

    public final void m(KClass forClass, AbstractC4394a provider, boolean z10) {
        AbstractC4394a abstractC4394a;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (z10 || (abstractC4394a = (AbstractC4394a) this.f47469a.get(forClass)) == null || Intrinsics.areEqual(abstractC4394a, provider)) {
            this.f47469a.put(forClass, provider);
            if (D0.l(forClass)) {
                this.f47474f = true;
                return;
            }
            return;
        }
        throw new d("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
