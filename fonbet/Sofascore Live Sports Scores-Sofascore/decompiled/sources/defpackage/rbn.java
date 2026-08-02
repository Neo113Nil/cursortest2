package defpackage;

import com.google.android.gms.internal.measurement.zzael;
import com.google.android.gms.internal.measurement.zzafc;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rbn implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ rbn(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzael zzaelVar = (zzael) this.a.getValue();
        if (zzaelVar == null) {
            return null;
        }
        zzaelVar.c(null);
        return zzaelVar.a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzafc)) {
            a70.p("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzael zzaelVar = (zzael) this.a.getValue();
        zzafc zzafcVar = zzaelVar.a;
        zzaelVar.b = null;
        zzaelVar.a = (zzafc) obj;
        return zzafcVar;
    }
}
