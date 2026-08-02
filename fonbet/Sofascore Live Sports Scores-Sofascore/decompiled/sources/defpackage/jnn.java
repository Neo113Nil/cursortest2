package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jnn extends y9n {
    private static final jnn zzh;
    private int zzb;
    private g8n zzd;
    private g8n zze;
    private g8n zzf;
    private g8n zzg;

    static {
        jnn jnnVar = new jnn();
        zzh = jnnVar;
        y9n.g(jnn.class, jnnVar);
    }

    private jnn() {
        e8n e8nVar = g8n.b;
        this.zzd = e8nVar;
        this.zze = e8nVar;
        this.zzf = e8nVar;
        this.zzg = e8nVar;
    }

    public static jnn w(byte[] bArr, z8n z8nVar) {
        return (jnn) y9n.j(zzh, bArr, z8nVar);
    }

    public static dnn x() {
        return (dnn) zzh.n();
    }

    public final /* synthetic */ void A(g8n g8nVar) {
        g8nVar.getClass();
        this.zzb |= 4;
        this.zzf = g8nVar;
    }

    public final /* synthetic */ void B(g8n g8nVar) {
        g8nVar.getClass();
        this.zzb |= 8;
        this.zzg = g8nVar;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new jnn();
        }
        if (i2 == 4) {
            return new dnn(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final g8n s() {
        return this.zzd;
    }

    public final g8n t() {
        return this.zze;
    }

    public final g8n u() {
        return this.zzf;
    }

    public final g8n v() {
        return this.zzg;
    }

    public final /* synthetic */ void y(g8n g8nVar) {
        g8nVar.getClass();
        this.zzb |= 1;
        this.zzd = g8nVar;
    }

    public final /* synthetic */ void z(g8n g8nVar) {
        g8nVar.getClass();
        this.zzb |= 2;
        this.zze = g8nVar;
    }
}
