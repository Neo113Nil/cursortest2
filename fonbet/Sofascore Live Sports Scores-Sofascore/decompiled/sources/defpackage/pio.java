package defpackage;

import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzgxp;
import com.google.android.gms.internal.ads.zzgxu;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzhaa;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pio extends zzhaa {
    public final mio a;
    public Object b;
    public zzhaa c;

    public pio(zzgxu zzgxuVar) {
        Objects.requireNonNull(zzgxuVar);
        zzgxp zzgxpVar = zzgxuVar.d;
        zzgxw zzgxwVar = zzgxpVar.a;
        if (zzgxwVar == null) {
            zzgxwVar = zzgxpVar.d();
            zzgxpVar.a = zzgxwVar;
        }
        this.a = zzgxwVar.p().listIterator(0);
        this.b = null;
        this.c = uio.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((zzgxi) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.c.next());
    }
}
