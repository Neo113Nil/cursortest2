package defpackage;

import com.google.android.gms.internal.play_billing.zzhr;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vho implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ vho(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        fjo fjoVar = (fjo) this.a.getValue();
        if (fjoVar == null) {
            return null;
        }
        return fjoVar.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzhr)) {
            a70.p("Lazy field only supports MessageLite values.");
            return null;
        }
        Map.Entry entry = this.a;
        zzhr zzhrVar = ((fjo) entry.getValue()).d;
        entry.setValue(new fjo((zzhr) obj));
        return zzhrVar;
    }
}
