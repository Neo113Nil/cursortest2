package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class idn extends edn {
    @Override // defpackage.edn
    public final /* bridge */ /* synthetic */ void a(int i, long j, Object obj) {
        ((fdn) obj).d(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.edn
    public final /* bridge */ /* synthetic */ void b(int i, int i2, Object obj) {
        ((fdn) obj).d((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.edn
    public final /* bridge */ /* synthetic */ void c(int i, long j, Object obj) {
        ((fdn) obj).d((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.edn
    public final /* bridge */ /* synthetic */ void d(Object obj, int i, g8n g8nVar) {
        ((fdn) obj).d((i << 3) | 2, g8nVar);
    }

    @Override // defpackage.edn
    public final /* bridge */ /* synthetic */ void e(int i, Object obj, Object obj2) {
        ((fdn) obj).d((i << 3) | 3, (fdn) obj2);
    }

    @Override // defpackage.edn
    public final /* synthetic */ fdn f() {
        return fdn.a();
    }

    @Override // defpackage.edn
    public final fdn g(Object obj) {
        fdn fdnVar = (fdn) obj;
        if (fdnVar.e) {
            fdnVar.e = false;
        }
        return fdnVar;
    }

    @Override // defpackage.edn
    public final fdn h(Object obj) {
        y9n y9nVar = (y9n) obj;
        fdn fdnVar = y9nVar.zzc;
        if (fdnVar != fdn.f) {
            return fdnVar;
        }
        fdn a = fdn.a();
        y9nVar.zzc = a;
        return a;
    }

    @Override // defpackage.edn
    public final /* synthetic */ void i(Object obj, Object obj2) {
        ((y9n) obj).zzc = (fdn) obj2;
    }

    @Override // defpackage.edn
    public final void j(Object obj) {
        fdn fdnVar = ((y9n) obj).zzc;
        if (fdnVar.e) {
            fdnVar.e = false;
        }
    }
}
