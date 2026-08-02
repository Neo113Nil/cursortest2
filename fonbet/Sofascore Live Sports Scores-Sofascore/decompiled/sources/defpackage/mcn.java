package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mcn extends x7n {
    public final v6g a;
    public x7n b = a();

    public mcn(ocn ocnVar) {
        this.a = new v6g(ocnVar);
    }

    public final v7n a() {
        v6g v6gVar = this.a;
        if (v6gVar.hasNext()) {
            return new v7n(v6gVar.b());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.x7n
    public final byte zza() {
        x7n x7nVar = this.b;
        if (x7nVar == null) {
            yhk.d();
            return (byte) 0;
        }
        byte zza = x7nVar.zza();
        if (!this.b.hasNext()) {
            this.b = a();
        }
        return zza;
    }
}
