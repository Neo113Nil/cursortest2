package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uen extends y9n {
    private static final uen zzz;
    private int zzb;
    private qen zzd;
    private qen zze;
    private qen zzf;
    private qen zzg;
    private qen zzh;
    private qen zzi;
    private qen zzj;
    private qen zzk;
    private qen zzl;
    private qen zzm;
    private qen zzn;
    private qen zzo;
    private qen zzp;
    private qen zzq;
    private qen zzr;
    private qen zzs;
    private qen zzt;
    private qen zzu;
    private qen zzv;
    private qen zzw;
    private long zzx;
    private qen zzy;

    static {
        uen uenVar = new uen();
        zzz = uenVar;
        y9n.g(uen.class, uenVar);
    }

    private uen() {
    }

    public static sen t() {
        return (sen) zzz.n();
    }

    public final /* synthetic */ void A(qen qenVar) {
        this.zzk = qenVar;
        this.zzb |= 128;
    }

    public final /* synthetic */ void B(qen qenVar) {
        this.zzl = qenVar;
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final /* synthetic */ void C(qen qenVar) {
        this.zzm = qenVar;
        this.zzb |= 512;
    }

    public final /* synthetic */ void D(qen qenVar) {
        this.zzo = qenVar;
        this.zzb |= a.o;
    }

    public final /* synthetic */ void E(qen qenVar) {
        this.zzv = qenVar;
        this.zzb |= 262144;
    }

    public final /* synthetic */ void F(qen qenVar) {
        this.zzw = qenVar;
        this.zzb |= 524288;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lcn(zzz, "\u0004\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015\u0002\u0016ဉ\u0014", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new uen();
        }
        if (i2 == 4) {
            return new sen(zzz);
        }
        if (i2 == 5) {
            return zzz;
        }
        throw null;
    }

    public final qen s() {
        qen qenVar = this.zzo;
        return qenVar == null ? qen.t() : qenVar;
    }

    public final /* synthetic */ void u(qen qenVar) {
        this.zzd = qenVar;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(qen qenVar) {
        this.zzf = qenVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void w(qen qenVar) {
        this.zzg = qenVar;
        this.zzb |= 8;
    }

    public final /* synthetic */ void x(qen qenVar) {
        this.zzh = qenVar;
        this.zzb |= 16;
    }

    public final /* synthetic */ void y(qen qenVar) {
        this.zzi = qenVar;
        this.zzb |= 32;
    }

    public final /* synthetic */ void z(qen qenVar) {
        this.zzj = qenVar;
        this.zzb |= 64;
    }
}
