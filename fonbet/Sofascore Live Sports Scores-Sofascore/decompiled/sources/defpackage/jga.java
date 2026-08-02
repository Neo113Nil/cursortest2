package defpackage;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jga {
    public final LinkedHashMap a;

    public jga(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(njc njcVar) {
        njcVar.getClass();
        int i = njcVar.a;
        int i2 = njcVar.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Objects.toString(treeMap.get(Integer.valueOf(i2)));
            njcVar.toString();
        }
        treeMap.put(Integer.valueOf(i2), njcVar);
    }

    public b b(String str, b bVar) {
        bVar.getClass();
        return (b) this.a.put(str, bVar);
    }
}
