package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l3a {
    public final LinkedHashMap a;

    public l3a(fad fadVar) {
        Map map = fadVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt.U0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public static String c(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    public void a(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(kClass)) {
            ogj.h(lnb.o("A `initializer` with the same `clazz` has already been added: ", kClass.getQualifiedName(), "."));
        } else {
            linkedHashMap.put(kClass, new ntk(kClass, function1));
        }
    }

    public ne b() {
        Collection values = this.a.values();
        values.getClass();
        ntk[] ntkVarArr = (ntk[]) values.toArray(new ntk[0]);
        return new ne((ntk[]) Arrays.copyOf(ntkVarArr, ntkVarArr.length), 2);
    }

    public void d(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, b.l(str));
    }

    public l3a(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 4:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public l3a(u8e u8eVar) {
        this.a = tub.q(u8eVar.a);
    }
}
