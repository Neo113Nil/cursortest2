package g9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* renamed from: g9.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6672d extends zzeh implements zzfn {
    private static final C6672d zzb;
    private int zzd;
    private int zze;
    private zzdf zzf = zzdf.zzb;

    static {
        C6672d c6672d = new C6672d();
        zzb = c6672d;
        zzeh.zzV(C6672d.class, c6672d);
    }

    private C6672d() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new C6672d();
        }
        if (i12 == 4) {
            return new C6671c();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
