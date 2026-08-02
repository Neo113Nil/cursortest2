package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
final class K0 extends AbstractC7520h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Mm0.e, H2> f70597a = Collections.synchronizedMap(new HashMap());

    K0() {
    }

    @Override // k5.AbstractC7520h0
    protected final <T extends Serializable> H2<T> b(@NonNull Mm0.e eVar) {
        return this.f70597a.get(eVar);
    }

    @Override // k5.AbstractC7520h0
    protected final <T extends Serializable> void d(@NonNull Mm0.e eVar, H2<T> h22) {
        Map<Mm0.e, H2> map = this.f70597a;
        if (h22 == null) {
            map.remove(eVar);
        } else {
            map.put(eVar, h22);
        }
    }
}
