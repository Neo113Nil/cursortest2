package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class aha extends o4 {
    public final c f;
    public final SerialDescriptor g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aha(yea yeaVar, c cVar, String str, SerialDescriptor serialDescriptor) {
        super(yeaVar, str);
        yeaVar.getClass();
        this.f = cVar;
        this.g = serialDescriptor;
    }

    @Override // defpackage.o4, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        return !this.i && super.C();
    }

    @Override // defpackage.o4
    public b F(String str) {
        str.getClass();
        return (b) tub.e(str, T());
    }

    @Override // defpackage.o4
    public String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        yea yeaVar = this.c;
        hz8.Q(yeaVar, serialDescriptor);
        String e = serialDescriptor.e(i);
        if (this.e.j && !T().a.keySet().contains(e)) {
            j0l j0lVar = yeaVar.c;
            f8h f8hVar = hz8.g;
            ij8 ij8Var = new ij8(20, serialDescriptor, yeaVar);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) j0lVar.b;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            Object obj2 = map != null ? map.get(f8hVar) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = ij8Var.invoke();
                Object obj3 = concurrentHashMap.get(serialDescriptor);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj3);
                }
                ((Map) obj3).put(f8hVar, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator it = T().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return e;
    }

    @Override // defpackage.o4
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public c T() {
        return this.f;
    }

    public final boolean Z(SerialDescriptor serialDescriptor, int i) {
        boolean z = (this.c.a.f || serialDescriptor.i(i) || !serialDescriptor.g(i).b()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // defpackage.o4, kotlinx.serialization.encoding.Decoder
    public final uf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.g;
        if (serialDescriptor != serialDescriptor2) {
            return super.b(serialDescriptor);
        }
        b G = G();
        String h = serialDescriptor2.h();
        boolean z = G instanceof c;
        yea yeaVar = this.c;
        if (z) {
            return new aha(yeaVar, (c) G, this.d, serialDescriptor2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        fuf fufVar = duf.a;
        sb.append(fufVar.getOrCreateKotlinClass(c.class).getSimpleName());
        sb.append(", but had ");
        sb.append(fufVar.getOrCreateKotlinClass(G.getClass()).getSimpleName());
        throw new ofa(yfa.m(-1, mz1.o(sb, " as the serialized body of ", h), V(), null, yeaVar.a.l ? yfa.u(G.toString(), -1).toString() : null));
    }

    @Override // defpackage.o4, defpackage.uf3
    public void c(SerialDescriptor serialDescriptor) {
        Set f;
        serialDescriptor.getClass();
        yea yeaVar = this.c;
        if (hz8.N(yeaVar, serialDescriptor) || (serialDescriptor.getKind() instanceof zze)) {
            return;
        }
        hz8.Q(yeaVar, serialDescriptor);
        if (this.e.j) {
            Set m = s9a.m(serialDescriptor);
            j0l j0lVar = yeaVar.c;
            f8h f8hVar = hz8.g;
            Map map = (Map) ((ConcurrentHashMap) j0lVar.b).get(serialDescriptor);
            Object obj = map != null ? map.get(f8hVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = rm5.a;
            }
            f = y9h.f(m, keySet);
        } else {
            f = s9a.m(serialDescriptor);
        }
        for (String str : T().a.keySet()) {
            if (!f.contains(str) && !Intrinsics.c(str, this.d)) {
                throw new ofa(yfa.m(-1, dmi.j('\'', "Encountered an unknown key '", str), V(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", yeaVar.a.l ? yfa.u(T().toString(), -1).toString() : null));
            }
        }
    }

    @Override // defpackage.uf3
    public int o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.h < serialDescriptor.d()) {
            int i = this.h;
            this.h = i + 1;
            String S = S(serialDescriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (T().containsKey(S) || Z(serialDescriptor, i2)) {
                if (this.e.h) {
                    boolean i3 = serialDescriptor.i(i2);
                    SerialDescriptor g = serialDescriptor.g(i2);
                    if (!i3 || g.b() || !(((b) T().get(S)) instanceof JsonNull)) {
                        if (Intrinsics.c(g.getKind(), p5h.f) && (!g.b() || !(((b) T().get(S)) instanceof JsonNull))) {
                            b bVar = (b) T().get(S);
                            String str = null;
                            d dVar = bVar instanceof d ? (d) bVar : null;
                            if (dVar != null) {
                                m3a m3aVar = qfa.a;
                                if (!(dVar instanceof JsonNull)) {
                                    str = dVar.c();
                                }
                            }
                            if (str != null) {
                                yea yeaVar = this.c;
                                int L = hz8.L(g, yeaVar, str);
                                boolean z = !yeaVar.a.f && g.b();
                                if (L == -3 && ((i3 || z) && !Z(serialDescriptor, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    public /* synthetic */ aha(yea yeaVar, c cVar, String str, int i) {
        this(yeaVar, cVar, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
