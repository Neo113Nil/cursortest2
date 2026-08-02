package ug;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import sg.s0;
import tg.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class m extends a {

    /* renamed from: f, reason: collision with root package name */
    public final y f24278f;

    /* renamed from: g, reason: collision with root package name */
    public final qg.g f24279g;

    /* renamed from: h, reason: collision with root package name */
    public int f24280h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24281i;

    public /* synthetic */ m(tg.c cVar, y yVar, String str, int i5) {
        this(cVar, yVar, (i5 & 4) != 0 ? null : str, (qg.g) null);
    }

    @Override // ug.a
    public tg.m F(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (tg.m) n0.d(T(), tag);
    }

    @Override // ug.a
    public String R(qg.g descriptor, int i5) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        tg.c cVar = this.f24262c;
        j.p(descriptor, cVar);
        String g10 = descriptor.g(i5);
        if (this.f24264e.f1007d && !T().f23963a.keySet().contains(g10)) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            r7.a aVar = cVar.f23939c;
            a2.l defaultValue = new a2.l(14, descriptor, cVar);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            k key = j.f24275a;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object value = aVar.g(descriptor, key);
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.f22318b;
                Object obj2 = concurrentHashMap.get(descriptor);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, obj2);
                }
                ((Map) obj2).put(key, value);
            }
            Map map = (Map) value;
            Iterator it = T().f23963a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i5) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return g10;
    }

    @Override // ug.a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public y T() {
        return this.f24278f;
    }

    @Override // ug.a, rg.a
    public void g(qg.g descriptor) {
        Set set;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        tg.c cVar = this.f24262c;
        if (j.m(descriptor, cVar) || (descriptor.e() instanceof qg.d)) {
            return;
        }
        j.p(descriptor, cVar);
        if (this.f24264e.f1007d) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set b10 = s0.b(descriptor);
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            Map map = (Map) cVar.f23939c.g(descriptor, j.f24275a);
            Set elements = map != null ? map.keySet() : null;
            if (elements == null) {
                elements = g0.f19206a;
            }
            Intrinsics.checkNotNullParameter(b10, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(elements, "<this>");
            Integer valueOf = elements != null ? Integer.valueOf(elements.size()) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet(m0.a(valueOf != null ? b10.size() + valueOf.intValue() : b10.size() * 2));
            linkedHashSet.addAll(b10);
            z.n(elements, linkedHashSet);
            set = linkedHashSet;
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            set = s0.b(descriptor);
        }
        for (String str : T().f23963a.keySet()) {
            if (!set.contains(str) && !Intrinsics.areEqual(str, this.f24263d)) {
                StringBuilder p10 = d9.e.p("Encountered an unknown key '", str, "' at element: ");
                p10.append(V());
                p10.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                p10.append((Object) j.o(-1, T().toString()));
                throw j.d(-1, p10.toString());
            }
        }
    }

    @Override // ug.a, rg.b
    public final rg.a w(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        qg.g gVar = this.f24279g;
        if (descriptor != gVar) {
            return super.w(descriptor);
        }
        tg.m G = G();
        String a7 = gVar.a();
        if (G instanceof y) {
            return new m(this.f24262c, (y) G, this.f24263d, gVar);
        }
        throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(y.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(G.getClass()).getSimpleName() + " as the serialized body of " + a7 + " at element: " + V(), G.toString());
    }

    @Override // ug.a, rg.b
    public final boolean x() {
        return !this.f24281i && super.x();
    }

    @Override // rg.a
    public int z(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f24280h < descriptor.f()) {
            int i5 = this.f24280h;
            this.f24280h = i5 + 1;
            String S = S(descriptor, i5);
            int i10 = this.f24280h - 1;
            this.f24281i = false;
            if (!T().containsKey(S)) {
                boolean z5 = (this.f24262c.f23937a.f1006c || descriptor.j(i10) || !descriptor.i(i10).c()) ? false : true;
                this.f24281i = z5;
                if (z5) {
                }
            }
            this.f24264e.getClass();
            return i10;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tg.c json, y value, String str, qg.g gVar) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24278f = value;
        this.f24279g = gVar;
    }
}
