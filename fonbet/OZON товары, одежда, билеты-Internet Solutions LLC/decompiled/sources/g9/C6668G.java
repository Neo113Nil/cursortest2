package g9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* renamed from: g9.G, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6668G extends zzeh implements zzfn {
    private static final C6668G zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C6668G c6668g = new C6668G();
        zzb = c6668g;
        zzeh.zzV(C6668G.class, c6668g);
    }

    private C6668G() {
    }

    public static C6668G b() {
        return zzb;
    }

    public final int c() {
        int i11;
        int i12 = this.zze;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                i11 = i12 != 2 ? 0 : 3;
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C6667F.f64112a, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new C6668G();
        }
        if (i12 == 4) {
            return new C6666E();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
