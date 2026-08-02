package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vpn extends y9n {
    private static final vpn zzh;
    private int zzb;
    private ian zzd = icn.e;
    private g8n zze = g8n.b;
    private int zzf = 1;
    private int zzg = 1;

    static {
        vpn vpnVar = new vpn();
        zzh = vpnVar;
        y9n.g(vpn.class, vpnVar);
    }

    private vpn() {
    }

    public static npn s() {
        return (npn) zzh.n();
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzb", "zzd", "zze", "zzf", oon.a, "zzg", snn.a});
        }
        if (i2 == 3) {
            return new vpn();
        }
        if (i2 == 4) {
            return new npn(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final void t(g8n g8nVar) {
        g8nVar.getClass();
        ian ianVar = this.zzd;
        if (!((m7n) ianVar).a) {
            int size = ianVar.size();
            ianVar = ianVar.f(size + size);
            this.zzd = ianVar;
        }
        ianVar.add(g8nVar);
    }

    public final /* synthetic */ void u(e8n e8nVar) {
        e8nVar.getClass();
        this.zzb |= 1;
        this.zze = e8nVar;
    }

    public final /* synthetic */ void v(int i) {
        this.zzf = 4;
        this.zzb |= 2;
    }

    public final /* synthetic */ void w(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }
}
