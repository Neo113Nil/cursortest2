package defpackage;

import com.google.android.gms.internal.pal.zzadz;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hbn {
    public static final void a(Object obj, Object obj2) {
        zzadz zzadzVar = (zzadz) obj;
        if (zzadzVar.isEmpty()) {
            return;
        }
        Iterator it = zzadzVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final zzadz b(Object obj, Object obj2) {
        zzadz zzadzVar = (zzadz) obj;
        zzadz zzadzVar2 = (zzadz) obj2;
        if (!zzadzVar2.isEmpty()) {
            if (!zzadzVar.a) {
                zzadzVar = zzadzVar.g();
            }
            zzadzVar.i();
            if (!zzadzVar2.isEmpty()) {
                zzadzVar.putAll(zzadzVar2);
            }
        }
        return zzadzVar;
    }
}
