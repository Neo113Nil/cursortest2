package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zvg extends e7 {
    public final KClass a;
    public final List b;
    public final joa c;
    public final Map d;
    public final LinkedHashMap e;

    public zvg(String str, KClass kClass, KClass[] kClassArr, KSerializer[] kSerializerArr) {
        kClass.getClass();
        this.a = kClass;
        this.b = km5.a;
        this.c = ypa.a(ysa.b, new zbe(28, str, this));
        if (kClassArr.length != kSerializerArr.length) {
            sw9.t(kClass.getSimpleName(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        Map o = tub.o(ph0.c0(kClassArr, kSerializerArr));
        this.d = o;
        Set<Map.Entry> entrySet = o.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String h = ((KSerializer) entry.getValue()).getDescriptor().h();
            Object obj = linkedHashMap.get(h);
            if (obj == null) {
                linkedHashMap.containsKey(h);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(h);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(h, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    @Override // defpackage.e7
    public final dy4 a(uf3 uf3Var, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.a(uf3Var, str);
    }

    @Override // defpackage.e7
    public final KSerializer b(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer kSerializer = (KSerializer) this.d.get(duf.a.getOrCreateKotlinClass(obj.getClass()));
        KSerializer b = kSerializer != null ? kSerializer : super.b(encoder, obj);
        if (b != null) {
            return b;
        }
        return null;
    }

    @Override // defpackage.e7
    public final KClass c() {
        return this.a;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zvg(String str, KClass kClass, KClass[] kClassArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, kClass, kClassArr, kSerializerArr);
        kClass.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
