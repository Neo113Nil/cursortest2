package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xuo extends y9n {
    private static final xuo zzi;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        xuo xuoVar = new xuo();
        zzi = xuoVar;
        y9n.g(xuo.class, xuoVar);
    }

    private xuo() {
    }

    public static xuo A() {
        return zzi;
    }

    public static xuo x(e8n e8nVar) {
        xuo xuoVar = zzi;
        z8n z8nVar = z8n.b;
        int i = o7n.a;
        z8n z8nVar2 = z8n.c;
        m8n r = e8nVar.r();
        y9n m = xuoVar.m();
        try {
            pcn a = gcn.c.a(m.getClass());
            zz0 zz0Var = r.b;
            if (zz0Var == null) {
                zz0Var = new zz0(r);
            }
            a.i(m, zz0Var, z8nVar2);
            a.c(m);
            r.h();
            y9n.q(m);
            y9n.q(m);
            return (xuo) m;
        } catch (cdn e) {
            hbo.m(e.getMessage());
            return null;
        } catch (lan e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof lan) {
                throw ((lan) e3.getCause());
            }
            throw new lan(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof lan) {
                throw ((lan) e4.getCause());
            }
            throw e4;
        }
    }

    public static xuo y(e8n e8nVar, z8n z8nVar) {
        return (xuo) y9n.i(zzi, e8nVar, z8nVar);
    }

    public static vuo z() {
        return (vuo) zzi.n();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new xuo();
        }
        if (i2 == 4) {
            return new vuo(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String s() {
        return this.zzd;
    }

    public final String t() {
        return this.zze;
    }

    public final long u() {
        return this.zzf;
    }

    public final long v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }
}
