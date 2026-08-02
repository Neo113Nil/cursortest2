package defpackage;

import com.ironsource.mediationsdk.metadata.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w3p extends y9n {
    private static final w3p zzq;
    private int zzb;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private ian zzo = icn.e;

    static {
        w3p w3pVar = new w3p();
        zzq = w3pVar;
        y9n.g(w3p.class, w3pVar);
    }

    private w3p() {
    }

    public static lyo s() {
        return (lyo) zzq.n();
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzq, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", z0p.class, "zzp", q2p.a});
        }
        if (i2 == 3) {
            return new w3p();
        }
        if (i2 == 4) {
            return new lyo(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        throw null;
    }

    public final /* synthetic */ void t(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 1024;
        this.zzn = str;
    }

    public final /* synthetic */ void z(int i) {
        this.zzp = i - 1;
        this.zzb |= a.o;
    }
}
