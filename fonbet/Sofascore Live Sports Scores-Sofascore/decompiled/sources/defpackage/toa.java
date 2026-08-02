package defpackage;

import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class toa implements Map.Entry {
    public Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.a.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.a.getValue()).setValue((MessageLite) obj);
        }
        a70.p("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
