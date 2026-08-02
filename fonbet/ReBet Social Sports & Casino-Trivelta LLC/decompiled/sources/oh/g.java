package oh;

import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public interface g {
    static g b(e eVar, Object obj) {
        return (eVar == null || eVar.getKey().isEmpty() || obj == null) ? empty() : new C5898b(new Object[]{eVar, obj});
    }

    static h builder() {
        return new d();
    }

    static g c(e eVar, Object obj, e eVar2, Object obj2) {
        return (eVar == null || eVar.getKey().isEmpty() || obj == null) ? b(eVar2, obj2) : (eVar2 == null || eVar2.getKey().isEmpty() || obj2 == null) ? b(eVar, obj) : eVar.getKey().equals(eVar2.getKey()) ? b(eVar2, obj2) : eVar.getKey().compareTo(eVar2.getKey()) > 0 ? new C5898b(new Object[]{eVar2, obj2, eVar, obj}) : new C5898b(new Object[]{eVar, obj, eVar2, obj2});
    }

    static g empty() {
        return C5898b.f61232c;
    }

    Object a(e eVar);

    Map asMap();

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();

    h toBuilder();
}
