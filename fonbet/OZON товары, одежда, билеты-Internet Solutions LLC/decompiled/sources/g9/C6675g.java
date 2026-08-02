package g9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* renamed from: g9.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6675g extends zzeh implements zzfn {
    private static final C6675g zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C6675g c6675g = new C6675g();
        zzb = c6675g;
        zzeh.zzV(C6675g.class, c6675g);
    }

    private C6675g() {
    }

    public static C6674f c() {
        return (C6674f) zzb.zzG();
    }

    static /* synthetic */ void e(int i11, C6675g c6675g) {
        c6675g.zzd |= 1;
        c6675g.zze = i11;
    }

    static /* synthetic */ void f(int i11, C6675g c6675g) {
        c6675g.zzd |= 2;
        c6675g.zzf = i11;
    }

    public final int a() {
        return this.zze;
    }

    public final int b() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new C6675g();
        }
        if (i12 == 4) {
            return new C6674f(r4);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzg = obj != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
