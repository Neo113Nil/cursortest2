package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q79 extends w2 {
    public final KSerializer a;
    public final KSerializer b;
    public final /* synthetic */ int c;
    public final p79 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q79(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.c = i;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.d = new p79("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.d = new p79("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // defpackage.w2
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.w2
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.w2
    public final Iterator c(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object w = uf3Var.w(getDescriptor(), i, this.a, null);
        int o = uf3Var.o(getDescriptor());
        if (o != i + 1) {
            ogj.h(dmi.k(i, o, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean containsKey = map.containsKey(w);
        KSerializer kSerializer = this.b;
        map.put(w, (!containsKey || (kSerializer.getDescriptor().getKind() instanceof d7f)) ? uf3Var.w(getDescriptor(), o, kSerializer, null) : uf3Var.w(getDescriptor(), o, kSerializer, rub.a(w, map)));
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        int i = this.c;
        return this.d;
    }

    @Override // defpackage.w2
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        wf3 C = encoder.C(descriptor);
        Iterator c = c(obj);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            C.f(getDescriptor(), i, this.a, key);
            i += 2;
            C.f(getDescriptor(), i2, this.b, value);
        }
        C.c(descriptor);
    }

    public q79(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }
}
