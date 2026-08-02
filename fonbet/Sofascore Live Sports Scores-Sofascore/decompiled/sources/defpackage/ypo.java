package defpackage;

import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzigw;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ypo implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ ypo(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zpo zpoVar = (zpo) this.a.getValue();
        if (zpoVar == null) {
            return null;
        }
        try {
            return zpoVar.c;
        } catch (zzige unused) {
            zziew zziewVar = zziew.b;
            return zpoVar.a;
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzigw)) {
            a70.p("Lazy field only supports MessageLite values.");
            return null;
        }
        Map.Entry entry = this.a;
        zzigw zzigwVar = ((zpo) entry.getValue()).c;
        entry.setValue(new zpo((zzigw) obj));
        return zzigwVar;
    }
}
