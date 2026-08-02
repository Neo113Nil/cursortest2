package defpackage;

import com.google.android.gms.internal.wearable.zzel;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d0o implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ d0o(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        n0o n0oVar = (n0o) this.a.getValue();
        if (n0oVar == null) {
            return null;
        }
        return n0oVar.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzel)) {
            a70.p("Lazy field only supports MessageLite values.");
            return null;
        }
        Map.Entry entry = this.a;
        zzel zzelVar = ((n0o) entry.getValue()).d;
        entry.setValue(new n0o((zzel) obj));
        return zzelVar;
    }
}
