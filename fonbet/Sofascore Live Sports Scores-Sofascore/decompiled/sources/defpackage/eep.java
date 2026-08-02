package defpackage;

import com.google.android.gms.internal.cast.zzys;
import com.google.android.gms.internal.cast.zzzi;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eep implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ eep(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzys) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzzi)) {
            a70.p("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzys zzysVar = (zzys) this.a.getValue();
        zzzi zzziVar = zzysVar.a;
        zzysVar.b = null;
        zzysVar.a = (zzzi) obj;
        return zzziVar;
    }
}
