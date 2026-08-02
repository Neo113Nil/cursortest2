package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dln extends y9n {
    private static final dln zzy;
    private int zzb;
    private long zzs;
    private long zzt;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;

    static {
        dln dlnVar = new dln();
        zzy = dlnVar;
        y9n.g(dln.class, dlnVar);
    }

    private dln() {
    }

    public static qkn s() {
        return (qkn) zzy.n();
    }

    public final /* synthetic */ void A(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzl = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb |= 512;
        this.zzm = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= a.o;
        this.zzo = j;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 4096;
        this.zzp = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 8192;
        this.zzq = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 16384;
        this.zzr = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 32768;
        this.zzs = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzt = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 131072;
        this.zzu = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zzb |= 262144;
        this.zzv = j;
    }

    public final /* synthetic */ void L(int i) {
        this.zzj = i - 1;
        this.zzb |= 64;
    }

    public final /* synthetic */ void M(int i) {
        this.zzn = i - 1;
        this.zzb |= 1024;
    }

    @Override // defpackage.y9n
    public final Object r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            aon aonVar = aon.a;
            return new lcn(zzy, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", aonVar, "zzk", "zzl", "zzm", "zzn", aonVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx"});
        }
        if (i2 == 3) {
            return new dln();
        }
        if (i2 == 4) {
            return new qkn(zzy);
        }
        if (i2 == 5) {
            return zzy;
        }
        throw null;
    }

    public final /* synthetic */ void t(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void w(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void x() {
        this.zzb &= -9;
        this.zzg = -1L;
    }

    public final /* synthetic */ void y(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= 32;
        this.zzi = j;
    }
}
