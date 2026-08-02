package defpackage;

import com.google.android.gms.internal.ads.zzgza;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bjo extends zzgza {
    public final /* synthetic */ Comparator a;

    public bjo(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final Map a() {
        return new TreeMap(this.a);
    }
}
