package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgyh;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hjo extends zho implements zzgyh, Serializable {
    public final transient Map d;
    public transient int e;
    public final transient cjo f;

    public hjo(Map map, cjo cjoVar) {
        zzguk.a(map.isEmpty());
        this.d = map;
        this.f = cjoVar;
    }

    @Override // defpackage.zho
    public final Map d() {
        Map map = this.d;
        return map instanceof NavigableMap ? new qho(this, (NavigableMap) map) : map instanceof SortedMap ? new tho(this, (SortedMap) map) : new f5(this, map, 1);
    }

    public final void g() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }
}
