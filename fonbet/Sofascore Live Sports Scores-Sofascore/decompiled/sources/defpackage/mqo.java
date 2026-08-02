package defpackage;

import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zzied;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mqo extends jpo {
    public final v6g a;
    public zzied b = a();

    public mqo(x xVar) {
        this.a = new v6g(xVar);
    }

    public final ipo a() {
        v6g v6gVar = this.a;
        if (v6gVar.hasNext()) {
            return new ipo(v6gVar.c());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final byte zza() {
        zzied zziedVar = this.b;
        if (zziedVar == null) {
            yhk.d();
            return (byte) 0;
        }
        byte zza = zziedVar.zza();
        if (!this.b.hasNext()) {
            this.b = a();
        }
        return zza;
    }
}
