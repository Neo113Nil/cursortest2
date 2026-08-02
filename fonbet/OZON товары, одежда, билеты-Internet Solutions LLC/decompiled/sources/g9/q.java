package g9;

import Ve.C4202e4;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class q extends zzeh implements zzfn {
    private static final q zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private zzdf zzf;
    private String zzg;
    private C6673e zzh;
    private int zzi;
    private C6663B zzj;
    private C6668G zzk;
    private zzco zzl;
    private C6677i zzm;
    private o zzn;
    private l zzo;
    private K zzp;
    private z zzq;
    private C6665D zzr;
    private v zzs;
    private zzeo zzt;
    private zzen zzu;
    private String zzv;
    private zzeo zzw;
    private boolean zzx;
    private double zzy;
    private zzdf zzz;

    static {
        q qVar = new q();
        zzb = qVar;
        zzeh.zzV(q.class, qVar);
    }

    private q() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = "";
        this.zzt = zzeh.zzP();
        this.zzu = zzeh.zzO();
        this.zzv = "";
        this.zzw = zzeh.zzP();
        this.zzx = true;
        this.zzz = zzdfVar;
    }

    static /* synthetic */ void o(q qVar, int i11, C6675g c6675g) {
        c6675g.getClass();
        zzeo zzeoVar = qVar.zzt;
        if (!zzeoVar.zzc()) {
            qVar.zzt = zzeh.zzQ(zzeoVar);
        }
        qVar.zzt.set(i11, c6675g);
    }

    public final int a() {
        int m11 = O7.h.m(this.zzi);
        if (m11 == 0) {
            return 1;
        }
        return m11;
    }

    public final int b() {
        return this.zzt.size();
    }

    public final z d() {
        z zVar = this.zzq;
        return zVar == null ? z.d() : zVar;
    }

    public final C6663B e() {
        C6663B c6663b = this.zzj;
        return c6663b == null ? C6663B.b() : c6663b;
    }

    public final C6665D f() {
        C6665D c6665d = this.zzr;
        return c6665d == null ? C6665D.b() : c6665d;
    }

    public final C6668G g() {
        C6668G c6668g = this.zzk;
        return c6668g == null ? C6668G.b() : c6668g;
    }

    public final K h() {
        K k11 = this.zzp;
        return k11 == null ? K.d() : k11;
    }

    public final C6677i i() {
        C6677i c6677i = this.zzm;
        return c6677i == null ? C6677i.b() : c6677i;
    }

    public final l j() {
        l lVar = this.zzo;
        return lVar == null ? l.b() : lVar;
    }

    public final o k() {
        o oVar = this.zzn;
        return oVar == null ? o.b() : oVar;
    }

    public final zzdf l() {
        return this.zzf;
    }

    public final String m() {
        return this.zzg;
    }

    public final zzeo n() {
        return this.zzt;
    }

    public final boolean p() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean q() {
        return (this.zzd & 32) != 0;
    }

    public final boolean r() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean s() {
        return (this.zzd & 64) != 0;
    }

    public final boolean t() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean u() {
        return (this.zzd & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    public final boolean v() {
        return (this.zzd & 256) != 0;
    }

    public final boolean w() {
        return (this.zzd & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    public final boolean x() {
        return (this.zzd & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    public final int y() {
        int b11 = C4202e4.b(this.zze);
        if (b11 == 0) {
            return 1;
        }
        return b11;
    }

    public final zzco zzb() {
        zzco zzcoVar = this.zzl;
        return zzcoVar == null ? zzco.zzb() : zzcoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", r.f64115a, "zzf", "zzg", "zzi", s.f64116a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C6675g.class, "zzv", "zzw", C6675g.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i12 == 3) {
            return new q();
        }
        if (i12 == 4) {
            return new p(r2);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzA = obj != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
