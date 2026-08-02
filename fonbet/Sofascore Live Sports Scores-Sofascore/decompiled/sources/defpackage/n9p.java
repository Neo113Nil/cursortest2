package defpackage;

import com.google.android.gms.internal.measurement.zzww;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n9p extends zzww {
    public final hv9 a;
    public final hv9 b;
    public final UUID c;
    public final long d;

    public /* synthetic */ n9p(vvf vvfVar, vvf vvfVar2, UUID uuid, long j) {
        this.a = vvfVar;
        this.b = vvfVar2;
        this.c = uuid;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final hv9 a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final hv9 b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final UUID c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        return this.a.equals(zzwwVar.a()) && this.b.equals(zzwwVar.b()) && this.c.equals(zzwwVar.c()) && this.d == zzwwVar.d();
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ (hashCode * 1000003);
    }
}
