package defpackage;

import com.google.android.gms.internal.consent_sdk.zzqz;
import com.google.android.gms.internal.consent_sdk.zzrq;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l3p implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ l3p(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzqz) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzrq)) {
            a70.p("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzqz zzqzVar = (zzqz) this.a.getValue();
        zzrq zzrqVar = zzqzVar.a;
        zzqzVar.b = null;
        zzqzVar.a = (zzrq) obj;
        return zzrqVar;
    }
}
