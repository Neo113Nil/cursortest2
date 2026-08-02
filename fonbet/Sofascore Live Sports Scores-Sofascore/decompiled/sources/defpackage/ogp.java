package defpackage;

import com.google.android.gms.internal.measurement.zzaaa;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzj;
import com.google.android.gms.internal.measurement.zzzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ogp extends zzaaa {
    public final Map b;

    public ogp(zzzj zzzjVar, zzzj zzzjVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, zzzjVar);
        d(linkedHashMap, zzzjVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzyl) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, zzzj zzzjVar) {
        for (int i = 0; i < zzzjVar.a(); i++) {
            zzyl b = zzzjVar.b(i);
            Object obj = linkedHashMap.get(b);
            boolean z = b.c;
            Class cls = b.b;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(b, list);
                }
                list.add(cls.cast(zzzjVar.c(i)));
            } else {
                linkedHashMap.put(b, cls.cast(zzzjVar.c(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void a(zzzq zzzqVar, zzzc zzzcVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            zzyl zzylVar = (zzyl) entry.getKey();
            Object value = entry.getValue();
            if (zzylVar.c) {
                zzzqVar.b(zzylVar, ((List) value).iterator(), zzzcVar);
            } else {
                zzzqVar.a(zzylVar, value, zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int b() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set c() {
        return this.b.keySet();
    }
}
